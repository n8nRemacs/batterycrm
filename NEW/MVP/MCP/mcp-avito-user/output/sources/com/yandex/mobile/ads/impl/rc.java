package com.yandex.mobile.ads.impl;

import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.yandex.mobile.ads.impl.C39313d;
import com.yandex.mobile.ads.impl.i81;
import com.yandex.mobile.ads.impl.vw;
import java.util.Collections;

/* loaded from: classes8.dex */
final class rc extends i81 {

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f389464e = {5512, 11025, 22050, 44100};

    /* renamed from: b, reason: collision with root package name */
    private boolean f389465b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f389466c;

    /* renamed from: d, reason: collision with root package name */
    private int f389467d;

    public rc(x91 x91Var) {
        super(x91Var);
    }

    public final boolean a(pr0 pr0Var) {
        if (this.f389465b) {
            pr0Var.f(1);
        } else {
            int iT2 = pr0Var.t();
            int i12 = (iT2 >> 4) & 15;
            this.f389467d = i12;
            if (i12 == 2) {
                this.f386365a.a(new vw.a().f("audio/mpeg").c(1).n(f389464e[(iT2 >> 2) & 3]).a());
                this.f389466c = true;
            } else if (i12 == 7 || i12 == 8) {
                this.f386365a.a(new vw.a().f(i12 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").c(1).n(JosStatusCodes.RTN_CODE_COMMON_ERROR).a());
                this.f389466c = true;
            } else if (i12 != 10) {
                StringBuilder sbA = Cif.a("Audio format not supported: ");
                sbA.append(this.f389467d);
                throw new i81.a(sbA.toString());
            }
            this.f389465b = true;
        }
        return true;
    }

    public final boolean a(long j12, pr0 pr0Var) {
        if (this.f389467d == 2) {
            int iA2 = pr0Var.a();
            this.f386365a.a(iA2, pr0Var);
            this.f386365a.a(j12, 1, iA2, 0, null);
            return true;
        }
        int iT2 = pr0Var.t();
        if (iT2 == 0 && !this.f389466c) {
            int iA3 = pr0Var.a();
            byte[] bArr = new byte[iA3];
            pr0Var.a(bArr, 0, iA3);
            C39313d.a aVarA = C39313d.a(new or0(iA3, bArr), false);
            this.f386365a.a(new vw.a().f("audio/mp4a-latm").a(aVarA.f384500c).c(aVarA.f384499b).n(aVarA.f384498a).a(Collections.singletonList(bArr)).a());
            this.f389466c = true;
            return false;
        }
        if (this.f389467d == 10 && iT2 != 1) {
            return false;
        }
        int iA4 = pr0Var.a();
        this.f386365a.a(iA4, pr0Var);
        this.f386365a.a(j12, 1, iA4, 0, null);
        return true;
    }
}
