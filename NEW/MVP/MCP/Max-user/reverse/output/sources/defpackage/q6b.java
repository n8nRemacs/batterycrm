package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.view.MotionEvent;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import one.me.location.map.pick.PickLocationScreen;
import org.apache.http.HttpStatus;

/* loaded from: classes2.dex */
public final class q6b extends FrameLayout implements hw6 {
    public final idi a;
    public final int b;
    public n8g c;
    public n8g d;
    public sy6 o;
    public n8g s0;
    public iw6 t0;
    public String u0;
    public p6b v0;

    public q6b(Context context) {
        super(context);
        this.a = new idi(this, context);
        setClickable(true);
        st4 st4VarO = lcj.o(st4.b);
        this.b = st4VarO != null ? u8j.b(st4VarO) : 1;
    }

    public final void a(final em6 em6Var, final PickLocationScreen pickLocationScreen, final String str) {
        this.u0 = str;
        pva pvaVar = new pva(str, em6Var, pickLocationScreen) { // from class: o6b
            public final /* synthetic */ String b;
            public final /* synthetic */ hn6 c;
            public final /* synthetic */ fw6 d;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.c = (hn6) em6Var;
                this.d = pickLocationScreen;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [em6, hn6] */
            @Override // defpackage.pva
            public final void R(iw6 iw6Var) {
                q6b q6bVar = this.a;
                q6bVar.t0 = iw6Var;
                ulc ulcVarF = iw6Var.f();
                ulcVarF.getClass();
                try {
                    zgi zgiVar = (zgi) ulcVarF.b;
                    Parcel parcelT = zgiVar.T();
                    int i = mgi.a;
                    parcelT.writeInt(0);
                    zgiVar.V(parcelT, 6);
                    iw6Var.h();
                    iw6Var.i();
                    iw6Var.p();
                    iw6Var.f().t(false);
                    try {
                        pni pniVar = iw6Var.a;
                        Parcel parcelT2 = pniVar.T();
                        parcelT2.writeFloat(19.0f);
                        pniVar.V(parcelT2, 93);
                        String str2 = this.b;
                        if (str2 == null || str2.length() == 0) {
                            iw6Var.k(1);
                        } else {
                            iw6Var.k(0);
                            q6bVar.c(a93.s0.x(q6bVar.getContext()).k());
                        }
                        iw6Var.o(q6bVar);
                        iw6Var.m(new nl(q6bVar, this.d, iw6Var, 17));
                        this.c.invoke(iw6Var);
                    } catch (RemoteException e) {
                        throw new RuntimeRemoteException(e);
                    }
                } catch (RemoteException e2) {
                    throw new RuntimeRemoteException(e2);
                }
            }
        };
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("getMapAsync() must be called on the main thread");
        }
        idi idiVar = this.a;
        y38 y38Var = (y38) idiVar.a;
        if (y38Var != null) {
            ((gdi) y38Var).b(pvaVar);
        } else {
            idiVar.g.add(pvaVar);
        }
    }

    public final void b(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            idi idiVar = this.a;
            idiVar.getClass();
            idiVar.w(bundle, new bbi(idiVar, bundle));
            if (((y38) idiVar.a) == null) {
                ds4.u(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final void c(yeb yebVar) {
        n8g n8gVarB;
        String str = this.u0;
        if (str == null) {
            return;
        }
        n8g n8gVar = this.c;
        if (n8gVar != null) {
            n8gVar.a();
        }
        p8g p8gVar = a93.s0.x(getContext()).l() ? oq5.a : pq5.a;
        iw6 iw6Var = this.t0;
        n8g n8gVarB2 = null;
        if (iw6Var != null) {
            o8g o8gVar = new o8g();
            o8gVar.c = 1.0f;
            o8gVar.b(p8gVar);
            o8gVar.d = false;
            o8gVar.b = true;
            n8gVarB = iw6Var.b(o8gVar);
        } else {
            n8gVarB = null;
        }
        this.c = n8gVarB;
        kf3 kf3VarH = yebVar.h();
        kf3 kf3Var = kf3.b;
        int i = this.b;
        if (kf3VarH == kf3Var) {
            n8g n8gVar2 = this.d;
            if (n8gVar2 != null) {
                n8gVar2.a();
            }
            this.d = null;
            iw6 iw6Var2 = this.t0;
            if (iw6Var2 != null) {
                o8g o8gVar2 = new o8g();
                o8gVar2.b = true;
                o8gVar2.b(new x35(str, i, false));
                o8gVar2.d = true;
                o8gVar2.c = Float.MAX_VALUE;
                n8gVarB2 = iw6Var2.b(o8gVar2);
            }
            this.s0 = n8gVarB2;
            return;
        }
        n8g n8gVar3 = this.s0;
        if (n8gVar3 != null) {
            n8gVar3.a();
        }
        this.s0 = null;
        iw6 iw6Var3 = this.t0;
        if (iw6Var3 != null) {
            o8g o8gVar3 = new o8g();
            o8gVar3.b = true;
            o8gVar3.b(new x35(str, i, true));
            o8gVar3.d = true;
            o8gVar3.c = Float.MAX_VALUE;
            n8gVarB2 = iw6Var3.b(o8gVar3);
        }
        this.d = n8gVarB2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        p6b p6bVar;
        Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            p6b p6bVar2 = this.v0;
            if (p6bVar2 != null) {
                PickLocationScreen pickLocationScreen = (PickLocationScreen) p6bVar2;
                ViewPropertyAnimator viewPropertyAnimatorTranslationY = ((ImageView) pickLocationScreen.X.D(pickLocationScreen, PickLocationScreen.v0[3])).animate().translationY(-kti.d(20 * vw4.d().getDisplayMetrics().density));
                y4e y4eVar = y4e.a;
                ViewPropertyAnimator interpolator = viewPropertyAnimatorTranslationY.setInterpolator(((zg) y4eVar.getAccessor().c(HttpStatus.SC_NO_CONTENT)).a.f());
                fs4 fs4Var = ((zg) y4eVar.getAccessor().c(HttpStatus.SC_NO_CONTENT)).a;
                interpolator.setDuration(200L);
            }
        } else if (numValueOf != null && numValueOf.intValue() == 1 && (p6bVar = this.v0) != null) {
            PickLocationScreen pickLocationScreen2 = (PickLocationScreen) p6bVar;
            ViewPropertyAnimator viewPropertyAnimatorTranslationY2 = ((ImageView) pickLocationScreen2.X.D(pickLocationScreen2, PickLocationScreen.v0[3])).animate().translationY(0.0f);
            y4e y4eVar2 = y4e.a;
            ViewPropertyAnimator interpolator2 = viewPropertyAnimatorTranslationY2.setInterpolator(((zg) y4eVar2.getAccessor().c(HttpStatus.SC_NO_CONTENT)).a.f());
            fs4 fs4Var2 = ((zg) y4eVar2.getAccessor().c(HttpStatus.SC_NO_CONTENT)).a;
            interpolator2.setDuration(200L);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setOnMapTouchListener(p6b p6bVar) {
        this.v0 = p6bVar;
    }
}
