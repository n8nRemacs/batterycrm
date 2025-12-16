package com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content;

import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.messages.h0;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ImageMessageFromUserContentRenderer.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/renderers/messages/message_content/s;", "Lcom/avito/android/messenger/conversation/mvi/messages/renderers/messages/message_content/d;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content.s, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32171s extends AbstractC32157d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C32171s f193426a = new C32171s();

    /* compiled from: ImageMessageFromUserContentRenderer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content.s$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.messenger.conversation.mvi.messages.h0, G0> f193427l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ T1.d f193428m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super com.avito.android.messenger.conversation.mvi.messages.h0, G0> lVar, T1.d dVar) {
            super(0);
            this.f193427l = lVar;
            this.f193428m = dVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            T1.d dVar = this.f193428m;
            this.f193427l.invoke(new h0.i(dVar.f189168c, dVar.f189180o, dVar.f189181p, dVar.f189182q));
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0043  */
    @Override // com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content.AbstractC32157d
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@Y61.k com.avito.android.messenger.conversation.T1.d r10, @Y61.k Y41.l r11, @Y61.k androidx.compose.ui.v.a r12, @Y61.l androidx.compose.runtime.A r13, int r14) {
        /*
            r9 = this;
            r0 = 1221430221(0x48cd8bcd, float:420958.4)
            androidx.compose.runtime.B r13 = r13.E(r0)
            r0 = r14 & 14
            r1 = 2
            if (r0 != 0) goto L17
            boolean r0 = r13.B(r10)
            if (r0 == 0) goto L14
            r0 = 4
            goto L15
        L14:
            r0 = r1
        L15:
            r0 = r0 | r14
            goto L18
        L17:
            r0 = r14
        L18:
            r0 = r0 & 11
            if (r0 != r1) goto L27
            boolean r0 = r13.c()
            if (r0 != 0) goto L23
            goto L27
        L23:
            r13.f()
            goto L51
        L27:
            com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.image_message.i r0 = r10.f189156A
            r1 = 0
            if (r0 == 0) goto L2f
            android.net.Uri r2 = r0.f192516a
            goto L30
        L2f:
            r2 = r1
        L30:
            if (r0 == 0) goto L35
            android.net.Uri r0 = r0.f192517b
            goto L36
        L35:
            r0 = r1
        L36:
            boolean r1 = r10.f189172g
            if (r1 == 0) goto L43
            com.avito.android.messenger.MessageDeliveryStatus r1 = com.avito.android.messenger.MessageDeliveryStatus.f186163b
            com.avito.android.messenger.MessageDeliveryStatus r3 = r10.f189173h
            if (r3 != r1) goto L43
            r1 = 1
        L41:
            r3 = r1
            goto L45
        L43:
            r1 = 0
            goto L41
        L45:
            r4 = 0
            r5 = 0
            r7 = 72
            r8 = 24
            r1 = r2
            r2 = r0
            r6 = r13
            com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.image_message.f.a(r1, r2, r3, r4, r5, r6, r7, r8)
        L51:
            androidx.compose.runtime.c2 r13 = r13.Z()
            if (r13 == 0) goto L64
            com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content.r r6 = new com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content.r
            r0 = r6
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r13.f38184d = r6
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content.C32171s.a(com.avito.android.messenger.conversation.T1$d, Y41.l, androidx.compose.ui.v$a, androidx.compose.runtime.A, int):void");
    }

    @Override // com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content.AbstractC32157d
    @Y61.k
    public final Y41.a b(@Y61.k Y41.l lVar, @Y61.k T1.d dVar) {
        return new a(lVar, dVar);
    }
}
