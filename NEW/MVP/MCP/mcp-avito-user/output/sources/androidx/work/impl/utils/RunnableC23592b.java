package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.Y;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.work.impl.utils.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class RunnableC23592b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f55977b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WorkDatabase f55978c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f55979d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Y f55980e;

    public /* synthetic */ RunnableC23592b(WorkDatabase workDatabase, String str, Y y12, int i12) {
        this.f55977b = i12;
        this.f55978c = workDatabase;
        this.f55979d = str;
        this.f55980e = y12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f55977b) {
            case 0:
                Iterator it = this.f55978c.A().p(this.f55979d).iterator();
                while (it.hasNext()) {
                    C23593c.a(this.f55980e, (String) it.next());
                }
                break;
            default:
                Iterator it2 = this.f55978c.A().r(this.f55979d).iterator();
                while (it2.hasNext()) {
                    C23593c.a(this.f55980e, (String) it2.next());
                }
                break;
        }
    }
}
