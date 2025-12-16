package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.google.android.datatransport.runtime.r;
import com.google.android.datatransport.runtime.scheduling.persistence.s;
import java.util.ArrayList;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class l implements s.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f343248a;

    public /* synthetic */ l(int i12) {
        this.f343248a = i12;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.s.b
    public final Object apply(Object obj) {
        int i12 = 1;
        switch (this.f343248a) {
            case 0:
                com.google.android.datatransport.c cVar = s.f343263g;
                return (List) s.k(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new l(i12));
            default:
                Cursor cursor = (Cursor) obj;
                com.google.android.datatransport.c cVar2 = s.f343263g;
                ArrayList arrayList = new ArrayList();
                while (cursor.moveToNext()) {
                    r.a aVarA = com.google.android.datatransport.runtime.r.a();
                    aVarA.b(cursor.getString(1));
                    aVarA.d(HX0.a.b(cursor.getInt(2)));
                    String string = cursor.getString(3);
                    aVarA.c(string == null ? null : Base64.decode(string, 0));
                    arrayList.add(aVarA.a());
                }
                return arrayList;
        }
    }
}
