package B3;

import android.content.ContentValues;
import android.database.Cursor;
import com.avito.android.account.Z;
import com.avito.android.util.C35851n0;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import ru.C47726a;
import uK0.C48914a;

/* compiled from: LoginSuggestStorageImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LB3/d;", "LB3/c;", "_avito_account-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes10.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.db.sqlbrite.a f844a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C47726a f845b = new C47726a();

    @Inject
    public d(@Y61.k com.avito.android.db.sqlbrite.a aVar) {
        this.f844a = aVar;
    }

    public final List<Z> a(Cursor cursor) {
        if (cursor.getCount() <= 0) {
            return C42784z0.f406748b;
        }
        C48914a c48914aA = C35851n0.a(cursor);
        c48914aA.moveToFirst();
        ArrayList arrayList = new ArrayList();
        do {
            this.f845b.getClass();
            arrayList.add(new Z(c48914aA.d("user_hash_id"), c48914aA.f("login"), c48914aA.f("social"), c48914aA.f("social_id")));
        } while (c48914aA.moveToNext());
        return arrayList;
    }

    @Override // B3.c
    public final void b(@Y61.k String str) {
        this.f845b.getClass();
        this.f844a.a().delete("login_suggests", "user_hash_id = \"" + str + '\"', new String[0]);
    }

    @Override // B3.c
    @Y61.k
    public final List c() {
        Cursor cursorRawQuery = null;
        try {
            com.avito.android.db.sqlbrite.a aVar = this.f844a;
            cursorRawQuery = aVar.a().rawQuery(this.f845b.f430289b, new String[]{String.valueOf(1)});
            List<Z> listA = a(cursorRawQuery);
            cursorRawQuery.close();
            return listA;
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }

    @Override // B3.c
    public final void d(@Y61.k Z z12) {
        ContentValues contentValues = new ContentValues();
        this.f845b.getClass();
        contentValues.put("user_hash_id", z12.f68096a);
        contentValues.put("login", z12.f68097b);
        contentValues.put("social", z12.f68098c);
        contentValues.put("social_id", z12.f68099d);
        this.f844a.a().insert("login_suggests", null, contentValues);
    }

    @Override // B3.c
    @Y61.k
    public final List<Z> get() {
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = this.f844a.a().rawQuery(this.f845b.f430288a, new String[0]);
            List<Z> listA = a(cursorRawQuery);
            cursorRawQuery.close();
            return listA;
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }
}
