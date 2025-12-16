package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.crypto.KeyAgreement;
import tech.kwik.agent15.TlsProtocolException;
import tech.kwik.agent15.alert.DecryptErrorAlert;
import tech.kwik.agent15.alert.IllegalParameterAlert;
import tech.kwik.agent15.alert.MissingExtensionAlert;
import tech.kwik.agent15.alert.UnexpectedMessageAlert;
import tech.kwik.agent15.alert.UnsupportedExtensionAlert;
import tech.kwik.core.impl.TransportError;

/* loaded from: classes.dex */
public final class bbg extends ds4 implements nb3 {
    public static final List A;
    public static final Charset B;
    public final xpb e;
    public final ysc f;
    public String g;
    public final ArrayList h;
    public mbg i;
    public jbg j;
    public final ArrayList k;
    public ArrayList l;
    public int m;
    public hb3 n;
    public jdc o;
    public List p;
    public X509Certificate q;
    public List r;
    public xsc s;
    public t77 t;
    public final ArrayList u;
    public boolean v;
    public boolean w;
    public List x;
    public final Function y;
    public List z;

    static {
        Object[] objArr = {obg.rsa_pss_rsae_sha256, obg.rsa_pss_rsae_sha384, obg.rsa_pss_rsae_sha512, obg.ecdsa_secp256r1_sha256, obg.ecdsa_secp384r1_sha384, obg.ecdsa_secp521r1_sha512};
        ArrayList arrayList = new ArrayList(6);
        for (int i = 0; i < 6; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        A = Collections.unmodifiableList(arrayList);
        B = Charset.forName("ISO-8859-1");
    }

    public bbg(xpb xpbVar, ysc yscVar) {
        this.d = e5j.a == 2 ? new lcj(26) : new kc3(27);
        this.m = 1;
        this.r = Collections.EMPTY_LIST;
        this.v = false;
        this.e = xpbVar;
        this.f = yscVar;
        this.h = new ArrayList();
        this.k = new ArrayList();
        int i = 18;
        this.t = new qha(i);
        this.u = new ArrayList();
        this.y = new xga(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0125  */
    @Override // defpackage.pl9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.i72 r10, int r11) throws tech.kwik.agent15.alert.BadCertificateAlert, java.security.NoSuchAlgorithmException, java.security.SignatureException, tech.kwik.agent15.alert.HandshakeFailureAlert, java.security.InvalidKeyException, tech.kwik.agent15.alert.IllegalParameterAlert, java.security.KeyStoreException, java.security.cert.CertificateException, tech.kwik.agent15.alert.CertificateUnknownAlert, tech.kwik.agent15.alert.DecryptErrorAlert, tech.kwik.agent15.alert.UnexpectedMessageAlert, java.security.InvalidAlgorithmParameterException {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbg.b(i72, int):void");
    }

    @Override // defpackage.pl9
    public final void c(h72 h72Var, int i) throws UnexpectedMessageAlert {
        if (i != 2) {
            throw new UnexpectedMessageAlert("incorrect protection level");
        }
        if (this.m != 4) {
            throw new UnexpectedMessageAlert("unexpected certificate request message");
        }
        this.z = (List) ((ArrayList) h72Var.c).stream().filter(new nie(5)).findFirst().map(new xga(14)).orElseThrow(new ik(8));
        this.o.y(h72Var);
        this.x = (List) ((ArrayList) h72Var.c).stream().filter(new nie(6)).findFirst().map(new xga(15)).orElse(Collections.EMPTY_LIST);
        this.w = true;
        this.m = 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pl9
    public final void d(h72 h72Var, int i) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException, DecryptErrorAlert, UnexpectedMessageAlert {
        hf5 hf5Var;
        if (i != 2) {
            throw new UnexpectedMessageAlert("incorrect protection level");
        }
        if (this.m != 7) {
            throw new UnexpectedMessageAlert("unexpected finished message");
        }
        this.o.A(h72Var);
        jdc jdcVar = this.o;
        lbg lbgVar = lbg.certificate_verify;
        jdcVar.getClass();
        if (!Arrays.equals(h72Var.b, j(jdcVar.w(jdc.j(lbgVar, false)), ((pbg) this.c).m))) {
            throw new DecryptErrorAlert("incorrect finished message");
        }
        int i2 = 3;
        if (this.w) {
            xpb xpbVar = this.e;
            f72 f72Var = new f72();
            f72Var.c = new ArrayList();
            f72Var.a = new byte[0];
            f72Var.b = null;
            f72Var.c = Collections.EMPTY_LIST;
            List list = f72Var.c;
            int size = list.size();
            List list2 = (List) list.stream().map(new ni(i2, f72Var)).collect(Collectors.toList());
            int iSum = list2.stream().mapToInt(new n0(5)).sum() + (size * 5) + 8;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iSum);
            byteBufferAllocate.putInt((lbg.certificate.a << 24) | (iSum - 4));
            byteBufferAllocate.put((byte) 0);
            byteBufferAllocate.put((byte) 0);
            byteBufferAllocate.putShort((short) (iSum - 8));
            list2.forEach(new as(2, byteBufferAllocate));
            f72Var.d = byteBufferAllocate.array();
            db4 db4VarE = ((ysc) xpbVar.c).e(hf5.c);
            db4VarE.c(f72Var);
            ((bh8) xpbVar.b).sentPacketInfo(db4VarE.b(db4VarE.i));
            this.o.z(f72Var);
        }
        jdc jdcVar2 = this.o;
        jdcVar2.getClass();
        byte[] bArrJ = j(jdcVar2.w(jdc.j(lbgVar, true)), ((pbg) this.c).n);
        h72 h72Var2 = new h72(2);
        h72Var2.b = bArrJ;
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bArrJ.length + 4);
        lbg lbgVar2 = lbg.finished;
        byteBufferAllocate2.putInt((lbgVar2.a << 24) | h72Var2.b.length);
        byteBufferAllocate2.put(h72Var2.b);
        h72Var2.c = byteBufferAllocate2.array();
        xpb xpbVar2 = this.e;
        db4 db4VarE2 = ((ysc) xpbVar2.c).e(hf5.c);
        db4VarE2.c(h72Var2);
        ((bh8) xpbVar2.b).sentPacketInfo(db4VarE2.b(db4VarE2.i));
        this.o.z(h72Var2);
        pbg pbgVar = (pbg) this.c;
        byte[] bArr = pbgVar.o;
        jdc jdcVar3 = pbgVar.r;
        jdcVar3.getClass();
        byte[] bArrW = jdcVar3.w(jdc.j(lbgVar2, false));
        byte[] bArr2 = pbgVar.c;
        int i3 = pbgVar.e;
        byte[] bArrB = pbgVar.b(bArr, "derived", bArr2, i3);
        xrf.u("Derived secret: ", yx0.a(bArrB));
        byte[] bArrW2 = pbgVar.b.w(bArrB, new byte[i3]);
        pbgVar.t = bArrW2;
        xrf.u("Master secret: ", yx0.a(bArrW2));
        byte[] bArrB2 = pbgVar.b(pbgVar.t, "c ap traffic", bArrW, i3);
        pbgVar.p = bArrB2;
        xrf.u("Client application traffic secret: ", yx0.a(bArrB2));
        byte[] bArrB3 = pbgVar.b(pbgVar.t, "s ap traffic", bArrW, i3);
        pbgVar.q = bArrB3;
        xrf.u("Server application traffic secret: ", yx0.a(bArrB3));
        byte[] bArr3 = pbgVar.p;
        short s = pbgVar.d;
        Charset charset = pbg.u;
        xrf.u("Client application key: ", yx0.a(pbgVar.b(bArr3, "key", "".getBytes(charset), s)));
        xrf.u("Server application key: ", yx0.a(pbgVar.b(pbgVar.q, "key", "".getBytes(charset), s)));
        xrf.u("Client application iv: ", yx0.a(pbgVar.b(pbgVar.p, "iv", "".getBytes(charset), (short) 12)));
        xrf.u("Server application iv: ", yx0.a(pbgVar.b(pbgVar.q, "iv", "".getBytes(charset), (short) 12)));
        pbg pbgVar2 = (pbg) this.c;
        jdc jdcVar4 = pbgVar2.r;
        jdcVar4.getClass();
        byte[] bArrB4 = pbgVar2.b(pbgVar2.t, "res master", jdcVar4.w(jdc.j(lbgVar2, true)), pbgVar2.e);
        pbgVar2.l = bArrB4;
        xrf.u("Resumption master secret: ", yx0.a(bArrB4));
        this.m = 8;
        ysc yscVar = this.f;
        fs3 fs3Var = yscVar.o;
        bbg bbgVar = yscVar.I0;
        synchronized (fs3Var) {
            hf5Var = hf5.d;
            fs3Var.c(hf5Var, (jbg) fs3Var.c, (zzg) ((qje) fs3Var.d).b);
            pbg pbgVar3 = (pbg) bbgVar.c;
            if (pbgVar3 == null) {
                throw new IllegalStateException("Traffic secret not yet available");
            }
            byte[] bArr4 = pbgVar3.p;
            ((bh8) fs3Var.e).secret("ClientApplicationTrafficSecret: ", bArr4);
            ((kc) ((hc[]) fs3Var.h)[3]).e(bArr4);
            pbg pbgVar4 = (pbg) bbgVar.c;
            if (pbgVar4 == null) {
                throw new IllegalStateException("Traffic secret not yet available");
            }
            byte[] bArr5 = pbgVar4.q;
            ((bh8) fs3Var.e).secret("ServerApplicationTrafficSecret: ", bArr5);
            ((kc) ((hc[]) fs3Var.i)[3]).e(bArr5);
            if (fs3Var.b) {
                fs3Var.a("TRAFFIC_SECRET_0", hf5Var);
            }
        }
        yscVar.s0 = hf5Var;
        synchronized (yscVar.Y) {
            try {
                if (az1.v(yscVar.X) < az1.v(3)) {
                    yscVar.X = 3;
                    yscVar.Z.forEach(new vsc(yscVar, 1));
                } else {
                    yscVar.c.error("Handshake state cannot be set to HasAppKeys; current state is ".concat(u45.u(yscVar.X)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        yscVar.A0 = 3;
        yscVar.V0.countDown();
    }

    @Override // defpackage.pl9
    public final void e(h72 h72Var, int i) throws TlsProtocolException {
        if (i != 2) {
            throw new UnexpectedMessageAlert("incorrect protection level");
        }
        if (this.m != 3) {
            throw new UnexpectedMessageAlert("unexpected encrypted extensions message");
        }
        final List list = (List) this.l.stream().map(new xga(16)).collect(Collectors.toList());
        final int i2 = 1;
        if (!((List) h72Var.c).stream().filter(new nie(8)).allMatch(new Predicate() { // from class: zag
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                switch (i2) {
                    case 0:
                        return list.contains((obg) obj);
                    default:
                        return list.contains(((rn5) obj).getClass());
                }
            }
        })) {
            throw new UnsupportedExtensionAlert("extension response to missing request");
        }
        if (((Set) ((List) h72Var.c).stream().map(new xga(17)).collect(Collectors.toSet())).size() != ((List) h72Var.c).size()) {
            throw new UnsupportedExtensionAlert("duplicate extensions not allowed");
        }
        this.o.y(h72Var);
        this.m = this.v ? 7 : 4;
        ysc yscVar = this.f;
        List<rn5> list2 = (List) h72Var.c;
        yscVar.getClass();
        for (rn5 rn5Var : list2) {
            if (rn5Var instanceof g85) {
                yscVar.g1 = 3;
                yscVar.c.info("Server has accepted early data.");
            } else if (rn5Var instanceof dtc) {
                try {
                    yscVar.n(((dtc) rn5Var).d);
                } catch (TransportError e) {
                    throw new TlsProtocolException("Invalid transport parameters", e);
                }
            } else {
                continue;
            }
        }
    }

    @Override // defpackage.pl9
    public final void f(f72 f72Var, int i) throws IllegalParameterAlert, UnexpectedMessageAlert {
        if (i != 2) {
            throw new UnexpectedMessageAlert("incorrect protection level");
        }
        int i2 = this.m;
        if (i2 != 5 && i2 != 4) {
            throw new UnexpectedMessageAlert("unexpected certificate message");
        }
        if (f72Var.a.length > 0) {
            throw new IllegalParameterAlert("certificate request context should be zero length");
        }
        X509Certificate x509Certificate = f72Var.b;
        if (x509Certificate == null) {
            throw new IllegalParameterAlert("missing certificate");
        }
        this.q = x509Certificate;
        this.r = f72Var.c;
        this.o.A(f72Var);
        this.m = 6;
    }

    @Override // defpackage.pl9
    public final void g(cha chaVar, int i) throws UnexpectedMessageAlert {
        if (i != 3) {
            throw new UnexpectedMessageAlert("incorrect protection level");
        }
        pbg pbgVar = (pbg) this.c;
        pbgVar.b(pbgVar.l, "resumption", chaVar.c, pbgVar.e);
        c32 c32Var = new c32(3);
        c32Var.d = new Date();
        c32Var.b = chaVar.d;
        g85 g85Var = chaVar.e;
        boolean z = g85Var != null;
        if (z) {
            c32Var.c = g85Var.a.longValue();
        }
        this.u.add(c32Var);
        ysc yscVar = this.f;
        yscVar.getClass();
        if (z && c32Var.c != 4294967295L) {
            yscVar.c.error("Invalid quic new session ticket (invalid early data size); ignoring ticket.");
        }
        List list = yscVar.Y0;
        lig ligVar = yscVar.W0;
        wha whaVar = new wha(27);
        long j = ligVar.b;
        list.add(whaVar);
    }

    @Override // defpackage.pl9
    public final void h(lfe lfeVar) throws IllegalStateException, NoSuchAlgorithmException, IllegalParameterAlert, MissingExtensionAlert, InvalidKeyException {
        hf5 hf5Var;
        KeyAgreement keyAgreement;
        if (this.m != 2) {
            return;
        }
        boolean zAnyMatch = lfeVar.d.stream().anyMatch(new nie(7));
        boolean zAnyMatch2 = lfeVar.d.stream().anyMatch(new nie(11));
        if (!zAnyMatch || !zAnyMatch2) {
            throw new MissingExtensionAlert();
        }
        if (((Short) lfeVar.d.stream().filter(new nie(12)).map(new xga(19)).findFirst().get()).shortValue() != 772) {
            throw new IllegalParameterAlert("invalid tls version");
        }
        if (lfeVar.d.stream().filter(new abg(this)).anyMatch(new nie(13))) {
            throw new IllegalParameterAlert("illegal extension in server hello");
        }
        Optional optionalFindFirst = lfeVar.d.stream().filter(new nie(14)).findFirst();
        Optional optionalEmpty = Optional.empty();
        if (optionalFindFirst.isPresent()) {
            optionalEmpty = Optional.of((hz7) optionalFindFirst.filter(new nie(15)).map(new xga(13)).orElseThrow(new ik(6)));
            if (((hz7) optionalEmpty.get()).a != this.i) {
                throw new IllegalParameterAlert("server supplied key share does not match client supported named group");
            }
        }
        Optional optionalFindFirst2 = lfeVar.d.stream().filter(new nie(10)).findFirst();
        if (!optionalEmpty.isPresent() && !optionalFindFirst2.isPresent()) {
            throw new MissingExtensionAlert(" either the pre_shared_key extension or the key_share extension must be present", ibg.missing_extension);
        }
        boolean z = true;
        if (optionalFindFirst2.isPresent()) {
            this.v = true;
        }
        if (!this.h.contains(lfeVar.c)) {
            throw new IllegalParameterAlert("cipher suite does not match");
        }
        jbg jbgVar = lfeVar.c;
        this.j = jbgVar;
        if (((pbg) this.c) == null) {
            this.o = new jdc(ds4.q(jbgVar));
            jdc jdcVar = this.o;
            int iOrdinal = this.j.ordinal();
            int i = 16;
            if (iOrdinal != 0) {
                if (iOrdinal == 1 || iOrdinal == 2) {
                    i = 32;
                } else if (iOrdinal != 3 && iOrdinal != 4) {
                    throw new RuntimeException();
                }
            }
            this.c = new pbg(jdcVar, null, i, ds4.q(this.j));
            this.o.y(this.n);
            pbg pbgVar = (pbg) this.c;
            jdc jdcVar2 = pbgVar.r;
            lbg lbgVar = lbg.client_hello;
            jdcVar2.getClass();
            pbgVar.b(pbgVar.j, "c e traffic", jdcVar2.w(jdc.i(lbgVar)), pbgVar.e);
            this.f.getClass();
        }
        if (optionalFindFirst2.isPresent()) {
            pbg pbgVar2 = (pbg) this.c;
            int i2 = ((xfe) optionalFindFirst2.get()).a;
            pbgVar2.f = true;
            ah8.a("Server has accepted PSK key establishment");
        } else {
            pbg pbgVar3 = (pbg) this.c;
            if (pbgVar3.i != null && !pbgVar3.f) {
                pbgVar3.a(new byte[pbgVar3.e]);
            }
        }
        if (optionalEmpty.isPresent()) {
            pbg pbgVar4 = (pbg) this.c;
            pbgVar4.h = (PrivateKey) this.b;
            pbgVar4.g = ((hz7) optionalEmpty.get()).a();
            pbg pbgVar5 = (pbg) this.c;
            pbgVar5.getClass();
            try {
                PublicKey publicKey = pbgVar5.g;
                if (publicKey instanceof ECPublicKey) {
                    keyAgreement = KeyAgreement.getInstance("ECDH");
                } else {
                    if (!ilb.g(publicKey)) {
                        throw new RuntimeException("Unsupported key type");
                    }
                    keyAgreement = KeyAgreement.getInstance("XDH");
                }
                keyAgreement.init(pbgVar5.h);
                keyAgreement.doPhase(pbgVar5.g, true);
                byte[] bArrGenerateSecret = keyAgreement.generateSecret();
                pbgVar5.s = bArrGenerateSecret;
                ah8.a("Shared key: " + yx0.a(bArrGenerateSecret));
            } catch (InvalidKeyException e) {
                e = e;
                throw new RuntimeException("Unsupported crypto: " + e);
            } catch (NoSuchAlgorithmException e2) {
                e = e2;
                throw new RuntimeException("Unsupported crypto: " + e);
            }
        }
        this.o.y(lfeVar);
        pbg pbgVar6 = (pbg) this.c;
        byte[] bArr = pbgVar6.j;
        byte[] bArr2 = pbgVar6.c;
        short s = pbgVar6.e;
        byte[] bArrB = pbgVar6.b(bArr, "derived", bArr2, s);
        xrf.u("Derived secret: ", yx0.a(bArrB));
        byte[] bArrW = pbgVar6.b.w(bArrB, pbgVar6.s);
        pbgVar6.o = bArrW;
        xrf.u("Handshake secret: ", yx0.a(bArrW));
        jdc jdcVar3 = pbgVar6.r;
        lbg lbgVar2 = lbg.server_hello;
        jdcVar3.getClass();
        byte[] bArrW2 = jdcVar3.w(jdc.i(lbgVar2));
        byte[] bArrB2 = pbgVar6.b(pbgVar6.o, "c hs traffic", bArrW2, s);
        pbgVar6.n = bArrB2;
        xrf.u("Client handshake traffic secret: ", yx0.a(bArrB2));
        byte[] bArrB3 = pbgVar6.b(pbgVar6.o, "s hs traffic", bArrW2, s);
        pbgVar6.m = bArrB3;
        xrf.u("Server handshake traffic secret: ", yx0.a(bArrB3));
        byte[] bArr3 = pbgVar6.n;
        short s2 = pbgVar6.d;
        Charset charset = pbg.u;
        xrf.u("Client handshake key: ", yx0.a(pbgVar6.b(bArr3, "key", "".getBytes(charset), s2)));
        xrf.u("Server handshake key: ", yx0.a(pbgVar6.b(pbgVar6.m, "key", "".getBytes(charset), s2)));
        xrf.u("Client handshake iv: ", yx0.a(pbgVar6.b(pbgVar6.n, "iv", "".getBytes(charset), (short) 12)));
        xrf.u("Server handshake iv: ", yx0.a(pbgVar6.b(pbgVar6.m, "iv", "".getBytes(charset), (short) 12)));
        this.m = 3;
        ysc yscVar = this.f;
        fs3 fs3Var = yscVar.o;
        bbg bbgVar = yscVar.I0;
        jbg jbgVar2 = bbgVar.j;
        if (jbgVar2 == null) {
            throw new IllegalStateException("No (valid) server hello received yet");
        }
        synchronized (fs3Var) {
            fs3Var.c = jbgVar2;
            hf5Var = hf5.c;
            fs3Var.c(hf5Var, jbgVar2, (zzg) ((qje) fs3Var.d).b);
            pbg pbgVar7 = (pbg) bbgVar.c;
            if (pbgVar7 == null) {
                throw new IllegalStateException("Traffic secret not yet available");
            }
            byte[] bArr4 = pbgVar7.n;
            ((bh8) fs3Var.e).secret("ClientHandshakeTrafficSecret: ", bArr4);
            ((kc) ((hc[]) fs3Var.h)[2]).e(bArr4);
            pbg pbgVar8 = (pbg) bbgVar.c;
            if (pbgVar8 == null) {
                throw new IllegalStateException("Traffic secret not yet available");
            }
            byte[] bArr5 = pbgVar8.m;
            ((bh8) fs3Var.e).secret("ServerHandshakeTrafficSecret: ", bArr5);
            ((kc) ((hc[]) fs3Var.i)[2]).e(bArr5);
            if (fs3Var.b) {
                fs3Var.a("HANDSHAKE_TRAFFIC_SECRET", hf5Var);
            }
        }
        yscVar.s0 = hf5Var;
        synchronized (yscVar.Y) {
            try {
                if (az1.v(yscVar.X) >= az1.v(2)) {
                    z = false;
                }
                if (z) {
                    yscVar.X = 2;
                    yscVar.Z.forEach(new vsc(yscVar, 2));
                } else {
                    yscVar.c.debug("Handshake state cannot be set to HasHandshakeKeys");
                }
            } finally {
            }
        }
        yscVar.u0.add(new tsc(yscVar, 1));
    }

    public final void x(mbg mbgVar, List list) {
        KeyPairGenerator keyPairGenerator;
        if (this.m != 1) {
            throw new IllegalStateException("Handshake already started");
        }
        if (!iz7.d.contains(mbgVar)) {
            throw new IllegalArgumentException("Named group " + mbgVar + " not supported");
        }
        if (list.stream().anyMatch(new nie(9))) {
            ArrayList arrayList = new ArrayList(list);
            arrayList.removeAll(A);
            throw new IllegalArgumentException("Unsupported signature scheme(s): " + arrayList);
        }
        this.p = list;
        this.i = mbgVar;
        try {
            if (mbgVar == mbg.secp256r1 || mbgVar == mbg.secp384r1 || mbgVar == mbg.secp521r1) {
                keyPairGenerator = KeyPairGenerator.getInstance("EC");
                keyPairGenerator.initialize(new ECGenParameterSpec(mbgVar.toString()));
            } else {
                if (mbgVar != mbg.x25519 && mbgVar != mbg.x448) {
                    throw new RuntimeException("unsupported group " + mbgVar);
                }
                keyPairGenerator = KeyPairGenerator.getInstance("XDH");
                ilb.f();
                keyPairGenerator.initialize(ilb.e(mbgVar.toString().toUpperCase()));
            }
            KeyPair keyPairGenKeyPair = keyPairGenerator.genKeyPair();
            this.b = keyPairGenKeyPair.getPrivate();
            this.a = keyPairGenKeyPair.getPublic();
            if (this.g == null || this.h.isEmpty()) {
                throw new IllegalStateException("not all mandatory properties are set");
            }
            hb3 hb3Var = new hb3(this.g, (PublicKey) this.a, this.h, this.p, mbgVar, this.k, (pbg) this.c);
            this.n = hb3Var;
            this.l = hb3Var.d;
            if (((pbg) this.c) != null) {
                this.o.y(hb3Var);
                pbg pbgVar = (pbg) this.c;
                jdc jdcVar = pbgVar.r;
                lbg lbgVar = lbg.client_hello;
                jdcVar.getClass();
                pbgVar.b(pbgVar.j, "c e traffic", jdcVar.w(jdc.i(lbgVar)), pbgVar.e);
                this.f.getClass();
            }
            xpb xpbVar = this.e;
            hb3 hb3Var2 = this.n;
            db4 db4VarE = ((ysc) xpbVar.c).e(hf5.a);
            db4VarE.c(hb3Var2);
            ((ysc) xpbVar.c).A0 = 2;
            ((ysc) xpbVar.c).o.f = hb3Var2.b;
            ((bh8) xpbVar.b).sentPacketInfo(db4VarE.b(db4VarE.i));
            ((ysc) xpbVar.c).e1 = hb3Var2;
            this.m = 2;
        } catch (InvalidAlgorithmParameterException unused) {
            throw new RuntimeException();
        } catch (NoSuchAlgorithmException unused2) {
            throw new RuntimeException("missing key pair generator algorithm EC");
        }
    }
}
