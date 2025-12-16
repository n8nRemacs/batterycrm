package defpackage;

import android.view.Surface;
import com.my.tracker.applifecycle.o.d;
import com.my.tracker.core.EngineCore;
import com.my.tracker.core.o.k;
import java.io.File;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants;
import ru.ok.tamtam.media.converter.VideoConverterException;

/* loaded from: classes2.dex */
public final /* synthetic */ class r2h implements w2f, he5, EngineCore.EventPacker {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r2h(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.he5
    public void a(Surface surface) {
        qee qeeVar;
        tz4 tz4Var = (tz4) this.b;
        tu1 tu1Var = (tu1) this.c;
        msf msfVar = (msf) this.d;
        int iV = az1.v(tz4Var.b);
        if (iV != 0) {
            if (iV == 1) {
                if (msfVar.a()) {
                    gri.a("VideoEncoderSession", "Not provide surface, " + Objects.toString(msfVar, "EMPTY") + " is already serviced.");
                    tu1Var.b(null);
                    tz4Var.e();
                    return;
                }
                tz4Var.g = surface;
                gri.a("VideoEncoderSession", "provide surface: " + surface);
                msfVar.b(surface, (Executor) tz4Var.d, new s32(7, tz4Var));
                tz4Var.b = 4;
                tu1Var.b((bf5) tz4Var.f);
                return;
            }
            if (iV != 2) {
                if (iV == 3) {
                    if (((sgd) tz4Var.j) != null && (qeeVar = (qee) tz4Var.i) != null) {
                        qeeVar.execute(new n1h(tz4Var, 1, surface));
                    }
                    gri.i("VideoEncoderSession", "Surface is updated in READY state: " + surface);
                    return;
                }
                if (iV != 4) {
                    throw new IllegalStateException("State " + xrf.z(tz4Var.b) + " is not handled");
                }
            }
        }
        gri.a("VideoEncoderSession", "Not provide surface in ".concat(xrf.z(tz4Var.b)));
        tu1Var.b(null);
    }

    public void b(boolean z) {
        Object ipdVar;
        q8h q8hVar = (q8h) this.b;
        xt4 xt4Var = (xt4) this.c;
        File file = (File) this.d;
        String str = q8hVar.h;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                String name = file.getName();
                try {
                    ipdVar = Boolean.valueOf(file.exists() && file.canRead());
                } catch (Throwable th) {
                    ipdVar = new ipd(th);
                }
                Object obj = Boolean.FALSE;
                if (ipdVar instanceof ipd) {
                    ipdVar = obj;
                }
                l6bVar.c(lg8Var, str, wmf.d("\n                VideoMessage Recording. File is ready:\n                    File name = " + name + ";\n                    Ready isSuccessful = " + z + ";\n                    File exists and readable = " + ((Boolean) ipdVar).booleanValue() + "\n                "), null);
            }
        }
        if (z) {
            ((AtomicReference) xt4Var.c).set(jx5.a);
            ((CountDownLatch) xt4Var.b).countDown();
        } else {
            ((AtomicReference) xt4Var.c).set(ix5.a);
            ((CountDownLatch) xt4Var.b).countDown();
        }
    }

    @Override // defpackage.w2f
    public void i(i2f i2fVar) throws JSONException {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                k2h k2hVar = (k2h) obj2;
                wqi.c("u2h", "copyFromUri: started for uri = %s", k2hVar.a.a);
                u6b u6bVar = ((u2h) obj3).a;
                l2h l2hVar = k2hVar.a;
                String strB = u6bVar.b(l2hVar.a, ((q34) obj).c);
                if (!b6a.Q(strB)) {
                    if (!i2fVar.e()) {
                        i2fVar.onError(new VideoConverterException("failed to copy file"));
                        break;
                    }
                } else {
                    wqi.c("u2h", "copyFromUri: finished for uri = %s", l2hVar.a);
                    if (!i2fVar.e()) {
                        dl6 dl6VarA = k2hVar.a();
                        dl6VarA.c = strB;
                        i2fVar.a(new k2h(dl6VarA));
                        break;
                    }
                }
                break;
            default:
                WaitingRoomParticipants.loadWaitingParticipantIdsPageSingle$lambda$6((k01) obj3, (tt1) obj2, (WaitingRoomParticipants) obj, i2fVar);
                break;
        }
    }

    @Override // com.my.tracker.core.EngineCore.EventPacker
    public byte[] invoke(EngineCore.InsertEventTools insertEventTools) {
        switch (this.a) {
            case 4:
                return ((d) this.b).a((String) this.c, (String) this.d, insertEventTools);
            default:
                return ((k) this.b).a((String) this.c, (String) this.d, insertEventTools);
        }
    }
}
