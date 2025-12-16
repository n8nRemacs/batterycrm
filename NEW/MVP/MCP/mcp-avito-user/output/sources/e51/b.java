package e51;

import Y61.k;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.load.java.E;
import kotlin.reflect.jvm.internal.impl.name.c;

/* compiled from: SpecialJvmAnnotations.kt */
@s0
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f394954a = new b();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final LinkedHashSet f394955b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final kotlin.reflect.jvm.internal.impl.name.b f394956c;

    static {
        List listU = C42745f0.U(E.f407914a, E.f407921h, E.f407922i, E.f407916c, E.f407917d, E.f407919f);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listU.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(kotlin.reflect.jvm.internal.impl.name.b.j((c) it.next()));
        }
        f394955b = linkedHashSet;
        f394956c = kotlin.reflect.jvm.internal.impl.name.b.j(E.f407920g);
    }
}
