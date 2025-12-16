package ru.ok.tamtam.android.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.bwf;
import defpackage.c6i;
import defpackage.cm6;
import defpackage.hd5;
import defpackage.jhe;
import defpackage.lhe;
import defpackage.me9;
import defpackage.wqi;
import defpackage.y4e;
import defpackage.y7b;
import kotlin.Metadata;
import ru.ok.tamtam.android.services.NotificationTamService;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/tamtam/android/services/NotificationTamService;", "Landroid/app/Service;", "<init>", "()V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NotificationTamService extends Service {
    public static final /* synthetic */ int v0 = 0;
    public final bwf X;
    public final bwf Y;
    public final bwf Z;
    public y4e a;
    public final bwf b;
    public final bwf c;
    public final bwf d;
    public final bwf o;
    public final bwf s0;
    public final bwf t0;
    public final bwf u0;

    public NotificationTamService() {
        final int i = 0;
        this.b = new bwf(new cm6(this) { // from class: jna
            public final /* synthetic */ NotificationTamService b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        y4e y4eVar = this.b.a;
                        if (y4eVar == null) {
                            y4eVar = null;
                        }
                        return y4eVar.h();
                    case 1:
                        NotificationTamService notificationTamService = this.b;
                        y4e y4eVar2 = notificationTamService.a;
                        if (y4eVar2 == null) {
                            y4eVar2 = null;
                        }
                        z74 z74VarB = ((q2b) y4eVar2.j()).b();
                        y4e y4eVar3 = notificationTamService.a;
                        return d7j.a(z74VarB.plus((a84) (y4eVar3 != null ? y4eVar3 : null).getAccessor().c(84)).plus(zk6.a()));
                    case 2:
                        y4e y4eVar4 = this.b.a;
                        if (y4eVar4 == null) {
                            y4eVar4 = null;
                        }
                        return (y7b) y4eVar4.f().f.getValue();
                    case 3:
                        y4e y4eVar5 = this.b.a;
                        if (y4eVar5 == null) {
                            y4eVar5 = null;
                        }
                        return y4eVar5.c();
                    case 4:
                        y4e y4eVar6 = this.b.a;
                        if (y4eVar6 == null) {
                            y4eVar6 = null;
                        }
                        return ((ie4) y4eVar6.getAccessor().c(189)).b;
                    case 5:
                        y4e y4eVar7 = this.b.a;
                        if (y4eVar7 == null) {
                            y4eVar7 = null;
                        }
                        return (nxg) y4eVar7.getAccessor().c(122);
                    case 6:
                        y4e y4eVar8 = this.b.a;
                        if (y4eVar8 == null) {
                            y4eVar8 = null;
                        }
                        return (abd) y4eVar8.getAccessor().c(252);
                    case 7:
                        y4e y4eVar9 = this.b.a;
                        if (y4eVar9 == null) {
                            y4eVar9 = null;
                        }
                        return (qpa) y4eVar9.f().h.getValue();
                    case 8:
                        y4e y4eVar10 = this.b.a;
                        if (y4eVar10 == null) {
                            y4eVar10 = null;
                        }
                        return (iw9) y4eVar10.f().i.d.getValue();
                    default:
                        y4e y4eVar11 = this.b.a;
                        if (y4eVar11 == null) {
                            y4eVar11 = null;
                        }
                        return (loa) y4eVar11.f().g.getValue();
                }
            }
        });
        final int i2 = 1;
        this.c = new bwf(new cm6(this) { // from class: jna
            public final /* synthetic */ NotificationTamService b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        y4e y4eVar = this.b.a;
                        if (y4eVar == null) {
                            y4eVar = null;
                        }
                        return y4eVar.h();
                    case 1:
                        NotificationTamService notificationTamService = this.b;
                        y4e y4eVar2 = notificationTamService.a;
                        if (y4eVar2 == null) {
                            y4eVar2 = null;
                        }
                        z74 z74VarB = ((q2b) y4eVar2.j()).b();
                        y4e y4eVar3 = notificationTamService.a;
                        return d7j.a(z74VarB.plus((a84) (y4eVar3 != null ? y4eVar3 : null).getAccessor().c(84)).plus(zk6.a()));
                    case 2:
                        y4e y4eVar4 = this.b.a;
                        if (y4eVar4 == null) {
                            y4eVar4 = null;
                        }
                        return (y7b) y4eVar4.f().f.getValue();
                    case 3:
                        y4e y4eVar5 = this.b.a;
                        if (y4eVar5 == null) {
                            y4eVar5 = null;
                        }
                        return y4eVar5.c();
                    case 4:
                        y4e y4eVar6 = this.b.a;
                        if (y4eVar6 == null) {
                            y4eVar6 = null;
                        }
                        return ((ie4) y4eVar6.getAccessor().c(189)).b;
                    case 5:
                        y4e y4eVar7 = this.b.a;
                        if (y4eVar7 == null) {
                            y4eVar7 = null;
                        }
                        return (nxg) y4eVar7.getAccessor().c(122);
                    case 6:
                        y4e y4eVar8 = this.b.a;
                        if (y4eVar8 == null) {
                            y4eVar8 = null;
                        }
                        return (abd) y4eVar8.getAccessor().c(252);
                    case 7:
                        y4e y4eVar9 = this.b.a;
                        if (y4eVar9 == null) {
                            y4eVar9 = null;
                        }
                        return (qpa) y4eVar9.f().h.getValue();
                    case 8:
                        y4e y4eVar10 = this.b.a;
                        if (y4eVar10 == null) {
                            y4eVar10 = null;
                        }
                        return (iw9) y4eVar10.f().i.d.getValue();
                    default:
                        y4e y4eVar11 = this.b.a;
                        if (y4eVar11 == null) {
                            y4eVar11 = null;
                        }
                        return (loa) y4eVar11.f().g.getValue();
                }
            }
        });
        final int i3 = 2;
        this.d = new bwf(new cm6(this) { // from class: jna
            public final /* synthetic */ NotificationTamService b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        y4e y4eVar = this.b.a;
                        if (y4eVar == null) {
                            y4eVar = null;
                        }
                        return y4eVar.h();
                    case 1:
                        NotificationTamService notificationTamService = this.b;
                        y4e y4eVar2 = notificationTamService.a;
                        if (y4eVar2 == null) {
                            y4eVar2 = null;
                        }
                        z74 z74VarB = ((q2b) y4eVar2.j()).b();
                        y4e y4eVar3 = notificationTamService.a;
                        return d7j.a(z74VarB.plus((a84) (y4eVar3 != null ? y4eVar3 : null).getAccessor().c(84)).plus(zk6.a()));
                    case 2:
                        y4e y4eVar4 = this.b.a;
                        if (y4eVar4 == null) {
                            y4eVar4 = null;
                        }
                        return (y7b) y4eVar4.f().f.getValue();
                    case 3:
                        y4e y4eVar5 = this.b.a;
                        if (y4eVar5 == null) {
                            y4eVar5 = null;
                        }
                        return y4eVar5.c();
                    case 4:
                        y4e y4eVar6 = this.b.a;
                        if (y4eVar6 == null) {
                            y4eVar6 = null;
                        }
                        return ((ie4) y4eVar6.getAccessor().c(189)).b;
                    case 5:
                        y4e y4eVar7 = this.b.a;
                        if (y4eVar7 == null) {
                            y4eVar7 = null;
                        }
                        return (nxg) y4eVar7.getAccessor().c(122);
                    case 6:
                        y4e y4eVar8 = this.b.a;
                        if (y4eVar8 == null) {
                            y4eVar8 = null;
                        }
                        return (abd) y4eVar8.getAccessor().c(252);
                    case 7:
                        y4e y4eVar9 = this.b.a;
                        if (y4eVar9 == null) {
                            y4eVar9 = null;
                        }
                        return (qpa) y4eVar9.f().h.getValue();
                    case 8:
                        y4e y4eVar10 = this.b.a;
                        if (y4eVar10 == null) {
                            y4eVar10 = null;
                        }
                        return (iw9) y4eVar10.f().i.d.getValue();
                    default:
                        y4e y4eVar11 = this.b.a;
                        if (y4eVar11 == null) {
                            y4eVar11 = null;
                        }
                        return (loa) y4eVar11.f().g.getValue();
                }
            }
        });
        final int i4 = 3;
        this.o = new bwf(new cm6(this) { // from class: jna
            public final /* synthetic */ NotificationTamService b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        y4e y4eVar = this.b.a;
                        if (y4eVar == null) {
                            y4eVar = null;
                        }
                        return y4eVar.h();
                    case 1:
                        NotificationTamService notificationTamService = this.b;
                        y4e y4eVar2 = notificationTamService.a;
                        if (y4eVar2 == null) {
                            y4eVar2 = null;
                        }
                        z74 z74VarB = ((q2b) y4eVar2.j()).b();
                        y4e y4eVar3 = notificationTamService.a;
                        return d7j.a(z74VarB.plus((a84) (y4eVar3 != null ? y4eVar3 : null).getAccessor().c(84)).plus(zk6.a()));
                    case 2:
                        y4e y4eVar4 = this.b.a;
                        if (y4eVar4 == null) {
                            y4eVar4 = null;
                        }
                        return (y7b) y4eVar4.f().f.getValue();
                    case 3:
                        y4e y4eVar5 = this.b.a;
                        if (y4eVar5 == null) {
                            y4eVar5 = null;
                        }
                        return y4eVar5.c();
                    case 4:
                        y4e y4eVar6 = this.b.a;
                        if (y4eVar6 == null) {
                            y4eVar6 = null;
                        }
                        return ((ie4) y4eVar6.getAccessor().c(189)).b;
                    case 5:
                        y4e y4eVar7 = this.b.a;
                        if (y4eVar7 == null) {
                            y4eVar7 = null;
                        }
                        return (nxg) y4eVar7.getAccessor().c(122);
                    case 6:
                        y4e y4eVar8 = this.b.a;
                        if (y4eVar8 == null) {
                            y4eVar8 = null;
                        }
                        return (abd) y4eVar8.getAccessor().c(252);
                    case 7:
                        y4e y4eVar9 = this.b.a;
                        if (y4eVar9 == null) {
                            y4eVar9 = null;
                        }
                        return (qpa) y4eVar9.f().h.getValue();
                    case 8:
                        y4e y4eVar10 = this.b.a;
                        if (y4eVar10 == null) {
                            y4eVar10 = null;
                        }
                        return (iw9) y4eVar10.f().i.d.getValue();
                    default:
                        y4e y4eVar11 = this.b.a;
                        if (y4eVar11 == null) {
                            y4eVar11 = null;
                        }
                        return (loa) y4eVar11.f().g.getValue();
                }
            }
        });
        final int i5 = 4;
        this.X = new bwf(new cm6(this) { // from class: jna
            public final /* synthetic */ NotificationTamService b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        y4e y4eVar = this.b.a;
                        if (y4eVar == null) {
                            y4eVar = null;
                        }
                        return y4eVar.h();
                    case 1:
                        NotificationTamService notificationTamService = this.b;
                        y4e y4eVar2 = notificationTamService.a;
                        if (y4eVar2 == null) {
                            y4eVar2 = null;
                        }
                        z74 z74VarB = ((q2b) y4eVar2.j()).b();
                        y4e y4eVar3 = notificationTamService.a;
                        return d7j.a(z74VarB.plus((a84) (y4eVar3 != null ? y4eVar3 : null).getAccessor().c(84)).plus(zk6.a()));
                    case 2:
                        y4e y4eVar4 = this.b.a;
                        if (y4eVar4 == null) {
                            y4eVar4 = null;
                        }
                        return (y7b) y4eVar4.f().f.getValue();
                    case 3:
                        y4e y4eVar5 = this.b.a;
                        if (y4eVar5 == null) {
                            y4eVar5 = null;
                        }
                        return y4eVar5.c();
                    case 4:
                        y4e y4eVar6 = this.b.a;
                        if (y4eVar6 == null) {
                            y4eVar6 = null;
                        }
                        return ((ie4) y4eVar6.getAccessor().c(189)).b;
                    case 5:
                        y4e y4eVar7 = this.b.a;
                        if (y4eVar7 == null) {
                            y4eVar7 = null;
                        }
                        return (nxg) y4eVar7.getAccessor().c(122);
                    case 6:
                        y4e y4eVar8 = this.b.a;
                        if (y4eVar8 == null) {
                            y4eVar8 = null;
                        }
                        return (abd) y4eVar8.getAccessor().c(252);
                    case 7:
                        y4e y4eVar9 = this.b.a;
                        if (y4eVar9 == null) {
                            y4eVar9 = null;
                        }
                        return (qpa) y4eVar9.f().h.getValue();
                    case 8:
                        y4e y4eVar10 = this.b.a;
                        if (y4eVar10 == null) {
                            y4eVar10 = null;
                        }
                        return (iw9) y4eVar10.f().i.d.getValue();
                    default:
                        y4e y4eVar11 = this.b.a;
                        if (y4eVar11 == null) {
                            y4eVar11 = null;
                        }
                        return (loa) y4eVar11.f().g.getValue();
                }
            }
        });
        final int i6 = 5;
        this.Y = new bwf(new cm6(this) { // from class: jna
            public final /* synthetic */ NotificationTamService b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        y4e y4eVar = this.b.a;
                        if (y4eVar == null) {
                            y4eVar = null;
                        }
                        return y4eVar.h();
                    case 1:
                        NotificationTamService notificationTamService = this.b;
                        y4e y4eVar2 = notificationTamService.a;
                        if (y4eVar2 == null) {
                            y4eVar2 = null;
                        }
                        z74 z74VarB = ((q2b) y4eVar2.j()).b();
                        y4e y4eVar3 = notificationTamService.a;
                        return d7j.a(z74VarB.plus((a84) (y4eVar3 != null ? y4eVar3 : null).getAccessor().c(84)).plus(zk6.a()));
                    case 2:
                        y4e y4eVar4 = this.b.a;
                        if (y4eVar4 == null) {
                            y4eVar4 = null;
                        }
                        return (y7b) y4eVar4.f().f.getValue();
                    case 3:
                        y4e y4eVar5 = this.b.a;
                        if (y4eVar5 == null) {
                            y4eVar5 = null;
                        }
                        return y4eVar5.c();
                    case 4:
                        y4e y4eVar6 = this.b.a;
                        if (y4eVar6 == null) {
                            y4eVar6 = null;
                        }
                        return ((ie4) y4eVar6.getAccessor().c(189)).b;
                    case 5:
                        y4e y4eVar7 = this.b.a;
                        if (y4eVar7 == null) {
                            y4eVar7 = null;
                        }
                        return (nxg) y4eVar7.getAccessor().c(122);
                    case 6:
                        y4e y4eVar8 = this.b.a;
                        if (y4eVar8 == null) {
                            y4eVar8 = null;
                        }
                        return (abd) y4eVar8.getAccessor().c(252);
                    case 7:
                        y4e y4eVar9 = this.b.a;
                        if (y4eVar9 == null) {
                            y4eVar9 = null;
                        }
                        return (qpa) y4eVar9.f().h.getValue();
                    case 8:
                        y4e y4eVar10 = this.b.a;
                        if (y4eVar10 == null) {
                            y4eVar10 = null;
                        }
                        return (iw9) y4eVar10.f().i.d.getValue();
                    default:
                        y4e y4eVar11 = this.b.a;
                        if (y4eVar11 == null) {
                            y4eVar11 = null;
                        }
                        return (loa) y4eVar11.f().g.getValue();
                }
            }
        });
        final int i7 = 6;
        this.Z = new bwf(new cm6(this) { // from class: jna
            public final /* synthetic */ NotificationTamService b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        y4e y4eVar = this.b.a;
                        if (y4eVar == null) {
                            y4eVar = null;
                        }
                        return y4eVar.h();
                    case 1:
                        NotificationTamService notificationTamService = this.b;
                        y4e y4eVar2 = notificationTamService.a;
                        if (y4eVar2 == null) {
                            y4eVar2 = null;
                        }
                        z74 z74VarB = ((q2b) y4eVar2.j()).b();
                        y4e y4eVar3 = notificationTamService.a;
                        return d7j.a(z74VarB.plus((a84) (y4eVar3 != null ? y4eVar3 : null).getAccessor().c(84)).plus(zk6.a()));
                    case 2:
                        y4e y4eVar4 = this.b.a;
                        if (y4eVar4 == null) {
                            y4eVar4 = null;
                        }
                        return (y7b) y4eVar4.f().f.getValue();
                    case 3:
                        y4e y4eVar5 = this.b.a;
                        if (y4eVar5 == null) {
                            y4eVar5 = null;
                        }
                        return y4eVar5.c();
                    case 4:
                        y4e y4eVar6 = this.b.a;
                        if (y4eVar6 == null) {
                            y4eVar6 = null;
                        }
                        return ((ie4) y4eVar6.getAccessor().c(189)).b;
                    case 5:
                        y4e y4eVar7 = this.b.a;
                        if (y4eVar7 == null) {
                            y4eVar7 = null;
                        }
                        return (nxg) y4eVar7.getAccessor().c(122);
                    case 6:
                        y4e y4eVar8 = this.b.a;
                        if (y4eVar8 == null) {
                            y4eVar8 = null;
                        }
                        return (abd) y4eVar8.getAccessor().c(252);
                    case 7:
                        y4e y4eVar9 = this.b.a;
                        if (y4eVar9 == null) {
                            y4eVar9 = null;
                        }
                        return (qpa) y4eVar9.f().h.getValue();
                    case 8:
                        y4e y4eVar10 = this.b.a;
                        if (y4eVar10 == null) {
                            y4eVar10 = null;
                        }
                        return (iw9) y4eVar10.f().i.d.getValue();
                    default:
                        y4e y4eVar11 = this.b.a;
                        if (y4eVar11 == null) {
                            y4eVar11 = null;
                        }
                        return (loa) y4eVar11.f().g.getValue();
                }
            }
        });
        final int i8 = 7;
        this.s0 = new bwf(new cm6(this) { // from class: jna
            public final /* synthetic */ NotificationTamService b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i8) {
                    case 0:
                        y4e y4eVar = this.b.a;
                        if (y4eVar == null) {
                            y4eVar = null;
                        }
                        return y4eVar.h();
                    case 1:
                        NotificationTamService notificationTamService = this.b;
                        y4e y4eVar2 = notificationTamService.a;
                        if (y4eVar2 == null) {
                            y4eVar2 = null;
                        }
                        z74 z74VarB = ((q2b) y4eVar2.j()).b();
                        y4e y4eVar3 = notificationTamService.a;
                        return d7j.a(z74VarB.plus((a84) (y4eVar3 != null ? y4eVar3 : null).getAccessor().c(84)).plus(zk6.a()));
                    case 2:
                        y4e y4eVar4 = this.b.a;
                        if (y4eVar4 == null) {
                            y4eVar4 = null;
                        }
                        return (y7b) y4eVar4.f().f.getValue();
                    case 3:
                        y4e y4eVar5 = this.b.a;
                        if (y4eVar5 == null) {
                            y4eVar5 = null;
                        }
                        return y4eVar5.c();
                    case 4:
                        y4e y4eVar6 = this.b.a;
                        if (y4eVar6 == null) {
                            y4eVar6 = null;
                        }
                        return ((ie4) y4eVar6.getAccessor().c(189)).b;
                    case 5:
                        y4e y4eVar7 = this.b.a;
                        if (y4eVar7 == null) {
                            y4eVar7 = null;
                        }
                        return (nxg) y4eVar7.getAccessor().c(122);
                    case 6:
                        y4e y4eVar8 = this.b.a;
                        if (y4eVar8 == null) {
                            y4eVar8 = null;
                        }
                        return (abd) y4eVar8.getAccessor().c(252);
                    case 7:
                        y4e y4eVar9 = this.b.a;
                        if (y4eVar9 == null) {
                            y4eVar9 = null;
                        }
                        return (qpa) y4eVar9.f().h.getValue();
                    case 8:
                        y4e y4eVar10 = this.b.a;
                        if (y4eVar10 == null) {
                            y4eVar10 = null;
                        }
                        return (iw9) y4eVar10.f().i.d.getValue();
                    default:
                        y4e y4eVar11 = this.b.a;
                        if (y4eVar11 == null) {
                            y4eVar11 = null;
                        }
                        return (loa) y4eVar11.f().g.getValue();
                }
            }
        });
        final int i9 = 8;
        this.t0 = new bwf(new cm6(this) { // from class: jna
            public final /* synthetic */ NotificationTamService b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        y4e y4eVar = this.b.a;
                        if (y4eVar == null) {
                            y4eVar = null;
                        }
                        return y4eVar.h();
                    case 1:
                        NotificationTamService notificationTamService = this.b;
                        y4e y4eVar2 = notificationTamService.a;
                        if (y4eVar2 == null) {
                            y4eVar2 = null;
                        }
                        z74 z74VarB = ((q2b) y4eVar2.j()).b();
                        y4e y4eVar3 = notificationTamService.a;
                        return d7j.a(z74VarB.plus((a84) (y4eVar3 != null ? y4eVar3 : null).getAccessor().c(84)).plus(zk6.a()));
                    case 2:
                        y4e y4eVar4 = this.b.a;
                        if (y4eVar4 == null) {
                            y4eVar4 = null;
                        }
                        return (y7b) y4eVar4.f().f.getValue();
                    case 3:
                        y4e y4eVar5 = this.b.a;
                        if (y4eVar5 == null) {
                            y4eVar5 = null;
                        }
                        return y4eVar5.c();
                    case 4:
                        y4e y4eVar6 = this.b.a;
                        if (y4eVar6 == null) {
                            y4eVar6 = null;
                        }
                        return ((ie4) y4eVar6.getAccessor().c(189)).b;
                    case 5:
                        y4e y4eVar7 = this.b.a;
                        if (y4eVar7 == null) {
                            y4eVar7 = null;
                        }
                        return (nxg) y4eVar7.getAccessor().c(122);
                    case 6:
                        y4e y4eVar8 = this.b.a;
                        if (y4eVar8 == null) {
                            y4eVar8 = null;
                        }
                        return (abd) y4eVar8.getAccessor().c(252);
                    case 7:
                        y4e y4eVar9 = this.b.a;
                        if (y4eVar9 == null) {
                            y4eVar9 = null;
                        }
                        return (qpa) y4eVar9.f().h.getValue();
                    case 8:
                        y4e y4eVar10 = this.b.a;
                        if (y4eVar10 == null) {
                            y4eVar10 = null;
                        }
                        return (iw9) y4eVar10.f().i.d.getValue();
                    default:
                        y4e y4eVar11 = this.b.a;
                        if (y4eVar11 == null) {
                            y4eVar11 = null;
                        }
                        return (loa) y4eVar11.f().g.getValue();
                }
            }
        });
        final int i10 = 9;
        this.u0 = new bwf(new cm6(this) { // from class: jna
            public final /* synthetic */ NotificationTamService b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        y4e y4eVar = this.b.a;
                        if (y4eVar == null) {
                            y4eVar = null;
                        }
                        return y4eVar.h();
                    case 1:
                        NotificationTamService notificationTamService = this.b;
                        y4e y4eVar2 = notificationTamService.a;
                        if (y4eVar2 == null) {
                            y4eVar2 = null;
                        }
                        z74 z74VarB = ((q2b) y4eVar2.j()).b();
                        y4e y4eVar3 = notificationTamService.a;
                        return d7j.a(z74VarB.plus((a84) (y4eVar3 != null ? y4eVar3 : null).getAccessor().c(84)).plus(zk6.a()));
                    case 2:
                        y4e y4eVar4 = this.b.a;
                        if (y4eVar4 == null) {
                            y4eVar4 = null;
                        }
                        return (y7b) y4eVar4.f().f.getValue();
                    case 3:
                        y4e y4eVar5 = this.b.a;
                        if (y4eVar5 == null) {
                            y4eVar5 = null;
                        }
                        return y4eVar5.c();
                    case 4:
                        y4e y4eVar6 = this.b.a;
                        if (y4eVar6 == null) {
                            y4eVar6 = null;
                        }
                        return ((ie4) y4eVar6.getAccessor().c(189)).b;
                    case 5:
                        y4e y4eVar7 = this.b.a;
                        if (y4eVar7 == null) {
                            y4eVar7 = null;
                        }
                        return (nxg) y4eVar7.getAccessor().c(122);
                    case 6:
                        y4e y4eVar8 = this.b.a;
                        if (y4eVar8 == null) {
                            y4eVar8 = null;
                        }
                        return (abd) y4eVar8.getAccessor().c(252);
                    case 7:
                        y4e y4eVar9 = this.b.a;
                        if (y4eVar9 == null) {
                            y4eVar9 = null;
                        }
                        return (qpa) y4eVar9.f().h.getValue();
                    case 8:
                        y4e y4eVar10 = this.b.a;
                        if (y4eVar10 == null) {
                            y4eVar10 = null;
                        }
                        return (iw9) y4eVar10.f().i.d.getValue();
                    default:
                        y4e y4eVar11 = this.b.a;
                        if (y4eVar11 == null) {
                            y4eVar11 = null;
                        }
                        return (loa) y4eVar11.f().g.getValue();
                }
            }
        });
    }

    public static final void a(long j, NotificationTamService notificationTamService, CharSequence charSequence, long j2) {
        bwf bwfVar = notificationTamService.d;
        if (j2 == 0) {
            wqi.f("ru.ok.tamtam.android.services.NotificationTamService", "directReply: failed to send message, no chat in cache for chatServerId=%d", Long.valueOf(j));
            ((y7b) bwfVar.getValue()).a(j);
            return;
        }
        lhe lheVar = new lhe(new jhe(j2, charSequence.toString(), true, hd5.a));
        y4e y4eVar = notificationTamService.a;
        if (y4eVar == null) {
            y4eVar = null;
        }
        ((c6i) y4eVar.getAccessor().c(186)).b(lheVar);
        ((y7b) bwfVar.getValue()).a(j);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.a = me9.b(getApplicationContext());
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        wqi.c("ru.ok.tamtam.android.services.NotificationTamService", "onDestroy", new Object[0]);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0187 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v5, types: [i84, x74] */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int onStartCommand(android.content.Intent r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.android.services.NotificationTamService.onStartCommand(android.content.Intent, int, int):int");
    }
}
