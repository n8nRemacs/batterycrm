package com.avito.android.profile.edit;

import android.content.res.Resources;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: EditProfileResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/edit/N;", "Lcom/avito/android/profile/edit/M;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class N implements M {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f221989a;

    public N(@Y61.k Resources resources) {
        this.f221989a = resources;
    }

    @Override // com.avito.android.profile.edit.M
    @Y61.k
    public final String a() {
        return this.f221989a.getString(R.string.phone);
    }

    @Override // com.avito.android.profile.edit.M
    @Y61.k
    public final String b() {
        return this.f221989a.getString(R.string.email);
    }

    @Override // com.avito.android.profile.edit.M
    @Y61.k
    public final String c() {
        return this.f221989a.getString(R.string.contact_name);
    }

    @Override // com.avito.android.profile.edit.M
    @Y61.k
    public final String d() {
        return this.f221989a.getString(R.string.edit_profile_disclaimer);
    }
}
