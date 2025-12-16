package androidx.compose.ui.input.pointer;

import androidx.collection.C20204c0;
import androidx.collection.N0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HitPathTracker.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/q;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.input.pointer.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C22339q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.collection.e<C22338p> f40275a = new androidx.compose.runtime.collection.e<>(new C22338p[16], 0);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final N0<C22339q> f40276b = new N0<>(10, null);

    public boolean a(@Y61.k C20204c0<C> c20204c0, @Y61.k androidx.compose.ui.layout.A a12, @Y61.k C22333k c22333k, boolean z12) {
        androidx.compose.runtime.collection.e<C22338p> eVar = this.f40275a;
        C22338p[] c22338pArr = eVar.f38260b;
        int i12 = eVar.f38262d;
        boolean z13 = false;
        for (int i13 = 0; i13 < i12; i13++) {
            z13 = c22338pArr[i13].a(c20204c0, a12, c22333k, z12) || z13;
        }
        return z13;
    }

    public void b(@Y61.k C22333k c22333k) {
        androidx.compose.runtime.collection.e<C22338p> eVar = this.f40275a;
        int i12 = eVar.f38262d;
        while (true) {
            i12--;
            if (-1 >= i12) {
                return;
            }
            if (eVar.f38260b[i12].f40268d.f429560a == 0) {
                eVar.k(i12);
            }
        }
    }
}
