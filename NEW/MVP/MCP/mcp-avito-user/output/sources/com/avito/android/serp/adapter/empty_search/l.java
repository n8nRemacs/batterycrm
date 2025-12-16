package com.avito.android.serp.adapter.empty_search;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.serp.adapter.empty_search.EmptySearchItem;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: EmptySearchItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/empty_search/l;", "Lcom/avito/android/serp/adapter/empty_search/k;", "Lcom/avito/android/serp/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l extends com.avito.android.serp.c implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f269945b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f269946c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f269947d;

    public l(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.empty_search_root);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f269945b = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.empty_search_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f269946c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.empty_search_subtitle);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f269947d = (TextView) viewFindViewById3;
    }

    @Override // com.avito.android.serp.adapter.empty_search.k
    public final void QV(@Y61.k EmptySearchItem.Paddings paddings) {
        int i12 = paddings.f269938b;
        if (i12 != -1) {
            D6.f(this.f269945b, 0, y6.b(i12), 0, 0, 13);
        }
        int i13 = paddings.f269939c;
        if (i13 != -1) {
            D6.f(this.f269945b, 0, 0, 0, y6.b(i13), 7);
        }
    }

    @Override // com.avito.android.serp.adapter.empty_search.k
    public final void b(@Y61.k String str) {
        I5.a(this.f269946c, str, false);
    }

    @Override // com.avito.android.serp.adapter.empty_search.k
    public final void j(@Y61.l String str) {
        I5.a(this.f269947d, str, false);
    }
}
