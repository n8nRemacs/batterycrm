package com.avito.android.profile.user_profile.cards;

import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AvatarAlertsItemSubView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/b;", "Lcom/avito/android/profile/user_profile/cards/a;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f224827b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f224828c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f224829d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f224830e;

    public b(@Y61.k View view) {
        View viewFindViewById = view.findViewById(R.id.avatar_alert);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f224827b = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.avatar_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f224828c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.avatar_description);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f224829d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.avatar_info);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f224830e = (TextView) viewFindViewById4;
    }

    @Override // com.avito.android.profile.user_profile.cards.a
    public final void c00(@Y61.k String str) {
        I5.a(this.f224830e, str, false);
    }

    @Override // com.avito.android.profile.user_profile.cards.a
    public final void jm() {
        D6.w(this.f224830e);
    }

    @Override // com.avito.android.profile.user_profile.cards.a
    public final void jx() {
        D6.w(this.f224827b);
    }

    @Override // com.avito.android.profile.user_profile.cards.a
    public final void lx(@Y61.k String str, @Y61.k String str2) {
        D6.H(this.f224827b);
        I5.a(this.f224828c, str, false);
        I5.a(this.f224829d, str2, false);
    }
}
