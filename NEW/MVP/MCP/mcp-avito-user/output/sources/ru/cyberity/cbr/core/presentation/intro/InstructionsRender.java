package ru.cyberity.cbr.core.presentation.intro;

import Y61.k;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import j.D;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.data.source.extensions.a;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;
import ru.cyberity.cbr.core.theme.CBRMetricElement;
import ru.cyberity.cbr.core.theme.CBRThemeMetric;
import ru.cyberity.cbr.core.theme.d;
import ru.cyberity.cbr.core.widget.CBRBodyTextView;
import ru.cyberity.cbr.core.widget.CBRH1TextView;
import ru.cyberity.cbr.core.widget.CBRH2TextView;
import ru.cyberity.cbr.core.widget.CBRSubtitle2TextView;

/* compiled from: InstructionsRender.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ;\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\f2\u0010\u0010\u0013\u001a\f\u0012\u0004\u0012\u00020\u0012\u0012\u0002\b\u00030\u00112\b\b\u0003\u0010\u0015\u001a\u00020\u00142\b\b\u0003\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/cyberity/cbr/core/presentation/intro/InstructionsRender;", "", "Lru/cyberity/cbr/core/data/source/extensions/a;", "extensionProvider", "", "standalone", "<init>", "(Lru/cyberity/cbr/core/data/source/extensions/a;Z)V", "Landroid/content/Context;", "context", "", "text", "Landroid/view/View;", "renderTitle", "(Landroid/content/Context;Ljava/lang/CharSequence;)Landroid/view/View;", "renderSubTitle", "rootView", "", "", "data", "", "contentContainerId", "buttonId", "Lkotlin/G0;", "renderInstructions", "(Landroid/view/View;Ljava/util/Map;II)V", "Lru/cyberity/cbr/core/data/source/extensions/a;", "Z", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class InstructionsRender {

    @k
    private final a extensionProvider;
    private final boolean standalone;

    public InstructionsRender(@k a aVar, boolean z12) {
        this.extensionProvider = aVar;
        this.standalone = z12;
    }

    private final View renderSubTitle(Context context, CharSequence text) throws Resources.NotFoundException {
        String value;
        TextView cBRSubtitle2TextView = this.standalone ? new CBRSubtitle2TextView(context, null, 0, 0, 14, null) : new CBRBodyTextView(context, null, 0, 0, 14, null);
        cBRSubtitle2TextView.setText(text != null ? this.extensionProvider.a(text) : null);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.cbr_margin_medium);
        cBRSubtitle2TextView.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        ThemeHelper themeHelper = ThemeHelper.INSTANCE;
        d customTheme = themeHelper.getCustomTheme();
        if (customTheme == null || (value = themeHelper.getMetricStyle(customTheme, CBRMetricElement.SCREEN_HEADER_ALIGNMENT)) == null) {
            value = CBRThemeMetric.TextAlignment.CENTER.getValue();
        }
        themeHelper.applyThemeGravity(cBRSubtitle2TextView, value);
        return cBRSubtitle2TextView;
    }

    private final View renderTitle(Context context, CharSequence text) throws Resources.NotFoundException {
        String value;
        TextView cBRH1TextView = this.standalone ? new CBRH1TextView(context, null, 0, 0, 14, null) : new CBRH2TextView(context, null, 0, 0, 14, null);
        cBRH1TextView.setText(text != null ? this.extensionProvider.a(text) : null);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.cbr_margin_small);
        cBRH1TextView.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        ThemeHelper themeHelper = ThemeHelper.INSTANCE;
        d customTheme = themeHelper.getCustomTheme();
        if (customTheme == null || (value = themeHelper.getMetricStyle(customTheme, CBRMetricElement.SCREEN_HEADER_ALIGNMENT)) == null) {
            value = CBRThemeMetric.TextAlignment.CENTER.getValue();
        }
        themeHelper.applyThemeGravity(cBRH1TextView, value);
        return cBRH1TextView;
    }

    public final void renderInstructions(@k View rootView, @k Map<String, ?> data, @D int contentContainerId, @D int buttonId) {
        Button button;
        Context context = rootView.getContext();
        if (context == null) {
            return;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        int dimensionPixelSize = this.standalone ? 0 : context.getResources().getDimensionPixelSize(R.dimen.cbr_margin_medium);
        linearLayout.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        Object obj = data.get("title");
        String str = obj instanceof String ? (String) obj : null;
        if (str != null) {
            View viewRenderTitle = renderTitle(context, str);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
            marginLayoutParams.bottomMargin = context.getResources().getDimensionPixelSize(R.dimen.cbr_margin_small);
            G0 g02 = G0.f406611a;
            linearLayout.addView(viewRenderTitle, marginLayoutParams);
        }
        Object obj2 = data.get("subtitle");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        if (str2 != null) {
            View viewRenderSubTitle = renderSubTitle(context, str2);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
            marginLayoutParams2.bottomMargin = context.getResources().getDimensionPixelSize(R.dimen.cbr_margin_medium);
            G0 g03 = G0.f406611a;
            linearLayout.addView(viewRenderSubTitle, marginLayoutParams2);
        }
        int dimensionPixelSize2 = this.standalone ? context.getResources().getDimensionPixelSize(R.dimen.cbr_margin_small) : 0;
        Object obj3 = data.get("contentBlocks");
        List<?> list = obj3 instanceof List ? (List) obj3 : null;
        if (list != null) {
            for (View view : new InstructionsContentRender(this.extensionProvider).renderContent(context, list)) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-1, -2);
                marginLayoutParams3.topMargin = context.getResources().getDimensionPixelSize(R.dimen.cbr_margin_small);
                marginLayoutParams3.bottomMargin = context.getResources().getDimensionPixelSize(R.dimen.cbr_margin_small);
                marginLayoutParams3.setMarginStart(dimensionPixelSize2);
                marginLayoutParams3.setMarginEnd(dimensionPixelSize2);
                G0 g04 = G0.f406611a;
                linearLayout.addView(view, marginLayoutParams3);
            }
        }
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(contentContainerId);
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            viewGroup.addView(linearLayout, new ViewGroup.LayoutParams(-1, -2));
        }
        Object obj4 = data.get("actionTitle");
        String str3 = obj4 instanceof String ? (String) obj4 : null;
        if (str3 == null || (button = (Button) rootView.findViewById(buttonId)) == null) {
            return;
        }
        button.setText(str3);
    }

    public /* synthetic */ InstructionsRender(a aVar, boolean z12, int i12, C42822w c42822w) {
        this(aVar, (i12 & 2) != 0 ? true : z12);
    }
}
