package com.avito.android.profile.edit.refactoring.adapter;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import p90.InterfaceC46923a;

/* compiled from: EditProfileItems.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_profile_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e {
    @Y61.l
    public static final EditProfileItem a(long j12, @Y61.l List list) {
        EditProfileItem editProfileItem;
        Object next;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((EditProfileItem) next).getF222249b() == j12) {
                    break;
                }
            }
            editProfileItem = (EditProfileItem) next;
        } else {
            editProfileItem = null;
        }
        if (editProfileItem != null) {
            return editProfileItem;
        }
        return null;
    }

    public static final void b(@Y61.k List<EditProfileItem> list, @Y61.l EditProfileItem editProfileItem) {
        Object next;
        if (editProfileItem == null) {
            return;
        }
        long f222249b = Long.MAX_VALUE - editProfileItem.getF222251b();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((EditProfileItem) next).getF222251b() == f222249b) {
                    break;
                }
            }
        }
        EditProfileItem editProfileItem2 = (EditProfileItem) next;
        if (editProfileItem2 != null) {
            list.remove(editProfileItem2);
        }
    }

    public static final int c(@Y61.k List<EditProfileItem> list, @Y61.k EditProfileItem editProfileItem) {
        Iterator<EditProfileItem> it = list.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            if (it.next().getF222251b() == editProfileItem.getF222251b()) {
                break;
            }
            i12++;
        }
        if (i12 >= 0) {
            list.set(i12, editProfileItem);
        }
        return i12;
    }

    public static final EditProfileItem d(EditProfileItem editProfileItem, boolean z12) {
        InterfaceC46923a interfaceC46923a = editProfileItem instanceof InterfaceC46923a ? (InterfaceC46923a) editProfileItem : null;
        return (interfaceC46923a == null || interfaceC46923a.getF222254e() == z12) ? editProfileItem : interfaceC46923a.a(z12);
    }
}
