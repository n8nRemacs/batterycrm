package one.me.sdk.bottomsheet;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import defpackage.a93;
import defpackage.az1;
import defpackage.gk2;
import defpackage.ho7;
import defpackage.hs;
import defpackage.i6c;
import defpackage.k1e;
import defpackage.pq3;
import defpackage.qq3;
import defpackage.rq3;
import defpackage.s5g;
import defpackage.tk4;
import defpackage.toc;
import defpackage.tq3;
import defpackage.ue3;
import defpackage.v1a;
import defpackage.vid;
import defpackage.yeb;
import defpackage.yy7;
import defpackage.z8a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tB\u0015\b\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lone/me/sdk/bottomsheet/ConfirmationBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "oq3", "rq3", "pq3", "qq3", "bottom-sheet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ConfirmationBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ yy7[] L0 = {new toc(ConfirmationBottomSheet.class, "icon", "getIcon()Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Icon;", 0), ho7.d(vid.a, ConfirmationBottomSheet.class, "title", "getTitle()Lone/me/sdk/uikit/common/TextSource;", 0), new toc(ConfirmationBottomSheet.class, "description", "getDescription()Lone/me/sdk/uikit/common/TextSource;", 0), new toc(ConfirmationBottomSheet.class, "buttons", "getButtons()Ljava/util/ArrayList;", 0), new toc(ConfirmationBottomSheet.class, ApiProtocol.PARAM_PAYLOAD, "getPayload()Landroid/os/Bundle;", 0), new z8a(ConfirmationBottomSheet.class, "isCallbackSent", "isCallbackSent()Z")};
    public final hs C0;
    public final hs D0;
    public final hs E0;
    public final hs F0;
    public final hs G0;
    public final boolean H0;
    public final hs I0;
    public final k1e J0;
    public final Object K0;

    /* JADX WARN: Multi-variable type inference failed */
    public ConfirmationBottomSheet() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static void O0(ImageView imageView, rq3 rq3Var) {
        int i;
        int i2;
        v1a v1aVar = a93.s0;
        if (rq3Var == null) {
            return;
        }
        int i3 = rq3Var.c;
        int iV = az1.v(i3);
        if (iV == 0) {
            imageView.setBackground(null);
            v1aVar.y(imageView).b();
            i = 0;
        } else {
            if (iV != 1) {
                throw new NoWhenBranchMatchedException();
            }
            imageView.setBackground(new ShapeDrawable(new OvalShape()));
            i = v1aVar.y(imageView).b().a.h;
        }
        int iV2 = az1.v(i3);
        if (iV2 == 0) {
            i2 = v1aVar.y(imageView).getIcon().f;
        } else {
            if (iV2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = v1aVar.y(imageView).getIcon().i;
        }
        imageView.setImageTintList(ColorStateList.valueOf(i2));
        Drawable background = imageView.getBackground();
        if (background != null) {
            background.setTint(i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final yeb C0() {
        return (yeb) this.K0.getValue();
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void H0() {
        Object targetController = getTargetController();
        qq3 qq3Var = targetController instanceof qq3 ? (qq3) targetController : null;
        if (qq3Var != null) {
            qq3Var.H();
        }
        yy7[] yy7VarArr = L0;
        yy7 yy7Var = yy7VarArr[5];
        if (((Boolean) this.I0.a(this)).booleanValue()) {
            return;
        }
        Object targetController2 = getTargetController();
        qq3 qq3Var2 = targetController2 instanceof qq3 ? (qq3) targetController2 : null;
        if (qq3Var2 != null) {
            yy7 yy7Var2 = yy7VarArr[4];
            qq3Var2.F((Bundle) this.G0.a(this));
        }
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View L0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        yy7[] yy7VarArr = L0;
        yy7 yy7Var = yy7VarArr[1];
        CharSequence charSequenceB = ((s5g) this.D0.a(this)).b(getContext());
        if (charSequenceB == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        yy7 yy7Var2 = yy7VarArr[2];
        s5g s5gVar = (s5g) this.E0.a(this);
        CharSequence charSequenceB2 = s5gVar != null ? s5gVar.b(layoutInflater.getContext()) : null;
        yy7 yy7Var3 = yy7VarArr[3];
        ArrayList arrayList = (ArrayList) this.F0.a(this);
        pq3 pq3Var = (pq3) ue3.I(arrayList);
        return new tq3(this, charSequenceB, charSequenceB2, arrayList, pq3Var != null ? Integer.valueOf(pq3Var.a) : null, layoutInflater.getContext());
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    /* renamed from: M0, reason: from getter */
    public final boolean getW0() {
        return this.H0;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScreenDelegate, reason: from getter */
    public final k1e getJ0() {
        return this.J0;
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final i6c z0() {
        return new gk2(this, 1);
    }

    public /* synthetic */ ConfirmationBottomSheet(Bundle bundle, int i, tk4 tk4Var) {
        this((i & 1) != 0 ? null : bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ConfirmationBottomSheet(android.os.Bundle r5) {
        /*
            r4 = this;
            r4.<init>(r5)
            hs r5 = new hs
            java.lang.Class<rq3> r0 = defpackage.rq3.class
            r1 = 0
            java.lang.String r2 = "icon"
            r5.<init>(r0, r1, r2)
            r4.C0 = r5
            hs r5 = new hs
            java.lang.Class<s5g> r0 = defpackage.s5g.class
            java.lang.String r2 = "title"
            r5.<init>(r0, r2)
            r4.D0 = r5
            hs r5 = new hs
            java.lang.String r2 = "description"
            r5.<init>(r0, r1, r2)
            r4.E0 = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            hs r0 = new hs
            java.lang.Class<java.util.ArrayList> r2 = java.util.ArrayList.class
            java.lang.String r3 = "buttons"
            r0.<init>(r2, r5, r3)
            r4.F0 = r0
            hs r5 = new hs
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            java.lang.String r2 = "payload"
            r5.<init>(r0, r1, r2)
            r4.G0 = r5
            android.os.Bundle r5 = r4.getArgs()
            java.lang.String r0 = "memorize_keyboard"
            r2 = 1
            boolean r5 = r5.getBoolean(r0, r2)
            r4.H0 = r5
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            hs r0 = new hs
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            java.lang.String r3 = "callback_sent"
            r0.<init>(r2, r5, r3)
            r4.I0 = r0
            android.os.Bundle r5 = r4.getArgs()
            java.lang.String r0 = "stat_screen"
            java.lang.String r5 = r5.getString(r0)
            if (r5 == 0) goto L81
            f1e r5 = defpackage.f1e.valueOf(r5)     // Catch: java.lang.Throwable -> L69
            goto L70
        L69:
            r5 = move-exception
            ipd r0 = new ipd
            r0.<init>(r5)
            r5 = r0
        L70:
            boolean r0 = r5 instanceof defpackage.ipd
            if (r0 == 0) goto L76
            goto L77
        L76:
            r1 = r5
        L77:
            f1e r1 = (defpackage.f1e) r1
            if (r1 == 0) goto L81
            ka5 r5 = new ka5
            r5.<init>(r1)
            goto L85
        L81:
            k1e r5 = super.getJ0()
        L85:
            r4.J0 = r5
            hk1 r5 = new hk1
            r0 = 20
            r5.<init>(r0, r4)
            r0 = 3
            k18 r5 = defpackage.ipi.b(r0, r5)
            r4.K0 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.bottomsheet.ConfirmationBottomSheet.<init>(android.os.Bundle):void");
    }
}
