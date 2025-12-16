package com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_containers;

import Y41.l;
import Y41.p;
import Y61.k;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.v;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.messenger.MessageDeliveryStatus;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.c2;
import com.avito.android.messenger.conversation.mvi.messages.h0;
import com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content.X;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: OutgoingMessageRenderer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/renderers/messages/message_containers/c;", "Lcom/avito/android/messenger/conversation/mvi/messages/renderers/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c extends com.avito.android.messenger.conversation.mvi.messages.renderers.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c2 f193197a;

    /* compiled from: OutgoingMessageRenderer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ T1 f193198l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l<h0, G0> f193199m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l lVar, T1 t12) {
            super(2);
            this.f193198l = t12;
            this.f193199m = lVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                X.f193297a.a((T1.d) this.f193198l, this.f193199m, v.f42878y1, a13, 3456);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: OutgoingMessageRenderer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<A, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ T1 f193201m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ l<h0, G0> f193202n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(T1 t12, l<? super h0, G0> lVar) {
            super(2);
            this.f193201m = t12;
            this.f193202n = lVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                c.this.f193197a.f189352a.a((T1.d) this.f193201m, this.f193202n, v.f42878y1, a13, 384);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: OutgoingMessageRenderer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_containers.c$c, reason: collision with other inner class name */
    public static final class C5714c extends N implements p<A, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ T1 f193204m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ l<h0, G0> f193205n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ v f193206o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f193207p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5714c(T1 t12, l<? super h0, G0> lVar, v vVar, int i12) {
            super(2);
            this.f193204m = t12;
            this.f193205n = lVar;
            this.f193206o = vVar;
            this.f193207p = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f193207p | 1);
            l<h0, G0> lVar = this.f193205n;
            v vVar = this.f193206o;
            c.this.a(this.f193204m, lVar, vVar, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: OutgoingMessageRenderer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements p<A, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ T1 f193209m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ l<h0, G0> f193210n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ v f193211o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f193212p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(T1 t12, l<? super h0, G0> lVar, v vVar, int i12) {
            super(2);
            this.f193209m = t12;
            this.f193210n = lVar;
            this.f193211o = vVar;
            this.f193212p = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f193212p | 1);
            l<h0, G0> lVar = this.f193210n;
            v vVar = this.f193211o;
            c.this.a(this.f193209m, lVar, vVar, a12, iA2);
            return G0.f406611a;
        }
    }

    public c(@k c2 c2Var) {
        this.f193197a = c2Var;
    }

    @Override // com.avito.android.messenger.conversation.mvi.messages.renderers.a
    @InterfaceC22132o
    @InterfaceC22181t
    public final void a(@k T1 t12, @k l<? super h0, G0> lVar, @k v vVar, @Y61.l A a12, int i12) {
        int i13;
        Y41.a dVar;
        B bE2 = a12.E(646942579);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(t12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.u(lVar) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.B(vVar) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.B(this) ? 2048 : 1024;
        }
        if ((i13 & 5851) == 1170 && bE2.c()) {
            bE2.f();
        } else {
            T1.d dVar2 = t12 instanceof T1.d ? (T1.d) t12 : null;
            if (dVar2 == null) {
                lVar.invoke(new h0.o(new NonFatalErrorEvent("OutgoingMessageRenderer: unsupported bodyOrBubble: " + t12, null, null, null, 14, null)));
                C22039c2 c22039c2Z = bE2.Z();
                if (c22039c2Z != null) {
                    c22039c2Z.f38184d = new d(t12, lVar, vVar, i12);
                    return;
                }
                return;
            }
            T1.d dVar3 = (T1.d) t12;
            MessageDeliveryStatus messageDeliveryStatus = MessageDeliveryStatus.f186166e;
            MessageDeliveryStatus messageDeliveryStatus2 = dVar3.f189173h;
            c2 c2Var = this.f193197a;
            if (messageDeliveryStatus2 == messageDeliveryStatus || messageDeliveryStatus2 == MessageDeliveryStatus.f186163b) {
                dVar = new com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_containers.d(lVar, dVar3);
            } else {
                dVar = c2Var.f189352a.b(lVar, dVar3);
                if (dVar == null) {
                    dVar = e.f193215l;
                }
            }
            Y41.a aVar = dVar;
            Y41.a aVarC = c2Var.f189352a.c(lVar, dVar3);
            f fVar = new f(lVar, dVar3);
            T1.c cVar = dVar3.f189179n;
            String f157692b = t12.getF76517c();
            bE2.C(-1559312506);
            C22096n c22096nC = dVar3.f189184s == null ? null : r.c(-1474109963, new a(lVar, t12), bE2);
            bE2.X(false);
            com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_containers.v.a(dVar2.f189170e, dVar2.f189171f, dVar2.f189173h, cVar, vVar, dVar2.f189169d, dVar2.f189185t, dVar2.f189186u, f157692b, aVar, aVarC, fVar, c22096nC, r.c(330037929, new b(t12, lVar), bE2), bE2, (i13 << 6) & 57344, 3072, 0);
        }
        C22039c2 c22039c2Z2 = bE2.Z();
        if (c22039c2Z2 != null) {
            c22039c2Z2.f38184d = new C5714c(t12, lVar, vVar, i12);
        }
    }
}
