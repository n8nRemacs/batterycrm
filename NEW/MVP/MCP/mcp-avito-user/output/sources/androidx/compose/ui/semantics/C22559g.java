package androidx.compose.ui.semantics;

import androidx.compose.runtime.H0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SemanticsProperties.kt */
@X41.g
@H0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/semantics/g;", "", "a", "value", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.semantics.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22559g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f41736b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f41737c = 1;

    /* renamed from: a, reason: collision with root package name */
    public final int f41738a;

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/semantics/g$a;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.semantics.g$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    private /* synthetic */ C22559g(int i12) {
        this.f41738a = i12;
    }

    public static final /* synthetic */ C22559g a(int i12) {
        return new C22559g(i12);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C22559g) {
            return this.f41738a == ((C22559g) obj).f41738a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f41738a);
    }

    @Y61.k
    public final String toString() {
        int i12 = this.f41738a;
        return i12 == 0 ? "Polite" : i12 == f41737c ? "Assertive" : "Unknown";
    }
}
