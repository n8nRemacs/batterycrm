package com.avito.android.user_address.suggest;

import Y61.k;
import android.content.res.Resources;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UserAddressSuggestResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/suggest/f;", "Lcom/avito/android/user_address/suggest/e;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f308060a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f308061b;

    /* renamed from: c, reason: collision with root package name */
    public final int f308062c = R.drawable.img_no_internet_160_160;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f308063d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f308064e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f308065f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f308066g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f308067h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final String f308068i;

    @Inject
    public f(@k Resources resources) throws Resources.NotFoundException {
        this.f308060a = resources.getString(R.string.error_layout_unknown_error);
        this.f308061b = resources.getString(R.string.error_layout_try_refresh_or_return_later);
        this.f308063d = resources.getString(R.string.error_layout_no_internet);
        this.f308064e = resources.getString(R.string.error_layout_check_connection);
        this.f308065f = resources.getString(R.string.new_address_title);
        this.f308066g = resources.getString(R.string.edit_address_title);
        resources.getString(R.string.publish_add_address_business_title);
        this.f308067h = resources.getString(R.string.multigeo_default_address_title);
        this.f308068i = resources.getString(R.string.multigeo_vacancy_address_title);
    }

    @Override // com.avito.android.user_address.suggest.e
    @k
    /* renamed from: a, reason: from getter */
    public final String getF308064e() {
        return this.f308064e;
    }

    @Override // com.avito.android.user_address.suggest.e
    @k
    /* renamed from: b, reason: from getter */
    public final String getF308060a() {
        return this.f308060a;
    }

    @Override // com.avito.android.user_address.suggest.e
    @k
    /* renamed from: c, reason: from getter */
    public final String getF308063d() {
        return this.f308063d;
    }

    @Override // com.avito.android.user_address.suggest.e
    @k
    /* renamed from: d, reason: from getter */
    public final String getF308061b() {
        return this.f308061b;
    }

    @Override // com.avito.android.user_address.suggest.e
    /* renamed from: e, reason: from getter */
    public final int getF308062c() {
        return this.f308062c;
    }

    @Override // com.avito.android.user_address.suggest.e
    @k
    /* renamed from: f, reason: from getter */
    public final String getF308066g() {
        return this.f308066g;
    }

    @Override // com.avito.android.user_address.suggest.e
    @k
    /* renamed from: g, reason: from getter */
    public final String getF308068i() {
        return this.f308068i;
    }

    @Override // com.avito.android.user_address.suggest.e
    @k
    /* renamed from: h, reason: from getter */
    public final String getF308065f() {
        return this.f308065f;
    }

    @Override // com.avito.android.user_address.suggest.e
    @k
    /* renamed from: i, reason: from getter */
    public final String getF308067h() {
        return this.f308067h;
    }
}
