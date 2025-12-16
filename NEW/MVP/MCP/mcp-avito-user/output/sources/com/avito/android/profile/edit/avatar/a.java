package com.avito.android.profile.edit.avatar;

import Y61.k;
import Y61.l;
import android.net.Uri;
import com.avito.android.profile.edit.refactoring.avatar.ProfileAvatar;
import io.reactivex.rxjava3.core.I;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AvatarInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/edit/avatar/a;", "", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface a {
    @k
    I<ProfileAvatar> b(@k Uri uri);

    @k
    I<G0> e(@l ProfileAvatar profileAvatar);

    @k
    I<org.funktionale.option.a<ProfileAvatar>> f();
}
