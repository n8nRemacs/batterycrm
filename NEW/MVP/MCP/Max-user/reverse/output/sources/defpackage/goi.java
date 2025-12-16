package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.concurrent.ScheduledExecutorService;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class goi {
    public static final String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};
    public static ScheduledExecutorService d;

    public static final boolean a(Uri uri, Uri uri2) {
        if (uri == null || uri2 == null) {
            return false;
        }
        return ue3.N(uri.getPathSegments(), "/", null, null, null, 62).equals(ue3.N(uri2.getPathSegments(), "/", null, null, null, 62));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c8, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.p2a b(java.lang.String r18) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            org.xmlpull.v1.XmlPullParserFactory r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance()
            org.xmlpull.v1.XmlPullParser r0 = r0.newPullParser()
            java.io.StringReader r1 = new java.io.StringReader
            r2 = r18
            r1.<init>(r2)
            r0.setInput(r1)
            r0.next()
            java.lang.String r1 = "x:xmpmeta"
            boolean r2 = defpackage.gti.i(r0, r1)
            r3 = 0
            if (r2 == 0) goto Lcf
            t76 r2 = defpackage.wg7.b
            zjd r2 = defpackage.zjd.o
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r4
        L28:
            r0.next()
            java.lang.String r8 = "rdf:Description"
            boolean r8 = defpackage.gti.i(r0, r8)
            if (r8 == 0) goto L9b
            r2 = 0
            r6 = r2
        L35:
            r7 = 4
            if (r6 >= r7) goto Lc8
            java.lang.String[] r8 = defpackage.goi.a
            r8 = r8[r6]
            java.lang.String r8 = defpackage.gti.a(r0, r8)
            if (r8 == 0) goto L98
            int r6 = java.lang.Integer.parseInt(r8)
            r8 = 1
            if (r6 != r8) goto Lc8
            r6 = r2
        L4a:
            if (r6 >= r7) goto L60
            java.lang.String[] r8 = defpackage.goi.b
            r8 = r8[r6]
            java.lang.String r8 = defpackage.gti.a(r0, r8)
            if (r8 == 0) goto L62
            long r6 = java.lang.Long.parseLong(r8)
            r8 = -1
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 != 0) goto L65
        L60:
            r6 = r4
            goto L65
        L62:
            int r6 = r6 + 1
            goto L4a
        L65:
            r8 = 2
            if (r2 >= r8) goto L93
            java.lang.String[] r8 = defpackage.goi.c
            r8 = r8[r2]
            java.lang.String r8 = defpackage.gti.a(r0, r8)
            if (r8 == 0) goto L90
            long r10 = java.lang.Long.parseLong(r8)
            o2a r12 = new o2a
            r13 = 0
            r15 = 0
            java.lang.String r17 = "image/jpeg"
            r12.<init>(r13, r15, r17)
            r2 = r12
            o2a r9 = new o2a
            java.lang.String r14 = "video/mp4"
            r12 = 0
            r9.<init>(r10, r12, r14)
            zjd r2 = defpackage.wg7.n(r2, r9)
            goto Lbc
        L90:
            int r2 = r2 + 1
            goto L65
        L93:
            t76 r2 = defpackage.wg7.b
            zjd r2 = defpackage.zjd.o
            goto Lbc
        L98:
            int r6 = r6 + 1
            goto L35
        L9b:
            java.lang.String r8 = "Container:Directory"
            boolean r8 = defpackage.gti.i(r0, r8)
            if (r8 == 0) goto Lac
            java.lang.String r2 = "Container"
            java.lang.String r8 = "Item"
            zjd r2 = c(r0, r2, r8)
            goto Lbc
        Lac:
            java.lang.String r8 = "GContainer:Directory"
            boolean r8 = defpackage.gti.i(r0, r8)
            if (r8 == 0) goto Lbc
            java.lang.String r2 = "GContainer"
            java.lang.String r8 = "GContainerItem"
            zjd r2 = c(r0, r2, r8)
        Lbc:
            boolean r8 = defpackage.gti.g(r0, r1)
            if (r8 == 0) goto L28
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lc9
        Lc8:
            return r3
        Lc9:
            p2a r0 = new p2a
            r0.<init>(r6, r2)
            return r0
        Lcf:
            java.lang.String r0 = "Couldn't find xmp metadata"
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r3, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.goi.b(java.lang.String):p2a");
    }

    public static zjd c(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        tg7 tg7VarI = wg7.i();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (gti.i(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strA = gti.a(xmlPullParser, strConcat3);
                String strA2 = gti.a(xmlPullParser, strConcat4);
                String strA3 = gti.a(xmlPullParser, strConcat5);
                String strA4 = gti.a(xmlPullParser, strConcat6);
                if (strA == null || strA2 == null) {
                    return zjd.o;
                }
                tg7VarI.a(new o2a(strA3 != null ? Long.parseLong(strA3) : 0L, strA4 != null ? Long.parseLong(strA4) : 0L, strA));
            }
        } while (!gti.g(xmlPullParser, strConcat2));
        return tg7VarI.i();
    }
}
