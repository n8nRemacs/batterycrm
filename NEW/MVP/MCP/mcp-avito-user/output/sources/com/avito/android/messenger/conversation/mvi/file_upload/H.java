package com.avito.android.messenger.conversation.mvi.file_upload;

import Oq.InterfaceC14725a;
import com.avito.android.messenger.analytics.C31667x;
import com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0;
import com.avito.android.messenger.conversation.mvi.file_upload.errors.MessengerFileUriPermissionDenialException;
import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: FileUploadInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class H<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32097u f191027b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC32094s0.a f191028c;

    public H(C32097u c32097u, AbstractC32094s0.a aVar) {
        this.f191027b = c32097u;
        this.f191028c = aVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        if (th2 instanceof SecurityException) {
            InterfaceC14725a.C0808a.a((C31667x) this.f191027b.f191239h.getValue(), new MessengerFileUriPermissionDenialException(th2), null, 6);
        }
        V2.f318762a.c("FileUploadInteractorImpl", "Upload flow for uploadId = " + this.f191028c + " failed with error", th2);
    }
}
