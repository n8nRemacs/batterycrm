package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import Y61.k;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.a;

/* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
/* loaded from: classes8.dex */
class f extends a.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a.e f408525b;

    public f(a.e eVar) {
        this.f408525b = eVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.b
    public final void f(@k String[] strArr) {
        if (strArr == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2.visitEnd must not be null");
        }
        a.this.f408513e = strArr;
    }
}
