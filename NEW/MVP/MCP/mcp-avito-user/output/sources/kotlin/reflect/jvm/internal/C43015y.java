package kotlin.reflect.jvm.internal;

import kotlin.Metadata;

/* compiled from: KDeclarationContainerImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/U;", "descriptor", "", "invoke", "(Lkotlin/reflect/jvm/internal/impl/descriptors/U;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: kotlin.reflect.jvm.internal.y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43015y extends kotlin.jvm.internal.N implements Y41.l<kotlin.reflect.jvm.internal.impl.descriptors.U, CharSequence> {

    /* renamed from: l, reason: collision with root package name */
    public static final C43015y f410461l = new C43015y();

    public C43015y() {
        super(1);
    }

    @Override // Y41.l
    public final CharSequence invoke(kotlin.reflect.jvm.internal.impl.descriptors.U u12) {
        kotlin.reflect.jvm.internal.impl.descriptors.U u13 = u12;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(kotlin.reflect.jvm.internal.impl.renderer.b.f409471d.x(u13));
        sb2.append(" | ");
        d0.f407150a.getClass();
        sb2.append(d0.b(u13).getF410392f());
        return sb2.toString();
    }
}
