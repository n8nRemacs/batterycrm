package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC42966b;

/* compiled from: AbstractTypeChecker.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.types.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C42979h extends kotlin.jvm.internal.N implements Y41.l<TypeCheckerState.a, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f410207l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ TypeCheckerState f410208m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC42966b f410209n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ u51.i f410210o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42979h(ArrayList arrayList, TypeCheckerState typeCheckerState, InterfaceC42966b interfaceC42966b, u51.i iVar) {
        super(1);
        this.f410207l = arrayList;
        this.f410208m = typeCheckerState;
        this.f410209n = interfaceC42966b;
        this.f410210o = iVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(TypeCheckerState.a aVar) {
        TypeCheckerState.a aVar2 = aVar;
        Iterator it = this.f410207l.iterator();
        while (it.hasNext()) {
            aVar2.a(new C42977g(this.f410208m, this.f410209n, (u51.i) it.next(), this.f410210o));
        }
        return kotlin.G0.f406611a;
    }
}
