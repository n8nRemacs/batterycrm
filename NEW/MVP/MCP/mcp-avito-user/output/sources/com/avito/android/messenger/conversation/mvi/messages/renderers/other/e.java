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

/* compiled from: SpamActionsContentRenderer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/renderers/other/e;", "Lcom/avito/android/messenger/conversation/mvi/messages/renderers/a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e extends com.avito.android.messenger.conversation.mvi.messages.renderers.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final e f193517a = new e();

    /* compiled from: SpamActionsContentRenderer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ T1 f193519m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ l<h0, G0> f193520n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ v f193521o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f193522p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(T1 t12, l<? super h0, G0> lVar, v vVar, int i12) {
            super(2);
            this.f193519m = t12;
            this.f193520n = lVar;
            this.f193521o = vVar;
            this.f193522p = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f193522p | 1);
            l<h0, G0> lVar = this.f193520n;
            v vVar = this.f193521o;
            e.this.a(this.f193519m, lVar, vVar, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: SpamActionsContentRenderer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "remoteId", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l<h0, G0> f193523l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(l<? super h0, G0> lVar) {
            super(1);
            this.f193523l = lVar;
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            this.f193523l.invoke(new h0.s(str));
            return G0.f406611a;
        }
    }

    /* compiled from: SpamActionsContentRenderer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isSpam", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l<h0, G0> f193524l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ T1 f193525m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(l<? super h0, G0> lVar, T1 t12) {
            super(1);
            this.f193524l = lVar;
            this.f193525m = t12;
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            this.f193524l.invoke(new h0.w((T1.g) this.f193525m, bool.booleanValue()));
            return G0.f406611a;
        }
    }

    /* compiled from: SpamActionsContentRenderer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements p<A, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ T1 f193527m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ l<h0, G0> f193528n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ v f193529o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f193530p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(T1 t12, l<? super h0, G0> lVar, v vVar, int i12) {
            super(2);
            this.f193527m = t12;
            this.f193528n = lVar;
            this.f193529o = vVar;
            this.f193530p = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f193530p | 1);
            l<h0, G0> lVar = this.f193528n;
            v vVar = this.f193529o;
            e.this.a(this.f193527m, lVar, vVar, a12, iA2);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e5  */
    @Override // com.avito.android.messenger.conversation.mvi.messages.renderers.a
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@Y61.k com.avito.android.messenger.conversation.T1 r17, @Y61.k Y41.l<? super com.avito.android.messenger.conversation.mvi.messages.h0, kotlin.G0> r18, @Y61.k androidx.compose.ui.v r19, @Y61.l androidx.compose.runtime.A r20, int r21) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.messages.renderers.other.e.a(com.avito.android.messenger.conversation.T1, Y41.l, androidx.compose.ui.v, androidx.compose.runtime.A, int):void");
    }
}
