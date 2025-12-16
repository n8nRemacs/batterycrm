package com.avito.android.blueprints.job_suggest;

import com.avito.android.blueprints.job_suggest.c;
import com.avito.android.category_parameters.ParameterElement;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: JobSuggestInstitutesPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.r f106046l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f106047m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ParameterElement.r rVar, c cVar) {
        super(0);
        this.f106046l = rVar;
        this.f106047m = cVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        ParameterElement.r rVar = this.f106046l;
        this.f106047m.f106041b.w(new c.a(rVar.f117528e, rVar.f117530g, rVar.f117532i));
        return G0.f406611a;
    }
}
