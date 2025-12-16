package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.LinkedHashSet;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: IntersectionType.kt */
/* loaded from: classes8.dex */
final class B extends N implements Y41.a<String> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ LinkedHashSet f410094l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(LinkedHashSet linkedHashSet) {
        super(0);
        this.f410094l = linkedHashSet;
    }

    @Override // Y41.a
    public final String invoke() {
        return "This collections cannot be empty! input types: ".concat(C42745f0.O(this.f410094l, null, null, null, null, 63));
    }
}
