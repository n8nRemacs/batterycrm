package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.work.impl.C23550e;
import androidx.work.impl.model.C23580w;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: WorkTimer.java */
@RestrictTo
/* loaded from: classes10.dex */
public class S {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f55969e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final C23550e f55970a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f55971b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f55972c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Object f55973d = new Object();

    /* compiled from: WorkTimer.java */
    @RestrictTo
    public interface a {
        void a(@j.N C23580w c23580w);
    }

    /* compiled from: WorkTimer.java */
    @RestrictTo
    public static class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final S f55974b;

        /* renamed from: c, reason: collision with root package name */
        public final C23580w f55975c;

        public b(@j.N S s5, @j.N C23580w c23580w) {
            this.f55974b = s5;
            this.f55975c = c23580w;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.f55974b.f55973d) {
                try {
                    if (((b) this.f55974b.f55971b.remove(this.f55975c)) != null) {
                        a aVar = (a) this.f55974b.f55972c.remove(this.f55975c);
                        if (aVar != null) {
                            aVar.a(this.f55975c);
                        }
                    } else {
                        androidx.work.G gA2 = androidx.work.G.a();
                        Objects.toString(this.f55975c);
                        gA2.getClass();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    static {
        androidx.work.G.b("WorkTimer");
    }

    public S(@j.N C23550e c23550e) {
        this.f55970a = c23550e;
    }

    public final void a(@j.N C23580w c23580w) {
        synchronized (this.f55973d) {
            try {
                if (((b) this.f55971b.remove(c23580w)) != null) {
                    androidx.work.G gA2 = androidx.work.G.a();
                    Objects.toString(c23580w);
                    gA2.getClass();
                    this.f55972c.remove(c23580w);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
