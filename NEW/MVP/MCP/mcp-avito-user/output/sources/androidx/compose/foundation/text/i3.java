package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UndoManager.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/i3;", "", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f30746a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public a f30747b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public a f30748c;

    /* renamed from: d, reason: collision with root package name */
    public int f30749d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Long f30750e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f30751f;

    /* compiled from: UndoManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/i3$a;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public a f30752a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public androidx.compose.ui.text.input.W f30753b;

        public a(@Y61.l a aVar, @Y61.k androidx.compose.ui.text.input.W w12) {
            this.f30752a = aVar;
            this.f30753b = w12;
        }

        public /* synthetic */ a(a aVar, androidx.compose.ui.text.input.W w12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : aVar, w12);
        }
    }

    public i3() {
        this(0, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@Y61.k androidx.compose.ui.text.input.W r4) {
        /*
            r3 = this;
            r0 = 0
            r3.f30751f = r0
            androidx.compose.foundation.text.i3$a r0 = r3.f30747b
            r1 = 0
            if (r0 == 0) goto Lb
            androidx.compose.ui.text.input.W r0 = r0.f30753b
            goto Lc
        Lb:
            r0 = r1
        Lc:
            boolean r0 = kotlin.jvm.internal.L.f(r4, r0)
            if (r0 == 0) goto L13
            return
        L13:
            androidx.compose.ui.text.e r0 = r4.f42383a
            java.lang.String r0 = r0.f42127c
            androidx.compose.foundation.text.i3$a r2 = r3.f30747b
            if (r2 == 0) goto L24
            androidx.compose.ui.text.input.W r2 = r2.f30753b
            if (r2 == 0) goto L24
            androidx.compose.ui.text.e r2 = r2.f42383a
            java.lang.String r2 = r2.f42127c
            goto L25
        L24:
            r2 = r1
        L25:
            boolean r0 = kotlin.jvm.internal.L.f(r0, r2)
            if (r0 == 0) goto L33
            androidx.compose.foundation.text.i3$a r0 = r3.f30747b
            if (r0 != 0) goto L30
            goto L32
        L30:
            r0.f30753b = r4
        L32:
            return
        L33:
            androidx.compose.foundation.text.i3$a r0 = r3.f30747b
            androidx.compose.foundation.text.i3$a r2 = new androidx.compose.foundation.text.i3$a
            r2.<init>(r0, r4)
            r3.f30747b = r2
            r3.f30748c = r1
            int r0 = r3.f30749d
            androidx.compose.ui.text.e r4 = r4.f42383a
            java.lang.String r4 = r4.f42127c
            int r4 = r4.length()
            int r4 = r4 + r0
            r3.f30749d = r4
            int r0 = r3.f30746a
            if (r4 <= r0) goto L6e
            androidx.compose.foundation.text.i3$a r4 = r3.f30747b
            if (r4 == 0) goto L56
            androidx.compose.foundation.text.i3$a r0 = r4.f30752a
            goto L57
        L56:
            r0 = r1
        L57:
            if (r0 != 0) goto L5a
            goto L6e
        L5a:
            if (r4 == 0) goto L63
            androidx.compose.foundation.text.i3$a r0 = r4.f30752a
            if (r0 == 0) goto L63
            androidx.compose.foundation.text.i3$a r0 = r0.f30752a
            goto L64
        L63:
            r0 = r1
        L64:
            if (r0 == 0) goto L69
            androidx.compose.foundation.text.i3$a r4 = r4.f30752a
            goto L5a
        L69:
            if (r4 != 0) goto L6c
            goto L6e
        L6c:
            r4.f30752a = r1
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.i3.a(androidx.compose.ui.text.input.W):void");
    }

    public i3(int i12, int i13, C42822w c42822w) {
        this.f30746a = (i13 & 1) != 0 ? 100000 : i12;
    }
}
