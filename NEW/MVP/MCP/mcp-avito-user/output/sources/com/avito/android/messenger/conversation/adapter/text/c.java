package com.avito.android.messenger.conversation.adapter.text;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.MessageDeliveryStatus;
import com.avito.android.messenger.conversation.adapter.B;
import com.avito.android.messenger.conversation.adapter.o;
import com.avito.android.messenger.conversation.adapter.p;
import com.avito.android.messenger.conversation.adapter.q;
import com.avito.android.messenger.conversation.adapter.r;
import com.avito.android.messenger.conversation.adapter.s;
import com.avito.android.messenger.conversation.adapter.t;
import com.avito.android.messenger.conversation.adapter.u;
import com.avito.android.messenger.conversation.adapter.v;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: OutgoingTextMessageView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/adapter/text/c;", "Lcom/avito/android/messenger/conversation/adapter/B;", "Lcom/avito/android/messenger/conversation/adapter/text/d;", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface c extends B, d {

    /* compiled from: OutgoingTextMessageView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: OutgoingTextMessageView.kt */
    @P
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/conversation/adapter/text/c$b;", "Lcom/avito/android/messenger/conversation/adapter/text/c;", "Lcom/avito/android/messenger/conversation/adapter/text/d;", "Lcom/avito/android/messenger/conversation/adapter/o;", "Lcom/avito/android/messenger/conversation/adapter/u;", "Lcom/avito/android/messenger/conversation/adapter/s;", "Lcom/avito/android/messenger/conversation/adapter/q;", "Lcom/avito/konveyor/adapter/b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.avito.konveyor.adapter.b implements c, d, o, u, s, q {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f189294b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p f189295c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ v f189296d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ t f189297e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ r f189298f;

        public b(@k View view) {
            super(view);
            this.f189294b = new i(view);
            this.f189295c = new p(view);
            this.f189296d = new v(view);
            this.f189297e = new t(view);
            this.f189298f = new r(view);
        }

        @Override // com.avito.android.messenger.conversation.adapter.m
        public final void KC(@k Y41.a<Boolean> aVar) {
            this.f189294b.f189303c.f189259d = aVar;
        }

        @Override // com.avito.android.messenger.conversation.adapter.q
        public final void QS() {
            this.f189298f.QS();
        }

        @Override // com.avito.android.messenger.conversation.adapter.o
        public final void S6(@l String str) {
            this.f189295c.S6(str);
        }

        @Override // com.avito.android.messenger.conversation.adapter.text.d
        public final void W30(@k Y41.l lVar, @k List list) {
            this.f189294b.W30(lVar, list);
        }

        @Override // com.avito.android.messenger.conversation.adapter.o
        public final void b0(@k String str) {
            this.f189295c.b0(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.avito.android.messenger.conversation.adapter.m
        public final void c(@k Y41.a<G0> aVar) {
            this.f189294b.f189303c.f189258c = (N) aVar;
        }

        @Override // com.avito.konveyor.adapter.b, TV0.e
        public final void j5() {
            this.f189294b.j5();
        }

        @Override // com.avito.android.messenger.conversation.adapter.u
        public final void m80(@k Y41.a<G0> aVar) {
            this.f189296d.m80(aVar);
        }

        @Override // com.avito.android.messenger.conversation.adapter.s
        public final void n60(boolean z12) {
            this.f189297e.n60(z12);
        }

        @Override // com.avito.android.messenger.conversation.adapter.u
        public final void qB(@k MessageDeliveryStatus messageDeliveryStatus) {
            this.f189296d.qB(messageDeliveryStatus);
        }

        @Override // com.avito.android.messenger.conversation.adapter.q
        public final void wb(@k Y41.a<G0> aVar) {
            this.f189298f.wb(aVar);
        }
    }
}
