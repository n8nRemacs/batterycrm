package defpackage;

import android.graphics.Point;
import android.net.Uri;
import android.util.Pair;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.notifications.settings.NotificationsSettingsScreen;
import one.me.profile.ProfileScreen;
import one.me.profile.screens.invite.ProfileInviteScreen;
import one.me.profileedit.ProfileEditScreen;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.profileedit.screens.memberpermissions.ProfileMemberPermissionsScreen;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import org.webrtc.StatsObserver;
import org.webrtc.audio.JavaAudioDeviceModule;
import ru.ok.android.externcalls.sdk.settings.RemoteSettingsImpl;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class z9a implements gu3, w2f, kf7, b9e, uu1, tm6, o44, sk3, es8, usa, ewd, StatsObserver, dcb, yu {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ z9a(x74 x74Var, sm6 sm6Var) {
        this.a = 16;
        this.b = x74Var;
        this.c = (dtf) sm6Var;
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                eaa eaaVar = (eaa) this.b;
                File file = (File) this.c;
                eaaVar.c.Y((Uri) obj, file, null);
                break;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                rve rveVar = (rve) this.b;
                String str = (String) this.c;
                JavaAudioDeviceModule javaAudioDeviceModule = rveVar.g;
                if (javaAudioDeviceModule != null) {
                    a9h.o("Restart audio recording after error: ", str, rveVar.b, "SharedPeerConnectionFac");
                    javaAudioDeviceModule.restartAudioRecording(true);
                    break;
                }
                break;
            default:
                zva zvaVar = (zva) this.b;
                eaj eajVar = (eaj) this.c;
                Throwable th = (Throwable) obj;
                ((y3b) ((yi5) ((k18) zvaVar.d).getValue())).a(new IllegalStateException("Can't load emoji font", th));
                eajVar.a(th);
                break;
        }
    }

    @Override // defpackage.tm6
    public ha8 apply(Object obj) {
        awf awfVar = (awf) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        List list = (List) obj;
        gri.a("SyncCaptureSessionBase", "[" + awfVar + "] getSurface done with results: " + list);
        return list.isEmpty() ? new ag7(1, new IllegalArgumentException("Unable to open capture session without surfaces")) : list.contains(null) ? new ag7(1, new DeferrableSurface$SurfaceClosedException("Surface closed", (zr4) arrayList.get(list.indexOf(null)))) : wsf.f(list);
    }

    @Override // defpackage.es8
    public void b(rr8 rr8Var) {
        x74 x74Var = (x74) this.b;
        wzf wzfVar = (wzf) this.c;
        x74 x74VarA = z6j.a(bd5.a, x74Var, true);
        ep4 ep4Var = gy4.a;
        if (x74VarA != ep4Var && x74VarA.get(jbe.t0) == null) {
            x74VarA = x74VarA.plus(ep4Var);
        }
        wvd wvdVar = new wvd(x74VarA, rr8Var, 1);
        ty4.g(rr8Var, new n42(new vvd(wvdVar)));
        wvdVar.start(i84.a, wvdVar, wzfVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [dtf, sm6] */
    @Override // defpackage.sk3
    public void c(jk3 jk3Var) {
        x74 x74Var = (x74) this.b;
        ?? r1 = (dtf) this.c;
        x74 x74VarA = z6j.a(bd5.a, x74Var, true);
        ep4 ep4Var = gy4.a;
        if (x74VarA != ep4Var && x74VarA.get(jbe.t0) == null) {
            x74VarA = x74VarA.plus(ep4Var);
        }
        wvd wvdVar = new wvd(x74VarA, jk3Var, 0);
        ty4.g(jk3Var, new n42(new vvd(wvdVar)));
        wvdVar.start(i84.a, wvdVar, r1);
    }

    @Override // defpackage.kf7
    public void d(lf7 lf7Var) {
        switch (this.a) {
            case 2:
                xo8 xo8Var = (xo8) this.b;
                kf7 kf7Var = (kf7) this.c;
                xo8Var.getClass();
                kf7Var.d(xo8Var);
                break;
            default:
                ov8 ov8Var = (ov8) this.b;
                kf7 kf7Var2 = (kf7) this.c;
                ov8Var.getClass();
                kf7Var2.d(ov8Var);
                break;
        }
    }

    @Override // defpackage.usa
    public void e(ira iraVar) {
        String[] strArr = (String[]) this.b;
        lrd lrdVar = (lrd) this.c;
        n84 n84Var = new n84(strArr, iraVar, 2);
        lrdVar.e.a(n84Var);
        ty4.g(iraVar, new z6(0, new v64(lrdVar, 8, n84Var)));
        iraVar.d(yfi.a);
    }

    @Override // defpackage.b9e
    public int g(int i) {
        int i2 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i2) {
            case 3:
                noa noaVar = ((NotificationsSettingsScreen) obj).o;
                phd adapter = ((EndlessRecyclerView2) obj2).getAdapter();
                zm3 zm3Var = adapter instanceof zm3 ? (zm3) adapter : null;
                if (zm3Var != null) {
                    Pair pairD = zm3Var.D(i);
                    Integer num = pairD.first instanceof noa ? (Integer) pairD.second : -1;
                    int iJ = noaVar.j();
                    int iIntValue = num.intValue();
                    if (iIntValue >= 0 && iIntValue < iJ) {
                        foa foaVar = (foa) ((t98) noaVar.C(num.intValue()));
                        t98 t98VarG = noaVar.G(num.intValue() - 1);
                        foa foaVar2 = t98VarG instanceof foa ? (foa) t98VarG : null;
                        t98 t98VarG2 = noaVar.G(num.intValue() + 1);
                        foa foaVar3 = t98VarG2 instanceof foa ? (foa) t98VarG2 : null;
                        if (foaVar.g()) {
                            if ((foaVar2 != null && foaVar.t() == foaVar2.t()) || (foaVar3 != null && foaVar.t() == foaVar3.t())) {
                                if (foaVar2 != null && foaVar.t() == foaVar2.t() && (foaVar.t() != foaVar2.t() || foaVar2.g())) {
                                    if (foaVar3 != null && foaVar.t() == foaVar3.t()) {
                                        break;
                                    } else {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 4:
            case 5:
            case 6:
            default:
                yy7[] yy7VarArr = ProfileScreen.C0;
                int k0 = ((mjc) ((t98) ((amc) ((EndlessRecyclerView2) obj2).getAdapter()).C(i))).getK0();
                if (!((i8a) obj).d(k0 & 268435455)) {
                    if ((k0 & 536870912) == 0) {
                        if ((k0 & 1073741824) == 0) {
                            if ((k0 & Integer.MIN_VALUE) != 0) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 7:
                int k02 = ((qfc) ((t98) ((ProfileEditAdminPermissionsWidget) obj2).X.C(i))).getK0();
                if (!((i8a) obj).d(k02 & 536870911)) {
                    if ((k02 & 536870912) == 0) {
                        if ((k02 & 1073741824) == 0) {
                            if ((k02 & Integer.MIN_VALUE) != 0) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 8:
                int k03 = ((qfc) ((t98) ((ProfileEditScreen) obj2).o.C(i))).getK0();
                if (!((i8a) obj).d(k03 & 536870911)) {
                    if ((k03 & 536870912) == 0) {
                        if ((k03 & 1073741824) == 0) {
                            if ((k03 & Integer.MIN_VALUE) != 0) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 9:
                int k04 = ((mjc) ((t98) ((ProfileInviteScreen) obj2).d.C(i))).getK0();
                if (!((i8a) obj).d(k04 & 268435455)) {
                    if ((k04 & 536870912) == 0) {
                        if ((k04 & 1073741824) == 0) {
                            if ((k04 & Integer.MIN_VALUE) != 0) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 10:
                int k05 = ((qfc) ((t98) ((ProfileMemberPermissionsScreen) obj2).c.C(i))).getK0();
                if (!((i8a) obj).d(k05 & 536870911)) {
                    if ((k05 & 536870912) == 0) {
                        if ((k05 & 1073741824) == 0) {
                            if ((k05 & Integer.MIN_VALUE) != 0) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return 3;
    }

    @Override // defpackage.w2f
    public void i(i2f i2fVar) {
        b4a b4aVar;
        p2h p2hVar;
        switch (this.a) {
            case 1:
                iaa iaaVar = (iaa) this.b;
                pd8 pd8Var = (pd8) this.c;
                fce fceVarH = iaaVar.o.h(pd8Var);
                j16 j16VarE = zpi.e(iaaVar.d, xpi.q(pd8Var.a()));
                Point point = (Point) j16VarE.e;
                if (fceVarH == null || (p2hVar = fceVarH.b) == null) {
                    b4aVar = new b4a(0L, j16VarE.b, Collections.singletonList(new z3a(point.x, pd8Var.a(), point.y, j16VarE.c)), false);
                } else {
                    boolean z = p2hVar.d;
                    String strA = pd8Var.a();
                    int i = point.x;
                    int i2 = point.y;
                    int i3 = j16VarE.c;
                    p2h p2hVar2 = fceVarH.b;
                    float f = p2hVar2.b;
                    float f2 = j16VarE.b;
                    b4aVar = new yig(strA, i, i2, i3, (long) (f * f2), (long) (p2hVar2.c * f2), z);
                }
                i2fVar.a(b4aVar);
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                RemoteSettingsImpl.get$lambda$1((String) this.b, (RemoteSettingsImpl) this.c, i2fVar);
                break;
            case 19:
                x74 x74Var = (x74) this.b;
                bz5 bz5Var = (bz5) this.c;
                x74 x74VarA = z6j.a(bd5.a, x74Var, true);
                ep4 ep4Var = gy4.a;
                if (x74VarA != ep4Var && x74VarA.get(jbe.t0) == null) {
                    x74VarA = x74VarA.plus(ep4Var);
                }
                wvd wvdVar = new wvd(x74VarA, i2fVar, 2);
                ty4.g(i2fVar, new n42(new vvd(wvdVar)));
                wvdVar.start(i84.a, wvdVar, bz5Var);
                break;
            default:
                u0g u0gVar = (u0g) this.b;
                n2 n2Var = (n2) this.c;
                s0g s0gVar = new s0g(i2fVar);
                k18 k18Var = u0gVar.v0;
                ((w0g) k18Var.getValue()).c(false);
                nud nudVar = new nud(4, s0gVar);
                w0g w0gVar = (w0g) k18Var.getValue();
                long jC = u0gVar.c(n2Var);
                zhe zheVar = (zhe) w0gVar.X.get();
                if (zheVar != null) {
                    zheVar.k(n2Var, false, jC, nudVar);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.dcb
    public void l(ecb ecbVar) {
        uye uyeVar = (uye) this.b;
        da1 da1Var = (da1) this.c;
        uyeVar.invoke();
        int i = a6f.$EnumSwitchMapping$0[ecbVar.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            da1Var.invoke();
        }
    }

    @Override // defpackage.uu1
    public String m(tu1 tu1Var) {
        switch (this.a) {
            case 4:
                mc5 mc5Var = (mc5) this.b;
                Object obj = this.c;
                kmb kmbVar = (kmb) mc5Var.b;
                if (kmbVar != null) {
                    tu1 tu1Var2 = (tu1) kmbVar.a;
                    Objects.requireNonNull(tu1Var2);
                    tu1Var2.c();
                }
                mc5Var.b = new kmb(tu1Var, obj);
                return "PendingValue " + obj;
            case 5:
                l22 l22Var = (l22) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                oy1 oy1Var = new oy1(tu1Var, l22Var);
                arrayList.add(oy1Var);
                l22Var.f(ayi.a(), oy1Var);
                return "waitForCaptureResult";
            case 6:
                w9c w9cVar = (w9c) this.b;
                q32 q32Var = (q32) this.c;
                synchronized (w9cVar.a) {
                    sn6 sn6VarA = sn6.a(ag7.c);
                    xu9 xu9Var = new xu9(16, new i0(8, q32Var));
                    ex4 ex4VarA = ayi.a();
                    sn6VarA.getClass();
                    wsf.b(wsf.l(sn6VarA, xu9Var, ex4VarA), new ssb(tu1Var, 1, q32Var), ayi.a());
                }
                return "ProcessCameraProvider-initializeCameraX";
            default:
                msf msfVar = (msf) this.b;
                ((AtomicReference) this.c).set(tu1Var);
                return "SurfaceRequest-surface-recreation(" + msfVar.hashCode() + ")";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x008d A[SYNTHETIC] */
    @Override // org.webrtc.StatsObserver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onComplete(org.webrtc.StatsReport[] r17) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z9a.onComplete(org.webrtc.StatsReport[]):void");
    }

    @Override // defpackage.o44
    public Object s(Task task) {
        ssb ssbVar = (ssb) this.b;
        String str = (String) this.c;
        synchronized (ssbVar) {
            ((us) ssbVar.c).remove(str);
        }
        return task;
    }

    public /* synthetic */ z9a(u8c u8cVar, l22 l22Var, ArrayList arrayList) {
        this.a = 5;
        this.b = l22Var;
        this.c = arrayList;
    }

    public /* synthetic */ z9a(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab A[Catch: all -> 0x0130, TryCatch #0 {all -> 0x0130, blocks: (B:26:0x00a5, B:28:0x00ab, B:30:0x00bb, B:31:0x00c7), top: B:55:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e5  */
    @Override // defpackage.tm6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object apply(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z9a.apply(java.lang.Object):java.lang.Object");
    }
}
