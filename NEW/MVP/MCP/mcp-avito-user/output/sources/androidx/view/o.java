package androidx.view;

import androidx.view.n;
import i.AbstractC41201a;
import java.io.Serializable;

/* compiled from: ComponentActivity.java */
/* loaded from: classes.dex */
class o implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21231b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC41201a.C11360a f21232c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n.b f21233d;

    public o(n.b bVar, int i12, AbstractC41201a.C11360a c11360a) {
        this.f21233d = bVar;
        this.f21231b = i12;
        this.f21232c = c11360a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Serializable serializable = this.f21232c.f398324a;
        this.f21233d.a(this.f21231b, serializable);
    }
}
