package com.avito.android.advert.item.leadauto;

import androidx.compose.runtime.internal.P;
import androidx.view.C22981N;
import androidx.view.N0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.advert_details.consultation_auto.AutoNewCarsLeadForm;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;

/* compiled from: AutoNewCarsLeadFormItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/leadauto/d;", "Lcom/avito/android/advert/item/leadauto/c;", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements c {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f77271f = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.leadauto.viewmodel.c f77272b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f77273c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.advert.l f77274d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final R0 f77275e;

    /* compiled from: AutoNewCarsLeadFormItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/advert/item/leadauto/d$a;", "", "<init>", "()V", "", "AUTO_FORM_LEAD_FROM_PAGE", "Ljava/lang/String;", "BUTTON_NAME_PHONE", "BUTTON_NAME_SENT_FORM", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public d(@Y61.k com.avito.android.advert.item.leadauto.viewmodel.c cVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.advert_core.advert.l lVar, @Y61.k R0 r02) {
        this.f77272b = cVar;
        this.f77273c = interfaceC28373a;
        this.f77274d = lVar;
        this.f77275e = r02;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        n nVar = (n) eVar;
        AutoNewCarsLeadFormItem autoNewCarsLeadFormItem = (AutoNewCarsLeadFormItem) aVar;
        C43259k.d(N0.a(this.f77272b), this.f77275e.a(), null, new e(this, null), 2);
        C43259k.d(C22981N.a(this.f77274d.e().getLifecycle()), null, null, new f(this, nVar, null), 3);
        AutoNewCarsLeadForm autoNewCarsLeadForm = autoNewCarsLeadFormItem.f77258e;
        nVar.b(autoNewCarsLeadForm.getTitle());
        nVar.j(autoNewCarsLeadForm.getSubtitle());
        nVar.Jm(autoNewCarsLeadForm.getIcon());
        nVar.Y0(autoNewCarsLeadForm.getSubmitButtonText(), new g(this, autoNewCarsLeadFormItem, nVar));
        nVar.in(autoNewCarsLeadForm.getCallToActionText());
        nVar.iN(autoNewCarsLeadForm.getUserAgreement());
        nVar.Z60(new h(this, autoNewCarsLeadFormItem));
    }
}
