package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FocusProperties.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/focus/b;", "Landroidx/compose/ui/focus/f;", "Landroidx/compose/ui/focus/e;", "requestedFocusDirection", "<init>", "(ILkotlin/jvm/internal/w;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.focus.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22217b implements InterfaceC22221f {

    /* renamed from: a, reason: collision with root package name */
    public final int f39156a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f39157b;

    public C22217b(int i12, C42822w c42822w) {
        this.f39156a = i12;
    }

    @Override // androidx.compose.ui.focus.InterfaceC22221f
    public final void a() {
        this.f39157b = true;
    }

    @Override // androidx.compose.ui.focus.InterfaceC22221f
    /* renamed from: b, reason: from getter */
    public final int getF39156a() {
        return this.f39156a;
    }
}
