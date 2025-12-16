package com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.v;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.messages.h0;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AbstractMessageFromUserContentRenderer.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/renderers/messages/message_content/d;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC32157d {

    /* compiled from: AbstractMessageFromUserContentRenderer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content.d$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.messenger.conversation.mvi.messages.h0, G0> f193317l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ T1.d f193318m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super com.avito.android.messenger.conversation.mvi.messages.h0, G0> lVar, T1.d dVar) {
            super(0);
            this.f193317l = lVar;
            this.f193318m = dVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            T1.d dVar = this.f193318m;
            this.f193317l.invoke(new h0.m(dVar.f189168c, dVar.f189180o));
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public void a(@Y61.k T1.d dVar, @Y61.k Y41.l lVar, @Y61.k v.a aVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(-1915389305);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(dVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            com.avito.android.messenger.conversation.mvi.messages.composables.messages.f.a(com.avito.android.messenger.conversation.mvi.messages.utils.i.a(dVar), null, null, bE2, 0);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C32156c(this, dVar, lVar, aVar, i12);
        }
    }

    @Y61.l
    public Y41.a b(@Y61.k Y41.l lVar, @Y61.k T1.d dVar) {
        return null;
    }

    @Y61.l
    public Y41.a c(@Y61.k Y41.l lVar, @Y61.k T1.d dVar) {
        return new a(lVar, dVar);
    }
}
