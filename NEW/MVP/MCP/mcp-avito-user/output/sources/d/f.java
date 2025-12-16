package D;

import android.hardware.camera2.CameraCharacteristics;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.internal.C20045z;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.n;
import androidx.camera.core.C20140q0;
import androidx.camera.core.InterfaceC20142t;
import androidx.camera.core.impl.B;
import androidx.core.util.z;
import j.N;
import j.X;
import java.util.LinkedHashMap;
import java.util.Objects;

/* compiled from: Camera2CameraInfo.java */
@i
@X
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final C20045z f2838a;

    @RestrictTo
    public f(@N C20045z c20045z) {
        this.f2838a = c20045z;
    }

    @N
    public static f a(@N InterfaceC20142t interfaceC20142t) {
        B bP2 = ((B) interfaceC20142t).p();
        z.a("CameraInfo doesn't contain Camera2 implementation.", bP2 instanceof C20045z);
        return ((C20045z) bP2).f23527c;
    }

    @N
    @RestrictTo
    public final LinkedHashMap b() {
        C20045z c20045z = this.f2838a;
        c20045z.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        n nVar = c20045z.f23526b;
        CameraCharacteristics cameraCharacteristicsC = nVar.c();
        String str = c20045z.f23525a;
        linkedHashMap.put(str, cameraCharacteristicsC);
        for (String str2 : nVar.f23171b.a()) {
            if (!Objects.equals(str2, str)) {
                try {
                    linkedHashMap.put(str2, c20045z.f23536l.b(str2).c());
                } catch (CameraAccessExceptionCompat unused) {
                    C20140q0.c("Camera2CameraInfo");
                }
            }
        }
        return linkedHashMap;
    }
}
