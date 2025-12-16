package com.avito.android.search.filter.adapter.inline_select;

import Y41.p;
import com.avito.android.search.filter.converter.ParameterElement;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InlineSelectItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LCp0/e;", "value", "", "selected", "Lkotlin/G0;", "invoke", "(LCp0/e;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class f extends N implements p<Cp0.e, Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.v.b f262400l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f262401m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ParameterElement.v.b bVar, g gVar) {
        super(2);
        this.f262400l = bVar;
        this.f262401m = gVar;
    }

    @Override // Y41.p
    public final G0 invoke(Cp0.e eVar, Boolean bool) {
        Cp0.e eVar2 = eVar;
        if (bool.booleanValue()) {
            ParameterElement.v.b bVar = this.f262400l;
            bVar.f262844g = eVar2;
            this.f262401m.f262402b.accept(bVar);
        }
        return G0.f406611a;
    }
}
