package com.avito.android.component.user_hat;

import Y61.k;
import android.view.View;
import com.avito.android.R;
import com.avito.android.remote.model.advert_details.UserIconType;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: UserHat.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/user_hat/j;", "Lcom/avito/android/component/user_hat/i;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SimpleDraweeView f125360a;

    /* compiled from: UserHat.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            try {
                new int[UserIconType.values().length][UserIconType.SHOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public j(@k View view) {
        view.getContext();
        View viewFindViewById = view.findViewById(R.id.avatar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f125360a = (SimpleDraweeView) viewFindViewById;
    }
}
