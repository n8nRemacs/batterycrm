package androidx.compose.ui.input.pointer;

import androidx.collection.C20204c0;
import androidx.compose.ui.node.C22444x;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Metadata;

/* compiled from: PointerInputEventProcessor.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/G;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LayoutNode f40149a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C22328f f40150b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final D f40151c = new D();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C22444x f40152d = new C22444x();

    /* renamed from: e, reason: collision with root package name */
    public boolean f40153e;

    public G(@Y61.k LayoutNode layoutNode) {
        this.f40149a = layoutNode;
        this.f40150b = new C22328f(layoutNode.f40615I.f40875b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int a(@Y61.k E e12, @Y61.k AndroidComposeView androidComposeView, boolean z12) {
        Object[] objArr;
        C22328f c22328f;
        int i12;
        C22444x c22444x = this.f40152d;
        if (this.f40153e) {
            return 0;
        }
        try {
            this.f40153e = true;
            C22333k c22333kA = this.f40151c.a(e12, androidComposeView);
            C20204c0<C> c20204c0 = c22333kA.f40257a;
            int iN2 = c20204c0.n();
            for (int i13 = 0; i13 < iN2; i13++) {
                C cO2 = c20204c0.o(i13);
                if (!cO2.f40119d && !cO2.f40123h) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int iN3 = c20204c0.n();
            int i14 = 0;
            while (true) {
                c22328f = this.f40150b;
                if (i14 >= iN3) {
                    break;
                }
                C cO3 = c20204c0.o(i14);
                if (objArr != false || C22341t.a(cO3)) {
                    LayoutNode layoutNode = this.f40149a;
                    long j12 = cO3.f40118c;
                    C22444x c22444x2 = this.f40152d;
                    int i15 = cO3.f40124i;
                    LayoutNode.d dVar = LayoutNode.f40602T;
                    layoutNode.P(j12, c22444x2, i15, true);
                    if (!c22444x.f40938b.d()) {
                        c22328f.a(cO3.f40116a, c22444x, C22341t.a(cO3));
                        c22444x.clear();
                    }
                }
                i14++;
            }
            boolean zB2 = c22328f.b(c22333kA, z12);
            if (c22333kA.f40259c) {
                i12 = 0;
            } else {
                int iN4 = c20204c0.n();
                for (int i16 = 0; i16 < iN4; i16++) {
                    C cO4 = c20204c0.o(i16);
                    long jF2 = C22341t.f(cO4, true);
                    l0.g.f413384b.getClass();
                    if (!l0.g.d(jF2, 0L) && cO4.b()) {
                        i12 = 1;
                        break;
                    }
                }
                i12 = 0;
            }
            int i17 = (i12 << 1) | (zB2 ? 1 : 0);
            this.f40153e = false;
            return i17;
        } catch (Throwable th2) {
            this.f40153e = false;
            throw th2;
        }
    }

    public final void b() {
        if (this.f40153e) {
            return;
        }
        this.f40151c.f40132a.a();
        this.f40150b.c();
    }
}
