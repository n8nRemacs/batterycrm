package com.avito.android.travel_file_download_deeplink.di;

import Y41.l;
import Y61.k;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.travel_file_download_deeplink.FileDownloadActivity;
import com.avito.android.travel_file_download_deeplink.FileDownloadOpenParams;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: FileDownloadComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/travel_file_download_deeplink/di/b;", "", "a", "_avito_travel-file-download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
@h31.d
/* loaded from: classes4.dex */
public interface b {

    /* compiled from: FileDownloadComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_file_download_deeplink/di/b$a;", "", "_avito_travel-file-download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@k InterfaceC39417a interfaceC39417a, @k e eVar, @h31.b @k C28478k c28478k, @h31.b @k l lVar, @h31.b @k FileDownloadOpenParams fileDownloadOpenParams);
    }

    void a(@k FileDownloadActivity fileDownloadActivity);
}
