package com.avito.android.messenger.util;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.C35836l1;
import com.avito.android.util.X2;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.LinkedHashMap;
import kotlin.C42829l0;
import kotlin.G0;
import kotlin.InterfaceC43069u;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import kotlin.p0;
import kotlin.text.C43066x;

/* compiled from: DbMaintenance.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/util/d;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC43069u
/* loaded from: classes15.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f197434a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f197435b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f197436c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final File f197437d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f197438e;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@Y61.k Context context, @Y61.k String str) {
        C42829l0 c42829l0;
        C42829l0 c42829l02;
        File databasePath;
        Q q12;
        this.f197435b = true;
        try {
            databasePath = context.getDatabasePath(str);
            this.f197435b = databasePath.exists();
        } catch (Exception e12) {
            X2.f318778a.c("DbMaintenance", "Failed to get DB file", e12);
            c42829l0 = new C42829l0("Failed to read: " + e12, Boolean.TRUE, null);
        }
        if (!this.f197435b) {
            c42829l0 = new C42829l0("File doesn't exist", Boolean.FALSE, null);
            c42829l02 = c42829l0;
            this.f197438e = (String) c42829l02.f406871b;
            this.f197434a = ((Boolean) c42829l02.f406872c).booleanValue();
            this.f197437d = (File) c42829l02.f406873d;
        }
        try {
            byte[] bArr = new byte[100];
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(databasePath), 8192);
            int i12 = 0;
            while (i12 < 100) {
                try {
                    int i13 = bufferedInputStream.read(bArr, i12, 100 - i12);
                    if (i13 < 0) {
                        break;
                    } else {
                        i12 += i13;
                    }
                } finally {
                }
            }
            G0 g02 = G0.f406611a;
            kotlin.io.c.a(bufferedInputStream, null);
            q12 = new Q(C42745f0.O(p0.a(bArr), "", null, null, c.f197433l, 30), Boolean.valueOf(!C43066x.h0(r15, "53514c69746520666f726d6174203300", true)));
        } catch (Exception e13) {
            X2.f318778a.a("DbMaintenance", "Unable to read file header: " + databasePath.getAbsolutePath(), e13);
            q12 = new Q("Failed to read: " + e13, Boolean.TRUE);
        }
        c42829l02 = new C42829l0(q12.f406619b, q12.f406620c, databasePath);
        this.f197438e = (String) c42829l02.f406871b;
        this.f197434a = ((Boolean) c42829l02.f406872c).booleanValue();
        this.f197437d = (File) c42829l02.f406873d;
    }

    @Y61.k
    public final LinkedHashMap a(boolean z12) {
        String string;
        boolean z13;
        File file;
        StringBuilder sb2;
        SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase;
        LinkedHashMap linkedHashMapJ = P0.j(new Q("dbFile.size", Long.valueOf(C35836l1.c(this.f197437d))), new Q("dbFile.header", this.f197438e), new Q("dbFile.isValidSQLite", Boolean.valueOf(!this.f197434a)));
        try {
            sb2 = new StringBuilder();
            sQLiteDatabaseOpenOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(":memory:", (SQLiteDatabase.CursorFactory) null);
        } catch (Exception e12) {
            X2.f318778a.c("DbMaintenance", "Unable to determine sqlite version", e12);
            string = "Error: " + e12.getMessage();
        }
        try {
            Cursor cursorRawQuery = sQLiteDatabaseOpenOrCreateDatabase.rawQuery("select sqlite_version() AS sqlite_version", null);
            try {
                Cursor cursor = cursorRawQuery;
                while (cursor.moveToNext()) {
                    sb2.append(cursor.getString(0));
                }
                G0 g02 = G0.f406611a;
                kotlin.io.c.a(cursorRawQuery, null);
                kotlin.io.c.a(sQLiteDatabaseOpenOrCreateDatabase, null);
                string = sb2.toString();
                linkedHashMapJ.put("system.sqlite_version", string);
                File file2 = this.f197437d;
                if (file2 != null) {
                    linkedHashMapJ.put("dbFile.path", file2.getAbsolutePath());
                    linkedHashMapJ.put("dbFile.exists", Boolean.valueOf(this.f197437d.exists()));
                    linkedHashMapJ.put("dbFile.isFile", Boolean.valueOf(this.f197437d.isFile()));
                    linkedHashMapJ.put("dbFile.canRead", Boolean.valueOf(this.f197437d.canRead()));
                    linkedHashMapJ.put("dbFile.canWrite", Boolean.valueOf(this.f197437d.canWrite()));
                    linkedHashMapJ.put("dbFile.canWrite", Boolean.valueOf(this.f197437d.canWrite()));
                    if (z12) {
                        if (!this.f197436c && (file = this.f197437d) != null) {
                            try {
                                this.f197436c = SQLiteDatabase.deleteDatabase(file);
                            } catch (Exception e13) {
                                X2.f318778a.a("DbMaintenance", "Failed to delete db file: " + this.f197437d.getPath(), e13);
                            }
                        }
                        if (this.f197436c) {
                            X2.f318778a.c("DbMaintenance", "DB file deleted", null);
                        } else {
                            X2 x22 = X2.f318778a;
                            StringBuilder sb3 = new StringBuilder("Failed to delete db file (no exception): ");
                            File file3 = this.f197437d;
                            sb3.append(file3 != null ? file3.getPath() : null);
                            x22.i("DbMaintenance", sb3.toString(), null);
                        }
                        z13 = this.f197436c;
                    } else {
                        z13 = this.f197436c;
                    }
                    linkedHashMapJ.put("dbFile.deleted", Boolean.valueOf(z13));
                } else {
                    X2.f318778a.i("DbMaintenance", "dbFile == null", null);
                }
                return linkedHashMapJ;
            } finally {
            }
        } finally {
        }
    }
}
