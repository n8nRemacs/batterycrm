package com.avito.android.profile_settings_basic.adapter.setting_item;

import Y41.l;
import Y61.k;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.inline_filters.dialog.select.ViewOnClickListenerC31042l;
import com.avito.android.profile_management_core.moderation.ModerationStatus;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SettingItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_basic/adapter/setting_item/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile_settings_basic/adapter/setting_item/g;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f228700h = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f228701b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f228702c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f228703d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ImageView f228704e;

    /* renamed from: f, reason: collision with root package name */
    public final int f228705f;

    /* renamed from: g, reason: collision with root package name */
    public final int f228706g;

    /* compiled from: SettingItemView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<View, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f228707l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(1);
            this.f228707l = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            this.f228707l.invoke();
            return G0.f406611a;
        }
    }

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f228701b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.value);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f228702c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.moderation_status);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f228703d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.edit_icon);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f228704e = (ImageView) viewFindViewById4;
        this.f228705f = C35835l0.d(R.attr.red, view.getContext());
        this.f228706g = C35835l0.d(R.attr.gray48, view.getContext());
    }

    @Override // com.avito.android.profile_settings_basic.adapter.setting_item.g
    public final void a(@Y61.l Y41.a<G0> aVar) {
        a aVar2 = aVar != null ? new a(aVar) : null;
        this.f228704e.setOnClickListener(aVar2 != null ? new ViewOnClickListenerC31042l(18, aVar2) : null);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f228704e.setOnClickListener(null);
    }

    @Override // com.avito.android.profile_settings_basic.adapter.setting_item.g
    public final void uN(@k SettingItem settingItem) {
        I5.a(this.f228701b, settingItem.f228687c, false);
        I5.a(this.f228702c, settingItem.f228688d, true);
        ModerationStatus moderationStatus = settingItem.f228690f;
        AttributedText f226771c = moderationStatus != null ? moderationStatus.getF226771c() : null;
        TextView textView = this.f228703d;
        j.a(textView, f226771c, null);
        textView.setTextColor(moderationStatus instanceof ModerationStatus.ModerationFailed ? this.f228705f : this.f228706g);
        D6.G(this.f228704e, settingItem.f228691g != null);
    }
}
