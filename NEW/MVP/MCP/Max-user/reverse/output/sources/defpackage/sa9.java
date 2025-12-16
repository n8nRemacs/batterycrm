package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.util.LogPrinter;
import android.util.Pair;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import com.facebook.imagepipeline.platform.PreverificationHelper;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.io.Serializable;
import java.io.UncheckedIOException;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import one.me.sdk.media.transformer.MediaTransformException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class sa9 implements s2c, cf5, w57, rn6, gof, le5 {
    public static final byte[] d = {-1, -39};
    public Object a;
    public Object b;
    public Object c;

    public /* synthetic */ sa9(Object obj, Serializable serializable, Object obj2) {
        this.c = obj;
        this.a = serializable;
        this.b = obj2;
    }

    public static Object[] o(Object[] objArr, int[] iArr) {
        int length = objArr.length;
        Class<?> componentType = objArr.getClass().getComponentType();
        LogPrinter logPrinter = hy6.v0;
        int iMax = -1;
        for (int i : iArr) {
            iMax = Math.max(iMax, i);
        }
        Object[] objArr2 = (Object[]) Array.newInstance(componentType, iMax + 1);
        for (int i2 = 0; i2 < length; i2++) {
            objArr2[iArr[i2]] = objArr[i2];
        }
        return objArr2;
    }

    public static BitmapFactory.Options y(ce5 ce5Var, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = ce5Var.Y;
        options.inJustDecodeBounds = true;
        options.inDither = true;
        boolean z = config == Bitmap.Config.HARDWARE;
        if (!z) {
            options.inPreferredConfig = config;
        }
        options.inMutable = true;
        BitmapFactory.decodeStream(ce5Var.w(), null, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            throw new IllegalArgumentException();
        }
        if (z) {
            options.inPreferredConfig = config;
        }
        options.inJustDecodeBounds = false;
        return options;
    }

    public SpannableStringBuilder A(String str, CharSequence charSequence) {
        k18 k18Var = (k18) this.b;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (charSequence != null && str != null) {
            for (n7e n7eVar : ((o7e) k18Var.getValue()).d(charSequence.toString(), ((o7e) k18Var.getValue()).e(charSequence.toString(), str))) {
                spannableStringBuilder.setSpan(new l7g(a93.s0.x((Context) this.c).k(), new llc(27)), n7eVar.a, n7eVar.b, 17);
            }
        }
        return spannableStringBuilder;
    }

    public boolean B(int i, yt3 yt3Var, poc pocVar) {
        zl0 zl0Var = (zl0) this.b;
        int[] iArr = yt3Var.p0;
        int[] iArr2 = yt3Var.t;
        zl0Var.a = iArr[0];
        zl0Var.b = iArr[1];
        zl0Var.c = yt3Var.q();
        zl0Var.d = yt3Var.k();
        zl0Var.i = false;
        zl0Var.j = i;
        boolean z = zl0Var.a == 3;
        boolean z2 = zl0Var.b == 3;
        boolean z3 = z && yt3Var.W > 0.0f;
        boolean z4 = z2 && yt3Var.W > 0.0f;
        if (z3 && iArr2[0] == 4) {
            zl0Var.a = 1;
        }
        if (z4 && iArr2[1] == 4) {
            zl0Var.b = 1;
        }
        pocVar.c(yt3Var, zl0Var);
        yt3Var.O(zl0Var.e);
        yt3Var.L(zl0Var.f);
        yt3Var.E = zl0Var.h;
        yt3Var.I(zl0Var.g);
        zl0Var.j = 0;
        return zl0Var.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fa  */
    /* JADX WARN: Type inference failed for: r22v0, types: [sa9] */
    /* JADX WARN: Type inference failed for: r8v14, types: [o7e] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.text.SpannableStringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList C(java.util.List r23) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sa9.C(java.util.List):java.util.ArrayList");
    }

    public z42 D() throws IOException {
        PushbackInputStream pushbackInputStream = (PushbackInputStream) this.c;
        long jH = epi.h(pushbackInputStream);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        pushbackInputStream.unread(byteBufferAllocate.array(), 0, epi.c(jH, byteBufferAllocate));
        HashMap map = (HashMap) this.b;
        if (map.containsKey(Long.valueOf(jH))) {
            try {
                return (z42) ((Function) map.get(Long.valueOf(jH))).apply(pushbackInputStream);
            } catch (UncheckedIOException e) {
                throw e.getCause();
            }
        }
        long jH2 = epi.h(pushbackInputStream);
        int iH = (int) epi.h(pushbackInputStream);
        ((d97) this.a).c.read(new byte[iH]);
        er6 er6Var = new er6();
        er6Var.a = jH2;
        er6Var.b = iH;
        return er6Var;
    }

    public void E(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!((HashSet) this.a).remove(mediaCodec) || (loudnessCodecController = (LoudnessCodecController) this.c) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public void F(int i) {
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) this.c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.c = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i, dx4.a, new wk8(this));
        this.c = loudnessCodecControllerCreate;
        Iterator it = ((HashSet) this.a).iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    public void G(zt3 zt3Var, int i, int i2, int i3) {
        int i4 = zt3Var.b0;
        int i5 = zt3Var.c0;
        zt3Var.b0 = 0;
        zt3Var.c0 = 0;
        zt3Var.O(i2);
        zt3Var.L(i3);
        if (i4 < 0) {
            zt3Var.b0 = 0;
        } else {
            zt3Var.b0 = i4;
        }
        if (i5 < 0) {
            zt3Var.c0 = 0;
        } else {
            zt3Var.c0 = i5;
        }
        zt3 zt3Var2 = (zt3) this.c;
        zt3Var2.t0 = i;
        zt3Var2.U();
    }

    public void H(zt3 zt3Var) {
        ArrayList arrayList = (ArrayList) this.a;
        arrayList.clear();
        int size = zt3Var.q0.size();
        for (int i = 0; i < size; i++) {
            yt3 yt3Var = (yt3) zt3Var.q0.get(i);
            int[] iArr = yt3Var.p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(yt3Var);
            }
        }
        zt3Var.s0.b = true;
    }

    @Override // defpackage.rn6, defpackage.v2f
    public void a(Object obj) {
        ((u8c) this.c).e = null;
    }

    @Override // defpackage.le5
    public /* bridge */ /* synthetic */ le5 b(Class cls, pqa pqaVar) {
        ((HashMap) this.a).put(cls, pqaVar);
        ((HashMap) this.b).remove(cls);
        return this;
    }

    @Override // defpackage.s2c
    public vc3 c(ce5 ce5Var, Bitmap.Config config) {
        BitmapFactory.Options optionsY = y(ce5Var, config);
        boolean z = optionsY.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            InputStream inputStreamW = ce5Var.w();
            inputStreamW.getClass();
            return u(inputStreamW, optionsY, null);
        } catch (RuntimeException e) {
            if (z) {
                return c(ce5Var, Bitmap.Config.ARGB_8888);
            }
            throw e;
        }
    }

    @Override // defpackage.w57
    public xmb d() {
        return new wgb(q57.l, null, (pl0) this.a, (dh6) this.b, (Set) this.c);
    }

    @Override // defpackage.gof
    public int e(long j) {
        long[] jArr = (long[]) this.c;
        int iB = xxg.b(jArr, j, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
    @Override // defpackage.s2c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.vc3 f(defpackage.ce5 r6, android.graphics.Bitmap.Config r7, int r8, android.graphics.ColorSpace r9) throws java.io.IOException {
        /*
            r5 = this;
            vc3 r0 = r6.a
            me7 r1 = r6.b
            me7 r2 = defpackage.mn4.a
            r3 = 0
            r4 = 1
            if (r1 == r2) goto L10
            me7 r2 = defpackage.mn4.l
            if (r1 == r2) goto L10
        Le:
            r0 = r4
            goto L32
        L10:
            r0.getClass()
            java.lang.Object r0 = r0.Z()
            nf9 r0 = (defpackage.nf9) r0
            r1 = 2
            if (r8 >= r1) goto L1e
        L1c:
            r0 = r3
            goto L32
        L1e:
            int r1 = r8 + (-2)
            byte r1 = r0.y(r1)
            r2 = -1
            if (r1 != r2) goto L1c
            int r1 = r8 + (-1)
            byte r0 = r0.y(r1)
            r1 = -39
            if (r0 != r1) goto L1c
            goto Le
        L32:
            android.graphics.BitmapFactory$Options r7 = y(r6, r7)
            java.io.InputStream r1 = r6.w()
            r1.getClass()
            int r2 = r6.y()
            if (r2 <= r8) goto L49
            p48 r2 = new p48
            r2.<init>(r1, r8)
            r1 = r2
        L49:
            if (r0 != 0) goto L53
            xyf r0 = new xyf
            byte[] r2 = defpackage.sa9.d
            r0.<init>(r1, r2)
            r1 = r0
        L53:
            android.graphics.Bitmap$Config r0 = r7.inPreferredConfig
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            if (r0 == r2) goto L5a
            r3 = r4
        L5a:
            qk4 r6 = r5.u(r1, r7, r9)     // Catch: java.lang.Throwable -> L67 java.lang.RuntimeException -> L69
            r1.close()     // Catch: java.io.IOException -> L62
            return r6
        L62:
            r7 = move-exception
            r7.printStackTrace()
            return r6
        L67:
            r6 = move-exception
            goto L7c
        L69:
            r7 = move-exception
            if (r3 == 0) goto L7b
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L67
            vc3 r6 = r5.f(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L67
            r1.close()     // Catch: java.io.IOException -> L76
            goto L7a
        L76:
            r7 = move-exception
            r7.printStackTrace()
        L7a:
            return r6
        L7b:
            throw r7     // Catch: java.lang.Throwable -> L67
        L7c:
            r1.close()     // Catch: java.io.IOException -> L80
            goto L84
        L80:
            r7 = move-exception
            r7.printStackTrace()
        L84:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sa9.f(ce5, android.graphics.Bitmap$Config, int, android.graphics.ColorSpace):vc3");
    }

    @Override // defpackage.gof
    public long g(int i) {
        long[] jArr = (long[]) this.c;
        fsi.b(i >= 0);
        fsi.b(i < jArr.length);
        return jArr[i];
    }

    public ggg h(JSONObject jSONObject) throws JSONException {
        List listD0;
        JSONObject jSONObjectOptJSONObject;
        mnb mnbVar = (mnb) this.b;
        fje fjeVarY = kk4.y(jSONObject);
        int iOptInt = jSONObject.optInt("participantCount", 0);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("addedParticipantIds");
        List listA = hd5.a;
        if (jSONArrayOptJSONArray != null) {
            listA = mnbVar.a(jSONArrayOptJSONArray);
            listD0 = listA;
        } else {
            listD0 = listA;
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("removedParticipantMarkers");
        if (jSONArrayOptJSONArray2 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int length = jSONArrayOptJSONArray2.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i);
                try {
                    jSONObjectOptJSONObject = jSONObject2.optJSONObject("GRID");
                } catch (JSONException e) {
                    mnbVar.a.logException("ParticipantParser", "Can't parse id from " + jSONObject2, e);
                }
                ti1 ti1VarA = jSONObjectOptJSONObject == null ? null : ti1.a(jSONObjectOptJSONObject.getString("id"));
                if (ti1VarA != null) {
                    linkedHashSet.add(ti1VarA);
                }
            }
            listD0 = ue3.d0(linkedHashSet);
        }
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("addedParticipants");
        return new ggg(fjeVarY, iOptInt, listA, jSONArrayOptJSONArray3 != null ? ((ywf) this.c).r(jSONArrayOptJSONArray3, fjeVarY) : null, listD0);
    }

    @Override // defpackage.cf5
    public boolean i(int i) {
        return ((cf5) this.a).i(i) && z(i) != null;
    }

    public void j(hhg hhgVar) {
        String str = (String) this.b;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "Transformer.abortSafely, cancel transformer", null);
            }
        }
        try {
            hhgVar.c();
        } catch (Throwable th) {
            wqi.p((String) this.b, "Transformer.abortSafely, failed to cancel transformer", th);
        }
    }

    public void k(hhg hhgVar) {
        try {
            hhgVar.h();
            ua8 ua8Var = hhgVar.g;
            ua8Var.g();
            CopyOnWriteArraySet copyOnWriteArraySet = ua8Var.d;
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                ((ta8) it.next()).a(ua8Var.c);
            }
            copyOnWriteArraySet.clear();
        } catch (Throwable th) {
            wqi.p((String) this.b, "Transformer.cleanupSafely, failed to cleanup transformer", th);
        }
    }

    @Override // defpackage.w57
    public xmb l(q57 q57Var, i57 i57Var) {
        return new wgb(q57Var, i57Var, (pl0) this.a, (dh6) this.b, (Set) this.c);
    }

    @Override // defpackage.gof
    public List m(long j) {
        List list = (List) this.a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            long[] jArr = (long[]) this.b;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                k1i k1iVar = (k1i) list.get(i);
                gb4 gb4Var = k1iVar.a;
                if (gb4Var.o == -3.4028235E38f) {
                    arrayList2.add(k1iVar);
                } else {
                    arrayList.add(gb4Var);
                }
            }
        }
        Collections.sort(arrayList2, new n7f(5));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            eb4 eb4VarA = ((k1i) arrayList2.get(i3)).a.a();
            eb4VarA.e = (-1) - i3;
            eb4VarA.f = 1;
            arrayList.add(eb4VarA.a());
        }
        return arrayList;
    }

    @Override // defpackage.cf5
    public df5 n(int i) {
        return z(i);
    }

    @Override // defpackage.rn6
    public void onFailure(Throwable th) {
        ((u8c) this.c).e = null;
        ArrayList arrayList = (ArrayList) this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((l22) this.b).r((k02) it.next());
        }
        arrayList.clear();
    }

    public pm3 p(pa9 pa9Var, h95 h95Var) {
        int i = 0;
        tg7 tg7Var = new tg7(4);
        tg7Var.a(h95Var);
        tg7Var.b(new h95[0]);
        zjd zjdVarI = tg7Var.i();
        pm3 pm3Var = new pm3();
        hsi.a("The composition must contain at least one EditedMediaItemSequence.", !zjdVarI.isEmpty());
        pm3Var.a = wg7.j(zjdVarI);
        pm3Var.b = mni.z0;
        pm3Var.c = t95.c;
        ha9 ha9Var = (ha9) this.a;
        if (!ha9Var.i) {
            if (ha9Var.l && ha9Var.m) {
                pa9Var.e = 0;
            } else {
                i = 2;
                pa9Var.e = 2;
            }
            pm3Var.f = i;
        }
        if (((ha9) this.a).j) {
            pm3Var.d = true;
            pm3Var.e = true;
        }
        return pm3Var.a();
    }

    public hm4 q(pa9 pa9Var) {
        if (((ha9) this.a).f > 0) {
            pa9Var.d = 1;
        }
        int i = ((ha9) this.a).f;
        j3h j3hVar = new j3h(i > 0 ? i : -1, 1, -1, -1, 1.0f, -1, -1, -1L, -1, -1, -1);
        hm4 hm4Var = new hm4((Context) this.c);
        hm4Var.c = j3hVar;
        hm4Var.o = false;
        return new hm4(hm4Var);
    }

    public ArrayList r(long j, List list) {
        imb imbVar;
        long j2;
        int i;
        long j3;
        a09 a09Var;
        k09 k09Var;
        int i2;
        String str = (String) this.b;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "createOutputItems, totalDurationMcs=" + j + ", inputInfos=" + list.size(), null);
            }
        }
        if (j == -9223372036854775807L) {
            imbVar = new imb(-9223372036854775807L, -9223372036854775807L);
        } else {
            ha9 ha9Var = (ha9) this.a;
            float f = ha9Var.g;
            if (f == 0.0f && ha9Var.h == 1.0f) {
                imbVar = new imb(-9223372036854775807L, -9223372036854775807L);
            } else {
                float f2 = j;
                imbVar = new imb(Long.valueOf((long) (f * f2)), Long.valueOf((long) (f2 * ha9Var.h)));
            }
        }
        long jLongValue = ((Number) imbVar.a).longValue();
        long jLongValue2 = ((Number) imbVar.b).longValue();
        long j4 = j != -9223372036854775807L ? 0L : -9223372036854775807L;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            if (j4 == -9223372036854775807L) {
                j2 = jLongValue;
                j4 = -9223372036854775807L;
            } else if (i3 == 0) {
                j2 = jLongValue;
                j4 = 0;
            } else {
                j2 = jLongValue;
                j4 += ((fz8) list.get(i3 - 1)).b;
            }
            fz8 fz8Var = (fz8) list.get(i3);
            if (j4 == -9223372036854775807L || j2 == -9223372036854775807L || jLongValue2 == -9223372036854775807L || (j4 <= jLongValue2 && fz8Var.b + j4 >= j2)) {
                oz8 oz8Var = new oz8();
                uz8 uz8Var = new uz8();
                List list2 = Collections.EMPTY_LIST;
                zjd zjdVar = zjd.o;
                wz8 wz8Var = new wz8();
                d09 d09Var = d09.d;
                i = 0;
                Uri uri = fz8Var.a;
                if (j4 == -9223372036854775807L || j2 == -9223372036854775807L || jLongValue2 == -9223372036854775807L) {
                    j3 = jLongValue2;
                } else {
                    long j5 = fz8Var.b + j4;
                    if (j4 < j2 || j5 > jLongValue2) {
                        oz8 oz8Var2 = new oz8();
                        j3 = jLongValue2;
                        if (j4 < j2) {
                            oz8Var2.b(j2 - j4);
                        }
                        if (j5 > j3) {
                            oz8Var2.a(j5 - j3);
                        }
                        oz8Var = new qz8(oz8Var2).a();
                    } else {
                        j3 = jLongValue2;
                        oz8Var = oz8Var;
                    }
                }
                hsi.g(uz8Var.b == null || uz8Var.a != null);
                if (uri != null) {
                    a09Var = new a09(uri, null, uz8Var.a != null ? new vz8(uz8Var) : null, null, list2, null, zjdVar, -9223372036854775807L);
                } else {
                    a09Var = null;
                }
                k09Var = new k09("", new sz8(oz8Var), a09Var, new yz8(wz8Var), w19.K, d09Var);
            } else {
                j3 = jLongValue2;
                k09Var = null;
                i = 0;
            }
            if (k09Var != null) {
                ha9 ha9Var2 = (ha9) this.a;
                a09 a09Var2 = k09Var.b;
                long jU = a09Var2 == null ? -9223372036854775807L : zxg.U(a09Var2.h);
                t95 t95Var = t95.c;
                boolean z = ha9Var2.k;
                u4j.a(4, "initialCapacity");
                Object[] objArrCopyOf = new Object[4];
                int i4 = ha9Var2.d;
                if (i4 > 0) {
                    int i5 = ha9Var2.e;
                    l8c l8cVarF = l8c.f(i4 - (i4 % 4), i5 - (i5 % 4));
                    int iH = mg7.h(4, 1);
                    if (iH > 4) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iH);
                    }
                    objArrCopyOf[i] = l8cVarF;
                    i2 = 1;
                } else {
                    i2 = i;
                }
                arrayList.add(new g95(k09Var, z, false, jU, -2147483647, new t95(hd5.a, wg7.h(i2, objArrCopyOf))));
            }
            i3++;
            jLongValue = j2;
            jLongValue2 = j3;
        }
        return arrayList;
    }

    @Override // defpackage.gof
    public int s() {
        return ((long[]) this.c).length;
    }

    public hhg t(hm4 hm4Var, ra9 ra9Var) {
        ft0 ft0VarA;
        fhg fhgVar = new fhg((Context) this.c);
        fhgVar.k = hm4Var;
        fhgVar.h.a(ra9Var);
        ha9 ha9Var = (ha9) this.a;
        if (ha9Var.r) {
            fhgVar.l = new oh7();
        }
        if (!ha9Var.i) {
            if (!ha9Var.m) {
                String strN = xz9.n("video/avc");
                hsi.a("Not a video MIME type: " + strN, xz9.m(strN));
                fhgVar.b = strN;
            }
            int i = ha9Var.n;
            if (i > 0) {
                hsi.b(i > 0 || i == -1);
                fhgVar.g = i;
            }
        }
        chg chgVar = fhgVar.c;
        if (chgVar == null) {
            ft0VarA = new ft0();
            ft0VarA.a = -1;
        } else {
            ft0VarA = chgVar.a();
        }
        String str = fhgVar.b;
        if (str != null) {
            ft0VarA.c(str);
        }
        chg chgVarA = ft0VarA.a();
        fhgVar.c = chgVarA;
        String str2 = chgVarA.b;
        if (str2 != null) {
            hsi.f("Unsupported sample MIME type ".concat(str2), fhgVar.l.a(xz9.h(str2)).contains(str2));
        }
        String str3 = fhgVar.c.c;
        if (str3 != null) {
            hsi.f("Unsupported sample MIME type ".concat(str3), fhgVar.l.a(xz9.h(str3)).contains(str3));
        }
        String.format("Muxer.Factory %s does not support writing negative timestamps to an edit list.", fhgVar.l);
        return new hhg(fhgVar.a, fhgVar.c, fhgVar.d, fhgVar.e, fhgVar.f, fhgVar.g, fhgVar.h, fhgVar.i, fhgVar.j, fhgVar.k, fhgVar.l, fhgVar.m, fhgVar.n, fhgVar.o, fhgVar.p);
    }

    public qk4 u(InputStream inputStream, BitmapFactory.Options options, ColorSpace colorSpace) {
        Bitmap bitmap;
        tha thaVar = vc3.X;
        c6c c6cVar = (c6c) this.c;
        np0 np0Var = (np0) this.a;
        int i = options.outWidth;
        int i2 = options.outHeight;
        PreverificationHelper preverificationHelper = (PreverificationHelper) this.b;
        if (preverificationHelper == null || !preverificationHelper.shouldUseHardwareBitmapConfig(options.inPreferredConfig)) {
            Bitmap.Config config = options.outConfig;
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            bitmap = (Bitmap) np0Var.get(xp0.c(i, i2, config));
            if (bitmap == null) {
                throw new NullPointerException("BitmapPool.get returned null");
            }
        } else {
            options.inMutable = false;
            bitmap = null;
        }
        options.inBitmap = bitmap;
        if (colorSpace == null) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        options.inPreferredColorSpace = colorSpace;
        ByteBuffer byteBufferAllocate = (ByteBuffer) c6cVar.a();
        if (byteBufferAllocate == null) {
            rw0 rw0Var = eh4.a;
            byteBufferAllocate = ByteBuffer.allocate(16384);
        }
        try {
            try {
                options.inTempStorage = byteBufferAllocate.array();
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                c6cVar.b(byteBufferAllocate);
                if (bitmap == null || bitmap == bitmapDecodeStream) {
                    return vc3.k0(bitmapDecodeStream, np0Var, thaVar);
                }
                np0Var.b(bitmap);
                if (bitmapDecodeStream != null) {
                    bitmapDecodeStream.recycle();
                }
                throw new IllegalStateException();
            } catch (IllegalArgumentException e) {
                if (bitmap != null) {
                    np0Var.b(bitmap);
                }
                try {
                    inputStream.reset();
                    Bitmap bitmapDecodeStream2 = BitmapFactory.decodeStream(inputStream);
                    if (bitmapDecodeStream2 == null) {
                        throw e;
                    }
                    qk4 qk4VarK0 = vc3.k0(bitmapDecodeStream2, v1a.C(), thaVar);
                    c6cVar.b(byteBufferAllocate);
                    return qk4VarK0;
                } catch (IOException unused) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                if (bitmap != null) {
                    np0Var.b(bitmap);
                }
                throw e2;
            }
        } catch (Throwable th) {
            c6cVar.b(byteBufferAllocate);
            throw th;
        }
    }

    public void v(zjd zjdVar, tu6 tu6Var) throws VideoFrameProcessingException, GlUtil$GlException {
        sa9 sa9Var = this;
        zjd zjdVar2 = zjdVar;
        zr2 zr2Var = (zr2) sa9Var.a;
        if (((dy) sa9Var.b) == null) {
            try {
                dy dyVar = new dy((Context) sa9Var.c, "shaders/vertex_shader_transformation_es2.glsl", "shaders/fragment_shader_alpha_scale_es2.glsl");
                sa9Var.b = dyVar;
                dyVar.x(guf.q());
                ((dy) sa9Var.b).z("uTexTransformationMatrix", guf.g());
            } catch (IOException e) {
                throw new VideoFrameProcessingException(e);
            }
        }
        int i = tu6Var.b;
        int i2 = tu6Var.d;
        int i3 = tu6Var.c;
        guf.n(i, i3, i2);
        zr2Var.j = new c4f(i3, i2);
        guf.f();
        dy dyVar2 = (dy) sa9Var.b;
        dyVar2.getClass();
        GLES20.glUseProgram(dyVar2.b);
        guf.d();
        int i4 = 3042;
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        guf.d();
        int i5 = zjdVar2.d - 1;
        while (i5 >= 0) {
            gr4 gr4Var = (gr4) zjdVar2.get(i5);
            dy dyVar3 = (dy) sa9Var.b;
            dyVar3.getClass();
            tu6 tu6Var2 = gr4Var.b.a;
            dyVar3.C(tu6Var2.a, 0, "uTexSampler");
            c4f c4fVar = new c4f(tu6Var2.c, tu6Var2.d);
            float[] fArr = (float[]) zr2Var.b;
            Matrix.setIdentityM(fArr, 0);
            float[] fArr2 = (float[]) zr2Var.a;
            Matrix.setIdentityM(fArr2, 0);
            float[] fArr3 = (float[]) zr2Var.e;
            Matrix.setIdentityM(fArr3, 0);
            float[] fArr4 = (float[]) zr2Var.c;
            Matrix.setIdentityM(fArr4, 0);
            float[] fArr5 = (float[]) zr2Var.d;
            Matrix.setIdentityM(fArr5, 0);
            Matrix.setIdentityM((float[]) zr2Var.f, 0);
            float[] fArr6 = (float[]) zr2Var.g;
            Matrix.setIdentityM(fArr6, 0);
            float[] fArr7 = (float[]) zr2Var.h;
            Matrix.setIdentityM(fArr7, 0);
            float[] fArr8 = (float[]) zr2Var.i;
            Matrix.setIdentityM(fArr8, 0);
            int i6 = i4;
            Pair pair = skb.R;
            Matrix.translateM(fArr2, 0, ((Float) pair.first).floatValue(), ((Float) pair.second).floatValue(), 0.0f);
            hsi.h((c4f) zr2Var.j);
            float f = c4fVar.a;
            c4f c4fVar2 = (c4f) zr2Var.j;
            float f2 = c4fVar.b;
            Matrix.scaleM(fArr, 0, f / c4fVar2.a, f2 / c4fVar2.b, 1.0f);
            Pair pair2 = skb.T;
            Matrix.scaleM(fArr4, 0, ((Float) pair2.first).floatValue(), ((Float) pair2.second).floatValue(), 1.0f);
            Matrix.invertM(fArr5, 0, fArr4, 0);
            Pair pair3 = skb.S;
            Matrix.translateM(fArr3, 0, ((Float) pair3.first).floatValue() * (-1.0f), ((Float) pair3.second).floatValue() * (-1.0f), 0.0f);
            Matrix.rotateM((float[]) zr2Var.f, 0, 0.0f, 0.0f, 0.0f, 1.0f);
            Matrix.scaleM(fArr6, 0, f2 / f, 1.0f, 1.0f);
            Matrix.invertM(fArr7, 0, fArr6, 0);
            float[] fArr9 = (float[]) zr2Var.i;
            Matrix.multiplyMM(fArr9, 0, fArr9, 0, (float[]) zr2Var.a, 0);
            float[] fArr10 = (float[]) zr2Var.i;
            Matrix.multiplyMM(fArr10, 0, fArr10, 0, (float[]) zr2Var.b, 0);
            float[] fArr11 = (float[]) zr2Var.i;
            Matrix.multiplyMM(fArr11, 0, fArr11, 0, (float[]) zr2Var.c, 0);
            float[] fArr12 = (float[]) zr2Var.i;
            Matrix.multiplyMM(fArr12, 0, fArr12, 0, (float[]) zr2Var.e, 0);
            float[] fArr13 = (float[]) zr2Var.i;
            Matrix.multiplyMM(fArr13, 0, fArr13, 0, (float[]) zr2Var.d, 0);
            float[] fArr14 = (float[]) zr2Var.i;
            Matrix.multiplyMM(fArr14, 0, fArr14, 0, (float[]) zr2Var.g, 0);
            float[] fArr15 = (float[]) zr2Var.i;
            Matrix.multiplyMM(fArr15, 0, fArr15, 0, (float[]) zr2Var.f, 0);
            float[] fArr16 = (float[]) zr2Var.i;
            Matrix.multiplyMM(fArr16, 0, fArr16, 0, (float[]) zr2Var.h, 0);
            float[] fArr17 = (float[]) zr2Var.i;
            Matrix.multiplyMM(fArr17, 0, fArr17, 0, (float[]) zr2Var.c, 0);
            dyVar3.z("uTransformationMatrix", fArr8);
            dyVar3.y("uAlphaScale", 1.0f);
            dyVar3.q();
            GLES20.glDrawArrays(5, 0, 4);
            guf.d();
            i5--;
            sa9Var = this;
            zjdVar2 = zjdVar;
            i4 = i6;
        }
        GLES20.glDisable(i4);
        guf.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02f5  */
    /* JADX WARN: Type inference failed for: r41v0, types: [java.lang.Object, sa9] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [int] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r9v6, types: [android.media.MediaExtractor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.oa9 w() {
        /*
            Method dump skipped, instructions count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sa9.w():oa9");
    }

    public void x(pa9 pa9Var, pm3 pm3Var) {
        lg8 lg8Var = lg8.d;
        lg8 lg8Var2 = lg8.X;
        String str = (String) this.b;
        l6b l6bVar = wqi.a;
        if (l6bVar != null && l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, str, "executeWithMainLooper", null);
        }
        String str2 = ((ha9) this.a).c;
        Handler handler = new Handler(Looper.getMainLooper());
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ra9 ra9Var = new ra9(pa9Var, this, countDownLatch, 1);
        final hhg hhgVarT = t(q(pa9Var), ra9Var);
        if (!handler.post(new ev1(this, hhgVarT, pm3Var, str2, ra9Var, 3))) {
            pa9Var.a(new MediaTransformException("Failed to start media transform on main loop", null));
            final int i = 0;
            if (handler.post(new Runnable(this) { // from class: qa9
                public final /* synthetic */ sa9 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            this.b.k(hhgVarT);
                            break;
                        case 1:
                            this.b.k(hhgVarT);
                            break;
                        default:
                            this.b.j(hhgVarT);
                            break;
                    }
                }
            })) {
                return;
            }
            String str3 = (String) this.b;
            l6b l6bVar2 = wqi.a;
            if (l6bVar2 != null && l6bVar2.b(lg8Var2)) {
                l6bVar2.c(lg8Var2, str3, "executeWithMainLooper, failed to cleanup transformer on main loop", null);
                return;
            }
            return;
        }
        ha9 ha9Var = (ha9) this.a;
        la9 la9Var = new la9(handler, hhgVarT, ha9Var.p, ha9Var.q, ha9Var.o);
        la9Var.b();
        String str4 = (String) this.b;
        l6b l6bVar3 = wqi.a;
        if (l6bVar3 != null && l6bVar3.b(lg8Var)) {
            l6bVar3.c(lg8Var, str4, "executeWithMainLooper, waiting for completion ...", null);
        }
        try {
            try {
                countDownLatch.await();
                String str5 = (String) this.b;
                l6b l6bVar4 = wqi.a;
                if (l6bVar4 != null && l6bVar4.b(lg8Var)) {
                    l6bVar4.c(lg8Var, str5, "executeWithMainLooper, completed", null);
                }
                la9Var.a();
                final int i2 = 1;
                if (handler.post(new Runnable(this) { // from class: qa9
                    public final /* synthetic */ sa9 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                this.b.k(hhgVarT);
                                break;
                            case 1:
                                this.b.k(hhgVarT);
                                break;
                            default:
                                this.b.j(hhgVarT);
                                break;
                        }
                    }
                })) {
                    return;
                }
                String str6 = (String) this.b;
                l6b l6bVar5 = wqi.a;
                if (l6bVar5 != null && l6bVar5.b(lg8Var2)) {
                    l6bVar5.c(lg8Var2, str6, "executeWithMainLooper, failed to cleanup transformer on main loop", null);
                }
            } catch (InterruptedException e) {
                pa9Var.a(new MediaTransformException("Waiting for media transform completion interrupted", e));
                final int i3 = 2;
                if (!handler.post(new Runnable(this) { // from class: qa9
                    public final /* synthetic */ sa9 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                this.b.k(hhgVarT);
                                break;
                            case 1:
                                this.b.k(hhgVarT);
                                break;
                            default:
                                this.b.j(hhgVarT);
                                break;
                        }
                    }
                })) {
                    String str7 = (String) this.b;
                    l6b l6bVar6 = wqi.a;
                    if (l6bVar6 != null && l6bVar6.b(lg8Var2)) {
                        l6bVar6.c(lg8Var2, str7, "executeWithMainLooper, failed to abort media transformer on main loop", null);
                    }
                }
                la9Var.a();
                final int i4 = 1;
                if (handler.post(new Runnable(this) { // from class: qa9
                    public final /* synthetic */ sa9 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i4) {
                            case 0:
                                this.b.k(hhgVarT);
                                break;
                            case 1:
                                this.b.k(hhgVarT);
                                break;
                            default:
                                this.b.j(hhgVarT);
                                break;
                        }
                    }
                })) {
                    return;
                }
                String str8 = (String) this.b;
                l6b l6bVar7 = wqi.a;
                if (l6bVar7 != null && l6bVar7.b(lg8Var2)) {
                    l6bVar7.c(lg8Var2, str8, "executeWithMainLooper, failed to cleanup transformer on main loop", null);
                }
            }
        } catch (Throwable th) {
            la9Var.a();
            final int i5 = 1;
            if (!handler.post(new Runnable(this) { // from class: qa9
                public final /* synthetic */ sa9 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i5) {
                        case 0:
                            this.b.k(hhgVarT);
                            break;
                        case 1:
                            this.b.k(hhgVarT);
                            break;
                        default:
                            this.b.j(hhgVarT);
                            break;
                    }
                }
            })) {
                String str9 = (String) this.b;
                l6b l6bVar8 = wqi.a;
                if (l6bVar8 != null && l6bVar8.b(lg8Var2)) {
                    l6bVar8.c(lg8Var2, str9, "executeWithMainLooper, failed to cleanup transformer on main loop", null);
                }
            }
            throw th;
        }
    }

    public df5 z(int i) {
        cf5 cf5Var = (cf5) this.a;
        HashMap map = (HashMap) this.c;
        if (map.containsKey(Integer.valueOf(i))) {
            return (df5) map.get(Integer.valueOf(i));
        }
        y90 y90VarE = null;
        if (cf5Var.i(i)) {
            df5 df5VarN = cf5Var.n(i);
            u75 u75Var = (u75) this.b;
            if (df5VarN != null) {
                ArrayList arrayList = new ArrayList();
                for (z90 z90Var : df5VarN.d()) {
                    if (x75.a(z90Var, u75Var)) {
                        arrayList.add(z90Var);
                    }
                }
                if (!arrayList.isEmpty()) {
                    y90VarE = y90.e(df5VarN.a(), df5VarN.b(), df5VarN.c(), arrayList);
                }
            }
            map.put(Integer.valueOf(i), y90VarE);
        }
        return y90VarE;
    }

    public sa9(i40 i40Var) {
        this.a = i40Var;
        lqc lqcVar = new lqc();
        this.b = lqcVar;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        j0e j0eVarA = u0e.a();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(j0eVarA, "scheduler is null");
        this.c = new jta(lqcVar, 50L, timeUnit, j0eVarA).l(de.a()).n(new u4e(28, i40Var));
    }

    public sa9(lm lmVar, Object obj) {
        this.a = obj;
        this.b = lmVar.a;
        this.c = lmVar.b;
    }

    public sa9(cf5 cf5Var, u75 u75Var) {
        this.c = new HashMap();
        this.a = cf5Var;
        this.b = u75Var;
    }

    public sa9(int i) {
        switch (i) {
            case 19:
                this.a = new HashMap();
                this.b = new HashMap();
                this.c = odi.c;
                break;
            default:
                uy0 uy0Var = uy0.Y;
                this.a = new HashSet();
                this.b = uy0Var;
                break;
        }
    }

    public sa9(int i, String str, ArrayList arrayList, byte[] bArr) {
        List listUnmodifiableList;
        this.b = str;
        if (arrayList == null) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.a = listUnmodifiableList;
        this.c = bArr;
    }

    public sa9(l50... l50VarArr) {
        w0f w0fVar = new w0f();
        q6f q6fVar = new q6f(false);
        l50[] l50VarArr2 = new l50[l50VarArr.length + 2];
        this.a = l50VarArr2;
        System.arraycopy(l50VarArr, 0, l50VarArr2, 0, l50VarArr.length);
        this.b = w0fVar;
        this.c = q6fVar;
        l50VarArr2[l50VarArr.length] = w0fVar;
        l50VarArr2[l50VarArr.length + 1] = q6fVar;
    }

    public sa9(Context context, int i) {
        switch (i) {
            case 13:
                this.a = new Object();
                this.c = new HashMap();
                this.b = new zsd(this, context);
                break;
            default:
                this.c = context;
                this.a = new zr2();
                break;
        }
    }
}
