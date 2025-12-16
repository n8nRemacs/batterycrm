package androidx.compose.ui.text.style;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TextOverflow.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/style/s;", "", "a", "value", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f42720b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f42721c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f42722d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f42723e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f42724f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f42725g = 5;

    /* renamed from: a, reason: collision with root package name */
    public final int f42726a;

    /* compiled from: TextOverflow.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/style/s$a;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public static final boolean a(int i12, int i13) {
        return i12 == i13;
    }

    @Y61.k
    public static String b(int i12) {
        return a(i12, f42721c) ? "Clip" : a(i12, f42722d) ? "Ellipsis" : a(i12, f42725g) ? "MiddleEllipsis" : a(i12, f42723e) ? "Visible" : a(i12, f42724f) ? "StartEllipsis" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f42726a == ((s) obj).f42726a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42726a);
    }

    @Y61.k
    public final String toString() {
        return b(this.f42726a);
    }
}
