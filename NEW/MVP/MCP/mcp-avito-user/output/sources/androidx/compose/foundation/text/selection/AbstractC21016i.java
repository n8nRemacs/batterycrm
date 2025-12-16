package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.N1;
import androidx.compose.foundation.text.selection.AbstractC21016i;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.v0;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import l0.g;

/* compiled from: TextPreparedSelection.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002:\u0001\u000fB1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/text/selection/i;", "T", "", "Landroidx/compose/ui/text/e;", "originalText", "Landroidx/compose/ui/text/v0;", "originalSelection", "Landroidx/compose/ui/text/o0;", "layoutResult", "Landroidx/compose/ui/text/input/L;", "offsetMapping", "Landroidx/compose/foundation/text/selection/C1;", VoiceInfo.STATE, "<init>", "(Landroidx/compose/ui/text/e;JLandroidx/compose/ui/text/o0;Landroidx/compose/ui/text/input/L;Landroidx/compose/foundation/text/selection/C1;Lkotlin/jvm/internal/w;)V", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.selection.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC21016i<T extends AbstractC21016i<T>> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C22602e f32033a;

    /* renamed from: b, reason: collision with root package name */
    public final long f32034b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final androidx.compose.ui.text.o0 f32035c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.text.input.L f32036d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C1 f32037e;

    /* renamed from: f, reason: collision with root package name */
    public long f32038f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C22602e f32039g;

    /* compiled from: TextPreparedSelection.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/selection/i$a;", "", "<init>", "()V", "", "NoCharacterFound", "I", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.i$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public AbstractC21016i(C22602e c22602e, long j12, androidx.compose.ui.text.o0 o0Var, androidx.compose.ui.text.input.L l12, C1 c12, C42822w c42822w) {
        this.f32033a = c22602e;
        this.f32034b = j12;
        this.f32035c = o0Var;
        this.f32036d = l12;
        this.f32037e = c12;
        this.f32038f = j12;
        this.f32039g = c22602e;
    }

    @Y61.l
    public final Integer a() {
        androidx.compose.ui.text.o0 o0Var = this.f32035c;
        if (o0Var == null) {
            return null;
        }
        int iF2 = androidx.compose.ui.text.v0.f(this.f32038f);
        androidx.compose.ui.text.input.L l12 = this.f32036d;
        int iB2 = l12.b(iF2);
        androidx.compose.ui.text.G g12 = o0Var.f42527b;
        return Integer.valueOf(l12.a(g12.c(g12.d(iB2), true)));
    }

    @Y61.l
    public final Integer b() {
        androidx.compose.ui.text.o0 o0Var = this.f32035c;
        if (o0Var == null) {
            return null;
        }
        int iG2 = androidx.compose.ui.text.v0.g(this.f32038f);
        androidx.compose.ui.text.input.L l12 = this.f32036d;
        return Integer.valueOf(l12.a(o0Var.i(o0Var.f42527b.d(l12.b(iG2)))));
    }

    @Y61.l
    public final Integer c() {
        int length;
        androidx.compose.ui.text.o0 o0Var = this.f32035c;
        if (o0Var == null) {
            return null;
        }
        int iM2 = m();
        while (true) {
            C22602e c22602e = this.f32033a;
            if (iM2 < c22602e.f42127c.length()) {
                int length2 = this.f32039g.f42127c.length() - 1;
                if (iM2 <= length2) {
                    length2 = iM2;
                }
                long jL2 = o0Var.l(length2);
                v0.a aVar = androidx.compose.ui.text.v0.f42734b;
                int i12 = (int) (jL2 & 4294967295L);
                if (i12 > iM2) {
                    length = this.f32036d.a(i12);
                    break;
                }
                iM2++;
            } else {
                length = c22602e.f42127c.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    @Y61.l
    public final Integer d() {
        int iA2;
        androidx.compose.ui.text.o0 o0Var = this.f32035c;
        if (o0Var == null) {
            return null;
        }
        int iM2 = m();
        while (true) {
            if (iM2 <= 0) {
                iA2 = 0;
                break;
            }
            int length = this.f32039g.f42127c.length() - 1;
            if (iM2 <= length) {
                length = iM2;
            }
            long jL2 = o0Var.l(length);
            v0.a aVar = androidx.compose.ui.text.v0.f42734b;
            int i12 = (int) (jL2 >> 32);
            if (i12 < iM2) {
                iA2 = this.f32036d.a(i12);
                break;
            }
            iM2--;
        }
        return Integer.valueOf(iA2);
    }

    public final boolean e() {
        androidx.compose.ui.text.o0 o0Var = this.f32035c;
        return (o0Var != null ? o0Var.j(m()) : null) != ResolvedTextDirection.f42626c;
    }

    public final int f(androidx.compose.ui.text.o0 o0Var, int i12) {
        int iM2 = m();
        C1 c12 = this.f32037e;
        if (c12.f31828a == null) {
            c12.f31828a = Float.valueOf(o0Var.c(iM2).f413390a);
        }
        int iD2 = o0Var.f42527b.d(iM2) + i12;
        if (iD2 < 0) {
            return 0;
        }
        androidx.compose.ui.text.G g12 = o0Var.f42527b;
        if (iD2 >= g12.f41921f) {
            return this.f32039g.f42127c.length();
        }
        float fB2 = g12.b(iD2) - 1;
        float fFloatValue = c12.f31828a.floatValue();
        if ((e() && fFloatValue >= o0Var.h(iD2)) || (!e() && fFloatValue <= o0Var.g(iD2))) {
            return g12.c(iD2, true);
        }
        long jFloatToRawIntBits = (Float.floatToRawIntBits(r1.floatValue()) << 32) | (Float.floatToRawIntBits(fB2) & 4294967295L);
        g.a aVar = l0.g.f413384b;
        return this.f32036d.a(g12.g(jFloatToRawIntBits));
    }

    @Y61.k
    public final void g() {
        this.f32037e.f31828a = null;
        C22602e c22602e = this.f32039g;
        if (c22602e.f42127c.length() > 0) {
            int iF2 = androidx.compose.ui.text.v0.f(this.f32038f);
            String str = c22602e.f42127c;
            int iA2 = N1.a(iF2, str);
            if (iA2 == androidx.compose.ui.text.v0.f(this.f32038f) && iA2 != str.length()) {
                iA2 = N1.a(iA2 + 1, str);
            }
            l(iA2, iA2);
        }
    }

    @Y61.k
    public final void h() {
        this.f32037e.f31828a = null;
        C22602e c22602e = this.f32039g;
        if (c22602e.f42127c.length() > 0) {
            int iG2 = androidx.compose.ui.text.v0.g(this.f32038f);
            String str = c22602e.f42127c;
            int iB2 = N1.b(iG2, str);
            if (iB2 == androidx.compose.ui.text.v0.g(this.f32038f) && iB2 != 0) {
                iB2 = N1.b(iB2 - 1, str);
            }
            l(iB2, iB2);
        }
    }

    @Y61.k
    public final void i() {
        Integer numA;
        this.f32037e.f31828a = null;
        if (this.f32039g.f42127c.length() <= 0 || (numA = a()) == null) {
            return;
        }
        int iIntValue = numA.intValue();
        l(iIntValue, iIntValue);
    }

    @Y61.k
    public final void j() {
        Integer numB;
        this.f32037e.f31828a = null;
        if (this.f32039g.f42127c.length() <= 0 || (numB = b()) == null) {
            return;
        }
        int iIntValue = numB.intValue();
        l(iIntValue, iIntValue);
    }

    @Y61.k
    public final void k() {
        if (this.f32039g.f42127c.length() > 0) {
            v0.a aVar = androidx.compose.ui.text.v0.f42734b;
            this.f32038f = androidx.compose.ui.text.w0.a((int) (this.f32034b >> 32), (int) (this.f32038f & 4294967295L));
        }
    }

    public final void l(int i12, int i13) {
        this.f32038f = androidx.compose.ui.text.w0.a(i12, i13);
    }

    public final int m() {
        long j12 = this.f32038f;
        v0.a aVar = androidx.compose.ui.text.v0.f42734b;
        return this.f32036d.b((int) (j12 & 4294967295L));
    }
}
