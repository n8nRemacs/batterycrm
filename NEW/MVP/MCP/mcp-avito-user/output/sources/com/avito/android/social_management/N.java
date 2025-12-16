package com.avito.android.social_management;

import android.content.res.Resources;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SocialManagementResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/social_management/N;", "Lcom/avito/android/social_management/M;", "_avito_social-network-editor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class N implements M {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f284459a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f284460b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f284461c;

    @Inject
    public N(@Y61.k Resources resources) {
        this.f284459a = resources;
        this.f284460b = resources.getString(R.string.esia);
        this.f284461c = resources.getString(R.string.avito_fake);
    }

    @Override // com.avito.android.social_management.M
    @Y61.k
    public final String a() {
        return this.f284459a.getString(R.string.apple);
    }

    @Override // com.avito.android.social_management.M
    @Y61.k
    public final String b() {
        return this.f284459a.getString(R.string.odnoklassniki);
    }

    @Override // com.avito.android.social_management.M
    @Y61.k
    public final String c() {
        return this.f284459a.getString(R.string.google);
    }

    @Override // com.avito.android.social_management.M
    @Y61.k
    public final String d() {
        return this.f284459a.getString(R.string.vkontakte);
    }

    @Override // com.avito.android.social_management.M
    @Y61.k
    public final String e() {
        return this.f284459a.getString(R.string.removed_social_google);
    }

    @Override // com.avito.android.social_management.M
    @Y61.k
    public final String f() {
        return this.f284459a.getString(R.string.cancel_button_text);
    }

    @Override // com.avito.android.social_management.M
    @Y61.k
    public final String g() {
        return this.f284459a.getString(R.string.remove_social_dialog_message);
    }

    @Override // com.avito.android.social_management.M
    @Y61.k
    public final String h() {
        return this.f284459a.getString(R.string.connect_social);
    }

    @Override // com.avito.android.social_management.M
    @Y61.k
    public final String i() {
        return this.f284459a.getString(R.string.social_login_error);
    }

    @Override // com.avito.android.social_management.M
    @Y61.k
    public final String j() {
        return this.f284459a.getString(R.string.remove_button_text);
    }

    @Override // com.avito.android.social_management.M
    @Y61.k
    public final String k() {
        return this.f284459a.getString(R.string.removed_social_apple);
    }

    @Override // com.avito.android.social_management.M
    @Y61.k
    /* renamed from: l, reason: from getter */
    public final String getF284461c() {
        return this.f284461c;
    }

    @Override // com.avito.android.social_management.M
    @Y61.k
    /* renamed from: m, reason: from getter */
    public final String getF284460b() {
        return this.f284460b;
    }
}
