package com.avito.android.rating.details.answer.photo.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.rating.details.answer.photo.mvi.entity.RatingAddAnswerPhotoInternalAction;
import com.avito.android.rating.details.answer.photo.mvi.entity.RatingAddAnswerPhotoState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import wg0.InterfaceC49619a;
import wg0.InterfaceC49620b;

/* compiled from: RatingAddAnswerPhotoFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lwg0/a;", "Lcom/avito/android/rating/details/answer/photo/mvi/entity/RatingAddAnswerPhotoInternalAction;", "Lcom/avito/android/rating/details/answer/photo/mvi/entity/RatingAddAnswerPhotoState;", "Lwg0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class h extends N implements Y41.l<q<InterfaceC49619a, RatingAddAnswerPhotoInternalAction, RatingAddAnswerPhotoState, InterfaceC49620b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f246757l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f246758m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f246759n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ m f246760o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ k f246761p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, d dVar, ScreenPerformanceTracker screenPerformanceTracker, m mVar, k kVar) {
        super(1);
        this.f246757l = fVar;
        this.f246758m = dVar;
        this.f246759n = screenPerformanceTracker;
        this.f246760o = mVar;
        this.f246761p = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC49619a, RatingAddAnswerPhotoInternalAction, RatingAddAnswerPhotoState, InterfaceC49620b> qVar) {
        q<InterfaceC49619a, RatingAddAnswerPhotoInternalAction, RatingAddAnswerPhotoState, InterfaceC49620b> qVar2 = qVar;
        qVar2.f92008d = this.f246757l;
        qVar2.f92009e = this.f246758m;
        qVar2.f92011g = new o(this.f246759n, this.f246760o);
        qVar2.f92010f = this.f246761p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
