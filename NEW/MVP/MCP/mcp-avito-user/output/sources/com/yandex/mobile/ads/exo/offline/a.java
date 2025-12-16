package com.yandex.mobile.ads.exo.offline;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.yandex.mobile.ads.exo.offline.DownloadRequest;
import com.yandex.mobile.ads.impl.db;
import com.yandex.mobile.ads.impl.ke1;
import com.yandex.mobile.ads.impl.ln;
import com.yandex.mobile.ads.impl.mn;
import com.yandex.mobile.ads.impl.om1;
import com.yandex.mobile.ads.impl.pc1;
import com.yandex.mobile.ads.impl.pr;
import com.yandex.mobile.ads.impl.qr;
import com.yandex.mobile.ads.impl.t61;
import com.yandex.mobile.ads.impl.up1;
import j.B;
import j.P;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class a implements om1 {

    /* renamed from: e, reason: collision with root package name */
    private static final String f383087e;

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f383088f;

    /* renamed from: a, reason: collision with root package name */
    private final String f383089a;

    /* renamed from: b, reason: collision with root package name */
    private final mn f383090b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f383091c;

    /* renamed from: d, reason: collision with root package name */
    @B
    private boolean f383092d;

    /* renamed from: com.yandex.mobile.ads.exo.offline.a$a, reason: collision with other inner class name */
    public static final class C10971a implements pr {

        /* renamed from: a, reason: collision with root package name */
        private final Cursor f383093a;

        public /* synthetic */ C10971a(Cursor cursor, int i12) {
            this(cursor);
        }

        public final b a() {
            return a.b(this.f383093a);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f383093a.close();
        }

        public final int getPosition() {
            return this.f383093a.getPosition();
        }

        public final boolean moveToPosition(int i12) {
            return this.f383093a.moveToPosition(i12);
        }

        private C10971a(Cursor cursor) {
            this.f383093a = cursor;
        }
    }

    static {
        int[] iArr = {3, 4};
        StringBuilder sb2 = new StringBuilder("state IN (");
        for (int i12 = 0; i12 < 2; i12++) {
            if (i12 > 0) {
                sb2.append(',');
            }
            sb2.append(iArr[i12]);
        }
        sb2.append(')');
        f383087e = sb2.toString();
        f383088f = new String[]{"id", "mime_type", TooltipAttribute.PARAM_DEEP_LINK, "stream_keys", "custom_cache_key", "data", VoiceInfo.STATE, "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded", "key_set_id"};
    }

    public a(t61 t61Var) {
        this(t61Var, 0);
    }

    @P
    public final b b(String str) throws ln {
        a();
        try {
            try {
                Cursor cursorQuery = this.f383090b.getReadableDatabase().query(this.f383089a, f383088f, "id = ?", new String[]{str}, null, null, "start_time_ms ASC");
                try {
                    if (cursorQuery.getCount() == 0) {
                        cursorQuery.close();
                        return null;
                    }
                    cursorQuery.moveToNext();
                    b bVarB = b(cursorQuery);
                    cursorQuery.close();
                    return bVarB;
                } finally {
                }
            } finally {
                ln lnVar = new ln(th);
            }
        } catch (SQLiteException th2) {
            throw new ln(th2);
        }
    }

    public final void c(String str) {
        a();
        try {
            this.f383090b.getWritableDatabase().delete(this.f383089a, "id = ?", new String[]{str});
        } catch (Throwable th2) {
            throw new ln(th2);
        }
    }

    public a(t61 t61Var, int i12) {
        this.f383090b = t61Var;
        this.f383089a = up1.a("ExoPlayerDownloads", "");
        this.f383091c = new Object();
    }

    public final pr a(int... iArr) {
        String string;
        a();
        int i12 = 0;
        if (iArr.length == 0) {
            string = "1";
        } else {
            StringBuilder sb2 = new StringBuilder("state IN (");
            for (int i13 = 0; i13 < iArr.length; i13++) {
                if (i13 > 0) {
                    sb2.append(',');
                }
                sb2.append(iArr[i13]);
            }
            sb2.append(')');
            string = sb2.toString();
        }
        try {
            return new C10971a(this.f383090b.getReadableDatabase().query(this.f383089a, f383088f, string, null, null, null, "start_time_ms ASC"), i12);
        } catch (Throwable th2) {
            throw new ln(th2);
        }
    }

    public final void c() {
        a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(VoiceInfo.STATE, (Integer) 5);
            contentValues.put("failure_reason", (Integer) 0);
            this.f383090b.getWritableDatabase().update(this.f383089a, contentValues, null, null);
        } catch (Throwable th2) {
            throw new ln(th2);
        }
    }

    private static b c(Cursor cursor) {
        String str;
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        DownloadRequest.b bVar = new DownloadRequest.b(Uri.parse(string2), string);
        String string3 = cursor.getString(1);
        if ("dash".equals(string3)) {
            str = "application/dash+xml";
        } else if ("hls".equals(string3)) {
            str = "application/x-mpegURL";
        } else if ("ss".equals(string3)) {
            str = "application/vnd.ms-sstr+xml";
        } else {
            str = "video/x-unknown";
        }
        DownloadRequest downloadRequestA = bVar.b(str).a(a(cursor.getString(3))).a(cursor.getString(4)).a(cursor.getBlob(5)).a();
        qr qrVar = new qr();
        qrVar.f389282a = cursor.getLong(13);
        qrVar.f389283b = cursor.getFloat(12);
        int i12 = cursor.getInt(6);
        return new b(downloadRequestA, i12, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i12 == 4 ? cursor.getInt(11) : 0, qrVar);
    }

    public final void b() {
        a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(VoiceInfo.STATE, (Integer) 0);
            this.f383090b.getWritableDatabase().update(this.f383089a, contentValues, "state = 2", null);
        } catch (Throwable th2) {
            throw new ln(th2);
        }
    }

    public final void a(b bVar) {
        a();
        try {
            a(bVar, this.f383090b.getWritableDatabase());
        } catch (Throwable th2) {
            throw new ln(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static b b(Cursor cursor) {
        byte[] blob = cursor.getBlob(14);
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        DownloadRequest.b bVarA = new DownloadRequest.b(Uri.parse(string2), string).b(cursor.getString(1)).a(a(cursor.getString(3)));
        if (blob.length <= 0) {
            blob = null;
        }
        DownloadRequest downloadRequestA = bVarA.b(blob).a(cursor.getString(4)).a(cursor.getBlob(5)).a();
        qr qrVar = new qr();
        qrVar.f389282a = cursor.getLong(13);
        qrVar.f389283b = cursor.getFloat(12);
        int i12 = cursor.getInt(6);
        return new b(downloadRequestA, i12, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i12 == 4 ? cursor.getInt(11) : 0, qrVar);
    }

    public final void a(int i12) {
        a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i12));
            this.f383090b.getWritableDatabase().update(this.f383089a, contentValues, f383087e, null);
        } catch (Throwable th2) {
            throw new ln(th2);
        }
    }

    public final void a(int i12, String str) {
        a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i12));
            this.f383090b.getWritableDatabase().update(this.f383089a, contentValues, f383087e + " AND id = ?", new String[]{str});
        } catch (Throwable th2) {
            throw new ln(th2);
        }
    }

    private void a() {
        synchronized (this.f383091c) {
            if (this.f383092d) {
                return;
            }
            try {
                int iA2 = ke1.a(this.f383090b.getReadableDatabase(), 0, "");
                if (iA2 != 3) {
                    SQLiteDatabase writableDatabase = this.f383090b.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        ke1.a(writableDatabase, 0, "", 3);
                        ArrayList arrayListA = iA2 == 2 ? a(writableDatabase) : new ArrayList();
                        writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.f383089a);
                        writableDatabase.execSQL("CREATE TABLE " + this.f383089a + " (id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)");
                        Iterator it = arrayListA.iterator();
                        while (it.hasNext()) {
                            a((b) it.next(), writableDatabase);
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th2) {
                        writableDatabase.endTransaction();
                        throw th2;
                    }
                }
                this.f383092d = true;
            } catch (Throwable th3) {
                throw new ln(th3);
            }
        }
    }

    private void a(b bVar, SQLiteDatabase sQLiteDatabase) throws SQLException {
        byte[] bArr = bVar.f383094a.f383074e;
        if (bArr == null) {
            bArr = pc1.f388773f;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", bVar.f383094a.f383070a);
        contentValues.put("mime_type", bVar.f383094a.f383072c);
        contentValues.put(TooltipAttribute.PARAM_DEEP_LINK, bVar.f383094a.f383071b.toString());
        List<StreamKey> list = bVar.f383094a.f383073d;
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < list.size(); i12++) {
            StreamKey streamKey = list.get(i12);
            sb2.append(streamKey.f383084a);
            sb2.append('.');
            sb2.append(streamKey.f383085b);
            sb2.append('.');
            sb2.append(streamKey.f383086c);
            sb2.append(',');
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        contentValues.put("stream_keys", sb2.toString());
        contentValues.put("custom_cache_key", bVar.f383094a.f383075f);
        contentValues.put("data", bVar.f383094a.f383076g);
        contentValues.put(VoiceInfo.STATE, Integer.valueOf(bVar.f383095b));
        contentValues.put("start_time_ms", Long.valueOf(bVar.f383096c));
        contentValues.put("update_time_ms", Long.valueOf(bVar.f383097d));
        contentValues.put("content_length", Long.valueOf(bVar.f383098e));
        contentValues.put("stop_reason", Integer.valueOf(bVar.f383099f));
        contentValues.put("failure_reason", Integer.valueOf(bVar.f383100g));
        contentValues.put("percent_downloaded", Float.valueOf(bVar.f383101h.f389283b));
        contentValues.put("bytes_downloaded", Long.valueOf(bVar.f383101h.f389282a));
        contentValues.put("key_set_id", bArr);
        sQLiteDatabase.replaceOrThrow(this.f383089a, null, contentValues);
    }

    private ArrayList a(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        if (!pc1.a(sQLiteDatabase, this.f383089a)) {
            return arrayList;
        }
        Cursor cursorQuery = sQLiteDatabase.query(this.f383089a, new String[]{"id", "title", TooltipAttribute.PARAM_DEEP_LINK, "stream_keys", "custom_cache_key", "data", VoiceInfo.STATE, "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(c(cursorQuery));
            } finally {
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    private static ArrayList a(@P String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        int i12 = pc1.f388768a;
        for (String str2 : str.split(",", -1)) {
            String[] strArrSplit = str2.split("\\.", -1);
            db.b(strArrSplit.length == 3);
            arrayList.add(new StreamKey(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2])));
        }
        return arrayList;
    }
}
