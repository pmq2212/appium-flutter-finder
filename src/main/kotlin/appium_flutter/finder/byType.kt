@file:JvmName("_FinderRawMethods")
@file:JvmMultifileClass
package appium_flutter.finder

fun byType(input: String): FlutterElement {
  return FlutterElement(mapOf(
    "finderType" to "ByType",
    "type" to input
    ))
}
