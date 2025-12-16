package com.avito.android.messenger.conversation.mvi.file_upload;

import android.net.Uri;
import java.io.File;
import kotlin.Metadata;

/* compiled from: VideoUploadInteractor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\b\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljava/io/File;", "compressionOutputFile", "Lio/reactivex/rxjava3/core/O;", "Lkotlin/Q;", "Lcom/avito/android/messenger/conversation/mvi/file_upload/r0;", "", "apply", "(Ljava/io/File;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class P0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32104x0 f191083b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f191084c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f191085d;

    public P0(C32104x0 c32104x0, Uri uri, String str) {
        this.f191083b = c32104x0;
        this.f191084c = uri;
        this.f191085d = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        File file = (File) obj;
        C32104x0 c32104x0 = this.f191083b;
        c32104x0.f191331j.a("compression.started");
        com.avito.android.messenger.conversation.mvi.video.b bVar = c32104x0.f191330i;
        Uri uri = this.f191084c;
        io.reactivex.rxjava3.internal.operators.single.O oA2 = bVar.a(uri, file);
        String str = this.f191085d;
        return oA2.n(new M0(uri, c32104x0, file, str)).t(new O0(uri, c32104x0, file, str));
    }
}
