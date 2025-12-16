package com.avito.android.advert_core.contactbar;

import com.avito.android.progress_info_toast_bar.ProgressInfoToastBarData;
import kotlin.Metadata;

/* compiled from: AdvertContactsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/progress_info_toast_bar/ProgressInfoToastBarData;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/progress_info_toast_bar/ProgressInfoToastBarData;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class r<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28266e f83243b;

    public r(C28266e c28266e) {
        this.f83243b = c28266e;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        ProgressInfoToastBarData progressInfoToastBarData = (ProgressInfoToastBarData) obj;
        com.avito.android.advert_core.advert.c cVar = this.f83243b.f83171O;
        if (cVar != null) {
            cVar.ia(progressInfoToastBarData);
        }
    }
}
