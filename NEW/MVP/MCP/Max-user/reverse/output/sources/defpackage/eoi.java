package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes.dex */
public abstract class eoi {
    public static final String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static rt7 a() {
        return new rt7(null);
    }

    public static void b(x74 x74Var) {
        qt7 qt7Var = (qt7) x74Var.get(wha.w0);
        if (qt7Var != null) {
            qt7Var.cancel(null);
        }
    }

    public static final void c(x74 x74Var, CancellationException cancellationException) {
        zde children;
        qt7 qt7Var = (qt7) x74Var.get(wha.w0);
        if (qt7Var == null || (children = qt7Var.getChildren()) == null) {
            return;
        }
        Iterator it = children.iterator();
        while (it.hasNext()) {
            ((qt7) it.next()).cancel(cancellationException);
        }
    }

    public static final void d(x74 x74Var) {
        qt7 qt7Var = (qt7) x74Var.get(wha.w0);
        if (qt7Var != null && !qt7Var.isActive()) {
            throw qt7Var.getCancellationException();
        }
    }

    public static final qt7 e(x74 x74Var) {
        qt7 qt7Var = (qt7) x74Var.get(wha.w0);
        if (qt7Var != null) {
            return qt7Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + x74Var).toString());
    }

    public static String f(String str) {
        if (l8g.c(str)) {
            wqi.o("eoi", null, "getPhotoToken: response is empty or null", Arrays.copyOf(new Object[0], 0));
            return null;
        }
        try {
            ArrayList arrayListG = g(str);
            if (arrayListG.size() > 0) {
                return (String) arrayListG.get(0);
            }
            return null;
        } catch (Exception e) {
            wqi.e("eoi", "getPhotoToken: exception while getting photo token from response", e);
            return null;
        }
    }

    public static ArrayList g(String str) throws Exception {
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("error_msg")) {
                wqi.c("eoi", "getPhotoToken: got json error: %s", jSONObject.getString("error_msg"));
                return arrayList;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("photos");
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                arrayList.add(jSONObject2.getJSONObject(itKeys.next()).getString(ApiProtocol.KEY_TOKEN));
            }
            return arrayList;
        } catch (Exception e) {
            wqi.c("eoi", "exception while parsing photo upload response: " + e.getMessage(), new Object[0]);
            throw e;
        }
    }

    public static String h(String str) throws JSONException {
        if (l8g.c(str)) {
            wqi.o("eoi", null, "getStickerToken: response is empty or null", Arrays.copyOf(new Object[0], 0));
            return null;
        }
        try {
            JSONObject jSONObject = new JSONArray(str).getJSONObject(0);
            if (jSONObject.has(ApiProtocol.KEY_TOKEN)) {
                return jSONObject.getString(ApiProtocol.KEY_TOKEN);
            }
            return null;
        } catch (JSONException e) {
            wqi.e("eoi", "getStickerToken: error", e);
            return null;
        }
    }

    public static final sy4 i(qt7 qt7Var, boolean z, du7 du7Var) {
        if (qt7Var instanceof su7) {
            return ((su7) qt7Var).invokeOnCompletionInternal$kotlinx_coroutines_core(z, du7Var);
        }
        return qt7Var.invokeOnCompletion(du7Var.c(), z, new jx0(1, du7Var, du7.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 22));
    }

    public static final boolean j(x74 x74Var) {
        qt7 qt7Var = (qt7) x74Var.get(wha.w0);
        if (qt7Var != null) {
            return qt7Var.isActive();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c8, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.p2a k(java.lang.String r18) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            org.xmlpull.v1.XmlPullParserFactory r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance()
            org.xmlpull.v1.XmlPullParser r0 = r0.newPullParser()
            java.io.StringReader r1 = new java.io.StringReader
            r2 = r18
            r1.<init>(r2)
            r0.setInput(r1)
            r0.next()
            java.lang.String r1 = "x:xmpmeta"
            boolean r2 = defpackage.eti.i(r0, r1)
            r3 = 0
            if (r2 == 0) goto Lcf
            t76 r2 = defpackage.wg7.b
            zjd r2 = defpackage.zjd.o
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r4
        L28:
            r0.next()
            java.lang.String r8 = "rdf:Description"
            boolean r8 = defpackage.eti.i(r0, r8)
            if (r8 == 0) goto L9b
            r2 = 0
            r6 = r2
        L35:
            r7 = 4
            if (r6 >= r7) goto Lc8
            java.lang.String[] r8 = defpackage.eoi.a
            r8 = r8[r6]
            java.lang.String r8 = defpackage.eti.c(r0, r8)
            if (r8 == 0) goto L98
            int r6 = java.lang.Integer.parseInt(r8)
            r8 = 1
            if (r6 != r8) goto Lc8
            r6 = r2
        L4a:
            if (r6 >= r7) goto L60
            java.lang.String[] r8 = defpackage.eoi.b
            r8 = r8[r6]
            java.lang.String r8 = defpackage.eti.c(r0, r8)
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
            java.lang.String[] r8 = defpackage.eoi.c
            r8 = r8[r2]
            java.lang.String r8 = defpackage.eti.c(r0, r8)
            if (r8 == 0) goto L90
            long r10 = java.lang.Long.parseLong(r8)
            n2a r12 = new n2a
            r13 = 0
            r15 = 0
            java.lang.String r17 = "image/jpeg"
            r12.<init>(r13, r15, r17)
            r2 = r12
            n2a r9 = new n2a
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
            boolean r8 = defpackage.eti.i(r0, r8)
            if (r8 == 0) goto Lac
            java.lang.String r2 = "Container"
            java.lang.String r8 = "Item"
            zjd r2 = l(r0, r2, r8)
            goto Lbc
        Lac:
            java.lang.String r8 = "GContainer:Directory"
            boolean r8 = defpackage.eti.i(r0, r8)
            if (r8 == 0) goto Lbc
            java.lang.String r2 = "GContainer"
            java.lang.String r8 = "GContainerItem"
            zjd r2 = l(r0, r2, r8)
        Lbc:
            boolean r8 = defpackage.eti.h(r0, r1)
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
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r3, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eoi.k(java.lang.String):p2a");
    }

    public static zjd l(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        tg7 tg7VarI = wg7.i();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (eti.i(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strC = eti.c(xmlPullParser, strConcat3);
                String strC2 = eti.c(xmlPullParser, strConcat4);
                String strC3 = eti.c(xmlPullParser, strConcat5);
                String strC4 = eti.c(xmlPullParser, strConcat6);
                if (strC == null || strC2 == null) {
                    return zjd.o;
                }
                tg7VarI.a(new n2a(strC3 != null ? Long.parseLong(strC3) : 0L, strC4 != null ? Long.parseLong(strC4) : 0L, strC));
            }
        } while (!eti.h(xmlPullParser, strConcat2));
        return tg7VarI.i();
    }
}
