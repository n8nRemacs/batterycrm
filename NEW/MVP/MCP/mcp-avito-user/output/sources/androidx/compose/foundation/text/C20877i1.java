package androidx.compose.foundation.text;

import android.view.KeyEvent;
import kotlin.Metadata;

/* compiled from: KeyMapping.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/i1;", "Landroidx/compose/foundation/text/h1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20877i1 implements InterfaceC20873h1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y41.l<androidx.compose.ui.input.key.c, Boolean> f30745a;

    /* JADX WARN: Multi-variable type inference failed */
    public C20877i1(Y41.l<? super androidx.compose.ui.input.key.c, Boolean> lVar) {
        this.f30745a = lVar;
    }

    @Override // androidx.compose.foundation.text.InterfaceC20873h1
    public final KeyCommand a(KeyEvent keyEvent) {
        androidx.compose.ui.input.key.c cVarA = androidx.compose.ui.input.key.c.a(keyEvent);
        Y41.l<androidx.compose.ui.input.key.c, Boolean> lVar = this.f30745a;
        if (lVar.invoke(cVarA).booleanValue() && keyEvent.isShiftPressed()) {
            long jA2 = androidx.compose.ui.input.key.i.a(keyEvent.getKeyCode());
            E1.f30222a.getClass();
            if (androidx.compose.ui.input.key.b.a(jA2, E1.f30229h)) {
                return KeyCommand.f30423W;
            }
            return null;
        }
        boolean zBooleanValue = lVar.invoke(androidx.compose.ui.input.key.c.a(keyEvent)).booleanValue();
        boolean zA2 = true;
        if (zBooleanValue) {
            long jA3 = androidx.compose.ui.input.key.e.a(keyEvent);
            E1 e12 = E1.f30222a;
            e12.getClass();
            if (!androidx.compose.ui.input.key.b.a(jA3, E1.f30224c)) {
                e12.getClass();
                zA2 = androidx.compose.ui.input.key.b.a(jA3, E1.f30239r);
            }
            if (zA2) {
                return KeyCommand.f30442s;
            }
            e12.getClass();
            if (androidx.compose.ui.input.key.b.a(jA3, E1.f30226e)) {
                return KeyCommand.f30443t;
            }
            e12.getClass();
            if (androidx.compose.ui.input.key.b.a(jA3, E1.f30228g)) {
                return KeyCommand.f30444u;
            }
            e12.getClass();
            if (androidx.compose.ui.input.key.b.a(jA3, E1.f30223b)) {
                return KeyCommand.f30402B;
            }
            e12.getClass();
            if (androidx.compose.ui.input.key.b.a(jA3, E1.f30227f)) {
                return KeyCommand.f30423W;
            }
            e12.getClass();
            if (androidx.compose.ui.input.key.b.a(jA3, E1.f30229h)) {
                return KeyCommand.f30422V;
            }
            return null;
        }
        if (keyEvent.isCtrlPressed()) {
            return null;
        }
        if (keyEvent.isShiftPressed()) {
            long jA4 = androidx.compose.ui.input.key.i.a(keyEvent.getKeyCode());
            E1 e13 = E1.f30222a;
            e13.getClass();
            if (androidx.compose.ui.input.key.b.a(jA4, E1.f30231j)) {
                return KeyCommand.f30403C;
            }
            e13.getClass();
            if (androidx.compose.ui.input.key.b.a(jA4, E1.f30232k)) {
                return KeyCommand.f30404D;
            }
            e13.getClass();
            if (androidx.compose.ui.input.key.b.a(jA4, E1.f30233l)) {
                return KeyCommand.f30405E;
            }
            e13.getClass();
            if (androidx.compose.ui.input.key.b.a(jA4, E1.f30234m)) {
                return KeyCommand.f30406F;
            }
            e13.getClass();
            if (androidx.compose.ui.input.key.b.a(jA4, E1.f30235n)) {
                return KeyCommand.f30407G;
            }
            e13.getClass();
            if (androidx.compose.ui.input.key.b.a(jA4, E1.f30236o)) {
                return KeyCommand.f30408H;
            }
            e13.getClass();
            if (androidx.compose.ui.input.key.b.a(jA4, E1.f30237p)) {
                return KeyCommand.f30415O;
            }
            e13.getClass();
            if (androidx.compose.ui.input.key.b.a(jA4, E1.f30238q)) {
                return KeyCommand.f30416P;
            }
            e13.getClass();
            if (androidx.compose.ui.input.key.b.a(jA4, E1.f30239r)) {
                return KeyCommand.f30443t;
            }
            return null;
        }
        long jA5 = androidx.compose.ui.input.key.i.a(keyEvent.getKeyCode());
        E1 e14 = E1.f30222a;
        e14.getClass();
        if (androidx.compose.ui.input.key.b.a(jA5, E1.f30231j)) {
            return KeyCommand.f30426c;
        }
        e14.getClass();
        if (androidx.compose.ui.input.key.b.a(jA5, E1.f30232k)) {
            return KeyCommand.f30427d;
        }
        e14.getClass();
        if (androidx.compose.ui.input.key.b.a(jA5, E1.f30233l)) {
            return KeyCommand.f30436m;
        }
        e14.getClass();
        if (androidx.compose.ui.input.key.b.a(jA5, E1.f30234m)) {
            return KeyCommand.f30437n;
        }
        e14.getClass();
        if (androidx.compose.ui.input.key.b.a(jA5, E1.f30235n)) {
            return KeyCommand.f30438o;
        }
        e14.getClass();
        if (androidx.compose.ui.input.key.b.a(jA5, E1.f30236o)) {
            return KeyCommand.f30439p;
        }
        e14.getClass();
        if (androidx.compose.ui.input.key.b.a(jA5, E1.f30237p)) {
            return KeyCommand.f30432i;
        }
        e14.getClass();
        if (androidx.compose.ui.input.key.b.a(jA5, E1.f30238q)) {
            return KeyCommand.f30433j;
        }
        e14.getClass();
        if (!androidx.compose.ui.input.key.b.a(jA5, E1.f30240s)) {
            e14.getClass();
            zA2 = androidx.compose.ui.input.key.b.a(jA5, E1.f30241t);
        }
        if (zA2) {
            return KeyCommand.f30420T;
        }
        e14.getClass();
        if (androidx.compose.ui.input.key.b.a(jA5, E1.f30242u)) {
            return KeyCommand.f30445v;
        }
        e14.getClass();
        if (androidx.compose.ui.input.key.b.a(jA5, E1.f30243v)) {
            return KeyCommand.f30446w;
        }
        e14.getClass();
        if (androidx.compose.ui.input.key.b.a(jA5, E1.f30244w)) {
            return KeyCommand.f30443t;
        }
        e14.getClass();
        if (androidx.compose.ui.input.key.b.a(jA5, E1.f30245x)) {
            return KeyCommand.f30444u;
        }
        e14.getClass();
        if (androidx.compose.ui.input.key.b.a(jA5, E1.f30246y)) {
            return KeyCommand.f30442s;
        }
        e14.getClass();
        if (androidx.compose.ui.input.key.b.a(jA5, E1.f30247z)) {
            return KeyCommand.f30421U;
        }
        return null;
    }
}
