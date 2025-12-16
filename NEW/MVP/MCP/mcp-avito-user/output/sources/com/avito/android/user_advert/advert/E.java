package com.avito.android.user_advert.advert;

import com.avito.android.personal_banner.feature.mvi.entity.BannerState;
import kotlin.InterfaceC40047a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MyAdvertDetailsActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/personal_banner/feature/mvi/entity/BannerState$BannerData$Content;", "bannerData", "Lkotlin/G0;", "emit", "(Lcom/avito/android/personal_banner/feature/mvi/entity/BannerState$BannerData$Content;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class E<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MyAdvertDetailsActivity f308228b;

    public E(MyAdvertDetailsActivity myAdvertDetailsActivity) {
        this.f308228b = myAdvertDetailsActivity;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        int i12 = MyAdvertDetailsActivity.f308263Q0;
        MyAdvertDetailsActivity myAdvertDetailsActivity = this.f308228b;
        C35453u c35453u = (C35453u) myAdvertDetailsActivity.f308273E0.getValue();
        C43259k.d(androidx.view.N0.a(c35453u), null, null, new C35455v(c35453u, new InterfaceC40047a.e(((BannerState.BannerData.Content) obj).f215642b, myAdvertDetailsActivity.f308277G0), null), 3);
        return kotlin.G0.f406611a;
    }
}
