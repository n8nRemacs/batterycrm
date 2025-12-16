package com.avito.android.messenger.conversation.mvi.messages.renderers.messages;

import Y41.l;
import Y41.p;
import Y61.k;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.v;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.messages.composables.messages.i;
import com.avito.android.messenger.conversation.mvi.messages.h0;
import com.avito.android.remote.model.messenger.message.MessageBody;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SystemTextMessageRenderer.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/renderers/messages/a;", "Lcom/avito/android/messenger/conversation/mvi/messages/renderers/a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a extends com.avito.android.messenger.conversation.mvi.messages.renderers.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f193149a = new a();

    /* compiled from: SystemTextMessageRenderer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.messages.renderers.messages.a$a, reason: collision with other inner class name */
    public static final class C5711a extends N implements p<A, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ T1 f193151m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ l<h0, G0> f193152n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ v f193153o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f193154p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5711a(T1 t12, l<? super h0, G0> lVar, v vVar, int i12) {
            super(2);
            this.f193151m = t12;
            this.f193152n = lVar;
            this.f193153o = vVar;
            this.f193154p = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f193154p | 1);
            l<h0, G0> lVar = this.f193152n;
            v vVar = this.f193153o;
            a.this.a(this.f193151m, lVar, vVar, a12, iA2);
            return G0.f406611a;
        }
    }

    @Override // com.avito.android.messenger.conversation.mvi.messages.renderers.a
    @InterfaceC22132o
    @InterfaceC22181t
    public final void a(@k T1 t12, @k l<? super h0, G0> lVar, @k v vVar, @Y61.l A a12, int i12) {
        int i13;
        T1.d.b bVar;
        B bE2 = a12.E(701231835);
        if ((i12 & 14) == 0) {
            i13 = i12 | (bE2.B(t12) ? 4 : 2);
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.u(lVar) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            boolean z12 = t12 instanceof T1.d;
            T1.d dVar = z12 ? (T1.d) t12 : null;
            MessageBody f189194a = (dVar == null || (bVar = dVar.f189168c) == null) ? null : bVar.getF189194a();
            T1.d dVar2 = z12 ? (T1.d) t12 : null;
            String str = dVar2 != null ? dVar2.f189170e : null;
            if (f189194a instanceof MessageBody.SystemMessageBody.Text) {
                bE2.C(952823543);
                i.a(((MessageBody.SystemMessageBody.Text) f189194a).getText(), str, null, bE2, 0);
                bE2.X(false);
            } else {
                bE2.C(952911552);
                lVar.invoke(new h0.o(new NonFatalErrorEvent("DeletedMessageFromUserContentRenderer: Unsupported listItem: " + t12, null, null, null, 14, null)));
                i.a("", str, null, bE2, 6);
                bE2.X(false);
            }
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C5711a(t12, lVar, vVar, i12);
        }
    }
}
