package androidx.compose.material3;

import androidx.compose.animation.C20389u;
import androidx.compose.animation.C20396w0;
import androidx.compose.animation.InterfaceC20401y;
import androidx.compose.animation.core.C20310q;
import kotlin.Metadata;

/* compiled from: DatePicker.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/y;", "Landroidx/compose/material3/D6;", "Landroidx/compose/animation/w0;", "invoke", "(Landroidx/compose/animation/y;)Landroidx/compose/animation/w0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.f5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21558f5 extends kotlin.jvm.internal.N implements Y41.l<InterfaceC20401y<D6>, C20396w0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f36314l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21558f5(int i12) {
        super(1);
        this.f36314l = i12;
    }

    @Override // Y41.l
    public final C20396w0 invoke(InterfaceC20401y<D6> interfaceC20401y) {
        C20396w0 c20396w0E;
        InterfaceC20401y<D6> interfaceC20401y2 = interfaceC20401y;
        int i12 = interfaceC20401y2.d().f34622a;
        D6.f34620b.getClass();
        boolean zB2 = D6.b(i12, D6.f34621c);
        int i13 = this.f36314l;
        if (zB2) {
            c20396w0E = C20389u.e(androidx.compose.animation.H0.k(C21443a5.f36017l).b(androidx.compose.animation.H0.d(C20310q.e(100, 100, null, 4), 2)), androidx.compose.animation.H0.e(C20310q.e(100, 0, null, 6), 2).b(androidx.compose.animation.H0.l(new C21466b5(i13))));
        } else {
            c20396w0E = C20389u.e(androidx.compose.animation.H0.j(new C21489c5(i13), C20310q.e(0, 50, null, 5)).b(androidx.compose.animation.H0.d(C20310q.e(100, 100, null, 4), 2)), androidx.compose.animation.H0.l(C21512d5.f36182l).b(androidx.compose.animation.H0.e(C20310q.e(100, 0, null, 6), 2)));
        }
        return interfaceC20401y2.c(c20396w0E, C20389u.c(C21535e5.f36249l));
    }
}
