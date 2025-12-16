package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.ExecutorService;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.sdk.gallery.selectalbum.SelectAlbumWidget;
import one.me.sdk.uikit.common.button.OneMeButton;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.widgets.quickcamera.CameraxCameraApiView;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class ou8 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaBarWidget b;

    public /* synthetic */ ou8(MediaBarWidget mediaBarWidget, int i) {
        this.a = i;
        this.b = mediaBarWidget;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v18, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v5, types: [un4] */
    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        int i2 = 10;
        int i3 = 12;
        l38 l38Var = l38.d;
        int i4 = 3;
        int i5 = 8;
        qqg qqgVar = qqg.a;
        int i6 = 6;
        int i7 = 4;
        int i8 = 13;
        int i9 = 1;
        MediaBarWidget mediaBarWidget = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = MediaBarWidget.c1;
                f82 f82Var = new f82(mediaBarWidget.getContext());
                f82Var.setId(m1b.F);
                f82Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                f82Var.setVisibility(8);
                return f82Var;
            case 1:
                yy7[] yy7VarArr2 = MediaBarWidget.c1;
                FrameLayout frameLayout = new FrameLayout(mediaBarWidget.getContext());
                frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, kti.d(10 * vw4.d().getDisplayMetrics().density)));
                frameLayout.setPadding(frameLayout.getPaddingLeft(), kti.d(6 * vw4.d().getDisplayMetrics().density), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
                sn0 sn0Var = mediaBarWidget.u0;
                yy7 yy7Var = MediaBarWidget.c1[4];
                frameLayout.addView((FrameLayout) sn0Var.getValue());
                return frameLayout;
            case 2:
                yy7[] yy7VarArr3 = MediaBarWidget.c1;
                yfb yfbVar = new yfb(mediaBarWidget.getContext(), 6);
                yfbVar.setId(iyc.media_bar__album_chooser);
                yfbVar.setTitle(h3d.media_bar_recent);
                yfbVar.setLeftActions(new hfb(new pu8(mediaBarWidget, 2)));
                yfbVar.setTitleClickListener(new ou8(mediaBarWidget, i8));
                return yfbVar;
            case 3:
                yy7[] yy7VarArr4 = MediaBarWidget.c1;
                f82 f82Var2 = new f82(mediaBarWidget.getContext());
                f82Var2.setId(iyc.media_bar__primary_container);
                f82Var2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                return f82Var2;
            case 4:
                yy7[] yy7VarArr5 = MediaBarWidget.c1;
                f82 f82Var3 = new f82(mediaBarWidget.getContext());
                f82Var3.setId(iyc.media_bar__partial_media_access_container);
                f82Var3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                return f82Var3;
            case 5:
                yy7[] yy7VarArr6 = MediaBarWidget.c1;
                p12 p12Var = new p12(mediaBarWidget.getContext());
                p12Var.setListener(mediaBarWidget);
                buc bucVar = (buc) mediaBarWidget.y0.getValue();
                ExecutorService executorServiceD = ((g4b) uv2.a.getAccessor().c(56)).d();
                if (p12Var.a == null) {
                    ytc ytcVar = new ytc(p12Var.getContext());
                    ytcVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    p12Var.a = ytcVar;
                    x6i x6iVar = new x6i(6, p12Var);
                    ytcVar.d = bucVar;
                    ytcVar.s0 = x6iVar;
                    ytcVar.o = executorServiceD;
                    ytcVar.getCameraApi().setCameraListener(new s6b(ytcVar));
                    gw0.w(new g56(aw0.a(bucVar.v0, tfh.a(ytcVar).p(), l38Var), new vtc(null, ytcVar), 1), zpi.a(tfh.a(ytcVar).p()));
                    gw0.w(new g56(aw0.a(bucVar.u0, tfh.a(ytcVar).p(), l38Var), new wtc(null, ytcVar), 1), zpi.a(tfh.a(ytcVar).p()));
                    gw0.w(new g56(aw0.a(bucVar.t0, tfh.a(ytcVar).p(), l38Var), new xtc(null, ytcVar), 1), zpi.a(tfh.a(ytcVar).p()));
                    ytc ytcVar2 = p12Var.a;
                    if (ytcVar2 == null) {
                        ytcVar2 = null;
                    }
                    p12Var.addView(ytcVar2);
                    ytc ytcVar3 = p12Var.a;
                    if (ytcVar3 == null) {
                        ytcVar3 = null;
                    }
                    ((CameraxCameraApiView) ytcVar3.getCameraApi()).c();
                    f8j.d(p12Var, 300L, new j6(i5, p12Var));
                }
                gw0.w(new g56(aw0.a(mediaBarWidget.N0().D0, mediaBarWidget.getViewLifecycleOwner().p(), l38Var), new qu8(null, p12Var), 1), mediaBarWidget.getViewLifecycleScope());
                p12Var.setForeground(mediaBarWidget.B0);
                return p12Var;
            case 6:
                yy7[] yy7VarArr7 = MediaBarWidget.c1;
                ice iceVar = new ice(mediaBarWidget.N0());
                gw0.w(new g56(aw0.a(mediaBarWidget.N0().y0, mediaBarWidget.getViewLifecycleOwner().p(), l38Var), new fv8(null, iceVar), 1), mediaBarWidget.getViewLifecycleScope());
                return iceVar;
            case 7:
                yy7[] yy7VarArr8 = MediaBarWidget.c1;
                RecyclerView recyclerView = new RecyclerView(mediaBarWidget.getContext(), null);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
                float f = 4;
                layoutParams.setMargins(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(6 * vw4.d().getDisplayMetrics().density), kti.d(f * vw4.d().getDisplayMetrics().density));
                recyclerView.setLayoutParams(layoutParams);
                uhd itemAnimator = recyclerView.getItemAnimator();
                 = itemAnimator instanceof un4 ? (un4) itemAnimator : 0;
                if ( != 0) {
                    g = false;
                }
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(vw4.d().getDisplayMetrics().density * 12.0f);
                recyclerView.setBackground(gradientDrawable);
                recyclerView.setClipToOutline(true);
                sn0 sn0Var2 = mediaBarWidget.G0;
                yy7 yy7Var2 = MediaBarWidget.c1[11];
                ((ice) sn0Var2.getValue()).X = new ox3(recyclerView, 1, mediaBarWidget);
                recyclerView.getContext();
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
                linearLayoutManager.p1(0);
                recyclerView.setLayoutManager(linearLayoutManager);
                return recyclerView;
            case 8:
                yy7[] yy7VarArr9 = MediaBarWidget.c1;
                ?? linearLayout = new LinearLayout(mediaBarWidget.getContext());
                linearLayout.setVerticalGravity(16);
                OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), null);
                oneMeButton.setMode(iza.b);
                oneMeButton.setAppearance(gza.c);
                oneMeButton.setEndIcon(Integer.valueOf(l1b.f));
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                float f2 = 8;
                layoutParams2.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f2), ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, kti.d(f2 * vw4.d().getDisplayMetrics().density), ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
                oneMeButton.setLayoutParams(layoutParams2);
                f8j.d(oneMeButton, 300L, new ye6(14, mediaBarWidget));
                linearLayout.addView(oneMeButton);
                sn0 sn0Var3 = mediaBarWidget.H0;
                yy7 yy7Var3 = MediaBarWidget.c1[12];
                linearLayout.addView((RecyclerView) sn0Var3.getValue());
                gw0.w(new g56(aw0.a(mediaBarWidget.N0().F0, mediaBarWidget.getViewLifecycleOwner().p(), l38Var), new gv8(null, linearLayout, mediaBarWidget), 1), mediaBarWidget.getViewLifecycleScope());
                return linearLayout;
            case 9:
                yy7[] yy7VarArr10 = MediaBarWidget.c1;
                View frameLayout2 = new FrameLayout(mediaBarWidget.getContext());
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(kti.d(40 * vw4.d().getDisplayMetrics().density), kti.d(4 * vw4.d().getDisplayMetrics().density));
                layoutParams3.gravity = 17;
                frameLayout2.setLayoutParams(layoutParams3);
                frameLayout2.setOutlineProvider(new u74(vw4.d().getDisplayMetrics().density * 40.0f));
                frameLayout2.setBackgroundColor(a93.s0.y(frameLayout2).getIcon().h);
                return frameLayout2;
            case 10:
                yy7[] yy7VarArr11 = MediaBarWidget.c1;
                mu8 mu8VarN0 = mediaBarWidget.N0();
                yy7[] yy7VarArr12 = mu8.J0;
                mu8VarN0.w(false);
                return qqgVar;
            case 11:
                yy7[] yy7VarArr13 = MediaBarWidget.c1;
                mu8 mu8VarN02 = mediaBarWidget.N0();
                yy7[] yy7VarArr14 = mu8.J0;
                mu8VarN02.w0.E(0);
                return qqgVar;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                yy7[] yy7VarArr15 = MediaBarWidget.c1;
                return Boolean.valueOf(mediaBarWidget.N0().v());
            case 13:
                bbd bbdVar = mediaBarWidget.U0;
                yy7[] yy7VarArr16 = MediaBarWidget.c1;
                if (mediaBarWidget.J0().getScrollState() == m6c.c) {
                    mediaBarWidget.L0().setVisibility(0);
                    yy7[] yy7VarArr17 = MediaBarWidget.c1;
                    c83 c83Var = (c83) bbdVar.D(mediaBarWidget, yy7VarArr17[18]);
                    ytd ytdVar = c83Var.a;
                    if (!fni.a(c83Var.b(), "select_album_widget")) {
                        ytdVar.R(false);
                        bud budVarA = l8j.a(new SelectAlbumWidget(mediaBarWidget.a, null), null, null);
                        budVarA.d("select_album_widget");
                        ytdVar.S(budVarA);
                    }
                    c54 c54VarB = k8j.b(((c83) bbdVar.D(mediaBarWidget, yy7VarArr17[18])).a);
                    SelectAlbumWidget selectAlbumWidget = c54VarB instanceof SelectAlbumWidget ? (SelectAlbumWidget) c54VarB : null;
                    if (selectAlbumWidget != null) {
                        selectAlbumWidget.B0();
                    }
                }
                return qqgVar;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                yy7[] yy7VarArr18 = MediaBarWidget.c1;
                ik9 ik9Var = new ik9(mediaBarWidget.getContext());
                ik9Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                ik9Var.setVisibility(8);
                ik9Var.setRightOuterIconActionState(zj9.a);
                ik9Var.setInputHint(n1b.K);
                ik9Var.d.addTextChangedListener(new li1(new pu8(mediaBarWidget, i9), i6, ik9Var));
                ik9Var.setRightOuterIconTouchListener(rmb.a(ik9Var.getContext(), new ou8(mediaBarWidget, i2)));
                ik9Var.setLeftInnerIconTouchListener(rmb.a(ik9Var.getContext(), new ou8(mediaBarWidget, 11)));
                return ik9Var;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return mediaBarWidget.Z0;
            case 16:
                yy7[] yy7VarArr19 = MediaBarWidget.c1;
                mediaBarWidget.N0().w0.E(4);
                zfi.b(mediaBarWidget.D0(), MediaBarWidget.d1, null);
                mediaBarWidget.I0().setLeftIcon(yud.U0);
                return qqgVar;
            case LangUtils.HASH_SEED /* 17 */:
                yy7[] yy7VarArr20 = MediaBarWidget.c1;
                LinearLayout linearLayout2 = new LinearLayout(mediaBarWidget.getContext());
                linearLayout2.setId(iyc.media_bar__draggable_container);
                linearLayout2.setOrientation(1);
                linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                linearLayout2.setOutlineProvider(mediaBarWidget.K0);
                linearLayout2.setForeground(mediaBarWidget.L0);
                tqi.c(new pg1(i4, , i7), linearLayout2);
                sn0 sn0Var4 = mediaBarWidget.v0;
                yy7[] yy7VarArr21 = MediaBarWidget.c1;
                yy7 yy7Var4 = yy7VarArr21[5];
                linearLayout2.addView((FrameLayout) sn0Var4.getValue());
                linearLayout2.addView(mediaBarWidget.M0());
                sn0 sn0Var5 = mediaBarWidget.A0;
                yy7 yy7Var5 = yy7VarArr21[9];
                linearLayout2.addView((f82) sn0Var5.getValue());
                FrameLayout frameLayout3 = new FrameLayout(linearLayout2.getContext());
                frameLayout3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                sn0 sn0Var6 = mediaBarWidget.x0;
                yy7 yy7Var6 = yy7VarArr21[7];
                frameLayout3.addView((f82) sn0Var6.getValue());
                frameLayout3.addView(mediaBarWidget.L0());
                linearLayout2.addView(frameLayout3);
                return linearLayout2;
            case 18:
                yy7[] yy7VarArr22 = MediaBarWidget.c1;
                f82 f82Var4 = new f82(mediaBarWidget.getContext());
                f82Var4.setId(iyc.media_bar__bottom_container);
                return f82Var4;
            case 19:
                yy7[] yy7VarArr23 = MediaBarWidget.c1;
                LinearLayout linearLayout3 = new LinearLayout(mediaBarWidget.getContext());
                linearLayout3.setOrientation(1);
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams4.gravity = 80;
                linearLayout3.setLayoutParams(layoutParams4);
                sn0 sn0Var7 = mediaBarWidget.I0;
                yy7[] yy7VarArr24 = MediaBarWidget.c1;
                yy7 yy7Var7 = yy7VarArr24[13];
                linearLayout3.addView((LinearLayout) sn0Var7.getValue());
                linearLayout3.addView(mediaBarWidget.I0());
                sn0 sn0Var8 = mediaBarWidget.O0;
                yy7 yy7Var8 = yy7VarArr24[16];
                linearLayout3.addView((f82) sn0Var8.getValue());
                zfi.b(linearLayout3, MediaBarWidget.d1, null);
                tqi.c(new m(3, null, 7), linearLayout3);
                linearLayout3.addOnLayoutChangeListener(new j81(i4, mediaBarWidget));
                linearLayout3.setClickable(true);
                return linearLayout3;
            case 20:
                yy7[] yy7VarArr25 = MediaBarWidget.c1;
                return dwa.a(mediaBarWidget.getContext());
            default:
                yy7[] yy7VarArr26 = MediaBarWidget.c1;
                return new mp6(new ou8(mediaBarWidget, i3));
        }
    }
}
