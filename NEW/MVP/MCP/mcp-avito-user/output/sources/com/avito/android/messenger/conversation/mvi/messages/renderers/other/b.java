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
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.messages.composables.other.j;
import com.avito.android.messenger.conversation.mvi.messages.h0;
import com.avito.android.messenger.conversation.mvi.messages.utils.i;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NonMessageStubRenderer.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/renderers/other/b;", "Lcom/avito/android/messenger/conversation/mvi/messages/renderers/a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b extends com.avito.android.messenger.conversation.mvi.messages.renderers.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f193487a = new b();

    /* compiled from: NonMessageStubRenderer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ T1 f193489m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ l<h0, G0> f193490n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ v f193491o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f193492p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(T1 t12, l<? super h0, G0> lVar, v vVar, int i12) {
            super(2);
            this.f193489m = t12;
            this.f193490n = lVar;
            this.f193491o = vVar;
            this.f193492p = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f193492p | 1);
            l<h0, G0> lVar = this.f193490n;
            v vVar = this.f193491o;
            b.this.a(this.f193489m, lVar, vVar, a12, iA2);
            return G0.f406611a;
        }
    }

    @Override // com.avito.android.messenger.conversation.mvi.messages.renderers.a
    @InterfaceC22132o
    @InterfaceC22181t
    public final void a(@k T1 t12, @k l<? super h0, G0> lVar, @k v vVar, @Y61.l A a12, int i12) {
        int i13;
        B bE2 = a12.E(-651280137);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(t12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.B(vVar) ? 256 : 128;
        }
        if ((i13 & 651) == 130 && bE2.c()) {
            bE2.f();
        } else {
            j.a(i.a(t12), vVar, bE2, (i13 >> 3) & 112);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(t12, lVar, vVar, i12);
        }
    }
}
