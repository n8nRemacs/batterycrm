package androidx.compose.ui.text;

import androidx.compose.ui.graphics.C22277p;
import androidx.compose.ui.graphics.Path;
import kotlin.G0;
import kotlin.Metadata;
import l0.g;

/* compiled from: MultiParagraph.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/M;", "paragraphInfo", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/text/M;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class F extends kotlin.jvm.internal.N implements Y41.l<M, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22277p f41913l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f41914m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f41915n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(C22277p c22277p, int i12, int i13) {
        super(1);
        this.f41913l = c22277p;
        this.f41914m = i12;
        this.f41915n = i13;
    }

    @Override // Y41.l
    public final G0 invoke(M m12) {
        M m13 = m12;
        C22277p c22277pU = m13.f41932a.u(m13.d(this.f41914m), m13.d(this.f41915n));
        long jFloatToRawIntBits = (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(m13.f41937f) & 4294967295L);
        g.a aVar = l0.g.f413384b;
        c22277pU.e(jFloatToRawIntBits);
        Path.t(this.f41913l, c22277pU);
        return G0.f406611a;
    }
}
