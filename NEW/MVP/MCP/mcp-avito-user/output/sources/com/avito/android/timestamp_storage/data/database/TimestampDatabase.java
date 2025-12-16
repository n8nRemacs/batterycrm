package com.avito.android.timestamp_storage.data.database;

import Y61.k;
import androidx.room.B;
import androidx.room.RoomDatabase;
import androidx.room.U0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TimestampDatabase.kt */
@U0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/timestamp_storage/data/database/TimestampDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "a", "_avito_timestamp-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@B
/* loaded from: classes4.dex */
public abstract class TimestampDatabase extends RoomDatabase {

    /* compiled from: TimestampDatabase.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/timestamp_storage/data/database/TimestampDatabase$a;", "", "<init>", "()V", "", "NAME", "Ljava/lang/String;", "_avito_timestamp-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @k
    public abstract com.avito.android.timestamp_storage.data.dao.a u();
}
