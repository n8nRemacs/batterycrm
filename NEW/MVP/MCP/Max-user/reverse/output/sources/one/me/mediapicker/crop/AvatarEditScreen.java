package one.me.mediapicker.crop;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import defpackage.a93;
import defpackage.age;
import defpackage.aqc;
import defpackage.avd;
import defpackage.aw0;
import defpackage.b6;
import defpackage.bbd;
import defpackage.c2c;
import defpackage.cm6;
import defpackage.ea4;
import defpackage.eo7;
import defpackage.f8j;
import defpackage.g56;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.gza;
import defpackage.ho7;
import defpackage.hr6;
import defpackage.hs;
import defpackage.i6;
import defpackage.imb;
import defpackage.ipi;
import defpackage.ivd;
import defpackage.iza;
import defpackage.j2e;
import defpackage.jza;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.kti;
import defpackage.l;
import defpackage.l38;
import defpackage.l5c;
import defpackage.ld0;
import defpackage.md0;
import defpackage.nd0;
import defpackage.od0;
import defpackage.q;
import defpackage.q3;
import defpackage.s3;
import defpackage.toc;
import defpackage.tqi;
import defpackage.tyd;
import defpackage.vd0;
import defpackage.vid;
import defpackage.vw4;
import defpackage.x29;
import defpackage.x6b;
import defpackage.yc0;
import defpackage.yy7;
import defpackage.zc0;
import defpackage.zk6;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.mediapicker.crop.AvatarEditScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.tamtam.android.prefs.PmsKey;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/mediapicker/crop/AvatarEditScreen;", "Lone/me/sdk/arch/Widget;", "Lyc0;", "Lj2e;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "imageUriAsString", "filePath", "(Ljava/lang/String;Ljava/lang/String;)V", "media-picker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class AvatarEditScreen extends Widget implements yc0, j2e {
    public static final /* synthetic */ yy7[] u0 = {new toc(AvatarEditScreen.class, "uriAsString", "getUriAsString()Ljava/lang/String;", 0), ho7.d(vid.a, AvatarEditScreen.class, "filePath", "getFilePath()Ljava/lang/String;", 0), new toc(AvatarEditScreen.class, "avatarCropView", "getAvatarCropView()Lone/me/image/crop/view/AvatarCircleCropView;", 0), new toc(AvatarEditScreen.class, "resetButton", "getResetButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public final ka5 X;
    public final bbd Y;
    public final bbd Z;
    public final hs a;
    public final Object b;
    public final hs c;
    public final k18 d;
    public final eo7 o;
    public final RectF s0;
    public final k18 t0;

    public AvatarEditScreen(String str, String str2) {
        this(gwi.b(new imb("uri", str), new imb("file_path", str2)));
    }

    @Override // defpackage.j2e
    public final Integer N() {
        return Integer.valueOf(a93.s0.x(getContext()).k().b().a.k);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getC() {
        return this.o;
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.X;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, k18] */
    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(x6b.c);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        Continuation continuation = null;
        tqi.c(new s3(this, continuation, 2), frameLayout);
        zc0 zc0Var = new zc0(frameLayout.getContext());
        zc0Var.setId(x6b.d);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        float f = 0;
        float f2 = 96;
        layoutParams.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f2));
        zc0Var.setLayoutParams(layoutParams);
        l5c l5cVar = (l5c) ((age) this.t0.getValue());
        l5cVar.getClass();
        ea4 ea4Var = new ea4(new aqc(new b6()), (int) l5cVar.m(PmsKey.f97minimagesidesize, 64));
        ea4Var.o = true;
        zc0Var.setZoomableController(ea4Var);
        int i = 3;
        tqi.c(new ld0(i, continuation, 0), zc0Var);
        zc0Var.setZoomEnabled(true);
        hr6 hr6Var = new hr6(zc0Var.getResources());
        hr6Var.l = tyd.f;
        hr6Var.b = 0;
        zc0Var.setHierarchy(hr6Var.a());
        zc0Var.setTransformChangeListener(this);
        c2c c2cVarA = zk6.a.a();
        c2cVarA.c((Uri) this.b.getValue());
        c2cVarA.e = new md0(0, this);
        zc0Var.setController(c2cVarA.a());
        frameLayout.addView(zc0Var);
        View view = new View(frameLayout.getContext());
        view.setId(x6b.a);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, kti.d(f2 * vw4.d().getDisplayMetrics().density));
        layoutParams2.gravity = 80;
        view.setLayoutParams(layoutParams2);
        tqi.c(new q3(i, continuation, 1), view);
        frameLayout.addView(view);
        ImageView imageView = new ImageView(frameLayout.getContext());
        imageView.setId(x6b.h);
        float f3 = 24;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(vw4.d().getDisplayMetrics().density * f3));
        float f4 = 16;
        float f5 = 60;
        layoutParams3.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f4), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f5));
        layoutParams3.gravity = 8388691;
        imageView.setLayoutParams(layoutParams3);
        imageView.setImageResource(ivd.I1);
        tqi.c(new nd0(i, continuation, 3), imageView);
        final int i2 = 2;
        f8j.d(imageView, 300L, new View.OnClickListener(this) { // from class: kd0
            public final /* synthetic */ AvatarEditScreen b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, k18] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i2) {
                    case 0:
                        AvatarEditScreen avatarEditScreen = this.b;
                        yy7[] yy7VarArr = AvatarEditScreen.u0;
                        zc0 zc0VarY0 = avatarEditScreen.y0();
                        ea4 ea4Var2 = (ea4) zc0VarY0.getZoomableController();
                        ea4Var2.reset();
                        ea4Var2.e();
                        if (zc0VarY0.J0 > 0) {
                            ((ea4) zc0VarY0.getZoomableController()).d(zc0VarY0.J0);
                        }
                        zc0VarY0.a(ea4Var2.k);
                        vd0 vd0VarZ0 = avatarEditScreen.z0();
                        vd0VarZ0.s0 = false;
                        vd0VarZ0.X.reset();
                        ((OneMeButton) avatarEditScreen.Z.D(avatarEditScreen, AvatarEditScreen.u0[3])).setVisibility(8);
                        break;
                    case 1:
                        AvatarEditScreen avatarEditScreen2 = this.b;
                        yy7[] yy7VarArr2 = AvatarEditScreen.u0;
                        ea4 ea4Var3 = (ea4) avatarEditScreen2.y0().getZoomableController();
                        if (!ea4Var3.d) {
                            float fC = mei.c(ea4Var3.k, 0);
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fC, -fC);
                            valueAnimatorOfFloat.setDuration(250L);
                            valueAnimatorOfFloat.addUpdateListener(new q00(10, ea4Var3));
                            valueAnimatorOfFloat.addListener(ea4Var3);
                            valueAnimatorOfFloat.start();
                            vd0 vd0VarZ02 = avatarEditScreen2.z0();
                            svi.e(vd0VarZ02.a, ((q2b) ((lzf) vd0VarZ02.b.getValue())).a(), null, new sd0(vd0VarZ02, null), 2);
                            break;
                        }
                        break;
                    case 2:
                        AvatarEditScreen avatarEditScreen3 = this.b;
                        yy7[] yy7VarArr3 = AvatarEditScreen.u0;
                        ea4 ea4Var4 = (ea4) avatarEditScreen3.y0().getZoomableController();
                        if (!ea4Var4.d) {
                            float f6 = ea4Var4.p;
                            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(90.0f);
                            valueAnimatorOfFloat2.setDuration(250L);
                            valueAnimatorOfFloat2.addUpdateListener(new msd(ea4Var4, f6, 2));
                            valueAnimatorOfFloat2.addListener(ea4Var4);
                            valueAnimatorOfFloat2.start();
                            vd0 vd0VarZ03 = avatarEditScreen3.z0();
                            svi.e(vd0VarZ03.a, ((q2b) ((lzf) vd0VarZ03.b.getValue())).a(), null, new ud0(vd0VarZ03, null), 2);
                            break;
                        }
                        break;
                    case 3:
                        AvatarEditScreen avatarEditScreen4 = this.b;
                        yy7[] yy7VarArr4 = AvatarEditScreen.u0;
                        vd0 vd0VarZ04 = avatarEditScreen4.z0();
                        Uri uri = (Uri) avatarEditScreen4.b.getValue();
                        hs hsVar = avatarEditScreen4.c;
                        yy7 yy7Var = AvatarEditScreen.u0[1];
                        vd0VarZ04.t0.O(vd0VarZ04, vd0.v0[0], svi.d(vd0VarZ04.a, ((q2b) ((lzf) vd0VarZ04.b.getValue())).b(), i84.b, new rd0(vd0VarZ04, uri, (String) hsVar.a(avatarEditScreen4), new k(12, avatarEditScreen4), null)));
                        break;
                    default:
                        AvatarEditScreen avatarEditScreen5 = this.b;
                        yy7[] yy7VarArr5 = AvatarEditScreen.u0;
                        xfh.r(avatarEditScreen5.z0().d, jc3.b);
                        break;
                }
            }
        });
        frameLayout.addView(imageView);
        ImageView imageView2 = new ImageView(frameLayout.getContext());
        imageView2.setId(x6b.f);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(vw4.d().getDisplayMetrics().density * f3));
        layoutParams4.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f4), kti.d(f5 * vw4.d().getDisplayMetrics().density));
        layoutParams4.gravity = 8388693;
        imageView2.setLayoutParams(layoutParams4);
        imageView2.setImageResource(ivd.h1);
        tqi.c(new nd0(i, continuation, 2), imageView2);
        final int i3 = 1;
        f8j.d(imageView2, 300L, new View.OnClickListener(this) { // from class: kd0
            public final /* synthetic */ AvatarEditScreen b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, k18] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i3) {
                    case 0:
                        AvatarEditScreen avatarEditScreen = this.b;
                        yy7[] yy7VarArr = AvatarEditScreen.u0;
                        zc0 zc0VarY0 = avatarEditScreen.y0();
                        ea4 ea4Var2 = (ea4) zc0VarY0.getZoomableController();
                        ea4Var2.reset();
                        ea4Var2.e();
                        if (zc0VarY0.J0 > 0) {
                            ((ea4) zc0VarY0.getZoomableController()).d(zc0VarY0.J0);
                        }
                        zc0VarY0.a(ea4Var2.k);
                        vd0 vd0VarZ0 = avatarEditScreen.z0();
                        vd0VarZ0.s0 = false;
                        vd0VarZ0.X.reset();
                        ((OneMeButton) avatarEditScreen.Z.D(avatarEditScreen, AvatarEditScreen.u0[3])).setVisibility(8);
                        break;
                    case 1:
                        AvatarEditScreen avatarEditScreen2 = this.b;
                        yy7[] yy7VarArr2 = AvatarEditScreen.u0;
                        ea4 ea4Var3 = (ea4) avatarEditScreen2.y0().getZoomableController();
                        if (!ea4Var3.d) {
                            float fC = mei.c(ea4Var3.k, 0);
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fC, -fC);
                            valueAnimatorOfFloat.setDuration(250L);
                            valueAnimatorOfFloat.addUpdateListener(new q00(10, ea4Var3));
                            valueAnimatorOfFloat.addListener(ea4Var3);
                            valueAnimatorOfFloat.start();
                            vd0 vd0VarZ02 = avatarEditScreen2.z0();
                            svi.e(vd0VarZ02.a, ((q2b) ((lzf) vd0VarZ02.b.getValue())).a(), null, new sd0(vd0VarZ02, null), 2);
                            break;
                        }
                        break;
                    case 2:
                        AvatarEditScreen avatarEditScreen3 = this.b;
                        yy7[] yy7VarArr3 = AvatarEditScreen.u0;
                        ea4 ea4Var4 = (ea4) avatarEditScreen3.y0().getZoomableController();
                        if (!ea4Var4.d) {
                            float f6 = ea4Var4.p;
                            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(90.0f);
                            valueAnimatorOfFloat2.setDuration(250L);
                            valueAnimatorOfFloat2.addUpdateListener(new msd(ea4Var4, f6, 2));
                            valueAnimatorOfFloat2.addListener(ea4Var4);
                            valueAnimatorOfFloat2.start();
                            vd0 vd0VarZ03 = avatarEditScreen3.z0();
                            svi.e(vd0VarZ03.a, ((q2b) ((lzf) vd0VarZ03.b.getValue())).a(), null, new ud0(vd0VarZ03, null), 2);
                            break;
                        }
                        break;
                    case 3:
                        AvatarEditScreen avatarEditScreen4 = this.b;
                        yy7[] yy7VarArr4 = AvatarEditScreen.u0;
                        vd0 vd0VarZ04 = avatarEditScreen4.z0();
                        Uri uri = (Uri) avatarEditScreen4.b.getValue();
                        hs hsVar = avatarEditScreen4.c;
                        yy7 yy7Var = AvatarEditScreen.u0[1];
                        vd0VarZ04.t0.O(vd0VarZ04, vd0.v0[0], svi.d(vd0VarZ04.a, ((q2b) ((lzf) vd0VarZ04.b.getValue())).b(), i84.b, new rd0(vd0VarZ04, uri, (String) hsVar.a(avatarEditScreen4), new k(12, avatarEditScreen4), null)));
                        break;
                    default:
                        AvatarEditScreen avatarEditScreen5 = this.b;
                        yy7[] yy7VarArr5 = AvatarEditScreen.u0;
                        xfh.r(avatarEditScreen5.z0().d, jc3.b);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2);
        ImageView imageView3 = new ImageView(frameLayout.getContext());
        imageView3.setId(x6b.b);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(vw4.d().getDisplayMetrics().density * f3));
        float f6 = 14;
        layoutParams5.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f4), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f6));
        layoutParams5.gravity = 8388691;
        imageView3.setLayoutParams(layoutParams5);
        imageView3.setImageResource(ivd.k);
        tqi.c(new nd0(i, continuation, 0), imageView3);
        final int i4 = 4;
        f8j.d(imageView3, 300L, new View.OnClickListener(this) { // from class: kd0
            public final /* synthetic */ AvatarEditScreen b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, k18] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        AvatarEditScreen avatarEditScreen = this.b;
                        yy7[] yy7VarArr = AvatarEditScreen.u0;
                        zc0 zc0VarY0 = avatarEditScreen.y0();
                        ea4 ea4Var2 = (ea4) zc0VarY0.getZoomableController();
                        ea4Var2.reset();
                        ea4Var2.e();
                        if (zc0VarY0.J0 > 0) {
                            ((ea4) zc0VarY0.getZoomableController()).d(zc0VarY0.J0);
                        }
                        zc0VarY0.a(ea4Var2.k);
                        vd0 vd0VarZ0 = avatarEditScreen.z0();
                        vd0VarZ0.s0 = false;
                        vd0VarZ0.X.reset();
                        ((OneMeButton) avatarEditScreen.Z.D(avatarEditScreen, AvatarEditScreen.u0[3])).setVisibility(8);
                        break;
                    case 1:
                        AvatarEditScreen avatarEditScreen2 = this.b;
                        yy7[] yy7VarArr2 = AvatarEditScreen.u0;
                        ea4 ea4Var3 = (ea4) avatarEditScreen2.y0().getZoomableController();
                        if (!ea4Var3.d) {
                            float fC = mei.c(ea4Var3.k, 0);
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fC, -fC);
                            valueAnimatorOfFloat.setDuration(250L);
                            valueAnimatorOfFloat.addUpdateListener(new q00(10, ea4Var3));
                            valueAnimatorOfFloat.addListener(ea4Var3);
                            valueAnimatorOfFloat.start();
                            vd0 vd0VarZ02 = avatarEditScreen2.z0();
                            svi.e(vd0VarZ02.a, ((q2b) ((lzf) vd0VarZ02.b.getValue())).a(), null, new sd0(vd0VarZ02, null), 2);
                            break;
                        }
                        break;
                    case 2:
                        AvatarEditScreen avatarEditScreen3 = this.b;
                        yy7[] yy7VarArr3 = AvatarEditScreen.u0;
                        ea4 ea4Var4 = (ea4) avatarEditScreen3.y0().getZoomableController();
                        if (!ea4Var4.d) {
                            float f62 = ea4Var4.p;
                            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(90.0f);
                            valueAnimatorOfFloat2.setDuration(250L);
                            valueAnimatorOfFloat2.addUpdateListener(new msd(ea4Var4, f62, 2));
                            valueAnimatorOfFloat2.addListener(ea4Var4);
                            valueAnimatorOfFloat2.start();
                            vd0 vd0VarZ03 = avatarEditScreen3.z0();
                            svi.e(vd0VarZ03.a, ((q2b) ((lzf) vd0VarZ03.b.getValue())).a(), null, new ud0(vd0VarZ03, null), 2);
                            break;
                        }
                        break;
                    case 3:
                        AvatarEditScreen avatarEditScreen4 = this.b;
                        yy7[] yy7VarArr4 = AvatarEditScreen.u0;
                        vd0 vd0VarZ04 = avatarEditScreen4.z0();
                        Uri uri = (Uri) avatarEditScreen4.b.getValue();
                        hs hsVar = avatarEditScreen4.c;
                        yy7 yy7Var = AvatarEditScreen.u0[1];
                        vd0VarZ04.t0.O(vd0VarZ04, vd0.v0[0], svi.d(vd0VarZ04.a, ((q2b) ((lzf) vd0VarZ04.b.getValue())).b(), i84.b, new rd0(vd0VarZ04, uri, (String) hsVar.a(avatarEditScreen4), new k(12, avatarEditScreen4), null)));
                        break;
                    default:
                        AvatarEditScreen avatarEditScreen5 = this.b;
                        yy7[] yy7VarArr5 = AvatarEditScreen.u0;
                        xfh.r(avatarEditScreen5.z0().d, jc3.b);
                        break;
                }
            }
        });
        frameLayout.addView(imageView3);
        ImageView imageView4 = new ImageView(frameLayout.getContext());
        imageView4.setId(x6b.e);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f3 * vw4.d().getDisplayMetrics().density));
        layoutParams6.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f4 * vw4.d().getDisplayMetrics().density), kti.d(f6 * vw4.d().getDisplayMetrics().density));
        layoutParams6.gravity = 8388693;
        imageView4.setLayoutParams(layoutParams6);
        imageView4.setImageResource(ivd.h);
        tqi.c(new nd0(i, continuation, 1), imageView4);
        final int i5 = 3;
        f8j.d(imageView4, 300L, new View.OnClickListener(this) { // from class: kd0
            public final /* synthetic */ AvatarEditScreen b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, k18] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i5) {
                    case 0:
                        AvatarEditScreen avatarEditScreen = this.b;
                        yy7[] yy7VarArr = AvatarEditScreen.u0;
                        zc0 zc0VarY0 = avatarEditScreen.y0();
                        ea4 ea4Var2 = (ea4) zc0VarY0.getZoomableController();
                        ea4Var2.reset();
                        ea4Var2.e();
                        if (zc0VarY0.J0 > 0) {
                            ((ea4) zc0VarY0.getZoomableController()).d(zc0VarY0.J0);
                        }
                        zc0VarY0.a(ea4Var2.k);
                        vd0 vd0VarZ0 = avatarEditScreen.z0();
                        vd0VarZ0.s0 = false;
                        vd0VarZ0.X.reset();
                        ((OneMeButton) avatarEditScreen.Z.D(avatarEditScreen, AvatarEditScreen.u0[3])).setVisibility(8);
                        break;
                    case 1:
                        AvatarEditScreen avatarEditScreen2 = this.b;
                        yy7[] yy7VarArr2 = AvatarEditScreen.u0;
                        ea4 ea4Var3 = (ea4) avatarEditScreen2.y0().getZoomableController();
                        if (!ea4Var3.d) {
                            float fC = mei.c(ea4Var3.k, 0);
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fC, -fC);
                            valueAnimatorOfFloat.setDuration(250L);
                            valueAnimatorOfFloat.addUpdateListener(new q00(10, ea4Var3));
                            valueAnimatorOfFloat.addListener(ea4Var3);
                            valueAnimatorOfFloat.start();
                            vd0 vd0VarZ02 = avatarEditScreen2.z0();
                            svi.e(vd0VarZ02.a, ((q2b) ((lzf) vd0VarZ02.b.getValue())).a(), null, new sd0(vd0VarZ02, null), 2);
                            break;
                        }
                        break;
                    case 2:
                        AvatarEditScreen avatarEditScreen3 = this.b;
                        yy7[] yy7VarArr3 = AvatarEditScreen.u0;
                        ea4 ea4Var4 = (ea4) avatarEditScreen3.y0().getZoomableController();
                        if (!ea4Var4.d) {
                            float f62 = ea4Var4.p;
                            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(90.0f);
                            valueAnimatorOfFloat2.setDuration(250L);
                            valueAnimatorOfFloat2.addUpdateListener(new msd(ea4Var4, f62, 2));
                            valueAnimatorOfFloat2.addListener(ea4Var4);
                            valueAnimatorOfFloat2.start();
                            vd0 vd0VarZ03 = avatarEditScreen3.z0();
                            svi.e(vd0VarZ03.a, ((q2b) ((lzf) vd0VarZ03.b.getValue())).a(), null, new ud0(vd0VarZ03, null), 2);
                            break;
                        }
                        break;
                    case 3:
                        AvatarEditScreen avatarEditScreen4 = this.b;
                        yy7[] yy7VarArr4 = AvatarEditScreen.u0;
                        vd0 vd0VarZ04 = avatarEditScreen4.z0();
                        Uri uri = (Uri) avatarEditScreen4.b.getValue();
                        hs hsVar = avatarEditScreen4.c;
                        yy7 yy7Var = AvatarEditScreen.u0[1];
                        vd0VarZ04.t0.O(vd0VarZ04, vd0.v0[0], svi.d(vd0VarZ04.a, ((q2b) ((lzf) vd0VarZ04.b.getValue())).b(), i84.b, new rd0(vd0VarZ04, uri, (String) hsVar.a(avatarEditScreen4), new k(12, avatarEditScreen4), null)));
                        break;
                    default:
                        AvatarEditScreen avatarEditScreen5 = this.b;
                        yy7[] yy7VarArr5 = AvatarEditScreen.u0;
                        xfh.r(avatarEditScreen5.z0().d, jc3.b);
                        break;
                }
            }
        });
        frameLayout.addView(imageView4);
        OneMeButton oneMeButton = new OneMeButton(frameLayout.getContext(), null);
        oneMeButton.setId(x6b.g);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams7.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density), kti.d(12 * vw4.d().getDisplayMetrics().density));
        layoutParams7.gravity = 81;
        oneMeButton.setLayoutParams(layoutParams7);
        oneMeButton.setText(avd.h);
        oneMeButton.setSize(jza.a);
        oneMeButton.setMode(iza.d);
        oneMeButton.setAppearance(gza.o);
        oneMeButton.setVisibility(8);
        final int i6 = 0;
        f8j.d(oneMeButton, 300L, new View.OnClickListener(this) { // from class: kd0
            public final /* synthetic */ AvatarEditScreen b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, k18] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i6) {
                    case 0:
                        AvatarEditScreen avatarEditScreen = this.b;
                        yy7[] yy7VarArr = AvatarEditScreen.u0;
                        zc0 zc0VarY0 = avatarEditScreen.y0();
                        ea4 ea4Var2 = (ea4) zc0VarY0.getZoomableController();
                        ea4Var2.reset();
                        ea4Var2.e();
                        if (zc0VarY0.J0 > 0) {
                            ((ea4) zc0VarY0.getZoomableController()).d(zc0VarY0.J0);
                        }
                        zc0VarY0.a(ea4Var2.k);
                        vd0 vd0VarZ0 = avatarEditScreen.z0();
                        vd0VarZ0.s0 = false;
                        vd0VarZ0.X.reset();
                        ((OneMeButton) avatarEditScreen.Z.D(avatarEditScreen, AvatarEditScreen.u0[3])).setVisibility(8);
                        break;
                    case 1:
                        AvatarEditScreen avatarEditScreen2 = this.b;
                        yy7[] yy7VarArr2 = AvatarEditScreen.u0;
                        ea4 ea4Var3 = (ea4) avatarEditScreen2.y0().getZoomableController();
                        if (!ea4Var3.d) {
                            float fC = mei.c(ea4Var3.k, 0);
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fC, -fC);
                            valueAnimatorOfFloat.setDuration(250L);
                            valueAnimatorOfFloat.addUpdateListener(new q00(10, ea4Var3));
                            valueAnimatorOfFloat.addListener(ea4Var3);
                            valueAnimatorOfFloat.start();
                            vd0 vd0VarZ02 = avatarEditScreen2.z0();
                            svi.e(vd0VarZ02.a, ((q2b) ((lzf) vd0VarZ02.b.getValue())).a(), null, new sd0(vd0VarZ02, null), 2);
                            break;
                        }
                        break;
                    case 2:
                        AvatarEditScreen avatarEditScreen3 = this.b;
                        yy7[] yy7VarArr3 = AvatarEditScreen.u0;
                        ea4 ea4Var4 = (ea4) avatarEditScreen3.y0().getZoomableController();
                        if (!ea4Var4.d) {
                            float f62 = ea4Var4.p;
                            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(90.0f);
                            valueAnimatorOfFloat2.setDuration(250L);
                            valueAnimatorOfFloat2.addUpdateListener(new msd(ea4Var4, f62, 2));
                            valueAnimatorOfFloat2.addListener(ea4Var4);
                            valueAnimatorOfFloat2.start();
                            vd0 vd0VarZ03 = avatarEditScreen3.z0();
                            svi.e(vd0VarZ03.a, ((q2b) ((lzf) vd0VarZ03.b.getValue())).a(), null, new ud0(vd0VarZ03, null), 2);
                            break;
                        }
                        break;
                    case 3:
                        AvatarEditScreen avatarEditScreen4 = this.b;
                        yy7[] yy7VarArr4 = AvatarEditScreen.u0;
                        vd0 vd0VarZ04 = avatarEditScreen4.z0();
                        Uri uri = (Uri) avatarEditScreen4.b.getValue();
                        hs hsVar = avatarEditScreen4.c;
                        yy7 yy7Var = AvatarEditScreen.u0[1];
                        vd0VarZ04.t0.O(vd0VarZ04, vd0.v0[0], svi.d(vd0VarZ04.a, ((q2b) ((lzf) vd0VarZ04.b.getValue())).b(), i84.b, new rd0(vd0VarZ04, uri, (String) hsVar.a(avatarEditScreen4), new k(12, avatarEditScreen4), null)));
                        break;
                    default:
                        AvatarEditScreen avatarEditScreen5 = this.b;
                        yy7[] yy7VarArr5 = AvatarEditScreen.u0;
                        xfh.r(avatarEditScreen5.z0().d, jc3.b);
                        break;
                }
            }
        });
        frameLayout.addView(oneMeButton);
        return frameLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        gw0.w(new g56(aw0.a(z0().d, getViewLifecycleOwner().p(), l38.d), new od0(null, this), 1), getViewLifecycleScope());
    }

    public final zc0 y0() {
        return (zc0) this.Y.D(this, u0[2]);
    }

    public final vd0 z0() {
        return (vd0) this.d.getValue();
    }

    public AvatarEditScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        Class<String> cls = String.class;
        this.a = new hs(cls, "uri");
        this.b = ipi.b(3, new i6(13, this));
        this.c = new hs(cls, "file_path");
        this.d = createViewModelLazy(vd0.class, new q(7, new l(14)));
        this.o = eo7.a();
        this.X = new ka5(new l(15), (cm6) null, 6);
        this.Y = viewBinding(x6b.d);
        this.Z = viewBinding(x6b.g);
        this.s0 = new RectF();
        this.t0 = x29.a.getAccessor().d(47);
    }
}
