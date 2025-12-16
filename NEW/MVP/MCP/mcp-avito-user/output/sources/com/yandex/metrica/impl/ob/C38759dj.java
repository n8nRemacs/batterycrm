package com.yandex.metrica.impl.ob;

import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.dj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38759dj {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final InterfaceC38709bj f380413a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C39132sm f380414b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C38809fj f380415c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final InterfaceC38734cj f380416d;

    @j.k0
    public C38759dj(@j.N InterfaceC38709bj interfaceC38709bj, @j.N InterfaceC38734cj interfaceC38734cj, @j.N C39132sm c39132sm, @j.N C38809fj c38809fj) {
        this.f380413a = interfaceC38709bj;
        this.f380416d = interfaceC38734cj;
        this.f380414b = c39132sm;
        this.f380415c = c38809fj;
    }

    @j.N
    public W0 a() {
        String strA;
        try {
            this.f380414b.a();
            strA = this.f380415c.a();
            try {
                if (TextUtils.isEmpty(strA)) {
                    strA = this.f380413a.a();
                    if (!TextUtils.isEmpty(strA) || this.f380416d.a()) {
                        strA = this.f380415c.a(strA);
                    }
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            strA = null;
        }
        this.f380414b.b();
        return strA == null ? new W0(null, U0.UNKNOWN, "Uuid must be obtained via async API YandexMetricaInternal#requestStartupIdentifiers(@NonNull Context context, @NonNull IIdentifierCallback callback,@NonNull String... identifiers)") : new W0(strA, U0.OK, null);
    }
}
