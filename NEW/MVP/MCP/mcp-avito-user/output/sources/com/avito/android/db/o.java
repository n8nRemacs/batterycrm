package com.avito.android.db;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.avito.android.saved_searches.model.SearchSubscription;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SearchSubscriptionDao.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/db/o;", "Lcom/avito/android/db/b;", "Lcom/avito/android/db/n;", "_avito-discouraged_persistence_search-subscription"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class o extends b implements n {
    public static void t(ContentValues contentValues, SearchSubscription searchSubscription) {
        contentValues.put("subscription_id", searchSubscription.f258373b);
        contentValues.put("title", searchSubscription.f258374c);
        contentValues.put("description", searchSubscription.f258375d);
        contentValues.put("unread_count", Integer.valueOf(searchSubscription.f258377f ? 1 : 0));
        contentValues.put("last_update", Long.valueOf(searchSubscription.f258376e));
        contentValues.put("ssid", searchSubscription.f258379h);
    }

    @Override // com.avito.android.db.n
    public final void a() {
        this.f132678a.getWritableDatabase().delete("search_subscriptions", null, null);
    }

    @Override // com.avito.android.db.n
    public final void k(@Y61.k String str) {
        this.f132678a.getWritableDatabase().delete("search_subscriptions", "subscription_id = ?", new String[]{str});
    }

    @Override // com.avito.android.db.n
    public final void p(@Y61.k SearchSubscription searchSubscription) {
        ContentValues contentValues = new ContentValues();
        t(contentValues, searchSubscription);
        this.f132678a.getWritableDatabase().replace("search_subscriptions", null, contentValues);
    }

    @Override // com.avito.android.db.n
    public final int q() {
        return j.a(this.f132678a.getReadableDatabase(), "search_subscriptions", "unread_count <> 0", null);
    }

    @Override // com.avito.android.db.n
    public final void s(@Y61.k List<SearchSubscription> list) {
        a();
        SQLiteDatabase writableDatabase = this.f132678a.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        try {
            writableDatabase.beginTransaction();
            for (SearchSubscription searchSubscription : list) {
                contentValues.clear();
                t(contentValues, searchSubscription);
                writableDatabase.replace("search_subscriptions", null, contentValues);
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (Throwable th2) {
            writableDatabase.endTransaction();
            throw th2;
        }
    }
}
