package com.avito.android.passport.profile_add.create_flow.select_vertical.recycler;

import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: Error.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_vertical/recycler/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/passport/profile_add/create_flow/select_vertical/recycler/g;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f212003b;

    public h(@Y61.k View view) {
        super(view);
        this.f212003b = view;
    }

    @Override // com.avito.android.passport.profile_add.create_flow.select_vertical.recycler.g
    public final void U0(int i12) {
        View view = this.f212003b;
        TextView textView = view instanceof TextView ? (TextView) view : null;
        if (textView != null) {
            textView.setText(R.string.passport_add_profile_select_vertical_empty_select_error);
        }
    }
}
