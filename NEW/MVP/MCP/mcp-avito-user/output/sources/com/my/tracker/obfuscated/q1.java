package com.my.tracker.obfuscated;

import android.text.TextUtils;
import android.util.Base64;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.h0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes7.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    final u1 f365763a;

    /* renamed from: b, reason: collision with root package name */
    final f2 f365764b;

    /* renamed from: c, reason: collision with root package name */
    final int f365765c;

    public static class a implements h0.a {

        /* renamed from: a, reason: collision with root package name */
        private final z1[] f365766a;

        /* renamed from: b, reason: collision with root package name */
        private long f365767b;

        private a(z1[] z1VarArr) {
            this.f365766a = z1VarArr;
        }

        public static a a(z1[] z1VarArr) {
            return new a(z1VarArr);
        }

        public z1[] b() {
            return this.f365766a;
        }

        public String toString() {
            String strJoin = TextUtils.join(",", this.f365766a);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                a(byteArrayOutputStream);
            } catch (Exception unused) {
            }
            return "[ChunkProtobufPacket]\n| sendTimestamp = " + this.f365767b + "\n| contain " + this.f365766a.length + " packets: " + strJoin + "\n| content (base64): " + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0) + "\n[/ChunkProtobufPacket]";
        }

        @Override // com.my.tracker.obfuscated.h0.a
        public String a() {
            return "application/octet-stream";
        }

        public void a(long j12) {
            this.f365767b = j12;
        }

        private void a(z1 z1Var, OutputStream outputStream) throws IOException {
            try {
                outputStream.write(z1Var.b());
                c1.a(4, this.f365767b, outputStream);
            } catch (Exception unused) {
                e2.b("TimeSpentPacketSender: something went wrong while extracting protobuf data, return empty result");
            }
        }

        @Override // com.my.tracker.obfuscated.h0.a
        public void a(OutputStream outputStream) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (z1 z1Var : this.f365766a) {
                byteArrayOutputStream.reset();
                a(z1Var, byteArrayOutputStream);
                c1.a(1, byteArrayOutputStream.toByteArray(), outputStream);
            }
        }
    }

    private q1(int i12, f2 f2Var, u1 u1Var) {
        this.f365765c = i12;
        this.f365763a = u1Var;
        this.f365764b = f2Var;
    }

    public static q1 a(int i12, f2 f2Var, u1 u1Var) {
        return new q1(i12, f2Var, u1Var);
    }

    public a b() throws Exception {
        z1[] z1VarArrA = this.f365763a.a(this.f365765c);
        int length = z1VarArrA == null ? 0 : z1VarArrA.length;
        StringBuilder sbJ = androidx.camera.camera2.internal.G.j(length, "TimeSpentPacketSender: got database chunk, size = ", ", requested = ");
        sbJ.append(this.f365765c);
        e2.a(sbJ.toString());
        if (length != 0) {
            return a.a(z1VarArrA);
        }
        throw new Exception("database chunk is empty, nothing to send");
    }

    public void c() {
        e2.a("TimeSpentPacketSender: i'm notified about new packet");
        C37835i.e(new J(this, 4));
    }

    public void a() {
        e2.a("TimeSpentPacketSender: start flushing database chunk...");
        try {
            a aVarB = b();
            b(aVarB);
            a(aVarB);
            e2.a("TimeSpentPacketSender: database chunk successfully flushed");
        } catch (Exception e12) {
            e2.b("TimeSpentPacketSender: Something went wrong while flushing database chunk:\n" + e12.getMessage());
        }
    }

    public void a(a aVar) {
        z1[] z1VarArrB = aVar.b();
        int length = z1VarArrB.length;
        long[] jArr = new long[length];
        for (int i12 = 0; i12 < z1VarArrB.length; i12++) {
            jArr[i12] = z1VarArrB[i12].a();
        }
        this.f365763a.a(jArr);
        e2.a("TimeSpentPacketSender: successfully deleted " + length + " packets from repository");
    }

    public void b(a aVar) throws Exception {
        MyTrackerConfig.OkHttpClientProvider okHttpClientProviderK = this.f365764b.k();
        String strL = this.f365764b.l();
        aVar.a(System.currentTimeMillis());
        if (e2.a()) {
            e2.a("TimeSpentPacketSender: This packet will be sent now:\n" + aVar);
        }
        if (!h0.a(aVar, okHttpClientProviderK, true).a(strL).b()) {
            throw new Exception("packet didn't delivered to server");
        }
        e2.a("TimeSpentPacketSender: packet successfully delivered to server");
    }
}
