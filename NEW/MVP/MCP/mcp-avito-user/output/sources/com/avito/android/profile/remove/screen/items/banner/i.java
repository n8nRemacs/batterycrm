package com.avito.android.profile.remove.screen.items.banner;

import Y61.k;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BannerItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/remove/screen/items/banner/i;", "Lcom/avito/android/profile/remove/screen/items/banner/h;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f224069e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Banner f224070b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f224071c;

    /* renamed from: d, reason: collision with root package name */
    public final Button f224072d;

    public i(@k Banner banner) {
        super(banner);
        this.f224070b = banner;
        this.f224071c = (TextView) banner.findViewById(R.id.banner_description);
        this.f224072d = (Button) banner.findViewById(R.id.banner_button);
    }

    @Override // com.avito.android.profile.remove.screen.items.banner.h
    public final void L1() {
        D6.w(this.f224072d);
    }

    @Override // com.avito.android.profile.remove.screen.items.banner.h
    public final void h(@k String str) {
        I5.a(this.f224071c, str, false);
    }

    @Override // com.avito.android.profile.remove.screen.items.banner.h
    public final void r1(@k String str, @k Y41.a<G0> aVar) {
        Button button = this.f224072d;
        com.avito.android.lib.design.button.b.a(button, str, false);
        button.setOnClickListener(new com.avito.android.profile.edit.adapter.c(6, aVar));
    }

    @Override // com.avito.android.profile.remove.screen.items.banner.h
    public final void setTitle(@k String str) {
        this.f224070b.setTitle(str);
    }
}
