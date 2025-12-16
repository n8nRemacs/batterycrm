package androidx.view.compose;

import Y41.p;
import androidx.compose.animation.InterfaceC20395w;
import androidx.compose.runtime.A;
import androidx.view.C23395u;
import androidx.view.compose.C23339e;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NavHost.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.navigation.compose.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C23327A extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C23395u f52915l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20395w f52916m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23327A(C23395u c23395u, InterfaceC20395w interfaceC20395w) {
        super(2);
        this.f52915l = c23395u;
        this.f52916m = interfaceC20395w;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            C23395u c23395u = this.f52915l;
            ((C23339e.b) c23395u.f53182c).f52943l.invoke(this.f52916m, c23395u, a13, 72);
        }
        return G0.f406611a;
    }
}
