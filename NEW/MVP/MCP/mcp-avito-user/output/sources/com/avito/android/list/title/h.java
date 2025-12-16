package com.avito.android.list.title;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.util.D6;
import kotlin.Metadata;

/* compiled from: TitleItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/list/title/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/list/title/g;", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f181656b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f181657c;

    public h(@k View view) {
        super(view);
        this.f181656b = view;
        this.f181657c = (TextView) view;
    }

    @Override // com.avito.android.list.title.g
    public final void S8(@l Integer num, @l Integer num2) {
        View view = this.f181656b;
        D6.f(this.f181656b, 0, num != null ? D6.j(view, num.intValue()) : 0, 0, num2 != null ? D6.j(view, num2.intValue()) : 0, 5);
    }

    @Override // com.avito.android.list.title.g
    public final void setText(@k String str) {
        this.f181657c.setText(str);
    }
}
