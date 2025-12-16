package com.avito.android.theme_settings.item.theme_checkmark;

import Y61.k;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.toggle.Checkmark;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ThemeCheckmarkItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/theme_settings/item/theme_checkmark/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/theme_settings/item/theme_checkmark/h;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f301362f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f301363b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f301364c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ImageView f301365d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Checkmark f301366e;

    public i(@k View view) {
        super(view);
        this.f301363b = view;
        this.f301364c = (TextView) view.findViewById(R.id.title);
        this.f301365d = (ImageView) view.findViewById(R.id.image);
        this.f301366e = (Checkmark) view.findViewById(R.id.checkmark);
    }

    @Override // com.avito.android.theme_settings.item.theme_checkmark.h
    public final void a(@k Y41.a<G0> aVar) {
        this.f301363b.setOnClickListener(new com.avito.android.sx_address.address_video_verification.view.b(28, aVar));
    }

    @Override // com.avito.android.theme_settings.item.theme_checkmark.h
    public final void setChecked(boolean z12) {
        this.f301366e.setChecked(z12);
    }

    @Override // com.avito.android.theme_settings.item.theme_checkmark.h
    public final void setImage(@k Drawable drawable) {
        this.f301365d.setImageDrawable(drawable);
    }

    @Override // com.avito.android.theme_settings.item.theme_checkmark.h
    public final void setTitle(@k String str) {
        this.f301364c.setText(str);
    }
}
