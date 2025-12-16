package kotlin.jvm.internal;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import kotlin.InterfaceC42733c0;

/* compiled from: Reflection.java */
/* loaded from: classes8.dex */
public class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final n0 f406844a;

    /* renamed from: b, reason: collision with root package name */
    public static final kotlin.reflect.d[] f406845b;

    static {
        n0 n0Var = null;
        try {
            n0Var = (n0) kotlin.reflect.jvm.internal.a0.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (n0Var == null) {
            n0Var = new n0();
        }
        f406844a = n0Var;
        f406845b = new kotlin.reflect.d[0];
    }

    public static kotlin.reflect.d a(Class cls) {
        return f406844a.b(cls);
    }

    @InterfaceC42733c0
    public static kotlin.reflect.r b(Class cls) {
        n0 n0Var = f406844a;
        return n0Var.m(n0Var.b(cls), Collections.emptyList(), true);
    }

    @InterfaceC42733c0
    public static kotlin.reflect.r c(Class cls) {
        n0 n0Var = f406844a;
        return n0Var.m(n0Var.b(cls), Collections.emptyList(), false);
    }

    @InterfaceC42733c0
    public static kotlin.reflect.r d(kotlin.reflect.t tVar, kotlin.reflect.t tVar2) {
        n0 n0Var = f406844a;
        return n0Var.m(n0Var.b(Map.class), Arrays.asList(tVar, tVar2), false);
    }
}
