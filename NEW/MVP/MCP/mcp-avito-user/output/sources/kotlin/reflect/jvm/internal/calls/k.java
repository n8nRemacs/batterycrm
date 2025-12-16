package kotlin.reflect.jvm.internal.calls;

import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;

/* compiled from: ValueClassAwareCaller.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\f\b\u0000\u0010\u0001 \u0001*\u0004\u0018\u00010\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/reflect/Member;", "M", "Lkotlin/reflect/jvm/internal/impl/descriptors/d;", "", "invoke", "(Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes8.dex */
final class k extends N implements Y41.l<InterfaceC42851d, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final k f407149l = new k();

    public k() {
        super(1);
    }

    @Override // Y41.l
    public final Boolean invoke(InterfaceC42851d interfaceC42851d) {
        return Boolean.valueOf(kotlin.reflect.jvm.internal.impl.resolve.k.e(interfaceC42851d));
    }
}
