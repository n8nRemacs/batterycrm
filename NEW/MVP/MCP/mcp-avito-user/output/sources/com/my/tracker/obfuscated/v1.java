package com.my.tracker.obfuscated;

import android.content.Context;
import com.my.tracker.obfuscated.o1;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class v1 implements u1 {

    /* renamed from: a, reason: collision with root package name */
    final o1 f365837a;

    /* renamed from: b, reason: collision with root package name */
    final y1 f365838b;

    /* renamed from: c, reason: collision with root package name */
    final int f365839c;

    /* renamed from: d, reason: collision with root package name */
    int f365840d;

    private v1(int i12, o1 o1Var, y1 y1Var) {
        this.f365839c = i12;
        this.f365837a = o1Var;
        this.f365838b = y1Var;
    }

    public static v1 a(int i12, f2 f2Var, Context context) {
        try {
            return new v1(i12, o1.a(f2Var.g(), context), new s1(f2Var, context));
        } catch (Exception e12) {
            e2.b("TimeSpentRepository: can't initialize sql database, repository wouldn't be created: ", e12);
            return null;
        }
    }

    private void b() throws Exception {
        int i12 = (this.f365840d - this.f365839c) + 1;
        try {
            int iA2 = this.f365837a.a(i12);
            this.f365840d -= iA2;
            e2.a("TimeSpentRepository: successfully deleted " + iA2 + "(requested = " + i12 + ") oldest tick packets from db, currentDbSize = " + this.f365840d + " (reason: need free up space for new packet)");
        } catch (Exception e12) {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "TimeSpentRepository: something went wrong while trying to delete oldest", " tick packets from db (reason: need free up space for new packet, maxSize = ");
            sbJ.append(this.f365839c);
            sbJ.append(", current size = ");
            sbJ.append(this.f365840d);
            sbJ.append("), can't store new tick packet");
            e2.b(sbJ.toString(), e12);
            throw new Exception(e12);
        }
    }

    @Override // com.my.tracker.obfuscated.u1
    public void a() {
        this.f365840d = this.f365837a.a();
        e2.a("TimeSpentRepository: initialized, current size = " + this.f365840d + ", max size = " + this.f365839c);
    }

    @Override // com.my.tracker.obfuscated.u1
    public synchronized void a(w1 w1Var) {
        if (this.f365840d >= this.f365839c) {
            try {
                b();
                try {
                    long jA2 = this.f365837a.a(w1Var.d(), b(w1Var));
                    this.f365840d++;
                    e2.a("TimeSpentRepository: successfully stored new tick packet to db, tickPacketId = " + jA2 + " (current db size = " + this.f365840d + ")");
                } catch (Exception e12) {
                    e2.b("TimeSpentRepository: something went wrong while saving new tick packet in database, this tick wouldn't be stored");
                    throw new Exception(e12);
                }
            } catch (Exception e13) {
                e2.b("TimeSpentRepository: free up database failed, can't put new TimeSpentTick (reason: db still full)");
                throw new Exception(e13);
            }
        } else {
            long jA22 = this.f365837a.a(w1Var.d(), b(w1Var));
            this.f365840d++;
            e2.a("TimeSpentRepository: successfully stored new tick packet to db, tickPacketId = " + jA22 + " (current db size = " + this.f365840d + ")");
        }
    }

    @Override // com.my.tracker.obfuscated.u1
    public synchronized void a(long[] jArr) {
        try {
            this.f365837a.a(jArr);
        } catch (Exception unused) {
            String str = "TimeSpentRepository: something went wrong while deleting " + jArr.length + " packets from db";
            e2.b(str);
            throw new Exception(str);
        }
    }

    @Override // com.my.tracker.obfuscated.u1
    public synchronized z1[] a(int i12) {
        z1[] z1VarArr;
        try {
            o1.b bVarB = this.f365837a.b(i12);
            try {
                ArrayList arrayList = new ArrayList(i12);
                while (bVarB.a()) {
                    arrayList.add(new z1(bVarB.c(), bVarB.b()));
                }
                e2.a("TimeSpentRepository: read " + arrayList.size() + " freshest packets from db");
                z1VarArr = arrayList.isEmpty() ? null : (z1[]) arrayList.toArray(new z1[0]);
                bVarB.close();
            } finally {
            }
        } catch (Throwable th2) {
            e2.b("TimeSpentRepository: error while reading " + i12 + " freshest tick packets", th2);
            return null;
        }
        return z1VarArr;
    }

    private byte[] b(w1 w1Var) throws Exception {
        byte[] bArrA;
        try {
            synchronized (this.f365838b) {
                bArrA = this.f365838b.a(w1Var);
            }
            return bArrA;
        } catch (Exception e12) {
            e2.b("TimeSpentRepository: something went wrong while generating tick packet", e12);
            throw new Exception(e12);
        }
    }
}
