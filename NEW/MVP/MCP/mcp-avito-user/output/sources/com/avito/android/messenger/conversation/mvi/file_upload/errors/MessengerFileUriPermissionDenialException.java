package com.avito.android.messenger.conversation.mvi.file_upload.errors;

import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: MessengerFileUriPermissionDenialException.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_upload/errors/MessengerFileUriPermissionDenialException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MessengerFileUriPermissionDenialException extends Exception {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Throwable f191147b;

    public MessengerFileUriPermissionDenialException(@l Throwable th2) {
        this.f191147b = th2;
    }

    @Override // java.lang.Throwable
    @l
    public final Throwable getCause() {
        return this.f191147b;
    }
}
