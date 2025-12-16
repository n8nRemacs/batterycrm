package com.avito.android.messenger.conversation.mvi.video.chunked_upload;

import Oq.InterfaceC14725a;
import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: ChunkedVideoUploadWorkerDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class s<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f194969b;

    public s(o oVar) {
        this.f194969b = oVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        InterfaceC14725a.C0808a.a(this.f194969b.f194956d, new PY.a("Error during individual upload status handling", th2), null, 6);
        V2.f318762a.a("ChunkedVideoUploadWorkerDelegate", "Error during individual upload status handling", th2);
    }
}
