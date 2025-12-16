package com.google.common.util.concurrent;

import com.google.common.util.concurrent.G0;
import com.google.common.util.concurrent.J0;
import com.google.common.util.concurrent.Service;

/* compiled from: AbstractService.java */
@XY0.c
@InterfaceC37531b0
@XY0.d
/* renamed from: com.google.common.util.concurrent.l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC37550l implements Service {

    /* renamed from: a, reason: collision with root package name */
    public final J0 f360622a = new J0();

    /* renamed from: b, reason: collision with root package name */
    public volatile h f360623b;

    /* compiled from: AbstractService.java */
    /* renamed from: com.google.common.util.concurrent.l$a */
    public class a implements G0.a<Service.a> {
        public final String toString() {
            return "starting()";
        }
    }

    /* compiled from: AbstractService.java */
    /* renamed from: com.google.common.util.concurrent.l$b */
    public class b implements G0.a<Service.a> {
        public final String toString() {
            return "running()";
        }
    }

    /* compiled from: AbstractService.java */
    /* renamed from: com.google.common.util.concurrent.l$c */
    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f360624a;

        static {
            int[] iArr = new int[Service.State.values().length];
            f360624a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f360624a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f360624a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f360624a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f360624a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f360624a[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: AbstractService.java */
    /* renamed from: com.google.common.util.concurrent.l$d */
    public final class d extends J0.a {
    }

    /* compiled from: AbstractService.java */
    /* renamed from: com.google.common.util.concurrent.l$e */
    public final class e extends J0.a {
    }

    /* compiled from: AbstractService.java */
    /* renamed from: com.google.common.util.concurrent.l$f */
    public final class f extends J0.a {
    }

    /* compiled from: AbstractService.java */
    /* renamed from: com.google.common.util.concurrent.l$g */
    public final class g extends J0.a {
    }

    /* compiled from: AbstractService.java */
    /* renamed from: com.google.common.util.concurrent.l$h */
    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final Service.State f360625a;

        public h(Service.State state, @I41.a Throwable th2) {
            com.google.common.base.M.h((th2 != null) == (state == Service.State.f360542c), "A failure cause should be set if and only if the state is failed.  Got %s and %s instead.", state, th2);
            this.f360625a = state;
        }
    }

    static {
        new a();
        new b();
    }

    public AbstractC37550l() {
        new e(this.f360622a);
        new f(this.f360622a);
        new d(this.f360622a);
        new g(this.f360622a);
        new G0();
        this.f360623b = new h(Service.State.f360541b, null);
    }

    public final Service.State a() {
        h hVar = this.f360623b;
        hVar.getClass();
        return hVar.f360625a;
    }

    public String toString() {
        return getClass().getSimpleName() + " [" + a() + "]";
    }
}
