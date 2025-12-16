package com.avito.android.persistence.messenger;

import android.database.Cursor;
import com.avito.android.persistence.messenger.UserHashRotationGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.collections.AbstractC42738c;

/* compiled from: LastKnownUserDao_Impl.java */
/* loaded from: classes15.dex */
class V0 implements Callable<List<X0>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.room.F0 f215328b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ W0 f215329c;

    public V0(W0 w02, androidx.room.F0 f02) {
        this.f215329c = w02;
        this.f215328b = f02;
    }

    @Override // java.util.concurrent.Callable
    @j.P
    public final List<X0> call() {
        Object next;
        Cursor cursorP = this.f215329c.f215330a.p(this.f215328b);
        try {
            int iB2 = V1.b.b(cursorP, "user_id");
            int iB3 = V1.b.b(cursorP, "user_hash_id");
            int iB4 = V1.b.b(cursorP, "user_hash_rotation_group");
            ArrayList arrayList = new ArrayList(cursorP.getCount());
            while (cursorP.moveToNext()) {
                String string = cursorP.getString(iB2);
                String string2 = cursorP.getString(iB3);
                String string3 = cursorP.getString(iB4);
                int i12 = UserHashRotationGroup.a.f215327a;
                Iterator it = ((AbstractC42738c) UserHashRotationGroup.f215325f).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((UserHashRotationGroup) next).f215326b.equals(string3)) {
                        break;
                    }
                }
                UserHashRotationGroup userHashRotationGroup = (UserHashRotationGroup) next;
                if (userHashRotationGroup == null) {
                    userHashRotationGroup = UserHashRotationGroup.f215322c;
                }
                arrayList.add(new X0(string, string2, userHashRotationGroup));
            }
            return arrayList;
        } finally {
            cursorP.close();
        }
    }

    public final void finalize() {
        this.f215328b.d();
    }
}
