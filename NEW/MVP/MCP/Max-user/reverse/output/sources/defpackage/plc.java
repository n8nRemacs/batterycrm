package defpackage;

import android.content.Context;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.coroutines.Continuation;
import one.me.profile.ProfileScreen;

/* loaded from: classes2.dex */
public final class plc extends dtf implements sm6 {
    public final /* synthetic */ ProfileScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public plc(Continuation continuation, ProfileScreen profileScreen) {
        super(2, continuation);
        this.X = profileScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        plc plcVar = (plc) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        plcVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        plc plcVar = new plc(continuation, this.X);
        plcVar.o = obj;
        return plcVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        ProfileScreen profileScreen;
        boolean z;
        g8j.b(obj);
        bbc bbcVar = (bbc) this.o;
        yy7[] yy7VarArr = ProfileScreen.C0;
        ProfileScreen profileScreen2 = this.X;
        yfb yfbVarB0 = profileScreen2.B0();
        boolean z2 = bbcVar.b;
        boolean z3 = bbcVar.k;
        CharSequence m7fVar = bbcVar.e;
        s5g s5gVar = bbcVar.h;
        yfbVarB0.setRightActions(z2 ? new lfb(null, new rfb(y9b.h, new z11(17, profileScreen2)), null) : jfb.a);
        bbd bbdVar = profileScreen2.s0;
        yy7[] yy7VarArr2 = ProfileScreen.C0;
        uxa uxaVar = (uxa) bbdVar.D(profileScreen2, yy7VarArr2[4]);
        uxaVar.setCustomOverlay(bbcVar.g);
        Long l = new Long(bbcVar.a);
        CharSequence charSequence = bbcVar.f;
        if (charSequence == null) {
            charSequence = "";
        }
        uxaVar.l(fui.a(charSequence, l), true);
        uxaVar.setAvatarUrls(bbcVar.c);
        uxaVar.setAlpha(bbcVar.j ? 0.4f : 1.0f);
        f8j.d(uxaVar, 300L, new r6(10, profileScreen2));
        CharSequence charSequence2 = bbcVar.i;
        boolean z4 = charSequence2 == null || charSequence2.length() == 0;
        CharSequence charSequenceB = s5gVar != null ? s5gVar.b(profileScreen2.getContext()) : null;
        boolean z5 = charSequenceB == null || charSequenceB.length() == 0;
        int i = 8;
        AppCompatTextView appCompatTextView = (AppCompatTextView) profileScreen2.w0.D(profileScreen2, yy7VarArr2[8]);
        if (!z4 && !z5) {
            i = 0;
        }
        appCompatTextView.setVisibility(i);
        if (!z4) {
            p88 p88Var = (p88) profileScreen2.v0.D(profileScreen2, yy7VarArr2[7]);
            CharSequence text = p88Var.getText();
            h88 h88Var = p88Var.b;
            Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
            if (spannable != null) {
                h88Var.getClass();
                h88.a(spannable);
            }
            p88Var.setText(charSequence2);
            p88Var.setTransformationMethod(h88Var);
            CharSequence text2 = p88Var.getText();
            Spannable spannable2 = text2 instanceof Spannable ? (Spannable) text2 : null;
            if (spannable2 != null) {
                h88Var.c(spannable2);
            }
        }
        ((TextView) profileScreen2.u0.D(profileScreen2, yy7VarArr2[6])).setText(s5gVar != null ? s5gVar.b(profileScreen2.getContext()) : null);
        profileScreen2.B0().setTitle(m7fVar == null ? "" : m7fVar);
        TextView textViewA0 = profileScreen2.A0();
        if (z3) {
            int iB = f6j.b(profileScreen2.getContext());
            ViewGroup.LayoutParams layoutParams = profileScreen2.A0().getLayoutParams();
            int marginStart = iB - (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0);
            ViewGroup.LayoutParams layoutParams2 = profileScreen2.A0().getLayoutParams();
            int marginEnd = marginStart - (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0);
            Context context = profileScreen2.getContext();
            TextPaint paint = profileScreen2.A0().getPaint();
            qha qhaVar = qha.z0;
            if (m7fVar == null || m7fVar.length() == 0) {
                profileScreen = profileScreen2;
                z = z3;
                if (m7fVar == null) {
                    m7fVar = "";
                }
            } else {
                int iR = kpi.r(paint.getTextSize() / context.getResources().getDisplayMetrics().density);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m7fVar);
                spannableStringBuilder.append((char) 8288);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.setSpan(new yzg(context, iR, false, qhaVar), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                m7f m7fVar2 = new m7f(spannableStringBuilder);
                StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(m7fVar2, 0, m7fVar2.length(), paint, marginEnd);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                StaticLayout staticLayoutBuild = builderObtain.setAlignment(alignment).setIncludePad(false).build();
                int iMin = Math.min(staticLayoutBuild.getLineCount() - 1, 2);
                CharSequence charSequenceSubSequence = staticLayoutBuild.getText().subSequence(staticLayoutBuild.getLineStart(0), staticLayoutBuild.getLineEnd(iMin));
                if (fni.a(charSequenceSubSequence, m7fVar2)) {
                    profileScreen = profileScreen2;
                    z = z3;
                    m7fVar = m7fVar2;
                } else {
                    profileScreen = profileScreen2;
                    z = z3;
                    StaticLayout staticLayoutBuild2 = StaticLayout.Builder.obtain(m7fVar2, staticLayoutBuild.getLineStart(iMin), staticLayoutBuild.getLineEnd(iMin), paint, u45.q(xrf.d(iR), vw4.d().getDisplayMetrics().density, u45.q(xrf.g(iR), vw4.d().getDisplayMetrics().density, marginEnd))).setAlignment(alignment).setIncludePad(false).build();
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(vmf.O(charSequenceSubSequence, staticLayoutBuild.getLineStart(iMin), staticLayoutBuild.getLineEnd(iMin), staticLayoutBuild2.getText().subSequence(staticLayoutBuild2.getLineStart(0), staticLayoutBuild2.getLineEnd(0) - 3)));
                    spannableStringBuilder2.append((char) 8288);
                    spannableStringBuilder2.append((CharSequence) "...");
                    spannableStringBuilder2.append((char) 8288);
                    spannableStringBuilder2.append((CharSequence) " ");
                    spannableStringBuilder2.setSpan(new yzg(context, iR, false, qhaVar), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                    m7fVar = new m7f(spannableStringBuilder2);
                }
            }
        } else {
            profileScreen = profileScreen2;
            z = z3;
        }
        textViewA0.setText(m7fVar);
        ProfileScreen.y0(profileScreen, profileScreen.B0(), z);
        return qqg.a;
    }
}
