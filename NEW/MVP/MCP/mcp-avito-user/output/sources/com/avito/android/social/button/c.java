package com.avito.android.social.button;

import Y61.k;
import com.avito.android.R;
import com.avito.android.social.D;
import com.avito.android.social.InterfaceC35009a;
import com.avito.android.social.InterfaceC35013e;
import com.avito.android.social.InterfaceC35014f;
import com.avito.android.social.InterfaceC35017i;
import com.avito.android.social.InterfaceC35029v;
import com.avito.android.social.S;
import com.avito.android.social.X;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SignInSocialInfoProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/social/button/c;", "Lcom/avito/android/social/button/g;", "<init>", "()V", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements g {
    @Inject
    public c() {
    }

    @Override // com.avito.android.social.button.g
    @k
    public final f a(@k D d12) {
        boolean z12 = d12 instanceof X;
        Integer numValueOf = Integer.valueOf(R.color.legacy_constant_white);
        if (z12) {
            return new f(R.drawable.bg_btn_raised_sign_in_vk, R.drawable.ic_vk_24, numValueOf);
        }
        if (d12 instanceof S) {
            return new f(R.drawable.bg_btn_raised_sign_in_vk, R.drawable.ic_vk_24, numValueOf);
        }
        if (d12 instanceof InterfaceC35029v) {
            return new f(R.drawable.bg_btn_raised_sign_in_ok, R.drawable.ic_odnoklassniki_24, numValueOf);
        }
        if (d12 instanceof InterfaceC35017i) {
            return new f(R.drawable.bg_btn_raised_sign_in_gp, R.drawable.ic_google_24, numValueOf);
        }
        if (d12 instanceof InterfaceC35009a) {
            return new f(R.drawable.bg_btn_raised_sign_in_ap, R.drawable.ic_apple_24, Integer.valueOf(R.color.legacy_white));
        }
        if (d12 instanceof InterfaceC35013e) {
            return new f(R.drawable.bg_btn_raised_sign_in_av, R.drawable.ic_avito_fake_24, null);
        }
        if (d12 instanceof InterfaceC35014f) {
            return new f(R.drawable.bg_btn_raised_sign_in_esia, R.drawable.ic_esia, null);
        }
        throw new RuntimeException("Unknown " + d12);
    }
}
