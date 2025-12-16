package one.me.profile;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.a93;
import defpackage.az1;
import defpackage.bbd;
import defpackage.cm6;
import defpackage.dpg;
import defpackage.f8j;
import defpackage.gza;
import defpackage.ho7;
import defpackage.ipi;
import defpackage.iza;
import defpackage.jza;
import defpackage.kga;
import defpackage.kti;
import defpackage.mvd;
import defpackage.pcc;
import defpackage.toc;
import defpackage.tqi;
import defpackage.v1a;
import defpackage.v8b;
import defpackage.vid;
import defpackage.vw4;
import defpackage.x8b;
import defpackage.yy7;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.profile.RknBottomSheet;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/profile/RknBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "<init>", "()V", "profile_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class RknBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ yy7[] G0 = {new toc(RknBottomSheet.class, "title", "getTitle()Landroid/widget/TextView;", 0), ho7.d(vid.a, RknBottomSheet.class, "subtitle", "getSubtitle()Landroid/widget/TextView;", 0)};
    public final bbd C0;
    public final bbd D0;
    public final Object E0;
    public final Object F0;

    public RknBottomSheet() {
        super(null, 1, null);
        this.C0 = viewBinding(v8b.y1);
        this.D0 = viewBinding(v8b.x1);
        final int i = 0;
        this.E0 = ipi.b(3, new cm6(this) { // from class: tqd
            public final /* synthetic */ RknBottomSheet b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i2 = i;
                RknBottomSheet rknBottomSheet = this.b;
                switch (i2) {
                    case 0:
                        yy7[] yy7VarArr = RknBottomSheet.G0;
                        return r34.b(rknBottomSheet.getContext(), ivd.b);
                    default:
                        yy7[] yy7VarArr2 = RknBottomSheet.G0;
                        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
                        int[] iArr = a93.s0.x(rknBottomSheet.getContext()).k().d().f.a;
                        ArrayList arrayList = new ArrayList(2);
                        for (int i3 = 0; i3 < 2; i3++) {
                            arrayList.add(Integer.valueOf(zob.b(iArr[i3], 0.16f)));
                        }
                        GradientDrawable gradientDrawable = new GradientDrawable(orientation, ue3.c0(arrayList));
                        gradientDrawable.setCornerRadius(vw4.d().getDisplayMetrics().density * 24.0f);
                        return gradientDrawable;
                }
            }
        });
        final int i2 = 1;
        this.F0 = ipi.b(3, new cm6(this) { // from class: tqd
            public final /* synthetic */ RknBottomSheet b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i2;
                RknBottomSheet rknBottomSheet = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = RknBottomSheet.G0;
                        return r34.b(rknBottomSheet.getContext(), ivd.b);
                    default:
                        yy7[] yy7VarArr2 = RknBottomSheet.G0;
                        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
                        int[] iArr = a93.s0.x(rknBottomSheet.getContext()).k().d().f.a;
                        ArrayList arrayList = new ArrayList(2);
                        for (int i3 = 0; i3 < 2; i3++) {
                            arrayList.add(Integer.valueOf(zob.b(iArr[i3], 0.16f)));
                        }
                        GradientDrawable gradientDrawable = new GradientDrawable(orientation, ue3.c0(arrayList));
                        gradientDrawable.setCornerRadius(vw4.d().getDisplayMetrics().density * 24.0f);
                        return gradientDrawable;
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, k18] */
    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View L0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        ImageView imageView = new ImageView(linearLayout.getContext());
        float f = 72;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
        float f2 = 24;
        layoutParams.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f2), 0);
        imageView.setLayoutParams(layoutParams);
        float f3 = 16;
        int iD = kti.d(vw4.d().getDisplayMetrics().density * f3);
        imageView.setPadding(iD, iD, iD, iD);
        linearLayout.setGravity(17);
        ?? r3 = this.E0;
        imageView.setImageDrawable((Drawable) r3.getValue());
        imageView.setBackground((GradientDrawable) this.F0.getValue());
        Drawable drawable = (Drawable) r3.getValue();
        v1a v1aVar = a93.s0;
        drawable.setTint(v1aVar.y(imageView).getIcon().a.b.a);
        linearLayout.addView(imageView);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setId(v8b.y1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = kti.d(12 * vw4.d().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(17);
        textView.setText(x8b.I2);
        textView.setTextColor(az1.f(dpg.c, textView, v1aVar, textView).e);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(linearLayout.getContext());
        textView2.setId(v8b.x1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.topMargin = kti.d(f3 * vw4.d().getDisplayMetrics().density);
        textView2.setLayoutParams(layoutParams3);
        textView2.setGravity(17);
        textView2.setText(x8b.H2);
        textView2.setTextColor(az1.f(dpg.j, textView2, v1aVar, textView2).g);
        linearLayout.addView(textView2);
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), null);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = kti.d(f2 * vw4.d().getDisplayMetrics().density);
        oneMeButton.setLayoutParams(layoutParams4);
        oneMeButton.setSize(jza.c);
        oneMeButton.setMode(iza.a);
        oneMeButton.setAppearance(gza.c);
        oneMeButton.setText(mvd.g0);
        f8j.d(oneMeButton, 300L, new pcc(5, this));
        linearLayout.addView(oneMeButton);
        tqi.c(new kga(this, (Continuation) null, 18), linearLayout);
        return linearLayout;
    }
}
