package com.avito.android.messenger.conversation.mvi.file_download;

import com.avito.android.util.X2;
import kotlin.Metadata;

/* compiled from: FileMessageClickInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class Q<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O f190871b;

    public Q(O o12) {
        this.f190871b = o12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        X2.f318778a.a(this.f190871b.f207131E, "fileDownloadManager.enqueueDownload() failed!", (Throwable) obj);
    }
}
