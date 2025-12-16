package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import one.me.chatmedia.viewer.VideoWebViewScreen;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class afc implements mi4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;

    public /* synthetic */ afc(long j, long j2, String str) {
        this.b = j;
        this.d = j2;
        this.c = str;
    }

    @Override // defpackage.mi4
    public final Object a() {
        hec hecVar;
        switch (this.a) {
            case 0:
                Iterator it = hec.o.iterator();
                do {
                    f2 f2Var = (f2) it;
                    if (!f2Var.hasNext()) {
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    hecVar = (hec) f2Var.next();
                } while (!hecVar.a.equals(this.c));
                return new ProfileEditAdminPermissionsWidget(this.b, this.d, hecVar);
            default:
                return new VideoWebViewScreen(this.b, this.c, this.d);
        }
    }

    public /* synthetic */ afc(long j, String str, long j2) {
        this.b = j;
        this.c = str;
        this.d = j2;
    }
}
