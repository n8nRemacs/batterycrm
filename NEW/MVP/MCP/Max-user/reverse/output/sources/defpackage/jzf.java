package defpackage;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.Context;
import android.content.OperationApplicationException;
import android.net.Uri;
import android.os.RemoteException;
import android.provider.ContactsContract;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class jzf implements cub {
    public String a;
    public final String b;
    public final Context c;
    public final zid d;
    public final j0e e;
    public final fxa f;
    public final iya g;
    public final ie4 h;
    public final z7c i;
    public final yi5 j;

    public jzf(Context context, zid zidVar, j0e j0eVar, fxa fxaVar, iya iyaVar, ie4 ie4Var, z7c z7cVar, yi5 yi5Var) {
        this.b = context.getString(c5d.tt_contact_account_type);
        this.c = context;
        this.d = zidVar;
        this.e = j0eVar;
        this.f = fxaVar;
        this.g = iyaVar;
        this.h = ie4Var;
        this.i = z7cVar;
        this.j = yi5Var;
    }

    public static Uri b(Uri uri) {
        return uri.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [jzf] */
    @Override // defpackage.cub
    public final void a(ArrayList arrayList) {
        ?? arrayList2;
        List listK;
        ?? arrayList3;
        RuntimeException runtimeException;
        if (arrayList == null || arrayList.isEmpty()) {
            arrayList2 = Collections.EMPTY_LIST;
        } else {
            arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                try {
                    if (((ytb) obj).o != 0) {
                        arrayList2.add(Long.valueOf(((ytb) obj).o));
                    }
                } finally {
                }
            }
        }
        qv3 qv3Var = (qv3) ((k18) this.d.a).getValue();
        if (qv3Var != null) {
            listK = qv3Var.k();
        } else {
            wqi.e("zid", "contactController is null", null);
            listK = Collections.EMPTY_LIST;
        }
        if (listK == null || listK.isEmpty()) {
            arrayList3 = Collections.EMPTY_LIST;
        } else {
            arrayList3 = new ArrayList();
            for (Object obj2 : listK) {
                try {
                    if (arrayList2.contains(Long.valueOf(((ku3) obj2).q()))) {
                        arrayList3.add(Long.valueOf(((ku3) obj2).p()));
                    }
                } finally {
                }
            }
        }
        wqi.c("jzf", "onPhonebookUpdated: phones=%s, serverPhones=%s, contactIds=%s", Integer.valueOf(arrayList.size()), Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList3.size()));
        if (arrayList3.isEmpty()) {
            return;
        }
        f(arrayList3);
    }

    public final Uri c() {
        return ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", this.a).appendQueryParameter("account_type", this.b).build();
    }

    public final void d(ku3 ku3Var, String str, String str2, String str3) throws RemoteException, OperationApplicationException {
        Context context = this.c;
        ContentResolver contentResolver = context.getContentResolver();
        ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
        ContentProviderOperation.Builder builderWithValue = ContentProviderOperation.newInsert(b(ContactsContract.RawContacts.CONTENT_URI)).withValue("account_name", this.a);
        String str4 = this.b;
        arrayList.add(builderWithValue.withValue("account_type", str4).withValue("sync1", Long.valueOf(ku3Var.p())).build());
        arrayList.add(ContentProviderOperation.newInsert(b(ContactsContract.Settings.CONTENT_URI)).withValue("account_name", this.a).withValue("account_type", str4).withValue("ungrouped_visible", 1).build());
        Uri uri = ContactsContract.Data.CONTENT_URI;
        arrayList.add(ContentProviderOperation.newInsert(b(uri)).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/name").withValue("data2", str).withValue("data3", str2).build());
        arrayList.add(ContentProviderOperation.newInsert(b(uri)).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", str3).withValue("data2", 2).build());
        arrayList.add(ContentProviderOperation.newInsert(b(uri)).withValueBackReference("raw_contact_id", 0).withValue("mimetype", context.getString(c5d.tt_contact_mimetype)).withValue("data1", Long.valueOf(ku3Var.p())).withValue("data2", Long.valueOf(ku3Var.q())).withValue("data3", ku3Var.e()).build());
        try {
            contentResolver.applyBatch("com.android.contacts", arrayList);
        } catch (Exception e) {
            wqi.b("jzf", "Exception when add for contact our mime type", e);
            ((y3b) this.j).a(new IllegalStateException("Exception when add for contact our mime type", e));
        }
    }

    public final void e(Set set) {
        wqi.c("jzf", "removeContacts: count=%s", Integer.valueOf(set.size()));
        if (set.isEmpty()) {
            return;
        }
        try {
            wqi.c("jzf", "removeContacts: deleted count=%s", Integer.valueOf(this.c.getContentResolver().delete(c(), set.size() == 0 ? null : String.format("%1$s IN (%2$s)", "sync1", l8g.e(set)), null)));
        } catch (Exception e) {
            wqi.b("jzf", "removeContacts exception", e);
            ((y3b) this.j).a(e);
        }
    }

    public final void f(Collection collection) {
        wqi.c("jzf", "sync: count=%s", Integer.valueOf(collection.size()));
        if (collection.isEmpty()) {
            return;
        }
        this.e.b(new dj((Object) this, (Object) collection, false, 4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:343:0x033c, code lost:
    
        continue;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:285:0x05a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r11v45, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.util.Collection r38, boolean r39) {
        /*
            Method dump skipped, instructions count: 1728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jzf.g(java.util.Collection, boolean):void");
    }
}
