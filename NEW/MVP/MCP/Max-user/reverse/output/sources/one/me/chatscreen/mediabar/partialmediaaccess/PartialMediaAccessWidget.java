package one.me.chatscreen.mediabar.partialmediaaccess;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.cm6;
import defpackage.ho7;
import defpackage.k18;
import defpackage.rsb;
import defpackage.sn0;
import defpackage.tk4;
import defpackage.toc;
import defpackage.vid;
import defpackage.yy7;
import kotlin.Metadata;
import one.me.chatscreen.mediabar.partialmediaaccess.PartialMediaAccessWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/chatscreen/mediabar/partialmediaaccess/PartialMediaAccessWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "chat-screen_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class PartialMediaAccessWidget extends Widget {
    public static final /* synthetic */ yy7[] d = {new toc(PartialMediaAccessWidget.class, "titleSubtitleContent", "getTitleSubtitleContent()Landroid/widget/LinearLayout;", 0), ho7.d(vid.a, PartialMediaAccessWidget.class, "content", "getContent()Landroid/widget/LinearLayout;", 0)};
    public final k18 a;
    public final sn0 b;
    public final sn0 c;

    /* JADX WARN: Multi-variable type inference failed */
    public PartialMediaAccessWidget() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        yy7 yy7Var = d[1];
        return (LinearLayout) this.c.getValue();
    }

    public PartialMediaAccessWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = rsb.a.a();
        final int i = 0;
        this.b = binding(new cm6(this) { // from class: anb
            public final /* synthetic */ PartialMediaAccessWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i2 = i;
                PartialMediaAccessWidget partialMediaAccessWidget = this.b;
                switch (i2) {
                    case 0:
                        yy7[] yy7VarArr = PartialMediaAccessWidget.d;
                        LinearLayout linearLayout = new LinearLayout(partialMediaAccessWidget.getContext());
                        linearLayout.setOrientation(1);
                        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(kti.d(0 * vw4.d().getDisplayMetrics().density), -2, 1.0f));
                        AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout.getContext(), null);
                        appCompatTextView.setText(n1b.B);
                        appCompatTextView.setPadding(appCompatTextView.getPaddingLeft(), appCompatTextView.getPaddingTop(), appCompatTextView.getPaddingRight(), kti.d(2 * vw4.d().getDisplayMetrics().density));
                        dpg.f.b(appCompatTextView, t75.b);
                        tqi.c(new kq5(3, null, 1), appCompatTextView);
                        linearLayout.addView(appCompatTextView);
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(linearLayout.getContext(), null);
                        appCompatTextView2.setText(n1b.A);
                        dpg.j.b(appCompatTextView2, t75.b);
                        tqi.c(new kq5(3, null, 2), appCompatTextView2);
                        linearLayout.addView(appCompatTextView2);
                        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), kti.d(12 * vw4.d().getDisplayMetrics().density), linearLayout.getPaddingBottom());
                        return linearLayout;
                    default:
                        yy7[] yy7VarArr2 = PartialMediaAccessWidget.d;
                        LinearLayout linearLayout2 = new LinearLayout(partialMediaAccessWidget.getContext());
                        linearLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                        linearLayout2.setVerticalGravity(16);
                        sn0 sn0Var = partialMediaAccessWidget.b;
                        yy7 yy7Var = PartialMediaAccessWidget.d[0];
                        linearLayout2.addView((LinearLayout) sn0Var.getValue());
                        OneMeButton oneMeButton = new OneMeButton(linearLayout2.getContext(), null);
                        oneMeButton.setText(n1b.z);
                        oneMeButton.setSize(jza.a);
                        oneMeButton.setMode(iza.b);
                        oneMeButton.setAppearance(gza.c);
                        f8j.d(oneMeButton, 300L, new ye6(26, partialMediaAccessWidget));
                        linearLayout2.addView(oneMeButton);
                        float f = 12;
                        float f2 = 4;
                        linearLayout2.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f * vw4.d().getDisplayMetrics().density), kti.d(f2 * vw4.d().getDisplayMetrics().density));
                        tqi.c(new m(3, null, 12), linearLayout2);
                        return linearLayout2;
                }
            }
        });
        final int i2 = 1;
        this.c = binding(new cm6(this) { // from class: anb
            public final /* synthetic */ PartialMediaAccessWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i2;
                PartialMediaAccessWidget partialMediaAccessWidget = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = PartialMediaAccessWidget.d;
                        LinearLayout linearLayout = new LinearLayout(partialMediaAccessWidget.getContext());
                        linearLayout.setOrientation(1);
                        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(kti.d(0 * vw4.d().getDisplayMetrics().density), -2, 1.0f));
                        AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout.getContext(), null);
                        appCompatTextView.setText(n1b.B);
                        appCompatTextView.setPadding(appCompatTextView.getPaddingLeft(), appCompatTextView.getPaddingTop(), appCompatTextView.getPaddingRight(), kti.d(2 * vw4.d().getDisplayMetrics().density));
                        dpg.f.b(appCompatTextView, t75.b);
                        tqi.c(new kq5(3, null, 1), appCompatTextView);
                        linearLayout.addView(appCompatTextView);
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(linearLayout.getContext(), null);
                        appCompatTextView2.setText(n1b.A);
                        dpg.j.b(appCompatTextView2, t75.b);
                        tqi.c(new kq5(3, null, 2), appCompatTextView2);
                        linearLayout.addView(appCompatTextView2);
                        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), kti.d(12 * vw4.d().getDisplayMetrics().density), linearLayout.getPaddingBottom());
                        return linearLayout;
                    default:
                        yy7[] yy7VarArr2 = PartialMediaAccessWidget.d;
                        LinearLayout linearLayout2 = new LinearLayout(partialMediaAccessWidget.getContext());
                        linearLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                        linearLayout2.setVerticalGravity(16);
                        sn0 sn0Var = partialMediaAccessWidget.b;
                        yy7 yy7Var = PartialMediaAccessWidget.d[0];
                        linearLayout2.addView((LinearLayout) sn0Var.getValue());
                        OneMeButton oneMeButton = new OneMeButton(linearLayout2.getContext(), null);
                        oneMeButton.setText(n1b.z);
                        oneMeButton.setSize(jza.a);
                        oneMeButton.setMode(iza.b);
                        oneMeButton.setAppearance(gza.c);
                        f8j.d(oneMeButton, 300L, new ye6(26, partialMediaAccessWidget));
                        linearLayout2.addView(oneMeButton);
                        float f = 12;
                        float f2 = 4;
                        linearLayout2.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f * vw4.d().getDisplayMetrics().density), kti.d(f2 * vw4.d().getDisplayMetrics().density));
                        tqi.c(new m(3, null, 12), linearLayout2);
                        return linearLayout2;
                }
            }
        });
    }

    public /* synthetic */ PartialMediaAccessWidget(Bundle bundle, int i, tk4 tk4Var) {
        this((i & 1) != 0 ? null : bundle);
    }
}
