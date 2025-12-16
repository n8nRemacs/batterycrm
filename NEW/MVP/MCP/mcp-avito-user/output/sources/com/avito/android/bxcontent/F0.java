package com.avito.android.bxcontent;

import com.avito.android.progress_info_toast_bar.ProgressInfoToastBarData;
import kotlin.Metadata;

/* compiled from: BxContentPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/progress_info_toast_bar/ProgressInfoToastBarData;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/progress_info_toast_bar/ProgressInfoToastBarData;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class F0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C29253t0 f109323b;

    public F0(C29253t0 c29253t0) {
        this.f109323b = c29253t0;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        ProgressInfoToastBarData progressInfoToastBarData = (ProgressInfoToastBarData) obj;
        Y0 y02 = this.f109323b.f112948S;
        if (y02 != null) {
            y02.ia(progressInfoToastBarData);
        }
    }
}
