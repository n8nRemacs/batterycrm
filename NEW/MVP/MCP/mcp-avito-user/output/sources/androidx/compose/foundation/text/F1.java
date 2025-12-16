package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ContextMenu.android.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0081@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text/F1;", "", "a", "value", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class F1 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f30249b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f30250a;

    /* compiled from: ContextMenu.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/text/F1$a;", "", "<init>", "()V", "", "AUTO_FILL", "I", "COPY", "CUT", "NONE", "PASTE", "SELECT_ALL", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    private /* synthetic */ F1(int i12) {
        this.f30250a = i12;
    }

    public static final /* synthetic */ F1 a(int i12) {
        return new F1(i12);
    }

    public static int b(boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        return (z12 ? 1 : 0) | (z13 ? 2 : 0) | (z14 ? 4 : 0) | (z15 ? 8 : 0) | (z16 ? 16 : 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof F1) {
            return this.f30250a == ((F1) obj).f30250a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f30250a);
    }

    public final String toString() {
        return androidx.appcompat.app.r.t(new StringBuilder("MenuItemsAvailability(value="), this.f30250a, ')');
    }
}
