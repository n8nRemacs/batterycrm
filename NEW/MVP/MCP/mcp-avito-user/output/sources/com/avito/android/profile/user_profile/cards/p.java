package com.avito.android.profile.user_profile.cards;

import android.content.res.Resources;
import android.util.TypedValue;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: UserProfileResourceProvider.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/p;", "Lcom/avito/android/profile/user_profile/cards/o;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class p implements o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f225111a;

    public p(@Y61.k Resources resources) {
        this.f225111a = resources;
    }

    @Override // com.avito.android.profile.user_profile.cards.o
    public final int a() {
        return this.f225111a.getDimensionPixelSize(R.dimen.profile_toolbar_left_margin);
    }

    @Override // com.avito.android.profile.user_profile.cards.o
    @Y61.k
    public final String b() {
        return this.f225111a.getString(R.string.open_calls_screen);
    }

    @Override // com.avito.android.profile.user_profile.cards.o
    @Y61.k
    public final String c() {
        return this.f225111a.getString(R.string.menu_settings);
    }

    @Override // com.avito.android.profile.user_profile.cards.o
    @Y61.k
    public final String d() {
        return this.f225111a.getString(R.string.profile_self_update_confirm_message);
    }

    @Override // com.avito.android.profile.user_profile.cards.o
    @Y61.k
    public final String e() {
        return this.f225111a.getString(R.string.user_profile_default_title);
    }

    @Override // com.avito.android.profile.user_profile.cards.o
    @Y61.k
    public final String f() {
        return this.f225111a.getString(R.string.menu_notifications);
    }

    @Override // com.avito.android.profile.user_profile.cards.o
    public final int g() {
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
        return this.f225111a.getColor(R.color.common_red, null);
    }

    @Override // com.avito.android.profile.user_profile.cards.o
    public final int h() {
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
        return this.f225111a.getColor(R.color.common_black, null);
    }
}
