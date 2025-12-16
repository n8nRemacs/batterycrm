package com.avito.android.progress_info_toast_bar.presenter;

import com.avito.android.progress_info_toast_bar.presenter.ProgressInfoToastBarPresenter;
import kotlin.Metadata;

/* compiled from: ProgressInfoToastBarPresenterImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/progress_info_toast_bar/presenter/ProgressInfoToastBarPresenter$RequestData;", "data", "Lkotlin/G0;", "accept", "(Lcom/avito/android/progress_info_toast_bar/presenter/ProgressInfoToastBarPresenter$RequestData;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class e<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f231575b;

    public e(b bVar) {
        this.f231575b = bVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        ProgressInfoToastBarPresenter.RequestData requestData = (ProgressInfoToastBarPresenter.RequestData) obj;
        this.f231575b.f231566h = requestData;
        if (!this.f231575b.f231567i || this.f231575b.f231565g) {
            return;
        }
        this.f231575b.f(requestData);
    }
}
