package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes2.dex */
public final class qt6 implements hof {
    public Object X;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object o;

    public /* synthetic */ qt6() {
        this.a = 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.qt6 r4, long r5, long[] r7, defpackage.q44 r8) {
        /*
            r4.getClass()
            boolean r0 = r8 instanceof defpackage.ot6
            if (r0 == 0) goto L16
            r0 = r8
            ot6 r0 = (defpackage.ot6) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.X = r1
            goto L1b
        L16:
            ot6 r0 = new ot6
            r0.<init>(r4, r8)
        L1b:
            java.lang.Object r8 = r0.d
            int r1 = r0.X
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            defpackage.g8j.b(r8)
            goto L4d
        L28:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L30:
            defpackage.g8j.b(r8)
            java.lang.Object r4 = r4.d
            k18 r4 = (defpackage.k18) r4
            java.lang.Object r4 = r4.getValue()
            m1g r4 = (defpackage.m1g) r4
            zf8 r8 = new zf8
            r8.<init>(r5, r7)
            r0.X = r2
            java.lang.Object r8 = r4.e(r8, r0)
            g84 r4 = defpackage.g84.a
            if (r8 != r4) goto L4d
            return r4
        L4d:
            w4a r8 = (defpackage.w4a) r8
            sz r4 = r8.d
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qt6.a(qt6, long, long[], q44):java.lang.Object");
    }

    @Override // defpackage.hof
    public int e(long j) {
        long[] jArr = (long[]) this.c;
        int iA = zxg.a(jArr, j, false);
        if (iA < jArr.length) {
            return iA;
        }
        return -1;
    }

    @Override // defpackage.hof
    public long g(int i) {
        return ((long[]) this.c)[i];
    }

    @Override // defpackage.hof
    public List m(long j) {
        rjg rjgVar = (rjg) this.b;
        Map map = (Map) this.d;
        HashMap map2 = (HashMap) this.o;
        HashMap map3 = (HashMap) this.X;
        ArrayList arrayList = new ArrayList();
        rjgVar.g(j, rjgVar.h, arrayList);
        TreeMap treeMap = new TreeMap();
        rjgVar.i(j, false, rjgVar.h, treeMap);
        rjgVar.h(j, map, map2, rjgVar.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                ujg ujgVar = (ujg) map2.get(pair.first);
                ujgVar.getClass();
                arrayList2.add(new hb4(null, null, null, bitmapDecodeByteArray, ujgVar.c, 0, ujgVar.e, ujgVar.b, 0, Integer.MIN_VALUE, -3.4028235E38f, ujgVar.f, ujgVar.g, false, -16777216, ujgVar.j, 0.0f, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            ujg ujgVar2 = (ujg) map2.get(entry.getKey());
            ujgVar2.getClass();
            fb4 fb4Var = (fb4) entry.getValue();
            CharSequence charSequence = fb4Var.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (ot4 ot4Var : (ot4[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ot4.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(ot4Var), spannableStringBuilder.getSpanEnd(ot4Var), (CharSequence) "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == '\n') {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == '\n') {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f = ujgVar2.c;
            int i9 = ujgVar2.d;
            fb4Var.e = f;
            fb4Var.f = i9;
            fb4Var.g = ujgVar2.e;
            fb4Var.h = ujgVar2.b;
            fb4Var.l = ujgVar2.f;
            float f2 = ujgVar2.i;
            int i10 = ujgVar2.h;
            fb4Var.k = f2;
            fb4Var.j = i10;
            fb4Var.p = ujgVar2.j;
            arrayList2.add(fb4Var.a());
        }
        return arrayList2;
    }

    @Override // defpackage.hof
    public int s() {
        return ((long[]) this.c).length;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                List list = (List) this.o;
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.c) + ", mProviderPackage: " + ((String) this.b) + ", mQuery: " + ((String) this.d) + ", mCertificates:");
                for (int i = 0; i < list.size(); i++) {
                    sb.append(" [");
                    List list2 = (List) list.get(i);
                    for (int i2 = 0; i2 < list2.size(); i2++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                }
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public qt6(Context context, y6d y6dVar, y8g y8gVar) {
        this.a = 1;
        this.b = context;
        this.c = y6dVar;
        this.d = y8gVar;
        this.X = new eo(4, this);
    }

    public qt6(k18 k18Var, k18 k18Var2, k18 k18Var3, lzf lzfVar) {
        this.a = 0;
        this.b = lzfVar;
        this.c = qt6.class.getName();
        this.d = k18Var;
        this.o = k18Var2;
        this.X = k18Var3;
    }

    public qt6(rjg rjgVar, HashMap map, HashMap map2, HashMap map3) {
        this.a = 4;
        this.b = rjgVar;
        this.o = map2;
        this.X = map3;
        this.d = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        rjgVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.c = jArr;
    }

    public qt6(String str, String str2, String str3, List list) {
        this.a = 2;
        str.getClass();
        this.c = str;
        str2.getClass();
        this.b = str2;
        this.d = str3;
        list.getClass();
        this.o = list;
        this.X = str + "-" + str2 + "-" + str3;
    }
}
