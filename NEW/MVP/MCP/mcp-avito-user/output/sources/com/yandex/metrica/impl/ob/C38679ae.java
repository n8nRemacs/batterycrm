package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.ae, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38679ae implements InterfaceC38692b2<C38779ee> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f380122a;

    public C38679ae(@j.N Context context) {
        this.f380122a = context;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38692b2, Y41.a
    @j.P
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C38779ee invoke() {
        Cursor cursorQuery;
        try {
            cursorQuery = this.f380122a.getContentResolver().query(Uri.parse("content://com.yandex.preinstallsatellite.appmetrica.provider/preload_info"), null, null, null, null);
            try {
                if (cursorQuery == null) {
                    C38842h2.a("No Satellite content provider found", new Object[0]);
                } else {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("tracking_id"));
                        String string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("additional_parameters"));
                        JSONObject jSONObject = !TextUtils.isEmpty(string2) ? new JSONObject(string2) : new JSONObject();
                        C38842h2.a("Preload info from Satellite: {tracking id = %s, additional parameters = %s}", string, jSONObject);
                        C38779ee c38779ee = new C38779ee(string, jSONObject, !TextUtils.isEmpty(string), false, EnumC39158u0.SATELLITE);
                        A2.a(cursorQuery);
                        return c38779ee;
                    }
                    C38842h2.a("No Preload Info data in Satellite content provider", new Object[0]);
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            cursorQuery = null;
        }
        A2.a(cursorQuery);
        return null;
    }
}
