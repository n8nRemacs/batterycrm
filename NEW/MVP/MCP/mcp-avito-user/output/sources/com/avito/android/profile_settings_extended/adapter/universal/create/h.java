package com.avito.android.profile_settings_extended.adapter.universal.create;

import Rb0.C15027c;
import Rb0.InterfaceC15026b;
import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: UniversalWidgetCreateItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/universal/create/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile_settings_extended/adapter/universal/create/g;", "LRb0/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g, InterfaceC15026b {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f229898d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f229899b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final View f229900c;

    public h(@k View view) {
        super(view);
        new C15027c(view);
        View viewFindViewById = view.findViewById(R.id.extended_profile_universal_widget_create_text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f229899b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.extended_profile_universal_widget_create_item_root);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f229900c = viewFindViewById2;
    }

    @Override // com.avito.android.profile_settings_extended.adapter.universal.create.g
    public final void I00(@k UniversalWidgetCreateItem universalWidgetCreateItem, @k Y41.a<G0> aVar) {
        I5.a(this.f229899b, universalWidgetCreateItem.f229887c, false);
        this.f229900c.setOnClickListener(new com.avito.android.profile_phones.phones_list.phone_item.g(22, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f229900c.setOnClickListener(null);
    }
}
