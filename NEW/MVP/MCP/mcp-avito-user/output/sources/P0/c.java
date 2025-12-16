package p0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Metadata;
import p0.b;

/* compiled from: PlatformHapticFeedback.android.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lp0/c;", "Lp0/a;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c implements InterfaceC44967a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AndroidComposeView f422387a;

    public c(@k AndroidComposeView androidComposeView) {
        this.f422387a = androidComposeView;
    }

    @Override // p0.InterfaceC44967a
    public final void a(int i12) {
        b.f422385b.getClass();
        d dVar = d.f422388a;
        dVar.getClass();
        boolean zA2 = b.a(i12, d.f422389b);
        AndroidComposeView androidComposeView = this.f422387a;
        if (zA2) {
            androidComposeView.performHapticFeedback(16);
            return;
        }
        dVar.getClass();
        if (b.a(i12, d.f422390c)) {
            androidComposeView.performHapticFeedback(6);
            return;
        }
        dVar.getClass();
        if (b.a(i12, d.f422391d)) {
            androidComposeView.performHapticFeedback(13);
            return;
        }
        dVar.getClass();
        if (b.a(i12, d.f422392e)) {
            androidComposeView.performHapticFeedback(23);
            return;
        }
        b.a.a();
        if (b.a(i12, 0)) {
            androidComposeView.performHapticFeedback(0);
            return;
        }
        dVar.getClass();
        if (b.a(i12, d.f422393f)) {
            androidComposeView.performHapticFeedback(17);
            return;
        }
        dVar.getClass();
        if (b.a(i12, d.f422394g)) {
            androidComposeView.performHapticFeedback(27);
            return;
        }
        dVar.getClass();
        if (b.a(i12, d.f422395h)) {
            androidComposeView.performHapticFeedback(26);
            return;
        }
        if (b.a(i12, b.a.b())) {
            androidComposeView.performHapticFeedback(9);
            return;
        }
        dVar.getClass();
        if (b.a(i12, d.f422397j)) {
            androidComposeView.performHapticFeedback(22);
            return;
        }
        dVar.getClass();
        if (b.a(i12, d.f422398k)) {
            androidComposeView.performHapticFeedback(21);
            return;
        }
        dVar.getClass();
        if (b.a(i12, d.f422399l)) {
            androidComposeView.performHapticFeedback(1);
        }
    }
}
