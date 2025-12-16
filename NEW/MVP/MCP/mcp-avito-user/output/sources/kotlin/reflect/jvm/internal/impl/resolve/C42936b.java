package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.m;
import kotlin.reflect.jvm.internal.impl.types.O;

/* compiled from: SealedClassInheritorsProvider.kt */
@s0
/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42936b extends z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C42936b f409574a = new C42936b();

    public static final void a(InterfaceC42851d interfaceC42851d, LinkedHashSet<InterfaceC42851d> linkedHashSet, kotlin.reflect.jvm.internal.impl.resolve.scopes.j jVar, boolean z12) {
        for (InterfaceC42882k interfaceC42882k : m.a.a(jVar, kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f409665n, 2)) {
            if (interfaceC42882k instanceof InterfaceC42851d) {
                InterfaceC42851d interfaceC42851dK = (InterfaceC42851d) interfaceC42882k;
                if (interfaceC42851dK.O()) {
                    InterfaceC42853f interfaceC42853fG = jVar.g(interfaceC42851dK.getName(), NoLookupLocation.f407887e);
                    interfaceC42851dK = interfaceC42853fG instanceof InterfaceC42851d ? (InterfaceC42851d) interfaceC42853fG : interfaceC42853fG instanceof f0 ? ((f0) interfaceC42853fG).k() : null;
                }
                if (interfaceC42851dK == null) {
                    continue;
                } else {
                    if (interfaceC42851d == null) {
                        j.a(27);
                        throw null;
                    }
                    int i12 = j.f409625a;
                    Iterator<O> it = interfaceC42851dK.l().C().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (j.p(it.next(), interfaceC42851d.n0())) {
                                linkedHashSet.add(interfaceC42851dK);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z12) {
                        a(interfaceC42851d, linkedHashSet, interfaceC42851dK.f0(), z12);
                    }
                }
            }
        }
    }
}
