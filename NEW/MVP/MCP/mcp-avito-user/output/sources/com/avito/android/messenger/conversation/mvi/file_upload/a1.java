package com.avito.android.messenger.conversation.mvi.file_upload;

import Oq.InterfaceC14725a;
import com.avito.android.messenger.conversation.mvi.file_upload.errors.MessengerFailedToStartUploadException;
import kotlin.Metadata;

/* compiled from: VideoUploadInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class a1<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32104x0 f191115b;

    public a1(C32104x0 c32104x0) {
        this.f191115b = c32104x0;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        InterfaceC14725a.C0808a.a(this.f191115b.f191327f, new MessengerFailedToStartUploadException((Throwable) obj), null, 6);
    }
}
