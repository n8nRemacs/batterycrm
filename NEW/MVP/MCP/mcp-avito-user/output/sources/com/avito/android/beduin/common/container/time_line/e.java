package com.avito.android.beduin.common.container.time_line;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import ej.InterfaceC40116e;
import kotlin.Metadata;

/* compiled from: BeduinTimelineViewContainer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/container/time_line/e;", "Lej/e;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements InterfaceC40116e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f103243b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.beduin.common.component.adapter.a f103244c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ViewGroup f103245d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ImageView f103246e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final View f103247f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final RecyclerView f103248g;

    public e(@k View view, @k com.avito.android.beduin.common.component.adapter.a aVar) {
        this.f103243b = view;
        this.f103244c = aVar;
        this.f103245d = (ViewGroup) view.findViewById(R.id.time_line_container);
        this.f103246e = (ImageView) view.findViewById(R.id.summary_icon);
        this.f103247f = view.findViewById(R.id.line);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.children);
        this.f103248g = recyclerView;
        recyclerView.setAdapter(aVar);
    }

    @Override // ej.InterfaceC40116e
    @k
    /* renamed from: getRoot, reason: from getter */
    public final View getF103243b() {
        return this.f103243b;
    }
}
