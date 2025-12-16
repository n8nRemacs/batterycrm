package zm;

import AK0.l;
import Y61.k;
import kotlin.Metadata;

/* compiled from: CaptchaStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzm/b;", "Lzm/a;", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zm.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C50588b implements InterfaceC50587a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f444236a;

    /* renamed from: b, reason: collision with root package name */
    public final long f444237b;

    public C50588b(@k l lVar, long j12) {
        this.f444236a = lVar;
        this.f444237b = j12;
    }

    @Override // zm.InterfaceC50587a
    public final boolean a() {
        return this.f444236a.getF316a().edit().putLong("captchaTime", System.currentTimeMillis()).commit();
    }

    @Override // zm.InterfaceC50587a
    public final boolean b() {
        return System.currentTimeMillis() - this.f444236a.getF316a().getLong("captchaTime", 0L) > this.f444237b;
    }

    @Override // zm.InterfaceC50587a
    public final boolean c(boolean z12) {
        return this.f444236a.getF316a().edit().putBoolean("captchaSuccess", z12).commit();
    }

    @Override // zm.InterfaceC50587a
    public final boolean d() {
        return this.f444236a.getF316a().getBoolean("captchaSuccess", false);
    }
}
