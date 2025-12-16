package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.N;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;

/* compiled from: JvmBuiltInsCustomizer.kt */
/* loaded from: classes8.dex */
final class t extends N implements Y41.a<kotlin.reflect.jvm.internal.impl.descriptors.annotations.g> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l f407300l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(l lVar) {
        super(0);
        this.f407300l = lVar;
    }

    @Override // Y41.a
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g invoke() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.k kVarA = kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.a(this.f407300l.f407275a.f407553e, "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", "", "WARNING");
        g.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2;
        List listSingletonList = Collections.singletonList(kVarA);
        aVar.getClass();
        return g.a.a(listSingletonList);
    }
}
