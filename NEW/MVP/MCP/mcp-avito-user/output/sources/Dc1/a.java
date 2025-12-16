package Dc1;

import java.util.HashMap;
import kotlin.Z;

/* loaded from: classes9.dex */
public abstract class a {
    public static final HashMap a(HashMap map) {
        Object bVar;
        try {
            int i12 = Z.f406624c;
            Object objClone = map.clone();
            bVar = objClone instanceof HashMap ? (HashMap) objClone : null;
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        return (HashMap) (bVar instanceof Z.b ? null : bVar);
    }
}
