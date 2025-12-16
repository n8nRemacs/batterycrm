package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.yandex.metrica.impl.ob.C39185v3;
import java.util.HashMap;

/* renamed from: com.yandex.metrica.impl.ob.a2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38667a2 implements InterfaceC38692b2<C39185v3.a> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f380093a;

    public C38667a2(@j.N Context context) {
        this.f380093a = context;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38692b2, Y41.a
    @j.P
    public Object invoke() {
        Cursor cursorQuery;
        String string;
        String string2;
        C39185v3.a aVar = null;
        try {
            cursorQuery = this.f380093a.getContentResolver().query(Uri.parse("content://com.yandex.preinstallsatellite.appmetrica.provider/clids"), null, null, null, null);
        } catch (Throwable th2) {
            th = th2;
            cursorQuery = null;
        }
        try {
            if (cursorQuery != null) {
                HashMap map = new HashMap();
                while (cursorQuery.moveToNext()) {
                    try {
                        string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("clid_key"));
                        string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("clid_value"));
                    } catch (Throwable unused) {
                    }
                    if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                        C38842h2.a("Invalid clid {%s : %s}", string, string2);
                    } else {
                        map.put(string, string2);
                    }
                }
                C38842h2.a("Clids from satellite: %s", map);
                C39185v3.a aVar2 = new C39185v3.a(map, EnumC39158u0.SATELLITE);
                A2.a(cursorQuery);
                aVar = aVar2;
            } else {
                C38842h2.a("No Satellite content provider found", new Object[0]);
            }
        } catch (Throwable th3) {
            th = th3;
            try {
                C38842h2.a(th, "Error while getting satellite clids", new Object[0]);
                return aVar;
            } finally {
                A2.a(cursorQuery);
            }
        }
        return aVar;
    }
}
