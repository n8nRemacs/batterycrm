package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Base64;
import android.util.Xml;
import androidx.work.WorkRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.http.HttpStatus;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public abstract class io5 {
    public static final long[] a = {WorkRequest.MIN_BACKOFF_MILLIS, BuildConfig.SILENCE_TIME_TO_UPLOAD};

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ad, code lost:
    
        r8 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.xpf a(java.lang.String r7, int r8, defpackage.pf2 r9) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.io5.a(java.lang.String, int, pf2):xpf");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0021, code lost:
    
        r0 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(int r5, java.lang.String r6) {
        /*
            int r0 = r6.length()
            if (r0 != 0) goto L7
            return r6
        L7:
            int r0 = r5 + (-1)
        L9:
            r1 = 10
            r2 = 32
            r3 = -1
            if (r3 >= r0) goto L23
            char r4 = r6.charAt(r0)
            if (r4 == r2) goto L21
            if (r4 != r1) goto L19
            goto L21
        L19:
            r3 = 64
            if (r4 != r3) goto L1e
            goto L24
        L1e:
            int r0 = r0 + (-1)
            goto L9
        L21:
            r0 = r3
            goto L24
        L23:
            r0 = 0
        L24:
            int r3 = r6.length()
        L28:
            if (r5 >= r3) goto L36
            char r4 = r6.charAt(r5)
            if (r4 == r2) goto L3a
            if (r4 != r1) goto L33
            goto L3a
        L33:
            int r5 = r5 + 1
            goto L28
        L36:
            int r5 = r6.length()
        L3a:
            if (r0 == r5) goto L46
            if (r0 < 0) goto L46
            if (r5 >= 0) goto L41
            goto L46
        L41:
            java.lang.String r5 = r6.substring(r0, r5)
            return r5
        L46:
            java.lang.String r5 = ""
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.io5.b(int, java.lang.String):java.lang.String");
    }

    public static ie6 c(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            e(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), j6d.FontFamily);
        String string = typedArrayObtainAttributes.getString(j6d.FontFamily_fontProviderAuthority);
        String string2 = typedArrayObtainAttributes.getString(j6d.FontFamily_fontProviderPackage);
        String string3 = typedArrayObtainAttributes.getString(j6d.FontFamily_fontProviderQuery);
        int resourceId = typedArrayObtainAttributes.getResourceId(j6d.FontFamily_fontProviderCerts, 0);
        int integer = typedArrayObtainAttributes.getInteger(j6d.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(j6d.FontFamily_fontProviderFetchTimeout, 500);
        String string4 = typedArrayObtainAttributes.getString(j6d.FontFamily_fontProviderSystemFontFamily);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlResourceParser.next() != 3) {
                e(xmlResourceParser);
            }
            return new le6(new qt6(string, string2, string3, d(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlResourceParser.next() != 3) {
            if (xmlResourceParser.getEventType() == 2) {
                if (xmlResourceParser.getName().equals("font")) {
                    TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), j6d.FontFamilyFont);
                    int i = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(j6d.FontFamilyFont_fontWeight) ? j6d.FontFamilyFont_fontWeight : j6d.FontFamilyFont_android_fontWeight, HttpStatus.SC_BAD_REQUEST);
                    boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(j6d.FontFamilyFont_fontStyle) ? j6d.FontFamilyFont_fontStyle : j6d.FontFamilyFont_android_fontStyle, 0);
                    int i2 = typedArrayObtainAttributes2.hasValue(j6d.FontFamilyFont_ttcIndex) ? j6d.FontFamilyFont_ttcIndex : j6d.FontFamilyFont_android_ttcIndex;
                    String string5 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(j6d.FontFamilyFont_fontVariationSettings) ? j6d.FontFamilyFont_fontVariationSettings : j6d.FontFamilyFont_android_fontVariationSettings);
                    int i3 = typedArrayObtainAttributes2.getInt(i2, 0);
                    int i4 = typedArrayObtainAttributes2.hasValue(j6d.FontFamilyFont_font) ? j6d.FontFamilyFont_font : j6d.FontFamilyFont_android_font;
                    int resourceId2 = typedArrayObtainAttributes2.getResourceId(i4, 0);
                    String string6 = typedArrayObtainAttributes2.getString(i4);
                    typedArrayObtainAttributes2.recycle();
                    while (xmlResourceParser.next() != 3) {
                        e(xmlResourceParser);
                    }
                    arrayList.add(new ke6(string6, i, z, string5, i3, resourceId2));
                } else {
                    e(xmlResourceParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new je6((ke6[]) arrayList.toArray(new ke6[0]));
    }

    public static List d(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (he6.a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static void e(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }
}
