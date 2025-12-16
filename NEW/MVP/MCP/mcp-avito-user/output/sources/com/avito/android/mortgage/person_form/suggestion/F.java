package com.avito.android.mortgage.person_form.suggestion;

import androidx.compose.foundation.lazy.m0;
import androidx.compose.runtime.internal.C22096n;
import com.avito.android.mortgage.api.model.SuggestionContainer;
import com.avito.android.mortgage.api.model.suggestions.Suggestion;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SuggestionScreen.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class F extends N implements Y41.l<m0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ H00.c f201346l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ N f201347m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ N f201348n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public F(H00.c cVar, Y41.l<? super SuggestionContainer<? extends Suggestion>, G0> lVar, Y41.a<G0> aVar) {
        super(1);
        this.f201346l = cVar;
        this.f201347m = (N) lVar;
        this.f201348n = (N) aVar;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [Y41.a, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r5v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.l
    public final G0 invoke(m0 m0Var) {
        List<SuggestionContainer<? extends Suggestion>> list;
        m0 m0Var2 = m0Var;
        H00.c cVar = this.f201346l;
        List list2 = cVar.f6919g;
        if (list2 == null) {
            list2 = C42784z0.f406748b;
        }
        m0Var2.a(list2.size(), null, new D(B.f201341l, list2), new C22096n(-632812321, new E(this.f201347m, list2), true));
        String str = cVar.f6916d;
        if (str.length() > 0 && ((list = cVar.f6919g) == null || list.isEmpty())) {
            C32667a.f201376a.getClass();
            m0Var2.c(null, null, C32667a.f201377b);
        }
        if (str.length() > 0) {
            m0Var2.c(null, null, new C22096n(1746254576, new A(this.f201348n), true));
        }
        return G0.f406611a;
    }
}
