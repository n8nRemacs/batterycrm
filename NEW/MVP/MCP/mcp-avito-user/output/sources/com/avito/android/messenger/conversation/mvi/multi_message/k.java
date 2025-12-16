package com.avito.android.messenger.conversation.mvi.multi_message;

import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: MultiMessageInteractor.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/multi_message/k;", "Lcom/avito/android/messenger/conversation/mvi/multi_message/j;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u f193707a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.f f193708b;

    /* compiled from: MultiMessageInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/multi_message/k$a;", "", "<init>", "()V", "", "BANNER_PERIOD_MILLIS", "J", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public k(@Y61.k u uVar, @Y61.k com.avito.android.server_time.f fVar) {
        this.f193707a = uVar;
        this.f193708b = fVar;
    }

    @Override // com.avito.android.messenger.conversation.mvi.multi_message.j
    public final void a(long j12) {
        u uVar = this.f193707a;
        uVar.b(j12);
        uVar.d(this.f193708b.now());
    }

    @Override // com.avito.android.messenger.conversation.mvi.multi_message.j
    public final boolean b(long j12) {
        u uVar = this.f193707a;
        return !uVar.a(j12) && this.f193708b.now() - uVar.c() > 86400000;
    }
}
