package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
public class zzen extends IOException {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f352448c = 0;

    /* renamed from: b, reason: collision with root package name */
    public zzfl f352449b;

    public zzen(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public static zzen a() {
        return new zzen("Protocol message had invalid UTF-8.");
    }

    public static zzen b() {
        return new zzen("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzen c() {
        return new zzen("Failed to parse the message.");
    }

    public static zzen d() {
        return new zzen("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final zzen zzf(zzfl zzflVar) {
        this.f352449b = zzflVar;
        return this;
    }

    public zzen(String str) {
        super(str);
    }
}
