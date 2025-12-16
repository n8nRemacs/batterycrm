package androidx.compose.ui.text;

import androidx.compose.ui.text.C22674v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AndroidTextStyle.android.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u001d\b\u0016\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0002\u0010\bB\u0013\b\u0016\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/W;", "", "<init>", "()V", "Landroidx/compose/ui/text/v;", "emojiSupportMatch", "", "includeFontPadding", "(IZLkotlin/jvm/internal/w;)V", "(ILkotlin/jvm/internal/w;)V", "a", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class W {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f41965c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final W f41966d = new W();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f41967a;

    /* renamed from: b, reason: collision with root package name */
    public final int f41968b;

    /* compiled from: AndroidTextStyle.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/W$a;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public W(boolean z12) {
        this.f41967a = z12;
        C22674v.f42730b.getClass();
        this.f41968b = 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w12 = (W) obj;
        if (this.f41967a != w12.f41967a) {
            return false;
        }
        C22674v.a aVar = C22674v.f42730b;
        return this.f41968b == w12.f41968b;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f41967a) * 31;
        C22674v.a aVar = C22674v.f42730b;
        return Integer.hashCode(this.f41968b) + iHashCode;
    }

    @Y61.k
    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f41967a + ", emojiSupportMatch=" + ((Object) C22674v.b(this.f41968b)) + ')';
    }

    public /* synthetic */ W(boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public W(int i12, boolean z12, int i13, C42822w c42822w) {
        if ((i13 & 1) != 0) {
            C22674v.f42730b.getClass();
            i12 = 0;
        }
        this(i12, (i13 & 2) != 0 ? false : z12, (C42822w) null);
    }

    public W(int i12, boolean z12, C42822w c42822w) {
        this.f41967a = z12;
        this.f41968b = i12;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public W(int i12, int i13, C42822w c42822w) {
        if ((i13 & 1) != 0) {
            C22674v.f42730b.getClass();
            i12 = 0;
        }
        this(i12, null);
    }

    public W(int i12, C42822w c42822w) {
        this.f41967a = false;
        this.f41968b = i12;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public W() {
        this(0, false, (C42822w) null);
        C22674v.f42730b.getClass();
    }
}
