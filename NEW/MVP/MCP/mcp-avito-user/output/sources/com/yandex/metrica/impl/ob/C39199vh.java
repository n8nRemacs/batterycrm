package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Fh;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;

/* renamed from: com.yandex.metrica.impl.ob.vh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C39199vh implements Fh {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final File f382080a;

    public C39199vh(@j.N File file) {
        this.f382080a = file;
    }

    @Override // com.yandex.metrica.impl.ob.Fh
    @j.N
    public ServerSocket a(int i12) throws Fh.a, NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException, KeyManagementException {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            KeyStore keyStore = KeyStore.getInstance("PKCS12");
            keyStore.load(new FileInputStream(this.f382080a), "`0l}%01ny{jl~;|&".toCharArray());
            keyManagerFactory.init(keyStore, "`0l}%01ny{jl~;|&".toCharArray());
            sSLContext.init(keyManagerFactory.getKeyManagers(), null, null);
            return sSLContext.getServerSocketFactory().createServerSocket(i12);
        } catch (Exception e12) {
            throw new Fh.a("https_open_error", e12);
        }
    }
}
