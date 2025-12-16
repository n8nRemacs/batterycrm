package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.util.InterfaceC36753g;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class P1 extends AbstractC36847b1 {

    /* renamed from: c, reason: collision with root package name */
    public final O1 f354840c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f354841d;

    public P1(I2 i22) {
        super(i22);
        this.f354840c = new O1(this, this.f355183a.f354709a);
    }

    public static long l(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
            if (!cursorQuery.moveToFirst()) {
                cursorQuery.close();
                return -1L;
            }
            long j12 = cursorQuery.getLong(0);
            cursorQuery.close();
            return j12;
        } catch (Throwable th2) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th2;
        }
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3
    @Pure
    public final /* bridge */ /* synthetic */ C36876f2 b() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3
    @Pure
    public final /* bridge */ /* synthetic */ N5 c() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.C1, com.google.android.gms.measurement.internal.C36891h3
    public final /* bridge */ /* synthetic */ void e() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC36847b1
    public final boolean k() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01f6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList m() {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.P1.m():java.util.ArrayList");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0120  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    @j.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n(int r17, byte[] r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.P1.n(int, byte[]):boolean");
    }

    public final boolean o(zzae zzaeVar) {
        super.c();
        byte[] bArrW = N5.W(zzaeVar);
        if (bArrW.length <= 131072) {
            return n(2, bArrW);
        }
        super.zzj().f354890g.b("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean p(zzbe zzbeVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzbeVar.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return n(0, bArrMarshall);
        }
        super.zzj().f354890g.b("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean q(zznb zznbVar) {
        Parcel parcelObtain = Parcel.obtain();
        zznbVar.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return n(1, bArrMarshall);
        }
        super.zzj().f354890g.b("User property too long for local database. Sending directly to service");
        return false;
    }

    @j.l0
    public final void r() {
        int iDelete;
        super.e();
        try {
            SQLiteDatabase sQLiteDatabaseT = t();
            if (sQLiteDatabaseT == null || (iDelete = sQLiteDatabaseT.delete("messages", null, null)) <= 0) {
                return;
            }
            super.zzj().f354897n.c("Reset local analytics data. records", Integer.valueOf(iDelete));
        } catch (SQLiteException e12) {
            super.zzj().f354889f.c("Error resetting local analytics data. error", e12);
        }
    }

    @j.l0
    public final boolean s() {
        super.e();
        if (this.f354841d || !this.f355183a.f354709a.getDatabasePath("google_app_measurement_local.db").exists()) {
            return false;
        }
        int i12 = 5;
        for (int i13 = 0; i13 < 5; i13++) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                try {
                    try {
                        SQLiteDatabase sQLiteDatabaseT = t();
                        if (sQLiteDatabaseT == null) {
                            this.f354841d = true;
                            if (sQLiteDatabaseT != null) {
                                sQLiteDatabaseT.close();
                            }
                            return false;
                        }
                        sQLiteDatabaseT.beginTransaction();
                        sQLiteDatabaseT.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        sQLiteDatabaseT.setTransactionSuccessful();
                        sQLiteDatabaseT.endTransaction();
                        sQLiteDatabaseT.close();
                        return true;
                    } catch (SQLiteException e12) {
                        if (0 != 0) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Throwable th2) {
                                if (0 != 0) {
                                    sQLiteDatabase.close();
                                }
                                throw th2;
                            }
                        }
                        super.zzj().f354889f.c("Error deleting app launch break from local database", e12);
                        this.f354841d = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i12);
                    i12 += 20;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            } catch (SQLiteFullException e13) {
                super.zzj().f354889f.c("Error deleting app launch break from local database", e13);
                this.f354841d = true;
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            }
        }
        super.zzj().f354892i.b("Error deleting app launch break from local database in reasonable time");
        return false;
    }

    @j.k0
    @j.l0
    public final SQLiteDatabase t() {
        if (this.f354841d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f354840c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f354841d = true;
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3, com.google.android.gms.measurement.internal.InterfaceC36905j3
    @Pure
    public final Context zza() {
        return this.f355183a.f354709a;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3, com.google.android.gms.measurement.internal.InterfaceC36905j3
    @Pure
    public final InterfaceC36753g zzb() {
        return this.f355183a.f354722n;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3, com.google.android.gms.measurement.internal.InterfaceC36905j3
    @Pure
    public final C36852c zzd() {
        return this.f355183a.f354714f;
    }
}
