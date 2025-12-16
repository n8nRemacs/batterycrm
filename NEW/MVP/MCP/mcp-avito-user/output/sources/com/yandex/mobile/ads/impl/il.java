package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.p91;
import com.yandex.mobile.ads.impl.si;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.InterfaceC42830m;
import kotlin.collections.C42745f0;

/* loaded from: classes8.dex */
public final class il {

    /* renamed from: e, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final il f386510e;

    /* renamed from: f, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final il f386511f;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f386512a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f386513b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    private final String[] f386514c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    private final String[] f386515d;

    static {
        si siVar = si.f389966r;
        si siVar2 = si.f389967s;
        si siVar3 = si.f389968t;
        si siVar4 = si.f389960l;
        si siVar5 = si.f389962n;
        si siVar6 = si.f389961m;
        si siVar7 = si.f389963o;
        si siVar8 = si.f389965q;
        si siVar9 = si.f389964p;
        si[] siVarArr = {siVar, siVar2, siVar3, siVar4, siVar5, siVar6, siVar7, siVar8, siVar9, si.f389958j, si.f389959k, si.f389956h, si.f389957i, si.f389954f, si.f389955g, si.f389953e};
        a aVarA = new a(true).a((si[]) Arrays.copyOf(new si[]{siVar, siVar2, siVar3, siVar4, siVar5, siVar6, siVar7, siVar8, siVar9}, 9));
        p91 p91Var = p91.f388745b;
        p91 p91Var2 = p91.f388746c;
        aVarA.a(p91Var, p91Var2).b().a();
        f386510e = new a(true).a((si[]) Arrays.copyOf(siVarArr, 16)).a(p91Var, p91Var2).b().a();
        new a(true).a((si[]) Arrays.copyOf(siVarArr, 16)).a(p91Var, p91Var2, p91.f388747d, p91.f388748e).b().a();
        f386511f = new a(false).a();
    }

    public il(boolean z12, boolean z13, @Y61.l String[] strArr, @Y61.l String[] strArr2) {
        this.f386512a = z12;
        this.f386513b = z13;
        this.f386514c = strArr;
        this.f386515d = strArr2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (!(obj instanceof il)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z12 = this.f386512a;
        il ilVar = (il) obj;
        if (z12 != ilVar.f386512a) {
            return false;
        }
        return !z12 || (Arrays.equals(this.f386514c, ilVar.f386514c) && Arrays.equals(this.f386515d, ilVar.f386515d) && this.f386513b == ilVar.f386513b);
    }

    public final int hashCode() {
        if (!this.f386512a) {
            return 17;
        }
        String[] strArr = this.f386514c;
        int iHashCode = ((strArr != null ? Arrays.hashCode(strArr) : 0) + 527) * 31;
        String[] strArr2 = this.f386515d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f386513b ? 1 : 0);
    }

    @Y61.k
    public final String toString() {
        List listM0;
        if (!this.f386512a) {
            return "ConnectionSpec()";
        }
        StringBuilder sbA = Cif.a("ConnectionSpec(cipherSuites=");
        String[] strArr = this.f386514c;
        List listM02 = null;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(si.f389950b.a(str));
            }
            listM0 = C42745f0.M0(arrayList);
        } else {
            listM0 = null;
        }
        sbA.append(Objects.toString(listM0, "[all enabled]"));
        sbA.append(", tlsVersions=");
        String[] strArr2 = this.f386515d;
        if (strArr2 != null) {
            ArrayList arrayList2 = new ArrayList(strArr2.length);
            for (String str2 : strArr2) {
                arrayList2.add(p91.a.a(str2));
            }
            listM02 = C42745f0.M0(arrayList2);
        }
        sbA.append(Objects.toString(listM02, "[all enabled]"));
        sbA.append(", supportsTlsExtensions=");
        return androidx.appcompat.app.r.x(sbA, this.f386513b, ')');
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f386516a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        private String[] f386517b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        private String[] f386518c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f386519d;

        public a(boolean z12) {
            this.f386516a = z12;
        }

        @Y61.k
        public final a a(@Y61.k si... siVarArr) {
            if (!this.f386516a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(siVarArr.length);
            for (si siVar : siVarArr) {
                arrayList.add(siVar.c());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return a((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @Y61.k
        public final a b(@Y61.k String... strArr) {
            if (!this.f386516a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f386518c = (String[]) strArr.clone();
            return this;
        }

        public a(@Y61.k il ilVar) {
            this.f386516a = ilVar.a();
            this.f386517b = ilVar.f386514c;
            this.f386518c = ilVar.f386515d;
            this.f386519d = ilVar.b();
        }

        @Y61.k
        @InterfaceC42830m
        public final a b() {
            if (this.f386516a) {
                this.f386519d = true;
                return this;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }

        @Y61.k
        public final a a(@Y61.k String... strArr) {
            if (this.f386516a) {
                if (!(strArr.length == 0)) {
                    this.f386517b = (String[]) strArr.clone();
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }

        @Y61.k
        public final a a(@Y61.k p91... p91VarArr) {
            if (this.f386516a) {
                ArrayList arrayList = new ArrayList(p91VarArr.length);
                for (p91 p91Var : p91VarArr) {
                    arrayList.add(p91Var.a());
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                return b((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }

        @Y61.k
        public final il a() {
            return new il(this.f386516a, this.f386519d, this.f386517b, this.f386518c);
        }
    }

    @X41.i
    public final boolean a() {
        return this.f386512a;
    }

    @X41.i
    public final boolean b() {
        return this.f386513b;
    }

    public final void a(@Y61.k SSLSocket sSLSocket, boolean z12) {
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        List listM0;
        if (this.f386514c != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            String[] strArr = this.f386514c;
            si.b bVar = si.f389950b;
            enabledCipherSuites = qc1.b(enabledCipherSuites2, strArr, si.b.a());
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f386515d != null) {
            enabledProtocols = qc1.b(sSLSocket.getEnabledProtocols(), this.f386515d, (Comparator<? super String>) kotlin.comparisons.a.d());
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        si.b bVar2 = si.f389950b;
        int iA2 = qc1.a(supportedCipherSuites, si.b.a());
        if (z12 && iA2 != -1) {
            enabledCipherSuites = qc1.a(supportedCipherSuites[iA2], enabledCipherSuites);
        }
        il ilVarA = new a(this).a((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length)).b((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length)).a();
        String[] strArr2 = ilVarA.f386515d;
        List listM02 = null;
        if (strArr2 != null) {
            ArrayList arrayList = new ArrayList(strArr2.length);
            for (String str : strArr2) {
                arrayList.add(p91.a.a(str));
            }
            listM0 = C42745f0.M0(arrayList);
        } else {
            listM0 = null;
        }
        if (listM0 != null) {
            sSLSocket.setEnabledProtocols(ilVarA.f386515d);
        }
        String[] strArr3 = ilVarA.f386514c;
        if (strArr3 != null) {
            ArrayList arrayList2 = new ArrayList(strArr3.length);
            for (String str2 : strArr3) {
                arrayList2.add(si.f389950b.a(str2));
            }
            listM02 = C42745f0.M0(arrayList2);
        }
        if (listM02 != null) {
            sSLSocket.setEnabledCipherSuites(ilVarA.f386514c);
        }
    }

    public final boolean a(@Y61.k SSLSocket sSLSocket) {
        if (!this.f386512a) {
            return false;
        }
        String[] strArr = this.f386515d;
        if (strArr != null && !qc1.a(strArr, sSLSocket.getEnabledProtocols(), (Comparator<? super String>) kotlin.comparisons.a.d())) {
            return false;
        }
        String[] strArr2 = this.f386514c;
        if (strArr2 == null) {
            return true;
        }
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        si.b bVar = si.f389950b;
        return qc1.a(strArr2, enabledCipherSuites, si.b.a());
    }
}
