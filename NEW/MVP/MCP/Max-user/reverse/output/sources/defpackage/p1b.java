package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.res.ColorStateList;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.coroutines.Continuation;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.sdk.uikit.common.button.OneMeTitleSubtitleButton;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class p1b implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ p1b(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        int i2 = 3;
        Continuation continuation = null;
        Context context = this.b;
        switch (i) {
            case 0:
                ImageView imageView = new ImageView(context);
                imageView.setId(zud.y);
                kt3 kt3Var = new kt3(-2, -2);
                int i3 = zud.z;
                kt3Var.i = i3;
                kt3Var.v = i3;
                kt3Var.l = i3;
                kt3Var.t = i3;
                imageView.setLayoutParams(kt3Var);
                tqi.c(new nd0(i2, continuation, 6), imageView);
                return imageView;
            case 1:
                return new EnhancedVectorDrawable(context, y9b.n);
            case 2:
                return new ContextThemeWrapper(context, m5d.Theme_MaterialComponents);
            case 3:
                return new owe(context);
            case 4:
                ImageView imageView2 = new ImageView(context);
                imageView2.setId(zud.b0);
                float f = 28;
                kt3 kt3Var2 = new kt3(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
                int i4 = zud.c0;
                kt3Var2.i = i4;
                kt3Var2.v = i4;
                kt3Var2.l = i4;
                kt3Var2.t = i4;
                imageView2.setLayoutParams(kt3Var2);
                tqi.c(new nd0(i2, continuation, 7), imageView2);
                return imageView2;
            case 5:
                return new EnhancedVectorDrawable(context, y9b.n);
            case 6:
                ImageView imageView3 = new ImageView(context);
                int iD = kti.d(24 * vw4.d().getDisplayMetrics().density);
                int iD2 = kti.d(15 * vw4.d().getDisplayMetrics().density);
                int iD3 = kti.d(12 * vw4.d().getDisplayMetrics().density);
                imageView3.setPadding(iD2, iD3, iD2, iD3);
                imageView3.setLayoutParams(new ViewGroup.MarginLayoutParams((iD2 * 2) + iD, (iD3 * 2) + iD));
                imageView3.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                return imageView3;
            case 7:
                AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
                float f2 = 28;
                appCompatImageView.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density)));
                return appCompatImageView;
            case 8:
                t84 t84Var = new t84(context);
                t84Var.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                return t84Var;
            case 9:
                OneMeButton oneMeButton = new OneMeButton(context, null);
                oneMeButton.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                oneMeButton.setSize(jza.a);
                oneMeButton.setAppearance(gza.o);
                return oneMeButton;
            case 10:
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
                appCompatTextView.setLayoutParams(new kt3(kti.d(0 * vw4.d().getDisplayMetrics().density), -2));
                dpg.j.b(appCompatTextView, t75.b);
                a93.s0.y(appCompatTextView).getText();
                appCompatTextView.setTextColor(-1);
                appCompatTextView.setMaxLines(2);
                return appCompatTextView;
            case 11:
                TextView textView = new TextView(context);
                textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                dpg.j.b(textView, t75.b);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setSingleLine();
                textView.setTextColor(a93.s0.B(textView).c.getText().e);
                return textView;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                TextView textView2 = new TextView(context);
                textView2.setId(zud.E0);
                dpg.f.b(textView2, t75.b);
                textView2.setLetterSpacing(0.0f);
                textView2.setSingleLine(true);
                jgh.a(textView2);
                return textView2;
            case 13:
                ImageView imageView4 = new ImageView(context);
                imageView4.setId(zud.C0);
                return imageView4;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                w2b w2bVar = new w2b(context);
                w2bVar.setId(zud.D0);
                return w2bVar;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                yy7[] yy7VarArr = OneMeTitleSubtitleButton.y0;
                TextView textView3 = new TextView(context);
                textView3.setId(zud.k);
                textView3.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 17));
                return textView3;
            case 16:
                PopupWindow popupWindow = new PopupWindow(context);
                popupWindow.setBackgroundDrawable(null);
                popupWindow.setElevation(vw4.d().getDisplayMetrics().density * 12.0f);
                popupWindow.setFocusable(true);
                return popupWindow;
            case LangUtils.HASH_SEED /* 17 */:
                MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(context, "pip-media-session", new ComponentName(context, (Class<?>) k1c.class), null);
                mediaSessionCompat.setMetadata(new MediaMetadataCompat.Builder().putLong(MediaMetadataCompat.METADATA_KEY_DURATION, -1L).build());
                return mediaSessionCompat;
            case 18:
                return new pw5(context);
            case 19:
                w2b w2bVar2 = new w2b(context);
                w2bVar2.setAppearance(r2b.b);
                return w2bVar2;
            case 20:
                ImageView imageView5 = new ImageView(context);
                float f3 = 40;
                imageView5.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f3 * vw4.d().getDisplayMetrics().density)));
                imageView5.setImageTintList(ColorStateList.valueOf(a93.s0.y(imageView5).getIcon().k));
                u45.n(8, vw4.d().getDisplayMetrics().density, imageView5);
                return imageView5;
            case 21:
                ImageView imageView6 = new ImageView(context);
                float f4 = 36;
                imageView6.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f4), kti.d(f4 * vw4.d().getDisplayMetrics().density)));
                imageView6.setImageTintList(ColorStateList.valueOf(a93.s0.y(imageView6).getIcon().i));
                u45.n(10, vw4.d().getDisplayMetrics().density, imageView6);
                return imageView6;
            case 22:
                ImageView imageView7 = new ImageView(context);
                float f5 = 48;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f5), kti.d(f5 * vw4.d().getDisplayMetrics().density));
                layoutParams.gravity = 17;
                imageView7.setLayoutParams(layoutParams);
                return imageView7;
            case 23:
                ViewStub viewStub = new ViewStub(context);
                viewStub.setId(j0b.F0);
                viewStub.setVisibility(8);
                return viewStub;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                ViewStub viewStub2 = new ViewStub(context);
                viewStub2.setId(j0b.H0);
                return viewStub2;
            case 25:
                ImageView imageView8 = new ImageView(context);
                imageView8.setId(j0b.G0);
                return imageView8;
            case 26:
                TextView textView4 = new TextView(context);
                textView4.setId(j0b.H0);
                textView4.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                textView4.setTextColor(a93.s0.B(textView4).c.getText().e);
                dpg.l.b(textView4, t75.b);
                textView4.setVisibility(8);
                textView4.setGravity(17);
                return textView4;
            case 27:
                return me9.b(context);
            case 28:
                return context.getResources().getStringArray(tuc.oneme_prefs_saved_messages_aliases);
            default:
                return new xq0(context);
        }
    }
}
