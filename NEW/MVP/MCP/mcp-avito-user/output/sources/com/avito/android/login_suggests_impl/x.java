package com.avito.android.login_suggests_impl;

import android.content.res.Resources;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: LoginSuggestsResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/login_suggests_impl/x;", "Lcom/avito/android/login_suggests_impl/w;", "_avito_login-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class x implements w {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f182968a;

    @Inject
    public x(@Y61.k Resources resources) {
        this.f182968a = resources;
    }

    @Override // com.avito.android.login_suggests_impl.w
    @Y61.k
    public final String a() {
        return this.f182968a.getString(R.string.apple);
    }

    @Override // com.avito.android.login_suggests_impl.w
    @Y61.k
    public final String b() {
        return this.f182968a.getString(R.string.odnoklassniki);
    }

    @Override // com.avito.android.login_suggests_impl.w
    @Y61.k
    public final String c() {
        return this.f182968a.getString(R.string.google);
    }

    @Override // com.avito.android.login_suggests_impl.w
    @Y61.k
    public final String d() {
        return this.f182968a.getString(R.string.vkontakte);
    }

    @Override // com.avito.android.login_suggests_impl.w
    @Y61.k
    public final String e() {
        return this.f182968a.getString(R.string.avitofake);
    }

    @Override // com.avito.android.login_suggests_impl.w
    @Y61.k
    public final String f() {
        return this.f182968a.getString(R.string.esia_title);
    }
}
