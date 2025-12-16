package zp;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.konveyor.item_visibility_tracker.b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MortgageBannerItemFilter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzp/g;", "LWV0/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g extends WV0.a {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC50602a f444249e;

    @Inject
    public g(@k InterfaceC50602a interfaceC50602a) {
        super(true, true, 0.001f, 1L);
        this.f444249e = interfaceC50602a;
    }

    @Override // WV0.a
    public final boolean a(@k b.InterfaceC10495b interfaceC10495b) {
        return interfaceC10495b instanceof com.avito.android.comfortable_deal.deal.item.mortgage.c;
    }

    @Override // WV0.a
    public final void b(int i12, @k b.InterfaceC10495b interfaceC10495b) {
        this.f444249e.b(((com.avito.android.comfortable_deal.deal.item.mortgage.c) interfaceC10495b).f121434c);
    }
}
