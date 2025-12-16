package com.avito.android.profile.edit;

import android.content.res.Resources;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: LocationInteractorResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/edit/e0;", "Lcom/avito/android/profile/edit/d0;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f222204a;

    public e0(@Y61.k Resources resources) {
        this.f222204a = resources;
    }

    @Override // com.avito.android.profile.edit.d0
    @Y61.k
    public final String a() {
        return this.f222204a.getString(R.string.districts);
    }

    @Override // com.avito.android.profile.edit.d0
    @Y61.k
    public final String b() {
        return this.f222204a.getString(R.string.metro);
    }

    @Override // com.avito.android.profile.edit.d0
    @Y61.k
    public final String getDirection() {
        return this.f222204a.getString(R.string.direction);
    }
}
