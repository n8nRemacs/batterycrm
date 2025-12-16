package ru.cyberity.cbr.core.presentation.intro;

import Y61.k;
import android.content.Context;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.common.n0;
import ru.cyberity.cbr.core.data.listener.CBRIconHandler;
import ru.cyberity.cbr.core.data.source.extensions.a;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;
import ru.cyberity.cbr.core.theme.CBRMetricElement;
import ru.cyberity.cbr.core.theme.CBRThemeMetric;
import ru.cyberity.cbr.core.theme.d;
import ru.cyberity.cbr.core.widget.CBRBodyTextView;
import ru.cyberity.cbr.core.widget.CBRH2TextView;
import ru.cyberity.cbr.core.widget.CBRImageView;
import ru.cyberity.cbr.core.widget.CBRIntroItemView;
import ru.cyberity.cbr.core.widget.CBRListItemView;
import ru.cyberity.cbr.core.widget.CBRStepState;
import ru.cyberity.cbr.core.widget.CBRStepStateKt;

/* compiled from: InstructionsContentRender.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001a\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u001a\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J,\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J,\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J,\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J4\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J(\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\u0015\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030\u00140\u0013H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u0013R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lru/cyberity/cbr/core/presentation/intro/InstructionsContentRender;", "", "Landroid/content/Context;", "context", "", "image", "Landroid/view/View;", "renderImage", "", "text", "renderHeader", "renderText", "header", "renderSingle", "renderDo", "renderDont", "Lru/cyberity/cbr/core/widget/CBRStepState;", VoiceInfo.STATE, "renderDoDont", "", "", "items", "renderListItems", "Landroid/view/ViewGroup$MarginLayoutParams;", "defaultLayoutParams", "contentBlocks", "renderContent", "Lru/cyberity/cbr/core/data/source/extensions/a;", "extensionProvider", "Lru/cyberity/cbr/core/data/source/extensions/a;", "<init>", "(Lru/cyberity/cbr/core/data/source/extensions/a;)V", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class InstructionsContentRender {

    @k
    private final a extensionProvider;

    public InstructionsContentRender(@k a aVar) {
        this.extensionProvider = aVar;
    }

    private final ViewGroup.MarginLayoutParams defaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    private final View renderDo(Context context, String image, CharSequence header, CharSequence text) {
        return renderDoDont(context, image, header, text, CBRStepState.APPROVED);
    }

    private final View renderDoDont(Context context, String image, CharSequence header, CharSequence text, CBRStepState state) {
        CBRIntroItemView cBRIntroItemView = new CBRIntroItemView(context, null, 0, 0, 14, null);
        cBRIntroItemView.setTitle(header != null ? this.extensionProvider.a(header) : null);
        cBRIntroItemView.setSubtitle(text != null ? this.extensionProvider.a(text) : null);
        cBRIntroItemView.setIconStart(n0.f432787a.getIconHandler().onResolveIcon(context, image));
        CBRStepStateKt.setStepState(cBRIntroItemView, state);
        return cBRIntroItemView;
    }

    private final View renderDont(Context context, String image, CharSequence header, CharSequence text) {
        return renderDoDont(context, image, header, text, CBRStepState.REJECTED);
    }

    private final View renderHeader(Context context, CharSequence text) {
        String value;
        CBRH2TextView cBRH2TextView = new CBRH2TextView(context, null, 0, 0, 14, null);
        cBRH2TextView.setText(text != null ? this.extensionProvider.a(text) : null);
        ThemeHelper themeHelper = ThemeHelper.INSTANCE;
        d customTheme = themeHelper.getCustomTheme();
        if (customTheme == null || (value = themeHelper.getMetricStyle(customTheme, CBRMetricElement.SCREEN_HEADER_ALIGNMENT)) == null) {
            value = CBRThemeMetric.TextAlignment.CENTER.getValue();
        }
        themeHelper.applyThemeGravity(cBRH2TextView, value);
        return cBRH2TextView;
    }

    private final View renderImage(Context context, String image) {
        CBRImageView cBRImageView = new CBRImageView(context, null, 0, 0, 14, null);
        cBRImageView.setImageDrawable(n0.f432787a.getIconHandler().onResolveIcon(context, image));
        return cBRImageView;
    }

    private final View renderListItems(Context context, List<? extends Map<String, ?>> items) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ArrayList arrayList = new ArrayList();
        for (Object obj : items) {
            if (obj instanceof Map) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            CBRListItemView cBRListItemView = new CBRListItemView(context, null, 0, 0, 14, null);
            CBRIconHandler iconHandler = n0.f432787a.getIconHandler();
            String str = (String) map.get("image");
            if (str == null) {
                str = "";
            }
            cBRListItemView.setIconStart(iconHandler.onResolveIcon(context, str));
            String str2 = (String) map.get("title");
            Spanned spannedA = null;
            cBRListItemView.setTitle(str2 != null ? this.extensionProvider.a(str2) : null);
            String str3 = (String) map.get("subtitle");
            if (str3 != null) {
                spannedA = this.extensionProvider.a(str3);
            }
            cBRListItemView.setSubtitle(spannedA);
            linearLayout.addView(cBRListItemView, defaultLayoutParams());
        }
        return linearLayout;
    }

    private final View renderSingle(Context context, String image, CharSequence header, CharSequence text) {
        String value;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        CBRImageView cBRImageView = new CBRImageView(context, null, 0, 0, 14, null);
        cBRImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        cBRImageView.setImageDrawable(n0.f432787a.getIconHandler().onResolveIcon(context, image));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, context.getResources().getDimensionPixelSize(R.dimen.cbr_icon_size_huge));
        marginLayoutParams.bottomMargin = context.getResources().getDimensionPixelSize(R.dimen.cbr_margin_medium_small);
        G0 g02 = G0.f406611a;
        linearLayout.addView(cBRImageView, marginLayoutParams);
        CBRH2TextView cBRH2TextView = new CBRH2TextView(context, null, 0, 0, 14, null);
        cBRH2TextView.setText(header != null ? this.extensionProvider.a(header) : null);
        ThemeHelper themeHelper = ThemeHelper.INSTANCE;
        d customTheme = themeHelper.getCustomTheme();
        if (customTheme == null || (value = themeHelper.getMetricStyle(customTheme, CBRMetricElement.SCREEN_HEADER_ALIGNMENT)) == null) {
            value = CBRThemeMetric.TextAlignment.CENTER.getValue();
        }
        themeHelper.applyThemeGravity(cBRH2TextView, value);
        ViewGroup.MarginLayoutParams marginLayoutParamsDefaultLayoutParams = defaultLayoutParams();
        marginLayoutParamsDefaultLayoutParams.bottomMargin = context.getResources().getDimensionPixelSize(R.dimen.cbr_margin_medium);
        linearLayout.addView(cBRH2TextView, marginLayoutParamsDefaultLayoutParams);
        CBRBodyTextView cBRBodyTextView = new CBRBodyTextView(context, null, 0, 0, 14, null);
        cBRBodyTextView.setText(text != null ? this.extensionProvider.a(text) : null);
        ViewGroup.MarginLayoutParams marginLayoutParamsDefaultLayoutParams2 = defaultLayoutParams();
        marginLayoutParamsDefaultLayoutParams2.topMargin = context.getResources().getDimensionPixelSize(R.dimen.cbr_margin_small_tiny);
        marginLayoutParamsDefaultLayoutParams2.bottomMargin = context.getResources().getDimensionPixelSize(R.dimen.cbr_margin_small_tiny);
        linearLayout.addView(cBRBodyTextView, marginLayoutParamsDefaultLayoutParams2);
        return linearLayout;
    }

    private final View renderText(Context context, CharSequence text) {
        CBRBodyTextView cBRBodyTextView = new CBRBodyTextView(context, null, 0, 0, 14, null);
        cBRBodyTextView.setText(text != null ? this.extensionProvider.a(text) : null);
        return cBRBodyTextView;
    }

    @k
    public final List<View> renderContent(@k Context context, @k List<?> contentBlocks) {
        String str;
        ArrayList arrayList = new ArrayList();
        for (Object obj : contentBlocks) {
            if (obj instanceof Map) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            Object obj2 = map.get("type");
            str = "";
            View viewRenderListItems = null;
            viewRenderListItems = null;
            if (L.f(obj2, "image")) {
                Object obj3 = map.get("image");
                String str2 = obj3 instanceof String ? (String) obj3 : null;
                viewRenderListItems = renderImage(context, str2 != null ? str2 : "");
            } else if (L.f(obj2, "header")) {
                Object obj4 = map.get("header");
                String str3 = obj4 instanceof String ? (String) obj4 : null;
                if (str3 == null) {
                    Object obj5 = map.get("text");
                    String str4 = obj5 instanceof String ? (String) obj5 : null;
                    if (str4 != null) {
                        str = str4;
                    }
                } else {
                    str = str3;
                }
                viewRenderListItems = renderHeader(context, str);
            } else if (L.f(obj2, "text")) {
                Object obj6 = map.get("text");
                viewRenderListItems = renderText(context, obj6 instanceof String ? (String) obj6 : null);
            } else if (L.f(obj2, "single")) {
                Object obj7 = map.get("image");
                String str5 = obj7 instanceof String ? (String) obj7 : null;
                str = str5 != null ? str5 : "";
                Object obj8 = map.get("header");
                CharSequence charSequence = obj8 instanceof String ? (String) obj8 : null;
                Object obj9 = map.get("text");
                viewRenderListItems = renderSingle(context, str, charSequence, obj9 instanceof String ? (String) obj9 : null);
            } else if (L.f(obj2, "do")) {
                Object obj10 = map.get("image");
                String str6 = obj10 instanceof String ? (String) obj10 : null;
                str = str6 != null ? str6 : "";
                Object obj11 = map.get("header");
                CharSequence charSequence2 = obj11 instanceof String ? (String) obj11 : null;
                Object obj12 = map.get("text");
                viewRenderListItems = renderDo(context, str, charSequence2, obj12 instanceof String ? (String) obj12 : null);
            } else if (L.f(obj2, "dont")) {
                Object obj13 = map.get("image");
                String str7 = obj13 instanceof String ? (String) obj13 : null;
                str = str7 != null ? str7 : "";
                Object obj14 = map.get("header");
                CharSequence charSequence3 = obj14 instanceof String ? (String) obj14 : null;
                Object obj15 = map.get("text");
                viewRenderListItems = renderDont(context, str, charSequence3, obj15 instanceof String ? (String) obj15 : null);
            } else if (L.f(obj2, "listItems")) {
                Object obj16 = map.get("listItems");
                List list = obj16 instanceof List ? (List) obj16 : null;
                if (list != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj17 : list) {
                        if (obj17 instanceof Map) {
                            arrayList3.add(obj17);
                        }
                    }
                    viewRenderListItems = renderListItems(context, arrayList3);
                }
            }
            if (viewRenderListItems != null) {
                arrayList2.add(viewRenderListItems);
            }
        }
        return arrayList2;
    }
}
