package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class iie implements kie {
    public final SessionConfiguration a;
    public final List b;

    public iie(ArrayList arrayList, qee qeeVar, b12 b12Var) {
        ekb ekbVar;
        SessionConfiguration sessionConfiguration = new SessionConfiguration(0, lie.a(arrayList), qeeVar, b12Var);
        this.a = sessionConfiguration;
        List<OutputConfiguration> outputConfigurations = sessionConfiguration.getOutputConfigurations();
        ArrayList arrayList2 = new ArrayList(outputConfigurations.size());
        for (OutputConfiguration outputConfiguration : outputConfigurations) {
            if (outputConfiguration == null) {
                ekbVar = null;
            } else {
                int i = Build.VERSION.SDK_INT;
                ekbVar = new ekb(i >= 33 ? new jkb(outputConfiguration) : i >= 28 ? new ikb(new hkb(outputConfiguration)) : new gkb(new fkb(outputConfiguration)));
            }
            arrayList2.add(ekbVar);
        }
        this.b = Collections.unmodifiableList(arrayList2);
    }

    @Override // defpackage.kie
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.kie
    public final im7 b() {
        return im7.a(this.a.getInputConfiguration());
    }

    @Override // defpackage.kie
    public final Executor c() {
        return this.a.getExecutor();
    }

    @Override // defpackage.kie
    public final int d() {
        return this.a.getSessionType();
    }

    @Override // defpackage.kie
    public final CameraCaptureSession.StateCallback e() {
        return this.a.getStateCallback();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof iie) {
            return Objects.equals(this.a, ((iie) obj).a);
        }
        return false;
    }

    @Override // defpackage.kie
    public final List f() {
        return this.b;
    }

    @Override // defpackage.kie
    public final void g(CaptureRequest captureRequest) {
        this.a.setSessionParameters(captureRequest);
    }

    @Override // defpackage.kie
    public final void h(im7 im7Var) {
        this.a.setInputConfiguration(im7Var.a.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
