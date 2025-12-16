package com.avito.android.travel_file_download_deeplink.mvi;

import com.avito.android.travel_file_download_deeplink.mvi.entity.FileDownloadInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FileDownloadReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/travel_file_download_deeplink/mvi/u;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/travel_file_download_deeplink/mvi/entity/FileDownloadInternalAction;", "LHE0/c;", "<init>", "()V", "_avito_travel-file-download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class u implements com.avito.android.arch.mvi.u<FileDownloadInternalAction, HE0.c> {
    @Inject
    public u() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final HE0.c a(FileDownloadInternalAction fileDownloadInternalAction, HE0.c cVar) {
        FileDownloadInternalAction fileDownloadInternalAction2 = fileDownloadInternalAction;
        return fileDownloadInternalAction2 instanceof FileDownloadInternalAction.LoadingStarted ? new HE0.c(Long.valueOf(((FileDownloadInternalAction.LoadingStarted) fileDownloadInternalAction2).f301785b)) : cVar;
    }
}
