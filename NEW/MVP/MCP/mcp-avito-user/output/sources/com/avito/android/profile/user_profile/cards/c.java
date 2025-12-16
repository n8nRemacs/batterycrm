package com.avito.android.profile.user_profile.cards;

import android.view.View;
import j.D;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CardItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/c;", "LTV0/e;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface c extends TV0.e {

    /* compiled from: CardItemView.kt */
    @s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        @Y61.k
        public static PU.b a(@Y61.k View view, @D int i12) {
            View viewFindViewById = view.findViewById(i12);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            d.d(viewFindViewById);
            return new PU.b(viewFindViewById);
        }
    }
}
