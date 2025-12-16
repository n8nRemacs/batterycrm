package Oa1;

import Oa1.AbstractC14665y;
import kotlin.G0;

/* renamed from: Oa1.w, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C14663w {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f12394c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final C14658q f12395a;

    /* renamed from: b, reason: collision with root package name */
    public final C14662v f12396b;

    public C14663w(C14658q c14658q, C14662v c14662v) {
        this.f12395a = c14658q;
        this.f12396b = c14662v;
    }

    public final void a() {
        synchronized (f12394c) {
            while (true) {
                try {
                    AbstractC14665y abstractC14665yA = this.f12396b.a();
                    if (kotlin.jvm.internal.L.f(abstractC14665yA, AbstractC14665y.a.f12398a)) {
                        G0 g02 = G0.f406611a;
                    } else if (abstractC14665yA instanceof AbstractC14665y.b) {
                        this.f12395a.a(((AbstractC14665y.b) abstractC14665yA).f12399a);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
