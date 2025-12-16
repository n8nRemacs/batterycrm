package com.avito.android.messenger.conversation.mvi.messages.composables.other;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import com.avito.android.messenger.conversation.T1;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: SpamActionsContent.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_messenger_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class o {

    /* compiled from: SpamActionsContent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f192813l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(String str) {
            return G0.f406611a;
        }
    }

    /* compiled from: SpamActionsContent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.l<Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f192814l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Boolean bool) {
            bool.booleanValue();
            return G0.f406611a;
        }
    }

    /* compiled from: SpamActionsContent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.messages.composables.other.SpamActionsContentKt$SpamActionsContent$3$1", f = "SpamActionsContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, G0> f192815q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f192816r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Y41.l lVar, Continuation continuation) {
            super(2, continuation);
            this.f192815q = lVar;
            this.f192816r = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new c(this.f192816r, this.f192815q, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            this.f192815q.invoke(this.f192816r);
            return G0.f406611a;
        }
    }

    /* compiled from: SpamActionsContent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f192817l = new d();

        public d() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: SpamActionsContent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f192818l = new e();

        public e() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: SpamActionsContent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Boolean, G0> f192819l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Y41.l<? super Boolean, G0> lVar) {
            super(0);
            this.f192819l = lVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f192819l.invoke(Boolean.TRUE);
            return G0.f406611a;
        }
    }

    /* compiled from: SpamActionsContent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Boolean, G0> f192820l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(Y41.l<? super Boolean, G0> lVar) {
            super(0);
            this.f192820l = lVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f192820l.invoke(Boolean.FALSE);
            return G0.f406611a;
        }
    }

    /* compiled from: SpamActionsContent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class h extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ T1.g.a f192821l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f192822m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ boolean f192823n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f192824o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, G0> f192825p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Boolean, G0> f192826q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f192827r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f192828s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(T1.g.a aVar, String str, boolean z12, androidx.compose.ui.v vVar, Y41.l<? super String, G0> lVar, Y41.l<? super Boolean, G0> lVar2, int i12, int i13) {
            super(2);
            this.f192821l = aVar;
            this.f192822m = str;
            this.f192823n = z12;
            this.f192824o = vVar;
            this.f192825p = lVar;
            this.f192826q = lVar2;
            this.f192827r = i12;
            this.f192828s = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f192827r | 1);
            String str = this.f192822m;
            androidx.compose.ui.v vVar = this.f192824o;
            o.a(this.f192821l, str, this.f192823n, vVar, this.f192825p, this.f192826q, a12, iA2, this.f192828s);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e2  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k com.avito.android.messenger.conversation.T1.g.a r38, @Y61.k java.lang.String r39, boolean r40, @Y61.l androidx.compose.ui.v r41, @Y61.l Y41.l<? super java.lang.String, kotlin.G0> r42, @Y61.l Y41.l<? super java.lang.Boolean, kotlin.G0> r43, @Y61.l androidx.compose.runtime.A r44, int r45, int r46) {
        /*
            Method dump skipped, instructions count: 973
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.messages.composables.other.o.a(com.avito.android.messenger.conversation.T1$g$a, java.lang.String, boolean, androidx.compose.ui.v, Y41.l, Y41.l, androidx.compose.runtime.A, int, int):void");
    }
}
