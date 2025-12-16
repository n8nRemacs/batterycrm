package com.avito.android.parameters_sheet;

import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ParametersListDialogView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/parameters_sheet/i;", "Lcom/avito/android/parameters_sheet/h;", "_avito_parameters-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f210842a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f210843b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f210844c;

    public i(@Y61.k d dVar, @Y61.k com.avito.konveyor.adapter.j jVar, boolean z12) {
        com.jakewharton.rxrelay3.c<G0> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f210842a = cVar;
        this.f210843b = new C41981q0(cVar);
        FrameLayout frameLayout = (FrameLayout) dVar.findViewById(R.id.parameters_list_dialog_root);
        RecyclerView recyclerView = (RecyclerView) dVar.findViewById(R.id.recycler_view);
        this.f210844c = recyclerView;
        Button button = (Button) dVar.findViewById(R.id.apply_button);
        recyclerView.setAdapter(jVar);
        if (z12) {
            int iB2 = y6.b(0);
            frameLayout.setPadding(iB2, frameLayout.getPaddingTop(), iB2, frameLayout.getPaddingBottom());
        }
        if (z12) {
            int iT2 = D6.t(button, R.dimen.parameters_sheet_horizontal_padding_redesign);
            D6.c(button, Integer.valueOf(iT2), null, Integer.valueOf(iT2), null, 10);
        }
        button.setOnClickListener(new com.avito.android.order.feature.c(this, 2));
    }
}
