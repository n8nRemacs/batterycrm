package Oa1;

import Oa1.C14666z;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.InterfaceC42726C;
import kotlin.collections.C42745f0;
import kotlin.text.C43047d;
import kotlin.text.C43066x;

/* renamed from: Oa1.q, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C14658q {

    /* renamed from: a, reason: collision with root package name */
    public final C14653l f12381a;

    public C14658q(C14653l c14653l, C14655n c14655n, C14656o c14656o, C14666z.b bVar) {
        this.f12381a = c14653l;
    }

    public final void a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C14646e c14646e = (C14646e) it.next();
            arrayList2.add(new C14654m(c14646e.f12358a, f0.a(c14646e.f12359b).getBytes(C43047d.f410589b)));
        }
        InterfaceC42726C interfaceC42726C = this.f12381a.f12377b;
        String strO = C42745f0.O(arrayList2, null, null, null, C14649h.f12365l, 31);
        String strE0 = C43066x.E0("\n            DELETE FROM metrics_event_table\n            WHERE _id IN (\n                SELECT _id FROM metrics_event_table\n                WHERE uuid IN (" + strO + ")\n            )\n        ");
        try {
            ((SQLiteDatabase) interfaceC42726C.getValue()).beginTransactionNonExclusive();
            ((SQLiteDatabase) interfaceC42726C.getValue()).execSQL(strE0);
            ((SQLiteDatabase) interfaceC42726C.getValue()).setTransactionSuccessful();
            ((SQLiteDatabase) interfaceC42726C.getValue()).endTransaction();
            new C14648g(strO);
        } finally {
        }
    }
}
