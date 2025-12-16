package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.Base64;
import android.util.Log;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.transformer.ExportException;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.sdk.media.transformer.MediaTransformException;
import one.me.sdk.transfer.domain.UploadException;
import org.apache.commons.logging.LogFactory;
import org.webrtc.StatsObserver;
import org.webrtc.StatsReport;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class nl implements vl, yu, vvf, uq4, uu1, StatsObserver, h8d, apf, lyf, usa, pa8, y79, xu, fu3, gu3, fw6, zua, w2f, lsf, ewd {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nl(nq4 nq4Var, String str, String str2) {
        this.a = 3;
        this.d = nq4Var;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.zua
    public g4i I(View view, g4i g4iVar) {
        boolean z;
        i40 i40Var = (i40) this.b;
        Context context = (Context) this.c;
        gvf gvfVar = (gvf) this.d;
        e4i e4iVar = g4iVar.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i = xz7.a;
        if (xz7.b(xz7.c)) {
            int iA = xz7.a(context);
            int i2 = marginLayoutParams.bottomMargin;
            if (i2 < iA) {
                marginLayoutParams.bottomMargin = i2 + iA;
            }
            z = true;
        } else {
            if (!i40Var.b || marginLayoutParams.bottomMargin < xz7.a(context)) {
                marginLayoutParams.bottomMargin = Math.max(marginLayoutParams.bottomMargin, e4iVar.f(7).d);
            } else {
                marginLayoutParams.bottomMargin -= xz7.a(context);
            }
            z = false;
        }
        i40Var.b = z;
        co7 co7VarF = e4iVar.f(7);
        jy4 jy4VarE = e4iVar.e();
        float f = 12;
        int iMax = Math.max(Math.max(Math.max(co7VarF.a, jy4VarE != null ? jy4VarE.a() : 0), Math.max(co7VarF.c, (jy4VarE == null || Build.VERSION.SDK_INT < 28) ? 0 : iy4.e(jy4VarE.a))), Math.max((context.getResources().getDisplayMetrics().widthPixels - Math.min(kti.d(480 * vw4.d().getDisplayMetrics().density), context.getResources().getDisplayMetrics().widthPixels)) / 2, kti.d(vw4.d().getDisplayMetrics().density * f)));
        gvfVar.setPadding(iMax, kti.d(0 * vw4.d().getDisplayMetrics().density), iMax, kti.d(f * vw4.d().getDisplayMetrics().density));
        view.setLayoutParams(marginLayoutParams);
        return g4iVar;
    }

    @Override // defpackage.vvf
    public Object a() {
        fp4 fp4Var = (fp4) this.b;
        ac0 ac0Var = (ac0) this.c;
        ba0 ba0Var = (ba0) this.d;
        gwd gwdVar = (gwd) fp4Var.d;
        gwdVar.getClass();
        l9c l9cVar = ac0Var.c;
        String str = ba0Var.a;
        String str2 = ac0Var.a;
        String strConcat = "TRuntime.".concat("SQLiteEventStore");
        if (Log.isLoggable(strConcat, 3)) {
            Log.d(strConcat, "Storing event with priority=" + l9cVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) gwdVar.y(new nl(gwdVar, ba0Var, ac0Var, 24))).getClass();
        fp4Var.a.a(ac0Var, 1, false);
        return null;
    }

    @Override // defpackage.fu3
    public void accept(Object obj) {
        switch (this.a) {
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                lk6 lk6Var = (lk6) this.b;
                ((n99) obj).x(lk6Var.b, (d99) this.c, (g19) this.d);
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                x10 x10Var = (x10) obj;
                to8.v((si9) this.c, x10Var, (jdc) this.d, ((qi9) this.b).g);
                break;
            case 16:
                to8.v((si9) this.b, (x10) obj, (jdc) this.c, ((lv4) ((gx9) this.d).d.getValue()).j().b);
                break;
            case 23:
                to8.v((si9) this.b, (x10) obj, (jdc) this.c, ((lv4) ((bsd) this.d).d.getValue()).j().b);
                break;
            default:
                ozf ozfVar = (ozf) this.b;
                File file = (File) this.c;
                ao6 ao6Var = (ao6) this.d;
                j97 j97Var = (j97) obj;
                k18 k18Var = ozfVar.c;
                if (!j97Var.a) {
                    ozfVar.u0 = (int) j97Var.b;
                    long jNanoTime = System.nanoTime();
                    long j = ozfVar.v0;
                    if (j == 0 || Math.abs(jNanoTime - j) > 1000000000) {
                        ozfVar.v0 = jNanoTime;
                        ozfVar.e(ao6Var);
                        break;
                    }
                } else {
                    sxg sxgVar = ((z7c) k18Var.getValue()).c;
                    ((z7c) k18Var.getValue()).b.getClass();
                    sxgVar.i("app.extra.downloaded.emoji.font.url", "");
                    ozfVar.d(file, ao6Var);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ewd
    /* renamed from: apply, reason: collision with other method in class */
    public Object mo26apply(Object obj) throws Throwable {
        long jInsert;
        Cursor cursor;
        jg8 jg8Var;
        int i = this.a;
        int i2 = 6;
        int i3 = 5;
        int i4 = 4;
        int i5 = 3;
        jg8 jg8Var2 = jg8.CACHE_FULL;
        int i6 = 2;
        int i7 = 1;
        Object obj2 = this.d;
        Object obj3 = this.c;
        int i8 = 0;
        gwd gwdVar = (gwd) this.b;
        switch (i) {
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                ba0 ba0Var = (ba0) obj3;
                ee5 ee5Var = ba0Var.c;
                String str = ba0Var.a;
                ac0 ac0Var = (ac0) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long jSimpleQueryForLong = gwdVar.l().compileStatement("PRAGMA page_size").simpleQueryForLong() * gwdVar.l().compileStatement("PRAGMA page_count").simpleQueryForLong();
                ca0 ca0Var = gwdVar.d;
                if (jSimpleQueryForLong >= ca0Var.a) {
                    gwdVar.Q(1L, jg8Var2, str);
                    return -1L;
                }
                Long lW = gwd.w(sQLiteDatabase, ac0Var);
                if (lW != null) {
                    jInsert = lW.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", ac0Var.a);
                    contentValues.put(LogFactory.PRIORITY_KEY, Integer.valueOf(o9c.a(ac0Var.c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = ac0Var.b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i9 = ca0Var.e;
                byte[] bArr2 = ee5Var.b;
                boolean z = bArr2.length <= i9;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(ba0Var.d));
                contentValues2.put("uptime_ms", Long.valueOf(ba0Var.e));
                contentValues2.put("payload_encoding", ee5Var.a.a);
                contentValues2.put("code", ba0Var.b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put(ApiProtocol.PARAM_PAYLOAD, z ? bArr2 : new byte[0]);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int iCeil = (int) Math.ceil(bArr2.length / i9);
                    for (int i10 = 1; i10 <= iCeil; i10++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i10 - 1) * i9, Math.min(i10 * i9, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i10));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(ba0Var.f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put(SdkMetricStatEvent.NAME_KEY, (String) entry.getKey());
                    contentValues4.put(SdkMetricStatEvent.VALUE_KEY, (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            case 25:
                ArrayList arrayList = (ArrayList) obj3;
                ac0 ac0Var2 = (ac0) obj2;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j = cursor2.getLong(0);
                    int i11 = cursor2.getInt(7) != 0 ? i7 : 0;
                    goh gohVar = new goh();
                    gohVar.f = new HashMap();
                    String string = cursor2.getString(i7);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    gohVar.a = string;
                    gohVar.d = Long.valueOf(cursor2.getLong(i6));
                    gohVar.e = Long.valueOf(cursor2.getLong(i5));
                    if (i11 != 0) {
                        String string2 = cursor2.getString(4);
                        gohVar.c = new ee5(string2 == null ? gwd.X : new gf5(string2), cursor2.getBlob(5));
                    } else {
                        String string3 = cursor2.getString(4);
                        gf5 gf5Var = string3 == null ? gwd.X : new gf5(string3);
                        Cursor cursorQuery = gwdVar.l().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int length = 0;
                            while (cursorQuery.moveToNext()) {
                                byte[] blob = cursorQuery.getBlob(0);
                                arrayList2.add(blob);
                                length += blob.length;
                            }
                            byte[] bArr3 = new byte[length];
                            int i12 = 0;
                            int length2 = 0;
                            while (i12 < arrayList2.size()) {
                                byte[] bArr4 = (byte[]) arrayList2.get(i12);
                                cursor = cursorQuery;
                                try {
                                    ArrayList arrayList3 = arrayList2;
                                    System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
                                    length2 += bArr4.length;
                                    i12++;
                                    cursorQuery = cursor;
                                    arrayList2 = arrayList3;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            cursorQuery.close();
                            gohVar.c = new ee5(gf5Var, bArr3);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        gohVar.b = Integer.valueOf(cursor2.getInt(6));
                    }
                    arrayList.add(new ya0(j, ac0Var2, gohVar.c()));
                    i5 = 3;
                    i6 = 2;
                    i7 = 1;
                }
                return null;
            default:
                HashMap map = (HashMap) obj3;
                fa6 fa6Var = (fa6) obj2;
                Cursor cursor3 = (Cursor) obj;
                gwdVar.getClass();
                while (cursor3.moveToNext()) {
                    String string4 = cursor3.getString(i8);
                    int i13 = cursor3.getInt(1);
                    jg8 jg8Var3 = jg8.REASON_UNKNOWN;
                    if (i13 != 0) {
                        if (i13 == 1) {
                            jg8Var3 = jg8.MESSAGE_TOO_OLD;
                        } else if (i13 == 2) {
                            jg8Var = jg8Var2;
                        } else if (i13 == 3) {
                            jg8Var3 = jg8.PAYLOAD_TOO_BIG;
                        } else if (i13 == i4) {
                            jg8Var3 = jg8.MAX_RETRIES_REACHED;
                        } else if (i13 == i3) {
                            jg8Var3 = jg8.INVALID_PAYLOD;
                        } else if (i13 == i2) {
                            jg8Var3 = jg8.SERVER_ERROR;
                        } else {
                            iri.a("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i13));
                        }
                        jg8Var = jg8Var3;
                    } else {
                        jg8Var = jg8Var3;
                    }
                    long j2 = cursor3.getLong(2);
                    if (!map.containsKey(string4)) {
                        map.put(string4, new ArrayList());
                    }
                    ((List) map.get(string4)).add(new kg8(j2, jg8Var));
                    i8 = 0;
                    i2 = 6;
                    i3 = 5;
                    i4 = 4;
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    int i14 = og8.c;
                    new ArrayList();
                    ((ArrayList) fa6Var.c).add(new og8((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                }
                long time = gwdVar.b.getTime();
                SQLiteDatabase sQLiteDatabaseL = gwdVar.l();
                sQLiteDatabaseL.beginTransaction();
                try {
                    Cursor cursorRawQuery = sQLiteDatabaseL.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        cursorRawQuery.moveToNext();
                        e9g e9gVar = new e9g(cursorRawQuery.getLong(0), time);
                        cursorRawQuery.close();
                        sQLiteDatabaseL.setTransactionSuccessful();
                        sQLiteDatabaseL.endTransaction();
                        fa6Var.b = e9gVar;
                        fa6Var.d = new jv6(new xkf(gwdVar.l().compileStatement("PRAGMA page_size").simpleQueryForLong() * gwdVar.l().compileStatement("PRAGMA page_count").simpleQueryForLong(), ca0.f.a));
                        fa6Var.a = (String) gwdVar.o.get();
                        return new ob3((e9g) fa6Var.b, Collections.unmodifiableList((ArrayList) fa6Var.c), (jv6) fa6Var.d, (String) fa6Var.a);
                    } catch (Throwable th3) {
                        cursorRawQuery.close();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    sQLiteDatabaseL.endTransaction();
                    throw th4;
                }
        }
    }

    @Override // defpackage.y79
    public void b(u69 u69Var) {
        z79 z79Var = (z79) this.b;
        Bundle bundle = (Bundle) this.c;
        ResultReceiver resultReceiver = (ResultReceiver) this.d;
        o79 o79Var = z79Var.g;
        if (bundle == null) {
            Bundle bundle2 = Bundle.EMPTY;
        }
        bg7 bg7VarN = o79Var.n(u69Var);
        if (resultReceiver != null) {
            bg7VarN.d(new k79(bg7VarN, 3, resultReceiver), dx4.a);
        }
    }

    @Override // defpackage.apf
    public ybj c(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.c;
        String str = (String) this.b;
        zkf zkfVar = (zkf) this.d;
        String str2 = (String) obj;
        n4e n4eVarD = FirebaseMessaging.d(firebaseMessaging.b);
        String strE = firebaseMessaging.e();
        String strA = firebaseMessaging.h.a();
        synchronized (n4eVarD) {
            String strA2 = zkf.a(System.currentTimeMillis(), str2, strA);
            if (strA2 != null) {
                SharedPreferences.Editor editorEdit = ((SharedPreferences) n4eVarD.a).edit();
                editorEdit.putString(n4e.c(strE, str), strA2);
                editorEdit.commit();
            }
        }
        if (zkfVar == null || !str2.equals(zkfVar.a)) {
            h06 h06Var = firebaseMessaging.a;
            h06Var.a();
            if ("[DEFAULT]".equals(h06Var.b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb = new StringBuilder("Invoking onNewToken for app: ");
                    h06Var.a();
                    sb.append(h06Var.b);
                    Log.d("FirebaseMessaging", sb.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra(ApiProtocol.KEY_TOKEN, str2);
                new h79(firebaseMessaging.b).G(intent);
            }
        }
        return n5e.f(str2);
    }

    @Override // defpackage.vl
    public tl d(tl tlVar) {
        return !fni.a(tlVar.c, (String) this.b) ? tlVar : tlVar.b((String) this.c, (String) this.d);
    }

    @Override // defpackage.usa
    public void e(ira iraVar) {
        do8 do8Var = (do8) this.b;
        np8 np8Var = (np8) this.c;
        Context context = (Context) this.d;
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            throw new IllegalStateException("This thread is main!");
        }
        if (!iraVar.e()) {
            ao8 ao8VarA = (ao8) do8Var.b.get(np8Var);
            if (ao8VarA == null) {
                ao8VarA = do8Var.a(context, np8Var, false, false);
            }
            iraVar.d(ao8VarA.b);
        }
        iraVar.b();
    }

    @Override // defpackage.uq4
    public zjd f(int i, lfg lfgVar, int[] iArr) {
        nq4 nq4Var = (nq4) this.d;
        String str = (String) this.b;
        String str2 = (String) this.c;
        tg7 tg7VarI = wg7.i();
        for (int i2 = 0; i2 < lfgVar.a; i2++) {
            tg7VarI.a(new sq4(i, lfgVar, i2, nq4Var, iArr[i2], str, str2));
        }
        return tg7VarI.i();
    }

    @Override // defpackage.lsf
    public void g(vb0 vb0Var) {
        bma bmaVar;
        mc5 mc5Var = (mc5) this.b;
        n22 n22Var = (n22) this.c;
        msf msfVar = (msf) this.d;
        a9c a9cVar = (a9c) mc5Var.b;
        gri.a("PreviewView", "Preview transformation info updated. " + vb0Var);
        boolean z = n22Var.n().h() == 0;
        v8c v8cVar = a9cVar.d;
        Size size = msfVar.b;
        v8cVar.getClass();
        gri.a("PreviewTransform", "Transformation info set: " + vb0Var + " " + size + " " + z);
        v8cVar.b = vb0Var.a;
        v8cVar.c = vb0Var.b;
        int i = vb0Var.c;
        v8cVar.e = i;
        v8cVar.a = size;
        v8cVar.f = z;
        v8cVar.g = vb0Var.d;
        v8cVar.d = vb0Var.e;
        if (i == -1 || ((bmaVar = a9cVar.b) != null && (bmaVar instanceof rsf))) {
            a9cVar.o = true;
        } else {
            a9cVar.o = false;
        }
        a9cVar.b();
    }

    @Override // defpackage.lyf
    public void h(iyf iyfVar, int i) {
        g08 g08Var = (g08) this.b;
        h08 h08Var = (h08) this.c;
        ViewPager2 viewPager2 = (ViewPager2) this.d;
        int selectedTabPosition = g08Var.getSelectedTabPosition();
        View view = iyfVar.b;
        f08 f08Var = view instanceof f08 ? (f08) view : null;
        if (i > ve3.i((List) h08Var.b)) {
            wqi.q(h08.class.getName(), "Keyboard media tabs position wrong, pos:" + i + "|size:" + ((List) h08Var.b).size(), new Object[0]);
            return;
        }
        d08 d08Var = (d08) ((List) h08Var.b).get(i);
        Context context = viewPager2.getContext();
        aya ayaVar = new aya(String.valueOf(d08Var.c), i == selectedTabPosition ? 1 : 2, 56, context.getString(d08Var.a));
        if (f08Var != null) {
            f08Var.setTabItem(ayaVar);
            return;
        }
        f08 f08Var2 = new f08(g08Var.getContext());
        f08Var2.setTabItem(ayaVar);
        iyfVar.b = f08Var2;
        kyf kyfVar = iyfVar.d;
        if (kyfVar != null) {
            kyfVar.d();
        }
    }

    @Override // defpackage.fw6
    public void h0() {
        q6b q6bVar = (q6b) this.b;
        fw6 fw6Var = (fw6) this.c;
        iw6 iw6Var = (iw6) this.d;
        sy6 sy6Var = q6bVar.o;
        if (sy6Var != null) {
            try {
                vaj vajVar = (vaj) sy6Var.a;
                vajVar.V(vajVar.T(), 1);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
        if (fw6Var != null) {
            fw6Var.h0();
        }
        iw6Var.o(q6bVar);
    }

    @Override // defpackage.w2f
    public void i(i2f i2fVar) throws Throwable {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 20:
                Uri uri = (Uri) obj;
                ActLocalMedias actLocalMedias = (ActLocalMedias) ((ao6) obj3).b;
                int iA = gvi.a(actLocalMedias);
                Bitmap bitmap = new fp0(actLocalMedias, (Uri) obj2, null, iA, iA, null).d().a;
                if (bitmap != null) {
                    Bitmap bitmap2 = new fp0(actLocalMedias, uri, null, iA, iA, null).d().a;
                    if (bitmap2 != null) {
                        Canvas canvas = new Canvas(bitmap);
                        float width = bitmap.getWidth() / bitmap2.getWidth();
                        canvas.scale(width, width);
                        canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                        iz5 iz5VarF = ((t1b) zm.a()).f();
                        iz5VarF.getClass();
                        File fileM = iz5VarF.m(null, "jpg");
                        tfi.m(fileM.getAbsolutePath(), bitmap, 100, Bitmap.CompressFormat.JPEG);
                        String absolutePath = fileM.getAbsolutePath();
                        bitmap.recycle();
                        if (!i2fVar.e()) {
                            i2fVar.a(Uri.fromFile(new File(absolutePath)));
                            break;
                        }
                    } else if (!i2fVar.e()) {
                        i2fVar.onError(new IllegalStateException("overlayBitmap not decoded"));
                        break;
                    }
                } else if (!i2fVar.e()) {
                    i2fVar.onError(new IllegalStateException("bitmap not decoded"));
                    break;
                }
                break;
            default:
                ttg ttgVar = (ttg) obj2;
                q34 q34Var = (q34) obj;
                wqi.c("aug", "copyFromUri: started for uri=%s", ttgVar.a.a);
                tgg tggVar = ((aug) obj3).g;
                bug bugVar = ttgVar.a;
                String str = bugVar.a;
                String str2 = q34Var.c;
                String strB = ((u6b) tggVar.f.getValue()).b(str, str2);
                if (!b6a.Q(strB)) {
                    if (!i2fVar.e()) {
                        i2fVar.onError(new UploadException("failed to copy file"));
                        break;
                    }
                } else {
                    wqi.c("aug", "copyFromUri: finished for uri=%s", bugVar.a);
                    if (!i2fVar.e()) {
                        stg stgVarB = ttgVar.b();
                        stgVarB.b = strB;
                        stgVarB.c = str2;
                        stgVarB.f = q34Var.b;
                        i2fVar.a(new ttg(stgVarB));
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.pa8, defpackage.oa8
    public void invoke(Object obj) {
        switch (this.a) {
            case 10:
                ((r3c) obj).t(((q4c) ((goh) this.b).b).c.a, ((q4c) ((goh) this.c).b).c.a, ((Integer) this.d).intValue());
                break;
            default:
                hhg hhgVar = (hhg) this.b;
                nn5 nn5Var = (nn5) this.c;
                ExportException exportException = (ExportException) this.d;
                ra9 ra9Var = (ra9) obj;
                hhgVar.u.getClass();
                wqi.e(ra9Var.b, "onError", exportException);
                pa9 pa9Var = ra9Var.a;
                MediaTransformException mediaTransformException = new MediaTransformException("Media transform failed", exportException);
                pa9Var.f.set(nn5Var);
                pa9Var.g.set(mediaTransformException);
                ra9Var.a();
                break;
        }
    }

    public void j(Bitmap bitmap) {
        hcj vajVar;
        q6b q6bVar = (q6b) this.b;
        iw6 iw6Var = (iw6) this.c;
        LatLngBounds latLngBounds = (LatLngBounds) this.d;
        if (bitmap != null) {
            ty6 ty6Var = new ty6();
            ty6Var.s0 = 0.0f;
            ty6Var.t0 = 0.5f;
            ty6Var.u0 = 0.5f;
            ty6Var.v0 = false;
            ty6Var.Z = true;
            ty6Var.Y = 1.0f;
            ty6Var.a = t49.b(bitmap);
            LatLng latLng = ty6Var.b;
            s5j.i("Position has already been set using position: ".concat(String.valueOf(latLng)), latLng == null);
            ty6Var.o = latLngBounds;
            try {
                pni pniVar = iw6Var.a;
                Parcel parcelT = pniVar.T();
                mgi.c(parcelT, ty6Var);
                Parcel parcelS = pniVar.S(parcelT, 12);
                IBinder strongBinder = parcelS.readStrongBinder();
                int i = wbj.d;
                if (strongBinder == null) {
                    vajVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
                    vajVar = iInterfaceQueryLocalInterface instanceof hcj ? (hcj) iInterfaceQueryLocalInterface : new vaj(strongBinder, "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate", 3);
                }
                parcelS.recycle();
                q6bVar.o = vajVar != null ? new sy6(vajVar) : null;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    public void k() {
        mc5 mc5Var = (mc5) this.b;
        u8c u8cVar = (u8c) this.c;
        n22 n22Var = (n22) this.d;
        AtomicReference atomicReference = ((a9c) mc5Var.b).t0;
        while (true) {
            if (atomicReference.compareAndSet(u8cVar, null)) {
                u8cVar.b(z8c.a);
                break;
            } else if (atomicReference.get() != u8cVar) {
                break;
            }
        }
        sn6 sn6Var = u8cVar.e;
        if (sn6Var != null) {
            sn6Var.cancel(false);
            u8cVar.e = null;
        }
        n22Var.e().r(u8cVar);
    }

    @Override // defpackage.uu1
    public String m(tu1 tu1Var) {
        wu1 wu1Var = (wu1) this.b;
        qee qeeVar = (qee) this.c;
        Collection collection = (Collection) this.d;
        tu1Var.a(new qj4(9, wu1Var), qeeVar);
        wsf.b(wu1Var, new as4(tu1Var, 0), qeeVar);
        return "surfaceList[" + collection + "]";
    }

    @Override // org.webrtc.StatsObserver
    public void onComplete(StatsReport[] statsReportArr) {
        ax4 ax4Var = (ax4) this.b;
        ti1 ti1Var = (ti1) this.c;
        eef eefVar = (eef) this.d;
        ArrayList arrayList = new ArrayList();
        for (StatsReport statsReport : statsReportArr) {
            if ("ssrc".equals(statsReport.type)) {
                arrayList.add(statsReport);
            }
        }
        ax4Var.a.post(new ev1(ax4Var, statsReportArr, (StatsReport[]) arrayList.toArray(new StatsReport[arrayList.size()]), ti1Var, eefVar, 2));
    }

    public /* synthetic */ nl(z79 z79Var, aie aieVar, Bundle bundle, ResultReceiver resultReceiver) {
        this.a = 11;
        this.b = z79Var;
        this.c = bundle;
        this.d = resultReceiver;
    }

    public /* synthetic */ nl(FirebaseMessaging firebaseMessaging, String str, zkf zkfVar) {
        this.a = 7;
        this.c = firebaseMessaging;
        this.b = str;
        this.d = zkfVar;
    }

    public /* synthetic */ nl(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x01bc A[Catch: all -> 0x00b2, TryCatch #0 {all -> 0x00b2, CameraAccessException -> 0x027c, blocks: (B:10:0x008a, B:16:0x009b, B:17:0x00af, B:21:0x00b5, B:22:0x00bb, B:24:0x00c1, B:25:0x00d7, B:26:0x0138, B:28:0x013e, B:29:0x0156, B:31:0x0168, B:33:0x016c, B:34:0x0178, B:35:0x0192, B:37:0x0198, B:39:0x01a6, B:41:0x01ae, B:45:0x01bc, B:47:0x01ce, B:49:0x01e4, B:50:0x01ef, B:52:0x020f, B:54:0x0213, B:55:0x021c, B:56:0x023d, B:58:0x0243, B:59:0x0253, B:61:0x026d, B:62:0x0272, B:63:0x027a, B:66:0x027d, B:67:0x0283, B:69:0x0285, B:70:0x029a), top: B:74:0x008a }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0285 A[Catch: all -> 0x00b2, TryCatch #0 {all -> 0x00b2, CameraAccessException -> 0x027c, blocks: (B:10:0x008a, B:16:0x009b, B:17:0x00af, B:21:0x00b5, B:22:0x00bb, B:24:0x00c1, B:25:0x00d7, B:26:0x0138, B:28:0x013e, B:29:0x0156, B:31:0x0168, B:33:0x016c, B:34:0x0178, B:35:0x0192, B:37:0x0198, B:39:0x01a6, B:41:0x01ae, B:45:0x01bc, B:47:0x01ce, B:49:0x01e4, B:50:0x01ef, B:52:0x020f, B:54:0x0213, B:55:0x021c, B:56:0x023d, B:58:0x0243, B:59:0x0253, B:61:0x026d, B:62:0x0272, B:63:0x027a, B:66:0x027d, B:67:0x0283, B:69:0x0285, B:70:0x029a), top: B:74:0x008a }] */
    @Override // defpackage.yu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.ha8 apply(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nl.apply(java.lang.Object):ha8");
    }
}
