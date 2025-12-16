package com.avito.android.messenger.conversation.mvi.sync;

import com.avito.android.messenger.conversation.mvi.sync.W0;
import com.avito.android.messenger.conversation.mvi.sync.X0;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: VoiceInfoSyncAgent.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "Lcom/avito/android/remote/model/messenger/voice/VoiceInfo;", "response", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/messenger/conversation/mvi/sync/W0$b;", "apply", "(Ljava/util/Map;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class a1<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X0.f f194747b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ W0.b f194748c;

    public a1(X0.f fVar, W0.b bVar) {
        this.f194747b = fVar;
        this.f194748c = bVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Map map = (Map) obj;
        X0.f fVar = this.f194747b;
        return fVar.d(map, fVar.f194736d).B(kotlin.G0.f406611a).n(new Z0(this.f194748c, map));
    }
}
