package com.avito.android.profile_settings_extended.adapter.item_selections.adapter.create;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CreateSelectionItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/item_selections/adapter/create/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile_settings_extended/adapter/item_selections/adapter/create/g;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f229547d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f229548b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f229549c;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.extended_profile_create_selection_item_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f229548b = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.extended_profile_create_selection_item_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f229549c = (TextView) viewFindViewById2;
    }

    @Override // com.avito.android.profile_settings_extended.adapter.item_selections.adapter.create.g
    public final void Pt(@k CreateSelectionItem createSelectionItem, @k Y41.a<G0> aVar) {
        I5.a(this.f229549c, createSelectionItem.f229536c, false);
        this.f229548b.setOnClickListener(new com.avito.android.profile_phones.phones_list.phone_item.g(13, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f229548b.setOnClickListener(null);
    }
}
