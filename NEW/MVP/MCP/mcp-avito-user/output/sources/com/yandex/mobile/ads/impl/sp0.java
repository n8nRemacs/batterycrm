package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class sp0 extends mb<String, String> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final yz0 f390009a = new yz0();

    @Override // com.yandex.mobile.ads.impl.mb
    @j.N
    public final eb a(@j.N Object obj, @j.N String str) throws NumberFormatException {
        String strA = (String) obj;
        if ("review_count".equals(str)) {
            try {
                strA = this.f390009a.a(strA);
            } catch (yk0 unused) {
            }
        }
        return new eb(str, "string", strA, null, false, false);
    }
}
