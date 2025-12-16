package com.avito.android.messenger.conversation.mvi.file_upload.worker;

import Oq.InterfaceC14725a;
import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: FileUploadWorkerDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class o<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f191300b;

    public o(l lVar) {
        this.f191300b = lVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        int i12 = l.f191293e;
        l lVar = this.f191300b;
        lVar.getClass();
        InterfaceC14725a.C0808a.a(lVar.f191297d, new PY.c(th2), null, 6);
        V2.f318762a.a("FileUploadWorkerDelegate", "Error while uploading file to server.", th2);
    }
}
