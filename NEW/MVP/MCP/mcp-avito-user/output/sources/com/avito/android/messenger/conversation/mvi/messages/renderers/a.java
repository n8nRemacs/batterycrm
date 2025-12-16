package com.avito.android.messenger.conversation.mvi.messages.renderers;

import Y41.l;
import Y41.p;
import Y61.k;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.v;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.messages.h0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AbstractMessageListItemRenderer.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/renderers/a;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class a {

    /* compiled from: AbstractMessageListItemRenderer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.messages.renderers.a$a, reason: collision with other inner class name */
    public static final class C5710a extends N implements p<A, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ T1 f193145m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ l<h0, G0> f193146n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ v f193147o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f193148p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5710a(T1 t12, l<? super h0, G0> lVar, v vVar, int i12) {
            super(2);
            this.f193145m = t12;
            this.f193146n = lVar;
            this.f193147o = vVar;
            this.f193148p = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            a.this.a(this.f193145m, this.f193146n, this.f193147o, a12, C22066f2.a(this.f193148p | 1));
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    public void a(@k T1 t12, @k l<? super h0, G0> lVar, @k v vVar, @Y61.l A a12, int i12) {
        B bE2 = a12.E(-149902635);
        if ((i12 & 1) == 0 && bE2.c()) {
            bE2.f();
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C5710a(t12, lVar, vVar, i12);
        }
    }
}
