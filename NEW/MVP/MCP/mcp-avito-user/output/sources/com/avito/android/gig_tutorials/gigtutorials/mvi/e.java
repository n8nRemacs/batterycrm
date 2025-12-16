package com.avito.android.gig_tutorials.gigtutorials.mvi;

import Y41.l;
import com.avito.android.arch.mvi.q;
import com.avito.android.gig_tutorials.gigtutorials.mvi.entity.GigTutorialsInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GigTutorialsFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LOH/a;", "Lcom/avito/android/gig_tutorials/gigtutorials/mvi/entity/GigTutorialsInternalAction;", "LOH/c;", "LOH/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class e extends N implements l<q<OH.a, GigTutorialsInternalAction, OH.c, OH.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f161145l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f161146m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j f161147n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ h f161148o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, a aVar, j jVar, h hVar) {
        super(1);
        this.f161145l = cVar;
        this.f161146m = aVar;
        this.f161147n = jVar;
        this.f161148o = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<OH.a, GigTutorialsInternalAction, OH.c, OH.b> qVar) {
        q<OH.a, GigTutorialsInternalAction, OH.c, OH.b> qVar2 = qVar;
        qVar2.f92008d = this.f161145l;
        qVar2.f92009e = this.f161146m;
        qVar2.f92011g = this.f161147n;
        qVar2.f92010f = this.f161148o;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
