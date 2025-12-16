package com.avito.android.blueprints.publish.date_interval;

import Y41.l;
import com.avito.android.blueprints.publish.date_interval.c;
import com.avito.android.category_parameters.ParameterElement;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DateIntervalItemSubscriber.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/blueprints/publish/date_interval/c$a;", "kotlin.jvm.PlatformType", "dateSelectInfo", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/blueprints/publish/date_interval/c$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class g extends N implements l<c.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N f106153l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f106154m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(l<? super ParameterElement.C29376d, ParameterElement.C29377e> lVar, f fVar) {
        super(1);
        this.f106153l = (N) lVar;
        this.f106154m = fVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.l
    public final G0 invoke(c.a aVar) {
        c.a aVar2 = aVar;
        ParameterElement.C29377e c29377e = (ParameterElement.C29377e) this.f106153l.invoke(aVar2.f106126a);
        if (c29377e != null) {
            boolean z12 = aVar2.f106126a.f117403g;
            f fVar = this.f106154m;
            if (z12) {
                fVar.f106148a.c(aVar2, c29377e);
            } else {
                fVar.f106148a.a(aVar2, c29377e);
            }
        }
        return G0.f406611a;
    }
}
