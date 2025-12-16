package com.avito.android.theme_settings;

import Y61.k;
import Y61.l;
import android.animation.Animator;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.Window;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.lib.util.z;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ThemeSettingsActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/theme_settings/ThemeSettingsActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ThemeSettingsActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: o, reason: collision with root package name */
    @k
    public static final a f301286o = new a(null);

    /* renamed from: m, reason: collision with root package name */
    public ImageView f301287m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public MotionEvent f301288n;

    /* compiled from: ThemeSettingsActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/theme_settings/ThemeSettingsActivity$a;", "", "<init>", "()V", "", "IS_AFTER_ONBOARDING", "Ljava/lang/String;", "TAG", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public final ThemeSettingsFragment a2() {
        ThemeSettingsFragment.f301289o0.getClass();
        ThemeSettingsFragment themeSettingsFragment = new ThemeSettingsFragment();
        themeSettingsFragment.setArguments(new Bundle());
        H hE2 = getSupportFragmentManager().e();
        hE2.n(R.id.fragment_container, themeSettingsFragment, "com.avito.android.ThemeSettingsFragment");
        hE2.g();
        return themeSettingsFragment;
    }

    @Override // com.avito.android.ui.activity.a, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(@k MotionEvent motionEvent) {
        this.f301288n = motionEvent;
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.app.m, androidx.view.n, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@k Configuration configuration) {
        View view;
        super.onConfigurationChanged(configuration);
        Fragment fragmentH = getSupportFragmentManager().H("com.avito.android.ThemeSettingsFragment");
        if (fragmentH == null || (view = fragmentH.getView()) == null || view.getWidth() <= 0 || view.getHeight() <= 0) {
            return;
        }
        ImageView imageView = this.f301287m;
        if (imageView == null) {
            imageView = null;
        }
        f301286o.getClass();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        view.draw(canvas);
        imageView.setImageBitmap(bitmapCreateBitmap);
        float fHypot = (float) Math.hypot(view.getWidth(), view.getHeight());
        View view2 = a2().getView();
        if (view2 == null) {
            return;
        }
        com.avito.android.ui.activity.a.J1(this);
        com.avito.android.ui.activity.a.H1(this);
        z zVar = z.f181429a;
        Window window = getWindow();
        zVar.getClass();
        z.a(window, this, null);
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int i12 = iArr[0];
        int i13 = iArr[1];
        MotionEvent motionEvent = this.f301288n;
        int iMax = Math.max((motionEvent != null ? (int) motionEvent.getRawX() : 0) - i12, 0);
        MotionEvent motionEvent2 = this.f301288n;
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view2, iMax, Math.max((motionEvent2 != null ? (int) motionEvent2.getRawY() : 0) - i13, 0), 0.0f, fHypot);
        animatorCreateCircularReveal.setDuration(300L);
        animatorCreateCircularReveal.start();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.theme_settings_activity);
        if (getSupportFragmentManager().H("com.avito.android.ThemeSettingsFragment") == null) {
            a2();
        }
        this.f301287m = (ImageView) findViewById(R.id.background);
    }
}
