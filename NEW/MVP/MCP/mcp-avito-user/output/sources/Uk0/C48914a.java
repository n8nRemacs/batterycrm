package uK0;

import Y61.k;
import Y61.l;
import android.database.Cursor;
import android.database.CursorWrapper;
import androidx.collection.C20199a;
import kotlin.Metadata;

/* compiled from: CachingCursor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LuK0/a;", "Landroid/database/CursorWrapper;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uK0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C48914a extends CursorWrapper {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C20199a<String, Integer> f439905b;

    public C48914a(@k Cursor cursor) {
        super(cursor);
        this.f439905b = new C20199a<>(cursor.getColumnCount());
    }

    public final int a(String str) {
        C20199a<String, Integer> c20199a = this.f439905b;
        Integer numValueOf = c20199a.get(str);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(super.getColumnIndexOrThrow(str));
            c20199a.put(str, numValueOf);
        }
        return numValueOf.intValue();
    }

    public final int b(@k String str) {
        return getInt(a(str));
    }

    public final long c(@k String str) {
        return getLong(a(str));
    }

    @k
    public final String d(@k String str) {
        return getString(a(str));
    }

    @l
    public final String f(@k String str) {
        int iA2 = a(str);
        if (isNull(iA2)) {
            return null;
        }
        return getString(iA2);
    }
}
