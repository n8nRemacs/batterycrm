package com.avito.android.bottom_sheet_group;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BottomSheetGroupDialogView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bottom_sheet_group/n;", "Lcom/avito/android/bottom_sheet_group/l;", "_avito_bottom-sheet-group_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class n implements l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f107407a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Button f107408b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final TextView f107409c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f107410d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f107411e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f107412f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f107413g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Integer f107414h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Integer f107415i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f107416j;

    public n(@Y61.k View view, @Y61.k com.avito.konveyor.a aVar, @Y61.k com.avito.konveyor.adapter.h hVar, @Y61.l Button button, @Y61.l TextView textView) {
        this.f107407a = view;
        this.f107408b = button;
        this.f107409c = textView;
        com.jakewharton.rxrelay3.c<G0> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f107410d = cVar;
        com.jakewharton.rxrelay3.c<G0> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f107411e = cVar2;
        this.f107412f = new C41981q0(cVar);
        this.f107413g = new C41981q0(cVar2);
        Context context = view.getContext();
        this.f107414h = context != null ? Integer.valueOf(C35835l0.d(R.attr.blue, context)) : null;
        Context context2 = view.getContext();
        this.f107415i = context2 != null ? Integer.valueOf(C35835l0.d(R.attr.gray28, context2)) : null;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler);
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(hVar, aVar);
        this.f107416j = jVar;
        if (button != null) {
            button.setOnClickListener(null);
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
