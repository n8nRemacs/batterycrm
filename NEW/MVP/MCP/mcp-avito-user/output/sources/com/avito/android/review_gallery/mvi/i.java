package com.avito.android.review_gallery.mvi;

import com.avito.android.arch.mvi.q;
import com.avito.android.review_gallery.mvi.entity.ReviewGalleryInternalAction;
import gn0.C40714c;
import gn0.InterfaceC40712a;
import gn0.InterfaceC40713b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ReviewGalleryFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lgn0/a;", "Lcom/avito/android/review_gallery/mvi/entity/ReviewGalleryInternalAction;", "Lgn0/c;", "Lgn0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class i extends N implements Y41.l<q<InterfaceC40712a, ReviewGalleryInternalAction, C40714c, InterfaceC40713b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f255543l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n f255544m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l f255545n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(f fVar, n nVar, l lVar) {
        super(1);
        this.f255543l = fVar;
        this.f255544m = nVar;
        this.f255545n = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC40712a, ReviewGalleryInternalAction, C40714c, InterfaceC40713b> qVar) {
        q<InterfaceC40712a, ReviewGalleryInternalAction, C40714c, InterfaceC40713b> qVar2 = qVar;
        qVar2.f92009e = this.f255543l;
        qVar2.f92011g = this.f255544m;
        qVar2.f92010f = this.f255545n;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
