package com.google.android.gms.internal.auth;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
public final class zzfb extends IOException {

    /* renamed from: b, reason: collision with root package name */
    public zzfx f350107b;

    public zzfb(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public static zzfb a() {
        return new zzfb("Protocol message had invalid UTF-8.");
    }

    public static zzfb b() {
        return new zzfb("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzfb c() {
        return new zzfb("Failed to parse the message.");
    }

    public static zzfb d() {
        return new zzfb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final zzfb zze(zzfx zzfxVar) {
        this.f350107b = zzfxVar;
        return this;
    }

    public zzfb(String str) {
        super(str);
    }
}
