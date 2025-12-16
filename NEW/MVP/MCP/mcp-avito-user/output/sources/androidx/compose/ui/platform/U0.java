package androidx.compose.ui.platform;

import android.view.View;
import kotlin.Metadata;
import p0.InterfaceC44967a;
import p0.b;

/* compiled from: HapticFeedback.android.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/U0;", "Lp0/a;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class U0 implements InterfaceC44967a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f41285a;

    public U0(@Y61.k View view) {
        this.f41285a = view;
    }

    @Override // p0.InterfaceC44967a
    public final void a(int i12) {
        p0.b.f422385b.getClass();
        p0.d dVar = p0.d.f422388a;
        dVar.getClass();
        boolean zA2 = p0.b.a(i12, p0.d.f422389b);
        View view = this.f41285a;
        if (zA2) {
            view.performHapticFeedback(16);
            return;
        }
        dVar.getClass();
        if (p0.b.a(i12, p0.d.f422390c)) {
            view.performHapticFeedback(6);
            return;
        }
        dVar.getClass();
        if (p0.b.a(i12, p0.d.f422391d)) {
            view.performHapticFeedback(13);
            return;
        }
        dVar.getClass();
        if (p0.b.a(i12, p0.d.f422392e)) {
            view.performHapticFeedback(23);
            return;
        }
        b.a.a();
        if (p0.b.a(i12, 0)) {
            view.performHapticFeedback(0);
            return;
        }
        dVar.getClass();
        if (p0.b.a(i12, p0.d.f422393f)) {
            view.performHapticFeedback(17);
            return;
        }
        dVar.getClass();
        if (p0.b.a(i12, p0.d.f422394g)) {
            view.performHapticFeedback(27);
            return;
        }
        dVar.getClass();
        if (p0.b.a(i12, p0.d.f422395h)) {
            view.performHapticFeedback(26);
            return;
        }
        if (p0.b.a(i12, b.a.b())) {
            view.performHapticFeedback(9);
            return;
        }
        dVar.getClass();
        if (p0.b.a(i12, p0.d.f422397j)) {
            view.performHapticFeedback(22);
            return;
        }
        dVar.getClass();
        if (p0.b.a(i12, p0.d.f422398k)) {
            view.performHapticFeedback(21);
            return;
        }
        dVar.getClass();
        if (p0.b.a(i12, p0.d.f422399l)) {
            view.performHapticFeedback(1);
        }
    }
}
