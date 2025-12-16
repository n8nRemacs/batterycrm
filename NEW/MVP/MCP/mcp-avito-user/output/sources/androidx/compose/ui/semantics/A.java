package androidx.compose.ui.semantics;

import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SemanticsProperties.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/x;", "", "T", "Landroidx/compose/ui/semantics/a;", "parentValue", "childValue", "invoke", "(Landroidx/compose/ui/semantics/a;Landroidx/compose/ui/semantics/a;)Landroidx/compose/ui/semantics/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class A extends N implements Y41.p<C22553a<InterfaceC43072x<? extends Boolean>>, C22553a<InterfaceC43072x<? extends Boolean>>, C22553a<InterfaceC43072x<? extends Boolean>>> {

    /* renamed from: l, reason: collision with root package name */
    public static final A f41715l = new A();

    public A() {
        super(2);
    }

    @Override // Y41.p
    public final C22553a<InterfaceC43072x<? extends Boolean>> invoke(C22553a<InterfaceC43072x<? extends Boolean>> c22553a, C22553a<InterfaceC43072x<? extends Boolean>> c22553a2) {
        String str;
        InterfaceC43072x interfaceC43072x;
        C22553a<InterfaceC43072x<? extends Boolean>> c22553a3 = c22553a;
        C22553a<InterfaceC43072x<? extends Boolean>> c22553a4 = c22553a2;
        if (c22553a3 == null || (str = c22553a3.f41727a) == null) {
            str = c22553a4.f41727a;
        }
        if (c22553a3 == null || (interfaceC43072x = c22553a3.f41728b) == null) {
            interfaceC43072x = c22553a4.f41728b;
        }
        return new C22553a<>(str, interfaceC43072x);
    }
}
