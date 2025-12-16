package com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.v;
import com.avito.android.R;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.messages.h0;
import com.avito.android.remote.model.messenger.message.MessageBody;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DeletedMessageFromUserContentRenderer.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/renderers/messages/message_content/i;", "Lcom/avito/android/messenger/conversation/mvi/messages/renderers/messages/message_content/d;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content.i, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32162i extends AbstractC32157d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C32162i f193353a = new C32162i();

    /* compiled from: DeletedMessageFromUserContentRenderer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content.i$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ T1.d f193354l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.messenger.conversation.mvi.messages.h0, G0> f193355m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.l lVar, T1.d dVar) {
            super(0);
            this.f193354l = dVar;
            this.f193355m = lVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            if (!this.f193354l.f189172g) {
                this.f193355m.invoke(h0.h.f192984a);
            }
            return G0.f406611a;
        }
    }

    @Override // com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content.AbstractC32157d
    @InterfaceC22132o
    @InterfaceC22181t
    public final void a(@Y61.k T1.d dVar, @Y61.k Y41.l lVar, @Y61.k v.a aVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(-155398127);
        if ((i12 & 14) == 0) {
            i13 = i12 | (bE2.B(dVar) ? 4 : 2);
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.u(lVar) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            T1.d.b bVar = dVar.f189168c;
            MessageBody f189194a = bVar.getF189194a();
            if (f189194a instanceof MessageBody.Deleted) {
                bE2.C(634027322);
                String text = ((MessageBody.Deleted) f189194a).getText();
                bE2.C(1960116980);
                if (text == null) {
                    text = u0.i.c(bE2, R.string.message_body_description_deleted);
                }
                bE2.X(false);
                com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.c.a(text, null, bE2, 0);
                bE2.X(false);
            } else {
                bE2.C(634199248);
                lVar.invoke(new h0.o(new NonFatalErrorEvent("DeletedMessageFromUserContentRenderer: Unsupported bodyOrBubble: " + bVar, null, null, null, 14, null)));
                com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.c.a("", null, bE2, 6);
                bE2.X(false);
            }
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C32161h(this, dVar, lVar, aVar, i12);
        }
    }

    @Override // com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content.AbstractC32157d
    @Y61.k
    public final Y41.a b(@Y61.k Y41.l lVar, @Y61.k T1.d dVar) {
        return new a(lVar, dVar);
    }
}
