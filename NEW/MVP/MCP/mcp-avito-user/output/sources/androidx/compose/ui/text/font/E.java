package androidx.compose.ui.text.font;

import androidx.compose.runtime.H0;
import androidx.compose.runtime.I3;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FontFamily.kt */
@H0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/font/E;", "", "a", "b", "Landroidx/compose/ui/text/font/C;", "Landroidx/compose/ui/text/font/j0;", "Landroidx/compose/ui/text/font/t0;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class E {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f42170b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final C22627v f42171c = new C22627v();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final i0 f42172d = new i0("sans-serif", "FontFamily.SansSerif");

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final i0 f42173e = new i0("serif", "FontFamily.Serif");

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final i0 f42174f = new i0("monospace", "FontFamily.Monospace");

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final i0 f42175g = new i0("cursive", "FontFamily.Cursive");

    /* compiled from: FontFamily.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/font/E$a;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: FontFamily.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/E$b;", "", "Landroidx/compose/ui/text/font/M;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        static I3 b(b bVar, E e12, e0 e0Var, int i12, int i13, int i14) {
            if ((i14 & 2) != 0) {
                e0.f42240c.getClass();
                e0Var = e0.f42247j;
            }
            if ((i14 & 4) != 0) {
                Z.f42217b.getClass();
                i12 = 0;
            }
            if ((i14 & 8) != 0) {
                C22605a0.f42223b.getClass();
                i13 = C22605a0.f42226e;
            }
            return bVar.a(e12, e0Var, i12, i13);
        }

        @Y61.k
        C0 a(@Y61.l E e12, @Y61.k e0 e0Var, int i12, int i13);
    }

    public E(boolean z12, C42822w c42822w) {
    }
}
