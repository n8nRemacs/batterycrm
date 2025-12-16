package androidx.compose.ui.input.pointer;

import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PointerEvent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/d;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* renamed from: androidx.compose.ui.input.pointer.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22326d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f40203a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f40204b;

    public C22326d() {
        this(false, false, 3, null);
    }

    public C22326d(boolean z12, boolean z13, int i12, C42822w c42822w) {
        z12 = (i12 & 1) != 0 ? false : z12;
        z13 = (i12 & 2) != 0 ? false : z13;
        this.f40203a = z12;
        this.f40204b = z13;
    }
}
