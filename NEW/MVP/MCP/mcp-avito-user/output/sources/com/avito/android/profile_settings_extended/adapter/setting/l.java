package com.avito.android.profile_settings_extended.adapter.setting;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.inline_filters.dialog.select.ViewOnClickListenerC31042l;
import com.avito.android.profile_settings_extended.entity.SettingsActionButton;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: SettingItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/setting/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile_settings_extended/adapter/setting/k;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f229858f = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f229859b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f229860c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ImageView f229861d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ImageView f229862e;

    /* compiled from: SettingItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[SettingsActionButton.Type.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SettingsActionButton.Type type = SettingsActionButton.Type.f230300b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public l(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f229859b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.value);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f229860c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.action_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f229861d = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.more_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f229862e = (ImageView) viewFindViewById4;
    }

    @Override // com.avito.android.profile_settings_extended.adapter.setting.k
    public final void Ar(boolean z12) {
        D6.G(this.f229862e, z12);
    }

    @Override // com.avito.android.profile_settings_extended.adapter.setting.k
    public final void L0(@Y61.l Y41.a<G0> aVar) {
        m mVar = aVar != null ? new m(aVar) : null;
        this.f229861d.setOnClickListener(mVar != null ? new ViewOnClickListenerC31042l(25, mVar) : null);
    }

    @Override // com.avito.android.profile_settings_extended.adapter.setting.k
    public final void bj(@Y61.l SettingsActionButton settingsActionButton) {
        int i12;
        boolean z12 = settingsActionButton != null;
        ImageView imageView = this.f229861d;
        D6.G(imageView, z12);
        if (settingsActionButton != null) {
            Context context = imageView.getContext();
            int iOrdinal = settingsActionButton.f230298c.ordinal();
            if (iOrdinal == 0) {
                i12 = R.attr.ic_edit20;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i12 = R.attr.ic_return20;
            }
            imageView.setImageDrawable(C35835l0.h(i12, context));
        }
    }

    @Override // com.avito.android.profile_settings_extended.adapter.setting.k
    public final void ea(@Y61.l Y41.a<G0> aVar) {
        m mVar = aVar != null ? new m(aVar) : null;
        this.f229862e.setOnClickListener(mVar != null ? new ViewOnClickListenerC31042l(25, mVar) : null);
    }

    @Override // com.avito.android.profile_settings_extended.adapter.setting.k
    public final void hz(@Y61.k SettingItem settingItem) {
        I5.a(this.f229859b, settingItem.f229842c, false);
        I5.a(this.f229860c, settingItem.f229843d, true);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f229861d.setOnClickListener(null);
        this.f229862e.setOnClickListener(null);
    }
}
