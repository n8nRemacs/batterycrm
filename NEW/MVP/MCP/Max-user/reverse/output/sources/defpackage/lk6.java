package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.widget.ImageView;
import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.onelog.impl.BuildConfig;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public class lk6 implements el5, tc4, mhd, qn6, on0 {
    public static final os5 o = new os5(15);
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;

    public /* synthetic */ lk6(char c, int i) {
        this.a = i;
    }

    public static lk6 S(char c) {
        return new lk6(new kme(2, new ab2(c)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x022c, code lost:
    
        if (r19 == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x022e, code lost:
    
        r0 = new defpackage.i5i();
        r0.a = new int[]{r5, r11, r12};
        r0.b = new float[]{0.0f, 0.5f, 1.0f};
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0242, code lost:
    
        r0 = new defpackage.i5i();
        r0.a = new int[]{r5, r12};
        r15 = 2;
        r0.b = new float[]{0.0f, 1.0f};
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0256, code lost:
    
        if (r9 == r8) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0258, code lost:
    
        if (r9 == r15) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x025a, code lost:
    
        r17 = (int[]) r0.a;
        r18 = (float[]) r0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0268, code lost:
    
        if (r6 == r8) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x026a, code lost:
    
        if (r6 == r15) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x026c, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0277, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x027a, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x027d, code lost:
    
        r12 = new android.graphics.LinearGradient(r21, r22, r26, r16, r17, r18, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0281, code lost:
    
        r12 = new android.graphics.SweepGradient(r7, r10, (int[]) r0.a, (float[]) r0.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0293, code lost:
    
        if (r25 <= 0.0f) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0295, code lost:
    
        r21 = (int[]) r0.a;
        r22 = (float[]) r0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02a5, code lost:
    
        if (r6 == 1) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02a7, code lost:
    
        if (r6 == 2) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02a9, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02b4, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02b7, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02ba, code lost:
    
        r12 = new android.graphics.RadialGradient(r7, r10, r25, r21, r22, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02c6, code lost:
    
        return new defpackage.lk6(r12, (android.content.res.ColorStateList) null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02ce, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ed, code lost:
    
        if (r2.size() <= 0) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01ef, code lost:
    
        r0 = new defpackage.i5i();
        r1 = r2.size();
        r0.a = new int[r1];
        r0.b = new float[r1];
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0201, code lost:
    
        if (r3 >= r1) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0203, code lost:
    
        ((int[]) r0.a)[r3] = ((java.lang.Integer) r2.get(r3)).intValue();
        ((float[]) r0.b)[r3] = ((java.lang.Float) r13.get(r3)).floatValue();
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0226, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0227, code lost:
    
        if (r0 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0229, code lost:
    
        r8 = 1;
        r15 = 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.lk6 v(android.content.res.Resources r27, int r28, android.content.res.Resources.Theme r29) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lk6.v(android.content.res.Resources, int, android.content.res.Resources$Theme):lk6");
    }

    public Object A(int i) {
        switch (this.a) {
            case 22:
                SparseArray sparseArray = (SparseArray) this.c;
                if (this.b == -1) {
                    this.b = 0;
                }
                while (true) {
                    int i2 = this.b;
                    if (i2 > 0 && i < sparseArray.keyAt(i2)) {
                        this.b--;
                    }
                }
                while (this.b < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.b + 1)) {
                    this.b++;
                }
                return sparseArray.valueAt(this.b);
            default:
                SparseArray sparseArray2 = (SparseArray) this.c;
                if (this.b == -1) {
                    this.b = 0;
                }
                while (true) {
                    int i3 = this.b;
                    if (i3 > 0 && i < sparseArray2.keyAt(i3)) {
                        this.b--;
                    }
                }
                while (this.b < sparseArray2.size() - 1 && i >= sparseArray2.keyAt(this.b + 1)) {
                    this.b++;
                }
                return sparseArray2.valueAt(this.b);
        }
    }

    @Override // defpackage.el5
    public byte[] B(byte[] bArr, byte[] bArr2) throws JSONException {
        if (cy0.c.equals((UUID) this.c) && Build.VERSION.SDK_INT < 27) {
            try {
                JSONObject jSONObject = new JSONObject(zxg.q(bArr2));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray(ApiProtocol.PARAM_KEYS);
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (i != 0) {
                        sb.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    sb.append("{\"k\":\"");
                    sb.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kid\":\"");
                    sb.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = sb.toString().getBytes(StandardCharsets.UTF_8);
            } catch (JSONException e) {
                a8i.h("ClearKeyUtil", "Failed to adjust response data: ".concat(zxg.q(bArr2)), e);
            }
        }
        return ((MediaDrm) this.d).provideKeyResponse(bArr, bArr2);
    }

    public synchronized int C() {
        return ((LinkedHashMap) this.d).size();
    }

    @Override // defpackage.el5
    public void D(final ukd ukdVar) {
        ((MediaDrm) this.d).setOnEventListener(new MediaDrm.OnEventListener() { // from class: kk6
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                lk6 lk6Var = this.a;
                ukd ukdVar2 = ukdVar;
                lk6Var.getClass();
                ey eyVar = ((sl4) ukdVar2.b).x;
                eyVar.getClass();
                eyVar.obtainMessage(i, bArr).sendToTarget();
            }
        });
    }

    @Override // defpackage.el5
    public void E(byte[] bArr) throws DeniedByServerException {
        ((MediaDrm) this.d).provideProvisionResponse(bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0202  */
    @Override // defpackage.el5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.cl5 F(byte[] r17, java.util.List r18, int r19, java.util.HashMap r20) throws android.media.NotProvisionedException {
        /*
            Method dump skipped, instructions count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lk6.F(byte[], java.util.List, int, java.util.HashMap):cl5");
    }

    public String G() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.b + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.c)[i2];
            if (obj instanceof ree) {
                ree reeVar = (ree) obj;
                if (!fni.a(reeVar.e(), nnf.c)) {
                    int i3 = ((int[]) this.d)[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(reeVar.g(i3));
                    }
                } else if (((int[]) this.d)[i2] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.d)[i2]);
                    sb.append("]");
                }
            } else if (obj != jbe.w0) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    @Override // defpackage.el5
    public int H() {
        return 2;
    }

    @Override // defpackage.el5
    public void I(byte[] bArr, n4c n4cVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                MediaDrm mediaDrm = (MediaDrm) this.d;
                LogSessionId logSessionIdA = n4cVar.a();
                LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
                if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                    return;
                }
                MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
                playbackComponent.getClass();
                b34.e(playbackComponent).setLogSessionId(logSessionIdA);
            } catch (UnsupportedOperationException unused2) {
                a8i.l("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    public synchronized int J() {
        return this.b;
    }

    @Override // defpackage.el5
    public boolean K(String str, byte[] bArr) throws Throwable {
        MediaCrypto mediaCrypto;
        boolean zEquals;
        MediaDrm mediaDrm = (MediaDrm) this.d;
        UUID uuid = (UUID) this.c;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            if (uuid.equals(cy0.d)) {
                String propertyString = mediaDrm.getPropertyString("version");
                zEquals = (propertyString.startsWith("v5.") || propertyString.startsWith("14.") || propertyString.startsWith("15.") || propertyString.startsWith("16.0")) ? false : true;
            } else {
                zEquals = uuid.equals(cy0.c);
            }
            if (zEquals) {
                return mediaDrm.requiresSecureDecoder(str, mediaDrm.getSecurityLevel(bArr));
            }
        }
        MediaCrypto mediaCrypto2 = null;
        try {
            try {
                mediaCrypto = new MediaCrypto((i >= 27 || !Objects.equals(uuid, cy0.c)) ? uuid : cy0.b, bArr);
            } catch (Throwable th) {
                th = th;
            }
        } catch (MediaCryptoException unused) {
        }
        try {
            boolean zRequiresSecureDecoderComponent = mediaCrypto.requiresSecureDecoderComponent(str);
            mediaCrypto.release();
            return zRequiresSecureDecoderComponent;
        } catch (MediaCryptoException unused2) {
            mediaCrypto2 = mediaCrypto;
            boolean z = !uuid.equals(cy0.c);
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            return z;
        } catch (Throwable th2) {
            th = th2;
            mediaCrypto2 = mediaCrypto;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        }
    }

    public boolean L() {
        ColorStateList colorStateList;
        return ((Shader) this.c) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful();
    }

    public void M(ub8 ub8Var, int i, int i2, hf6 hf6Var, int i3, Object obj, long j, long j2) {
        x(new i99(this, ub8Var, new g19(i, i2, hf6Var, i3, obj, zxg.m0(j), zxg.m0(j2)), 1));
    }

    public void N(ub8 ub8Var, int i, int i2, hf6 hf6Var, int i3, Object obj, long j, long j2) {
        x(new i99(this, ub8Var, new g19(i, i2, hf6Var, i3, obj, zxg.m0(j), zxg.m0(j2)), 0));
    }

    public void O(ub8 ub8Var, int i, int i2, hf6 hf6Var, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        x(new kj4(this, ub8Var, new g19(i, i2, hf6Var, i3, obj, zxg.m0(j), zxg.m0(j2)), iOException, z));
    }

    public void P(ub8 ub8Var, int i, IOException iOException, boolean z) {
        O(ub8Var, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
    }

    public void Q(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.c;
        jdc jdcVarX = jdc.x(imageView.getContext(), attributeSet, o6d.AppCompatImageView, i);
        TypedArray typedArray = (TypedArray) jdcVarX.c;
        hfh.m(imageView, imageView.getContext(), o6d.AppCompatImageView, attributeSet, (TypedArray) jdcVarX.c, i, 0);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(o6d.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = eri.a(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                d45.a(drawable);
            }
            if (typedArray.hasValue(o6d.AppCompatImageView_tint)) {
                wf7.c(imageView, jdcVarX.s(o6d.AppCompatImageView_tint));
            }
            if (typedArray.hasValue(o6d.AppCompatImageView_tintMode)) {
                wf7.d(imageView, d45.c(typedArray.getInt(o6d.AppCompatImageView_tintMode, -1), null));
            }
            jdcVarX.B();
        } catch (Throwable th) {
            jdcVarX.B();
            throw th;
        }
    }

    public void R(ub8 ub8Var, int i, int i2, hf6 hf6Var, int i3, Object obj, long j, long j2, int i4) {
        x(new bd0(this, ub8Var, new g19(i, i2, hf6Var, i3, obj, zxg.m0(j), zxg.m0(j2)), i4, 4));
    }

    public lk6 T(Object obj, Object obj2) {
        int i = (this.b + 1) * 2;
        Object[] objArr = (Object[]) this.c;
        if (i > objArr.length) {
            this.c = Arrays.copyOf(objArr, mg7.h(objArr.length, i));
        }
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 == null) {
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
        Object[] objArr2 = (Object[]) this.c;
        int i2 = this.b;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.b = i2 + 1;
        return this;
    }

    public synchronized void U(ty0 ty0Var, Object obj) {
        Object objRemove = ((LinkedHashMap) this.d).remove(ty0Var);
        this.b -= objRemove == null ? 0 : ((t9f) this.c).l(objRemove);
        ((LinkedHashMap) this.d).put(ty0Var, obj);
        this.b += ((t9f) this.c).l(obj);
    }

    public synchronized Object V(Object obj) {
        Object objRemove;
        objRemove = ((LinkedHashMap) this.d).remove(obj);
        this.b -= objRemove == null ? 0 : ((t9f) this.c).l(objRemove);
        return objRemove;
    }

    public void W(int i) {
        int iIntValue;
        synchronized (this.c) {
            ((PriorityQueue) this.d).remove(Integer.valueOf(i));
            if (((PriorityQueue) this.d).isEmpty()) {
                iIntValue = Integer.MIN_VALUE;
            } else {
                Integer num = (Integer) ((PriorityQueue) this.d).peek();
                String str = zxg.a;
                iIntValue = num.intValue();
            }
            this.b = iIntValue;
            this.c.notifyAll();
        }
    }

    public synchronized ArrayList X(o7c o7cVar) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((LinkedHashMap) this.d).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (o7cVar.mo44apply(entry.getKey())) {
                arrayList.add(entry.getValue());
                int i = this.b;
                Object value = entry.getValue();
                this.b = i - (value == null ? 0 : ((t9f) this.c).l(value));
                it.remove();
            }
        }
        return arrayList;
    }

    public List Y(CharSequence charSequence) {
        charSequence.getClass();
        kme kmeVar = (kme) this.d;
        kmeVar.getClass();
        l8f l8fVar = new l8f(kmeVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (l8fVar.hasNext()) {
            arrayList.add((String) l8fVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void Z(int i, long j, long j2) {
        g19 g19Var = new g19(1, i, null, 3, null, zxg.m0(j), zxg.m0(j2));
        d99 d99Var = (d99) this.c;
        d99Var.getClass();
        x(new nl(this, d99Var, g19Var, 14));
    }

    @Override // defpackage.qn6
    public void a(Object obj) {
        List list = (List) obj;
        o79 o79Var = ((z79) this.d).g;
        Handler handler = o79Var.l;
        u69 u69Var = (u69) this.c;
        zxg.a0(handler, new k79(o79Var, u69Var, new qe5(this, this.b, list, u69Var, 3)));
    }

    public void a0(String str, qt5 qt5Var) {
        int i = this.b + 1;
        Object[] objArr = (Object[]) this.c;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            if (i2 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int i3 = length + (length >> 1) + 1;
            if (i3 < i2) {
                int iHighestOneBit = Integer.highestOneBit(i2 - 1);
                i3 = iHighestOneBit + iHighestOneBit;
            }
            if (i3 < 0) {
                i3 = Integer.MAX_VALUE;
            }
            this.c = Arrays.copyOf(objArr, i3);
        }
        Object[] objArr2 = (Object[]) this.c;
        int i4 = this.b;
        int i5 = i4 + i4;
        objArr2[i5] = str;
        objArr2[i5 + 1] = qt5Var;
        this.b = i4 + 1;
    }

    @Override // defpackage.tc4
    public void b(jbe jbeVar) {
        wm4 wm4Var = (wm4) this.d;
        wm4Var.getClass();
        wm4Var.a = jbeVar;
    }

    public byte[] b0(int i) throws IOException {
        hmi hmiVar;
        pqa pqaVar;
        wha whaVar = wha.C0;
        ra3 ra3Var = (ra3) this.c;
        ((cyi) this.d).h = Boolean.valueOf(1 == (i ^ 1));
        cyi cyiVar = (cyi) this.d;
        cyiVar.f = Boolean.FALSE;
        ra3Var.a = new abj(cyiVar);
        try {
            lcj.q();
            if (i == 0) {
                w6j w6jVar = new w6j(ra3Var);
                pw7 pw7Var = new pw7();
                whaVar.f(pw7Var);
                pw7Var.d = true;
                StringWriter stringWriter = new StringWriter();
                try {
                    ey7 ey7Var = new ey7(stringWriter, pw7Var.a, pw7Var.b, pw7Var.c, pw7Var.d);
                    ey7Var.f(w6jVar);
                    ey7Var.h();
                    ey7Var.b.flush();
                } catch (IOException unused) {
                }
                return stringWriter.toString().getBytes("utf-8");
            }
            w6j w6jVar2 = new w6j(ra3Var);
            jkc jkcVar = new jkc(1);
            whaVar.f(jkcVar);
            HashMap map = new HashMap((HashMap) jkcVar.a);
            HashMap map2 = new HashMap((HashMap) jkcVar.b);
            odi odiVar = (odi) jkcVar.c;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                hmiVar = new hmi(byteArrayOutputStream, map, map2, odiVar);
                pqaVar = (pqa) map.get(w6j.class);
            } catch (IOException unused2) {
            }
            if (pqaVar == null) {
                throw new EncodingException("No encoder for ".concat(String.valueOf(w6j.class)));
            }
            pqaVar.a(w6jVar2, hmiVar);
            return byteArrayOutputStream.toByteArray();
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    @Override // defpackage.el5
    public Map c(byte[] bArr) {
        return ((MediaDrm) this.d).queryKeyStatus(bArr);
    }

    @Override // defpackage.tc4
    public void d(boolean z) {
        ((wm4) this.d).b = z;
    }

    @Override // defpackage.on0
    public void e() {
        qyg qygVar = (qyg) this.d;
        byte[] bArr = xxg.f;
        qygVar.getClass();
        qygVar.C(bArr.length, bArr);
    }

    @Override // defpackage.tc4
    public void f() {
        ((wm4) this.d).getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a8, code lost:
    
        if (r13 == r16) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b2, code lost:
    
        return new defpackage.nn0(-2, r13, r5 + r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b5, code lost:
    
        return defpackage.nn0.d;
     */
    @Override // defpackage.on0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.nn0 g(defpackage.hp5 r19, long r20) {
        /*
            r18 = this;
            r0 = r18
            long r5 = r19.getPosition()
            r1 = 112800(0x1b8a0, float:1.58066E-40)
            long r1 = (long) r1
            long r3 = r19.getLength()
            long r3 = r3 - r5
            long r1 = java.lang.Math.min(r1, r3)
            int r1 = (int) r1
            java.lang.Object r2 = r0.d
            qyg r2 = (defpackage.qyg) r2
            r2.B(r1)
            byte[] r3 = r2.a
            r4 = 0
            r7 = r19
            r7.i(r4, r3, r1)
            int r1 = r2.c
            r3 = -1
            r9 = r3
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L2d:
            int r11 = r2.c()
            r12 = 188(0xbc, float:2.63E-43)
            if (r11 < r12) goto La1
            byte[] r11 = r2.a
            int r12 = r2.b
        L39:
            if (r12 >= r1) goto L49
            r15 = r11[r12]
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 71
            if (r15 == r7) goto L4e
            int r12 = r12 + 1
            goto L39
        L49:
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L4e:
            int r7 = r12 + 188
            if (r7 <= r1) goto L53
            goto La6
        L53:
            int r3 = r0.b
            long r3 = defpackage.bhi.b(r2, r12, r3)
            int r8 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r8 == 0) goto L9c
            java.lang.Object r8 = r0.c
            y9g r8 = (defpackage.y9g) r8
            long r3 = r8.b(r3)
            int r8 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r8 <= 0) goto L82
            int r1 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r1 != 0) goto L74
            nn0 r1 = new nn0
            r2 = -1
            r1.<init>(r2, r3, r5)
            return r1
        L74:
            long r15 = r5 + r9
            nn0 r11 = new nn0
            r12 = 0
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r11.<init>(r12, r13, r15)
            return r11
        L82:
            r8 = 100000(0x186a0, double:4.94066E-319)
            long r8 = r8 + r3
            int r8 = (r8 > r20 ? 1 : (r8 == r20 ? 0 : -1))
            if (r8 <= 0) goto L99
            long r1 = (long) r12
            long r11 = r5 + r1
            nn0 r7 = new nn0
            r8 = 0
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.<init>(r8, r9, r11)
            return r7
        L99:
            long r8 = (long) r12
            r13 = r3
            r9 = r8
        L9c:
            r2.E(r7)
            long r3 = (long) r7
            goto L2d
        La1:
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        La6:
            int r1 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r1 == 0) goto Lb3
            long r15 = r5 + r3
            nn0 r11 = new nn0
            r12 = -2
            r11.<init>(r12, r13, r15)
            return r11
        Lb3:
            nn0 r1 = defpackage.nn0.d
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lk6.g(hp5, long):nn0");
    }

    public boolean h(aof aofVar) {
        Object obj;
        Object obj2 = this.c;
        while (true) {
            Object[] objArr = (Object[]) obj2;
            if (objArr == null) {
                return false;
            }
            for (int i = 0; i < 4 && (obj = objArr[i]) != null; i++) {
                if (obj == tma.a) {
                    aofVar.b();
                    return true;
                }
                if (obj instanceof rma) {
                    aofVar.onError(((rma) obj).a);
                    return true;
                }
                if (obj instanceof sma) {
                    aofVar.d(((sma) obj).a);
                } else {
                    aofVar.f(obj);
                }
            }
            obj2 = objArr[4];
        }
    }

    @Override // defpackage.tc4
    public uc4 i(jc8 jc8Var, ad4 ad4Var, k5i k5iVar, int i, int[] iArr, bn5 bn5Var, int i2, long j, boolean z, ArrayList arrayList, i4c i4cVar, wgg wggVar, n4c n4cVar) {
        se4 se4VarA = ((oe4) this.c).a();
        if (wggVar != null) {
            se4VarA.I(wggVar);
        }
        return new al4((wm4) this.d, jc8Var, ad4Var, k5iVar, i, iArr, bn5Var, i2, se4VarA, j, this.b, z, arrayList, i4cVar);
    }

    @Override // defpackage.el5
    public dl5 j() {
        MediaDrm.ProvisionRequest provisionRequest = ((MediaDrm) this.d).getProvisionRequest();
        return new dl5(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override // defpackage.tc4
    public hf6 k(hf6 hf6Var) {
        wm4 wm4Var = (wm4) this.d;
        if (!wm4Var.b || !wm4Var.a.f(hf6Var)) {
            return hf6Var;
        }
        ff6 ff6VarA = hf6Var.a();
        String str = hf6Var.k;
        ff6VarA.m = xz9.n("application/x-media3-cues");
        ff6VarA.K = wm4Var.a.J(hf6Var);
        StringBuilder sb = new StringBuilder();
        sb.append(hf6Var.n);
        sb.append(str != null ? " ".concat(str) : "");
        ff6VarA.j = sb.toString();
        ff6VarA.r = BuildConfig.MAX_TIME_TO_UPLOAD;
        return new hf6(ff6VarA);
    }

    public void l(int i) {
        synchronized (this.c) {
            ((PriorityQueue) this.d).add(Integer.valueOf(i));
            this.b = Math.max(this.b, i);
        }
    }

    public void m(Object obj) {
        int i = this.b;
        if (i == 4) {
            Object[] objArr = new Object[5];
            ((Object[]) this.d)[4] = objArr;
            this.d = objArr;
            i = 0;
        }
        ((Object[]) this.d)[i] = obj;
        this.b = i + 1;
    }

    @Override // defpackage.el5
    public xa4 n(byte[] bArr) {
        UUID uuid = (UUID) this.c;
        if (Build.VERSION.SDK_INT < 27 && Objects.equals(uuid, cy0.c)) {
            uuid = cy0.b;
        }
        return new jk6(uuid, bArr);
    }

    public void o(int i, int i2) {
        Bitmap[] bitmapArr = (Bitmap[]) this.d;
        int i3 = (i2 << 16) + i;
        boolean z = this.b != i3;
        this.b = i3;
        for (int i4 = 0; i4 < cq0.z; i4++) {
            if (z || bitmapArr[i4] == null) {
                Bitmap bitmap = bitmapArr[i4];
                if (bitmap != null) {
                    ((ScheduledExecutorService) sxi.a.f.a.getValue()).execute(new o3(20, bitmap));
                }
                bitmapArr[i4] = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
            }
            lg7[] lg7VarArr = (lg7[]) this.c;
            if (lg7VarArr[i4] == null) {
                lg7 lg7Var = new lg7();
                lg7Var.a = new byte[i2 * i * 2];
                lg7VarArr[i4] = lg7Var;
            }
        }
    }

    @Override // defpackage.qn6
    public void onFailure(Throwable th) {
    }

    @Override // defpackage.el5
    public byte[] p() {
        return ((MediaDrm) this.d).openSession();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mhd
    public boolean q(UnsatisfiedLinkError unsatisfiedLinkError, h6f[] h6fVarArr) {
        int i;
        bj bjVar = (bj) this.d;
        Context context = (Context) this.c;
        String str = context.getApplicationInfo().sourceDir;
        if (new File(str).exists() && bjVar.n(str)) {
            for (int i2 = 0; i2 < h6fVarArr.length; i2++) {
                Object[] objArr = h6fVarArr[i2];
                if (objArr instanceof fhd) {
                    h6fVarArr[i2] = ((fhd) objArr).a(context);
                }
            }
            return true;
        }
        int i3 = this.b;
        synchronized (bjVar) {
            i = bjVar.b;
        }
        if (i3 == i) {
            return false;
        }
        Log.w("soloader.recovery.DetectDataAppMove", "Context was updated (perhaps by another thread)");
        return true;
    }

    public void r() {
        i21 i21Var;
        ImageView imageView = (ImageView) this.c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            d45.a(drawable);
        }
        if (drawable == null || (i21Var = (i21) this.d) == null) {
            return;
        }
        ko.e(drawable, i21Var, imageView.getDrawableState());
    }

    @Override // defpackage.el5
    public synchronized void release() {
        int i = this.b - 1;
        this.b = i;
        if (i == 0) {
            ((MediaDrm) this.d).release();
        }
    }

    @Override // defpackage.el5
    public void s(byte[] bArr, byte[] bArr2) {
        ((MediaDrm) this.d).restoreKeys(bArr, bArr2);
    }

    public zb0 t() {
        if (!"".isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(""));
        }
        return new zb0(((Long) this.d).longValue(), (String) this.c, this.b);
    }

    public String toString() {
        switch (this.a) {
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return G();
            case 25:
                StringBuilder sb = new StringBuilder();
                if (((epc) this.c) == epc.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.b);
                sb.append(' ');
                sb.append((String) this.d);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public ah7 u() {
        ekd ekdVar;
        zg7 zg7Var = (zg7) this.d;
        if (zg7Var != null) {
            throw zg7Var.a();
        }
        int i = this.b;
        Object[] objArrCopyOf = (Object[]) this.c;
        if (i == 0) {
            ekdVar = ekd.Y;
        } else if (i == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            ekdVar = new ekd(1, null, objArrCopyOf);
        } else {
            u5j.f(i, objArrCopyOf.length >> 1);
            Object objI = ekd.i(objArrCopyOf, i, hh7.h(i), 0);
            if (objI instanceof Object[]) {
                Object[] objArr = (Object[]) objI;
                this.d = (zg7) objArr[2];
                Object obj = objArr[0];
                int iIntValue = ((Integer) objArr[1]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue * 2);
                objI = obj;
                i = iIntValue;
            }
            ekdVar = new ekd(i, objI, objArrCopyOf);
        }
        zg7 zg7Var2 = (zg7) this.d;
        if (zg7Var2 == null) {
            return ekdVar;
        }
        throw zg7Var2.a();
    }

    @Override // defpackage.el5
    public void w(byte[] bArr) {
        ((MediaDrm) this.d).closeSession(bArr);
    }

    public void x(fu3 fu3Var) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            l99 l99Var = (l99) it.next();
            zxg.a0(l99Var.a, new k79(fu3Var, 7, l99Var.b));
        }
    }

    public void y(int i, hf6 hf6Var, int i2, Object obj, long j) {
        x(new dq4(this, 24, new g19(1, i, hf6Var, i2, obj, zxg.m0(j), -9223372036854775807L)));
    }

    public void z(zr zrVar) {
        Object obj;
        for (Object[] objArr = (Object[]) this.c; objArr != null; objArr = objArr[4]) {
            for (int i = 0; i < 4 && (obj = objArr[i]) != null; i++) {
                if (zrVar.test(obj)) {
                    return;
                }
            }
        }
    }

    public /* synthetic */ lk6(Object obj, int i, String str, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = str;
    }

    public /* synthetic */ lk6(CopyOnWriteArrayList copyOnWriteArrayList, int i, Object obj, int i2) {
        this.a = i2;
        this.d = copyOnWriteArrayList;
        this.b = i;
        this.c = obj;
    }

    public lk6(ra3 ra3Var, int i) {
        this.a = 28;
        this.d = new cyi();
        this.c = ra3Var;
        lcj.q();
        this.b = i;
    }

    public lk6(String str, String[] strArr) {
        String string;
        this.a = 16;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str2 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str2);
            }
            sb.append("] ");
            string = sb.toString();
        }
        this.d = string;
        this.c = str;
        int length = str.length();
        Object[] objArr = {str, 23};
        if (length <= 23) {
            int i = 2;
            while (i <= 7 && !Log.isLoggable((String) this.c, i)) {
                i++;
            }
            this.b = i;
            return;
        }
        throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
    }

    public lk6(int i, String[] strArr, int[] iArr) {
        this.a = 20;
        this.b = i;
        this.c = strArr;
        this.d = iArr;
    }

    public lk6(Context context) {
        this.a = 9;
        this.d = new GestureDetector(context, new kx0(5, this));
    }

    public lk6(Context context, bj bjVar) {
        int i;
        this.a = 8;
        this.c = context;
        this.d = bjVar;
        synchronized (bjVar) {
            i = bjVar.b;
        }
        this.b = i;
    }

    public lk6(t9f t9fVar) {
        this.a = 6;
        this.d = new LinkedHashMap();
        this.b = 0;
        this.c = t9fVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public lk6(int i, byte b) {
        this(new CopyOnWriteArrayList(), 0, (Object) null, 10);
        this.a = i;
        switch (i) {
            case 4:
                int i2 = cq0.z;
                this.c = new lg7[i2];
                this.d = new Bitmap[i2];
                break;
            case 10:
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                this.b = -1;
                this.c = new HashMap();
                this.d = ByteBuffer.allocate(8096);
                break;
            case 21:
                this.c = new Object();
                this.d = new PriorityQueue(10, Collections.reverseOrder());
                this.b = Integer.MIN_VALUE;
                break;
            case 27:
                this.c = new Object[8];
                this.b = 0;
                break;
            default:
                Object[] objArr = new Object[5];
                this.c = objArr;
                this.d = objArr;
                break;
        }
    }

    public lk6(ImageView imageView) {
        this.a = 1;
        this.b = 0;
        this.c = imageView;
    }

    public lk6(ycd ycdVar) {
        this.a = 22;
        this.c = new SparseArray();
        this.d = ycdVar;
        this.b = -1;
    }

    public lk6(ycd ycdVar, byte b) {
        this.a = 23;
        this.c = new SparseArray();
        this.d = ycdVar;
        this.b = -1;
    }

    public lk6(Shader shader, ColorStateList colorStateList, int i) {
        this.a = 5;
        this.c = shader;
        this.d = colorStateList;
        this.b = i;
    }

    public lk6(int i, y9g y9gVar) {
        this.a = 26;
        this.b = i;
        this.c = y9gVar;
        this.d = new qyg(2, false);
    }

    public lk6(oe4 oe4Var) {
        this.a = 7;
        this.d = new wm4();
        this.c = oe4Var;
        this.b = 1;
    }

    public lk6(kme kmeVar) {
        this.a = 24;
        this.d = kmeVar;
        this.c = bb2.a;
        this.b = Integer.MAX_VALUE;
    }

    public lk6(UUID uuid) {
        this.a = 0;
        uuid.getClass();
        UUID uuid2 = cy0.b;
        hsi.a("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.c = uuid;
        MediaDrm mediaDrm = new MediaDrm((Build.VERSION.SDK_INT >= 27 || !uuid.equals(cy0.c)) ? uuid : uuid2);
        this.d = mediaDrm;
        this.b = 1;
        if (cy0.d.equals(uuid) && "ASUS_Z00AD".equals(Build.MODEL)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    public lk6(int i) {
        this.a = 14;
        this.c = new Object[i * 2];
        this.b = 0;
    }

    public lk6(z79 z79Var, u69 u69Var, int i) {
        this.a = 18;
        this.d = z79Var;
        this.c = u69Var;
        this.b = i;
    }
}
