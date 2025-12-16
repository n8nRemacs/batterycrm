package com.avito.android.messenger.conversation.mvi.file_upload.worker;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: FileUploadException.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_upload/worker/b;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b extends Throwable {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f191279b;

    public b(@Y61.l String str) {
        this.f191279b = str;
    }

    @Override // java.lang.Throwable
    @Y61.l
    public final String getMessage() {
        return this.f191279b;
    }
}
