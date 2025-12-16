package one.me.messages.list.ui.view;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.a93;
import defpackage.az1;
import defpackage.b1e;
import defpackage.bbd;
import defpackage.dpg;
import defpackage.f8j;
import defpackage.fq9;
import defpackage.gq9;
import defpackage.gwi;
import defpackage.gza;
import defpackage.ho7;
import defpackage.imb;
import defpackage.iza;
import defpackage.j7b;
import defpackage.jza;
import defpackage.k18;
import defpackage.kti;
import defpackage.l7b;
import defpackage.mvd;
import defpackage.qlg;
import defpackage.t75;
import defpackage.tk4;
import defpackage.toc;
import defpackage.tqi;
import defpackage.v1a;
import defpackage.vid;
import defpackage.vu9;
import defpackage.vw4;
import defpackage.yvi;
import defpackage.yy7;
import defpackage.zjh;
import kotlin.Metadata;
import one.me.messages.list.ui.view.WarningLinkBottomSheet;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;
import org.apache.http.HttpStatus;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/messages/list/ui/view/WarningLinkBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lb1e;", "scopeId", "", "link", "(Ljava/lang/String;Ljava/lang/String;Ltk4;)V", "message-list_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class WarningLinkBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ yy7[] I0 = {new toc(WarningLinkBottomSheet.class, "title", "getTitle()Landroid/widget/TextView;", 0), ho7.d(vid.a, WarningLinkBottomSheet.class, "subtitle", "getSubtitle()Landroid/widget/TextView;", 0)};
    public final String C0;
    public final k18 D0;
    public final k18 E0;
    public final bbd F0;
    public final bbd G0;
    public boolean H0;

    public WarningLinkBottomSheet(String str, String str2, tk4 tk4Var) {
        this(gwi.b(new imb(Widget.ARG_SCOPE_ID, new b1e(str)), new imb("link_arg", str2)));
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void H0() {
        if (this.H0) {
            ((zjh) this.E0.getValue()).a(1, 2);
        }
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View L0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setId(j7b.U);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = kti.d(16 * vw4.d().getDisplayMetrics().density);
        layoutParams.gravity = 17;
        textView.setLayoutParams(layoutParams);
        textView.setText(l7b.Z0);
        dpg.c.b(textView, t75.b);
        v1a v1aVar = a93.s0;
        textView.setTextColor(v1aVar.y(textView).getText().e);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(linearLayout.getContext());
        textView2.setId(j7b.T);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        float f = 12;
        layoutParams2.topMargin = kti.d(vw4.d().getDisplayMetrics().density * f);
        layoutParams2.gravity = 17;
        textView2.setLayoutParams(layoutParams2);
        textView2.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(HttpStatus.SC_MULTIPLE_CHOICES)});
        textView2.setText(this.C0);
        textView2.setTextColor(az1.f(dpg.j, textView2, v1aVar, textView2).g);
        linearLayout.addView(textView2);
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), null);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = kti.d(24 * vw4.d().getDisplayMetrics().density);
        oneMeButton.setLayoutParams(layoutParams3);
        jza jzaVar = jza.c;
        oneMeButton.setSize(jzaVar);
        oneMeButton.setMode(iza.a);
        gza gzaVar = gza.c;
        oneMeButton.setAppearance(gzaVar);
        oneMeButton.setText(mvd.p);
        final int i = 1;
        f8j.d(oneMeButton, 300L, new View.OnClickListener(this) { // from class: yjh
            public final /* synthetic */ WarningLinkBottomSheet b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                WarningLinkBottomSheet warningLinkBottomSheet = this.b;
                switch (i2) {
                    case 0:
                        String str = warningLinkBottomSheet.C0;
                        if (str != null) {
                            ((vu9) warningLinkBottomSheet.D0.getValue()).G(str);
                            ((zjh) warningLinkBottomSheet.E0.getValue()).a(1, 1);
                            warningLinkBottomSheet.H0 = false;
                            warningLinkBottomSheet.E0(false);
                            break;
                        }
                        break;
                    default:
                        yy7[] yy7VarArr = WarningLinkBottomSheet.I0;
                        ((zjh) warningLinkBottomSheet.E0.getValue()).a(1, 2);
                        warningLinkBottomSheet.H0 = false;
                        warningLinkBottomSheet.E0(true);
                        break;
                }
            }
        });
        linearLayout.addView(oneMeButton);
        OneMeButton oneMeButton2 = new OneMeButton(linearLayout.getContext(), null);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = kti.d(f * vw4.d().getDisplayMetrics().density);
        oneMeButton2.setLayoutParams(layoutParams4);
        oneMeButton2.setSize(jzaVar);
        oneMeButton2.setMode(iza.b);
        oneMeButton2.setAppearance(gzaVar);
        oneMeButton2.setText(l7b.Y0);
        final int i2 = 0;
        f8j.d(oneMeButton2, 300L, new View.OnClickListener(this) { // from class: yjh
            public final /* synthetic */ WarningLinkBottomSheet b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                WarningLinkBottomSheet warningLinkBottomSheet = this.b;
                switch (i22) {
                    case 0:
                        String str = warningLinkBottomSheet.C0;
                        if (str != null) {
                            ((vu9) warningLinkBottomSheet.D0.getValue()).G(str);
                            ((zjh) warningLinkBottomSheet.E0.getValue()).a(1, 1);
                            warningLinkBottomSheet.H0 = false;
                            warningLinkBottomSheet.E0(false);
                            break;
                        }
                        break;
                    default:
                        yy7[] yy7VarArr = WarningLinkBottomSheet.I0;
                        ((zjh) warningLinkBottomSheet.E0.getValue()).a(1, 2);
                        warningLinkBottomSheet.H0 = false;
                        warningLinkBottomSheet.E0(true);
                        break;
                }
            }
        });
        linearLayout.addView(oneMeButton2);
        tqi.c(new qlg(this, null, 7), linearLayout);
        return linearLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        ((zjh) this.E0.getValue()).a(2, 0);
    }

    public WarningLinkBottomSheet(Bundle bundle) {
        super(bundle);
        this.C0 = bundle.getString("link_arg");
        b1e b1eVar = (b1e) ((Parcelable) yvi.a(getArgs(), Widget.ARG_SCOPE_ID, b1e.class));
        String str = b1eVar != null ? b1eVar.a : null;
        this.D0 = m39getSharedViewModelcp94BC8(str == null ? getD() : str, vu9.class, null);
        k18 k18Var = fq9.a;
        this.E0 = gq9.a.getAccessor().d(162);
        this.F0 = viewBinding(j7b.U);
        this.G0 = viewBinding(j7b.T);
        this.H0 = true;
    }
}
