package com.avito.android.inline_filters.dialog.select;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.K2;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: RadioSelectFilterDialog.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class y extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ B f172209l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ D f172210m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(B b12, D d12) {
        super(0);
        this.f172209l = b12;
        this.f172210m = d12;
    }

    @Override // Y41.a
    public final G0 invoke() throws Resources.NotFoundException {
        B b12 = this.f172209l;
        int i12 = C35835l0.g(b12.f172001f.getContext()).y;
        RecyclerView recyclerView = b12.f172002g;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        Integer numValueOf = adapter != null ? Integer.valueOf(adapter.getItemCount()) : null;
        int iIntValue = (recyclerView.getChildCount() > 0 && numValueOf != null) ? numValueOf.intValue() * recyclerView.getChildAt(0).getMeasuredHeight() : 0;
        TypedValue typedValue = new TypedValue();
        View view = b12.f172001f;
        view.getResources().getValue(R.dimen.coefficient_for_max_recycler_height, typedValue, true);
        boolean z12 = ((float) i12) * typedValue.getFloat() < ((float) iIntValue);
        com.avito.android.lib.design.bottom_sheet.d dVar = b12.f171146b;
        dVar.J(true);
        if (z12) {
            this.f172210m.l(0);
            K2.b(view, new x(b12));
            dVar.K(true);
            com.avito.android.lib.design.bottom_sheet.d.I(dVar, false);
        }
        return G0.f406611a;
    }
}
