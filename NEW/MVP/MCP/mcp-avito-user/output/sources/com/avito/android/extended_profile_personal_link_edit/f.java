package com.avito.android.extended_profile_personal_link_edit;

import android.app.Application;
import android.content.Intent;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PersonalLinkEditIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_personal_link_edit/f;", "Lcom/avito/android/extended_profile_personal_link_edit/e;", "_avito_extended-profile-personal-link-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f151492a;

    @Inject
    public f(@Y61.k Application application) {
        this.f151492a = application;
    }

    @Override // com.avito.android.extended_profile_personal_link_edit.e
    @Y61.k
    public final Intent a(@Y61.k PersonalLinkEditConfig personalLinkEditConfig) {
        return new Intent(this.f151492a, (Class<?>) PersonalLinkEditActivity.class).putExtra("extra_args", personalLinkEditConfig);
    }
}
