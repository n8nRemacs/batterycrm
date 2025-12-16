package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Map;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.C42822w;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.types.O;

/* compiled from: BuiltInAnnotationDescriptor.kt */
/* loaded from: classes8.dex */
public final class k implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.builtins.k f407527a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.name.c f407528b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> f407529c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Object f407530d;

    public k(@Y61.k kotlin.reflect.jvm.internal.impl.builtins.k kVar, @Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar, @Y61.k Map map) {
        this.f407527a = kVar;
        this.f407528b = cVar;
        this.f407529c = map;
        this.f407530d = C42727D.b(LazyThreadSafetyMode.f406615c, new j(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @Y61.k
    public final Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> b() {
        return this.f407529c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.name.c d() {
        return this.f407528b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @Y61.k
    public final b0 e() {
        return b0.f407539a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @Y61.k
    public final O getType() {
        return (O) this.f407530d.getValue();
    }

    public /* synthetic */ k(kotlin.reflect.jvm.internal.impl.builtins.k kVar, kotlin.reflect.jvm.internal.impl.name.c cVar, Map map, boolean z12, int i12, C42822w c42822w) {
        this(kVar, cVar, map);
    }
}
