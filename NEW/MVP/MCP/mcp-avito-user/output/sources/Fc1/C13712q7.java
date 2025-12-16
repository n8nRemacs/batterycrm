package Fc1;

import android.view.Window;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: Fc1.q7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13712q7 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DialogC13657k6 f5771l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13712q7(DialogC13657k6 dialogC13657k6) {
        super(0);
        this.f5771l = dialogC13657k6;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        DialogC13657k6 dialogC13657k6 = this.f5771l;
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorS = dialogC13657k6.s();
        bottomSheetBehaviorS.N(1, false);
        bottomSheetBehaviorS.f355973J = true;
        bottomSheetBehaviorS.f356008n = true;
        Window window = dialogC13657k6.getWindow();
        if (window != null) {
            window.clearFlags(2);
            window.addFlags(32);
        }
        FrameLayout frameLayout = (FrameLayout) dialogC13657k6.f5632s.getValue();
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(0);
        }
        V1 v12 = dialogC13657k6.f5630q;
        InterfaceC13753v4 interfaceC13753v4B = v12.b();
        if (interfaceC13753v4B.p()) {
            v12.a().a(interfaceC13753v4B.h(), interfaceC13753v4B.a(), interfaceC13753v4B.k());
        }
        return kotlin.G0.f406611a;
    }
}
