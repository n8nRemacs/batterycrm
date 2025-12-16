package com.avito.android.user_adverts.tab_screens.adverts.dataProvider;

import Y61.k;
import com.avito.android.personal_banner.feature.domain.model.BannerContext;
import com.avito.android.user_adverts.tab_screens.adverts.F;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import nE.C44240b;

/* compiled from: UserAdvertsListBannerContextInfoProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/dataProvider/a;", "Lcom/avito/android/personal_banner/feature/domain/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements com.avito.android.personal_banner.feature.domain.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC42726C<F> f314927b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC42726C<C44240b> f314928c;

    /* JADX WARN: Multi-variable type inference failed */
    public a(InterfaceC42726C<F> interfaceC42726C, InterfaceC42726C<? extends C44240b> interfaceC42726C2) {
        this.f314927b = interfaceC42726C;
        this.f314928c = interfaceC42726C2;
    }

    @Override // com.avito.android.personal_banner.feature.domain.a
    @k
    public final InterfaceC43160i<BannerContext> A7() {
        F value = this.f314927b.getValue();
        return this.f314928c.getValue().v().invoke().booleanValue() ? C43175k.r(new c(C43175k.s(value.getState(), e.f314944l))) : C43175k.r(new d(new b(value.getState())));
    }
}
