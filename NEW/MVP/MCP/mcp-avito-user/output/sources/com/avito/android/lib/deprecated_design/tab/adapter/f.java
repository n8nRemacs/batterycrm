package com.avito.android.lib.deprecated_design.tab.adapter;

import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: SimpleTabAdapter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/deprecated_design/tab/adapter/f;", "Lcom/avito/android/lib/deprecated_design/tab/adapter/a;", "Lcom/avito/android/lib/deprecated_design/tab/adapter/h;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements a, h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f178148a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f178149b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final TextView f178150c;

    /* renamed from: d, reason: collision with root package name */
    public final int f178151d = R.id.tab_title;

    public f(@Y61.k View view) {
        this.f178148a = view;
        this.f178149b = (TextView) view.findViewById(R.id.tab_title);
        this.f178150c = (TextView) view.findViewById(R.id.tab_counter);
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.a
    public final void a(@l String str, @l String str2) {
        I5.a(this.f178149b, str, false);
        TextView textView = this.f178150c;
        if (textView != null) {
            I5.a(textView, str2, false);
        }
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.h
    @Y61.k
    public final Integer c() {
        return Integer.valueOf(this.f178151d);
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.i
    @Y61.k
    /* renamed from: getView, reason: from getter */
    public final View getF178148a() {
        return this.f178148a;
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.i
    public final void b(int i12, int i13, boolean z12) {
    }
}
