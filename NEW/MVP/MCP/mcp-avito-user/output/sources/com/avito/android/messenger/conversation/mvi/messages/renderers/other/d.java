package com.avito.android.messenger.conversation.mvi.messages.renderers.other;

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
import com.avito.android.messenger.conversation.mvi.messages.composables.other.m;
import com.avito.android.messenger.conversation.mvi.messages.h0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PaginationInProgressContentRenderer.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/renderers/other/d;", "Lcom/avito/android/messenger/conversation/mvi/messages/renderers/a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d extends com.avito.android.messenger.conversation.mvi.messages.renderers.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final d f193506a = new d();

    /* compiled from: PaginationInProgressContentRenderer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ T1 f193508m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ l<h0, G0> f193509n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ v f193510o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f193511p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(T1 t12, l<? super h0, G0> lVar, v vVar, int i12) {
            super(2);
            this.f193508m = t12;
            this.f193509n = lVar;
            this.f193510o = vVar;
            this.f193511p = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f193511p | 1);
            l<h0, G0> lVar = this.f193509n;
            v vVar = this.f193510o;
            d.this.a(this.f193508m, lVar, vVar, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: PaginationInProgressContentRenderer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements p<A, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ T1 f193513m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ l<h0, G0> f193514n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ v f193515o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f193516p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(T1 t12, l<? super h0, G0> lVar, v vVar, int i12) {
            super(2);
            this.f193513m = t12;
            this.f193514n = lVar;
            this.f193515o = vVar;
            this.f193516p = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f193516p | 1);
            l<h0, G0> lVar = this.f193514n;
            v vVar = this.f193515o;
            d.this.a(this.f193513m, lVar, vVar, a12, iA2);
            return G0.f406611a;
        }
    }

    @Override // com.avito.android.messenger.conversation.mvi.messages.renderers.a
    @InterfaceC22132o
    @InterfaceC22181t
    public final void a(@k T1 t12, @k l<? super h0, G0> lVar, @k v vVar, @Y61.l A a12, int i12) {
        int i13;
        B bE2 = a12.E(-1054562281);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(t12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.u(lVar) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            if (!(t12 instanceof T1.f)) {
                lVar.invoke(new h0.o(new NonFatalErrorEvent("PaginationInProgressContentRenderer: Unsupported listItem: " + t12, null, null, null, 14, null)));
                C22039c2 c22039c2Z = bE2.Z();
                if (c22039c2Z != null) {
                    c22039c2Z.f38184d = new a(t12, lVar, vVar, i12);
                    return;
                }
                return;
            }
            m.a(null, bE2, 0, 1);
        }
        C22039c2 c22039c2Z2 = bE2.Z();
        if (c22039c2Z2 != null) {
            c22039c2Z2.f38184d = new b(t12, lVar, vVar, i12);
        }
    }
}
