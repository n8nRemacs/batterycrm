package shark;

import java.util.Collections;
import kotlin.Metadata;
import okio.InterfaceC44804n;
import shark.C48236b2;
import shark.l3;

/* compiled from: HprofPrimitiveArrayStripper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lshark/r2;", "", "<init>", "()V", "shark-hprof"}, k = 1, mv = {1, 4, 1})
/* renamed from: shark.r2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48337r2 {
    public static void a(@Y61.k o3 o3Var, @Y61.k okio.X x12) {
        InterfaceC44804n interfaceC44804nB = o3Var.b();
        try {
            C48236b2.f438244f.getClass();
            C48236b2 c48236b2A = C48236b2.a.a(interfaceC44804nB);
            kotlin.io.c.a(interfaceC44804nB, null);
            l3.a aVar = l3.f438650b;
            k3.f438644c.getClass();
            k3 k3Var = new k3(o3Var, c48236b2A, null);
            aVar.getClass();
            l3 l3Var = new l3(k3Var);
            C48353v2.f438790e.getClass();
            x12.b2(c48236b2A.f438247c.f438083b);
            x12.writeByte(0);
            x12.writeInt(c48236b2A.f438248d);
            x12.writeLong(c48236b2A.f438246b);
            C48353v2 c48353v2 = new C48353v2(x12, c48236b2A, null);
            try {
                l3Var.a(Collections.singleton(kotlin.jvm.internal.m0.f406844a.b(AbstractC48345t2.class)), new C48334q2(c48353v2));
                kotlin.io.c.a(c48353v2, null);
            } finally {
            }
        } finally {
        }
    }
}
