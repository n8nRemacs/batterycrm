package gv;

import Y61.k;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23487e;
import androidx.view.T0;
import kotlin.Metadata;

/* compiled from: FragmentDeeplinkHandlerParent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgv/d;", "Lgv/c;", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements InterfaceC40741c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Fragment f396945a;

    public d(@k Fragment fragment) {
        this.f396945a = fragment;
    }

    @Override // gv.InterfaceC40741c
    @k
    public final InterfaceC23487e a() {
        return this.f396945a;
    }

    @Override // gv.InterfaceC40741c
    @k
    public final InterfaceC22983P b() {
        Fragment fragment = this.f396945a;
        return fragment.getView() == null ? fragment : fragment.getViewLifecycleOwner();
    }

    @Override // gv.InterfaceC40741c
    @k
    public final T0 c() {
        return this.f396945a;
    }
}
