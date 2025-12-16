package defpackage;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;
import one.me.login.inputphone.InputPhoneScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes.dex */
public final class li1 implements TextWatcher {
    public final /* synthetic */ int a;
    public Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ li1(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(Editable editable) {
    }

    private final void d(Editable editable) {
    }

    private final void e(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void f(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void g(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void h(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void i(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void j(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void k(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void l(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void m(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void n(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void o(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k18] */
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String string;
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                CallOpponentsListWidget callOpponentsListWidget = (CallOpponentsListWidget) obj;
                ?? r0 = callOpponentsListWidget.X;
                w3b w3bVar = (w3b) this.b;
                if (editable == null || vmf.F(editable)) {
                    ArrayList arrayList = b6g.a;
                    w3bVar.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                } else if (!fni.a(w3bVar.getCompoundDrawablesRelative()[2], (Drawable) r0.getValue())) {
                    Drawable drawable = (Drawable) r0.getValue();
                    ArrayList arrayList2 = b6g.a;
                    w3bVar.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                }
                yy7[] yy7VarArr = CallOpponentsListWidget.H0;
                ci1 ci1VarE0 = callOpponentsListWidget.E0();
                if (editable == null || (string = editable.toString()) == null) {
                    string = "";
                }
                svi.e(ci1VarE0.a, ((q2b) ci1VarE0.o).f(), null, new xh1(ci1VarE0, string, null), 2);
                break;
            case 1:
                ((em6) this.b).invoke(String.valueOf(editable));
                gu4 gu4Var = (gu4) obj;
                gu4Var.t0.setText(String.valueOf(gu4Var.getMaxCount() - (editable != null ? editable.length() : 0)));
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                break;
            case 6:
                ((pu8) this.b).invoke(((ik9) obj).getText());
                break;
            default:
                if (((xwe) this.b).G0.isFocused()) {
                    ((ncc) obj).invoke(String.valueOf(editable));
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Character chZ;
        Object next;
        int i4 = this.a;
        Object obj = this.c;
        switch (i4) {
            case 0:
            case 1:
                break;
            case 2:
                ((rgc) this.b).invoke(String.valueOf(charSequence));
                ((y06) obj).F(null);
                break;
            case 3:
                InputPhoneScreen inputPhoneScreen = (InputPhoneScreen) obj;
                String strValueOf = String.valueOf(charSequence);
                if (!fni.a((String) this.b, strValueOf)) {
                    yy7[] yy7VarArr = InputPhoneScreen.C0;
                    yn7 yn7VarD0 = inputPhoneScreen.D0();
                    yn7VarD0.getClass();
                    yn7VarD0.w0.O(yn7VarD0, yn7.H0[1], xfh.o(yn7VarD0, null, new qn7(yn7VarD0, null), 1));
                    this.b = strValueOf;
                    hs hsVar = inputPhoneScreen.d;
                    yy7 yy7Var = InputPhoneScreen.C0[0];
                    hsVar.b(inputPhoneScreen, strValueOf);
                    yn7 yn7VarD02 = inputPhoneScreen.D0();
                    String code = inputPhoneScreen.C0().getCode();
                    yn7VarD02.getClass();
                    String strConcat = code.concat(strValueOf);
                    yn7VarD02.E0.setValue(strConcat);
                    String str = (fni.a(strConcat != null ? Boolean.valueOf(vmf.U(strConcat, "+7", false)) : null, Boolean.TRUE) && (chZ = vmf.z(2, strConcat)) != null) ? ve3.j('0', '6', '7').contains(chZ) ? "KZ" : "RU" : null;
                    if (str != null) {
                        Iterator it = ((Iterable) yn7VarD02.z0.a.getValue()).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                if (fni.a(((x2b) next).a, str)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        x2b x2bVar = (x2b) next;
                        if (x2bVar != null) {
                            yn7VarD02.x0.m(null, x2bVar);
                            break;
                        }
                    }
                }
                break;
            case 4:
                InviteByPhoneScreen inviteByPhoneScreen = (InviteByPhoneScreen) obj;
                hs hsVar2 = inviteByPhoneScreen.o;
                String strValueOf2 = String.valueOf(charSequence);
                if (!fni.a((String) this.b, strValueOf2)) {
                    yy7[] yy7VarArr2 = InviteByPhoneScreen.z0;
                    wr7 wr7VarB0 = inviteByPhoneScreen.B0();
                    wr7VarB0.getClass();
                    wr7VarB0.F0.O(wr7VarB0, wr7.K0[1], xfh.o(wr7VarB0, null, new rr7(wr7VarB0, null), 1));
                    this.b = strValueOf2;
                    yy7[] yy7VarArr3 = InviteByPhoneScreen.z0;
                    yy7 yy7Var2 = yy7VarArr3[0];
                    hsVar2.b(inviteByPhoneScreen, strValueOf2);
                    OneMeButton oneMeButtonZ0 = inviteByPhoneScreen.z0();
                    yy7 yy7Var3 = yy7VarArr3[0];
                    oneMeButtonZ0.setEnabled(((String) hsVar2.a(inviteByPhoneScreen)).length() > 0);
                    break;
                }
                break;
            case 5:
                ((rgc) this.b).invoke(String.valueOf(charSequence));
                ((b18) obj).F(null);
                break;
            case 6:
                break;
            default:
                xwe xweVar = (xwe) this.b;
                if (xweVar.E0 instanceof twe) {
                    ImageView imageView = xweVar.K0;
                    if (charSequence != null && charSequence.length() != 0) {
                        xweVar.G0.isFocused();
                    }
                    imageView.setVisibility(8);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ li1(Widget widget, int i) {
        this.a = i;
        this.c = widget;
    }
}
