package androidx.view;

import Y61.k;
import androidx.view.Lifecycle;
import kotlin.Metadata;

/* compiled from: CompositeGeneratedAdaptersObserver.jvm.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/h;", "Landroidx/lifecycle/L;", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23039h implements InterfaceC22979L {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC23075z[] f46800b;

    public C23039h(@k InterfaceC23075z[] interfaceC23075zArr) {
        this.f46800b = interfaceC23075zArr;
    }

    @Override // androidx.view.InterfaceC22979L
    public final void HH(@k InterfaceC22983P interfaceC22983P, @k Lifecycle.Event event) {
        new C23036f0();
        InterfaceC23075z[] interfaceC23075zArr = this.f46800b;
        for (InterfaceC23075z interfaceC23075z : interfaceC23075zArr) {
            interfaceC23075z.a();
        }
        for (InterfaceC23075z interfaceC23075z2 : interfaceC23075zArr) {
            interfaceC23075z2.a();
        }
    }
}
