package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import l0.g;

/* compiled from: TextFieldHandleState.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\rB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/g;", "", "", "visible", "Ll0/g;", "position", "", "lineHeight", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "direction", "handlesCrossed", "<init>", "(ZJFLandroidx/compose/ui/text/style/ResolvedTextDirection;ZLkotlin/jvm/internal/w;)V", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.input.internal.selection.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* data */ class C20922g {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f31366f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final C20922g f31367g;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f31368a;

    /* renamed from: b, reason: collision with root package name */
    public final long f31369b;

    /* renamed from: c, reason: collision with root package name */
    public final float f31370c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ResolvedTextDirection f31371d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f31372e;

    /* compiled from: TextFieldHandleState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/g$a;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.g$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        l0.g.f413384b.getClass();
        f31367g = new C20922g(false, l0.g.f413386d, 0.0f, ResolvedTextDirection.f42625b, false, null);
    }

    public C20922g(boolean z12, long j12, float f12, ResolvedTextDirection resolvedTextDirection, boolean z13, C42822w c42822w) {
        this.f31368a = z12;
        this.f31369b = j12;
        this.f31370c = f12;
        this.f31371d = resolvedTextDirection;
        this.f31372e = z13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20922g)) {
            return false;
        }
        C20922g c20922g = (C20922g) obj;
        return this.f31368a == c20922g.f31368a && l0.g.d(this.f31369b, c20922g.f31369b) && Float.compare(this.f31370c, c20922g.f31370c) == 0 && this.f31371d == c20922g.f31371d && this.f31372e == c20922g.f31372e;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f31368a) * 31;
        g.a aVar = l0.g.f413384b;
        return Boolean.hashCode(this.f31372e) + ((this.f31371d.hashCode() + androidx.appcompat.app.r.d(this.f31370c, androidx.appcompat.app.r.g(iHashCode, 31, this.f31369b), 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextFieldHandleState(visible=");
        sb2.append(this.f31368a);
        sb2.append(", position=");
        sb2.append((Object) l0.g.l(this.f31369b));
        sb2.append(", lineHeight=");
        sb2.append(this.f31370c);
        sb2.append(", direction=");
        sb2.append(this.f31371d);
        sb2.append(", handlesCrossed=");
        return androidx.appcompat.app.r.x(sb2, this.f31372e, ')');
    }
}
