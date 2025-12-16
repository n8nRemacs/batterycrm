package com.avito.android.messenger.conversation.mvi.file_upload;

import Oq.InterfaceC14725a;
import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: FileUploadInitializer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.file_upload.g, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32070g<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f191163b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C32062c f191164c;

    public C32070g(C32062c c32062c, String str) {
        this.f191163b = str;
        this.f191164c = c32062c;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        String str = "deleteUnattendedFilesFromPersistedUploadCache() failed for filePath = " + this.f191163b;
        V2.f318762a.a("FileUploadInitializerImpl", str, th2);
        InterfaceC14725a.C0808a.a(this.f191164c.f191128e, new PY.b(str, th2), null, 6);
    }
}
