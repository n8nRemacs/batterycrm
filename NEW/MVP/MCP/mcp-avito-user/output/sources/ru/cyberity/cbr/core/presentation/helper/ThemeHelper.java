package ru.cyberity.cbr.core.presentation.helper;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.text.C43066x;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.common.n0;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.common.x0;
import ru.cyberity.cbr.core.theme.CBRColorElement;
import ru.cyberity.cbr.core.theme.CBRCustomizationTheme;
import ru.cyberity.cbr.core.theme.CBRJsonCustomization;
import ru.cyberity.cbr.core.theme.CBRMetricElement;
import ru.cyberity.cbr.core.theme.CBRThemeMetric;
import ru.cyberity.cbr.core.theme.CBRTypographyElement;
import ru.cyberity.cbr.core.theme.ImageElementName;
import ru.cyberity.cbr.core.theme.b;
import ru.cyberity.cbr.core.theme.d;

/* compiled from: ThemeHelper.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0015\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000b\u001a\u0004\u0018\u00010\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u0018*\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u0005*\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u001d*\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010$\u001a\u0004\u0018\u00010\u0004*\u00020 2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u000f¢\u0006\u0004\b$\u0010%J\u0019\u0010(\u001a\u00020'*\u00020 2\u0006\u0010&\u001a\u00020\u0005¢\u0006\u0004\b(\u0010)J!\u0010,\u001a\u00020\u0013*\u00020*2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u0013¢\u0006\u0004\b,\u0010-J\u001b\u0010,\u001a\u0004\u0018\u00010\u0013*\u00020*2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b,\u0010.J\u0017\u00100\u001a\u0004\u0018\u00010\u00182\u0006\u0010/\u001a\u00020\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u0004\u0018\u00010\u001d2\u0006\u0010/\u001a\u00020\u0016¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u0004\u0018\u0001042\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b5\u00106J\u001b\u00108\u001a\u0004\u0018\u000104*\u0002072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b8\u00109J+\u0010=\u001a\u0004\u0018\u00010\u0004*\u00020*2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;¢\u0006\u0004\b=\u0010>J/\u0010?\u001a\u0004\u0018\u00010;2\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;¢\u0006\u0004\b?\u0010@J\u0013\u0010C\u001a\b\u0012\u0004\u0012\u00020B0A¢\u0006\u0004\bC\u0010DR\u0015\u0010E\u001a\u00020\u0011*\u00020*8F¢\u0006\u0006\u001a\u0004\bE\u0010F¨\u0006G"}, d2 = {"Lru/cyberity/cbr/core/presentation/helper/ThemeHelper;", "", "<init>", "()V", "Lru/cyberity/cbr/core/theme/d;", "", "key", "Landroid/graphics/drawable/BitmapDrawable;", "getImage", "(Lru/cyberity/cbr/core/theme/d;Ljava/lang/String;)Landroid/graphics/drawable/BitmapDrawable;", "listKey", "getImageFromList", "(Lru/cyberity/cbr/core/theme/d;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/BitmapDrawable;", "getCustomTheme", "()Lru/cyberity/cbr/core/theme/d;", "Lru/cyberity/cbr/core/theme/CBRColorElement;", "color", "", "isDark", "", "getColor", "(Lru/cyberity/cbr/core/theme/d;Lru/cyberity/cbr/core/theme/CBRColorElement;Z)Ljava/lang/Integer;", "Lru/cyberity/cbr/core/theme/CBRMetricElement;", "name", "", "getMetricDimension", "(Lru/cyberity/cbr/core/theme/d;Lru/cyberity/cbr/core/theme/CBRMetricElement;)Ljava/lang/Float;", "getMetricStyle", "(Lru/cyberity/cbr/core/theme/d;Lru/cyberity/cbr/core/theme/CBRMetricElement;)Ljava/lang/String;", "Lru/cyberity/cbr/core/theme/b$e;", "getMetricSize", "(Lru/cyberity/cbr/core/theme/d;Lru/cyberity/cbr/core/theme/CBRMetricElement;)Lru/cyberity/cbr/core/theme/b$e;", "Landroid/widget/TextView;", "Lru/cyberity/cbr/core/theme/CBRTypographyElement;", "typographyElementName", "colorElementName", "applyTheme", "(Landroid/widget/TextView;Lru/cyberity/cbr/core/theme/CBRTypographyElement;Lru/cyberity/cbr/core/theme/CBRColorElement;)Lru/cyberity/cbr/core/theme/d;", "alignment", "Lkotlin/G0;", "applyThemeGravity", "(Landroid/widget/TextView;Ljava/lang/String;)V", "Landroid/view/View;", "defaultColor", "getThemeColor", "(Landroid/view/View;Lru/cyberity/cbr/core/theme/CBRColorElement;I)I", "(Landroid/view/View;Lru/cyberity/cbr/core/theme/CBRColorElement;)Ljava/lang/Integer;", "metric", "getThemeMetricDimension", "(Lru/cyberity/cbr/core/theme/CBRMetricElement;)Ljava/lang/Float;", "getThemeMetricSize", "(Lru/cyberity/cbr/core/theme/CBRMetricElement;)Lru/cyberity/cbr/core/theme/b$e;", "Landroid/graphics/drawable/Drawable;", "getThemeImage", "(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", "resolveIcon", "(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;", "initColor", "Landroid/content/res/ColorStateList;", "currentStateList", "applyStepTintColor", "(Landroid/view/View;Ljava/lang/Integer;Landroid/content/res/ColorStateList;)Lru/cyberity/cbr/core/theme/d;", "getStepTintColorList", "(ZLjava/lang/Integer;Landroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;", "", "", "getDefaultStepStateList", "()[[I", "isDarkTheme", "(Landroid/view/View;)Z", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class ThemeHelper {

    @k
    public static final ThemeHelper INSTANCE = new ThemeHelper();

    private ThemeHelper() {
    }

    public static /* synthetic */ d applyStepTintColor$default(ThemeHelper themeHelper, View view, Integer num, ColorStateList colorStateList, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            num = null;
        }
        if ((i12 & 2) != 0) {
            colorStateList = null;
        }
        return themeHelper.applyStepTintColor(view, num, colorStateList);
    }

    private final BitmapDrawable getImage(d dVar, String str) {
        Bitmap bitmapE;
        Map<String, b> mapB = dVar.b();
        b bVar = mapB != null ? mapB.get(str) : null;
        b.c cVar = bVar instanceof b.c ? (b.c) bVar : null;
        if (cVar == null || (bitmapE = cVar.getBitmap()) == null) {
            return null;
        }
        return new BitmapDrawable(bitmapE);
    }

    private final BitmapDrawable getImageFromList(d dVar, String str, String str2) {
        Map<String, b.c> mapB;
        b.c cVar;
        Map<String, b.c> mapB2;
        b.c cVar2;
        Map<String, b> mapB3 = dVar.b();
        b bVar = mapB3 != null ? mapB3.get(str2) : null;
        b.d dVar2 = bVar instanceof b.d ? (b.d) bVar : null;
        Bitmap bitmapE = (dVar2 == null || (mapB2 = dVar2.b()) == null || (cVar2 = mapB2.get(str)) == null) ? null : cVar2.getBitmap();
        Bitmap bitmapE2 = (dVar2 == null || (mapB = dVar2.b()) == null || (cVar = mapB.get("default")) == null) ? null : cVar.getBitmap();
        if (bitmapE == null) {
            bitmapE = bitmapE2;
        }
        if (bitmapE != null) {
            return new BitmapDrawable(bitmapE);
        }
        return null;
    }

    @l
    public final d applyStepTintColor(@k View view, @l Integer num, @l ColorStateList colorStateList) {
        d customTheme = getCustomTheme();
        if (customTheme == null) {
            return null;
        }
        ThemeHelper themeHelper = INSTANCE;
        ColorStateList stepTintColorList = themeHelper.getStepTintColorList(themeHelper.isDarkTheme(view), num, colorStateList);
        if (view instanceof ImageView) {
            ((ImageView) view).setImageTintList(stepTintColorList);
            return customTheme;
        }
        if (!(view instanceof TextView)) {
            return customTheme;
        }
        ((TextView) view).setTextColor(stepTintColorList);
        return customTheme;
    }

    @l
    public final d applyTheme(@k TextView textView, @k CBRTypographyElement cBRTypographyElement, @k CBRColorElement cBRColorElement) {
        b.g gVar;
        d customTheme = getCustomTheme();
        if (customTheme == null) {
            return null;
        }
        Map<String, b.g> mapD = customTheme.d();
        if (mapD != null && (gVar = mapD.get(cBRTypographyElement.getValue())) != null) {
            Typeface typefaceH = gVar.getTypeface();
            if (typefaceH != null) {
                textView.setTypeface(typefaceH);
            }
            textView.setTextSize(gVar.getSize());
        }
        ThemeHelper themeHelper = INSTANCE;
        Integer color = themeHelper.getColor(customTheme, cBRColorElement, themeHelper.isDarkTheme(textView));
        if (color != null) {
            int iIntValue = color.intValue();
            if (textView instanceof EditText) {
                textView.setTextColor(new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{Color.argb(95, Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)), iIntValue}));
            } else {
                textView.setTextColor(iIntValue);
            }
        }
        Integer color2 = themeHelper.getColor(customTheme, CBRColorElement.CONTENT_LINK, themeHelper.isDarkTheme(textView));
        if (color2 == null) {
            return customTheme;
        }
        textView.setLinkTextColor(color2.intValue());
        return customTheme;
    }

    public final void applyThemeGravity(@k TextView textView, @k String str) {
        if (str.equals(CBRThemeMetric.TextAlignment.LEFT.getValue())) {
            textView.setGravity(8388611);
        } else if (str.equals(CBRThemeMetric.TextAlignment.RIGHT.getValue())) {
            textView.setGravity(8388613);
        } else if (str.equals(CBRThemeMetric.TextAlignment.CENTER.getValue())) {
            textView.setGravity(17);
        }
    }

    @l
    public final Integer getColor(@k d dVar, @k CBRColorElement cBRColorElement, boolean z12) {
        b.a aVar;
        Map<String, b.a> mapA = dVar.a();
        if (mapA == null || (aVar = mapA.get(cBRColorElement.getValue())) == null) {
            return null;
        }
        return z12 ? aVar.getDark() : aVar.getLight();
    }

    @l
    public final d getCustomTheme() {
        CBRJsonCustomization customization = n0.f432787a.getCustomization();
        CBRCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        if (theme instanceof d) {
            return (d) theme;
        }
        return null;
    }

    @k
    public final int[][] getDefaultStepStateList() {
        return new int[][]{new int[]{R.attr.cbr_stateInit}, new int[]{R.attr.cbr_statePending}, new int[]{R.attr.cbr_stateApproved}, new int[]{R.attr.cbr_stateRejected}, new int[]{R.attr.cbr_stateProcessing}, new int[0]};
    }

    @l
    public final Float getMetricDimension(@k d dVar, @k CBRMetricElement cBRMetricElement) {
        Map<String, b> mapC = dVar.c();
        b bVar = mapC != null ? mapC.get(cBRMetricElement.getValue()) : null;
        b.C12491b c12491b = bVar instanceof b.C12491b ? (b.C12491b) bVar : null;
        if (c12491b != null) {
            return c12491b.getValue();
        }
        return null;
    }

    @l
    public final b.e getMetricSize(@k d dVar, @k CBRMetricElement cBRMetricElement) {
        Map<String, b> mapC = dVar.c();
        b bVar = mapC != null ? mapC.get(cBRMetricElement.getValue()) : null;
        if (bVar instanceof b.e) {
            return (b.e) bVar;
        }
        return null;
    }

    @l
    public final String getMetricStyle(@k d dVar, @k CBRMetricElement cBRMetricElement) {
        Map<String, b> mapC = dVar.c();
        b bVar = mapC != null ? mapC.get(cBRMetricElement.getValue()) : null;
        b.f fVar = bVar instanceof b.f ? (b.f) bVar : null;
        if (fVar != null) {
            return fVar.getValue();
        }
        return null;
    }

    @l
    public final ColorStateList getStepTintColorList(boolean isDark, @l Integer initColor, @l ColorStateList currentStateList) {
        Integer color;
        d customTheme = getCustomTheme();
        if (customTheme != null) {
            if (initColor == null) {
                color = INSTANCE.getColor(customTheme, CBRColorElement.CONTENT_NEUTRAL, isDark);
                if (color == null) {
                    color = currentStateList != null ? Integer.valueOf(currentStateList.getColorForState(new int[]{R.attr.cbr_stateInit}, -65281)) : null;
                }
            } else {
                color = initColor;
            }
            ThemeHelper themeHelper = INSTANCE;
            CBRColorElement cBRColorElement = CBRColorElement.CONTENT_WARNING;
            Integer color2 = themeHelper.getColor(customTheme, cBRColorElement, isDark);
            if (color2 == null) {
                color2 = currentStateList != null ? Integer.valueOf(currentStateList.getColorForState(new int[]{R.attr.cbr_statePending}, -65281)) : null;
                if (color2 == null) {
                    color2 = color;
                }
            }
            Integer color3 = themeHelper.getColor(customTheme, CBRColorElement.CONTENT_SUCCESS, isDark);
            if (color3 == null) {
                color3 = currentStateList != null ? Integer.valueOf(currentStateList.getColorForState(new int[]{R.attr.cbr_stateApproved}, -65281)) : null;
                if (color3 == null) {
                    color3 = color;
                }
            }
            Integer color4 = themeHelper.getColor(customTheme, CBRColorElement.CONTENT_CRITICAL, isDark);
            if (color4 == null) {
                color4 = currentStateList != null ? Integer.valueOf(currentStateList.getColorForState(new int[]{R.attr.cbr_stateRejected}, -65281)) : null;
                if (color4 == null) {
                    color4 = color;
                }
            }
            Integer color5 = themeHelper.getColor(customTheme, cBRColorElement, isDark);
            if (color5 == null) {
                color5 = currentStateList != null ? Integer.valueOf(currentStateList.getColorForState(new int[]{R.attr.cbr_stateProcessing}, -65281)) : null;
                if (color5 == null) {
                    color5 = color;
                }
            }
            Integer color6 = themeHelper.getColor(customTheme, CBRColorElement.CONTENT_WEAK, isDark);
            if (color6 == null) {
                color6 = currentStateList != null ? Integer.valueOf(currentStateList.getDefaultColor()) : null;
                if (color6 == null) {
                    color6 = color;
                }
            }
            if (color != null) {
                return new ColorStateList(themeHelper.getDefaultStepStateList(), new int[]{color.intValue(), color2.intValue(), color3.intValue(), color4.intValue(), color5.intValue(), color6.intValue()});
            }
        }
        return null;
    }

    public final int getThemeColor(@k View view, @k CBRColorElement cBRColorElement, int i12) {
        Integer color;
        d customTheme = getCustomTheme();
        return (customTheme == null || (color = getColor(customTheme, cBRColorElement, isDarkTheme(view))) == null) ? i12 : color.intValue();
    }

    @l
    public final Drawable getThemeImage(@k String key) {
        d customTheme = getCustomTheme();
        if (customTheme != null) {
            return C43066x.h0(key, "DocType/", false) ? INSTANCE.getImageFromList(customTheme, x0.a(C43066x.e0(C43066x.m0(key, "/", key), new char[]{'_'})), ImageElementName.VERIFICATION_STEP_ICONS.getValue()) : C43066x.h0(key, "default/", false) ? INSTANCE.getImageFromList(customTheme, key, ImageElementName.INSTRUCTIONS_IMAGES.getValue()) : C43066x.h0(key, "IdentityType/", false) ? INSTANCE.getImageFromList(customTheme, C43066x.m0(key, "/", key), ImageElementName.DOCUMENT_TYPE_ICONS.getValue()) : INSTANCE.getImage(customTheme, key);
        }
        return null;
    }

    @l
    public final Float getThemeMetricDimension(@k CBRMetricElement metric) {
        d customTheme = getCustomTheme();
        if (customTheme != null) {
            return getMetricDimension(customTheme, metric);
        }
        return null;
    }

    @l
    public final b.e getThemeMetricSize(@k CBRMetricElement metric) {
        d customTheme = getCustomTheme();
        if (customTheme != null) {
            return getMetricSize(customTheme, metric);
        }
        return null;
    }

    public final boolean isDarkTheme(@k View view) {
        return s.a(view.getResources().getConfiguration());
    }

    @l
    public final Drawable resolveIcon(@k Context context, @k String str) {
        return n0.f432787a.getIconHandler().onResolveIcon(context, str);
    }

    @l
    public final Integer getThemeColor(@k View view, @k CBRColorElement cBRColorElement) {
        d customTheme = getCustomTheme();
        if (customTheme != null) {
            return getColor(customTheme, cBRColorElement, isDarkTheme(view));
        }
        return null;
    }
}
