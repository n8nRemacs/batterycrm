package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class l9b extends i3 {
    public final /* synthetic */ int c;
    public final /* synthetic */ m9b d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9b(m9b m9bVar, int i) {
        super(12, d9b.a);
        this.c = i;
        this.d = m9bVar;
        switch (i) {
            case 1:
                super(12, j9b.a);
                break;
            default:
                break;
        }
    }

    @Override // defpackage.i3
    public final void a0(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (fni.a(obj, obj2)) {
                    return;
                }
                v1a v1aVar = a93.s0;
                m9b m9bVar = this.d;
                m9bVar.setIndicatorColor(m9b.d((f9b) obj2, v1aVar.y(m9bVar)));
                return;
            default:
                if (fni.a(obj, obj2)) {
                    return;
                }
                k9b k9bVar = (k9b) obj2;
                boolean zA = fni.a(k9bVar, g9b.a);
                m9b m9bVar2 = this.d;
                if (zA) {
                    m9bVar2.setIndicatorSize(kti.d(40 * vw4.d().getDisplayMetrics().density));
                    m9bVar2.setTrackThickness(kti.d(4 * vw4.d().getDisplayMetrics().density));
                } else if (fni.a(k9bVar, h9b.a)) {
                    m9bVar2.setIndicatorSize(kti.d(24 * vw4.d().getDisplayMetrics().density));
                    m9bVar2.setTrackThickness(kti.d(2 * vw4.d().getDisplayMetrics().density));
                } else if (fni.a(k9bVar, i9b.a)) {
                    m9bVar2.setIndicatorSize(kti.d(16 * vw4.d().getDisplayMetrics().density));
                    m9bVar2.setTrackThickness(kti.d(1 * vw4.d().getDisplayMetrics().density));
                } else if (!fni.a(k9bVar, j9b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                m9bVar2.requestLayout();
                m9bVar2.invalidate();
                return;
        }
    }
}
