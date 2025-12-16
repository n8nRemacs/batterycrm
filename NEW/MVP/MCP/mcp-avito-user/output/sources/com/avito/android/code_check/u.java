package com.avito.android.code_check;

import Rh.C15041a;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.code_check_public.screen.AppbarNavigationIcon;
import com.avito.android.remote.model.text.AttributedText;
import j.D;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Utils.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_code-check_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class u {

    /* compiled from: Utils.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[AppbarNavigationIcon.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AppbarNavigationIcon appbarNavigationIcon = AppbarNavigationIcon.f119297b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final void a(@Y61.k View view, @Y61.l com.avito.android.code_check_public.c<Integer> cVar) {
        if (cVar != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.topMargin = cVar.k0(view.getContext()).intValue();
            view.setLayoutParams(marginLayoutParams);
            view.requestLayout();
        }
    }

    @Y61.k
    public static final TextView b(@Y61.k CodeCheckAbstractFragment codeCheckAbstractFragment, @Y61.k View view, @D int i12, @Y61.l com.avito.android.code_check_public.screen.j jVar) {
        TextView textView = (TextView) view.findViewById(i12);
        textView.setVisibility(jVar != null ? 0 : 8);
        if (jVar != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            AttributedText attributedTextK0 = jVar.f119389a.k0(textView.getContext());
            attributedTextK0.setOnDeepLinkClickListener(new C15041a(codeCheckAbstractFragment, 24));
            com.avito.android.util.text.j.c(textView, attributedTextK0, null);
            a(textView, jVar.f119390b);
        }
        return textView;
    }
}
