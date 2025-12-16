package com.avito.android.sx_address.address_video_verification.view;

import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SxAddressVideoVerificationResourceProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/address_video_verification/view/e;", "Lcom/avito/android/sx_address/address_video_verification/view/d;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f292732a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f292733b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f292734c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f292735d;

    /* renamed from: e, reason: collision with root package name */
    public final int f292736e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f292737f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f292738g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final String f292739h;

    /* renamed from: i, reason: collision with root package name */
    public final int f292740i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final String f292741j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final String f292742k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final String f292743l;

    @Inject
    public e(@Y61.k Resources resources) throws Resources.NotFoundException {
        this.f292732a = resources;
        resources.getString(R.string.sx_address_video_verification_upload);
        this.f292733b = resources.getString(R.string.sx_address_video_verification_need_upload_error);
        this.f292734c = resources.getString(R.string.sx_address_video_verification_uploading_error);
        this.f292735d = resources.getString(R.string.sx_address_video_verification_sending_error);
        this.f292736e = R.drawable.placeholders_img_no_internet_error;
        this.f292737f = resources.getString(R.string.error_layout_no_internet);
        this.f292738g = resources.getString(R.string.error_layout_check_connection);
        this.f292739h = resources.getString(R.string.error_layout_refresh);
        this.f292740i = R.drawable.placeholders_img_unknown_error;
        this.f292741j = resources.getString(R.string.error_layout_unknown_error);
        this.f292742k = resources.getString(R.string.error_layout_try_refresh_or_return_later);
        this.f292743l = resources.getString(R.string.error_try_once_more);
    }

    @Override // com.avito.android.sx_address.address_video_verification.view.d
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getF292738g() {
        return this.f292738g;
    }

    @Override // com.avito.android.sx_address.address_video_verification.view.d
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF292741j() {
        return this.f292741j;
    }

    @Override // com.avito.android.sx_address.address_video_verification.view.d
    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getF292737f() {
        return this.f292737f;
    }

    @Override // com.avito.android.sx_address.address_video_verification.view.d
    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getF292742k() {
        return this.f292742k;
    }

    @Override // com.avito.android.sx_address.address_video_verification.view.d
    @Y61.k
    /* renamed from: e, reason: from getter */
    public final String getF292739h() {
        return this.f292739h;
    }

    @Override // com.avito.android.sx_address.address_video_verification.view.d
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getF292743l() {
        return this.f292743l;
    }

    @Override // com.avito.android.sx_address.address_video_verification.view.d
    @Y61.k
    /* renamed from: g, reason: from getter */
    public final String getF292735d() {
        return this.f292735d;
    }

    @Override // com.avito.android.sx_address.address_video_verification.view.d
    @Y61.k
    /* renamed from: h, reason: from getter */
    public final String getF292733b() {
        return this.f292733b;
    }

    @Override // com.avito.android.sx_address.address_video_verification.view.d
    /* renamed from: i, reason: from getter */
    public final int getF292740i() {
        return this.f292740i;
    }

    @Override // com.avito.android.sx_address.address_video_verification.view.d
    @Y61.k
    public final String j(long j12) {
        return this.f292732a.getString(R.string.sx_address_video_verification_uploading_size_error, Long.valueOf(j12));
    }

    @Override // com.avito.android.sx_address.address_video_verification.view.d
    /* renamed from: k, reason: from getter */
    public final int getF292736e() {
        return this.f292736e;
    }

    @Override // com.avito.android.sx_address.address_video_verification.view.d
    @Y61.k
    /* renamed from: l, reason: from getter */
    public final String getF292734c() {
        return this.f292734c;
    }
}
