package com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_remote;

import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: DeleteRemoteMessageElementProvider.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class b<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.messenger.conversation.mvi.message_menu.h f191683b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f191684c;

    public b(com.avito.android.messenger.conversation.mvi.message_menu.h hVar, a aVar) {
        this.f191683b = hVar;
        this.f191684c = aVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        V2 v22 = V2.f318762a;
        StringBuilder sb2 = new StringBuilder("Failed to delete message { remoteId = ");
        com.avito.android.messenger.conversation.mvi.message_menu.h hVar = this.f191683b;
        sb2.append(hVar.f191750e);
        sb2.append(", localId = ");
        v22.a("DeleteRemoteMessageElementProvider", AK.c.s(sb2, hVar.f191748c, " }"), (Throwable) obj);
        this.f191684c.f191677b.F4();
    }
}
