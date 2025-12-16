package com.avito.android.advert.item.select.no_click_contact;

import android.view.View;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.InterfaceC22532u2;
import com.avito.android.advert.item.select.no_click_contact.AutoSelectNoClickContactItem;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;

/* compiled from: AutoSelectNoClickContactView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/select/no_click_contact/y;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/select/no_click_contact/t;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class y extends com.avito.konveyor.adapter.b implements t {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f79498f = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super DeepLink, G0> f79499b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super String, G0> f79500c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Y41.p<? super String, ? super String, G0> f79501d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Z1<s> f79502e;

    /* compiled from: AutoSelectNoClickContactView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<A, Integer, G0> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(1307763180, new x(y.this), a13), a13, 48, 1);
            }
            return G0.f406611a;
        }
    }

    public y(@Y61.k View view) {
        super(view);
        ComposeView composeView = (ComposeView) view;
        this.f79502e = p2.a(null);
        composeView.setViewCompositionStrategy(InterfaceC22532u2.b.f41609b);
        composeView.setContent(new C22096n(443323857, new a(), true));
    }

    public final void B80(String str) {
        Z1<s> z12 = this.f79502e;
        s value = z12.getValue();
        if (value == null) {
            return;
        }
        z12.K5(s.a(value, com.avito.android.advert.item.select.number_input.f.a(value.f79494d, str, false, 58)));
        Y41.l<? super String, G0> lVar = this.f79500c;
        if (lVar != null) {
            ((f) lVar).invoke(str);
        }
    }

    @Override // com.avito.android.advert.item.select.no_click_contact.t
    public final void D6() {
        Z1<s> z12 = this.f79502e;
        s value = z12.getValue();
        if (value == null) {
            return;
        }
        z12.K5(s.a(value, com.avito.android.advert.item.select.number_input.f.a(value.f79494d, null, true, 59)));
    }

    @Override // com.avito.android.advert.item.select.no_click_contact.t
    public final void Mb(@Y61.k String str) {
        s value = this.f79502e.getValue();
        if (value != null && value.f79494d.f79521a.length() == 0) {
            B80(str);
        }
    }

    @Override // com.avito.android.advert.item.select.no_click_contact.t
    public final void s30(@Y61.k AutoSelectNoClickContactItem autoSelectNoClickContactItem, @Y61.k Y41.l<? super DeepLink, G0> lVar, @Y61.k Y41.l<? super String, G0> lVar2, @Y61.k Y41.p<? super String, ? super String, G0> pVar) {
        AutoSelectNoClickContactItem.NoClickContactCard noClickContactCard = autoSelectNoClickContactItem.f79425c;
        AutoSelectNoClickContactItem.NoClickContactCard noClickContactCard2 = new AutoSelectNoClickContactItem.NoClickContactCard(noClickContactCard.f79437b, noClickContactCard.f79438c);
        AutoSelectNoClickContactItem.NoClickContactCard noClickContactCard3 = autoSelectNoClickContactItem.f79426d;
        s sVar = new s(autoSelectNoClickContactItem.f79424b, noClickContactCard2, new AutoSelectNoClickContactItem.NoClickContactCard(noClickContactCard3.f79437b, noClickContactCard3.f79438c), new com.avito.android.advert.item.select.number_input.f("", false, autoSelectNoClickContactItem.f79427e, autoSelectNoClickContactItem.f79428f, autoSelectNoClickContactItem.f79429g));
        this.f79499b = lVar;
        this.f79500c = lVar2;
        this.f79501d = pVar;
        this.f79502e.K5(sVar);
    }
}
