package com.avito.android.messenger.conversation.mvi.file_upload;

import Oq.InterfaceC14725a;
import com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0;
import com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32098u0;
import com.avito.android.messenger.conversation.mvi.file_upload.errors.MessengerFileUriPermissionDenialException;
import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: VideoUploadInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_upload/u0$a;", "result", "Lkotlin/G0;", "accept", "(Lcom/avito/android/messenger/conversation/mvi/file_upload/u0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class e1<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32104x0 f191144b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC32094s0.a f191145c;

    public e1(C32104x0 c32104x0, AbstractC32094s0.a aVar) {
        this.f191144b = c32104x0;
        this.f191145c = aVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        InterfaceC32098u0.a aVar = (InterfaceC32098u0.a) obj;
        boolean z12 = aVar instanceof InterfaceC32098u0.a.b;
        C32104x0 c32104x0 = this.f191144b;
        if (z12) {
            c32104x0.f191331j.a("upload.succeeded");
            return;
        }
        if (aVar instanceof InterfaceC32098u0.a.C5650a) {
            Throwable th2 = ((InterfaceC32098u0.a.C5650a) aVar).f191242a;
            if (th2 instanceof SecurityException) {
                InterfaceC14725a.C0808a.a(c32104x0.f191327f, new MessengerFileUriPermissionDenialException(th2), null, 6);
            }
            V2.f318762a.c("VideoUploadInteractorImpl", "Upload flow for uploadId = " + this.f191145c + " failed with error", th2);
            c32104x0.f191331j.a("upload.failed");
        }
    }
}
