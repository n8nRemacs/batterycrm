package defpackage;

import android.view.View;
import one.me.profile.ProfileScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class xlc implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ amc b;
    public final /* synthetic */ mjc c;

    public /* synthetic */ xlc(mjc mjcVar, amc amcVar) {
        this.c = mjcVar;
        this.b = amcVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                bjc bjcVar = (bjc) this.c;
                zlc zlcVar = this.b.o;
                long j = bjcVar.a.a;
                ((ProfileScreen) zlcVar).getClass();
                kkc.c.M0(j);
                break;
            default:
                zlc zlcVar2 = this.b.o;
                long j2 = ((ejc) this.c).a;
                ProfileScreen profileScreen = (ProfileScreen) zlcVar2;
                profileScreen.getClass();
                String str = "ID #" + j2 + " скопирован в буфер обмена";
                xb3.a.u(new cj(profileScreen.requireActivity(), str, String.valueOf(j2), 15));
                ccb ccbVar = (ccb) fdc.a.getAccessor().d(454).getValue();
                ccbVar.h(str);
                cdb cdbVar = ccbVar.b;
                ccbVar.b = cdb.a(cdbVar, null, null, null, null, kcb.a(cdbVar.o, 2, 0, 0, 6), null, null, 111);
                ccbVar.i();
                break;
        }
    }

    public /* synthetic */ xlc(amc amcVar, mjc mjcVar) {
        this.b = amcVar;
        this.c = mjcVar;
    }
}
