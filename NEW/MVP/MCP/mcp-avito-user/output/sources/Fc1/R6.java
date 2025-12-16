package Fc1;

import android.database.Cursor;
import feedback.shared.sdk.api.network.entities.RequestType;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* loaded from: classes9.dex */
public final class R6 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C13747u7 f5165a;

    @Inject
    public R6(@Y61.k C13747u7 c13747u7) {
        this.f5165a = c13747u7;
    }

    public final void a() throws xyz.n.a.f3 {
        C13747u7 c13747u7 = this.f5165a;
        try {
            c13747u7.getWritableDatabase().delete("REQUEST_CACHE", "REQUEST_ID IN (SELECT REQUEST_ID FROM REQUEST_CACHE LIMIT 1)", null);
        } catch (Exception e12) {
            c13747u7.getClass();
            try {
                c13747u7.close();
            } catch (Exception unused) {
            }
            try {
                c13747u7.f5852b.deleteDatabase("feedbackCache");
            } catch (Exception unused2) {
            }
            throw new xyz.n.a.f3(e12);
        }
    }

    @Y61.l
    public final B3 b() throws xyz.n.a.f3 {
        B3 b32;
        C13747u7 c13747u7 = this.f5165a;
        try {
            Cursor cursorQuery = c13747u7.getReadableDatabase().query("REQUEST_CACHE", null, null, null, null, null, "REQUEST_ID", "1");
            try {
                Y4.a(cursorQuery);
                cursorQuery.moveToNext();
                int count = cursorQuery.getCount();
                int i12 = kotlin.jvm.internal.J.f406821a;
                if (count == 0) {
                    b32 = null;
                } else {
                    b32 = new B3(RequestType.values()[cursorQuery.getInt(1)], cursorQuery.isNull(2) ? null : cursorQuery.getString(2));
                }
                kotlin.io.c.a(cursorQuery, null);
                return b32;
            } finally {
            }
        } catch (Exception e12) {
            c13747u7.getClass();
            try {
                c13747u7.close();
            } catch (Exception unused) {
            }
            try {
                c13747u7.f5852b.deleteDatabase("feedbackCache");
            } catch (Exception unused2) {
            }
            throw new xyz.n.a.f3(e12);
        }
    }
}
