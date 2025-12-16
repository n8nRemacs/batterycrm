package com.avito.android.inline_filters.dialog.numeric_range_select;

import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.select.Select;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NumericRangeSelectFilterDialog.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x f171878l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f171879m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(v vVar, x xVar) {
        super(0);
        this.f171878l = xVar;
        this.f171879m = vVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        x xVar = this.f171878l;
        xVar.getClass();
        Select select = xVar.f171939f;
        Input.t(select, "", false, 6);
        select.setRightIcon(R.drawable.common_ic_arrow_down_20);
        v.h(this.f171879m, xVar, xVar.w(), xVar.x());
        return G0.f406611a;
    }
}
