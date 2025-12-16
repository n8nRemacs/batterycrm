package com.avito.android.profile.remove.screen.items.spacer;

import Y61.k;
import android.widget.Space;
import kotlin.Metadata;

/* compiled from: SpacerItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/remove/screen/items/spacer/h;", "Lcom/avito/android/profile/remove/screen/items/spacer/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Space f224119b;

    public h(@k Space space) {
        super(space);
        this.f224119b = space;
    }

    @Override // com.avito.android.profile.remove.screen.items.spacer.g
    public final void N(int i12) {
        this.f224119b.getLayoutParams().height = i12;
    }
}
