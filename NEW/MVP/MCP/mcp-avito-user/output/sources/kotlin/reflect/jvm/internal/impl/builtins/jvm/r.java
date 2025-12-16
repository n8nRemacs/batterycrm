package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.load.kotlin.D;
import kotlin.reflect.jvm.internal.impl.load.kotlin.H;
import kotlin.reflect.jvm.internal.impl.utils.b;

/* compiled from: JvmBuiltInsCustomizer.kt */
/* loaded from: classes8.dex */
public final class r extends b.AbstractC11701b<InterfaceC42851d, l.a> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f407297a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0.h<l.a> f407298b;

    public r(String str, l0.h<l.a> hVar) {
        this.f407297a = str;
        this.f407298b = hVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.b.e
    public final Object a() {
        l.a aVar = this.f407298b.f406842b;
        return aVar == null ? l.a.f407286e : aVar;
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.l$a] */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.l$a] */
    /* JADX WARN: Type inference failed for: r3v5, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.l$a] */
    /* JADX WARN: Type inference failed for: r3v6, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.l$a] */
    @Override // kotlin.reflect.jvm.internal.impl.utils.b.AbstractC11701b, kotlin.reflect.jvm.internal.impl.utils.b.e
    public final boolean b(Object obj) {
        String strA = D.a(H.f408434a, (InterfaceC42851d) obj, this.f407297a);
        w.f407303a.getClass();
        boolean zContains = w.f407305c.contains(strA);
        l0.h<l.a> hVar = this.f407298b;
        if (zContains) {
            hVar.f406842b = l.a.f407283b;
        } else if (w.f407307e.contains(strA)) {
            hVar.f406842b = l.a.f407284c;
        } else if (w.f407306d.contains(strA)) {
            hVar.f406842b = l.a.f407285d;
        } else if (w.f407304b.contains(strA)) {
            hVar.f406842b = l.a.f407287f;
        }
        return hVar.f406842b == null;
    }
}
