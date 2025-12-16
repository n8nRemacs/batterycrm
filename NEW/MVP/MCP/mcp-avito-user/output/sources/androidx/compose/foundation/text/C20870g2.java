package androidx.compose.foundation.text;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.ui.focus.C22220e;
import androidx.compose.ui.platform.InterfaceC22489j2;
import kotlin.Metadata;

/* compiled from: TextFieldFocusModifier.android.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/key/c;", "keyEvent", "", "invoke-ZmokQxo", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.text.g2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20870g2 extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.input.key.c, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.focus.r f30714l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C20985q1 f30715m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20870g2(androidx.compose.ui.focus.r rVar, C20985q1 c20985q1) {
        super(1);
        this.f30714l = rVar;
        this.f30715m = c20985q1;
    }

    @Override // Y41.l
    public final Boolean invoke(androidx.compose.ui.input.key.c cVar) {
        KeyEvent keyEvent = cVar.f40068a;
        InputDevice device = keyEvent.getDevice();
        boolean zH2 = false;
        if (device != null && device.supportsSource(513) && !device.isVirtual()) {
            int iB2 = androidx.compose.ui.input.key.e.b(keyEvent);
            androidx.compose.ui.input.key.d.f40069b.getClass();
            if (androidx.compose.ui.input.key.d.a(iB2, androidx.compose.ui.input.key.d.f40071d) && keyEvent.getSource() != 257) {
                boolean zA2 = C20874h2.a(19, keyEvent);
                androidx.compose.ui.focus.r rVar = this.f30714l;
                if (zA2) {
                    C22220e.f39163b.getClass();
                    zH2 = rVar.h(C22220e.f39168g);
                } else if (C20874h2.a(20, keyEvent)) {
                    C22220e.f39163b.getClass();
                    zH2 = rVar.h(C22220e.f39169h);
                } else if (C20874h2.a(21, keyEvent)) {
                    C22220e.f39163b.getClass();
                    zH2 = rVar.h(C22220e.f39166e);
                } else if (C20874h2.a(22, keyEvent)) {
                    C22220e.f39163b.getClass();
                    zH2 = rVar.h(C22220e.f39167f);
                } else if (C20874h2.a(23, keyEvent)) {
                    InterfaceC22489j2 interfaceC22489j2 = this.f30715m.f31780c;
                    if (interfaceC22489j2 != null) {
                        interfaceC22489j2.show();
                    }
                    zH2 = true;
                }
            }
        }
        return Boolean.valueOf(zH2);
    }
}
