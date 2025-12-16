package androidx.room;

import android.content.Context;
import androidx.room.RoomDatabase;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: Room.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/x0;", "", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f54421a = 0;

    static {
        new x0();
    }

    @X41.n
    @Y61.k
    public static final RoomDatabase.a a(@Y61.k Context context, @Y61.l String str, @Y61.k Class cls) {
        if (C43066x.K(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new RoomDatabase.a(context, str, cls);
    }
}
