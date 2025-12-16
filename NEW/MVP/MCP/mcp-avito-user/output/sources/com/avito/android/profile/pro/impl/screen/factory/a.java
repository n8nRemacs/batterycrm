package com.avito.android.profile.pro.impl.screen.factory;

import com.avito.android.profile.pro.ProfileProArguments;
import com.avito.android.profile.pro.impl.screen.ProfileProFragment;
import com.avito.android.profile.pro.impl.screen.y;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import s90.d;

/* compiled from: ProfileProFragmentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/factory/a;", "Ls90/d;", "<init>", "()V", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements d {
    @Inject
    public a() {
    }

    @Override // s90.d
    public final ProfileProFragment a(ProfileProArguments profileProArguments) {
        return y.a(profileProArguments);
    }
}
