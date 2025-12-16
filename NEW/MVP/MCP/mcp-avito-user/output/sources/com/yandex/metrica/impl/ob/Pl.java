package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.UUID;
import kotlin.text.C43047d;
import kotlin.text.C43066x;

/* loaded from: classes7.dex */
public final class Pl {

    /* renamed from: a, reason: collision with root package name */
    private final Context f379223a;

    /* renamed from: b, reason: collision with root package name */
    private final C39241xb f379224b;

    /* renamed from: c, reason: collision with root package name */
    private final Bb f379225c;

    @j.k0
    public Pl(@Y61.k Context context, @Y61.k C39241xb c39241xb, @Y61.k Bb bb2) {
        this.f379223a = context;
        this.f379224b = c39241xb;
        this.f379225c = bb2;
    }

    private final String b() {
        return C43066x.a0(UUID.randomUUID().toString(), "-", "", false).toLowerCase(Locale.US);
    }

    @Y61.k
    public final String a() {
        byte[] bArrDigest;
        C39169ub c39169ubC = this.f379224b.a(this.f379223a, new Hb(5, 500)).c();
        if (c39169ubC.a()) {
            try {
                bArrDigest = MessageDigest.getInstance("MD5").digest(c39169ubC.f381928a.f381872b.getBytes(C43047d.f410589b));
            } catch (NoSuchAlgorithmException unused) {
                bArrDigest = new byte[0];
            }
            return C38689b.a(bArrDigest);
        }
        String strA = this.f379225c.a().a();
        if (strA != null && strA.length() != 0) {
            try {
                UUID.fromString(strA);
                if (!strA.equals("00000000-0000-0000-0000-000000000000")) {
                    return C43066x.a0(strA, "-", "", false);
                }
            } catch (Throwable unused2) {
            }
        }
        return b();
    }

    public Pl(@Y61.k Context context) {
        this(context, F0.g().r(), F0.g().a());
    }
}
