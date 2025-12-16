package androidx.compose.ui.text.input;

import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.C22662l;
import androidx.compose.ui.text.v0;
import androidx.compose.ui.text.w0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: EditProcessor.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/input/n;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.text.input.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22648n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public W f42456a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public C22649o f42457b;

    public C22648n() {
        C22602e c22602e = C22662l.f42494a;
        v0.f42734b.getClass();
        this.f42456a = new W(c22602e, v0.f42735c, (v0) null, (C42822w) null);
        W w12 = this.f42456a;
        this.f42457b = new C22649o(w12.f42383a, w12.f42384b, (C42822w) null);
    }

    @Y61.k
    public final W a(@Y61.k List<? extends InterfaceC22645k> list) {
        InterfaceC22645k interfaceC22645k;
        Exception e12;
        InterfaceC22645k interfaceC22645k2;
        try {
            int size = list.size();
            int i12 = 0;
            interfaceC22645k = null;
            while (i12 < size) {
                try {
                    interfaceC22645k2 = list.get(i12);
                } catch (Exception e13) {
                    e12 = e13;
                }
                try {
                    interfaceC22645k2.a(this.f42457b);
                    i12++;
                    interfaceC22645k = interfaceC22645k2;
                } catch (Exception e14) {
                    e12 = e14;
                    interfaceC22645k = interfaceC22645k2;
                    StringBuilder sb2 = new StringBuilder();
                    StringBuilder sb3 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                    sb3.append(this.f42457b.f42458a.a());
                    sb3.append(", composition=");
                    sb3.append(this.f42457b.c());
                    sb3.append(", selection=");
                    C22649o c22649o = this.f42457b;
                    sb3.append((Object) v0.i(w0.a(c22649o.f42459b, c22649o.f42460c)));
                    sb3.append("):");
                    sb2.append(sb3.toString());
                    sb2.append('\n');
                    C42745f0.N(list, sb2, "\n", null, null, new C22647m(interfaceC22645k, this), 60);
                    throw new RuntimeException(sb2.toString(), e12);
                }
            }
            C22649o c22649o2 = this.f42457b;
            c22649o2.getClass();
            C22602e c22602e = new C22602e(c22649o2.f42458a.toString(), null, 2, null);
            C22649o c22649o3 = this.f42457b;
            long jA2 = w0.a(c22649o3.f42459b, c22649o3.f42460c);
            v0 v0VarA = v0.h(this.f42456a.f42384b) ? null : v0.a(jA2);
            W w12 = new W(c22602e, v0VarA != null ? v0VarA.f42736a : w0.a(v0.f(jA2), v0.g(jA2)), this.f42457b.c(), (C42822w) null);
            this.f42456a = w12;
            return w12;
        } catch (Exception e15) {
            interfaceC22645k = null;
            e12 = e15;
        }
    }
}
