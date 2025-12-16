package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.io.IOException;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
public class zzvv extends IOException {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f354068c = 0;

    /* renamed from: b, reason: collision with root package name */
    public zzws f354069b;

    public zzvv(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public static zzvv a() {
        return new zzvv("Protocol message had invalid UTF-8.");
    }

    public static zzvv b() {
        return new zzvv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzvv c() {
        return new zzvv("Failed to parse the message.");
    }

    public static zzvv d() {
        return new zzvv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final zzvv zzf(zzws zzwsVar) {
        this.f354069b = zzwsVar;
        return this;
    }

    public zzvv(String str) {
        super(str);
    }
}
