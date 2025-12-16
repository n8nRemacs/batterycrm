package com.avito.android.mortgage.person_form.list.items.suggestion_banner;

import Y41.p;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.ComposeView;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;

/* compiled from: SuggestionBannerView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/suggestion_banner/k;", "LC00/a;", "Lcom/avito/android/mortgage/person_form/list/items/suggestion_banner/i;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k extends C00.a implements i {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Z1<List<String>> f200807b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Z1<List<String>> f200808c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public Y41.a<G0> f200809d;

    /* compiled from: SuggestionBannerView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<A, Integer, G0> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                k kVar = k.this;
                InterfaceC22204y1 interfaceC22204y1B = C22126m3.b(kVar.f200807b, a13);
                InterfaceC22204y1 interfaceC22204y1B2 = C22126m3.b(kVar.f200808c, a13);
                a13.C(-222054820);
                Object objT = a13.t();
                A.f37866a.getClass();
                if (objT == A.a.f37868b) {
                    objT = new j(kVar);
                    a13.H(objT);
                }
                a13.h();
                h.a(interfaceC22204y1B, interfaceC22204y1B2, (Y41.a) objT, a13, 384);
            }
            return G0.f406611a;
        }
    }

    public k(@Y61.k View view) {
        super(view);
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.f200807b = p2.a(c42784z0);
        this.f200808c = p2.a(c42784z0);
        ((ComposeView) view).setContent(new C22096n(-210213350, new a(), true));
    }

    @Override // com.avito.android.mortgage.person_form.list.items.suggestion_banner.i
    public final void LP(@Y61.k List<String> list) {
        this.f200807b.K5(list);
    }

    @Override // com.avito.android.mortgage.person_form.list.items.suggestion_banner.i
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f200809d = aVar;
    }

    @Override // com.avito.android.mortgage.person_form.list.items.suggestion_banner.i
    public final void ae(@Y61.k List<String> list) {
        this.f200808c.K5(list);
    }
}
