package one.me.qrscanner;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.a93;
import defpackage.a9c;
import defpackage.aod;
import defpackage.asc;
import defpackage.aw0;
import defpackage.az1;
import defpackage.bbd;
import defpackage.bod;
import defpackage.bsc;
import defpackage.bud;
import defpackage.bwf;
import defpackage.c54;
import defpackage.c8b;
import defpackage.ci5;
import defpackage.cm6;
import defpackage.d56;
import defpackage.dpg;
import defpackage.dsc;
import defpackage.eud;
import defpackage.f32;
import defpackage.f8b;
import defpackage.fua;
import defpackage.g39;
import defpackage.g44;
import defpackage.g56;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.hdc;
import defpackage.hfb;
import defpackage.hi4;
import defpackage.ho7;
import defpackage.hrc;
import defpackage.hs;
import defpackage.i84;
import defpackage.id7;
import defpackage.imb;
import defpackage.ipi;
import defpackage.iqb;
import defpackage.ivd;
import defpackage.j2e;
import defpackage.j48;
import defpackage.jei;
import defpackage.jva;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.kt3;
import defpackage.kti;
import defpackage.l16;
import defpackage.l38;
import defpackage.l48;
import defpackage.l5j;
import defpackage.lc4;
import defpackage.mvd;
import defpackage.mwd;
import defpackage.n1a;
import defpackage.n5g;
import defpackage.n9b;
import defpackage.o38;
import defpackage.o9b;
import defpackage.oq3;
import defpackage.orc;
import defpackage.p07;
import defpackage.pq3;
import defpackage.q2b;
import defpackage.qfb;
import defpackage.qq3;
import defpackage.qsb;
import defpackage.r34;
import defpackage.rrc;
import defpackage.s83;
import defpackage.svi;
import defpackage.t35;
import defpackage.t75;
import defpackage.tk4;
import defpackage.toc;
import defpackage.tqi;
import defpackage.trc;
import defpackage.uog;
import defpackage.ut3;
import defpackage.uxb;
import defpackage.uyd;
import defpackage.v1a;
import defpackage.v4j;
import defpackage.vdc;
import defpackage.vid;
import defpackage.vw4;
import defpackage.wqi;
import defpackage.wyd;
import defpackage.x26;
import defpackage.x9;
import defpackage.xc0;
import defpackage.xyd;
import defpackage.y9b;
import defpackage.yc7;
import defpackage.yfb;
import defpackage.yrc;
import defpackage.ytd;
import defpackage.yy7;
import defpackage.z44;
import defpackage.z7;
import defpackage.zfi;
import defpackage.zrc;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.qrscanner.QrScannerWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0015\b\u0000\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000e¨\u0006\u000f"}, d2 = {"Lone/me/qrscanner/QrScannerWidget;", "Lone/me/sdk/arch/Widget;", "Lj2e;", "Lg39;", "Lg44;", "Lqq3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "canSelectFile", "", "sourceId", "(ZLjava/lang/Long;)V", "qr-scanner_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class QrScannerWidget extends Widget implements j2e, g39, g44, qq3 {
    public static final /* synthetic */ yy7[] E0 = {new toc(QrScannerWidget.class, "isPickFromGalleryEnabled", "isPickFromGalleryEnabled()Z", 0), ho7.d(vid.a, QrScannerWidget.class, "sourceId", "getSourceId()Ljava/lang/Long;", 0), new toc(QrScannerWidget.class, "cameraPreview", "getCameraPreview()Landroidx/camera/view/PreviewView;", 0), new toc(QrScannerWidget.class, "overlayView", "getOverlayView()Lone/me/qrscanner/QrScanOverlayView;", 0), new toc(QrScannerWidget.class, "torchButton", "getTorchButton()Lone/me/sdk/uikit/common/overlaybutton/OneMeOverlayButton;", 0), new toc(QrScannerWidget.class, "hintText", "getHintText()Landroid/widget/TextView;", 0), new toc(QrScannerWidget.class, "blackoutView", "getBlackoutView()Landroid/widget/FrameLayout;", 0)};
    public static final int F0 = v4j.c(-16777216, 0.25f);
    public static final Size G0 = new Size(1280, 720);
    public ViewPropertyAnimator A0;
    public ViewPropertyAnimator B0;
    public boolean C0;
    public final bwf D0;
    public final Object X;
    public final Object Y;
    public final Object Z;
    public final hs a;
    public final hs b;
    public final ka5 c;
    public final k18 d;
    public final Object o;
    public final bbd s0;
    public final bbd t0;
    public final bbd u0;
    public final bbd v0;
    public final bbd w0;
    public final RectF x0;
    public o38 y0;
    public boolean z0;

    /* JADX WARN: Multi-variable type inference failed */
    public QrScannerWidget() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final trc A0() {
        return (trc) this.d.getValue();
    }

    public final void B0(Uri uri) {
        trc trcVarA0 = A0();
        trcVarA0.Y.O(trcVarA0, trc.u0[0], svi.d(trcVarA0.a, ((q2b) trcVarA0.c).b(), i84.b, new rrc(trcVarA0, uri, null)));
    }

    @Override // defpackage.g44
    public final void C(int i, Bundle bundle) {
        if (i != 0) {
            if (i != 1) {
                return;
            }
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("image/*");
            startActivityForResult(intent, 228);
            return;
        }
        trc trcVarA0 = A0();
        yy7 yy7Var = E0[1];
        Long l = (Long) this.b.a(this);
        ci5 ci5Var = trcVarA0.X;
        orc.c.getClass();
        hi4 hi4Var = new hi4();
        hi4Var.a = ":media-picker/select/photo";
        hi4Var.c(Boolean.TRUE, "from_qr_scanner");
        if (l != null) {
            hi4Var.c(l, "source_id");
        }
        xc0.l(hi4Var.b(), ci5Var);
    }

    public final void C0(String str) {
        if (this.z0) {
            return;
        }
        View view = getView();
        if (view != null) {
            uog.i(view, p07.CONFIRM);
        }
        this.z0 = true;
        A0().t(new xyd(str));
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, k18] */
    public final void D0() {
        o38 o38Var = this.y0;
        if (o38Var != null) {
            o38Var.w();
        }
        this.y0 = null;
        o38 o38Var2 = new o38(getContext());
        o38Var2.l(f32.c);
        ExecutorService executorService = (ExecutorService) this.o.getValue();
        n1a n1aVar = A0().o;
        jei.b();
        yc7 yc7Var = o38Var2.g;
        if (yc7Var != n1aVar || o38Var2.f != executorService) {
            o38Var2.f = executorService;
            o38Var2.g = n1aVar;
            o38Var2.h.I(executorService, n1aVar);
            o38Var2.k(yc7Var, n1aVar);
        }
        jei.b();
        if (((Integer) ((id7) o38Var2.h.f).d(id7.b, 0)).intValue() != 0) {
            o38Var2.t(0, Integer.valueOf(o38Var2.h.G()), Integer.valueOf(o38Var2.h.H()));
            o38Var2.r(null);
        }
        aod aodVar = new aod(l16.c, new bod(G0), null);
        jei.b();
        if (o38Var2.d != aodVar) {
            o38Var2.d = aodVar;
            o38Var2.u();
            o38Var2.r(null);
        }
        this.y0 = o38Var2;
        ((a9c) this.s0.D(this, E0[2])).setController(o38Var2);
        try {
            j48 viewLifecycleOwner = getViewLifecycleOwner();
            jei.b();
            o38Var2.H = viewLifecycleOwner;
            o38Var2.r(null);
        } catch (IllegalStateException e) {
            wqi.e(QrScannerWidget.class.getName(), "Fail to bindCameraToLifecycle", e);
        }
        jei.b();
        gw0.w(new g56(aw0.a(lc4.b(o38Var2.y), getViewLifecycleOwner().p(), l38.d), new dsc(null, this), 1), getViewLifecycleScope());
    }

    @Override // defpackage.qq3
    public final void F(Bundle bundle) {
        if (bundle == null || bundle.getInt("dialog_id") != 0) {
            return;
        }
        A0().t(uyd.a);
    }

    @Override // defpackage.g39
    public final void b0(String str) {
        B0(Uri.parse(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    @Override // defpackage.qq3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r7, android.os.Bundle r8) {
        /*
            r6 = this;
            if (r8 == 0) goto Lc3
            java.lang.String r0 = "dialog_id"
            int r8 = r8.getInt(r0)
            r0 = 29
            r1 = 0
            r2 = 13
            r3 = 1
            if (r8 == 0) goto L64
            if (r8 == r3) goto L14
            goto Lc3
        L14:
            int r8 = defpackage.n9b.a
            if (r7 != r8) goto Lc3
            qsb r7 = r6.z0()
            vrb r8 = defpackage.vrb.a
            w5 r8 = r8.getAccessor()
            r8.d(r2)
            java.lang.String[] r8 = defpackage.qsb.n
            r7.getClass()
            int r7 = r8.length
            r2 = r1
        L2c:
            if (r2 >= r7) goto L4b
            r4 = r8[r2]
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r0) goto L40
            java.lang.String[] r5 = defpackage.qsb.d
            java.lang.String[] r5 = defpackage.qsb.p
            boolean r5 = defpackage.ys.i(r5, r4)
            if (r5 == 0) goto L40
            r4 = r3
            goto L44
        L40:
            boolean r4 = r6.shouldShowRequestPermissionRationale(r4)
        L44:
            if (r4 == 0) goto L48
            r1 = r3
            goto L4b
        L48:
            int r2 = r2 + 1
            goto L2c
        L4b:
            if (r1 == 0) goto L5a
            qsb r7 = r6.z0()
            s2i r8 = new s2i
            r8.<init>(r6, r3)
            r7.l(r8)
            return
        L5a:
            java.lang.String r7 = defpackage.ap7.a
            android.content.Context r7 = r6.getContext()
            defpackage.ap7.e(r7)
            return
        L64:
            int r8 = defpackage.n9b.a
            if (r7 != r8) goto Lb6
            qsb r7 = r6.z0()
            vrb r8 = defpackage.vrb.a
            w5 r8 = r8.getAccessor()
            r8.d(r2)
            java.lang.String[] r8 = defpackage.qsb.m
            r7.getClass()
            int r7 = r8.length
            r2 = r1
        L7c:
            if (r2 >= r7) goto L9b
            r4 = r8[r2]
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r0) goto L90
            java.lang.String[] r5 = defpackage.qsb.d
            java.lang.String[] r5 = defpackage.qsb.p
            boolean r5 = defpackage.ys.i(r5, r4)
            if (r5 == 0) goto L90
            r4 = r3
            goto L94
        L90:
            boolean r4 = r6.shouldShowRequestPermissionRationale(r4)
        L94:
            if (r4 == 0) goto L98
            r1 = r3
            goto L9b
        L98:
            int r2 = r2 + 1
            goto L7c
        L9b:
            if (r1 == 0) goto Lac
            qsb r7 = r6.z0()
            s2i r0 = new s2i
            r0.<init>(r6, r3)
            r1 = 158(0x9e, float:2.21E-43)
            r7.j(r0, r8, r1)
            return
        Lac:
            java.lang.String r7 = defpackage.ap7.a
            android.content.Context r7 = r6.getContext()
            defpackage.ap7.e(r7)
            return
        Lb6:
            int r8 = defpackage.n9b.f
            if (r7 != r8) goto Lc3
            trc r7 = r6.A0()
            uyd r8 = defpackage.uyd.a
            r7.t(r8)
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.qrscanner.QrScannerWidget.g(int, android.os.Bundle):void");
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.c;
    }

    @Override // defpackage.c54
    public final void onActivityResult(int i, int i2, Intent intent) {
        Uri data;
        if (i != 228 || i2 != -1 || intent == null || (data = intent.getData()) == null) {
            return;
        }
        B0(data);
    }

    @Override // defpackage.c54
    public final void onAttach(View view) {
        super.onAttach(view);
        if (this.y0 == null || !z0().c(qsb.m)) {
            return;
        }
        try {
            o38 o38Var = this.y0;
            if (o38Var != null) {
                j48 viewLifecycleOwner = getViewLifecycleOwner();
                jei.b();
                o38Var.H = viewLifecycleOwner;
                o38Var.r(null);
            }
        } catch (IllegalStateException e) {
            wqi.e(QrScannerWidget.class.getName(), "Failed to bind camera on attach", e);
            D0();
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        f8b f8bVar;
        int i;
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setLayoutParams(layoutParams);
        zfi.a(constraintLayout);
        constraintLayout.setClipChildren(false);
        v1a v1aVar = a93.s0;
        constraintLayout.setBackgroundColor(v1aVar.B(constraintLayout).c.b().l);
        a9c a9cVar = new a9c(constraintLayout.getContext());
        a9cVar.setId(n9b.c);
        a9cVar.setLayoutParams(new kt3(-1, -1));
        constraintLayout.addView(a9cVar);
        hrc hrcVar = new hrc(constraintLayout.getContext());
        hrcVar.setId(n9b.g);
        hrcVar.setLayoutParams(new kt3(-1, -1));
        hrcVar.setAlpha(0.0f);
        constraintLayout.addView(hrcVar);
        FrameLayout frameLayout = new FrameLayout(constraintLayout.getContext());
        frameLayout.setId(n9b.b);
        frameLayout.setLayoutParams(new kt3(-1, -1));
        frameLayout.setBackgroundColor(-16777216);
        constraintLayout.addView(frameLayout);
        yfb yfbVar = new yfb(constraintLayout.getContext(), 6);
        yfbVar.setId(n9b.h);
        yfbVar.setLayoutParams(new kt3(-1, -2));
        yfbVar.setTitle(o9b.h);
        yfbVar.setLeftActions(new hfb(new iqb(16, this)));
        yfbVar.setForm(qfb.a);
        yfbVar.setCustomTheme(v1aVar.B(yfbVar).c);
        zfi.c(yfbVar);
        constraintLayout.addView(yfbVar);
        TextView textView = new TextView(constraintLayout.getContext());
        textView.setId(n9b.e);
        textView.setLayoutParams(new kt3(-1, -2));
        textView.setVisibility(0);
        dpg.M.b(textView, t75.b);
        tqi.c(new x9(3, null, 28), textView);
        yy7[] yy7VarArr = E0;
        yy7 yy7Var = yy7VarArr[0];
        hs hsVar = this.a;
        textView.setText(((Boolean) hsVar.a(this)).booleanValue() ? z7.e(textView.getContext(), o9b.e) : z7.e(textView.getContext(), o9b.f));
        textView.setTextAlignment(4);
        textView.setGravity(17);
        textView.setShadowLayer(vw4.d().getDisplayMetrics().density * 10.0f, 0.0f, vw4.d().getDisplayMetrics().density * 10.0f, F0);
        constraintLayout.addView(textView);
        yy7 yy7Var2 = yy7VarArr[0];
        boolean zBooleanValue = ((Boolean) hsVar.a(this)).booleanValue();
        c8b c8bVar = c8b.b;
        if (zBooleanValue) {
            f8bVar = new f8b(constraintLayout.getContext());
            f8bVar.setId(n9b.d);
            float f = 52;
            f8bVar.setLayoutParams(new kt3(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
            f8bVar.setMode(c8bVar);
            yy7 yy7Var3 = yy7VarArr[0];
            f8bVar.setVisibility(((Boolean) hsVar.a(this)).booleanValue() ? 0 : 8);
            int i2 = ivd.f1;
            v1aVar.y(f8bVar).getIcon();
            Drawable drawableB = r34.b(getContext(), i2);
            if (drawableB != null) {
                t35.g(drawableB, -1);
                t35.i(drawableB, PorterDuff.Mode.SRC_IN);
            }
            f8bVar.b(drawableB, "M6.922 6.664L6.358 6.711l0.123-0.378 0.021-0.061C6.747 5.538 6.963 4.889 7.226 4.37c0.292-0.576 0.668-1.052 1.257-1.409 0.594-0.361 1.201-0.47 1.855-0.46 0.594 0.009 1.29 0.12 2.083 0.246l0.063 0.01c1.02 0.162 2.131 0.366 3.132 0.611 1 0.244 2.08 0.575 3.061 0.901l0.06 0.02c0.762 0.253 1.431 0.476 1.962 0.741 0.585 0.293 1.073 0.67 1.435 1.264 0.358 0.588 0.472 1.184 0.466 1.829-0.006 0.582-0.113 1.258-0.234 2.023l-0.01 0.063c-0.09 0.567-0.198 1.144-0.327 1.673-0.129 0.528-0.299 1.09-0.481 1.635l-0.02 0.061c-0.245 0.734-0.462 1.384-0.725 1.903-0.205 0.404-0.452 0.76-0.785 1.06 0.048-0.587 0.082-1.204 0.082-1.791 0-0.599-0.036-1.229-0.085-1.826l-0.01-0.118c-0.06-0.723-0.124-1.507-0.282-2.184-0.194-0.829-0.556-1.656-1.287-2.387-0.744-0.742-1.588-1.098-2.42-1.288-0.687-0.157-1.488-0.222-2.239-0.283l-0.118-0.01C12.609 6.569 11.436 6.5 10.35 6.5c-1.087 0-2.26 0.069-3.31 0.154l-0.118 0.01zM10.35 21.5c-1.03 0-2.158-0.065-3.187-0.149l-0.064-0.006c-0.8-0.065-1.503-0.122-2.082-0.254-0.638-0.146-1.201-0.396-1.693-0.887-0.487-0.487-0.74-1.039-0.886-1.667-0.133-0.567-0.189-1.249-0.253-2.02L2.18 16.452C2.132 15.88 2.1 15.294 2.1 14.75s0.032-1.13 0.08-1.703l0.005-0.064c0.064-0.771 0.12-1.453 0.253-2.02 0.146-0.628 0.399-1.18 0.886-1.667 0.492-0.491 1.055-0.741 1.693-0.887 0.579-0.132 1.282-0.189 2.082-0.254l0.064-0.006C8.192 8.065 9.32 8 10.35 8c1.03 0 2.158 0.065 3.187 0.149l0.064 0.006c0.8 0.065 1.503 0.122 2.082 0.254 0.638 0.146 1.201 0.396 1.693 0.887 0.488 0.487 0.74 1.039 0.887 1.667 0.132 0.567 0.188 1.249 0.252 2.02l0.006 0.064c0.047 0.573 0.079 1.159 0.079 1.703s-0.032 1.13-0.079 1.702l-0.006 0.065c-0.064 0.771-0.12 1.453-0.252 2.02-0.147 0.628-0.399 1.18-0.887 1.667-0.492 0.491-1.055 0.741-1.693 0.887-0.579 0.132-1.282 0.189-2.082 0.254l-0.064 0.006C12.508 21.435 11.38 21.5 10.35 21.5zM7.85 13c0 0.69-0.56 1.25-1.25 1.25S5.35 13.69 5.35 13s0.56-1.25 1.25-1.25S7.85 12.31 7.85 13zm-0.524 6.357c1.001 0.082 2.07 0.143 3.024 0.143 0.954 0 2.023-0.061 3.024-0.143 0.883-0.072 1.441-0.12 1.864-0.216 0.38-0.087 0.568-0.196 0.725-0.352 0.161-0.162 0.268-0.347 0.352-0.707 0.095-0.406 0.141-0.94 0.212-1.795l0.019-0.234c-0.827-0.714-1.709-1.391-2.687-1.977-0.559-0.335-1.257-0.328-1.805 0.025-2.041 1.31-4.193 3.377-5.87 5.153 0.31 0.035 0.682 0.066 1.142 0.103z", vw4.d().getDisplayMetrics().density * 24.0f);
            final int i3 = 0;
            f8bVar.setOnClickListener(new View.OnClickListener(this) { // from class: urc
                public final /* synthetic */ QrScannerWidget b;

                {
                    this.b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Integer num;
                    int i4 = i3;
                    boolean z = false;
                    QrScannerWidget qrScannerWidget = this.b;
                    switch (i4) {
                        case 0:
                            yy7[] yy7VarArr2 = QrScannerWidget.E0;
                            if (!qrScannerWidget.z0().e()) {
                                Bundle bundleE = ho7.e(1, "dialog_id");
                                yy7[] yy7VarArr3 = BottomSheetWidget.B0;
                                oq3 oq3VarE = az1.e(mvd.U0, bundleE, null, 4);
                                oq3VarE.g(Integer.valueOf(y9b.w));
                                oq3VarE.f(new n5g(o9b.g));
                                oq3VarE.a(new pq3(n9b.a, new n5g(mvd.e1), 3, true, 3, 2), new pq3(n9b.f, new n5g(mvd.c1), 2, true, 3, 2));
                                ConfirmationBottomSheet confirmationBottomSheetE = oq3VarE.e();
                                confirmationBottomSheetE.setTargetController(qrScannerWidget);
                                c54 parentController = qrScannerWidget;
                                while (parentController.getParentController() != null) {
                                    parentController = parentController.getParentController();
                                }
                                eud eudVar = parentController instanceof eud ? (eud) parentController : null;
                                ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
                                confirmationBottomSheetE.N0(qrScannerWidget);
                                if (ytdVarE0 != null) {
                                    bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
                                    az1.u(false, budVar, true, "BottomSheetWidget");
                                    ytdVarE0.H(budVar);
                                    break;
                                }
                            } else {
                                y34 y34VarA = h6j.a(2);
                                n5g n5gVar = new n5g(mvd.e);
                                Integer numValueOf = Integer.valueOf(ivd.l1);
                                int i5 = w9b.R;
                                y34VarA.o(ve3.j(new b44(0, n5gVar, numValueOf, Integer.valueOf(i5), 4), new b44(1, new n5g(mvd.B0), Integer.valueOf(ivd.X), Integer.valueOf(i5), 4))).G(new n5g(o9b.b)).build().u(qrScannerWidget);
                                break;
                            }
                            break;
                        default:
                            o38 o38Var = qrScannerWidget.y0;
                            if (o38Var != null) {
                                jei.b();
                                qh6 qh6Var = o38Var.y;
                                if (qh6Var != null && (num = (Integer) qh6Var.d()) != null && num.intValue() == 1) {
                                    z = true;
                                }
                            }
                            boolean z2 = !z;
                            o38 o38Var2 = qrScannerWidget.y0;
                            if (o38Var2 != null) {
                                o38Var2.f(z2);
                                break;
                            }
                            break;
                    }
                }
            });
            constraintLayout.addView(f8bVar);
        } else {
            f8bVar = null;
        }
        f8b f8bVar2 = new f8b(constraintLayout.getContext());
        f8bVar2.setId(n9b.i);
        float f2 = 52;
        f8bVar2.setLayoutParams(new kt3(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density)));
        f8bVar2.setMode(c8bVar);
        final int i4 = 1;
        f8bVar2.setOnClickListener(new View.OnClickListener(this) { // from class: urc
            public final /* synthetic */ QrScannerWidget b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Integer num;
                int i42 = i4;
                boolean z = false;
                QrScannerWidget qrScannerWidget = this.b;
                switch (i42) {
                    case 0:
                        yy7[] yy7VarArr2 = QrScannerWidget.E0;
                        if (!qrScannerWidget.z0().e()) {
                            Bundle bundleE = ho7.e(1, "dialog_id");
                            yy7[] yy7VarArr3 = BottomSheetWidget.B0;
                            oq3 oq3VarE = az1.e(mvd.U0, bundleE, null, 4);
                            oq3VarE.g(Integer.valueOf(y9b.w));
                            oq3VarE.f(new n5g(o9b.g));
                            oq3VarE.a(new pq3(n9b.a, new n5g(mvd.e1), 3, true, 3, 2), new pq3(n9b.f, new n5g(mvd.c1), 2, true, 3, 2));
                            ConfirmationBottomSheet confirmationBottomSheetE = oq3VarE.e();
                            confirmationBottomSheetE.setTargetController(qrScannerWidget);
                            c54 parentController = qrScannerWidget;
                            while (parentController.getParentController() != null) {
                                parentController = parentController.getParentController();
                            }
                            eud eudVar = parentController instanceof eud ? (eud) parentController : null;
                            ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
                            confirmationBottomSheetE.N0(qrScannerWidget);
                            if (ytdVarE0 != null) {
                                bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
                                az1.u(false, budVar, true, "BottomSheetWidget");
                                ytdVarE0.H(budVar);
                                break;
                            }
                        } else {
                            y34 y34VarA = h6j.a(2);
                            n5g n5gVar = new n5g(mvd.e);
                            Integer numValueOf = Integer.valueOf(ivd.l1);
                            int i5 = w9b.R;
                            y34VarA.o(ve3.j(new b44(0, n5gVar, numValueOf, Integer.valueOf(i5), 4), new b44(1, new n5g(mvd.B0), Integer.valueOf(ivd.X), Integer.valueOf(i5), 4))).G(new n5g(o9b.b)).build().u(qrScannerWidget);
                            break;
                        }
                        break;
                    default:
                        o38 o38Var = qrScannerWidget.y0;
                        if (o38Var != null) {
                            jei.b();
                            qh6 qh6Var = o38Var.y;
                            if (qh6Var != null && (num = (Integer) qh6Var.d()) != null && num.intValue() == 1) {
                                z = true;
                            }
                        }
                        boolean z2 = !z;
                        o38 o38Var2 = qrScannerWidget.y0;
                        if (o38Var2 != null) {
                            o38Var2.f(z2);
                            break;
                        }
                        break;
                }
            }
        });
        constraintLayout.addView(f8bVar2);
        ut3 ut3VarG = l5j.g(constraintLayout);
        int id = yfbVar.getId();
        ut3VarG.d(id, 3, 0, 3);
        ut3VarG.d(id, 6, 0, 6);
        ut3VarG.d(id, 7, 0, 7);
        int id2 = a9cVar.getId();
        ut3VarG.d(id2, 6, 0, 6);
        ut3VarG.d(id2, 3, 0, 3);
        ut3VarG.d(id2, 7, 0, 7);
        ut3VarG.d(id2, 4, 0, 4);
        int id3 = hrcVar.getId();
        ut3VarG.d(id3, 6, 0, 6);
        ut3VarG.d(id3, 7, 0, 7);
        ut3VarG.d(id3, 3, 0, 3);
        ut3VarG.d(id3, 4, 0, 4);
        int id4 = frameLayout.getId();
        ut3VarG.d(id4, 6, 0, 6);
        ut3VarG.d(id4, 3, 0, 3);
        ut3VarG.d(id4, 7, 0, 7);
        ut3VarG.d(id4, 4, 0, 4);
        int id5 = textView.getId();
        ut3VarG.d(id5, 6, 0, 6);
        float f3 = 30;
        az1.q(f3, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 6, id5, 5));
        ut3VarG.d(id5, 7, 0, 7);
        az1.q(f3, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 7, id5, 5));
        ut3VarG.d(id5, 4, 0, 4);
        az1.q(150, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 4, id5, 5));
        if (f8bVar != null) {
            int id6 = f8bVar.getId();
            ut3VarG.d(id6, 6, 0, 6);
            az1.q(108, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 6, id6, 5));
            ut3VarG.d(id6, 4, 0, 4);
            az1.q(64, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 4, id6, 5));
        }
        int id7 = f8bVar2.getId();
        if (f8bVar != null) {
            ut3VarG.d(id7, 6, f8bVar.getId(), 7);
            az1.q(40, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 6, id7, 5));
            i = 0;
            ut3VarG.d(id7, 7, 0, 7);
            az1.q(108, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 7, id7, 5));
        } else {
            i = 0;
            ut3VarG.d(id7, 6, 0, 6);
            ut3VarG.d(id7, 7, 0, 7);
        }
        ut3VarG.d(id7, 4, i, 4);
        new fua(ut3VarG, 4, id7, 5).e(kti.d(64 * vw4.d().getDisplayMetrics().density));
        ut3VarG.a(constraintLayout);
        return constraintLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        ViewPropertyAnimator viewPropertyAnimator = this.A0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.A0 = null;
        ViewPropertyAnimator viewPropertyAnimator2 = this.B0;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
        }
        this.B0 = null;
        o38 o38Var = this.y0;
        if (o38Var != null) {
            o38Var.w();
        }
        this.y0 = null;
        this.x0.setEmpty();
    }

    @Override // defpackage.c54
    public final void onDetach(View view) {
        super.onDetach(view);
        o38 o38Var = this.y0;
        if (o38Var != null) {
            o38Var.w();
        }
    }

    @Override // defpackage.c54
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 158) {
            for (int i2 : iArr) {
                if (i2 == 0) {
                    D0();
                    return;
                }
            }
            A0().t(uyd.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        if (!getContext().getPackageManager().hasSystemFeature("android.hardware.camera")) {
            A0().t(wyd.a);
        }
        jva jvaVarH = getRouter().h();
        int i = 10;
        if (jvaVarH != null) {
            jvaVarH.a(getViewLifecycleOwner(), new z44(this, i));
        }
        Continuation continuation = null;
        if (z0().c(qsb.m)) {
            D0();
        } else {
            Bundle bundleE = ho7.e(0, "dialog_id");
            yy7[] yy7VarArr = BottomSheetWidget.B0;
            oq3 oq3VarE = az1.e(mvd.U0, bundleE, null, 4);
            oq3VarE.g(Integer.valueOf(y9b.w));
            oq3VarE.f(new n5g(o9b.a));
            oq3VarE.a(new pq3(n9b.a, new n5g(mvd.e1), 3, true, 3, 2), new pq3(n9b.f, new n5g(mvd.c1), 2, true, 3, 2));
            ConfirmationBottomSheet confirmationBottomSheetE = oq3VarE.e();
            confirmationBottomSheetE.setTargetController(this);
            c54 parentController = this;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            eud eudVar = parentController instanceof eud ? (eud) parentController : null;
            ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
            confirmationBottomSheetE.N0(this);
            if (ytdVarE0 != null) {
                bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
                az1.u(false, budVar, true, "BottomSheetWidget");
                ytdVarE0.H(budVar);
            }
        }
        x26 x26VarB = lc4.b(((a9c) this.s0.D(this, E0[2])).getPreviewStreamState());
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(x26VarB, l48VarP, l38Var), new yrc(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(A0().X, getViewLifecycleOwner().p(), l38Var), new zrc(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(A0().t0, getViewLifecycleOwner().p(), l38Var), new asc(null, this), 1), getViewLifecycleScope());
        uxb uxbVar = new uxb(A0().d, this, i);
        int i2 = 3;
        gw0.w(new g56(aw0.a(new mwd(new d56(uxbVar, new s83(i2, continuation, i2), null)), getViewLifecycleOwner().p(), l38Var), new bsc(null, view, this), 1), getViewLifecycleScope());
    }

    @Override // defpackage.g39
    public final void q(String str, RectF rectF, Rect rect) {
    }

    public final hrc y0() {
        return (hrc) this.t0.D(this, E0[3]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final qsb z0() {
        return (qsb) this.Z.getValue();
    }

    public /* synthetic */ QrScannerWidget(Bundle bundle, int i, tk4 tk4Var) {
        this((i & 1) != 0 ? null : bundle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public QrScannerWidget(Bundle bundle) {
        final int i = 0;
        super(bundle, i, 2, null);
        this.a = new hs(Boolean.class, "can_select_file");
        this.b = new hs(Long.class, "source_id");
        this.c = new ka5(new hdc(17), new cm6(this) { // from class: wrc
            public final /* synthetic */ QrScannerWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i2 = i;
                QrScannerWidget qrScannerWidget = this.b;
                switch (i2) {
                    case 0:
                        yy7[] yy7VarArr = QrScannerWidget.E0;
                        hs hsVar = qrScannerWidget.b;
                        yy7[] yy7VarArr2 = QrScannerWidget.E0;
                        yy7 yy7Var = yy7VarArr2[1];
                        if (((Long) hsVar.a(qrScannerWidget)) == null) {
                            return qmb.g;
                        }
                        yy7 yy7Var2 = yy7VarArr2[1];
                        return new qmb(null, 0, e7f.X, (Long) hsVar.a(qrScannerWidget), null, null, 51);
                    case 1:
                        yy7[] yy7VarArr3 = QrScannerWidget.E0;
                        return r34.b(qrScannerWidget.getContext(), ivd.u);
                    default:
                        yy7[] yy7VarArr4 = QrScannerWidget.E0;
                        return r34.b(qrScannerWidget.getContext(), ivd.t);
                }
            }
        }, 4);
        this.d = createViewModelLazy(trc.class, new vdc(6, new hdc(18)));
        this.o = ipi.b(3, new hdc(19));
        final int i2 = 1;
        this.X = ipi.b(3, new cm6(this) { // from class: wrc
            public final /* synthetic */ QrScannerWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i2;
                QrScannerWidget qrScannerWidget = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = QrScannerWidget.E0;
                        hs hsVar = qrScannerWidget.b;
                        yy7[] yy7VarArr2 = QrScannerWidget.E0;
                        yy7 yy7Var = yy7VarArr2[1];
                        if (((Long) hsVar.a(qrScannerWidget)) == null) {
                            return qmb.g;
                        }
                        yy7 yy7Var2 = yy7VarArr2[1];
                        return new qmb(null, 0, e7f.X, (Long) hsVar.a(qrScannerWidget), null, null, 51);
                    case 1:
                        yy7[] yy7VarArr3 = QrScannerWidget.E0;
                        return r34.b(qrScannerWidget.getContext(), ivd.u);
                    default:
                        yy7[] yy7VarArr4 = QrScannerWidget.E0;
                        return r34.b(qrScannerWidget.getContext(), ivd.t);
                }
            }
        });
        final int i3 = 2;
        this.Y = ipi.b(3, new cm6(this) { // from class: wrc
            public final /* synthetic */ QrScannerWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i3;
                QrScannerWidget qrScannerWidget = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = QrScannerWidget.E0;
                        hs hsVar = qrScannerWidget.b;
                        yy7[] yy7VarArr2 = QrScannerWidget.E0;
                        yy7 yy7Var = yy7VarArr2[1];
                        if (((Long) hsVar.a(qrScannerWidget)) == null) {
                            return qmb.g;
                        }
                        yy7 yy7Var2 = yy7VarArr2[1];
                        return new qmb(null, 0, e7f.X, (Long) hsVar.a(qrScannerWidget), null, null, 51);
                    case 1:
                        yy7[] yy7VarArr3 = QrScannerWidget.E0;
                        return r34.b(qrScannerWidget.getContext(), ivd.u);
                    default:
                        yy7[] yy7VarArr4 = QrScannerWidget.E0;
                        return r34.b(qrScannerWidget.getContext(), ivd.t);
                }
            }
        });
        this.Z = ipi.b(3, new hdc(20));
        this.s0 = viewBinding(n9b.c);
        this.t0 = viewBinding(n9b.g);
        this.u0 = viewBinding(n9b.i);
        this.v0 = viewBinding(n9b.e);
        this.w0 = viewBinding(n9b.b);
        this.x0 = new RectF();
        this.D0 = new bwf(new hdc(21));
    }

    public QrScannerWidget(boolean z, Long l) {
        this(gwi.b(new imb("can_select_file", Boolean.valueOf(z)), new imb("source_id", l)));
    }
}
