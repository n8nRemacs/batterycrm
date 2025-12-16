package one.me.chatscreen.mediabar.permission;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.c38;
import defpackage.cm6;
import defpackage.gwi;
import defpackage.ho7;
import defpackage.j02;
import defpackage.k18;
import defpackage.kt8;
import defpackage.n1b;
import defpackage.o22;
import defpackage.p22;
import defpackage.qsb;
import defpackage.rsb;
import defpackage.s2i;
import defpackage.sn0;
import defpackage.toc;
import defpackage.vid;
import defpackage.wqi;
import defpackage.yo3;
import defpackage.yy7;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.permission.MediaBarPermissionWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.tamtam.android.widgets.quickcamera.CameraxCameraApiView;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006¨\u0006\u0007"}, d2 = {"Lone/me/chatscreen/mediabar/permission/MediaBarPermissionWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "()V", "chat-screen_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class MediaBarPermissionWidget extends Widget {
    public static final /* synthetic */ yy7[] Y = {new toc(MediaBarPermissionWidget.class, "noCameraPermissionContent", "getNoCameraPermissionContent()Landroid/widget/LinearLayout;", 0), ho7.d(vid.a, MediaBarPermissionWidget.class, "cameraContent", "getCameraContent()Landroid/widget/FrameLayout;", 0), new toc(MediaBarPermissionWidget.class, "permissionContent", "getPermissionContent()Landroid/widget/LinearLayout;", 0)};
    public final sn0 X;
    public final k18 a;
    public final k18 b;
    public final sn0 c;
    public final sn0 d;
    public final sn0 o;

    public MediaBarPermissionWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = rsb.a.a();
        this.b = createViewModelLazy(kt8.class, new yo3(29, new c38(13)));
        final int i = 0;
        this.c = binding(new cm6(this) { // from class: lt8
            public final /* synthetic */ MediaBarPermissionWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i2 = i;
                int i3 = 0;
                int i4 = 17;
                int i5 = 16;
                Continuation continuation = null;
                MediaBarPermissionWidget mediaBarPermissionWidget = this.b;
                int i6 = 1;
                switch (i2) {
                    case 0:
                        yy7[] yy7VarArr = MediaBarPermissionWidget.Y;
                        LinearLayout linearLayout = new LinearLayout(mediaBarPermissionWidget.getContext());
                        linearLayout.setOrientation(1);
                        linearLayout.setVerticalGravity(16);
                        linearLayout.setHorizontalGravity(1);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        float f = 4;
                        layoutParams.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(24 * vw4.d().getDisplayMetrics().density), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
                        linearLayout.setLayoutParams(layoutParams);
                        Drawable drawableMutate = r34.b(linearLayout.getContext(), l1b.e).mutate();
                        AppCompatImageView appCompatImageView = new AppCompatImageView(linearLayout.getContext(), null);
                        appCompatImageView.setImageDrawable(drawableMutate);
                        AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout.getContext(), null);
                        appCompatTextView.setText(n1b.N);
                        appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
                        appCompatTextView.setPadding(appCompatTextView.getPaddingLeft(), kti.d(10 * vw4.d().getDisplayMetrics().density), appCompatTextView.getPaddingRight(), appCompatTextView.getPaddingBottom());
                        dpg.z.b(appCompatTextView, t75.b);
                        tqi.c(new s3(drawableMutate, appCompatTextView, continuation, i5), linearLayout);
                        linearLayout.addView(appCompatImageView);
                        linearLayout.addView(appCompatTextView);
                        f8j.d(linearLayout, 300L, new mt8(mediaBarPermissionWidget, i3));
                        return linearLayout;
                    case 1:
                        yy7[] yy7VarArr2 = MediaBarPermissionWidget.Y;
                        CameraxCameraApiView cameraxCameraApiView = new CameraxCameraApiView(mediaBarPermissionWidget.getContext(), null, 14);
                        cameraxCameraApiView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        cameraxCameraApiView.c();
                        return cameraxCameraApiView;
                    case 2:
                        yy7[] yy7VarArr3 = MediaBarPermissionWidget.Y;
                        FrameLayout frameLayout = new FrameLayout(mediaBarPermissionWidget.getContext());
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, kti.d(138 * vw4.d().getDisplayMetrics().density));
                        float f2 = 12;
                        layoutParams2.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(4 * vw4.d().getDisplayMetrics().density), kti.d(f2 * vw4.d().getDisplayMetrics().density), kti.d(8 * vw4.d().getDisplayMetrics().density));
                        frameLayout.setLayoutParams(layoutParams2);
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setCornerRadius(vw4.d().getDisplayMetrics().density * 12.0f);
                        frameLayout.setBackground(gradientDrawable);
                        frameLayout.setClipToOutline(true);
                        tqi.c(new ld0(gradientDrawable, continuation, 23), frameLayout);
                        vpi.b(new g56(((kt8) mediaBarPermissionWidget.b.getValue()).c, new nt8(mediaBarPermissionWidget, frameLayout, null), 1), mediaBarPermissionWidget.getViewLifecycleScope());
                        return frameLayout;
                    default:
                        yy7[] yy7VarArr4 = MediaBarPermissionWidget.Y;
                        LinearLayout linearLayout2 = new LinearLayout(mediaBarPermissionWidget.getContext());
                        linearLayout2.setOrientation(1);
                        linearLayout2.setVerticalGravity(16);
                        linearLayout2.setHorizontalGravity(1);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, kti.d(166 * vw4.d().getDisplayMetrics().density));
                        float f3 = 20;
                        float f4 = 0;
                        layoutParams3.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(vw4.d().getDisplayMetrics().density * f4), kti.d(f3 * vw4.d().getDisplayMetrics().density), kti.d(f4 * vw4.d().getDisplayMetrics().density));
                        linearLayout2.setLayoutParams(layoutParams3);
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(linearLayout2.getContext(), null);
                        appCompatTextView2.setText(n1b.T);
                        dpg.k.b(appCompatTextView2, t75.b);
                        appCompatTextView2.setGravity(17);
                        AppCompatTextView appCompatTextView3 = new AppCompatTextView(linearLayout2.getContext(), null);
                        appCompatTextView3.setText(n1b.S);
                        dpg.o.b(appCompatTextView3, t75.b);
                        appCompatTextView3.setPadding(appCompatTextView3.getPaddingLeft(), kti.d(4 * vw4.d().getDisplayMetrics().density), appCompatTextView3.getPaddingRight(), kti.d(16 * vw4.d().getDisplayMetrics().density));
                        appCompatTextView3.setGravity(17);
                        OneMeButton oneMeButton = new OneMeButton(linearLayout2.getContext(), null);
                        oneMeButton.setText(n1b.M);
                        oneMeButton.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                        f8j.d(oneMeButton, 300L, new mt8(mediaBarPermissionWidget, i6));
                        tqi.c(new s3(appCompatTextView2, appCompatTextView3, continuation, i4), linearLayout2);
                        linearLayout2.addView(appCompatTextView2);
                        linearLayout2.addView(appCompatTextView3);
                        linearLayout2.addView(oneMeButton);
                        return linearLayout2;
                }
            }
        });
        final int i2 = 1;
        this.d = binding(new cm6(this) { // from class: lt8
            public final /* synthetic */ MediaBarPermissionWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i2;
                int i3 = 0;
                int i4 = 17;
                int i5 = 16;
                Continuation continuation = null;
                MediaBarPermissionWidget mediaBarPermissionWidget = this.b;
                int i6 = 1;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = MediaBarPermissionWidget.Y;
                        LinearLayout linearLayout = new LinearLayout(mediaBarPermissionWidget.getContext());
                        linearLayout.setOrientation(1);
                        linearLayout.setVerticalGravity(16);
                        linearLayout.setHorizontalGravity(1);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        float f = 4;
                        layoutParams.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(24 * vw4.d().getDisplayMetrics().density), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
                        linearLayout.setLayoutParams(layoutParams);
                        Drawable drawableMutate = r34.b(linearLayout.getContext(), l1b.e).mutate();
                        AppCompatImageView appCompatImageView = new AppCompatImageView(linearLayout.getContext(), null);
                        appCompatImageView.setImageDrawable(drawableMutate);
                        AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout.getContext(), null);
                        appCompatTextView.setText(n1b.N);
                        appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
                        appCompatTextView.setPadding(appCompatTextView.getPaddingLeft(), kti.d(10 * vw4.d().getDisplayMetrics().density), appCompatTextView.getPaddingRight(), appCompatTextView.getPaddingBottom());
                        dpg.z.b(appCompatTextView, t75.b);
                        tqi.c(new s3(drawableMutate, appCompatTextView, continuation, i5), linearLayout);
                        linearLayout.addView(appCompatImageView);
                        linearLayout.addView(appCompatTextView);
                        f8j.d(linearLayout, 300L, new mt8(mediaBarPermissionWidget, i3));
                        return linearLayout;
                    case 1:
                        yy7[] yy7VarArr2 = MediaBarPermissionWidget.Y;
                        CameraxCameraApiView cameraxCameraApiView = new CameraxCameraApiView(mediaBarPermissionWidget.getContext(), null, 14);
                        cameraxCameraApiView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        cameraxCameraApiView.c();
                        return cameraxCameraApiView;
                    case 2:
                        yy7[] yy7VarArr3 = MediaBarPermissionWidget.Y;
                        FrameLayout frameLayout = new FrameLayout(mediaBarPermissionWidget.getContext());
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, kti.d(138 * vw4.d().getDisplayMetrics().density));
                        float f2 = 12;
                        layoutParams2.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(4 * vw4.d().getDisplayMetrics().density), kti.d(f2 * vw4.d().getDisplayMetrics().density), kti.d(8 * vw4.d().getDisplayMetrics().density));
                        frameLayout.setLayoutParams(layoutParams2);
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setCornerRadius(vw4.d().getDisplayMetrics().density * 12.0f);
                        frameLayout.setBackground(gradientDrawable);
                        frameLayout.setClipToOutline(true);
                        tqi.c(new ld0(gradientDrawable, continuation, 23), frameLayout);
                        vpi.b(new g56(((kt8) mediaBarPermissionWidget.b.getValue()).c, new nt8(mediaBarPermissionWidget, frameLayout, null), 1), mediaBarPermissionWidget.getViewLifecycleScope());
                        return frameLayout;
                    default:
                        yy7[] yy7VarArr4 = MediaBarPermissionWidget.Y;
                        LinearLayout linearLayout2 = new LinearLayout(mediaBarPermissionWidget.getContext());
                        linearLayout2.setOrientation(1);
                        linearLayout2.setVerticalGravity(16);
                        linearLayout2.setHorizontalGravity(1);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, kti.d(166 * vw4.d().getDisplayMetrics().density));
                        float f3 = 20;
                        float f4 = 0;
                        layoutParams3.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(vw4.d().getDisplayMetrics().density * f4), kti.d(f3 * vw4.d().getDisplayMetrics().density), kti.d(f4 * vw4.d().getDisplayMetrics().density));
                        linearLayout2.setLayoutParams(layoutParams3);
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(linearLayout2.getContext(), null);
                        appCompatTextView2.setText(n1b.T);
                        dpg.k.b(appCompatTextView2, t75.b);
                        appCompatTextView2.setGravity(17);
                        AppCompatTextView appCompatTextView3 = new AppCompatTextView(linearLayout2.getContext(), null);
                        appCompatTextView3.setText(n1b.S);
                        dpg.o.b(appCompatTextView3, t75.b);
                        appCompatTextView3.setPadding(appCompatTextView3.getPaddingLeft(), kti.d(4 * vw4.d().getDisplayMetrics().density), appCompatTextView3.getPaddingRight(), kti.d(16 * vw4.d().getDisplayMetrics().density));
                        appCompatTextView3.setGravity(17);
                        OneMeButton oneMeButton = new OneMeButton(linearLayout2.getContext(), null);
                        oneMeButton.setText(n1b.M);
                        oneMeButton.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                        f8j.d(oneMeButton, 300L, new mt8(mediaBarPermissionWidget, i6));
                        tqi.c(new s3(appCompatTextView2, appCompatTextView3, continuation, i4), linearLayout2);
                        linearLayout2.addView(appCompatTextView2);
                        linearLayout2.addView(appCompatTextView3);
                        linearLayout2.addView(oneMeButton);
                        return linearLayout2;
                }
            }
        });
        final int i3 = 2;
        this.o = binding(new cm6(this) { // from class: lt8
            public final /* synthetic */ MediaBarPermissionWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i3;
                int i32 = 0;
                int i4 = 17;
                int i5 = 16;
                Continuation continuation = null;
                MediaBarPermissionWidget mediaBarPermissionWidget = this.b;
                int i6 = 1;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = MediaBarPermissionWidget.Y;
                        LinearLayout linearLayout = new LinearLayout(mediaBarPermissionWidget.getContext());
                        linearLayout.setOrientation(1);
                        linearLayout.setVerticalGravity(16);
                        linearLayout.setHorizontalGravity(1);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        float f = 4;
                        layoutParams.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(24 * vw4.d().getDisplayMetrics().density), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
                        linearLayout.setLayoutParams(layoutParams);
                        Drawable drawableMutate = r34.b(linearLayout.getContext(), l1b.e).mutate();
                        AppCompatImageView appCompatImageView = new AppCompatImageView(linearLayout.getContext(), null);
                        appCompatImageView.setImageDrawable(drawableMutate);
                        AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout.getContext(), null);
                        appCompatTextView.setText(n1b.N);
                        appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
                        appCompatTextView.setPadding(appCompatTextView.getPaddingLeft(), kti.d(10 * vw4.d().getDisplayMetrics().density), appCompatTextView.getPaddingRight(), appCompatTextView.getPaddingBottom());
                        dpg.z.b(appCompatTextView, t75.b);
                        tqi.c(new s3(drawableMutate, appCompatTextView, continuation, i5), linearLayout);
                        linearLayout.addView(appCompatImageView);
                        linearLayout.addView(appCompatTextView);
                        f8j.d(linearLayout, 300L, new mt8(mediaBarPermissionWidget, i32));
                        return linearLayout;
                    case 1:
                        yy7[] yy7VarArr2 = MediaBarPermissionWidget.Y;
                        CameraxCameraApiView cameraxCameraApiView = new CameraxCameraApiView(mediaBarPermissionWidget.getContext(), null, 14);
                        cameraxCameraApiView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        cameraxCameraApiView.c();
                        return cameraxCameraApiView;
                    case 2:
                        yy7[] yy7VarArr3 = MediaBarPermissionWidget.Y;
                        FrameLayout frameLayout = new FrameLayout(mediaBarPermissionWidget.getContext());
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, kti.d(138 * vw4.d().getDisplayMetrics().density));
                        float f2 = 12;
                        layoutParams2.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(4 * vw4.d().getDisplayMetrics().density), kti.d(f2 * vw4.d().getDisplayMetrics().density), kti.d(8 * vw4.d().getDisplayMetrics().density));
                        frameLayout.setLayoutParams(layoutParams2);
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setCornerRadius(vw4.d().getDisplayMetrics().density * 12.0f);
                        frameLayout.setBackground(gradientDrawable);
                        frameLayout.setClipToOutline(true);
                        tqi.c(new ld0(gradientDrawable, continuation, 23), frameLayout);
                        vpi.b(new g56(((kt8) mediaBarPermissionWidget.b.getValue()).c, new nt8(mediaBarPermissionWidget, frameLayout, null), 1), mediaBarPermissionWidget.getViewLifecycleScope());
                        return frameLayout;
                    default:
                        yy7[] yy7VarArr4 = MediaBarPermissionWidget.Y;
                        LinearLayout linearLayout2 = new LinearLayout(mediaBarPermissionWidget.getContext());
                        linearLayout2.setOrientation(1);
                        linearLayout2.setVerticalGravity(16);
                        linearLayout2.setHorizontalGravity(1);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, kti.d(166 * vw4.d().getDisplayMetrics().density));
                        float f3 = 20;
                        float f4 = 0;
                        layoutParams3.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(vw4.d().getDisplayMetrics().density * f4), kti.d(f3 * vw4.d().getDisplayMetrics().density), kti.d(f4 * vw4.d().getDisplayMetrics().density));
                        linearLayout2.setLayoutParams(layoutParams3);
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(linearLayout2.getContext(), null);
                        appCompatTextView2.setText(n1b.T);
                        dpg.k.b(appCompatTextView2, t75.b);
                        appCompatTextView2.setGravity(17);
                        AppCompatTextView appCompatTextView3 = new AppCompatTextView(linearLayout2.getContext(), null);
                        appCompatTextView3.setText(n1b.S);
                        dpg.o.b(appCompatTextView3, t75.b);
                        appCompatTextView3.setPadding(appCompatTextView3.getPaddingLeft(), kti.d(4 * vw4.d().getDisplayMetrics().density), appCompatTextView3.getPaddingRight(), kti.d(16 * vw4.d().getDisplayMetrics().density));
                        appCompatTextView3.setGravity(17);
                        OneMeButton oneMeButton = new OneMeButton(linearLayout2.getContext(), null);
                        oneMeButton.setText(n1b.M);
                        oneMeButton.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                        f8j.d(oneMeButton, 300L, new mt8(mediaBarPermissionWidget, i6));
                        tqi.c(new s3(appCompatTextView2, appCompatTextView3, continuation, i4), linearLayout2);
                        linearLayout2.addView(appCompatTextView2);
                        linearLayout2.addView(appCompatTextView3);
                        linearLayout2.addView(oneMeButton);
                        return linearLayout2;
                }
            }
        });
        final int i4 = 3;
        this.X = binding(new cm6(this) { // from class: lt8
            public final /* synthetic */ MediaBarPermissionWidget b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i4;
                int i32 = 0;
                int i42 = 17;
                int i5 = 16;
                Continuation continuation = null;
                MediaBarPermissionWidget mediaBarPermissionWidget = this.b;
                int i6 = 1;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = MediaBarPermissionWidget.Y;
                        LinearLayout linearLayout = new LinearLayout(mediaBarPermissionWidget.getContext());
                        linearLayout.setOrientation(1);
                        linearLayout.setVerticalGravity(16);
                        linearLayout.setHorizontalGravity(1);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        float f = 4;
                        layoutParams.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(24 * vw4.d().getDisplayMetrics().density), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
                        linearLayout.setLayoutParams(layoutParams);
                        Drawable drawableMutate = r34.b(linearLayout.getContext(), l1b.e).mutate();
                        AppCompatImageView appCompatImageView = new AppCompatImageView(linearLayout.getContext(), null);
                        appCompatImageView.setImageDrawable(drawableMutate);
                        AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout.getContext(), null);
                        appCompatTextView.setText(n1b.N);
                        appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
                        appCompatTextView.setPadding(appCompatTextView.getPaddingLeft(), kti.d(10 * vw4.d().getDisplayMetrics().density), appCompatTextView.getPaddingRight(), appCompatTextView.getPaddingBottom());
                        dpg.z.b(appCompatTextView, t75.b);
                        tqi.c(new s3(drawableMutate, appCompatTextView, continuation, i5), linearLayout);
                        linearLayout.addView(appCompatImageView);
                        linearLayout.addView(appCompatTextView);
                        f8j.d(linearLayout, 300L, new mt8(mediaBarPermissionWidget, i32));
                        return linearLayout;
                    case 1:
                        yy7[] yy7VarArr2 = MediaBarPermissionWidget.Y;
                        CameraxCameraApiView cameraxCameraApiView = new CameraxCameraApiView(mediaBarPermissionWidget.getContext(), null, 14);
                        cameraxCameraApiView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        cameraxCameraApiView.c();
                        return cameraxCameraApiView;
                    case 2:
                        yy7[] yy7VarArr3 = MediaBarPermissionWidget.Y;
                        FrameLayout frameLayout = new FrameLayout(mediaBarPermissionWidget.getContext());
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, kti.d(138 * vw4.d().getDisplayMetrics().density));
                        float f2 = 12;
                        layoutParams2.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(4 * vw4.d().getDisplayMetrics().density), kti.d(f2 * vw4.d().getDisplayMetrics().density), kti.d(8 * vw4.d().getDisplayMetrics().density));
                        frameLayout.setLayoutParams(layoutParams2);
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setCornerRadius(vw4.d().getDisplayMetrics().density * 12.0f);
                        frameLayout.setBackground(gradientDrawable);
                        frameLayout.setClipToOutline(true);
                        tqi.c(new ld0(gradientDrawable, continuation, 23), frameLayout);
                        vpi.b(new g56(((kt8) mediaBarPermissionWidget.b.getValue()).c, new nt8(mediaBarPermissionWidget, frameLayout, null), 1), mediaBarPermissionWidget.getViewLifecycleScope());
                        return frameLayout;
                    default:
                        yy7[] yy7VarArr4 = MediaBarPermissionWidget.Y;
                        LinearLayout linearLayout2 = new LinearLayout(mediaBarPermissionWidget.getContext());
                        linearLayout2.setOrientation(1);
                        linearLayout2.setVerticalGravity(16);
                        linearLayout2.setHorizontalGravity(1);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, kti.d(166 * vw4.d().getDisplayMetrics().density));
                        float f3 = 20;
                        float f4 = 0;
                        layoutParams3.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(vw4.d().getDisplayMetrics().density * f4), kti.d(f3 * vw4.d().getDisplayMetrics().density), kti.d(f4 * vw4.d().getDisplayMetrics().density));
                        linearLayout2.setLayoutParams(layoutParams3);
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(linearLayout2.getContext(), null);
                        appCompatTextView2.setText(n1b.T);
                        dpg.k.b(appCompatTextView2, t75.b);
                        appCompatTextView2.setGravity(17);
                        AppCompatTextView appCompatTextView3 = new AppCompatTextView(linearLayout2.getContext(), null);
                        appCompatTextView3.setText(n1b.S);
                        dpg.o.b(appCompatTextView3, t75.b);
                        appCompatTextView3.setPadding(appCompatTextView3.getPaddingLeft(), kti.d(4 * vw4.d().getDisplayMetrics().density), appCompatTextView3.getPaddingRight(), kti.d(16 * vw4.d().getDisplayMetrics().density));
                        appCompatTextView3.setGravity(17);
                        OneMeButton oneMeButton = new OneMeButton(linearLayout2.getContext(), null);
                        oneMeButton.setText(n1b.M);
                        oneMeButton.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                        f8j.d(oneMeButton, 300L, new mt8(mediaBarPermissionWidget, i6));
                        tqi.c(new s3(appCompatTextView2, appCompatTextView3, continuation, i42), linearLayout2);
                        linearLayout2.addView(appCompatTextView2);
                        linearLayout2.addView(appCompatTextView3);
                        linearLayout2.addView(oneMeButton);
                        return linearLayout2;
                }
            }
        });
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final void onActivityResumed(Activity activity) {
        ((kt8) this.b.getValue()).b.f();
        super.onActivityResumed(activity);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        yy7[] yy7VarArr = Y;
        yy7 yy7Var = yy7VarArr[1];
        linearLayout.addView((FrameLayout) this.o.getValue());
        yy7 yy7Var2 = yy7VarArr[2];
        linearLayout.addView((LinearLayout) this.X.getValue());
        return linearLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        sn0 sn0Var = this.d;
        if (sn0Var.e()) {
            CameraxCameraApiView cameraxCameraApiView = (CameraxCameraApiView) ((j02) sn0Var.getValue());
            cameraxCameraApiView.getClass();
            wqi.c(CameraxCameraApiView.class.getName(), "destroyCamera", new Object[0]);
            cameraxCameraApiView.c.w();
            p22 p22Var = cameraxCameraApiView.d;
            p22Var.getClass();
            p22Var.a(new o22(p22Var, 1));
        }
        super.onDestroyView(view);
    }

    @Override // defpackage.c54
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        k18 k18Var = this.a;
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
            qsb.s((qsb) k18Var.getValue(), new s2i(this, 1), strArr, iArr, qsb.o, n1b.P, n1b.O, 192);
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
        int i3 = n1b.R;
        int i4 = n1b.Q;
        qsbVar.getClass();
        qsb.q(s2iVar, strArr, iArr, i3, i4);
    }

    public final void y0() {
        k18 k18Var = this.a;
        if (((qsb) k18Var.getValue()).c(qsb.m)) {
            ((qsb) k18Var.getValue()).l(new s2i(this, 1));
        } else {
            ((qsb) k18Var.getValue()).j(new s2i(this, 1), qsb.o, 162);
        }
    }

    public MediaBarPermissionWidget() {
        this(gwi.a());
    }
}
