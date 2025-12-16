package com.avito.android.extended_profile_image_edit;

import android.app.Application;
import android.content.Intent;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ExtendedProfileImageEditIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_image_edit/u;", "Lcom/avito/android/extended_profile_image_edit/t;", "_avito_extended-profile-image-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class u implements t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f151131a;

    @Inject
    public u(@Y61.k Application application) {
        this.f151131a = application;
    }

    @Override // com.avito.android.extended_profile_image_edit.t
    @Y61.k
    public final Intent a(@Y61.k ExtendedProfileImageEditConfig extendedProfileImageEditConfig) {
        Intent intent = new Intent(this.f151131a, (Class<?>) BannerImageEditActivity.class);
        intent.putExtra("args", extendedProfileImageEditConfig);
        intent.setFlags(603979776);
        return intent;
    }
}
