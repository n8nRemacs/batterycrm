package androidx.compose.ui.input.pointer;

import kotlin.Metadata;

/* compiled from: PointerIcon.android.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/b;", "Landroidx/compose/ui/input/pointer/x;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.input.pointer.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22324b implements InterfaceC22345x {

    /* renamed from: b, reason: collision with root package name */
    public final int f40201b;

    public C22324b(int i12) {
        this.f40201b = i12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return C22324b.class.equals(obj != null ? obj.getClass() : null) && this.f40201b == ((C22324b) obj).f40201b;
    }

    /* renamed from: hashCode, reason: from getter */
    public final int getF40201b() {
        return this.f40201b;
    }

    @Y61.k
    public final String toString() {
        return androidx.appcompat.app.r.t(new StringBuilder("AndroidPointerIcon(type="), this.f40201b, ')');
    }
}
