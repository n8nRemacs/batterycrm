package com.avito.android.travel_file_download_deeplink.mvi;

import HE0.b;
import com.avito.android.travel_file_download_deeplink.FileDownloadResult;
import com.avito.android.travel_file_download_deeplink.mvi.entity.FileDownloadInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FileDownloadOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/travel_file_download_deeplink/mvi/s;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/travel_file_download_deeplink/mvi/entity/FileDownloadInternalAction;", "LHE0/b;", "<init>", "()V", "_avito_travel-file-download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class s implements com.avito.android.arch.mvi.t<FileDownloadInternalAction, HE0.b> {
    @Inject
    public s() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final HE0.b b(FileDownloadInternalAction fileDownloadInternalAction) {
        FileDownloadInternalAction fileDownloadInternalAction2 = fileDownloadInternalAction;
        if (fileDownloadInternalAction2 instanceof FileDownloadInternalAction.CloseWithResult) {
            return new b.a(((FileDownloadInternalAction.CloseWithResult) fileDownloadInternalAction2).f301783b);
        }
        if (fileDownloadInternalAction2 instanceof FileDownloadInternalAction.LoadingFailed) {
            return new b.a(FileDownloadResult.Failed.f301669b);
        }
        if (fileDownloadInternalAction2 instanceof FileDownloadInternalAction.LoadingSuccess) {
            return new b.a(new FileDownloadResult.Success(((FileDownloadInternalAction.LoadingSuccess) fileDownloadInternalAction2).f301786b));
        }
        return null;
    }
}
