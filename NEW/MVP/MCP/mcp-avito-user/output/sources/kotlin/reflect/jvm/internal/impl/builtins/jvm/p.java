package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.Collections;
import java.util.List;
import kotlin.Q;
import kotlin.jvm.internal.N;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;

/* compiled from: JvmBuiltInsCustomizer.kt */
/* loaded from: classes8.dex */
final class p extends N implements Y41.l<Q<? extends String, ? extends String>, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l f407294l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(l lVar) {
        super(1);
        this.f407294l = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g invoke(Q<? extends String, ? extends String> q12) {
        Q<? extends String, ? extends String> q13 = q12;
        String str = (String) q13.f406619b;
        String str2 = (String) q13.f406620c;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.k kVarA = kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.a(this.f407294l.f407275a.f407553e, androidx.camera.core.Q.a("'", str, "()' member of List is redundant in Kotlin and might be removed soon. Please use '", str2, "()' stdlib extension instead"), str2 + "()", "HIDDEN");
        g.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2;
        List listSingletonList = Collections.singletonList(kVarA);
        aVar.getClass();
        return g.a.a(listSingletonList);
    }
}
