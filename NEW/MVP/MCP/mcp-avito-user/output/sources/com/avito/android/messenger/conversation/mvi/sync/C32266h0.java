package com.avito.android.messenger.conversation.mvi.sync;

import com.avito.android.messenger.conversation.mvi.sync.K;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* compiled from: MessageSyncAgent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "", "Lru/avito/messenger/api/entity/ChatMessage;", "Lcom/avito/android/messenger/conversation/mvi/sync/K$b;", "<name for destructuring parameter 0>", "apply", "(Lkotlin/Q;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.sync.h0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32266h0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f194780b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f194781c;

    public C32266h0(AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2) {
        this.f194780b = atomicBoolean;
        this.f194781c = atomicBoolean2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.o
    public final Object apply(Object obj) {
        kotlin.Q q12 = (kotlin.Q) obj;
        List list = (List) q12.f406619b;
        K.b bVar = (K.b) q12.f406620c;
        if (!bVar.f194603a) {
            this.f194780b.set(false);
        }
        if (bVar.f194604b) {
            this.f194781c.set(true);
        }
        return list;
    }
}
