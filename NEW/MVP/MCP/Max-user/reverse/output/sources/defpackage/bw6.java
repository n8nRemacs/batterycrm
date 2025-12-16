package defpackage;

import android.location.Location;
import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
public final /* synthetic */ class bw6 implements lva, nva {
    public final /* synthetic */ h08 a;

    public /* synthetic */ bw6(h08 h08Var) {
        this.a = h08Var;
    }

    @Override // defpackage.nva
    public void onFailure(Exception exc) {
        ((mf8) this.a.b).E();
    }

    @Override // defpackage.lva
    public void p(Task task) {
        mf8 mf8Var = (mf8) this.a.b;
        if (!task.h() || task.f() == null) {
            mf8Var.E();
        } else {
            Location location = (Location) task.f();
            mf8Var.P(new cf8(location.getLatitude(), location.getLongitude(), location.getAltitude(), location.getAccuracy(), location.getBearing(), location.getSpeed()));
        }
    }
}
