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

/* compiled from: MultiselectFilterDialog.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.inline_filters.dialog.select.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31033c extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C31039i f172143l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31033c(C31039i c31039i) {
        super(0);
        this.f172143l = c31039i;
    }

    @Override // Y41.a
    public final G0 invoke() throws Resources.NotFoundException {
        C31039i c31039i = this.f172143l;
        int i12 = C35835l0.g(c31039i.f172163g.getContext()).y;
        RecyclerView recyclerView = c31039i.f172164h;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        Integer numValueOf = adapter != null ? Integer.valueOf(adapter.getItemCount()) : null;
        int iIntValue = (recyclerView.getChildCount() > 0 && numValueOf != null) ? numValueOf.intValue() * recyclerView.getChildAt(0).getMeasuredHeight() : 0;
        TypedValue typedValue = new TypedValue();
        View view = c31039i.f172163g;
        view.getResources().getValue(R.dimen.coefficient_for_max_recycler_height, typedValue, true);
        boolean z12 = ((float) i12) * typedValue.getFloat() < ((float) iIntValue);
        com.avito.android.lib.design.bottom_sheet.d dVar = c31039i.f171146b;
        dVar.J(true);
        if (z12) {
            ((C31043m) c31039i.f171147c).l(0);
            K2.b(view, new C31032b(c31039i));
            dVar.K(true);
            com.avito.android.lib.design.bottom_sheet.d.I(dVar, false);
        }
        return G0.f406611a;
    }
}
