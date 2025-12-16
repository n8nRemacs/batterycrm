package com.avito.android.settings.adapter;

import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: InfoSettingsWithProgressItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/settings/adapter/D;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/settings/adapter/C;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class D extends com.avito.konveyor.adapter.b implements C {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f280730e = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f280731b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f280732c;

    /* renamed from: d, reason: collision with root package name */
    public final View f280733d;

    public D(@Y61.k View view) {
        super(view);
        this.f280731b = view;
        this.f280732c = (TextView) view.findViewById(R.id.title);
        this.f280733d = view.findViewById(R.id.progress_bar);
    }

    @Override // com.avito.android.settings.adapter.C
    public final void UD(boolean z12) {
        D6.G(this.f280733d, z12);
    }

    @Override // com.avito.android.settings.adapter.C
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f280731b.setOnClickListener(new com.avito.android.service_booking_common.blueprints.geo_reference.g(11, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f280731b.setOnClickListener(null);
    }

    @Override // com.avito.android.settings.adapter.C
    public final void setTitle(@Y61.k CharSequence charSequence) {
        this.f280732c.setText(charSequence);
    }
}
