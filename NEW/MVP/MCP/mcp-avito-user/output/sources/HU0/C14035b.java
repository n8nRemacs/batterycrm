package Hu0;

import Y61.k;
import Y61.l;
import android.content.Intent;
import com.avito.android.L;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.service_orders.ServiceOrdersArguments;
import com.avito.android.service_orders.ServiceOrdersTabFragmentData;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServiceOrdersIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHu0/b;", "LHu0/a;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Hu0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14035b implements InterfaceC14034a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final L f7807a;

    @Inject
    public C14035b(@k L l12) {
        this.f7807a = l12;
    }

    @Override // Hu0.InterfaceC14034a
    @k
    public final Intent a(@l String str, boolean z12) {
        return this.f7807a.d(new ServiceOrdersTabFragmentData(NavigationTab.f106974j, new ServiceOrdersArguments(z12, str)));
    }
}
