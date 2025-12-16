package com.avito.android.advert_core.body_condition;

import com.avito.android.account.E;
import com.avito.android.advert_core.analytics.body_condition.FromPage;
import com.avito.android.advert_core.body_condition.f;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.BodyCondition;
import com.avito.android.remote.model.AdvertParameters;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsCarBodyConditionPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/body_condition/i;", "Lcom/avito/android/advert_core/body_condition/f;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final c f83041b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f83042c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final E f83043d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Object f83044e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f83045f;

    @Inject
    public i(@Y61.k c cVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k E e12) {
        this.f83041b = cVar;
        this.f83042c = interfaceC28373a;
        this.f83043d = e12;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        String schemeLinkTitle;
        String title;
        k kVar = (k) eVar;
        AdvertDetailsCarBodyConditionItem advertDetailsCarBodyConditionItem = (AdvertDetailsCarBodyConditionItem) aVar;
        if (advertDetailsCarBodyConditionItem.f83029f == FromPage.f82800c && !this.f83045f) {
            this.f83042c.c(new j8.b(advertDetailsCarBodyConditionItem.f83028e, this.f83043d.a()));
            this.f83045f = true;
        }
        BodyCondition bodyCondition = advertDetailsCarBodyConditionItem.f83027d;
        if (bodyCondition != null && (title = bodyCondition.getTitle()) != null) {
            kVar.setTitle(title);
        }
        if (bodyCondition != null && (schemeLinkTitle = bodyCondition.getSchemeLinkTitle()) != null) {
            kVar.rN(schemeLinkTitle);
        }
        List<AdvertParameters.Parameter> listA = this.f83041b.a(bodyCondition);
        if (listA != null) {
            kVar.setParameters(listA);
        }
        kVar.a(new h(advertDetailsCarBodyConditionItem, this));
    }

    @Override // com.avito.android.advert_core.body_condition.f
    public final void c0() {
        this.f83044e = null;
    }

    @Override // com.avito.android.advert_core.body_condition.f
    public final void z6(@Y61.k f.a aVar) {
        this.f83044e = aVar;
    }
}
