package com.yandex.mobile.ads.impl;

import android.view.View;
import com.adjust.sdk.Constants;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.yandex.mobile.ads.impl.ri1;
import com.yandex.mobile.ads.impl.si1;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes8.dex */
public final class sg1 implements si1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final ne1 f389930a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final pi1 f389931b;

    public sg1(@Y61.k ne1 ne1Var, @Y61.k pi1 pi1Var) {
        this.f389930a = ne1Var;
        this.f389931b = pi1Var;
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void a() {
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void h() {
        this.f389931b.a(this.f389930a, "render_impression");
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void i() {
        this.f389931b.a(cf1.a(this.f389930a), "renderingStart");
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void n() {
        this.f389931b.a(this.f389930a, "impression");
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void a(float f12) {
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void a(long j12) {
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void a(@Y61.k View view, @Y61.k List<df1> list) {
        si1.a.a(view, list);
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void a(@Y61.k String str) {
        si1.a.a(str);
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void a(@Y61.k ri1.a aVar) {
        si1.a.a(aVar);
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void a(@Y61.k cg1 cg1Var) {
        int i12;
        switch (n6.a(cg1Var.a())) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 11:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                i12 = 405;
                break;
            case 7:
                i12 = 402;
                break;
            case 8:
            case 12:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                i12 = 900;
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 20:
            case 21:
            case 22:
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                i12 = Constants.MINIMAL_ERROR_STATUS_CODE;
                break;
            case 19:
                i12 = 401;
                break;
            case 23:
                i12 = 403;
                break;
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                i12 = 901;
                break;
            case 30:
                i12 = 902;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.f389931b.a(this.f389930a, "error", Collections.singletonMap("[ERRORCODE]", String.valueOf(i12)));
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void b() {
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void c() {
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void d() {
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void e() {
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void f() {
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void g() {
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void j() {
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void k() {
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void l() {
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void m() {
    }
}
