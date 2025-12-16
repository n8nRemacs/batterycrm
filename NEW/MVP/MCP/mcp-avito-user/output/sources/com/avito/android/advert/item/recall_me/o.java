package com.avito.android.advert.item.recall_me;

import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ButtonDTO;
import com.avito.android.remote.model.RecallMeBlockDTO;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;
import t7.InterfaceC48510a;
import u7.C48810a;
import v7.C49175a;

/* compiled from: RecallMeBlockPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/recall_me/o;", "Lcom/avito/android/advert/item/recall_me/n;", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class o implements n {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f78483n = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f78484b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C48810a f78485c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.recall_me.domain.n f78486d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28167d f78487e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final j f78488f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final E f78489g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48510a f78490h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C43238h f78491i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public N0 f78492j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public N0 f78493k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public N0 f78494l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public N0 f78495m;

    /* compiled from: RecallMeBlockPresenter.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/advert/item/recall_me/o$a;", "", "<init>", "()V", "", "COUNTRY_CODE_END_INDEX", "I", "HTTP_STATUS_CODE_CONTINUE", "", "RU_COUNTRY_CODE", "Ljava/lang/String;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RecallMeBlockPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.item.recall_me.RecallMeBlockPresenterImpl$saveLastEnteredPhone$1", f = "RecallMeBlockPresenter.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f78496q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f78498s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f78498s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return o.this.new b(this.f78498s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f78496q;
            if (i12 == 0) {
                C42729a0.b(obj);
                j jVar = o.this.f78488f;
                this.f78496q = 1;
                if (jVar.f(this.f78498s, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public o(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k C48810a c48810a, @Y61.k com.avito.android.recall_me.domain.n nVar, @Y61.k InterfaceC28167d interfaceC28167d, @Y61.k j jVar, @Y61.k E e12, @Y61.k InterfaceC48510a interfaceC48510a, @Y61.k R0 r02) {
        this.f78484b = aVar;
        this.f78485c = c48810a;
        this.f78486d = nVar;
        this.f78487e = interfaceC28167d;
        this.f78488f = jVar;
        this.f78489g = e12;
        this.f78490h = interfaceC48510a;
        this.f78491i = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.b()));
    }

    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(com.avito.android.advert.item.recall_me.o r23, java.lang.String r24, java.lang.String r25, com.avito.android.advert.item.recall_me.RecallMeBlockItem r26, com.avito.android.advert.item.recall_me.z r27, java.lang.String r28, java.lang.String r29, kotlin.coroutines.jvm.internal.ContinuationImpl r30) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.recall_me.o.k(com.avito.android.advert.item.recall_me.o, java.lang.String, java.lang.String, com.avito.android.advert.item.recall_me.RecallMeBlockItem, com.avito.android.advert.item.recall_me.z, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.advert.item.recall_me.n
    public final void K() {
        Q0.d(this.f78491i.f411905b);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O(com.avito.android.advert.item.recall_me.RecallMeBlockItem r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof com.avito.android.advert.item.recall_me.t
            if (r0 == 0) goto L14
            r0 = r13
            com.avito.android.advert.item.recall_me.t r0 = (com.avito.android.advert.item.recall_me.t) r0
            int r1 = r0.f78529v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f78529v = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            com.avito.android.advert.item.recall_me.t r0 = new com.avito.android.advert.item.recall_me.t
            r0.<init>(r8, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r7.f78527t
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f78529v
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            java.lang.String r12 = r7.f78526s
            com.avito.android.advert.item.recall_me.RecallMeBlockItem r9 = r7.f78525r
            com.avito.android.advert.item.recall_me.o r10 = r7.f78524q
            kotlin.C42729a0.b(r13)
            goto L55
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            kotlin.C42729a0.b(r13)
            java.lang.String r13 = r9.f78469g
            r7.f78524q = r8
            r7.f78525r = r9
            r7.f78526s = r12
            r7.f78529v = r2
            r5 = 0
            r6 = 0
            com.avito.android.recall_me.domain.n r1 = r8.f78486d
            r2 = r13
            r3 = r11
            r4 = r10
            java.lang.Object r13 = r1.f(r2, r3, r4, r5, r6, r7)
            if (r13 != r0) goto L54
            return r0
        L54:
            r10 = r8
        L55:
            com.avito.android.remote.model.TypedResult r13 = (com.avito.android.remote.model.TypedResult) r13
            boolean r11 = r13 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r11 == 0) goto La2
            com.avito.android.remote.model.TypedResult$Success r13 = (com.avito.android.remote.model.TypedResult.Success) r13
            java.lang.Object r11 = r13.getResult()
            com.avito.android.remote.SaveResponse r11 = (com.avito.android.remote.SaveResponse) r11
            boolean r11 = r11.getSuccess()
            if (r11 == 0) goto L86
            t7.a r11 = r10.f78490h
            if (r12 != 0) goto L71
            com.avito.android.advert.item.recall_me.E r12 = r10.f78489g
            java.lang.String r12 = r12.f78458a
        L71:
            r11.j(r12)
            java.lang.String r9 = r9.f78469g
            java.lang.Object r11 = r13.getResult()
            com.avito.android.remote.SaveResponse r11 = (com.avito.android.remote.SaveResponse) r11
            java.lang.Long r11 = r11.getRequestId()
            com.avito.android.advert.item.recall_me.d r10 = r10.f78487e
            r10.a(r11, r9)
            goto Lab
        L86:
            t7.a r9 = r10.f78490h
            java.lang.Object r11 = r13.getResult()
            com.avito.android.remote.SaveResponse r11 = (com.avito.android.remote.SaveResponse) r11
            com.avito.android.remote.RecallMeError r11 = r11.getError()
            if (r11 == 0) goto L9a
            java.lang.String r11 = r11.getMessage()
            if (r11 != 0) goto L9e
        L9a:
            com.avito.android.advert.item.recall_me.E r10 = r10.f78489g
            java.lang.String r11 = r10.f78462e
        L9e:
            r9.j(r11)
            goto Lab
        La2:
            t7.a r9 = r10.f78490h
            com.avito.android.advert.item.recall_me.E r10 = r10.f78489g
            java.lang.String r10 = r10.f78461d
            r9.o1(r10)
        Lab:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.recall_me.o.O(com.avito.android.advert.item.recall_me.RecallMeBlockItem, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        CharSequence charSequenceC;
        z zVar = (z) eVar;
        RecallMeBlockItem recallMeBlockItem = (RecallMeBlockItem) aVar;
        N0 n02 = this.f78495m;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        p pVar = new p(this, zVar, null);
        C43238h c43238h = this.f78491i;
        this.f78495m = C43259k.d(c43238h, null, null, pVar, 3);
        Context f78455i = zVar.getF78455i();
        C48810a c48810a = this.f78485c;
        c48810a.getClass();
        RecallMeBlockDTO recallMeBlockDTO = recallMeBlockItem.f78470h;
        AttributedText disclaimer = recallMeBlockDTO.getDisclaimer();
        if (disclaimer != null) {
            disclaimer.setOnDeepLinkClickListener(new com.avito.android.tariff.cpa.configure_info.items.feature.e(c48810a, 23));
            charSequenceC = c48810a.f439802b.c(f78455i, disclaimer);
        } else {
            charSequenceC = null;
        }
        String title = recallMeBlockDTO.getTitle();
        ButtonDTO button = recallMeBlockDTO.getButton();
        String text = button.getText();
        button.getLink();
        zVar.Jl(new v7.b(title, new C49175a(text), recallMeBlockDTO.getDescription(), charSequenceC, recallMeBlockDTO.getSuccessMessage()), new q(this, recallMeBlockItem, zVar));
        G0 g02 = G0.f406611a;
        this.f78487e.c(recallMeBlockItem.f78469g);
        N0 n03 = this.f78494l;
        if (n03 != null) {
            ((V0) n03).c(null);
        }
        this.f78494l = C43259k.d(c43238h, null, null, new r(this, zVar, recallMeBlockItem, null), 3);
    }

    @Override // com.avito.android.advert.item.recall_me.n
    public final void q2(@Y61.k String str) {
        N0 n02 = this.f78493k;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        this.f78493k = C43259k.d(this.f78491i, null, null, new b(str, null), 3);
    }
}
