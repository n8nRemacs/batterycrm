package com.avito.android.messenger.conversation.mvi.sync;

import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: MissingUsersSyncAgent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "t", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class L0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32293v0 f194611b;

    public L0(C32293v0 c32293v0) {
        this.f194611b = c32293v0;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        V2 v22 = V2.f318762a;
        int i12 = C32293v0.f194852a0;
        v22.c(this.f194611b.f207131E, "Something has broken in subscribeToMissingUsersRequests", (Throwable) obj);
    }
}
