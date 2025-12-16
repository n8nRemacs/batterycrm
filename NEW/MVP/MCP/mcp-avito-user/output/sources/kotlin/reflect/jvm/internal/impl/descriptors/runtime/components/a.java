package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.o;

/* compiled from: PackagePartScopeCache.kt */
@s0
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final o f407802a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g f407803b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ConcurrentHashMap<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.resolve.scopes.j> f407804c = new ConcurrentHashMap<>();

    public a(@Y61.k g gVar, @Y61.k o oVar) {
        this.f407802a = oVar;
        this.f407803b = gVar;
    }
}
