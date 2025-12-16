package com.avito.android.search.filter.adapter.local_priority;

import Y41.l;
import com.avito.android.search.filter.converter.ParameterElement;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LocalPriorityItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LCp0/e;", "it", "Lkotlin/G0;", "invoke", "(LCp0/e;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class e extends N implements l<Cp0.e, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.v f262487l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f262488m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ParameterElement.v vVar, f fVar) {
        super(1);
        this.f262487l = vVar;
        this.f262488m = fVar;
    }

    @Override // Y41.l
    public final G0 invoke(Cp0.e eVar) {
        this.f262488m.f262489b.accept(((ParameterElement.v.b) this.f262487l).b(eVar));
        return G0.f406611a;
    }
}
