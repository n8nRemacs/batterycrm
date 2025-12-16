package com.avito.android.advert.item.recall_me;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RecallMeBlockPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlin/G0;", "emit", "(Lkv/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class u<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f78530b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RecallMeBlockItem f78531c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f78532d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f78533e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f78534f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f78535g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Continuation<? super G0>, Object> f78536h;

    /* compiled from: RecallMeBlockPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.advert.item.recall_me.RecallMeBlockPresenterImpl$subscribeToPhoneVerificationResult$2", f = "RecallMeBlockPresenter.kt", i = {0, 1}, l = {206, 212}, m = "emit", n = {"this", "this"}, s = {"L$0", "L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public Object f78537q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f78538r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ u<T> f78539s;

        /* renamed from: t, reason: collision with root package name */
        public int f78540t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(u<? super T> uVar, Continuation<? super a> continuation) {
            super(continuation);
            this.f78539s = uVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f78538r = obj;
            this.f78540t |= BeduinInputModel.MIN_TEXT_VERSION;
            return this.f78539s.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u(o oVar, RecallMeBlockItem recallMeBlockItem, String str, String str2, String str3, Y41.a<G0> aVar, Y41.l<? super Continuation<? super G0>, ? extends Object> lVar) {
        this.f78530b = oVar;
        this.f78531c = recallMeBlockItem;
        this.f78532d = str;
        this.f78533e = str2;
        this.f78534f = str3;
        this.f78535g = aVar;
        this.f78536h = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    @Y61.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(@Y61.k kv.C43501a r10, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.avito.android.advert.item.recall_me.u.a
            if (r0 == 0) goto L13
            r0 = r11
            com.avito.android.advert.item.recall_me.u$a r0 = (com.avito.android.advert.item.recall_me.u.a) r0
            int r1 = r0.f78540t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f78540t = r1
            goto L18
        L13:
            com.avito.android.advert.item.recall_me.u$a r0 = new com.avito.android.advert.item.recall_me.u$a
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f78538r
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.f78540t
            r8 = 2
            r2 = 1
            if (r1 == 0) goto L40
            if (r1 == r2) goto L38
            if (r1 != r8) goto L30
            java.lang.Object r10 = r0.f78537q
            com.avito.android.advert.item.recall_me.u r10 = (com.avito.android.advert.item.recall_me.u) r10
            kotlin.C42729a0.b(r11)
            goto L74
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            java.lang.Object r10 = r0.f78537q
            com.avito.android.advert.item.recall_me.u r10 = (com.avito.android.advert.item.recall_me.u) r10
            kotlin.C42729a0.b(r11)
            goto L62
        L40:
            kotlin.C42729a0.b(r11)
            Ju.c r10 = r10.f413261b
            boolean r10 = r10 instanceof com.avito.android.code_check_public.CodeCheckLink.b.C3493b
            if (r10 == 0) goto L73
            r0.f78537q = r9
            r0.f78540t = r2
            int r10 = com.avito.android.advert.item.recall_me.o.f78483n
            com.avito.android.advert.item.recall_me.o r1 = r9.f78530b
            com.avito.android.advert.item.recall_me.RecallMeBlockItem r2 = r9.f78531c
            java.lang.String r4 = r9.f78533e
            java.lang.String r5 = r9.f78534f
            java.lang.String r3 = r9.f78532d
            r6 = r0
            java.lang.Object r10 = r1.O(r2, r3, r4, r5, r6)
            if (r10 != r7) goto L61
            return r7
        L61:
            r10 = r9
        L62:
            kotlin.G0 r11 = kotlin.G0.f406611a
            Y41.l<kotlin.coroutines.Continuation<? super kotlin.G0>, java.lang.Object> r11 = r10.f78536h
            r0.f78537q = r10
            r0.f78540t = r8
            com.avito.android.advert.item.recall_me.w r11 = (com.avito.android.advert.item.recall_me.w) r11
            java.lang.Object r11 = r11.invoke(r0)
            if (r11 != r7) goto L74
            return r7
        L73:
            r10 = r9
        L74:
            Y41.a<kotlin.G0> r10 = r10.f78535g
            com.avito.android.advert.item.recall_me.x r10 = (com.avito.android.advert.item.recall_me.x) r10
            r10.invoke()
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.recall_me.u.emit(kv.a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
