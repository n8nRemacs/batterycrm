package com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.v;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.adapter.quote.QuoteViewData;
import com.avito.android.messenger.conversation.mvi.messages.h0;
import com.avito.android.remote.model.messenger.message.MessageBody;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CallMessageContentRenderer.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/renderers/messages/message_content/f;", "Lcom/avito/android/messenger/conversation/mvi/messages/renderers/messages/message_content/d;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content.f, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32159f extends AbstractC32157d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C32159f f193330a = new C32159f();

    /* compiled from: CallMessageContentRenderer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content.f$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ T1.d f193331l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.messenger.conversation.mvi.messages.h0, G0> f193332m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.l lVar, T1.d dVar) {
            super(0);
            this.f193331l = dVar;
            this.f193332m = lVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            MessageBody f189194a = this.f193331l.f189168c.getF189194a();
            if (f189194a instanceof MessageBody.AppCall) {
                this.f193332m.invoke(new h0.b(((MessageBody.AppCall) f189194a).getCall().getDeepLink()));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CallMessageContentRenderer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content.f$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ T1.d f193333l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.messenger.conversation.mvi.messages.h0, G0> f193334m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.l lVar, T1.d dVar) {
            super(0);
            this.f193333l = dVar;
            this.f193334m = lVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            MessageBody f189194a = this.f193333l.f189168c.getF189194a();
            if (f189194a instanceof MessageBody.AppCall) {
                this.f193334m.invoke(new h0.b(((MessageBody.AppCall) f189194a).getCall().getDeepLink()));
            }
            return G0.f406611a;
        }
    }

    @Override // com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content.AbstractC32157d
    @InterfaceC22132o
    @InterfaceC22181t
    public final void a(@Y61.k T1.d dVar, @Y61.k Y41.l lVar, @Y61.k v.a aVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        G0 g02;
        androidx.compose.runtime.B bE2 = a12.E(-1965222681);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(dVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.u(lVar) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.B(aVar) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.B(this) ? 2048 : 1024;
        }
        if ((i13 & 5851) == 1170 && bE2.c()) {
            bE2.f();
        } else {
            T1.d.b bVar = dVar.f189168c;
            MessageBody f189194a = bVar.getF189194a();
            if (f189194a instanceof MessageBody.AppCall ? true : f189194a instanceof MessageBody.Call) {
                bE2.C(1241858203);
                G0 g03 = null;
                QuoteViewData quoteViewData = dVar.f189184s;
                com.avito.android.messenger.conversation.mvi.messages.composables.messages.call_message.d dVar2 = dVar.f189161F;
                if (dVar2 == null) {
                    g02 = null;
                } else {
                    com.avito.android.messenger.conversation.mvi.messages.composables.messages.call_message.c.a(dVar2, C22501m2.a(aVar, bVar.getF189194a() instanceof MessageBody.AppCall ? "AppCallMessageContent" : "GsmCallMessageContent"), quoteViewData == null, bE2, 0);
                    g02 = G0.f406611a;
                }
                bE2.X(false);
                if (g02 == null) {
                    com.avito.android.messenger.conversation.mvi.messages.composables.messages.call_message.h hVar = dVar.f189162G;
                    if (hVar != null) {
                        com.avito.android.messenger.conversation.mvi.messages.composables.messages.call_message.g.a(hVar, C22501m2.a(aVar, bVar.getF189194a() instanceof MessageBody.AppCall ? "OldAppCallMessageContent" : "OldGsmCallMessageContent"), quoteViewData == null, bE2, 0);
                        g03 = G0.f406611a;
                    }
                    g02 = g03;
                }
                if (g02 == null) {
                    lVar.invoke(new h0.o(new NonFatalErrorEvent("CallMessageContentRenderer: call message data is null", null, null, null, 14, null)));
                }
            } else {
                lVar.invoke(new h0.o(new NonFatalErrorEvent("CallMessageContentRenderer: Unsupported bodyOrBubble: " + bVar, null, null, null, 14, null)));
            }
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C32158e(this, dVar, lVar, aVar, i12);
        }
    }

    @Override // com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content.AbstractC32157d
    @Y61.k
    public final Y41.a b(@Y61.k Y41.l lVar, @Y61.k T1.d dVar) {
        return new a(lVar, dVar);
    }

    @Override // com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content.AbstractC32157d
    @Y61.k
    public final Y41.a c(@Y61.k Y41.l lVar, @Y61.k T1.d dVar) {
        return new b(lVar, dVar);
    }
}
