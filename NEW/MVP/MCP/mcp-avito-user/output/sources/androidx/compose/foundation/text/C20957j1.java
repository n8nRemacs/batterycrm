package androidx.compose.foundation.text;

import android.view.KeyEvent;
import kotlin.Metadata;

/* compiled from: KeyMapping.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.j1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20957j1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final b f31540a = new b(new C20877i1(new kotlin.jvm.internal.h0() { // from class: androidx.compose.foundation.text.j1.a
        @Override // kotlin.jvm.internal.h0, kotlin.reflect.p
        public final Object get(Object obj) {
            return Boolean.valueOf(((androidx.compose.ui.input.key.c) obj).f40068a.isCtrlPressed());
        }
    }));

    /* compiled from: KeyMapping.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/text/j1$b", "Landroidx/compose/foundation/text/h1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.j1$b */
    public static final class b implements InterfaceC20873h1 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C20877i1 f31542a;

        public b(C20877i1 c20877i1) {
            this.f31542a = c20877i1;
        }

        @Override // androidx.compose.foundation.text.InterfaceC20873h1
        public final KeyCommand a(KeyEvent keyEvent) {
            KeyCommand keyCommand = null;
            if (keyEvent.isShiftPressed() && keyEvent.isCtrlPressed()) {
                long jA2 = androidx.compose.ui.input.key.i.a(keyEvent.getKeyCode());
                E1.f30222a.getClass();
                if (androidx.compose.ui.input.key.b.a(jA2, E1.f30231j)) {
                    keyCommand = KeyCommand.f30411K;
                } else if (androidx.compose.ui.input.key.b.a(jA2, E1.f30232k)) {
                    keyCommand = KeyCommand.f30412L;
                } else if (androidx.compose.ui.input.key.b.a(jA2, E1.f30233l)) {
                    keyCommand = KeyCommand.f30414N;
                } else if (androidx.compose.ui.input.key.b.a(jA2, E1.f30234m)) {
                    keyCommand = KeyCommand.f30413M;
                }
            } else if (keyEvent.isCtrlPressed()) {
                long jA3 = androidx.compose.ui.input.key.i.a(keyEvent.getKeyCode());
                E1.f30222a.getClass();
                if (androidx.compose.ui.input.key.b.a(jA3, E1.f30231j)) {
                    keyCommand = KeyCommand.f30429f;
                } else if (androidx.compose.ui.input.key.b.a(jA3, E1.f30232k)) {
                    keyCommand = KeyCommand.f30428e;
                } else if (androidx.compose.ui.input.key.b.a(jA3, E1.f30233l)) {
                    keyCommand = KeyCommand.f30431h;
                } else if (androidx.compose.ui.input.key.b.a(jA3, E1.f30234m)) {
                    keyCommand = KeyCommand.f30430g;
                } else if (androidx.compose.ui.input.key.b.a(jA3, E1.f30225d)) {
                    keyCommand = KeyCommand.f30445v;
                } else if (androidx.compose.ui.input.key.b.a(jA3, E1.f30243v)) {
                    keyCommand = KeyCommand.f30448y;
                } else if (androidx.compose.ui.input.key.b.a(jA3, E1.f30242u)) {
                    keyCommand = KeyCommand.f30447x;
                } else if (androidx.compose.ui.input.key.b.a(jA3, E1.f30230i)) {
                    keyCommand = KeyCommand.f30419S;
                }
            } else if (keyEvent.isShiftPressed()) {
                long jA4 = androidx.compose.ui.input.key.i.a(keyEvent.getKeyCode());
                E1.f30222a.getClass();
                if (androidx.compose.ui.input.key.b.a(jA4, E1.f30237p)) {
                    keyCommand = KeyCommand.f30415O;
                } else if (androidx.compose.ui.input.key.b.a(jA4, E1.f30238q)) {
                    keyCommand = KeyCommand.f30416P;
                }
            } else if (keyEvent.isAltPressed()) {
                long jA5 = androidx.compose.ui.input.key.i.a(keyEvent.getKeyCode());
                E1.f30222a.getClass();
                if (androidx.compose.ui.input.key.b.a(jA5, E1.f30242u)) {
                    keyCommand = KeyCommand.f30449z;
                } else if (androidx.compose.ui.input.key.b.a(jA5, E1.f30243v)) {
                    keyCommand = KeyCommand.f30401A;
                }
            }
            return keyCommand == null ? this.f31542a.a(keyEvent) : keyCommand;
        }
    }
}
