package com.avito.android.component.advert_contact_bar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.Y4;
import hw.InterfaceC41178c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import q50.InterfaceC47203a;

/* compiled from: ContactBars.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_ui-components_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
@InterfaceC47203a
/* loaded from: classes12.dex */
public final class S {

    /* compiled from: ContactBars.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ContactBar.Button.Target.Type.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ContactBar.Button.Target.Type type = ContactBar.Button.Target.Type.f125085b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ContactBar.Button.Target.Type type2 = ContactBar.Button.Target.Type.f125085b;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ContactBar.Button.Target.Type type3 = ContactBar.Button.Target.Type.f125085b;
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ContactBar.Button.Target.Type type4 = ContactBar.Button.Target.Type.f125085b;
                iArr[0] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ContactBar.Button.Target.Type type5 = ContactBar.Button.Target.Type.f125085b;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                ContactBar.Button.Target.Type type6 = ContactBar.Button.Target.Type.f125085b;
                iArr[9] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                ContactBar.Button.Target.Type type7 = ContactBar.Button.Target.Type.f125085b;
                iArr[6] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                ContactBar.Button.Target.Type type8 = ContactBar.Button.Target.Type.f125085b;
                iArr[7] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                ContactBar.Button.Target.Type type9 = ContactBar.Button.Target.Type.f125085b;
                iArr[8] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                ContactBar.Button.Target.Type type10 = ContactBar.Button.Target.Type.f125085b;
                iArr[10] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public static final void a(@Y61.k View view, @Y61.k TextView textView) {
        Context context = view.getContext();
        D6.D(view, R.drawable.bg_btn_flat_rds_warmgray4_redesign);
        textView.setTextColor(C35835l0.d(R.attr.gray28, context));
        view.setEnabled(false);
    }

    public static final void b(View view, TextView textView) {
        D6.D(view, R.drawable.bg_btn_flat_rds_warmgray4_redesign);
        textView.setTextColor(C35835l0.d(R.attr.black, view.getContext()));
    }

    public static final void c(@Y61.k View view, @Y61.k TextView textView, boolean z12) {
        Context context = view.getContext();
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        D6.D(view, z12 ? R.drawable.bg_btn_flat_rds_blue_100_redesign : R.drawable.bg_btn_flat_rds_blue_100);
        textView.setTextColor(C35835l0.d(R.attr.blue700, context));
    }

    @InterfaceC41178c
    @Y61.k
    public static final Button d(@Y61.k ContactBar.Button.Target target, @Y61.k androidx.appcompat.view.d dVar, @j.I int i12, @Y61.k Y41.l lVar) {
        switch (target.f125081i.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                Button button = (Button) LayoutInflater.from(dVar).inflate(i12, (ViewGroup) null);
                Y4.f318784a.getClass();
                button.setAppearanceFromAttr(Y4.a(target.f125079g));
                com.avito.android.lib.design.button.b.a(button, target.f125074b, false);
                String str = target.f125075c;
                if (str != null) {
                    button.setSubtitle(str);
                }
                button.setLoading(target.f125077e);
                button.setOnClickListener(new com.avito.android.body_condition.h(lVar, target));
                D6.H(button);
                button.setIconColor(null);
                Integer num = target.f125080h;
                Button.g(button, num != null ? D6.u(button, num.intValue()) : null, null, false, null, 14);
                return button;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
