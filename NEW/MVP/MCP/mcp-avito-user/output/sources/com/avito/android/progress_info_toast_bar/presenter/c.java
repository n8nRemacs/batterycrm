package com.avito.android.progress_info_toast_bar.presenter;

import com.avito.android.progress_info_toast_bar.presenter.ProgressInfoToastBarPresenter;
import com.avito.android.remote.model.AdvertDetails;
import kotlin.Metadata;
import l41.o;

/* compiled from: ProgressInfoToastBarPresenterImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/progress_info_toast_bar/presenter/ProgressInfoToastBarPresenter$RequestData;", "it", "Lcom/avito/android/remote/model/AdvertDetails;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class c<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProgressInfoToastBarPresenter.RequestData f231573b;

    public c(ProgressInfoToastBarPresenter.RequestData requestData) {
        this.f231573b = requestData;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        String locationId = ((AdvertDetails) obj).getLocationId();
        ProgressInfoToastBarPresenter.RequestData requestData = this.f231573b;
        return new ProgressInfoToastBarPresenter.RequestData(requestData.f231544b, requestData.f231545c, locationId, requestData.f231547e, requestData.f231548f, requestData.f231549g);
    }
}
