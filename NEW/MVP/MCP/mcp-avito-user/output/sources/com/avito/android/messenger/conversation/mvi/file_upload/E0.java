package com.avito.android.messenger.conversation.mvi.file_upload;

import android.net.Uri;
import java.io.File;
import kotlin.Metadata;

/* compiled from: VideoUploadInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/io/File;", "file", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/messenger/conversation/mvi/file_upload/r0;", "apply", "(Ljava/io/File;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class E0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32104x0 f191004b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f191005c;

    public E0(C32104x0 c32104x0, Uri uri) {
        this.f191004b = c32104x0;
        this.f191005c = uri;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return C32104x0.c(this.f191004b, this.f191005c, (File) obj);
    }
}
