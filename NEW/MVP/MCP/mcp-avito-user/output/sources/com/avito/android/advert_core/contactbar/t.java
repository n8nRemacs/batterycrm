package com.avito.android.advert_core.contactbar;

import com.avito.android.C29640d;
import com.avito.android.progress_info_toast_bar.presenter.ProgressInfoToastBarPresenter;
import com.avito.android.remote.model.CategoryIds;
import com.avito.android.remote.model.advert_details.ContactBarData;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: AdvertContactsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class t extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C28266e f83245l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(C28266e c28266e) {
        super(1);
        this.f83245l = c28266e;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        C28266e c28266e = this.f83245l;
        ContactBarData contactBarData = c28266e.f83169M;
        boolean zF2 = L.f(contactBarData != null ? contactBarData.getCategoryId() : null, CategoryIds.AUTO.TRUCKS.getId());
        ProgressInfoToastBarPresenter progressInfoToastBarPresenter = c28266e.f83210p;
        SourceScreen sourceScreen = c28266e.f83203k;
        if (zF2 && sourceScreen == SourceScreen.f83145c) {
            C29640d c29640d = c28266e.f83199i;
            c29640d.getClass();
            kotlin.reflect.n<Object> nVar = C29640d.f132175X[17];
            if (((Boolean) c29640d.f132215r.a().invoke()).booleanValue()) {
                ProgressInfoToastBarPresenter.RequestData.a aVar = ProgressInfoToastBarPresenter.RequestData.f231543h;
                String advertId = contactBarData.getAdvertId();
                String strA = c28266e.f83191e.a();
                if (strA == null) {
                    strA = "";
                }
                aVar.getClass();
                progressInfoToastBarPresenter.c(io.reactivex.rxjava3.core.q.i(new ProgressInfoToastBarPresenter.RequestData(advertId, "", "", strA, ProgressInfoToastBarPresenter.RequestType.f231551c, null, 32, null)));
            }
        }
        if (L.f(contactBarData != null ? contactBarData.getCategoryId() : null, "111") && sourceScreen == SourceScreen.f83145c) {
            progressInfoToastBarPresenter.c(io.reactivex.rxjava3.core.q.i(ProgressInfoToastBarPresenter.RequestData.a.a(ProgressInfoToastBarPresenter.RequestData.f231543h, contactBarData.getAdvertId(), contactBarData.getAdvertTitle(), contactBarData.getLocationId())));
        }
        return G0.f406611a;
    }
}
