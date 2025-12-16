package com.avito.android.profile.remove.screen.items.title;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: TitleItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/remove/screen/items/title/h;", "Lcom/avito/android/profile/remove/screen/items/title/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f224162b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f224163c;

    public h(@k View view) {
        super(view);
        this.f224162b = (TextView) view.findViewById(R.id.title);
        this.f224163c = (TextView) view.findViewById(R.id.description);
    }

    @Override // com.avito.android.profile.remove.screen.items.title.g
    public final void h(@l String str) {
        I5.a(this.f224163c, str, false);
    }

    @Override // com.avito.android.profile.remove.screen.items.title.g
    public final void setTitle(@k String str) {
        I5.a(this.f224162b, str, false);
    }
}
