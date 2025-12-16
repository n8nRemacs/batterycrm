package com.avito.android.travel_file_download_deeplink;

import Y61.k;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FileDownloadIntentFactory.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_file_download_deeplink/e;", "Lcom/avito/android/travel_file_download_deeplink/d;", "_avito_travel-file-download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f301763a;

    @Inject
    public e(@k Context context) {
        this.f301763a = context;
    }

    @Override // com.avito.android.travel_file_download_deeplink.d
    @k
    public final Intent a(@k Uri uri, @k String str) {
        FileDownloadOpenParams fileDownloadOpenParams = new FileDownloadOpenParams(uri, str);
        FileDownloadActivity.f301654q.getClass();
        return new Intent(this.f301763a, (Class<?>) FileDownloadActivity.class).putExtra("file_download_open_params_key", fileDownloadOpenParams);
    }
}
