package wu;

import Y61.k;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.avito.android.db.f;
import com.avito.android.util.C35851n0;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.s0;
import uK0.C48914a;

/* compiled from: ViewedAdvertsDaoOld.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lwu/c;", "Lwu/b;", "Lcom/avito/android/db/b;", "_avito-discouraged_persistence_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c extends com.avito.android.db.b implements b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final f f441843b;

    public c(@k com.avito.android.server_time.a aVar, @k f fVar) {
        super(fVar);
        this.f441843b = fVar;
    }

    @Override // wu.b
    @k
    public final ArrayList o() {
        ArrayList arrayList;
        synchronized (d.f441844a) {
            SQLiteDatabase readableDatabase = this.f132678a.getReadableDatabase();
            arrayList = new ArrayList();
            d.f441845b.getClass();
            Cursor cursorQuery = readableDatabase.query("viewed_adverts", new String[]{"advert_id", "added_time"}, null, null, null, null, null);
            C48914a c48914aA = C35851n0.a(cursorQuery);
            while (true) {
                boolean z12 = false;
                try {
                    try {
                        if (cursorQuery.moveToNext()) {
                            d.f441845b.getClass();
                            arrayList.add(new Q(c48914aA.d("advert_id"), Long.valueOf(c48914aA.c("added_time"))));
                        } else {
                            G0 g02 = G0.f406611a;
                            c48914aA.close();
                        }
                    } catch (Exception e12) {
                        z12 = true;
                        try {
                            c48914aA.close();
                        } catch (Exception unused) {
                        }
                        throw e12;
                    }
                } catch (Throwable th2) {
                    if (!z12) {
                        c48914aA.close();
                    }
                    throw th2;
                }
            }
        }
        return arrayList;
    }

    @Override // wu.b
    public final void r() {
        synchronized (d.f441844a) {
            this.f132678a.getWritableDatabase();
            SQLiteDatabase writableDatabase = this.f441843b.getWritableDatabase();
            d.f441845b.getClass();
            writableDatabase.delete("viewed_adverts", null, null);
            G0 g02 = G0.f406611a;
        }
    }
}
