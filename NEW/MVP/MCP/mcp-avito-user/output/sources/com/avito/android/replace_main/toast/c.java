package com.avito.android.replace_main.toast;

import HV.a;
import Y61.k;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.design.toast_bar.state.ToastBarState;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.FontAttribute;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.remote.model.text.FontStyleKt;
import com.avito.android.remote.model.text.TextIconAttribute;
import com.avito.android.util.text.j;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.l0;

/* compiled from: ReplaceMainToastFactoryImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/replace_main/toast/c;", "Lcom/avito/android/replace_main/toast/b;", "<init>", "()V", "_avito_replace-main_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements b {

    /* compiled from: ReplaceMainToastFactoryImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[BottomNavigationSpace.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BottomNavigationSpace bottomNavigationSpace = BottomNavigationSpace.f107065b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Inject
    public c() {
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [T, com.avito.android.lib.design.toast_bar.k] */
    @Override // com.avito.android.replace_main.toast.b
    @k
    @SuppressLint({"InflateParams"})
    public final d a(@k h hVar) {
        String str;
        l0.h hVar2 = new l0.h();
        FontParameter.ColorParameter colorParameter = new FontParameter.ColorParameter(null, null, "white");
        View view = hVar.f254599a;
        View viewInflate = LayoutInflater.from(view.getContext()).inflate(R.layout.replace_main_toast, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.logo);
        int iOrdinal = hVar.f254600b.ordinal();
        if (iOrdinal == 0) {
            str = "logo";
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            str = "afbLogo";
        }
        j.c(textView, new AttributedText("{{icon}}", Collections.singletonList(new TextIconAttribute("icon", str, null, Collections.singletonList(colorParameter), 4, null)), 1), null);
        j.c((TextView) viewInflate.findViewById(R.id.title), new AttributedText("{{title}}", Collections.singletonList(new FontAttribute("title", hVar.f254601c, C42756l.B(new FontParameter[]{hVar.f254602d ? new FontParameter.StyleParameter(FontStyleKt.BOLD) : null, colorParameter}))), 1), null);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.subtitle);
        String str2 = hVar.f254603e;
        if (str2 != null) {
            j.c(textView2, new AttributedText("{{info}}", Collections.singletonList(new FontAttribute(RequestReviewResultKt.INFO_TYPE, str2, Collections.singletonList(colorParameter))), 1), null);
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
        ((Button) viewInflate.findViewById(R.id.button)).setState(new UU.a(hVar.f254604f, null, false, false, false, new e(hVar2, hVar), null, null, null, false, 990, null));
        ToastBarState toastBarState = new ToastBarState(com.avito.android.printable_text.b.f(""), hVar.f254599a, ToastBarPosition.f181047e, Collections.singletonList(viewInflate), C42784z0.f406748b, null, null, -1, false, false, null, null, 3936, null);
        a.C0407a c0407a = HV.a.f7100w;
        Context context = view.getContext();
        c0407a.getClass();
        hVar2.f406842b = IV.a.d(view, toastBarState, a.C0407a.b(R.style.Re23_ToastBar_Business360, context));
        hVar.f254606h.invoke();
        return new d(hVar2);
    }
}
