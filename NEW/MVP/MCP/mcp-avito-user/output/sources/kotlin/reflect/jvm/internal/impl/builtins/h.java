package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.Arrays;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.P;

/* compiled from: KotlinBuiltIns.java */
/* loaded from: classes8.dex */
class h implements Y41.a<Collection<P>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f407225b;

    public h(k kVar) {
        this.f407225b = kVar;
    }

    @Override // Y41.a
    public final Collection<P> invoke() {
        k kVar = this.f407225b;
        return Arrays.asList(kVar.k().i0(n.f407339l), kVar.k().i0(n.f407341n), kVar.k().i0(n.f407342o), kVar.k().i0(n.f407340m));
    }
}
