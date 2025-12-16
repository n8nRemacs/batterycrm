package defpackage;

import java.util.List;
import java.util.concurrent.Callable;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase_Impl;

/* loaded from: classes2.dex */
public final class zqd implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ drd c;

    public /* synthetic */ zqd(drd drdVar, List list, int i) {
        this.a = i;
        this.c = drdVar;
        this.b = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        OneMeRoomDatabase_Impl oneMeRoomDatabase_Impl;
        switch (this.a) {
            case 0:
                drd drdVar = this.c;
                oneMeRoomDatabase_Impl = drdVar.a;
                oneMeRoomDatabase_Impl.c();
                try {
                    drdVar.c.A(this.b);
                    oneMeRoomDatabase_Impl.q();
                    oneMeRoomDatabase_Impl.k();
                    return qqg.a;
                } finally {
                }
            case 1:
                StringBuilder sbM = az1.m("DELETE FROM chat_folder WHERE id IN (");
                List<String> list = this.b;
                lc4.a(sbM, list.size());
                sbM.append(")");
                String string = sbM.toString();
                oneMeRoomDatabase_Impl = this.c.a;
                vk6 vk6VarD = oneMeRoomDatabase_Impl.d(string);
                int i = 1;
                for (String str : list) {
                    if (str == null) {
                        vk6VarD.S(i);
                    } else {
                        vk6VarD.f(i, str);
                    }
                    i++;
                }
                oneMeRoomDatabase_Impl.c();
                try {
                    vk6VarD.w();
                    oneMeRoomDatabase_Impl.q();
                    oneMeRoomDatabase_Impl.k();
                    return qqg.a;
                } finally {
                }
            default:
                StringBuilder sbM2 = az1.m("DELETE FROM folder_and_chats WHERE folderId IN (");
                List<String> list2 = this.b;
                lc4.a(sbM2, list2.size());
                sbM2.append(")");
                String string2 = sbM2.toString();
                oneMeRoomDatabase_Impl = this.c.a;
                vk6 vk6VarD2 = oneMeRoomDatabase_Impl.d(string2);
                int i2 = 1;
                for (String str2 : list2) {
                    if (str2 == null) {
                        vk6VarD2.S(i2);
                    } else {
                        vk6VarD2.f(i2, str2);
                    }
                    i2++;
                }
                oneMeRoomDatabase_Impl.c();
                try {
                    vk6VarD2.w();
                    oneMeRoomDatabase_Impl.q();
                    oneMeRoomDatabase_Impl.k();
                    return qqg.a;
                } finally {
                }
        }
    }
}
