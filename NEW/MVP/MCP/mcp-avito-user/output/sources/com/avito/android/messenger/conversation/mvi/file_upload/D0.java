package com.avito.android.messenger.conversation.mvi.file_upload;

import java.io.File;
import kotlin.Metadata;

/* compiled from: VideoUploadInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_upload/r0;", "resultVideoInfo", "Lio/reactivex/rxjava3/core/O;", "apply", "(Lcom/avito/android/messenger/conversation/mvi/file_upload/r0;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class D0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32104x0 f191003b;

    public D0(C32104x0 c32104x0) {
        this.f191003b = c32104x0;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        C32092r0 c32092r0 = (C32092r0) obj;
        com.avito.android.messenger.conversation.mvi.file_attachment.n nVar = this.f191003b.f191323b;
        File file = c32092r0.f191206a;
        String name = c32092r0.f191207b;
        if (name == null) {
            name = file.getName();
        }
        return nVar.c(file, name, c32092r0.f191209d).r(new C0(c32092r0)).v(c32092r0);
    }
}
