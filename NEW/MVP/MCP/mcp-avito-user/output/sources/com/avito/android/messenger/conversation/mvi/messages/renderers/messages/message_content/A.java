package com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content;

import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.messages.h0;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: LocationMessageFromAvitoContentRenderer.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/renderers/messages/message_content/A;", "Lcom/avito/android/messenger/conversation/mvi/messages/renderers/messages/message_content/b;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class A extends AbstractC32155b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final A f193218a = new A();

    /* compiled from: LocationMessageFromAvitoContentRenderer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.messenger.conversation.mvi.messages.h0, G0> f193219l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ T1.d f193220m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super com.avito.android.messenger.conversation.mvi.messages.h0, G0> lVar, T1.d dVar) {
            super(0);
            this.f193219l = lVar;
            this.f193220m = dVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            T1.d dVar = this.f193220m;
            this.f193219l.invoke(new h0.i(dVar.f189168c, dVar.f189180o, dVar.f189181p, dVar.f189182q));
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009d  */
    @Override // com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content.AbstractC32155b
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@Y61.k com.avito.android.messenger.conversation.T1.d r10, @Y61.k Y41.l r11, @Y61.k androidx.compose.ui.v.a r12, @Y61.l androidx.compose.runtime.A r13, int r14) {
        /*
            Method dump skipped, instructions count: 199
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content.A.a(com.avito.android.messenger.conversation.T1$d, Y41.l, androidx.compose.ui.v$a, androidx.compose.runtime.A, int):void");
    }

    @Override // com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content.AbstractC32155b
    @Y61.k
    public final Y41.a b(@Y61.k Y41.l lVar, @Y61.k T1.d dVar) {
        return new a(lVar, dVar);
    }
}
