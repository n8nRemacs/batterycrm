package com.avito.android.messenger.conversation.mvi.file_upload;

import com.avito.android.persistence.messenger.TransferStatus;
import kotlin.Metadata;

/* compiled from: FileUploadInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "status", "Lcom/avito/android/persistence/messenger/TransferStatus;", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class B<T> implements l41.r {

    /* renamed from: b, reason: collision with root package name */
    public static final B<T> f190991b = new B<>();

    @Override // l41.r
    public final boolean test(Object obj) {
        TransferStatus transferStatus = (TransferStatus) obj;
        return transferStatus == TransferStatus.SUCCESS || transferStatus == TransferStatus.ERROR;
    }
}
