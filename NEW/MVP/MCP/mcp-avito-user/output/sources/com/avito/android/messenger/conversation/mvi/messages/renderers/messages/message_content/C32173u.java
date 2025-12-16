package com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.v;
import com.avito.android.R;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.adapter.quote.QuoteViewData;
import com.avito.android.messenger.conversation.mvi.messages.h0;
import com.avito.android.remote.model.messenger.message.MessageBody;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ItemMessageFromUserContentRenderer.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/renderers/messages/message_content/u;", "Lcom/avito/android/messenger/conversation/mvi/messages/renderers/messages/message_content/d;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content.u, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32173u extends AbstractC32157d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C32173u f193441a = new C32173u();

    /* compiled from: ItemMessageFromUserContentRenderer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content.u$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.messenger.conversation.mvi.messages.h0, G0> f193442l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ T1.d f193443m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super com.avito.android.messenger.conversation.mvi.messages.h0, G0> lVar, T1.d dVar) {
            super(0);
            this.f193442l = lVar;
            this.f193443m = dVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            T1.d dVar = this.f193443m;
            this.f193442l.invoke(new h0.i(dVar.f189168c, dVar.f189180o, dVar.f189181p, dVar.f189182q));
            return G0.f406611a;
        }
    }

    @Override // com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content.AbstractC32157d
    @InterfaceC22132o
    @InterfaceC22181t
    public final void a(@Y61.k T1.d dVar, @Y61.k Y41.l lVar, @Y61.k v.a aVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(-322768921);
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
        if ((i13 & 731) == 146 && bE2.c()) {
            bE2.f();
        } else {
            T1.d.b bVar = dVar.f189168c;
            MessageBody f189194a = bVar.getF189194a();
            boolean z12 = f189194a instanceof MessageBody.Item;
            QuoteViewData quoteViewData = dVar.f189184s;
            if (z12) {
                bE2.C(66818548);
                MessageBody.Item item = (MessageBody.Item) f189194a;
                com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.p.a(item.getTitle(), item.getPrice(), null, item.getLocation(), item.getImage(), aVar, quoteViewData == null, bE2, ((i13 << 12) & 3670016) | 265600);
                bE2.X(false);
            } else if (f189194a instanceof MessageBody.ItemReference) {
                bE2.C(67282494);
                com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.p.a(u0.i.c(bE2, R.string.message_body_description_item), null, null, u0.i.c(bE2, R.string.messenger_item_body_not_loaded_description), null, aVar, quoteViewData == null, bE2, ((i13 << 12) & 3670016) | 200112);
                bE2.X(false);
            } else {
                bE2.C(67813989);
                lVar.invoke(new h0.o(new NonFatalErrorEvent("ItemMessageFromUserContentRenderer: Unsupported bodyOrBubble: " + bVar, null, null, null, 14, null)));
                com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.p.a("", null, null, "", null, aVar, quoteViewData == null, bE2, ((i13 << 12) & 3670016) | 224694);
                bE2.X(false);
            }
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C32172t(this, dVar, lVar, aVar, i12);
        }
    }

    @Override // com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content.AbstractC32157d
    @Y61.k
    public final Y41.a b(@Y61.k Y41.l lVar, @Y61.k T1.d dVar) {
        return new a(lVar, dVar);
    }
}
