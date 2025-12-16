package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class odh extends FrameLayout implements TextureView.SurfaceTextureListener {
    public static final /* synthetic */ yy7[] C0 = {new z8a(odh.class, "videoShape", "getVideoShape()Lone/me/sdk/media/player/view/VideoView$VideoShape;"), u45.h(vid.a, odh.class, "videoContentMode", "getVideoContentMode()Lone/me/sdk/media/player/view/VideoView$VideoContentMode;")};
    public static final e8a D0;
    public final ndh A0;
    public final Path B0;
    public final String a;
    public final k18 b;
    public final k18 c;
    public mdh d;
    public Surface o;
    public SurfaceTexture s0;
    public final a3h t0;
    public hdh u0;
    public int v0;
    public int w0;
    public int x0;
    public final int[] y0;
    public final ndh z0;

    static {
        int i = n26.a;
        e8a e8aVar = new e8a(2);
        e8aVar.a(90.0f);
        e8aVar.a(-90.0f);
        D0 = e8aVar;
    }

    public odh(Context context) {
        super(context);
        this.a = odh.class.getName();
        v3c v3cVar = v3c.a;
        this.b = v3cVar.getAccessor().d(46);
        this.c = v3cVar.getAccessor().d(48);
        pe8 pe8Var = (pe8) getClientPrefs();
        a3h a3hVar = null;
        if (((Boolean) pe8Var.S0.D(pe8Var, pe8.U0[32])).booleanValue() && ((gu5) getFeaturePrefs()).r()) {
            a3h a3hVar2 = new a3h(context, null, 0);
            z2h z2hVar = new z2h(context);
            a3hVar2.a = z2hVar;
            a3hVar2.addView(z2hVar, -2, -2);
            addView(a3hVar2);
            a3hVar2.setTranslationZ(1.0f);
            a3hVar = a3hVar2;
        }
        this.t0 = a3hVar;
        this.y0 = new int[2];
        this.z0 = new ndh(this, 0);
        this.A0 = new ndh(this, 1);
        this.B0 = new Path();
    }

    private final pb3 getClientPrefs() {
        return (pb3) this.b.getValue();
    }

    private final rt5 getFeaturePrefs() {
        return (rt5) this.c.getValue();
    }

    public final void a(hdh hdhVar) {
        lg8 lg8Var = lg8.d;
        String str = this.a;
        l6b l6bVar = wqi.a;
        if (l6bVar != null && l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, str, xc0.f("Video view. Bind listener and create surface, has listener:", hdhVar != null), null);
        }
        this.u0 = hdhVar;
        this.x0 = hdhVar != null ? hdhVar.B() : 0;
        d();
        if (this.d == null) {
            mdh mdhVar = new mdh(this, getContext());
            mdhVar.setSurfaceTextureListener(this);
            addView(mdhVar);
            this.d = mdhVar;
            return;
        }
        String str2 = this.a;
        l6b l6bVar2 = wqi.a;
        if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
            l6bVar2.c(lg8Var, str2, xc0.f("Video view. Already has texture, has surface:", this.o != null), null);
        }
        Surface surface = this.o;
        if (surface == null || hdhVar == null) {
            return;
        }
        hdhVar.J(surface, this.t0);
    }

    public final void b() {
        this.u0 = null;
        this.x0 = 0;
        this.v0 = 0;
        this.w0 = 0;
        a3h a3hVar = this.t0;
        if (a3hVar != null) {
            a3hVar.a.setPlayer(null);
        }
        mdh mdhVar = this.d;
        if (mdhVar != null) {
            mdhVar.setSurfaceTextureListener(null);
            removeView(mdhVar);
            this.d = null;
        }
        Surface surface = this.o;
        if (surface != null) {
            surface.release();
        }
        this.o = null;
        SurfaceTexture surfaceTexture = this.s0;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.s0 = null;
    }

    public final void c(int i, int i2, boolean z) {
        if (z) {
            int i3 = this.x0;
            boolean z2 = i > 0 && i2 > 0;
            boolean z3 = getMeasuredWidth() > 0 && getMeasuredHeight() > 0;
            if (z2 && z3 && i3 != 0) {
                kt ktVar = new kt(getMeasuredWidth(), getMeasuredHeight(), 8);
                kt ktVar2 = new kt(i, i2, 8);
                Matrix matrix = new Matrix();
                matrix.postConcat(d9j.a(ktVar2, ktVar, i3));
                mdh mdhVar = this.d;
                if (mdhVar != null) {
                    mdhVar.setTransform(matrix);
                }
                this.v0 = i;
                this.w0 = i2;
            }
        } else {
            this.v0 = i;
            this.w0 = i2;
            requestLayout();
        }
        mdh mdhVar2 = this.d;
        if (mdhVar2 != null) {
            mdhVar2.setVisibility((this.v0 <= 0 || this.w0 <= 0) ? 4 : 0);
        }
    }

    public final void d() {
        hdh hdhVar = this.u0;
        int iM = hdhVar != null ? hdhVar.m() : 0;
        hdh hdhVar2 = this.u0;
        c(iM, hdhVar2 != null ? hdhVar2.F() : 0, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Path path = this.B0;
        if (path.isEmpty()) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipPath(path);
        try {
            super.dispatchDraw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, k18] */
    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean zIsInstance;
        Class<?> cls = canvas.getClass();
        if (Build.VERSION.SDK_INT >= 29) {
            Object obj = v42.a;
            zIsInstance = c5.s(canvas);
        } else {
            zIsInstance = ((Class) v42.a.getValue()).isInstance(canvas);
        }
        return (zIsInstance || cls.equals(Canvas.class)) && super.drawChild(canvas, view, j);
    }

    public final idh getVideoContentMode() {
        yy7 yy7Var = C0[1];
        return (idh) this.A0.b;
    }

    public final ldh getVideoShape() {
        yy7 yy7Var = C0[0];
        return (ldh) this.z0.b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int[] iArr;
        int[] iArr2;
        if (this.v0 <= 0 || this.w0 <= 0) {
            super.onMeasure(i, i2);
        } else {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            int iOrdinal = getVideoContentMode().ordinal();
            if (iOrdinal == 0) {
                e8a e8aVar = D0;
                float rotation = getRotation();
                float[] fArr = e8aVar.a;
                int i3 = e8aVar.b;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        int i5 = this.v0;
                        int i6 = this.w0;
                        iArr = this.y0;
                        nqi.a(size, size2, i5, i6, iArr);
                        break;
                    }
                    if (fArr[i4] == rotation) {
                        int i7 = this.v0;
                        int i8 = this.w0;
                        iArr = this.y0;
                        nqi.a(size2, size, i7, i8, iArr);
                        break;
                    }
                    i4++;
                }
                iArr2 = iArr;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                iArr2 = this.y0;
                iArr2[0] = size;
                iArr2[1] = size2;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iArr2[0], 1073741824), View.MeasureSpec.makeMeasureSpec(iArr2[1], 1073741824));
            c(this.v0, this.w0, true);
        }
        ldh videoShape = getVideoShape();
        if (videoShape == null || getMeasuredWidth() <= 0 || getMeasuredHeight() <= 0) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.B0.reset();
        if (!(videoShape instanceof jdh)) {
            if (!(videoShape instanceof kdh)) {
                throw new NoWhenBranchMatchedException();
            }
            this.B0.addRoundRect(0.0f, 0.0f, measuredWidth, measuredHeight, ((kdh) videoShape).a, Path.Direction.CW);
        } else {
            if (measuredWidth == measuredHeight) {
                float f = measuredWidth / 2.0f;
                this.B0.addCircle(f, measuredHeight / 2.0f, f, Path.Direction.CW);
                return;
            }
            String str = this.a;
            l6b l6bVar = wqi.a;
            if (l6bVar == null) {
                return;
            }
            lg8 lg8Var = lg8.X;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, ho7.g("VideoShape.AsCircle requires square dimensions but got width=", measuredWidth, measuredHeight, ", height="), null);
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        String str = this.a;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "Video view. Surface available " + surfaceTexture + ", has listener:" + (this.u0 != null), null);
            }
        }
        Surface surface = this.o;
        if (surface != null) {
            surface.release();
        }
        this.o = null;
        SurfaceTexture surfaceTexture2 = this.s0;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
        }
        this.s0 = surfaceTexture;
        this.o = new Surface(surfaceTexture);
        d();
        hdh hdhVar = this.u0;
        if (hdhVar != null) {
            hdhVar.J(this.o, this.t0);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        d();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void setVideoContentMode(idh idhVar) {
        this.A0.O(this, C0[1], idhVar);
    }

    public final void setVideoShape(ldh ldhVar) {
        this.z0.O(this, C0[0], ldhVar);
    }
}
