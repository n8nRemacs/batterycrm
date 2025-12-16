package com.avito.android.auto_evidence_request;

import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.component.toolbar.AppBarLayoutWithTextAction;

/* compiled from: AutoEvidenceRequestView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_evidence_request/p;", "Lcom/avito/android/auto_evidence_request/j;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class p implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f95275a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f95276b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AppBarLayoutWithTextAction f95277c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Button f95278d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f95279e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f95280f;

    public p(@Y61.k View view, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k com.avito.konveyor.adapter.j jVar) {
        this.f95275a = jVar;
        this.f95276b = aVar;
        View viewFindViewById = view.findViewById(R.id.app_bar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type ru.avito.component.toolbar.AppBarLayoutWithTextAction");
        }
        this.f95277c = (AppBarLayoutWithTextAction) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.recycler_view);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.submit_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f95278d = (Button) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.disclaimer_text);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById4;
        this.f95279e = textView;
        this.f95280f = new com.avito.android.progress_overlay.l((ViewGroup) view, 0, null, 0, 0, 30, null);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.setAdapter(jVar);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
