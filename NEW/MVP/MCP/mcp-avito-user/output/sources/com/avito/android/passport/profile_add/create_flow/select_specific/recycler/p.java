package com.avito.android.passport.profile_add.create_flow.select_specific.recycler;

import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: Header.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_specific/recycler/p;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/passport/profile_add/create_flow/select_specific/recycler/o;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class p extends com.avito.konveyor.adapter.b implements o {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f211788b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f211789c;

    public p(@Y61.k View view) {
        super(view);
        this.f211788b = (TextView) view.findViewById(R.id.specific_item_header_title);
        this.f211789c = (TextView) view.findViewById(R.id.specific_item_header_subtitle);
    }

    @Override // com.avito.android.passport.profile_add.create_flow.select_specific.recycler.o
    public final void fj(@Y61.k k kVar) {
        TextView textView = this.f211788b;
        I5.a(textView, kVar.f211785b.k0(textView.getContext()), false);
        TextView textView2 = this.f211789c;
        I5.a(textView2, kVar.f211786c.k0(textView2.getContext()), false);
    }
}
