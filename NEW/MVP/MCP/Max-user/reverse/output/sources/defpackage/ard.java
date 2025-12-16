package defpackage;

import java.util.concurrent.Callable;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase_Impl;

/* loaded from: classes2.dex */
public final class ard implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ drd b;

    public /* synthetic */ ard(drd drdVar, int i) {
        this.a = i;
        this.b = drdVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        OneMeRoomDatabase_Impl oneMeRoomDatabase_Impl;
        switch (this.a) {
            case 0:
                drd drdVar = this.b;
                hq9 hq9Var = drdVar.d;
                oneMeRoomDatabase_Impl = drdVar.a;
                vk6 vk6VarA = hq9Var.a();
                try {
                    oneMeRoomDatabase_Impl.c();
                    try {
                        vk6VarA.w();
                        oneMeRoomDatabase_Impl.q();
                        hq9Var.r(vk6VarA);
                        return qqg.a;
                    } finally {
                    }
                } catch (Throwable th) {
                    hq9Var.r(vk6VarA);
                    throw th;
                }
            default:
                drd drdVar2 = this.b;
                crd crdVar = drdVar2.f;
                oneMeRoomDatabase_Impl = drdVar2.a;
                vk6 vk6VarA2 = crdVar.a();
                try {
                    oneMeRoomDatabase_Impl.c();
                    try {
                        vk6VarA2.w();
                        oneMeRoomDatabase_Impl.q();
                        crdVar.r(vk6VarA2);
                        return qqg.a;
                    } finally {
                    }
                } catch (Throwable th2) {
                    crdVar.r(vk6VarA2);
                    throw th2;
                }
        }
    }
}
