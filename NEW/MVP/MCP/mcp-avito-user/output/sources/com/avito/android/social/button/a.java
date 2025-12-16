package com.avito.android.social.button;

import Y61.k;
import com.avito.android.R;
import com.avito.android.social.D;
import com.avito.android.social.InterfaceC35022n;
import com.avito.android.social.InterfaceC35026s;
import com.avito.android.social.InterfaceC35029v;
import com.avito.android.social.N;
import com.avito.android.social.X;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ShareSocialInfoProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/social/button/a;", "Lcom/avito/android/social/button/g;", "<init>", "()V", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements g {
    @Inject
    public a() {
    }

    @Override // com.avito.android.social.button.g
    @k
    public final f a(@k D d12) {
        boolean z12 = d12 instanceof X;
        Integer numValueOf = Integer.valueOf(R.color.legacy_constant_white);
        if (z12) {
            return new f(R.drawable.bg_btn_raised_share_vk, R.drawable.ic_vk_24, numValueOf);
        }
        if (d12 instanceof InterfaceC35029v) {
            return new f(R.drawable.bg_btn_raised_share_ok, R.drawable.ic_odnoklassniki_24, numValueOf);
        }
        if (d12 instanceof N) {
            return new f(R.drawable.bg_btn_raised_share_tw, R.drawable.ic_twitter_24, numValueOf);
        }
        if (d12 instanceof InterfaceC35022n) {
            return new f(R.drawable.bg_btn_raised_share_lj, R.drawable.ic_btn_raised_share_lj, null, 4, null);
        }
        if (d12 instanceof InterfaceC35026s) {
            return new f(R.drawable.bg_btn_raised_share_mr, R.drawable.ic_btn_raised_share_mr, null, 4, null);
        }
        throw new RuntimeException("Unknown " + d12);
    }
}
