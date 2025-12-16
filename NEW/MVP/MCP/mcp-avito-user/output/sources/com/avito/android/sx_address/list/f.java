package com.avito.android.sx_address.list;

import Y61.k;
import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SxAddressListResourceProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/f;", "Lcom/avito/android/sx_address/list/e;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f293192a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f293193b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f293194c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f293195d;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f293197f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f293198g;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final String f293200i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final String f293201j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final String f293202k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final String f293203l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final String f293204m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final String f293205n;

    /* renamed from: e, reason: collision with root package name */
    public final int f293196e = R.drawable.placeholders_img_no_internet_error;

    /* renamed from: h, reason: collision with root package name */
    public final int f293199h = R.drawable.placeholders_img_unknown_error;

    @Inject
    public f(@k Resources resources) {
        this.f293192a = resources.getString(R.string.sx_address_list_filter_menu_title);
        this.f293193b = resources.getString(R.string.sx_address_list_toast_delete);
        this.f293194c = resources.getString(R.string.sx_address_list_toast_edit);
        this.f293195d = resources.getString(R.string.sx_address_list_toast_save);
        this.f293197f = resources.getString(R.string.error_layout_no_internet);
        this.f293198g = resources.getString(R.string.error_layout_check_connection);
        this.f293200i = resources.getString(R.string.error_layout_unknown_error);
        this.f293201j = resources.getString(R.string.error_layout_try_refresh_or_return_later);
        this.f293202k = resources.getString(R.string.sx_address_list_modal_dialog_action_title);
        this.f293203l = resources.getString(R.string.sx_address_list_modal_dialog_action_description);
        this.f293204m = resources.getString(R.string.sx_address_list_modal_dialog_action_primary_button);
        this.f293205n = resources.getString(R.string.sx_address_list_modal_dialog_action_secondary_button);
    }

    @Override // com.avito.android.sx_address.list.e
    @k
    /* renamed from: a, reason: from getter */
    public final String getF293198g() {
        return this.f293198g;
    }

    @Override // com.avito.android.sx_address.list.e
    @k
    /* renamed from: b, reason: from getter */
    public final String getF293200i() {
        return this.f293200i;
    }

    @Override // com.avito.android.sx_address.list.e
    @k
    /* renamed from: c, reason: from getter */
    public final String getF293197f() {
        return this.f293197f;
    }

    @Override // com.avito.android.sx_address.list.e
    @k
    /* renamed from: d, reason: from getter */
    public final String getF293201j() {
        return this.f293201j;
    }

    @Override // com.avito.android.sx_address.list.e
    /* renamed from: e, reason: from getter */
    public final int getF293196e() {
        return this.f293196e;
    }

    @Override // com.avito.android.sx_address.list.e
    /* renamed from: f, reason: from getter */
    public final int getF293199h() {
        return this.f293199h;
    }

    @Override // com.avito.android.sx_address.list.e
    @k
    /* renamed from: g, reason: from getter */
    public final String getF293202k() {
        return this.f293202k;
    }

    @Override // com.avito.android.sx_address.list.e
    @k
    /* renamed from: h, reason: from getter */
    public final String getF293193b() {
        return this.f293193b;
    }

    @Override // com.avito.android.sx_address.list.e
    @k
    /* renamed from: i, reason: from getter */
    public final String getF293205n() {
        return this.f293205n;
    }

    @Override // com.avito.android.sx_address.list.e
    @k
    /* renamed from: j, reason: from getter */
    public final String getF293204m() {
        return this.f293204m;
    }

    @Override // com.avito.android.sx_address.list.e
    @k
    /* renamed from: k, reason: from getter */
    public final String getF293203l() {
        return this.f293203l;
    }

    @Override // com.avito.android.sx_address.list.e
    @k
    /* renamed from: l, reason: from getter */
    public final String getF293195d() {
        return this.f293195d;
    }

    @Override // com.avito.android.sx_address.list.e
    @k
    /* renamed from: m, reason: from getter */
    public final String getF293194c() {
        return this.f293194c;
    }

    @Override // com.avito.android.sx_address.list.e
    @k
    /* renamed from: n, reason: from getter */
    public final String getF293192a() {
        return this.f293192a;
    }
}
