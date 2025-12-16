package kotlin.reflect.jvm.internal;

import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;

/* compiled from: KClassImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/lang/reflect/Type;", "T", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.reflect.jvm.internal.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43009s extends kotlin.jvm.internal.N implements Y41.a<Type> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.O f410455l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r<Object>.a f410456m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r<Object> f410457n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43009s(kotlin.reflect.jvm.internal.impl.types.O o12, r<Object>.a aVar, r<Object> rVar) {
        super(0);
        this.f410455l = o12;
        this.f410456m = aVar;
        this.f410457n = rVar;
    }

    @Override // Y41.a
    public final Type invoke() {
        InterfaceC42853f interfaceC42853fB = this.f410455l.H0().b();
        if (!(interfaceC42853fB instanceof InterfaceC42851d)) {
            throw new X("Supertype not a class: " + interfaceC42853fB);
        }
        Class<?> clsI = i0.i((InterfaceC42851d) interfaceC42853fB);
        r<Object>.a aVar = this.f410456m;
        if (clsI == null) {
            throw new X("Unsupported superclass of " + aVar + ": " + interfaceC42853fB);
        }
        r<Object> rVar = this.f410457n;
        boolean zF2 = kotlin.jvm.internal.L.f(rVar.f410413e.getSuperclass(), clsI);
        Class<Object> cls = rVar.f410413e;
        if (zF2) {
            return cls.getGenericSuperclass();
        }
        int iH2 = C42756l.H(clsI, cls.getInterfaces());
        if (iH2 >= 0) {
            return cls.getGenericInterfaces()[iH2];
        }
        throw new X("No superclass of " + aVar + " in Java reflection for " + interfaceC42853fB);
    }
}
