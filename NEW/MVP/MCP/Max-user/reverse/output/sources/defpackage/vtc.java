package defpackage;

import android.content.Context;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.widgets.quickcamera.CameraxCameraApiView;

/* loaded from: classes2.dex */
public final class vtc extends dtf implements sm6 {
    public final /* synthetic */ ytc X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vtc(Continuation continuation, ytc ytcVar) {
        super(2, continuation);
        this.X = ytcVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        vtc vtcVar = (vtc) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        vtcVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        vtc vtcVar = new vtc(continuation, this.X);
        vtcVar.o = obj;
        return vtcVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        htc htcVar = (htc) this.o;
        float f = ytc.G0;
        boolean z = htcVar instanceof gtc;
        ytc ytcVar = this.X;
        if (z) {
            j02 cameraApi = ytcVar.getCameraApi();
            ExecutorService executorService = ytcVar.o;
            ExecutorService executorService2 = executorService != null ? executorService : null;
            long j = ((gtc) htcVar).a;
            CameraxCameraApiView cameraxCameraApiView = (CameraxCameraApiView) cameraApi;
            cameraxCameraApiView.getClass();
            wqi.c(CameraxCameraApiView.class.getName(), "takePicture", new Object[0]);
            o38 o38Var = cameraxCameraApiView.c;
            v32 v32Var = new v32(cameraxCameraApiView, j, 0);
            o38Var.getClass();
            jei.b();
            z5j.f("Camera not initialized.", o38Var.j());
            jei.b();
            z5j.f("ImageCapture disabled.", (o38Var.b & 1) != 0);
            jei.b();
            if (o38Var.e.H() == 3 && (o38Var.g() == null || o38Var.g().b == null)) {
                throw new IllegalStateException("No window set in PreviewView despite setting FLASH_MODE_SCREEN");
            }
            o38Var.e.J(executorService2, v32Var);
        } else if (htcVar instanceof etc) {
            j02 cameraApi2 = ytcVar.getCameraApi();
            File file = ((etc) htcVar).a;
            CameraxCameraApiView cameraxCameraApiView2 = (CameraxCameraApiView) cameraApi2;
            cameraxCameraApiView2.getClass();
            wqi.c(CameraxCameraApiView.class.getName(), "startRecordVideo", new Object[0]);
            if (z7.b(cameraxCameraApiView2.getContext(), "android.permission.RECORD_AUDIO") != 0) {
                wqi.q(CameraxCameraApiView.class.getName(), "No permission to record audio", new Object[0]);
            } else {
                o38 o38Var2 = cameraxCameraApiView2.c;
                xw5 xw5VarS = new r5j(file).s();
                Executor executor = cameraxCameraApiView2.a;
                s32 s32Var = new s32(0, cameraxCameraApiView2);
                o38Var2.getClass();
                jei.b();
                z5j.f("Camera not initialized.", o38Var2.j());
                jei.b();
                z5j.f("VideoCapture disabled.", (o38Var2.b & 4) != 0);
                jei.b();
                dhd dhdVar = o38Var2.j;
                if (dhdVar != null && !dhdVar.a.get()) {
                    z = true;
                }
                z5j.f("Recording video. Only one recording can be active at a time.", !z);
                Context context = o38Var2.E;
                v12 v12Var = new v12(o38Var2, z7.d(context), s32Var);
                iy1 iy1Var = new iy1(context, (bhd) o38Var2.i.L(), xw5VarS);
                if (z4j.a(context, "android.permission.RECORD_AUDIO") == -1) {
                    throw new SecurityException("Attempted to start recording with audio, but application does not have RECORD_AUDIO permission granted.");
                }
                iy1Var.j();
                dhd dhdVarF = iy1Var.f(executor, v12Var);
                o38Var2.k.put(v12Var, dhdVarF);
                o38Var2.j = dhdVarF;
                cameraxCameraApiView2.t0 = dhdVarF;
            }
        } else {
            if (!(htcVar instanceof ftc)) {
                throw new NoWhenBranchMatchedException();
            }
            CameraxCameraApiView cameraxCameraApiView3 = (CameraxCameraApiView) ytcVar.getCameraApi();
            cameraxCameraApiView3.getClass();
            wqi.c(CameraxCameraApiView.class.getName(), "stopRecordVideo", new Object[0]);
            dhd dhdVar2 = cameraxCameraApiView3.t0;
            if (dhdVar2 != null) {
                dhdVar2.close();
            }
            cameraxCameraApiView3.t0 = null;
        }
        return qqg.a;
    }
}
