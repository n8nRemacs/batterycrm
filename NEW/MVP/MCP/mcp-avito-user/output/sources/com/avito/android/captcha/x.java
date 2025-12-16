package com.avito.android.captcha;

import com.avito.android.captcha.p;
import com.avito.android.util.InterfaceC35950u;
import com.avito.android.util.R0;
import id.C41383a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CaptchaProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/captcha/x;", "Lcom/avito/android/captcha/w;", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class x implements w {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C41383a f115139a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.D f115140b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35950u f115141c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f115142d;

    public x(@Y61.k com.avito.android.D d12, @Y61.k InterfaceC35950u interfaceC35950u, @Y61.k R0 r02, @Y61.k C41383a c41383a) {
        this.f115139a = c41383a;
        this.f115140b = d12;
        this.f115141c = interfaceC35950u;
        this.f115142d = r02;
    }

    @Override // com.avito.android.captcha.w
    @Y61.l
    public final r a(@Y61.k p pVar) {
        boolean zEquals = pVar.equals(p.c.f115124b);
        com.avito.android.D d12 = this.f115140b;
        C41383a c41383a = this.f115139a;
        if (zEquals) {
            return new I(c41383a, d12);
        }
        boolean zEquals2 = pVar.equals(p.b.f115123b);
        R0 r02 = this.f115142d;
        if (zEquals2) {
            return new B(d12, this.f115141c, r02, c41383a);
        }
        if (pVar instanceof p.a) {
            p.a aVar = (p.a) pVar;
            return new C29327h(c41383a, aVar.f115121b, aVar.f115122c, r02);
        }
        if (pVar.equals(p.d.f115125b)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
