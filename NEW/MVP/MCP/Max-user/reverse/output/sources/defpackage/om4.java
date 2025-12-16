package defpackage;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class om4 {
    public static final int[] a = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};
    public static final xt4 b = new xt4(15);

    public static void a(ArrayList arrayList, int i) {
        Constructor constructor;
        fp5 fp5Var = null;
        int i2 = 0;
        switch (i) {
            case 0:
                arrayList.add(new p4());
                return;
            case 1:
                arrayList.add(new t4());
                return;
            case 2:
                arrayList.add(new cc(0));
                return;
            case 3:
                arrayList.add(new bd());
                return;
            case 4:
                xt4 xt4Var = b;
                synchronized (((AtomicBoolean) xt4Var.b)) {
                    if (((AtomicBoolean) xt4Var.b).get()) {
                        constructor = (Constructor) xt4Var.c;
                    } else {
                        try {
                            if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                                xt4Var.c = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(fp5.class).getConstructor(Integer.TYPE);
                            }
                        } catch (ClassNotFoundException unused) {
                        } catch (Exception e) {
                            throw new RuntimeException("Error instantiating FLAC extension", e);
                        }
                        ((AtomicBoolean) xt4Var.b).set(true);
                        constructor = (Constructor) xt4Var.c;
                    }
                }
                if (constructor != null) {
                    try {
                        fp5Var = (fp5) constructor.newInstance(0);
                    } catch (Exception e2) {
                        throw new IllegalStateException("Unexpected error creating FLAC extractor", e2);
                    }
                }
                if (fp5Var != null) {
                    arrayList.add(fp5Var);
                    return;
                } else {
                    arrayList.add(new s16());
                    return;
                }
            case 5:
                arrayList.add(new x76());
                return;
            case 6:
                arrayList.add(new ir8(0));
                return;
            case 7:
                arrayList.add(new m3a(0));
                return;
            case 8:
                arrayList.add(new jj6(0, null, Collections.EMPTY_LIST, null));
                arrayList.add(new t3a(0));
                return;
            case 9:
                arrayList.add(new dua());
                return;
            case 10:
                arrayList.add(new fqc());
                return;
            case 11:
                y9g y9gVar = new y9g(0L);
                t76 t76Var = wg7.b;
                arrayList.add(new ijg(1, y9gVar, new br4(zjd.o, i2, i2)));
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                hkh hkhVar = new hkh();
                hkhVar.c = 0;
                hkhVar.d = -1L;
                hkhVar.f = -1;
                hkhVar.g = -1L;
                arrayList.add(hkhVar);
                return;
            case 13:
            default:
                return;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                arrayList.add(new jv7());
                return;
        }
    }
}
