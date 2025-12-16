package com.avito.android.advert.item.select.parameters_v3;

import android.view.View;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.InterfaceC22532u2;
import com.avito.android.advert.item.select.parameters_v3.AutoSelectParametersV3Item;
import com.avito.android.advert.item.select.parameters_v3.y;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;

/* compiled from: AutoSelectParametersV3View.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/select/parameters_v3/E;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/select/parameters_v3/z;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class E extends com.avito.konveyor.adapter.b implements z {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f79555f = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super DeepLink, G0> f79556b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super String, G0> f79557c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Y41.p<? super String, ? super String, G0> f79558d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Z1<y> f79559e;

    /* compiled from: AutoSelectParametersV3View.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(51961999, new D(E.this), a13), a13, 48, 1);
            }
            return G0.f406611a;
        }
    }

    public E(@Y61.k View view) {
        super(view);
        ComposeView composeView = (ComposeView) view;
        this.f79559e = p2.a(null);
        composeView.setViewCompositionStrategy(InterfaceC22532u2.b.f41609b);
        composeView.setContent(new C22096n(-532966326, new a(), true));
    }

    public final void B80(String str) {
        Z1<y> z12 = this.f79559e;
        y value = z12.getValue();
        if (value == null) {
            return;
        }
        z12.K5(y.a(value, com.avito.android.advert.item.select.number_input.f.a(value.f79628e, str, false, 58)));
        Y41.l<? super String, G0> lVar = this.f79557c;
        if (lVar != null) {
            ((f) lVar).invoke(str);
        }
    }

    @Override // com.avito.android.advert.item.select.parameters_v3.z
    public final void D6() {
        Z1<y> z12 = this.f79559e;
        y value = z12.getValue();
        if (value == null) {
            return;
        }
        z12.K5(y.a(value, com.avito.android.advert.item.select.number_input.f.a(value.f79628e, null, true, 59)));
    }

    @Override // com.avito.android.advert.item.select.parameters_v3.z
    public final void Mb(@Y61.k String str) {
        y value = this.f79559e.getValue();
        if (value != null && value.f79628e.f79521a.length() == 0) {
            B80(str);
        }
    }

    @Override // com.avito.android.advert.item.select.parameters_v3.z
    public final void py(@Y61.k AutoSelectParametersV3Item autoSelectParametersV3Item, @Y61.k Y41.l<? super DeepLink, G0> lVar, @Y61.k Y41.l<? super String, G0> lVar2, @Y61.k Y41.p<? super String, ? super String, G0> pVar) {
        List<AutoSelectParametersV3Item.Advantage> list = autoSelectParametersV3Item.f79533c;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (AutoSelectParametersV3Item.Advantage advantage : list) {
            arrayList.add(new y.a(advantage.f79545b, advantage.f79546c, advantage.f79547d));
        }
        AutoSelectParametersV3Item.Badge badge = autoSelectParametersV3Item.f79535e;
        y yVar = new y(autoSelectParametersV3Item.f79532b, autoSelectParametersV3Item.f79534d, arrayList, badge != null ? new y.b(badge.f79549b, badge.f79551d, badge.f79550c, badge.f79552e) : null, new com.avito.android.advert.item.select.number_input.f("", false, autoSelectParametersV3Item.f79536f, autoSelectParametersV3Item.f79537g, autoSelectParametersV3Item.f79538h));
        this.f79556b = lVar;
        this.f79557c = lVar2;
        this.f79558d = pVar;
        this.f79559e.K5(yVar);
    }
}
