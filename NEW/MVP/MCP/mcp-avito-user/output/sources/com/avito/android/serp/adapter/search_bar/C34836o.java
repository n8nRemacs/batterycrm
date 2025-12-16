package com.avito.android.serp.adapter.search_bar;

import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;

/* compiled from: SearchBarItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LBX/d;", VoiceInfo.STATE, "Lkotlin/G0;", "<anonymous>", "(LBX/d;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.serp.adapter.search_bar.SearchBarItemPresenterImpl$initLoyaltyBonusesMenuIcon$2", f = "SearchBarItemPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.serp.adapter.search_bar.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34836o extends SuspendLambda implements Y41.p<BX.d, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f271645q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C34840t f271646r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.onboarding_manager.e f271647s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34836o(C34840t c34840t, com.avito.android.onboarding_manager.e eVar, Continuation<? super C34836o> continuation) {
        super(2, continuation);
        this.f271646r = c34840t;
        this.f271647s = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C34836o c34836o = new C34836o(this.f271646r, this.f271647s, continuation);
        c34836o.f271645q = obj;
        return c34836o;
    }

    @Override // Y41.p
    public final Object invoke(BX.d dVar, Continuation<? super G0> continuation) {
        return ((C34836o) create(dVar, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.serp.adapter.search_bar.C34836o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
