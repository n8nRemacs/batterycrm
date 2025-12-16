package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.os.Build;
import android.renderscript.RenderScript;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.sdk.uikit.common.views.OneMeDraweeView;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class ns2 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ ns2(dc5 dc5Var, Context context) {
        this.a = 3;
        this.b = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cm6
    public final Object invoke() {
        Object next;
        Object next2;
        Display defaultDisplay = null;
        switch (this.a) {
            case 0:
                TextView textView = new TextView(this.b);
                dpg.l.b(textView, t75.b);
                textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                float f = 12;
                textView.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(4 * vw4.d().getDisplayMetrics().density), kti.d(f * vw4.d().getDisplayMetrics().density), textView.getPaddingBottom());
                textView.setTextColor(a93.s0.y(textView).getText().b);
                return textView;
            case 1:
                SharedPreferences sharedPreferences = this.b.getSharedPreferences("one.me.sdk.design.theme", 0);
                sharedPreferences.getAll();
                return sharedPreferences;
            case 2:
                return Boolean.valueOf(((InputMethodManager) this.b.getSystemService("input_method")).isActive());
            case 3:
                Context context = this.b;
                lg8 lg8Var = lg8.d;
                Bitmap bitmapA = gaj.a(context, 0);
                int width = bitmapA != null ? bitmapA.getWidth() : 0;
                int i = context.getResources().getDisplayMetrics().densityDpi;
                int iIntValue = 48;
                Map mapJ = to8.j(new imb(240, 48), new imb(320, 64), new imb(480, 96), new imb(640, 96));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : mapJ.entrySet()) {
                    if (((Number) entry.getKey()).intValue() <= i) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap.entrySet().iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        int iIntValue2 = ((Number) ((Map.Entry) next).getKey()).intValue();
                        do {
                            Object next3 = it.next();
                            int iIntValue3 = ((Number) ((Map.Entry) next3).getKey()).intValue();
                            if (iIntValue2 < iIntValue3) {
                                next = next3;
                                iIntValue2 = iIntValue3;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                Map.Entry entry2 = (Map.Entry) next;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry3 : mapJ.entrySet()) {
                    if (((Number) entry3.getKey()).intValue() > i) {
                        linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                    }
                }
                Iterator it2 = linkedHashMap2.entrySet().iterator();
                if (it2.hasNext()) {
                    next2 = it2.next();
                    if (it2.hasNext()) {
                        int iIntValue4 = ((Number) ((Map.Entry) next2).getKey()).intValue();
                        do {
                            Object next4 = it2.next();
                            int iIntValue5 = ((Number) ((Map.Entry) next4).getKey()).intValue();
                            if (iIntValue4 > iIntValue5) {
                                next2 = next4;
                                iIntValue4 = iIntValue5;
                            }
                        } while (it2.hasNext());
                    }
                } else {
                    next2 = null;
                }
                Map.Entry entry4 = (Map.Entry) next2;
                String name = context.getClass().getName();
                l6b l6bVar = wqi.a;
                if (l6bVar != null && l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, name, "phoneDensity: " + i + "; lowerDensity: " + entry2 + "; higherDensity: " + entry4, null);
                }
                if (entry4 != null && ((Number) entry4.getKey()).intValue() == i) {
                    iIntValue = ((Number) entry4.getValue()).intValue();
                } else if ((entry2 != null ? (Integer) entry2.getKey() : null) != null && ((Number) entry2.getKey()).intValue() >= i) {
                    iIntValue = ((Number) entry2.getValue()).intValue();
                } else if (entry4 != null) {
                    iIntValue = ((Number) entry4.getValue()).intValue();
                }
                String name2 = dc5.class.getName();
                l6b l6bVar2 = wqi.a;
                if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                    l6bVar2.c(lg8Var, name2, ho7.g("Emoji size by density: ", iIntValue, context.getResources().getDisplayMetrics().densityDpi, ", density:"), null);
                }
                float f2 = width / 13;
                String name3 = dc5.class.getName();
                l6b l6bVar3 = wqi.a;
                if (l6bVar3 != null && l6bVar3.b(lg8Var)) {
                    l6bVar3.c(lg8Var, name3, "Calculated emoji size in sprite before coarce: " + f2, null);
                }
                float f3 = iIntValue;
                if (f2 > f3) {
                    f2 = f3;
                }
                if (f2 <= 0.0f) {
                    String name4 = dc5.class.getName();
                    l6b l6bVar4 = wqi.a;
                    if (l6bVar4 != null && l6bVar4.b(lg8Var)) {
                        l6bVar4.c(lg8Var, name4, ho7.f(width, "Fallback for emoji size. Sprite width: "), null);
                    }
                    f2 = 48.0f;
                }
                String name5 = dc5.class.getName();
                l6b l6bVar5 = wqi.a;
                if (l6bVar5 != null && l6bVar5.b(lg8Var)) {
                    l6bVar5.c(lg8Var, name5, "Sprite width: " + width + "; Calculated emoji size in sprite: " + f2, null);
                }
                return Float.valueOf(f2);
            case 4:
                ok8 ok8Var = new ok8(this.b, null);
                ok8Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
                ok8Var.setVisibility(8);
                return ok8Var;
            case 5:
                Context context2 = this.b;
                int i2 = EndlessRecyclerView2.h2;
                if (Build.VERSION.SDK_INT >= 30) {
                    defaultDisplay = context2.getDisplay();
                } else {
                    WindowManager windowManager = (WindowManager) s34.b(context2, WindowManager.class);
                    if (windowManager != null) {
                        defaultDisplay = windowManager.getDefaultDisplay();
                    }
                }
                return Long.valueOf((defaultDisplay != null ? defaultDisplay.getRefreshRate() : 0.0f) > 0.0f ? kti.e(1000000000 / r0) : 160000000L);
            case 6:
                qea qeaVar = new qea(this.b, 2);
                return new dk4((Context) qeaVar.c, (HashMap) qeaVar.d, qeaVar.b, (kwf) qeaVar.o, qeaVar.a);
            case 7:
                return new xq0(this.b);
            case 8:
                return this.b.getExternalCacheDir();
            case 9:
                return this.b.getCacheDir();
            case 10:
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.b, null);
                dpg.l.b(appCompatTextView, t75.b);
                appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                float f4 = 12;
                appCompatTextView.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f4), kti.d(4 * vw4.d().getDisplayMetrics().density), kti.d(f4 * vw4.d().getDisplayMetrics().density), appCompatTextView.getPaddingBottom());
                appCompatTextView.setTextColor(a93.s0.y(appCompatTextView).getText().b);
                return appCompatTextView;
            case 11:
                w2c w2cVar = new w2c(this.b);
                int i3 = yud.a;
                w2cVar.a();
                return w2cVar;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return RenderScript.create(this.b);
            case 13:
                yta ytaVar = new yta(this.b);
                dpg.B.b(ytaVar, t75.b);
                ytaVar.setMaxLines(1);
                ytaVar.setEllipsize(TextUtils.TruncateAt.END);
                float f5 = 12;
                ytaVar.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f5), ytaVar.getPaddingTop(), kti.d(f5 * vw4.d().getDisplayMetrics().density), ytaVar.getPaddingBottom());
                ytaVar.setTextColor(a93.s0.B(ytaVar).c.getText().e);
                jgh.a(ytaVar);
                return ytaVar;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                View view = new View(this.b);
                view.setBackgroundColor(a93.s0.B(view).c.i().b.c);
                return view;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(this.b, null);
                appCompatTextView2.setTextColor(a93.s0.y(appCompatTextView2).getText().b);
                dpg.l.b(appCompatTextView2, t75.b);
                appCompatTextView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                float f6 = 12;
                appCompatTextView2.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f6), kti.d(4 * vw4.d().getDisplayMetrics().density), kti.d(f6 * vw4.d().getDisplayMetrics().density), appCompatTextView2.getPaddingBottom());
                return appCompatTextView2;
            case 16:
                wbf wbfVar = new wbf(this.b);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 80;
                wbfVar.setLayoutParams(layoutParams);
                return wbfVar;
            case LangUtils.HASH_SEED /* 17 */:
                ImageView imageView = new ImageView(this.b);
                imageView.setId(zud.Y);
                float f7 = 36;
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f7), kti.d(f7 * vw4.d().getDisplayMetrics().density));
                layoutParams2.gravity = 80;
                layoutParams2.setMargins(kti.d(12 * vw4.d().getDisplayMetrics().density), ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
                imageView.setLayoutParams(layoutParams2);
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imageView.setImageResource(yud.V0);
                tqi.c(new nd0(3, null == true ? 1 : 0, 5), imageView);
                return imageView;
            case 18:
                return new uxa(this.b);
            case 19:
                OneMeDraweeView oneMeDraweeView = new OneMeDraweeView(this.b);
                up5 up5Var = ((gr6) oneMeDraweeView.getHierarchy()).e;
                up5Var.v0 = 0;
                if (up5Var.u0 == 1) {
                    up5Var.u0 = 0;
                }
                return oneMeDraweeView;
            case 20:
                Context context3 = this.b;
                yy7[] yy7VarArr = OneMeButton.A0;
                return new AppCompatImageView(context3, null);
            case 21:
                Context context4 = this.b;
                yy7[] yy7VarArr2 = OneMeButton.A0;
                return new AppCompatImageView(context4, null);
            case 22:
                Context context5 = this.b;
                yy7[] yy7VarArr3 = OneMeButton.A0;
                return new TextView(context5);
            case 23:
                TextView textView2 = new TextView(this.b);
                textView2.setId(zud.j);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setMaxLines(1);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams3.gravity = 17;
                textView2.setLayoutParams(layoutParams3);
                textView2.setGravity(17);
                textView2.setTextAlignment(4);
                dpg.M.b(textView2, t75.b);
                return textView2;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                ImageView imageView2 = new ImageView(this.b);
                float f8 = 24;
                imageView2.setLayoutParams(new LinearLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f8), kti.d(f8 * vw4.d().getDisplayMetrics().density)));
                imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                return imageView2;
            case 25:
                AppCompatTextView appCompatTextView3 = new AppCompatTextView(this.b, null);
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -1);
                layoutParams4.topMargin = kti.d(4 * vw4.d().getDisplayMetrics().density);
                float f9 = 6;
                layoutParams4.leftMargin = kti.d(vw4.d().getDisplayMetrics().density * f9);
                layoutParams4.rightMargin = kti.d(f9 * vw4.d().getDisplayMetrics().density);
                appCompatTextView3.setLayoutParams(layoutParams4);
                appCompatTextView3.setGravity(1);
                appCompatTextView3.setMaxLines(1);
                appCompatTextView3.setEllipsize(TextUtils.TruncateAt.END);
                appCompatTextView3.setTextColor(a93.s0.y(appCompatTextView3).getText().e);
                dpg.o.b(appCompatTextView3, t75.b);
                return appCompatTextView3;
            case 26:
                OneMeButton oneMeButton = new OneMeButton(this.b, null);
                oneMeButton.setId(zud.o);
                oneMeButton.setSize(jza.b);
                oneMeButton.setMode(iza.d);
                oneMeButton.setAppearance(gza.a);
                oneMeButton.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                return oneMeButton;
            case 27:
                return kk4.j(this.b);
            case 28:
                ImageView imageView3 = new ImageView(this.b);
                imageView3.setId(zud.r);
                imageView3.setImageTintList(ColorStateList.valueOf(a93.s0.y(imageView3).getIcon().g));
                float f10 = 40;
                imageView3.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f10), kti.d(f10 * vw4.d().getDisplayMetrics().density)));
                return imageView3;
            default:
                AppCompatImageView appCompatImageView = new AppCompatImageView(this.b, null);
                appCompatImageView.setId(zud.w);
                kt3 kt3Var = new kt3(0, 0);
                kt3Var.t = 0;
                kt3Var.i = 0;
                kt3Var.v = 0;
                kt3Var.l = 0;
                appCompatImageView.setLayoutParams(kt3Var);
                appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                return appCompatImageView;
        }
    }

    public /* synthetic */ ns2(Context context, int i) {
        this.a = i;
        this.b = context;
    }
}
