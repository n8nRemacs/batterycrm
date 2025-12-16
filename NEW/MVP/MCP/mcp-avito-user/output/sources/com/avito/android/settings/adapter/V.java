package com.avito.android.settings.adapter;

import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LogoWithVersionSettingsItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/settings/adapter/V;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/settings/adapter/U;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class V extends com.avito.konveyor.adapter.b implements U {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f280754d = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f280755b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f280756c;

    public V(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.logo);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f280755b = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.version);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f280756c = (TextView) viewFindViewById2;
    }

    @Override // com.avito.android.settings.adapter.U
    public final void SE(@Y61.k Y41.a<G0> aVar) {
        this.f280756c.setOnClickListener(new com.avito.android.service_booking_common.blueprints.geo_reference.g(14, aVar));
    }

    @Override // com.avito.android.settings.adapter.U
    public final void fg(@Y61.k String str) {
        this.f280756c.setText(str);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f280755b.setOnClickListener(null);
        this.f280756c.setOnClickListener(null);
    }

    @Override // com.avito.android.settings.adapter.U
    public final void q80(@Y61.k Y41.a<G0> aVar) {
        this.f280755b.setOnClickListener(new com.avito.android.service_booking_common.blueprints.geo_reference.g(13, aVar));
    }
}
