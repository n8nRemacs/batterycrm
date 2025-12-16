package com.avito.android.publish.price_list.domain.use_case;

import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.publish.price_list.mvi.entity.SelectPriceListInternalAction;
import java.util.Set;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ue0.InterfaceC49043a;

/* compiled from: SplUpdateContentUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/price_list/domain/use_case/o;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f238595a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.price_list.domain.c f238596b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49043a f238597c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final i f238598d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final g f238599e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final m f238600f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Q1 f238601g;

    /* compiled from: SplUpdateContentUseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/publish/price_list/mvi/entity/SelectPriceListInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.publish.price_list.domain.use_case.SplUpdateContentUseCase$invoke$1", f = "SplUpdateContentUseCase.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super SelectPriceListInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f238602q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f238603r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Set<String> f238605t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Set<String> set, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f238605t = set;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = o.this.new a(this.f238605t, continuation);
            aVar.f238603r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super SelectPriceListInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
            /*
                r9 = this;
                r0 = 0
                r1 = 1
                java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r3 = r9.f238602q
                if (r3 == 0) goto L19
                if (r3 != r1) goto L11
                kotlin.C42729a0.b(r10)
                goto Lb4
            L11:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L19:
                kotlin.C42729a0.b(r10)
                java.lang.Object r10 = r9.f238603r
                kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.InterfaceC43172j) r10
                com.avito.android.publish.price_list.domain.use_case.o r3 = com.avito.android.publish.price_list.domain.use_case.o.this
                com.avito.android.publish.price_list.domain.c r4 = r3.f238596b
                java.util.List r4 = r4.getGroups()
                ue0.a r5 = r3.f238597c
                if (r4 == 0) goto L50
                com.avito.android.Q1 r6 = r3.f238601g
                r6.getClass()
                kotlin.reflect.n<java.lang.Object>[] r7 = com.avito.android.Q1.f67448x0
                r8 = 17
                r7 = r7[r8]
                com.avito.android.A0$a r6 = r6.f67510s
                DE0.a r6 = r6.a()
                java.lang.Object r6 = r6.invoke()
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L50
                java.util.Set<java.lang.String> r6 = r9.f238605t
                java.util.ArrayList r4 = r5.a(r4, r6)
                goto L54
            L50:
                java.util.ArrayList r4 = r5.b()
            L54:
                com.avito.android.publish.price_list.domain.use_case.i r5 = r3.f238598d
                r5.getClass()
                int r5 = com.avito.android.publish.price_list.domain.use_case.i.a(r4)
                java.lang.Integer r6 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r5)
                com.avito.android.publish.price_list.domain.use_case.g r7 = r3.f238599e
                boolean r7 = r7.f238589a
                if (r7 == 0) goto L79
                if (r6 == 0) goto L6f
                int r7 = r6.intValue()
                if (r7 != 0) goto L79
            L6f:
                java.io.Serializable[] r6 = new java.io.Serializable[r0]
                r7 = 2131953079(0x7f1305b7, float:1.9542619E38)
                com.avito.android.printable_text.PrintableText r6 = com.avito.android.printable_text.b.c(r7, r6)
                goto L93
            L79:
                if (r6 == 0) goto L92
                int r7 = r6.intValue()
                if (r7 != 0) goto L82
                goto L92
            L82:
                int r7 = r6.intValue()
                java.io.Serializable[] r8 = new java.io.Serializable[r1]
                r8[r0] = r6
                r6 = 2131820643(0x7f110063, float:1.9274007E38)
                com.avito.android.printable_text.PrintableText r6 = com.avito.android.printable_text.b.b(r6, r7, r8)
                goto L93
            L92:
                r6 = 0
            L93:
                if (r6 == 0) goto L97
                r7 = r1
                goto L98
            L97:
                r7 = r0
            L98:
                com.avito.android.publish.price_list.domain.use_case.m r8 = r3.f238600f
                boolean r8 = r8.f238593a
                if (r8 == 0) goto La1
                if (r5 <= 0) goto La1
                r0 = r1
            La1:
                com.avito.android.publish.price_list.mvi.entity.SelectPriceListInternalAction$ShowContent r5 = new com.avito.android.publish.price_list.mvi.entity.SelectPriceListInternalAction$ShowContent
                boolean r3 = r3.f238595a
                if (r3 == 0) goto La8
                r7 = r1
            La8:
                r5.<init>(r6, r7, r0, r4)
                r9.f238602q = r1
                java.lang.Object r10 = r10.emit(r5, r9)
                if (r10 != r2) goto Lb4
                return r2
            Lb4:
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.price_list.domain.use_case.o.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public o(@com.avito.android.publish.price_list.di.b boolean z12, @Y61.k com.avito.android.publish.price_list.domain.c cVar, @Y61.k InterfaceC49043a interfaceC49043a, @Y61.k i iVar, @Y61.k g gVar, @Y61.k m mVar, @Y61.k Q1 q12) {
        this.f238595a = z12;
        this.f238596b = cVar;
        this.f238597c = interfaceC49043a;
        this.f238598d = iVar;
        this.f238599e = gVar;
        this.f238600f = mVar;
        this.f238601g = q12;
    }

    @Y61.k
    public final InterfaceC43160i<SelectPriceListInternalAction> a(@Y61.k Set<String> set) {
        return C43175k.G(new a(set, null));
    }
}
