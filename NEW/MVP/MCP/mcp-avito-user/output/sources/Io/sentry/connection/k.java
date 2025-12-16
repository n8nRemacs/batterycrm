package io.sentry.connection;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

/* compiled from: ProxyAuthenticator.java */
/* loaded from: classes8.dex */
public class k extends Authenticator {

    /* renamed from: a, reason: collision with root package name */
    public String f405146a;

    /* renamed from: b, reason: collision with root package name */
    public String f405147b;

    @Override // java.net.Authenticator
    public final PasswordAuthentication getPasswordAuthentication() {
        if (getRequestorType() != Authenticator.RequestorType.PROXY) {
            return null;
        }
        return new PasswordAuthentication(this.f405146a, this.f405147b.toCharArray());
    }
}
