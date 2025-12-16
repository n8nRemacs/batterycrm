package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.util.Log;
import java.io.File;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class n4e implements frf, ud4, n9f, k7, rn6, tm6, ikd {
    public final Object a;

    public /* synthetic */ n4e(Object obj) {
        this.a = obj;
    }

    public static String c(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    @Override // defpackage.ud4
    public boolean A() {
        return true;
    }

    @Override // defpackage.ud4
    public long C() {
        return 0L;
    }

    @Override // defpackage.ud4
    public long D(long j) {
        return 1L;
    }

    @Override // defpackage.ud4
    public long E(long j, long j2) {
        return 1L;
    }

    @Override // defpackage.rn6, defpackage.v2f
    public /* bridge */ /* synthetic */ void a(Object obj) {
    }

    @Override // defpackage.ikd
    public void accept(Object obj, Object obj2) {
        eci eciVar = new eci((n2g) obj2, 0);
        pbi pbiVar = (pbi) ((hci) obj).o();
        bm bmVar = (bm) this.a;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(pbiVar.e);
        int i = cbi.a;
        parcelObtain.writeStrongBinder(eciVar);
        cbi.c(parcelObtain, bmVar);
        pbiVar.i(parcelObtain, 1);
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        return ((enb) this.a).p((vdf) obj);
    }

    @Override // defpackage.ud4
    public long b(long j) {
        return 0L;
    }

    @Override // defpackage.n9f
    public m9f d() {
        return (r8j) this.a;
    }

    @Override // defpackage.ud4
    public long f(long j, long j2) {
        return j2;
    }

    @Override // defpackage.frf
    public Object get() {
        return Boolean.valueOf(((sxg) ((w5) this.a).c(61)).g.getBoolean("app.messages.enable.animations", true));
    }

    @Override // defpackage.ud4
    public long h(long j, long j2) {
        return 0L;
    }

    @Override // defpackage.ud4
    public long j(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override // defpackage.ud4
    /* renamed from: k */
    public r7d mo164k(long j) {
        return (r7d) this.a;
    }

    @Override // defpackage.rn6
    public void onFailure(Throwable th) {
        gri.j("VideoEncoderSession", "VideoEncoder configuration failed.", th);
        ((tz4) this.a).u();
    }

    @Override // defpackage.ud4
    public long u(long j, long j2) {
        return 0L;
    }

    public n4e(Context context) {
        boolean zIsEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.a = sharedPreferences;
        File file = new File(r34.c(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    zIsEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                synchronized (this) {
                    sharedPreferences.edit().clear().commit();
                }
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e.getMessage());
            }
        }
    }

    public n4e() {
        this.a = new r8j(29);
    }
}
