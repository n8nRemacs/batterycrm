package com.avito.android.advert;

import android.net.Uri;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.toolbar_download.AdvertDetailsDownloadFileInfoResponse;
import com.avito.android.travel_file_download_deeplink.TravelFileDownloadDeeplink;
import kotlin.Metadata;

/* compiled from: AdvertDetailsToolbarPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/toolbar_download/AdvertDetailsDownloadFileInfoResponse;", "result", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/toolbar_download/AdvertDetailsDownloadFileInfoResponse;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class D<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28245z f68538b;

    public D(C28245z c28245z) {
        this.f68538b = c28245z;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        AdvertDetailsDownloadFileInfoResponse advertDetailsDownloadFileInfoResponse = (AdvertDetailsDownloadFileInfoResponse) obj;
        C28245z c28245z = this.f68538b;
        c28245z.getClass();
        b.a.a(c28245z.f81097p, new TravelFileDownloadDeeplink(Uri.parse(advertDetailsDownloadFileInfoResponse.getResult().getUrl()), advertDetailsDownloadFileInfoResponse.getResult().getName(), TravelFileDownloadDeeplink.Action.OPEN, true), null, null, 6);
    }
}
