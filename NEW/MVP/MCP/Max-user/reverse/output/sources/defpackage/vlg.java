package defpackage;

import java.util.Arrays;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vlg extends dtf implements sm6 {
    public final /* synthetic */ emg o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vlg(emg emgVar, Continuation continuation) {
        super(2, continuation);
        this.o = emgVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        vlg vlgVar = (vlg) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        vlgVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new vlg(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        n5g n5gVar;
        p5g p5gVar;
        tp7 tp7Var;
        g8j.b(obj);
        emg emgVar = this.o;
        jlg jlgVar = emgVar.b;
        up7 up7Var = emgVar.X;
        tcf tcfVar = emgVar.w0;
        int iOrdinal = emgVar.c.ordinal();
        int i = 0;
        if (iOrdinal == 0) {
            int i2 = emgVar.v().a;
            int i3 = i2 < 1 ? 1 : i2;
            int i4 = emgVar.v().b;
            if (i4 != Integer.MAX_VALUE && i4 > 0) {
                i = emgVar.v().b;
            }
            int i5 = i;
            j5g j5gVar = new j5g(w1d.oneme_settings_twofa_creation_password_symbols_count, i3);
            n5g n5gVar2 = jlgVar == jlg.a ? new n5g(r4d.oneme_settings_twofa_creation_password_title) : new n5g(r4d.oneme_settings_twofa_creation_new_password_title);
            int i6 = ivd.a;
            tcfVar.m(null, new iog(n5gVar2, new jog(new n5g(r4d.oneme_settings_twofa_creation_password_first_hint), j5gVar, i3, i5, 12), new jog(new n5g(r4d.oneme_settings_twofa_creation_password_second_hint), null, 0, i5, 22)));
        } else if (iOrdinal == 1) {
            int i7 = emgVar.v().c;
            if (i7 != Integer.MAX_VALUE && i7 > 0) {
                i = emgVar.v().c;
            }
            int i8 = ivd.a;
            tcfVar.m(null, new hog(new n5g(r4d.oneme_settings_twofa_creation_hint_title), new n5g(r4d.oneme_settings_twofa_creation_hint_subtitle), new jog(new n5g(r4d.oneme_settings_twofa_creation_hint_input_hint), null, 0, i, 94)));
        } else if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            tp7 tp7Var2 = up7Var != null ? up7Var.c : null;
            if (tp7Var2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            int i9 = ivd.a;
            n5g n5gVar3 = new n5g(r4d.oneme_settings_twofa_creation_email_verify_title);
            int i10 = r4d.oneme_settings_twofa_creation_email_verify_subtitle;
            String str = tp7Var2.a;
            if (str == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            tcfVar.m(null, new kog(n5gVar3, new p5g(i10, ys.D(new Object[]{str})), tp7Var2.c));
            emgVar.A0.m(null, Long.valueOf(tp7Var2.d));
            x9f x9fVar = emgVar.F0;
            if (x9fVar != null) {
                x9fVar.cancel((CancellationException) null);
            }
            emgVar.F0 = null;
            emgVar.F0 = xfh.o(emgVar, null, new dmg(emgVar, null), 3);
        } else if (jlgVar == jlg.c) {
            wqi.e(emgVar.Y, "Can't open email step for restore", null);
        } else {
            String str2 = (up7Var == null || (tp7Var = up7Var.c) == null) ? null : tp7Var.b;
            if (jlgVar != jlg.b || str2 == null) {
                n5gVar = new n5g(r4d.oneme_settings_twofa_creation_email_title);
                p5gVar = null;
            } else {
                n5gVar = new n5g(r4d.oneme_settings_twofa_creation_new_email_title);
                p5gVar = new p5g(r4d.oneme_settings_twofa_creation_new_email_description, ys.D(Arrays.copyOf(new Object[]{str2}, 1)));
            }
            int i11 = ivd.a;
            tcfVar.m(null, new fog(n5gVar, new n5g(r4d.oneme_settings_twofa_creation_email_empty_confirmation_description), new jog(new n5g(r4d.oneme_settings_twofa_creation_email_hint), p5gVar, 0, 0, 124)));
        }
        return qqg.a;
    }
}
