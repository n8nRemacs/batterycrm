package defpackage;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes2.dex */
public final class c04 extends sj0 {
    public final /* synthetic */ int b;
    public final Serializable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c04(long j, Serializable serializable, int i) {
        super(j);
        this.b = i;
        this.c = serializable;
    }

    @Override // defpackage.sj0
    public final String toString() {
        switch (this.b) {
            case 0:
                return "ContactNotFoundEvent{contactServerIds=" + ((LinkedHashSet) this.c) + '}';
            case 1:
                return "ProfileEvent{contactInfo=" + ((gx3) this.c) + '}';
            default:
                return "SharePreviewEvent{attaches=" + ((sz) this.c) + '}';
        }
    }

    public c04(List list) {
        this.b = 0;
        this.c = new LinkedHashSet(list);
    }
}
