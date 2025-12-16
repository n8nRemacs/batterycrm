package com.avito.android.social_management;

import android.content.Context;
import android.content.Intent;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SocialManagementIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/social_management/h;", "Lcom/avito/android/social_management/g;", "_avito_social-network-editor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.social_management.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35041h implements InterfaceC35040g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f284679a;

    @Inject
    public C35041h(@Y61.k Context context) {
        this.f284679a = context;
    }

    @Override // com.avito.android.social_management.InterfaceC35040g
    @Y61.k
    public final Intent a() {
        return new Intent(this.f284679a, (Class<?>) SocialManagementActivity.class);
    }
}
