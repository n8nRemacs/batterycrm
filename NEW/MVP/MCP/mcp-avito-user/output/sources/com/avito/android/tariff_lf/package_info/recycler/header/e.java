package com.avito.android.tariff_lf.package_info.recycler.header;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: TariffPackageHeaderItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf/package_info/recycler/header/e;", "Lcom/avito/android/tariff_lf/package_info/recycler/header/d;", "Lcom/avito/konveyor/adapter/b;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e extends com.avito.konveyor.adapter.b implements d {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f299253b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f299254c;

    public e(@k View view) {
        super(view);
        this.f299253b = (TextView) view.findViewById(R.id.title);
        this.f299254c = (TextView) view.findViewById(R.id.sub_title);
    }

    @Override // com.avito.android.tariff_lf.package_info.recycler.header.d
    public final void n0(@l String str) {
        I5.a(this.f299254c, str, false);
    }

    @Override // com.avito.android.tariff_lf.package_info.recycler.header.d
    public final void setTitle(@l String str) {
        I5.a(this.f299253b, str, false);
    }
}
