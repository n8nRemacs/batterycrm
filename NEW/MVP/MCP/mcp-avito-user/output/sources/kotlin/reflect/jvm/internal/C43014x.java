package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x;

/* compiled from: KDeclarationContainerImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/x;", "descriptor", "", "invoke", "(Lkotlin/reflect/jvm/internal/impl/descriptors/x;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: kotlin.reflect.jvm.internal.x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43014x extends kotlin.jvm.internal.N implements Y41.l<InterfaceC42905x, CharSequence> {

    /* renamed from: l, reason: collision with root package name */
    public static final C43014x f410460l = new C43014x();

    public C43014x() {
        super(1);
    }

    @Override // Y41.l
    public final CharSequence invoke(InterfaceC42905x interfaceC42905x) {
        InterfaceC42905x interfaceC42905x2 = interfaceC42905x;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(kotlin.reflect.jvm.internal.impl.renderer.b.f409471d.x(interfaceC42905x2));
        sb2.append(" | ");
        d0.f407150a.getClass();
        sb2.append(d0.c(interfaceC42905x2).getF410381b());
        return sb2.toString();
    }
}
