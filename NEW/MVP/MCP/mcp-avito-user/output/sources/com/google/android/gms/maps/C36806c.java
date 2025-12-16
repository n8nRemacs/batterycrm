package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.maps.zzt;
import com.google.android.gms.maps.model.C36824h;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import dY0.InterfaceC39647b;
import dY0.q0;
import tg.C48666a;

/* renamed from: com.google.android.gms.maps.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36806c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC39647b f354354a;

    /* renamed from: b, reason: collision with root package name */
    public C36826n f354355b;

    /* renamed from: com.google.android.gms.maps.c$a */
    public interface a {
    }

    /* renamed from: com.google.android.gms.maps.c$b */
    public interface b {
    }

    @Deprecated
    /* renamed from: com.google.android.gms.maps.c$c, reason: collision with other inner class name */
    public interface InterfaceC10634c {
    }

    /* renamed from: com.google.android.gms.maps.c$d */
    public interface d {
    }

    /* renamed from: com.google.android.gms.maps.c$e */
    public interface e {
    }

    /* renamed from: com.google.android.gms.maps.c$f */
    public interface f {
    }

    /* renamed from: com.google.android.gms.maps.c$g */
    public interface g {
    }

    /* renamed from: com.google.android.gms.maps.c$h */
    public interface h {
    }

    /* renamed from: com.google.android.gms.maps.c$i */
    public interface i {
    }

    /* renamed from: com.google.android.gms.maps.c$j */
    public interface j {
    }

    /* renamed from: com.google.android.gms.maps.c$k */
    public interface k {
    }

    /* renamed from: com.google.android.gms.maps.c$l */
    public interface l {
    }

    /* renamed from: com.google.android.gms.maps.c$m */
    public interface m {
    }

    /* renamed from: com.google.android.gms.maps.c$n */
    public interface n {
    }

    /* renamed from: com.google.android.gms.maps.c$o */
    public interface o {
    }

    /* renamed from: com.google.android.gms.maps.c$p */
    public interface p {
    }

    /* renamed from: com.google.android.gms.maps.c$q */
    public interface q {
    }

    /* renamed from: com.google.android.gms.maps.c$r */
    public interface r {
    }

    /* renamed from: com.google.android.gms.maps.c$s */
    public interface s {
    }

    @Deprecated
    /* renamed from: com.google.android.gms.maps.c$t */
    public interface t {
    }

    /* renamed from: com.google.android.gms.maps.c$u */
    public interface u {
    }

    /* renamed from: com.google.android.gms.maps.c$v */
    public interface v {
    }

    /* renamed from: com.google.android.gms.maps.c$w */
    public interface w {
    }

    /* renamed from: com.google.android.gms.maps.c$x */
    public interface x {
    }

    /* renamed from: com.google.android.gms.maps.c$y */
    public interface y {
    }

    /* renamed from: com.google.android.gms.maps.c$z */
    public static final class z extends q0 {
        @Override // dY0.p0
        public final void onCancel() {
            throw null;
        }

        @Override // dY0.p0
        public final void s0() {
            throw null;
        }
    }

    public C36806c(InterfaceC39647b interfaceC39647b) {
        C36729v.j(interfaceC39647b);
        this.f354354a = interfaceC39647b;
    }

    public final C36824h a(MarkerOptions markerOptions) {
        try {
            zzt zztVarC0 = this.f354354a.c0(markerOptions);
            if (zztVarC0 != null) {
                return new C36824h(zztVarC0);
            }
            return null;
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    public final void b(C36804a c36804a) {
        try {
            this.f354354a.W(c36804a.f354352a);
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    public final CameraPosition c() {
        try {
            return this.f354354a.getCameraPosition();
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    public final C36812i d() {
        try {
            return new C36812i(this.f354354a.h());
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    public final void e(C36804a c36804a) {
        try {
            this.f354354a.y1(c36804a.f354352a);
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    public final void f(@j.P C48666a c48666a) {
        try {
            this.f354354a.J1(new Y(c48666a));
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    public final void g(@j.P C48666a c48666a) {
        try {
            this.f354354a.r2(new V(c48666a));
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    public final void h(@j.P C48666a c48666a) {
        try {
            this.f354354a.n(new Z(c48666a));
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    public final void i(@j.P C48666a c48666a) {
        try {
            this.f354354a.G1(new B(c48666a));
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }
}
