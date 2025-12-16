package androidx.compose.ui.node;

import kotlin.Metadata;

/* compiled from: NodeKind.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0081@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/node/z0;", "T", "", "mask", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.node.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22449z0<T> {

    /* renamed from: a, reason: collision with root package name */
    public final int f40959a;

    public final boolean equals(Object obj) {
        if (obj instanceof C22449z0) {
            return this.f40959a == ((C22449z0) obj).f40959a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f40959a);
    }

    public final String toString() {
        return androidx.appcompat.app.r.t(new StringBuilder("NodeKind(mask="), this.f40959a, ')');
    }
}
