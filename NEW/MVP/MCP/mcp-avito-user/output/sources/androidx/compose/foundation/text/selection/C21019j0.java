package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import l0.g;

/* compiled from: SelectionHandles.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/text/selection/j0;", "", "Landroidx/compose/foundation/text/Handle;", "handle", "Ll0/g;", "position", "Landroidx/compose/foundation/text/selection/SelectionHandleAnchor;", "anchor", "", "visible", "<init>", "(Landroidx/compose/foundation/text/Handle;JLandroidx/compose/foundation/text/selection/SelectionHandleAnchor;ZLkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.selection.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* data */ class C21019j0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Handle f32043a;

    /* renamed from: b, reason: collision with root package name */
    public final long f32044b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SelectionHandleAnchor f32045c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f32046d;

    public C21019j0(Handle handle, long j12, SelectionHandleAnchor selectionHandleAnchor, boolean z12, C42822w c42822w) {
        this.f32043a = handle;
        this.f32044b = j12;
        this.f32045c = selectionHandleAnchor;
        this.f32046d = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21019j0)) {
            return false;
        }
        C21019j0 c21019j0 = (C21019j0) obj;
        return this.f32043a == c21019j0.f32043a && l0.g.d(this.f32044b, c21019j0.f32044b) && this.f32045c == c21019j0.f32045c && this.f32046d == c21019j0.f32046d;
    }

    public final int hashCode() {
        int iHashCode = this.f32043a.hashCode() * 31;
        g.a aVar = l0.g.f413384b;
        return Boolean.hashCode(this.f32046d) + ((this.f32045c.hashCode() + androidx.appcompat.app.r.g(iHashCode, 31, this.f32044b)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionHandleInfo(handle=");
        sb2.append(this.f32043a);
        sb2.append(", position=");
        sb2.append((Object) l0.g.l(this.f32044b));
        sb2.append(", anchor=");
        sb2.append(this.f32045c);
        sb2.append(", visible=");
        return androidx.appcompat.app.r.x(sb2, this.f32046d, ')');
    }
}
