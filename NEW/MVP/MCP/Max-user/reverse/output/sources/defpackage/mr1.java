package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import java.util.Arrays;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.uikit.common.span.FitFontImageSpan;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class mr1 {
    public final Context a;

    public mr1(Context context) {
        this.a = context;
    }

    public static String f(Long l) {
        if (l == null) {
            return null;
        }
        long jLongValue = l.longValue();
        long j = 3600;
        long j2 = jLongValue / j;
        long j3 = 60;
        long j4 = (jLongValue % j) / j3;
        long j5 = jLongValue % j3;
        return j2 > 0 ? String.format(Locale.getDefault(), "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf(j4), Long.valueOf(j5)}, 3)) : String.format(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j4), Long.valueOf(j5)}, 2));
    }

    public final r5g a(n5g n5gVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(n5gVar.b(this.a));
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 18);
        return new r5g(spannableStringBuilder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final v71 b(wih wihVar) {
        Drawable drawableH;
        v1a v1aVar = a93.s0;
        t71 t71Var = (t71) wihVar;
        boolean zEquals = t71Var.equals(g71.c);
        Context context = this.a;
        if (zEquals) {
            drawableH = mfh.h(cxc.check_outline_16, v1aVar.z(context).c.getIcon().f, context);
        } else if (t71Var.equals(h71.c)) {
            drawableH = i();
        } else if (t71Var.equals(j71.c)) {
            drawableH = mfh.h(kwc.ic_connection_fill_16, v1aVar.z(context).c.getIcon().c, context);
        } else {
            if (!t71Var.equals(p71.c)) {
                return null;
            }
            drawableH = mfh.h(cxc.ic_microphone_off_fill_16, v1aVar.z(context).c.getIcon().f, context);
        }
        Drawable drawable = drawableH;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(wy1.h("  ", context.getString(wihVar.a)));
        spannableStringBuilder.setSpan(new FitFontImageSpan(drawable, null, false, false, 14, null), 0, 1, 17);
        return new v71(t71Var.getPriority(), spannableStringBuilder);
    }

    public final SpannableStringBuilder c(boolean z) {
        Drawable drawableH;
        v1a v1aVar = a93.s0;
        int i = z ? m0b.e0 : m0b.f0;
        Context context = this.a;
        if (z) {
            drawableH = mfh.h(ivd.X0, v1aVar.z(context).c.getIcon().b, context);
            float f = 28;
            drawableH.setBounds(0, 0, kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
        } else {
            drawableH = mfh.h(ivd.Y0, v1aVar.z(context).c.getIcon().b, context);
            float f2 = 28;
            drawableH.setBounds(0, 0, kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density));
        }
        Drawable drawable = drawableH;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(wy1.h("  ", context.getString(i)));
        spannableStringBuilder.setSpan(new FitFontImageSpan(drawable, null, false, false, 14, null), 0, 1, 17);
        return spannableStringBuilder;
    }

    public final SpannableStringBuilder d(boolean z) {
        Integer numValueOf = Integer.valueOf(d3d.call_incoming_video_call);
        if (!z) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : d3d.call_incoming_audio_call;
        Context context = this.a;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(wy1.h("   ", context.getString(iIntValue)));
        Drawable drawableMutate = r34.b(context, i0b.P).mutate();
        drawableMutate.setBounds(0, 0, drawableMutate.getIntrinsicWidth(), drawableMutate.getIntrinsicHeight());
        spannableStringBuilder.setSpan(new FitFontImageSpan(drawableMutate, null, false, false, 14, null), 0, 1, 33);
        return spannableStringBuilder;
    }

    public final SpannableStringBuilder e(CharSequence charSequence, boolean z, int i, boolean z2, boolean z3, boolean z4, co5 co5Var) {
        v1a v1aVar = a93.s0;
        Drawable g5fVar = null;
        if (charSequence == null) {
            return null;
        }
        if (z && (((co5Var instanceof yn5) || (co5Var instanceof ao5)) && z3)) {
            g5fVar = i();
        } else if (z || !z2 || (co5Var instanceof yn5) || (co5Var instanceof ao5)) {
            Context context = this.a;
            if (!z && z4) {
                g5fVar = mfh.h(kwc.ic_share_screen_20, v1aVar.z(context).c.getIcon().f, context);
                float f = 12;
                g5fVar.setBounds(0, 0, kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
            } else if (i == 2) {
                g5fVar = mfh.h(kwc.ic_microphone_disable_12, v1aVar.z(context).c.getIcon().f, context);
                float f2 = 12;
                g5fVar.setBounds(0, 0, kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density));
            } else if (i == 1) {
                g5fVar = new g5f(context, v1aVar.x(context).k(), new gf1(5));
                float f3 = 12;
                g5fVar.setBounds(0, 0, kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f3 * vw4.d().getDisplayMetrics().density));
            }
        } else {
            g5fVar = i();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (g5fVar != null) {
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(new FitFontImageSpan(g5fVar, null, false, false, 14, null), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
        }
        return spannableStringBuilder;
    }

    public final String g(boolean z, boolean z2, boolean z3, co5 co5Var) {
        Context context = this.a;
        if (!z3 && !z2 && (((co5Var instanceof yn5) || (co5Var instanceof ao5)) && !z)) {
            return context.getString(d3d.call_waiting);
        }
        if (((co5Var instanceof yn5) || (co5Var instanceof ao5)) && !z3) {
            return context.getString(d3d.call_connecting);
        }
        if (!(co5Var instanceof vn5)) {
            return null;
        }
        switch (lr1.$EnumSwitchMapping$0[az1.v(((vn5) co5Var).a)]) {
            case 1:
                return context.getString(d3d.call_opponent_unavailable_missed);
            case 2:
                return context.getString(d3d.call_opponent_unavailable_busy);
            case 3:
                return context.getString(d3d.call_failed);
            case 4:
                return context.getString(d3d.call_opponent_unavailable_privacy);
            case 5:
                return context.getString(d3d.call_opponent_failed_timout);
            case 6:
                return context.getString(d3d.call_group_was_removed_from_call);
            case 7:
                return context.getString(d3d.call_group_was_removed_from_waiting_room);
            case 8:
                return context.getString(d3d.call_group_user_not_in_chat);
            case 9:
                return context.getString(d3d.call_group_wait_admin);
            case 10:
                return context.getString(d3d.call_opponent_reject_call);
            case 11:
                return context.getString(e0b.a);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return context.getString(d3d.call_user_restricted_info);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final SpannableStringBuilder h(boolean z, int i, CharSequence charSequence, boolean z2, boolean z3, boolean z4, boolean z5, co5 co5Var) {
        mr1 mr1Var;
        boolean z6;
        int i2;
        Context context = this.a;
        if (z || !z5) {
            if (z2 || z) {
                if (z) {
                    charSequence = context.getString(d3d.call_me_member);
                }
                mr1Var = this;
                z6 = z;
                i2 = i;
                string = charSequence;
            }
            return mr1Var.e(string, z6, i2, z3, z4, z5, co5Var);
        }
        string = context.getString(m0b.u0, charSequence != null ? (String) ue3.I(vmf.R(charSequence, new char[]{' '})) : null);
        mr1Var = this;
        z6 = z;
        i2 = i;
        return mr1Var.e(string, z6, i2, z3, z4, z5, co5Var);
    }

    public final mc8 i() {
        int i = i0b.O;
        v1a v1aVar = a93.s0;
        Context context = this.a;
        yeb yebVar = v1aVar.z(context).c;
        mc8 mc8Var = new mc8(i, -1, context);
        float f = 12;
        mc8Var.setBounds(0, 0, kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
        return mc8Var;
    }
}
