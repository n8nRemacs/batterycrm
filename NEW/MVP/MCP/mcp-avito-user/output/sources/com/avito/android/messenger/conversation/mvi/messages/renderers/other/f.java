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
import com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_containers.C32138g;
import com.avito.android.messenger.conversation.mvi.messages.h0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TypingIndicatorContentRenderer.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/renderers/other/f;", "Lcom/avito/android/messenger/conversation/mvi/messages/renderers/a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f extends com.avito.android.messenger.conversation.mvi.messages.renderers.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final f f193531a = new f();

    /* compiled from: TypingIndicatorContentRenderer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ T1 f193533m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ l<h0, G0> f193534n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ v f193535o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f193536p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(T1 t12, l<? super h0, G0> lVar, v vVar, int i12) {
            super(2);
            this.f193533m = t12;
            this.f193534n = lVar;
            this.f193535o = vVar;
            this.f193536p = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f193536p | 1);
            l<h0, G0> lVar = this.f193534n;
            v vVar = this.f193535o;
            f.this.a(this.f193533m, lVar, vVar, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: TypingIndicatorContentRenderer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements p<A, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ T1 f193538m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ l<h0, G0> f193539n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ v f193540o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f193541p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(T1 t12, l<? super h0, G0> lVar, v vVar, int i12) {
            super(2);
            this.f193538m = t12;
            this.f193539n = lVar;
            this.f193540o = vVar;
            this.f193541p = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f193541p | 1);
            l<h0, G0> lVar = this.f193539n;
            v vVar = this.f193540o;
            f.this.a(this.f193538m, lVar, vVar, a12, iA2);
            return G0.f406611a;
        }
    }

    @Override // com.avito.android.messenger.conversation.mvi.messages.renderers.a
    @InterfaceC22132o
    @InterfaceC22181t
    public final void a(@k T1 t12, @k l<? super h0, G0> lVar, @k v vVar, @Y61.l A a12, int i12) {
        int i13;
        B bE2 = a12.E(-669225467);
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
        if ((i13 & 731) == 146 && bE2.c()) {
            bE2.f();
        } else {
            if (!(t12 instanceof T1.h)) {
                lVar.invoke(new h0.o(new NonFatalErrorEvent("TypingIndicatorContentRenderer: Unsupported listItem: " + t12, null, null, null, 14, null)));
                C22039c2 c22039c2Z = bE2.Z();
                if (c22039c2Z != null) {
                    c22039c2Z.f38184d = new a(t12, lVar, vVar, i12);
                    return;
                }
                return;
            }
            T1.c cVar = new T1.c(true, true, false, false, false, false, false, false, false, 508, null);
            com.avito.android.messenger.conversation.mvi.messages.renderers.other.a.f193484a.getClass();
            C32138g.a(((T1.h) t12).f189213c, null, null, cVar, vVar, null, null, null, null, null, null, null, null, null, com.avito.android.messenger.conversation.mvi.messages.renderers.other.a.f193485b, bE2, ((i13 << 6) & 57344) | 440, 24576, 16352);
        }
        C22039c2 c22039c2Z2 = bE2.Z();
        if (c22039c2Z2 != null) {
            c22039c2Z2.f38184d = new b(t12, lVar, vVar, i12);
        }
    }
}
