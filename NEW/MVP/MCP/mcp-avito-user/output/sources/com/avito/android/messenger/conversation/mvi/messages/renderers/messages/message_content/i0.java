package com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.messages.h0;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: UnreadMessagesDividerRenderer.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/renderers/messages/message_content/i0;", "Lcom/avito/android/messenger/conversation/mvi/messages/renderers/a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i0 extends com.avito.android.messenger.conversation.mvi.messages.renderers.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final i0 f193356a = new i0();

    /* compiled from: UnreadMessagesDividerRenderer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ T1 f193358m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.messenger.conversation.mvi.messages.h0, G0> f193359n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f193360o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f193361p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(T1 t12, Y41.l<? super com.avito.android.messenger.conversation.mvi.messages.h0, G0> lVar, androidx.compose.ui.v vVar, int i12) {
            super(2);
            this.f193358m = t12;
            this.f193359n = lVar;
            this.f193360o = vVar;
            this.f193361p = i12;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f193361p | 1);
            Y41.l<com.avito.android.messenger.conversation.mvi.messages.h0, G0> lVar = this.f193359n;
            androidx.compose.ui.v vVar = this.f193360o;
            i0.this.a(this.f193358m, lVar, vVar, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: UnreadMessagesDividerRenderer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ T1 f193363m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.messenger.conversation.mvi.messages.h0, G0> f193364n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f193365o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f193366p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(T1 t12, Y41.l<? super com.avito.android.messenger.conversation.mvi.messages.h0, G0> lVar, androidx.compose.ui.v vVar, int i12) {
            super(2);
            this.f193363m = t12;
            this.f193364n = lVar;
            this.f193365o = vVar;
            this.f193366p = i12;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f193366p | 1);
            Y41.l<com.avito.android.messenger.conversation.mvi.messages.h0, G0> lVar = this.f193364n;
            androidx.compose.ui.v vVar = this.f193365o;
            i0.this.a(this.f193363m, lVar, vVar, a12, iA2);
            return G0.f406611a;
        }
    }

    @Override // com.avito.android.messenger.conversation.mvi.messages.renderers.a
    @InterfaceC22132o
    @InterfaceC22181t
    public final void a(@Y61.k T1 t12, @Y61.k Y41.l<? super com.avito.android.messenger.conversation.mvi.messages.h0, G0> lVar, @Y61.k androidx.compose.ui.v vVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(-499390584);
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
            if (!(t12 instanceof T1.i)) {
                lVar.invoke(new h0.o(new NonFatalErrorEvent("UnreadMessagesDividerRenderer: Unsupported listItem: " + t12, null, null, null, 14, null)));
                C22039c2 c22039c2Z = bE2.Z();
                if (c22039c2Z != null) {
                    c22039c2Z.f38184d = new a(t12, lVar, vVar, i12);
                    return;
                }
                return;
            }
            com.avito.android.messenger.conversation.mvi.messages.composables.other.y.a(vVar, bE2, (i13 >> 6) & 14, 0);
        }
        C22039c2 c22039c2Z2 = bE2.Z();
        if (c22039c2Z2 != null) {
            c22039c2Z2.f38184d = new b(t12, lVar, vVar, i12);
        }
    }
}
