package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.s0;
import kotlin.reflect.n;

/* compiled from: Delegates.kt */
@s0
/* loaded from: classes8.dex */
public final class j extends kotlin.properties.e<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f409546b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Object obj, i iVar) {
        super(obj);
        this.f409546b = iVar;
    }

    @Override // kotlin.properties.e
    public final boolean beforeChange(@Y61.k n<?> nVar, Object obj, Object obj2) {
        if (this.f409546b.f409518a) {
            throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
        }
        return true;
    }
}
