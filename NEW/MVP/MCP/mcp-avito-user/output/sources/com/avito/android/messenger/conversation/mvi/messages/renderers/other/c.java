package com.avito.android.messenger.conversation.mvi.messages.renderers.other;

import Y41.l;
import Y41.p;
import Y61.k;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.v;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.messages.h0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PaginationErrorContentRenderer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/renderers/other/c;", "Lcom/avito/android/messenger/conversation/mvi/messages/renderers/a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c extends com.avito.android.messenger.conversation.mvi.messages.renderers.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final c f193493a = new c();

    /* compiled from: PaginationErrorContentRenderer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ T1 f193495m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ l<h0, G0> f193496n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ v f193497o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f193498p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(T1 t12, l<? super h0, G0> lVar, v vVar, int i12) {
            super(2);
            this.f193495m = t12;
            this.f193496n = lVar;
            this.f193497o = vVar;
            this.f193498p = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f193498p | 1);
            l<h0, G0> lVar = this.f193496n;
            v vVar = this.f193497o;
            c.this.a(this.f193495m, lVar, vVar, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: PaginationErrorContentRenderer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l<h0, G0> f193499l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ T1 f193500m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(l<? super h0, G0> lVar, T1 t12) {
            super(0);
            this.f193499l = lVar;
            this.f193500m = t12;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f193499l.invoke(new h0.q((T1.e) this.f193500m));
            return G0.f406611a;
        }
    }

    /* compiled from: PaginationErrorContentRenderer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.messages.renderers.other.c$c, reason: collision with other inner class name */
    public static final class C5716c extends N implements p<A, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ T1 f193502m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ l<h0, G0> f193503n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ v f193504o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f193505p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5716c(T1 t12, l<? super h0, G0> lVar, v vVar, int i12) {
            super(2);
            this.f193502m = t12;
            this.f193503n = lVar;
            this.f193504o = vVar;
            this.f193505p = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f193505p | 1);
            l<h0, G0> lVar = this.f193503n;
            v vVar = this.f193504o;
            c.this.a(this.f193502m, lVar, vVar, a12, iA2);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009b  */
    @Override // com.avito.android.messenger.conversation.mvi.messages.renderers.a
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@Y61.k com.avito.android.messenger.conversation.T1 r10, @Y61.k Y41.l<? super com.avito.android.messenger.conversation.mvi.messages.h0, kotlin.G0> r11, @Y61.k androidx.compose.ui.v r12, @Y61.l androidx.compose.runtime.A r13, int r14) {
        /*
            r9 = this;
            r0 = -363019023(0xffffffffea5cc4f1, float:-6.6723427E25)
            androidx.compose.runtime.B r13 = r13.E(r0)
            r0 = r14 & 14
            r1 = 4
            if (r0 != 0) goto L17
            boolean r0 = r13.B(r10)
            if (r0 == 0) goto L14
            r0 = r1
            goto L15
        L14:
            r0 = 2
        L15:
            r0 = r0 | r14
            goto L18
        L17:
            r0 = r14
        L18:
            r2 = r14 & 112(0x70, float:1.57E-43)
            r3 = 32
            if (r2 != 0) goto L29
            boolean r2 = r13.u(r11)
            if (r2 == 0) goto L26
            r2 = r3
            goto L28
        L26:
            r2 = 16
        L28:
            r0 = r0 | r2
        L29:
            r2 = r0 & 91
            r4 = 18
            if (r2 != r4) goto L3b
            boolean r2 = r13.c()
            if (r2 != 0) goto L36
            goto L3b
        L36:
            r13.f()
            goto Lac
        L3b:
            boolean r2 = r10 instanceof com.avito.android.messenger.conversation.T1.e
            if (r2 != 0) goto L75
            com.avito.android.messenger.conversation.mvi.messages.h0$o r0 = new com.avito.android.messenger.conversation.mvi.messages.h0$o
            com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent r8 = new com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "PaginationErrorContentRenderer: Unsupported listItem: "
            r1.<init>(r2)
            r1.append(r10)
            java.lang.String r2 = r1.toString()
            r4 = 0
            r5 = 0
            r3 = 0
            r6 = 14
            r7 = 0
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.<init>(r8)
            r11.invoke(r0)
            androidx.compose.runtime.c2 r13 = r13.Z()
            if (r13 == 0) goto L74
            com.avito.android.messenger.conversation.mvi.messages.renderers.other.c$a r6 = new com.avito.android.messenger.conversation.mvi.messages.renderers.other.c$a
            r0 = r6
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r14
            r0.<init>(r2, r3, r4, r5)
            r13.f38184d = r6
        L74:
            return
        L75:
            r2 = -2079089072(0xffffffff84139e50, float:-1.735246E-36)
            r13.C(r2)
            r2 = r0 & 112(0x70, float:1.57E-43)
            r4 = 0
            r5 = 1
            if (r2 != r3) goto L83
            r2 = r5
            goto L84
        L83:
            r2 = r4
        L84:
            r0 = r0 & 14
            if (r0 != r1) goto L8a
            r0 = r5
            goto L8b
        L8a:
            r0 = r4
        L8b:
            r0 = r0 | r2
            java.lang.Object r1 = r13.t()
            if (r0 != 0) goto L9b
            androidx.compose.runtime.A$a r0 = androidx.compose.runtime.A.f37866a
            r0.getClass()
            androidx.compose.runtime.A$a$a r0 = androidx.compose.runtime.A.a.f37868b
            if (r1 != r0) goto La3
        L9b:
            com.avito.android.messenger.conversation.mvi.messages.renderers.other.c$b r1 = new com.avito.android.messenger.conversation.mvi.messages.renderers.other.c$b
            r1.<init>(r11, r10)
            r13.H(r1)
        La3:
            Y41.a r1 = (Y41.a) r1
            r13.X(r4)
            r0 = 0
            com.avito.android.messenger.conversation.mvi.messages.composables.other.k.a(r4, r5, r1, r13, r0)
        Lac:
            androidx.compose.runtime.c2 r13 = r13.Z()
            if (r13 == 0) goto Lbf
            com.avito.android.messenger.conversation.mvi.messages.renderers.other.c$c r6 = new com.avito.android.messenger.conversation.mvi.messages.renderers.other.c$c
            r0 = r6
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r14
            r0.<init>(r2, r3, r4, r5)
            r13.f38184d = r6
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.messages.renderers.other.c.a(com.avito.android.messenger.conversation.T1, Y41.l, androidx.compose.ui.v, androidx.compose.runtime.A, int):void");
    }
}
