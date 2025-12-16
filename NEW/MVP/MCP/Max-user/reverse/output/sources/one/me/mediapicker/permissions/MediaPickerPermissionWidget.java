package one.me.mediapicker.permissions;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.b1e;
import defpackage.dpg;
import defpackage.f8j;
import defpackage.gwi;
import defpackage.hs;
import defpackage.imb;
import defpackage.k18;
import defpackage.kti;
import defpackage.oe6;
import defpackage.qsb;
import defpackage.r39;
import defpackage.rsb;
import defpackage.s2i;
import defpackage.t75;
import defpackage.tk4;
import defpackage.toc;
import defpackage.tqi;
import defpackage.vid;
import defpackage.vw4;
import defpackage.y6b;
import defpackage.ye6;
import defpackage.yy7;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/mediapicker/permissions/MediaPickerPermissionWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lb1e;", "scopeId", "(Ljava/lang/String;Ltk4;)V", "media-picker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class MediaPickerPermissionWidget extends Widget {
    public static final /* synthetic */ yy7[] d;
    public final hs a;
    public final k18 b;
    public final k18 c;

    static {
        toc tocVar = new toc(MediaPickerPermissionWidget.class, "scopeId", "getScopeId-IluPPks()Ljava/lang/String;", 0);
        vid.a.getClass();
        d = new yy7[]{tocVar};
    }

    public MediaPickerPermissionWidget(String str, tk4 tk4Var) {
        this(gwi.b(new imb(Widget.ARG_SCOPE_ID, new b1e(str))));
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScopeId-IluPPks */
    public final String getB() {
        yy7 yy7Var = d[0];
        return ((b1e) this.a.a(this)).a;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final void onActivityResumed(Activity activity) {
        r39 r39Var = (r39) this.b.getValue();
        r39Var.s0.f();
        r39Var.t0.f();
        super.onActivityResumed(activity);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        float f = 20;
        float f2 = 0;
        layoutParams.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f * vw4.d().getDisplayMetrics().density), kti.d(f2 * vw4.d().getDisplayMetrics().density));
        linearLayout.setLayoutParams(layoutParams);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setText(y6b.j);
        dpg.k.b(textView, t75.b);
        textView.setGravity(17);
        TextView textView2 = new TextView(linearLayout.getContext());
        textView2.setText(y6b.i);
        dpg.o.b(textView2, t75.b);
        textView2.setPadding(textView2.getPaddingLeft(), kti.d(4 * vw4.d().getDisplayMetrics().density), textView2.getPaddingRight(), kti.d(16 * vw4.d().getDisplayMetrics().density));
        textView2.setGravity(17);
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), null);
        oneMeButton.setText(y6b.d);
        oneMeButton.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        f8j.d(oneMeButton, 300L, new ye6(15, this));
        tqi.c(new oe6(textView, textView2, null, 1), linearLayout);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        linearLayout.addView(oneMeButton);
        return linearLayout;
    }

    @Override // defpackage.c54
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        k18 k18Var = this.c;
        int i2 = 0;
        if (i != 157) {
            if (i != 162) {
                return;
            }
            int length = iArr.length;
            while (i2 < length) {
                if (iArr[i2] != -1) {
                    return;
                } else {
                    i2++;
                }
            }
            qsb.s((qsb) k18Var.getValue(), new s2i(this, 1), strArr, iArr, qsb.o, y6b.f, y6b.e, 192);
            return;
        }
        int length2 = iArr.length;
        while (i2 < length2) {
            if (iArr[i2] != -1) {
                return;
            } else {
                i2++;
            }
        }
        qsb qsbVar = (qsb) k18Var.getValue();
        s2i s2iVar = new s2i(this, 1);
        int i3 = y6b.h;
        int i4 = y6b.g;
        qsbVar.getClass();
        qsb.q(s2iVar, strArr, iArr, i3, i4);
    }

    public MediaPickerPermissionWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new hs(b1e.class, new b1e("default"), Widget.ARG_SCOPE_ID);
        this.b = m39getSharedViewModelcp94BC8(getB(), r39.class, null);
        this.c = rsb.a.a();
    }
}
