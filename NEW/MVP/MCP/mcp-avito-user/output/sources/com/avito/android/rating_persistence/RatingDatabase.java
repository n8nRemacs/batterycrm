package com.avito.android.rating_persistence;

import Y61.k;
import androidx.room.B;
import androidx.room.RoomDatabase;
import kotlin.Metadata;

/* compiled from: RatingDatabase.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_persistence/RatingDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "_avito_rating-persistence_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@B
/* loaded from: classes16.dex */
public abstract class RatingDatabase extends RoomDatabase {
    @k
    public abstract com.avito.android.rating_persistence.aspects.a u();

    @k
    public abstract com.avito.android.rating_persistence.llm_summary.a v();

    @k
    public abstract com.avito.android.rating_persistence.sort.a w();
}
