package com.avito.android.profile.pro.impl.screen.item.passport;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.component.user_hat.h;
import com.avito.konveyor.adapter.j;
import kotlin.Metadata;

/* compiled from: ProfileProPassportView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/passport/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile/pro/impl/screen/item/passport/f;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h f223391b;

    public g(@k View view, @k l41.g<com.avito.android.component.user_hat.e> gVar) {
        super(view);
        this.f223391b = new h(view.findViewById(R.id.profiles_list), gVar);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.profile.pro.impl.screen.item.passport.f
    public final void xX(@k ProfileProPassportItem profileProPassportItem) {
        h hVar = this.f223391b;
        boolean z12 = hVar.f125314h;
        boolean z13 = profileProPassportItem.f223383d;
        if (z12 != z13) {
            RecyclerView recyclerView = hVar.f125311e;
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = z13 ? ((Number) hVar.f125313g.getValue()).intValue() : ((Number) hVar.f125312f.getValue()).intValue();
            recyclerView.setLayoutParams(layoutParams);
        }
        hVar.f125314h = z13;
        ((com.avito.konveyor.adapter.h) hVar.f125309c.getValue()).f338510e = new UV0.c(profileProPassportItem.f223382c);
        ((j) hVar.f125310d.getValue()).notifyDataSetChanged();
    }
}
