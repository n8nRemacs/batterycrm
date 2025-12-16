package com.avito.android.messenger.conversation.mvi.file_upload;

import android.net.Uri;
import java.io.File;
import kotlin.Metadata;

/* compiled from: VideoUploadInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "error", "Lio/reactivex/rxjava3/core/O;", "Lkotlin/Q;", "Lcom/avito/android/messenger/conversation/mvi/file_upload/r0;", "apply", "(Ljava/lang/Throwable;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class O0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ File f191072b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C32104x0 f191073c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Uri f191074d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f191075e;

    public O0(Uri uri, C32104x0 c32104x0, File file, String str) {
        this.f191072b = file;
        this.f191073c = c32104x0;
        this.f191074d = uri;
        this.f191075e = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        this.f191072b.delete();
        int i12 = C32104x0.f191321p;
        Uri uri = this.f191074d;
        C32104x0 c32104x0 = this.f191073c;
        return C32104x0.b(c32104x0, c32104x0.d(uri, this.f191075e)).r(new N0((Throwable) obj));
    }
}
