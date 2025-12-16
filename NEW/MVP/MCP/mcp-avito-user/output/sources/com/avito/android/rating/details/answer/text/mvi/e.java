package com.avito.android.rating.details.answer.text.mvi;

import Y41.l;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.rating.details.answer.text.mvi.entity.RatingAddAnswerTextInternalAction;
import com.avito.android.rating.details.answer.text.mvi.entity.RatingAddAnswerTextState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import xg0.InterfaceC49941a;
import xg0.InterfaceC49942b;

/* compiled from: RatingAddAnswerTextFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lxg0/a;", "Lcom/avito/android/rating/details/answer/text/mvi/entity/RatingAddAnswerTextInternalAction;", "Lcom/avito/android/rating/details/answer/text/mvi/entity/RatingAddAnswerTextState;", "Lxg0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class e extends N implements l<q<InterfaceC49941a, RatingAddAnswerTextInternalAction, RatingAddAnswerTextState, InterfaceC49942b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f246873l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f246874m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f246875n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j f246876o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f246877p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, j jVar, h hVar) {
        super(1);
        this.f246873l = cVar;
        this.f246874m = aVar;
        this.f246875n = screenPerformanceTracker;
        this.f246876o = jVar;
        this.f246877p = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC49941a, RatingAddAnswerTextInternalAction, RatingAddAnswerTextState, InterfaceC49942b> qVar) {
        q<InterfaceC49941a, RatingAddAnswerTextInternalAction, RatingAddAnswerTextState, InterfaceC49942b> qVar2 = qVar;
        qVar2.f92008d = this.f246873l;
        qVar2.f92009e = this.f246874m;
        qVar2.f92011g = new o(this.f246875n, this.f246876o);
        qVar2.f92010f = this.f246877p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
