package com.avito.android.profile.user_profile;

import android.os.Bundle;
import com.avito.android.util.C35966w1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UserProfileFragment.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_profile_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h {

    /* compiled from: UserProfileFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Bundle, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ UserProfileArguments f226150l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(UserProfileArguments userProfileArguments) {
            super(1);
            this.f226150l = userProfileArguments;
        }

        @Override // Y41.l
        public final G0 invoke(Bundle bundle) {
            bundle.putParcelable("key_arguments", this.f226150l);
            return G0.f406611a;
        }
    }

    @Y61.k
    public static final UserProfileFragment a(@Y61.k UserProfileArguments userProfileArguments) {
        UserProfileFragment userProfileFragment = new UserProfileFragment();
        C35966w1.a(userProfileFragment, -1, new a(userProfileArguments));
        return userProfileFragment;
    }
}
