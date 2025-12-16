package androidx.compose.ui.text.style;

import androidx.compose.runtime.H0;
import androidx.compose.ui.unit.y;
import androidx.compose.ui.unit.z;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TextIndent.kt */
@H0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/style/p;", "", "Landroidx/compose/ui/unit/y;", "firstLine", "restLine", "<init>", "(JJLkotlin/jvm/internal/w;)V", "a", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f42706c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final p f42707d = new p(0, 0, 3, null);

    /* renamed from: a, reason: collision with root package name */
    public final long f42708a;

    /* renamed from: b, reason: collision with root package name */
    public final long f42709b;

    /* compiled from: TextIndent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/style/p$a;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public p(long j12, long j13, C42822w c42822w) {
        this.f42708a = j12;
        this.f42709b = j13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return y.b(this.f42708a, pVar.f42708a) && y.b(this.f42709b, pVar.f42709b);
    }

    public final int hashCode() {
        y.a aVar = y.f42874b;
        return Long.hashCode(this.f42709b) + (Long.hashCode(this.f42708a) * 31);
    }

    @Y61.k
    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) y.f(this.f42708a)) + ", restLine=" + ((Object) y.f(this.f42709b)) + ')';
    }

    public /* synthetic */ p(long j12, long j13, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? z.e(0) : j12, (i12 & 2) != 0 ? z.e(0) : j13, null);
    }
}
