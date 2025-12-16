package com.avito.android.bottom_sheet_group.bottomsheetgroup;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import kotlin.Metadata;

/* compiled from: BottomSheetGroupMviView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bottom_sheet_group/bottomsheetgroup/f;", "Lcom/avito/android/bottom_sheet_group/bottomsheetgroup/e;", "_avito_bottom-sheet-group_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f107218a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Button f107219b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final TextView f107220c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Integer f107221d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Integer f107222e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f107223f;

    public f(@Y61.k View view, @Y61.k com.avito.konveyor.a aVar, @Y61.k com.avito.konveyor.adapter.h hVar, @Y61.l Button button, @Y61.l TextView textView) {
        this.f107218a = view;
        this.f107219b = button;
        this.f107220c = textView;
        Context context = view.getContext();
        this.f107221d = context != null ? Integer.valueOf(C35835l0.d(R.attr.blue, context)) : null;
        Context context2 = view.getContext();
        this.f107222e = context2 != null ? Integer.valueOf(C35835l0.d(R.attr.gray28, context2)) : null;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler);
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(hVar, aVar);
        this.f107223f = jVar;
        if (button != null) {
            D6.w(button);
        }
        if (recyclerView != null) {
            view.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
        }
        if (recyclerView == null) {
            return;
        }
        recyclerView.setAdapter(jVar);
    }
}
