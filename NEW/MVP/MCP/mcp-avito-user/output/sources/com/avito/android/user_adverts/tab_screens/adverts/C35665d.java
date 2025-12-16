package com.avito.android.user_adverts.tab_screens.adverts;

import androidx.view.N0;
import com.avito.android.personal_banner.feature.mvi.entity.BannerState;
import kotlin.G0;
import kotlin.InterfaceC40047a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserAdvertListViewBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/personal_banner/feature/mvi/entity/BannerState$BannerData$Content;", "bannerData", "Lkotlin/G0;", "emit", "(Lcom/avito/android/personal_banner/feature/mvi/entity/BannerState$BannerData$Content;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.user_adverts.tab_screens.adverts.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C35665d<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C35662a f314926b;

    public C35665d(C35662a c35662a) {
        this.f314926b = c35662a;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        C35662a c35662a = this.f314926b;
        InterfaceC40047a.e eVar = new InterfaceC40047a.e(((BannerState.BannerData.Content) obj).f215642b, c35662a.f314907g);
        j jVar = c35662a.f314904d;
        jVar.getClass();
        C43259k.d(N0.a(jVar), null, null, new k(jVar, eVar, null), 3);
        return G0.f406611a;
    }
}
