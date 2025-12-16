package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: SlotTable.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/g;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22068g {

    /* renamed from: a, reason: collision with root package name */
    public int f38401a;

    public C22068g(int i12) {
        this.f38401a = i12;
    }

    public final boolean a() {
        return this.f38401a != Integer.MIN_VALUE;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{ location = ");
        return AK.c.i(this.f38401a, " }", sb2);
    }
}
