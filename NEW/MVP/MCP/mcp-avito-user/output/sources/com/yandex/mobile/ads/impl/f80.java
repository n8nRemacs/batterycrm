package com.yandex.mobile.ads.impl;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.util.List;
import kotlin.collections.C42745f0;

/* loaded from: classes8.dex */
public final class f80 implements wc {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final lr f385218b;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f385219a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            f385219a = iArr;
        }
    }

    public f80(@Y61.k lr lrVar) {
        this.f385218b = lrVar;
    }

    @Override // com.yandex.mobile.ads.impl.wc
    @Y61.l
    public final ry0 a(@Y61.l w01 w01Var, @Y61.k iz0 iz0Var) {
        Proxy proxyB;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        r7 r7VarA;
        lr lrVarC;
        List<li> listD = iz0Var.d();
        ry0 ry0VarP = iz0Var.p();
        s10 s10VarH = ry0VarP.h();
        boolean z12 = iz0Var.e() == 407;
        if (w01Var == null || (proxyB = w01Var.b()) == null) {
            proxyB = Proxy.NO_PROXY;
        }
        for (li liVar : listD) {
            if ("Basic".equalsIgnoreCase(liVar.c())) {
                lr lrVar = (w01Var == null || (r7VarA = w01Var.a()) == null || (lrVarC = r7VarA.c()) == null) ? this.f385218b : lrVarC;
                if (z12) {
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) proxyB.address();
                    String hostName = inetSocketAddress.getHostName();
                    Proxy.Type type = proxyB.type();
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, (type != null ? a.f385219a[type.ordinal()] : -1) == 1 ? (InetAddress) C42745f0.E(lrVar.a(s10VarH.g())) : ((InetSocketAddress) proxyB.address()).getAddress(), inetSocketAddress.getPort(), s10VarH.l(), liVar.b(), liVar.c(), s10VarH.n(), Authenticator.RequestorType.PROXY);
                } else {
                    String strG = s10VarH.g();
                    Proxy.Type type2 = proxyB.type();
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(strG, (type2 != null ? a.f385219a[type2.ordinal()] : -1) == 1 ? (InetAddress) C42745f0.E(lrVar.a(s10VarH.g())) : ((InetSocketAddress) proxyB.address()).getAddress(), s10VarH.i(), s10VarH.l(), liVar.b(), liVar.c(), s10VarH.n(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    return ry0VarP.g().b(z12 ? "Proxy-Authorization" : "Authorization", sm.a(passwordAuthenticationRequestPasswordAuthentication.getUserName(), new String(passwordAuthenticationRequestPasswordAuthentication.getPassword()), liVar.a())).a();
                }
            }
        }
        return null;
    }
}
