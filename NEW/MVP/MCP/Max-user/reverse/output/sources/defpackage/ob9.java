package defpackage;

import one.me.chatscreen.mediabar.mediatypepicker.MediaTypePickerWidget;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final /* synthetic */ class ob9 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaTypePickerWidget b;

    public /* synthetic */ ob9(MediaTypePickerWidget mediaTypePickerWidget, int i) {
        this.a = i;
        this.b = mediaTypePickerWidget;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        MediaTypePickerWidget mediaTypePickerWidget = this.b;
        switch (i) {
            case 0:
                hs hsVar = mediaTypePickerWidget.b;
                yy7[] yy7VarArr = MediaTypePickerWidget.X;
                yy7 yy7Var = yy7VarArr[1];
                eb9 eb9Var = (eb9) mediaTypePickerWidget.m39getSharedViewModelcp94BC8(((b1e) hsVar.a(mediaTypePickerWidget)).a, eb9.class, null).getValue();
                hs hsVar2 = mediaTypePickerWidget.a;
                yy7 yy7Var2 = yy7VarArr[0];
                return new gb9(eb9Var, ((Number) hsVar2.a(mediaTypePickerWidget)).longValue());
            default:
                yy7[] yy7VarArr2 = MediaTypePickerWidget.X;
                wa9 wa9Var = new wa9(mediaTypePickerWidget.getContext());
                gb9 gb9VarY0 = mediaTypePickerWidget.y0();
                gb9VarY0.getClass();
                k18 k18Var = gb9VarY0.Y;
                o98 o98VarD = ve3.d();
                o98VarD.add(jb9.a);
                pb2 pb2Var = (pb2) ((w63) gb9VarY0.Z.getValue()).j(gb9VarY0.c).a.getValue();
                if (pb2Var != null) {
                    boolean z = pb2Var.b.a != 0;
                    boolean z2 = pb2Var.Q() && !pb2Var.K();
                    l5c l5cVar = (l5c) ((age) k18Var.getValue());
                    l5cVar.getClass();
                    if (l5cVar.m(PmsKey.f102moneytransferbotid, 0L) != 0 && z2 && z) {
                        o98VarD.add(lb9.a);
                    }
                }
                l5c l5cVar2 = (l5c) ((age) k18Var.getValue());
                l5cVar2.getClass();
                if (l5cVar2.j(PmsKey.f134sendlocationenabled, false)) {
                    o98VarD.add(kb9.a);
                }
                o98VarD.add(hb9.a);
                o98VarD.add(ib9.a);
                wa9Var.setState(ve3.a(o98VarD));
                wa9Var.setOnClickListener(new jx0(1, mediaTypePickerWidget.y0(), gb9.class, "onButtonClicked", "onButtonClicked(Lone/me/chatscreen/mediabar/mediatypepicker/MediaTypePickerViewState$Button;)V", 0, 26));
                int i2 = 8;
                if (wa9Var.isAttachedToWindow()) {
                    wa9Var.setPadding(wa9Var.getPaddingLeft(), wa9Var.getPaddingTop(), wa9Var.getPaddingRight(), kti.d((g4i.h(null, wa9Var.getRootWindowInsets()).a.f(2).d > 0 ? 2 : 8) * vw4.d().getDisplayMetrics().density));
                } else {
                    wa9Var.addOnAttachStateChangeListener(new r40(wa9Var, i2, wa9Var));
                }
                return wa9Var;
        }
    }
}
