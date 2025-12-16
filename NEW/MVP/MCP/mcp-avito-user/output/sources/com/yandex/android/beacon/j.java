package com.yandex.android.beacon;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.yandex.android.beacon.a;
import com.yandex.android.beacon.k;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.InterfaceC42726C;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f367222b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f367223c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f367224d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ JSONObject f367225e;

    public /* synthetic */ j(k kVar, Uri uri, LinkedHashMap linkedHashMap, JSONObject jSONObject) {
        this.f367222b = kVar;
        this.f367223c = uri;
        this.f367224d = linkedHashMap;
        this.f367225e = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String string;
        k.b bVar = this.f367222b.f367230d;
        bVar.getClass();
        com.yandex.div.internal.util.b.f370168a.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC42726C interfaceC42726C = bVar.f367231a;
        k.d dVar = (k.d) interfaceC42726C.getValue();
        c cVar = dVar.f367234b;
        cVar.getClass();
        ContentValues contentValues = new ContentValues(3);
        Uri uri = this.f367223c;
        contentValues.put(ContextActionHandler.Link.URL, uri.toString());
        LinkedHashMap linkedHashMap = this.f367224d;
        if (linkedHashMap.isEmpty()) {
            string = null;
        } else {
            StringBuilder sb2 = new StringBuilder();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                sb2.append(str);
                sb2.append('\t');
                sb2.append(str2);
                sb2.append((char) 0);
            }
            string = sb2.toString();
        }
        contentValues.put("headers", string);
        contentValues.put("add_timestamp", Long.valueOf(jCurrentTimeMillis));
        SQLiteDatabase writableDatabase = cVar.getWritableDatabase();
        try {
            long jInsert = writableDatabase.insert("items", null, contentValues);
            kotlin.io.c.a(writableDatabase, null);
            dVar.f367235c.push(new a.b(uri, linkedHashMap, this.f367225e, jCurrentTimeMillis, jInsert));
            dVar.b();
            f.f367221a.getClass();
            uri.toString();
            b bVar2 = k.this.f367228b;
            throw null;
        } finally {
        }
    }
}
