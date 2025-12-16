package defpackage;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.media.MediaCodec;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.ArrayMap;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import android.widget.AbsSeekBar;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.cardview.widget.CardView;
import androidx.media3.common.util.GlUtil$GlException;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.apache.http.util.LangUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public class xo8 implements hw8, rn6, rk3, vx5, w57, v2f, lf7 {
    public static final int[] d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ xo8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public byte[] A(ni5 ni5Var) throws IOException {
        DataOutputStream dataOutputStream = (DataOutputStream) this.c;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.b;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(ni5Var.a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(ni5Var.b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(ni5Var.c);
            dataOutputStream.writeLong(ni5Var.d);
            dataOutputStream.write(ni5Var.e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.datatransport.cct.CctBackendFactory B(java.lang.String r14) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xo8.B(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    public CameraCharacteristics C(String str) throws CameraAccessExceptionCompat {
        try {
            return ((CameraManager) this.b).getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        }
    }

    public Set D() {
        return Collections.EMPTY_SET;
    }

    public zie E(eje ejeVar) {
        cp1 cp1Var = (cp1) ((HashMap) this.c).get(ejeVar);
        if (cp1Var != null) {
            return exi.e(cp1Var);
        }
        return null;
    }

    public void F(AttributeSet attributeSet, int i) {
        AbsSeekBar absSeekBar = (AbsSeekBar) this.b;
        jdc jdcVarX = jdc.x(absSeekBar.getContext(), attributeSet, d, i);
        Drawable drawableU = jdcVarX.u(0);
        if (drawableU != null) {
            if (drawableU instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawableU;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable drawableM = M(animationDrawable.getFrame(i2), true);
                    drawableM.setLevel(10000);
                    animationDrawable2.addFrame(drawableM, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                drawableU = animationDrawable2;
            }
            absSeekBar.setIndeterminateDrawable(drawableU);
        }
        Drawable drawableU2 = jdcVarX.u(1);
        if (drawableU2 != null) {
            absSeekBar.setProgressDrawable(M(drawableU2, false));
        }
        jdcVarX.B();
    }

    public void G(JSONObject jSONObject) {
        y6d y6dVar = (y6d) this.c;
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("features");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String string = jSONArray.getString(i);
                u81 u81VarQ = q85.q(string);
                if (u81VarQ != null) {
                    linkedHashSet.add(u81VarQ);
                } else {
                    y6dVar.log("CallFeatureNotificationHandler", "warning: unknown feature: ".concat(string));
                }
            }
            ((sm6) this.b).invoke(x71.w0, new x81(linkedHashSet));
        } catch (JSONException e) {
            y6dVar.logException("CallFeatureNotificationHandler", "feature set changed notification parsing error", e);
        }
    }

    public void H(JSONObject jSONObject) {
        try {
            ((sm6) this.b).invoke(x71.x0, new y81(q(jSONObject)));
        } catch (JSONException e) {
            ((y6d) this.c).logException("CallFeatureNotificationHandler", "features per role changed notification parsing error", e);
        }
    }

    public void I(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        executor.getClass();
        stateCallback.getClass();
        try {
            ((CameraManager) this.b).openCamera(str, new xy1(executor, stateCallback), ((x22) this.c).b);
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        }
    }

    public void J(qee qeeVar, yy1 yy1Var) {
        s22 s22Var;
        x22 x22Var = (x22) this.c;
        synchronized (x22Var.a) {
            try {
                s22Var = (s22) x22Var.a.get(yy1Var);
                if (s22Var == null) {
                    s22Var = new s22(qeeVar, yy1Var);
                    x22Var.a.put(yy1Var, s22Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ((CameraManager) this.b).registerAvailabilityCallback(s22Var, x22Var.b);
    }

    public void K(EGLDisplay eGLDisplay) throws GlUtil$GlException {
        switch (this.a) {
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                ArrayList arrayList = (ArrayList) this.c;
                for (int i = 0; i < arrayList.size(); i++) {
                    guf.l((EGLContext) arrayList.get(i), eGLDisplay);
                }
                break;
            default:
                EGLContext eGLContext = (EGLContext) this.c;
                if (eGLContext != null) {
                    guf.l(eGLContext, eGLDisplay);
                    break;
                }
                break;
        }
    }

    public void L(int i, int i2, int i3, int i4) {
        CardView cardView = (CardView) this.c;
        cardView.d.set(i, i2, i3, i4);
        Rect rect = cardView.c;
        super/*android.view.View*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable M(Drawable drawable, boolean z) {
        if (drawable instanceof h6i) {
            ((i6i) ((h6i) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = M(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                    layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
                    layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
                    layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
                    layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
                    layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
                    layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
                    layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
                    layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
                    layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.c) == null) {
                    this.c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public sfg N(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = (int[]) this.b;
            if (i2 >= iArr.length) {
                a8i.g("BaseMediaChunkOutput", "Unmatched track of type: " + i);
                return new jx4();
            }
            if (i == iArr[i2]) {
                return ((hxd[]) this.c)[i2];
            }
            i2++;
        }
    }

    public void O(CameraManager.AvailabilityCallback availabilityCallback) {
        s22 s22Var;
        if (availabilityCallback != null) {
            x22 x22Var = (x22) this.c;
            synchronized (x22Var.a) {
                s22Var = (s22) x22Var.a.remove(availabilityCallback);
            }
        } else {
            s22Var = null;
        }
        if (s22Var != null) {
            synchronized (s22Var.c) {
                s22Var.d = true;
            }
        }
        ((CameraManager) this.b).unregisterAvailabilityCallback(s22Var);
    }

    @Override // defpackage.rn6, defpackage.v2f
    public void a(Object obj) {
        switch (this.a) {
            case 9:
                ((ez1) this.c).w0.remove((p52) this.b);
                int iV = az1.v(((ez1) this.c).R0);
                if (iV != 1 && iV != 4) {
                    if (iV == 5 || (iV == 6 && ((ez1) this.c).u0 != 0)) {
                        ((ez1) this.c).t("Camera reopen required. Checking if the current camera can be closed safely.", null);
                    }
                }
                if (((ez1) this.c).w0.isEmpty()) {
                    ez1 ez1Var = (ez1) this.c;
                    if (ez1Var.t0 != null) {
                        ez1Var.t("closing camera", null);
                        ((ez1) this.c).t0.close();
                        ((ez1) this.c).t0 = null;
                        break;
                    }
                }
                break;
            default:
                ((bs8) this.c).a(obj);
                break;
        }
    }

    @Override // defpackage.rk3, defpackage.bs8
    public void b() {
        rk3 rk3Var = (rk3) this.b;
        try {
            ((gu3) ((ik3) this.c).c).accept(null);
            rk3Var.b();
        } catch (Throwable th) {
            raj.c(th);
            rk3Var.onError(th);
        }
    }

    @Override // defpackage.rk3, defpackage.bs8
    public void c(py4 py4Var) {
        switch (this.a) {
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((rk3) this.b).c(py4Var);
                break;
            default:
                ty4.d((qu1) this.b, py4Var);
                break;
        }
    }

    @Override // defpackage.lf7
    public void close() {
        ((vd) this.b).close();
    }

    @Override // defpackage.w57
    public xmb d() {
        return new py0(((w57) this.b).d(), 16, (List) this.c);
    }

    @Override // defpackage.lf7
    public jf7 e() {
        return y(((vd) this.b).e());
    }

    @Override // defpackage.lf7
    public int f() {
        return ((vd) this.b).f();
    }

    @Override // defpackage.lf7
    public void g() {
        ((vd) this.b).g();
    }

    @Override // defpackage.lf7
    public int getHeight() {
        return ((vd) this.b).getHeight();
    }

    @Override // defpackage.lf7
    public Surface getSurface() {
        return ((vd) this.b).getSurface();
    }

    @Override // defpackage.lf7
    public int getWidth() {
        return ((vd) this.b).getWidth();
    }

    @Override // defpackage.vx5
    public void h(File file) {
        hl4 hl4VarG = jl4.g((jl4) this.c, file);
        if (hl4VarG == null || hl4VarG.b != ".cnt") {
            return;
        }
        ((ArrayList) this.b).add(new gl4(file, hl4VarG.c));
    }

    @Override // defpackage.lf7
    public void i(kf7 kf7Var, Executor executor) {
        ((vd) this.b).i(new z9a(this, 2, kf7Var), executor);
    }

    @Override // defpackage.vx5
    public void j(File file) {
    }

    @Override // defpackage.vx5
    public void k(File file) {
    }

    @Override // defpackage.w57
    public xmb l(q57 q57Var, i57 i57Var) {
        return new py0(((w57) this.b).l(q57Var, i57Var), 16, (List) this.c);
    }

    @Override // defpackage.lf7
    public int m() {
        return ((vd) this.b).m();
    }

    @Override // defpackage.lf7
    public jf7 n() {
        return y(((vd) this.b).n());
    }

    @Override // defpackage.rk3, defpackage.bs8
    public void onError(Throwable th) {
        switch (this.a) {
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                try {
                    ((gu3) ((ik3) this.c).c).accept(th);
                } catch (Throwable th2) {
                    raj.c(th2);
                    th = new CompositeException(th, th2);
                }
                ((rk3) this.b).onError(th);
                break;
            default:
                ((bs8) this.c).onError(th);
                break;
        }
    }

    @Override // defpackage.rn6
    public void onFailure(Throwable th) {
    }

    public cp1 p(x20 x20Var) {
        cp1 cp1Var;
        Object objD;
        HashMap map = (HashMap) this.c;
        cp1 cp1Var2 = (cp1) map.get((eje) x20Var.b);
        if (cp1Var2 == null && x20Var.a) {
            cp1Var = null;
        } else {
            eje ejeVar = (eje) x20Var.b;
            pmb pmbVar = (pmb) x20Var.c;
            if (cp1Var2 == null || (objD = cp1Var2.b) == null) {
                objD = "";
            }
            if (pmbVar.q()) {
                objD = pmbVar.d();
            }
            String str = (String) objD;
            pmb pmbVar2 = (pmb) x20Var.d;
            Object objValueOf = Boolean.valueOf(cp1Var2 != null ? cp1Var2.c : false);
            if (pmbVar2.q()) {
                objValueOf = pmbVar2.d();
            }
            boolean zBooleanValue = ((Boolean) objValueOf).booleanValue();
            List list = cp1Var2 != null ? cp1Var2.d : null;
            List listT = (List) ((pmb) x20Var.e).t();
            List list2 = (List) ((pmb) x20Var.f).t();
            List list3 = (List) ((pmb) x20Var.g).t();
            if (listT == null) {
                Collection collectionH0 = list3 != null ? ue3.h0(list3) : rd5.a;
                if (list2 == null) {
                    list2 = hd5.a;
                }
                listT = list != null ? ue3.T(ue3.S(list, collectionH0), list2) : ue3.S(list2, collectionH0);
            }
            List list4 = listT;
            pmb pmbVar3 = (pmb) x20Var.h;
            Object objValueOf2 = Integer.valueOf(cp1Var2 != null ? cp1Var2.e : 0);
            if (pmbVar3.q()) {
                objValueOf2 = pmbVar3.d();
            }
            int iIntValue = ((Number) objValueOf2).intValue();
            pmb pmbVar4 = (pmb) x20Var.i;
            Object objD2 = cp1Var2 != null ? cp1Var2.f : null;
            if (pmbVar4.q()) {
                objD2 = pmbVar4.d();
            }
            ti1 ti1Var = (ti1) objD2;
            pmb pmbVar5 = (pmb) x20Var.j;
            Object objD3 = cp1Var2 != null ? cp1Var2.g : null;
            if (pmbVar5.q()) {
                objD3 = pmbVar5.d();
            }
            cp1Var = new cp1(iIntValue, ti1Var, ejeVar, (Long) objD3, str, list4, zBooleanValue);
            map.put(ejeVar, cp1Var);
        }
        if (cp1Var == null) {
            return null;
        }
        ((qf1) this.b).f.onRoomUpdated(new ip1(cp1Var.a, exi.e(cp1Var)));
        return cp1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0090 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map q(org.json.JSONObject r11) {
        /*
            r10 = this;
            java.lang.String r0 = "featuresPerRole"
            org.json.JSONObject r11 = r11.optJSONObject(r0)
            if (r11 != 0) goto Lb
            id5 r11 = defpackage.id5.a
            return r11
        Lb:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r1 = r11.keys()
        L14:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L99
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            u81 r3 = defpackage.q85.q(r2)
            if (r3 != 0) goto L36
            java.lang.Object r3 = r10.c
            y6d r3 = (defpackage.y6d) r3
            java.lang.String r4 = "warning: unknown feature: "
            java.lang.String r2 = r4.concat(r2)
            java.lang.String r4 = "CallFeatureNotificationHandler"
            r3.log(r4, r2)
            goto L14
        L36:
            org.json.JSONArray r2 = r11.optJSONArray(r2)
            if (r2 != 0) goto L3f
            rd5 r2 = defpackage.rd5.a
            goto L94
        L3f:
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            int r5 = r2.length()
            r6 = 0
        L49:
            if (r6 >= r5) goto L93
            java.lang.String r7 = r2.optString(r6)
            if (r7 != 0) goto L52
            goto L90
        L52:
            int r8 = r7.hashCode()
            r9 = -1290540065(0xffffffffb313ebdf, float:-3.4440628E-8)
            if (r8 == r9) goto L7e
            r9 = 62130991(0x3b40b2f, float:1.0582017E-36)
            if (r8 == r9) goto L72
            r9 = 1746537484(0x681a0c0c, float:2.9098667E24)
            if (r8 == r9) goto L66
            goto L86
        L66:
            java.lang.String r8 = "CREATOR"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L6f
            goto L86
        L6f:
            wi1 r7 = defpackage.wi1.a
            goto L8a
        L72:
            java.lang.String r8 = "ADMIN"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L7b
            goto L86
        L7b:
            wi1 r7 = defpackage.wi1.b
            goto L8a
        L7e:
            java.lang.String r8 = "SPEAKER"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L88
        L86:
            r7 = 0
            goto L8a
        L88:
            wi1 r7 = defpackage.wi1.c
        L8a:
            if (r7 != 0) goto L8d
            goto L90
        L8d:
            r4.add(r7)
        L90:
            int r6 = r6 + 1
            goto L49
        L93:
            r2 = r4
        L94:
            r0.put(r3, r2)
            goto L14
        L99:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xo8.q(org.json.JSONObject):java.util.Map");
    }

    public void r() {
        HashMap map = (HashMap) this.c;
        List listD0 = ue3.d0(map.keySet());
        map.clear();
        Iterator it = listD0.iterator();
        while (it.hasNext()) {
            ((qf1) this.b).f.onRoomRemoved(new hp1((eje) it.next()));
        }
    }

    @Override // defpackage.hw8
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public cy o(gw8 gw8Var) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        cy cyVar;
        String str = gw8Var.a.a;
        cy cyVar2 = null;
        try {
            String strValueOf = String.valueOf(str);
            lfi.a(strValueOf.length() != 0 ? "createCodec:".concat(strValueOf) : new String("createCodec:"));
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                cyVar = new cy(mediaCodecCreateByCodecName, (HandlerThread) ((ay) this.b).get(), (HandlerThread) ((ay) this.c).get());
            } catch (Exception e) {
                e = e;
            }
            try {
                lfi.c();
                cy.a(cyVar, gw8Var.b, gw8Var.d, gw8Var.e);
                return cyVar;
            } catch (Exception e2) {
                e = e2;
                cyVar2 = cyVar;
                if (cyVar2 != null) {
                    cyVar2.release();
                } else if (mediaCodecCreateByCodecName != null) {
                    mediaCodecCreateByCodecName.release();
                }
                throw e;
            }
        } catch (Exception e3) {
            e = e3;
            mediaCodecCreateByCodecName = null;
        }
    }

    public tu6 t(int i, int i2, int i3) throws GlUtil$GlException {
        switch (this.a) {
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                int[] iArr = new int[1];
                GLES20.glGenFramebuffers(1, iArr, 0);
                guf.d();
                GLES20.glBindFramebuffer(36160, iArr[0]);
                guf.d();
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
                guf.d();
                return new tu6(i, iArr[0], i2, i3);
            default:
                return ((xo8) this.b).t(i, i2, i3);
        }
    }

    public y87 u(a97 a97Var) {
        try {
            Duration duration = (Duration) Optional.ofNullable(((v87) this.b).a).orElse(w87.a);
            String str = a97Var.a;
            int i = a97Var.b;
            v87 v87Var = (v87) this.b;
            y87 y87Var = new y87(str, i, duration, v87Var, v87Var.b, v87Var.c);
            if (!Optional.ofNullable(null).isPresent()) {
                return y87Var;
            }
            long jLongValue = ((Long) Optional.ofNullable(null).get()).longValue();
            ysc yscVar = (ysc) y87Var.f;
            if (jLongValue < PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
                yscVar.getClass();
                throw new IllegalArgumentException("Receiver buffer size must be at least 1024");
            }
            if (jLongValue > yscVar.T0.d) {
                throw new IllegalArgumentException("Bidirectional stream buffer size cannot be larger than connection buffer size");
            }
            if (yscVar.A0 == 1) {
                yscVar.T0.f = jLongValue;
                return y87Var;
            }
            if (yscVar.A0 != 3) {
                throw new IllegalStateException("Cannot change setting while connection is being established or closed");
            }
            llf llfVar = yscVar.O0;
            jr3 jr3Var = llfVar.f;
            llfVar.f = new kr3(jr3Var.e(), jr3Var.h(), jr3Var.b(), jr3Var.f(), jr3Var.d(), jr3Var.g(), jr3Var.c(), jLongValue);
            return y87Var;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public EGLContext v(EGLDisplay eGLDisplay, int i, int[] iArr) throws GlUtil$GlException {
        switch (this.a) {
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                EGLContext eGLContextI = guf.i((EGLContext) this.b, eGLDisplay, i, iArr);
                ((ArrayList) this.c).add(eGLContextI);
                return eGLContextI;
            default:
                if (((EGLContext) this.c) == null) {
                    this.c = ((xo8) this.b).v(eGLDisplay, i, iArr);
                }
                return (EGLContext) this.c;
        }
    }

    public EGLSurface w(EGLDisplay eGLDisplay, Object obj, int i, boolean z) throws GlUtil$GlException {
        int[] iArr;
        switch (this.a) {
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                int[] iArr2 = guf.e;
                if (i == 3 || i == 10) {
                    iArr = guf.a;
                } else {
                    if (i != 7 && i != 6) {
                        throw new IllegalArgumentException(ho7.f(i, "Unsupported color transfer: "));
                    }
                    iArr = guf.b;
                    if (!z) {
                        if (i == 6) {
                            if (!guf.r()) {
                                throw new GlUtil$GlException("BT.2020 PQ OpenGL output isn't supported.");
                            }
                            iArr2 = guf.c;
                        } else {
                            if (!guf.s("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                                throw new GlUtil$GlException("BT.2020 HLG OpenGL output isn't supported.");
                            }
                            iArr2 = guf.d;
                        }
                    }
                }
                EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, guf.p(eGLDisplay, iArr), obj, iArr2, 0);
                guf.c("Error creating a new EGL surface");
                return eGLSurfaceEglCreateWindowSurface;
            default:
                return ((xo8) this.b).w(eGLDisplay, obj, i, z);
        }
    }

    public EGLSurface x(EGLContext eGLContext, EGLDisplay eGLDisplay) {
        switch (this.a) {
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                break;
            default:
                ((xo8) this.b).getClass();
                break;
        }
        return guf.j(eGLContext, eGLDisplay);
    }

    public jke y(jf7 jf7Var) {
        ryf ryfVar;
        if (jf7Var == null) {
            return null;
        }
        if (((iac) this.c) == null) {
            ryfVar = ryf.b;
        } else {
            iac iacVar = (iac) this.c;
            Pair pair = new Pair(iacVar.g, iacVar.h.get(0));
            ryf ryfVar2 = ryf.b;
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put((String) pair.first, pair.second);
            ryfVar = new ryf(arrayMap);
        }
        this.c = null;
        return new jke(jf7Var, new Size(jf7Var.getWidth(), jf7Var.getHeight()), new s02(new ey2(null, ryfVar, jf7Var.getImageInfo().getTimestamp())));
    }

    public void z(nh4 nh4Var) {
        synchronized (nh4Var) {
        }
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new t50(this, nh4Var, 1));
        }
    }

    public /* synthetic */ xo8(int i, Object obj, boolean z) {
        this.a = i;
        this.b = obj;
        this.c = null;
    }

    public /* synthetic */ xo8(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ xo8(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public xo8(qf1 qf1Var) {
        this.a = 8;
        this.b = qf1Var;
        this.c = new HashMap();
    }

    public xo8(sm6 sm6Var, y6d y6dVar, q85 q85Var, qha qhaVar) {
        this.a = 7;
        this.b = sm6Var;
        this.c = y6dVar;
    }

    public xo8(String str, pai paiVar, qha qhaVar) {
        this.a = 3;
        this.b = str;
        this.c = paiVar;
    }

    public xo8(k18 k18Var) {
        this.a = 0;
        this.b = xo8.class.getName();
        this.c = k18Var;
    }

    public xo8(v87 v87Var) {
        this.a = 21;
        this.b = v87Var;
        this.c = new ConcurrentHashMap();
    }

    public xo8(Context context, x22 x22Var) {
        this.a = 10;
        this.b = (CameraManager) context.getSystemService("camera");
        this.c = x22Var;
    }

    public xo8(int i, byte b) {
        this.a = i;
        switch (i) {
            case LangUtils.HASH_SEED /* 17 */:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.b = byteArrayOutputStream;
                this.c = new DataOutputStream(byteArrayOutputStream);
                break;
            case 22:
                break;
            case 26:
                this.b = new xo8(15, (byte) 0);
                break;
            default:
                this.b = EGL14.EGL_NO_CONTEXT;
                this.c = new ArrayList();
                break;
        }
    }

    public xo8(int i) {
        this.a = 4;
        ay ayVar = new ay(i, 0);
        ay ayVar2 = new ay(i, 2);
        this.b = ayVar;
        this.c = ayVar2;
    }

    public xo8(MediaCodec.CryptoInfo cryptoInfo) {
        this.a = 13;
        this.b = cryptoInfo;
        this.c = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public xo8(Animator animator) {
        this.a = 19;
        this.b = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.play(animator);
    }

    public xo8(jl4 jl4Var) {
        this.a = 14;
        this.c = jl4Var;
        this.b = new ArrayList();
    }

    public xo8(CardView cardView) {
        this.a = 11;
        this.c = cardView;
    }
}
