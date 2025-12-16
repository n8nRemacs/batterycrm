package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import Y61.k;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.a;

/* compiled from: ReadKotlinClassHeaderAnnotationVisitor.java */
/* loaded from: classes8.dex */
class b extends a.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a.c f408521b;

    public b(a.c cVar) {
        this.f408521b = cVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.a.b
    public final void f(@k String[] strArr) {
        if (strArr == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1.visitEnd must not be null");
        }
        a.this.f408512d = strArr;
    }
}
