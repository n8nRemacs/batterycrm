package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
public class Z8 extends AbstractC38749d9 {

    /* renamed from: c, reason: collision with root package name */
    private static final Rd f379996c = new Rd("LAST_SATELLITE_CLIDS_DIAGNOSTICS_SENT_TIME", null);

    /* renamed from: d, reason: collision with root package name */
    private static final Rd f379997d = new Rd("LAST_PRELOAD_INFO_DIAGNOSTICS_SENT_TIME", null);

    public Z8(@j.N S7 s72) {
        super(s72);
    }

    public long b(long j12) {
        return a(f379996c.a(), j12);
    }

    public long c(long j12) {
        return a(f379997d.a(), j12);
    }

    public Z8 d(long j12) {
        return (Z8) b(f379996c.a(), j12);
    }

    public Z8 e(long j12) {
        return (Z8) b(f379997d.a(), j12);
    }
}
