package com.avito.android.profile_settings_extended.adapter.popup_banner;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PopupBannerItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/popup_banner/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile_settings_extended/adapter/popup_banner/f;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f229751e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f229752b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f229753c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f229754d;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.ext_profile_popup_banner_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f229752b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.ext_profile_popup_banner_description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f229753c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.ext_profile_popup_banner_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f229754d = (Button) viewFindViewById3;
    }

    @Override // com.avito.android.profile_settings_extended.adapter.popup_banner.f
    public final void Nj(@k String str) {
        this.f229754d.setText(str);
    }

    @Override // com.avito.android.profile_settings_extended.adapter.popup_banner.f
    public final void b(@k String str) {
        this.f229752b.setText(str);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f229754d.setOnClickListener(null);
    }

    @Override // com.avito.android.profile_settings_extended.adapter.popup_banner.f
    public final void n(@k String str) {
        this.f229753c.setText(str);
    }

    @Override // com.avito.android.profile_settings_extended.adapter.popup_banner.f
    public final void uH(@k Y41.a<G0> aVar) {
        this.f229754d.setOnClickListener(new com.avito.android.profile_phones.phones_list.phone_item.g(17, aVar));
    }
}
