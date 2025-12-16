package com.avito.android.profile.user_profile.cards;

import android.content.Context;
import android.view.View;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import gr.C40723b;
import kotlin.Metadata;

/* compiled from: ProfileInfoItemSubView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/i;", "Lcom/avito/android/profile/user_profile/cards/h;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i implements h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C40723b f224977b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C40723b f224978c;

    public i(@Y61.k View view) {
        Context context = view.getContext();
        C40723b c40723bB = d.b(view, R.id.manager);
        d.c(c40723bB, C35835l0.l(context.getDrawable(R.drawable.ic_block_user_24), C35835l0.d(R.attr.gray28, context)));
        this.f224977b = c40723bB;
        C40723b c40723bB2 = d.b(view, R.id.website);
        d.c(c40723bB2, C35835l0.l(context.getDrawable(R.drawable.ic_site_24), C35835l0.d(R.attr.gray28, context)));
        this.f224978c = c40723bB2;
    }

    @Override // com.avito.android.profile.user_profile.cards.h
    public final void bQ(@Y61.l String str) {
        this.f224978c.m6(str);
    }

    @Override // com.avito.android.profile.user_profile.cards.h
    public final void sC(@Y61.l String str) {
        this.f224977b.m6(str);
    }
}
