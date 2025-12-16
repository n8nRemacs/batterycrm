package com.avito.android.verification.links.open;

import Y61.k;
import android.util.Base64;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43047d;

/* compiled from: VerificationOpenLinkCodeGenerator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/links/open/a;", "", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final MessageDigest f324321a = MessageDigest.getInstance("SHA-256");

    @Inject
    public a() {
    }

    @k
    public static String a() {
        return UUID.randomUUID().toString() + UUID.randomUUID();
    }

    @k
    public final String b(@k String str) {
        Charset charset = C43047d.f410589b;
        return new String(Base64.encode(this.f324321a.digest(str.getBytes(charset)), 11), charset);
    }
}
