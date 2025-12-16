package com.avito.android.passport.profile_add.create_flow.select_vertical.recycler;

import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: Header.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_vertical/recycler/p;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/passport/profile_add/create_flow/select_vertical/recycler/o;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class p extends com.avito.konveyor.adapter.b implements o {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f212012b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f212013c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f212014d;

    public p(@Y61.k View view) {
        super(view);
        this.f212012b = (TextView) view.findViewById(R.id.vertical_item_header_title);
        this.f212013c = (TextView) view.findViewById(R.id.vertical_item_header_subtitle);
        this.f212014d = (TextView) view.findViewById(R.id.vertical_item_header_description);
    }

    @Override // com.avito.android.passport.profile_add.create_flow.select_vertical.recycler.o
    public final void fT(@Y61.k k kVar) {
        TextView textView = this.f212012b;
        I5.a(textView, kVar.f212008b.k0(textView.getContext()), false);
        TextView textView2 = this.f212013c;
        I5.a(textView2, kVar.f212009c.k0(textView2.getContext()), false);
        TextView textView3 = this.f212014d;
        I5.a(textView3, kVar.f212010d.k0(textView3.getContext()), false);
    }
}
