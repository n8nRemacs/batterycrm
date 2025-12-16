package androidx.compose.ui.draw;

import androidx.collection.N0;
import androidx.collection.a1;
import androidx.compose.ui.graphics.InterfaceC22264l0;
import androidx.compose.ui.graphics.layer.C22267c;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import s0.C47949a;

/* compiled from: DrawModifier.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/draw/w;", "Landroidx/compose/ui/graphics/l0;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class w implements InterfaceC22264l0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public N0<C22267c> f39071a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public InterfaceC22264l0 f39072b;

    @Override // androidx.compose.ui.graphics.InterfaceC22264l0
    @Y61.k
    public final C22267c a() {
        InterfaceC22264l0 interfaceC22264l0 = this.f39072b;
        if (interfaceC22264l0 == null) {
            C47949a.b("GraphicsContext not provided");
        }
        C22267c c22267cA = interfaceC22264l0.a();
        N0<C22267c> n02 = this.f39071a;
        if (n02 == null) {
            Object[] objArr = a1.f25678a;
            N0<C22267c> n03 = new N0<>(1, null);
            n03.f(c22267cA);
            this.f39071a = n03;
        } else {
            n02.f(c22267cA);
        }
        return c22267cA;
    }

    @Override // androidx.compose.ui.graphics.InterfaceC22264l0
    public final void b(@Y61.k C22267c c22267c) {
        InterfaceC22264l0 interfaceC22264l0 = this.f39072b;
        if (interfaceC22264l0 != null) {
            interfaceC22264l0.b(c22267c);
        }
    }

    public final void c() {
        N0<C22267c> n02 = this.f39071a;
        if (n02 != null) {
            Object[] objArr = n02.f25659a;
            int i12 = n02.f25660b;
            for (int i13 = 0; i13 < i12; i13++) {
                b((C22267c) objArr[i13]);
            }
            n02.i();
        }
    }
}
