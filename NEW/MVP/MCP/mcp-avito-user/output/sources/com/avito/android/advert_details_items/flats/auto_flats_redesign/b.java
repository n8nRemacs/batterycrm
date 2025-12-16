package com.avito.android.advert_details_items.flats.auto_flats_redesign;

import Y41.p;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.InterfaceC22532u2;
import com.avito.android.R;
import com.avito.android.advert_core.advert.AdvertDetailsFlatViewType;
import com.avito.android.remote.model.AdvertParameters;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsFlatTwoColumnWithDots.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/flats/auto_flats_redesign/b;", "Lcom/avito/android/advert_core/advert/j;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements com.avito.android.advert_core.advert.j {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final com.avito.android.advert_core.advert.k f84677a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ComposeView f84678b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1<Integer> f84679c;

    /* compiled from: AdvertDetailsFlatTwoColumnWithDots.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ List<AdvertParameters.Parameter> f84680l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f84681m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ b f84682n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<AdvertParameters.Parameter> list, boolean z12, b bVar) {
            super(2);
            this.f84680l = list;
            this.f84681m = z12;
            this.f84682n = bVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                com.akita.compose.theme.re23.c.a(false, r.c(-1031116187, new com.avito.android.advert_details_items.flats.auto_flats_redesign.a(this.f84680l, this.f84681m, this.f84682n), a13), a13, 48, 1);
            }
            return G0.f406611a;
        }
    }

    public b(@Y61.k View view, @l com.avito.android.advert_core.advert.k kVar) {
        this.f84677a = kVar;
        View viewFindViewById = view.findViewById(R.id.flat_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.ComposeView");
        }
        ComposeView composeView = (ComposeView) viewFindViewById;
        this.f84678b = composeView;
        this.f84679c = C22126m3.g(null);
        composeView.setViewCompositionStrategy(InterfaceC22532u2.e.f41618b);
    }

    @Override // com.avito.android.advert_core.advert.j
    public final void a(@l List<AdvertParameters.Parameter> list, @Y61.k AdvertDetailsFlatViewType advertDetailsFlatViewType, boolean z12) {
        this.f84678b.setContent(new C22096n(506380618, new a(list, z12, this), true));
    }

    @Override // com.avito.android.advert_core.advert.j
    public final void b(int i12) {
        ((C22082i3) this.f84679c).setValue(Integer.valueOf(i12));
    }
}
