package androidx.view.compose;

import Y61.k;
import androidx.compose.runtime.snapshots.D;
import androidx.view.C23395u;
import androidx.view.InterfaceC22979L;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import kotlin.Metadata;

/* compiled from: DialogHost.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/lifecycle/P;", "<anonymous parameter 0>", "Landroidx/lifecycle/Lifecycle$Event;", "event", "Lkotlin/G0;", "<anonymous>", "(Landroidx/lifecycle/P;Landroidx/lifecycle/Lifecycle$Event;)V"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.navigation.compose.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C23345k implements InterfaceC22979L {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f52966b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D f52967c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C23395u f52968d;

    public C23345k(D d12, C23395u c23395u, boolean z12) {
        this.f52966b = z12;
        this.f52967c = d12;
        this.f52968d = c23395u;
    }

    @Override // androidx.view.InterfaceC22979L
    public final void HH(@k InterfaceC22983P interfaceC22983P, @k Lifecycle.Event event) {
        C23395u c23395u = this.f52968d;
        boolean z12 = this.f52966b;
        D d12 = this.f52967c;
        if (z12 && !d12.contains(c23395u)) {
            d12.add(c23395u);
        }
        if (event == Lifecycle.Event.ON_START && !d12.contains(c23395u)) {
            d12.add(c23395u);
        }
        if (event == Lifecycle.Event.ON_STOP) {
            d12.remove(c23395u);
        }
    }
}
