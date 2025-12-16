package com.yandex.mobile.ads.impl;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

/* loaded from: classes8.dex */
public final class z01 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final r7 f392129a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final x01 f392130b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final th f392131c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final zs f392132d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private List<? extends Proxy> f392133e;

    /* renamed from: f, reason: collision with root package name */
    private int f392134f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    private List<? extends InetSocketAddress> f392135g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    private final ArrayList f392136h;

    public static final class a {
        @Y61.k
        public static String a(@Y61.k InetSocketAddress inetSocketAddress) {
            InetAddress address = inetSocketAddress.getAddress();
            return address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        private final List<w01> f392137a;

        /* renamed from: b, reason: collision with root package name */
        private int f392138b;

        public b(@Y61.k ArrayList arrayList) {
            this.f392137a = arrayList;
        }

        @Y61.k
        public final List<w01> a() {
            return this.f392137a;
        }

        public final boolean b() {
            return this.f392138b < this.f392137a.size();
        }

        @Y61.k
        public final w01 c() {
            if (!b()) {
                throw new NoSuchElementException();
            }
            List<w01> list = this.f392137a;
            int i12 = this.f392138b;
            this.f392138b = i12 + 1;
            return list.get(i12);
        }
    }

    public z01(@Y61.k r7 r7Var, @Y61.k x01 x01Var, @Y61.k bx0 bx0Var, @Y61.k zs zsVar) {
        this.f392129a = r7Var;
        this.f392130b = x01Var;
        this.f392131c = bx0Var;
        this.f392132d = zsVar;
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.f392133e = c42784z0;
        this.f392135g = c42784z0;
        this.f392136h = new ArrayList();
        a(r7Var.k(), r7Var.f());
    }

    private final void a(s10 s10Var, Proxy proxy) {
        List<? extends Proxy> listA;
        zs zsVar = this.f392132d;
        th thVar = this.f392131c;
        zsVar.getClass();
        zs.a(thVar, s10Var);
        if (proxy != null) {
            listA = Collections.singletonList(proxy);
        } else {
            URI uriM = s10Var.m();
            if (uriM.getHost() == null) {
                listA = qc1.a(Proxy.NO_PROXY);
            } else {
                List<Proxy> listSelect = this.f392129a.h().select(uriM);
                listA = (listSelect == null || listSelect.isEmpty()) ? qc1.a(Proxy.NO_PROXY) : qc1.b(listSelect);
            }
        }
        this.f392133e = listA;
        this.f392134f = 0;
        zs zsVar2 = this.f392132d;
        th thVar2 = this.f392131c;
        zsVar2.getClass();
        zs.a(thVar2, s10Var, listA);
    }

    @Y61.k
    public final b b() {
        String strG;
        int i12;
        if (!a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (this.f392134f < this.f392133e.size()) {
            if (this.f392134f >= this.f392133e.size()) {
                StringBuilder sbA = Cif.a("No route to ");
                sbA.append(this.f392129a.k().g());
                sbA.append("; exhausted proxy configurations: ");
                sbA.append(this.f392133e);
                throw new SocketException(sbA.toString());
            }
            List<? extends Proxy> list = this.f392133e;
            int i13 = this.f392134f;
            this.f392134f = i13 + 1;
            Proxy proxy = list.get(i13);
            ArrayList arrayList2 = new ArrayList();
            this.f392135g = arrayList2;
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                strG = this.f392129a.k().g();
                i12 = this.f392129a.k().i();
            } else {
                SocketAddress socketAddressAddress = proxy.address();
                if (!(socketAddressAddress instanceof InetSocketAddress)) {
                    StringBuilder sbA2 = Cif.a("Proxy.address() is not an InetSocketAddress: ");
                    sbA2.append(socketAddressAddress.getClass());
                    throw new IllegalArgumentException(sbA2.toString().toString());
                }
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                strG = a.a(inetSocketAddress);
                i12 = inetSocketAddress.getPort();
            }
            if (1 > i12 || i12 >= 65536) {
                throw new SocketException("No route to " + strG + ':' + i12 + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList2.add(InetSocketAddress.createUnresolved(strG, i12));
            } else {
                zs zsVar = this.f392132d;
                th thVar = this.f392131c;
                zsVar.getClass();
                zs.a(thVar, strG);
                List<InetAddress> listA = this.f392129a.c().a(strG);
                if (listA.isEmpty()) {
                    throw new UnknownHostException(this.f392129a.c() + " returned no addresses for " + strG);
                }
                zs zsVar2 = this.f392132d;
                th thVar2 = this.f392131c;
                zsVar2.getClass();
                zs.a(thVar2, strG, listA);
                Iterator<InetAddress> it = listA.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new InetSocketAddress(it.next(), i12));
                }
            }
            Iterator<? extends InetSocketAddress> it2 = this.f392135g.iterator();
            while (it2.hasNext()) {
                w01 w01Var = new w01(this.f392129a, proxy, it2.next());
                if (this.f392130b.c(w01Var)) {
                    this.f392136h.add(w01Var);
                } else {
                    arrayList.add(w01Var);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            C42745f0.h(this.f392136h, arrayList);
            this.f392136h.clear();
        }
        return new b(arrayList);
    }

    public final boolean a() {
        return this.f392134f < this.f392133e.size() || !this.f392136h.isEmpty();
    }
}
