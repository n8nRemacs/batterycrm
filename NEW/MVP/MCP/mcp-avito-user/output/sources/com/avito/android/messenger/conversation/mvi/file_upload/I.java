package com.avito.android.messenger.conversation.mvi.file_upload;

import com.avito.android.persistence.messenger.Q1;
import com.avito.android.persistence.messenger.TransferStatus;
import kotlin.Metadata;

/* compiled from: FileUploadInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/persistence/messenger/Q1;", "messageMetaInfo", "", "test", "(Lcom/avito/android/persistence/messenger/Q1;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class I<T> implements l41.r {

    /* renamed from: b, reason: collision with root package name */
    public static final I<T> f191034b = new I<>();

    @Override // l41.r
    public final boolean test(Object obj) {
        TransferStatus transferStatus = TransferStatus.SUCCESS;
        TransferStatus transferStatus2 = ((Q1) obj).f215288g;
        return transferStatus2 == transferStatus || transferStatus2 == TransferStatus.ERROR;
    }
}
