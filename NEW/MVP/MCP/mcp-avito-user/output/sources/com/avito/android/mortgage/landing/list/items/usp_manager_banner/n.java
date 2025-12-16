package com.avito.android.mortgage.landing.list.items.usp_manager_banner;

import Y41.p;
import android.view.View;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.platform.ComposeView;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;

/* compiled from: UspManagerBannerView.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0005²\u0006\u000e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/usp_manager_banner/n;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/mortgage/landing/list/items/usp_manager_banner/k;", "Lcom/avito/android/mortgage/landing/list/items/usp_manager_banner/UspManagerBannerItem;", "item", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class n extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Z1<UspManagerBannerItem> f200054b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super DeepLink, G0> f200055c;

    /* compiled from: UspManagerBannerView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<A, Integer, G0> {
        public a() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                n nVar = n.this;
                UspManagerBannerItem uspManagerBannerItem = (UspManagerBannerItem) C22126m3.b(nVar.f200054b, a13).getF42167b();
                if (uspManagerBannerItem != null) {
                    com.akita.compose.theme.re23.c.a(false, r.c(1267095259, new m(uspManagerBannerItem, nVar), a13), a13, 48, 1);
                }
            }
            return G0.f406611a;
        }
    }

    public n(@Y61.k View view) {
        super(view);
        this.f200054b = p2.a(null);
        ((ComposeView) view).setContent(new C22096n(-851487989, new a(), true));
    }

    @Override // com.avito.android.mortgage.landing.list.items.usp_manager_banner.k
    public final void O2(@Y61.k Y41.l<? super DeepLink, G0> lVar) {
        this.f200055c = lVar;
    }

    @Override // com.avito.android.mortgage.landing.list.items.usp_manager_banner.k
    public final void mF(@Y61.k UspManagerBannerItem uspManagerBannerItem) {
        this.f200054b.K5(uspManagerBannerItem);
    }
}
