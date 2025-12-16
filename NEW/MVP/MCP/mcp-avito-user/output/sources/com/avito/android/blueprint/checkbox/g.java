package com.avito.android.blueprint.checkbox;

import JO.m;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.remote.model.category_parameters.TooltipOptions;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PublishCheckboxPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isChecked", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class g extends N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.C.b f105389l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f105390m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h f105391n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ParameterElement.C.b bVar, j jVar, h hVar) {
        super(1);
        this.f105389l = bVar;
        this.f105390m = jVar;
        this.f105391n = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        Boolean bool2 = bool;
        boolean zBooleanValue = bool2.booleanValue();
        ParameterElement.C.b bVar = this.f105389l;
        m mVar = (m) C42745f0.G(bVar.f117236E);
        if (mVar != null) {
            m mVarA = m.a(mVar, zBooleanValue);
            this.f105391n.f105392b.accept(new Ij.b(bVar.f117181b, mVarA, null, 4, null));
        }
        TooltipOptions tooltipOptions = bVar.f117224t;
        this.f105390m.Rd(tooltipOptions != null ? L.f(tooltipOptions.getShowOnValue(), bool2) : false ? tooltipOptions != null ? tooltipOptions.getText() : null : null);
        return G0.f406611a;
    }
}
