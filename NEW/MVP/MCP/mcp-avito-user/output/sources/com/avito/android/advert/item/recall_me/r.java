package com.avito.android.advert.item.recall_me;

import com.yandex.metrica.YandexMetricaDefaultValues;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import yi0.C50255a;

/* compiled from: RecallMeBlockPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert.item.recall_me.RecallMeBlockPresenterImpl$loadContactInfo$1", f = "RecallMeBlockPresenter.kt", i = {3, 3, 4}, l = {81, 81, 84, 87, YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS}, m = "invokeSuspend", n = {"contactInfo", "phone", "phone"}, s = {"L$3", "L$4", "L$2"})
/* loaded from: classes10.dex */
final class r extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public C50255a f78507q;

    /* renamed from: r, reason: collision with root package name */
    public Object f78508r;

    /* renamed from: s, reason: collision with root package name */
    public Object f78509s;

    /* renamed from: t, reason: collision with root package name */
    public Object f78510t;

    /* renamed from: u, reason: collision with root package name */
    public String f78511u;

    /* renamed from: v, reason: collision with root package name */
    public int f78512v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f78513w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ z f78514x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ RecallMeBlockItem f78515y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(o oVar, z zVar, RecallMeBlockItem recallMeBlockItem, Continuation<? super r> continuation) {
        super(2, continuation);
        this.f78513w = oVar;
        this.f78514x = zVar;
        this.f78515y = recallMeBlockItem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new r(this.f78513w, this.f78514x, this.f78515y, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((r) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.recall_me.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
