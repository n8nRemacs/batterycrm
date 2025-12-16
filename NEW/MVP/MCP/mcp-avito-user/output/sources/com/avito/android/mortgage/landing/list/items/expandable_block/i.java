package com.avito.android.mortgage.landing.list.items.expandable_block;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.mortgage.landing.analytics.r;
import com.avito.android.mortgage.landing.model.LandingArguments;
import com.avito.konveyor.item_visibility_tracker.b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ExpandableBlockVisibilityTracker.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/expandable_block/i;", "LWV0/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i extends WV0.a {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC28373a f199713e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final LandingArguments f199714f;

    @Inject
    public i(@k InterfaceC28373a interfaceC28373a, @k LandingArguments landingArguments) {
        super(true, false, 0.001f, 1L);
        this.f199713e = interfaceC28373a;
        this.f199714f = landingArguments;
    }

    @Override // WV0.a
    public final boolean a(@k b.InterfaceC10495b interfaceC10495b) {
        return interfaceC10495b instanceof ExpandableBlockItem;
    }

    @Override // WV0.a
    public final void b(int i12, @k b.InterfaceC10495b interfaceC10495b) {
        String str = this.f199714f.f200082v;
        if (str == null) {
            str = "new_landing";
        }
        this.f199713e.c(new r(str));
    }
}
