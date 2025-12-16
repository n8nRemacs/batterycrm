package com.avito.android.inline_filters.dialog;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import androidx.compose.foundation.text.selection.W0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.inline_filters.dialog.select.adapter.InlineItemType;
import com.avito.android.inline_filters.dialog.w;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalCheckedImage;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.DisplayingImageParams;
import com.avito.android.remote.model.category_parameters.SortDirection;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.search.WidgetType;
import com.avito.android.util.O2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: InlineFiltersDialogItemConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/t;", "Lcom/avito/android/inline_filters/dialog/s;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class t implements s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select.variant.b f172284a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final NN.c f172285b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final WeakReference<Activity> f172286c;

    /* compiled from: InlineFiltersDialogItemConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f172287a;

        static {
            int[] iArr = new int[WidgetType.values().length];
            try {
                iArr[WidgetType.Select.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WidgetType.Multiselect.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WidgetType.RadioSelect.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WidgetType.Quarters.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f172287a = iArr;
        }
    }

    @Inject
    public t(@Y61.k com.avito.android.select.variant.b bVar, @Y61.k Activity activity, @Y61.k NN.c cVar) {
        this.f172284a = bVar;
        this.f172285b = cVar;
        this.f172286c = new WeakReference<>(activity);
    }

    @Override // com.avito.android.inline_filters.dialog.s
    @Y61.k
    public final List<com.avito.android.inline_filters.dialog.select.adapter.i> a(@Y61.k Filter filter) {
        com.avito.android.inline_filters.dialog.select.adapter.i iVar;
        Image image;
        boolean zBooleanValue;
        InlineItemType inlineItemType;
        Drawable drawable;
        boolean zF2;
        boolean z12;
        List<String> selectedOptions;
        Filter.InnerOptions.Display display;
        Filter.InnerOptions.Display display2;
        Drawable drawableA;
        Filter.Config config;
        Boolean withImages;
        Filter.Config config2;
        Filter.Config config3;
        Filter.Hint hint;
        Filter.Config config4;
        Filter.Widget widget = filter.getWidget();
        WidgetType type = widget != null ? widget.getType() : null;
        int i12 = type == null ? -1 : a.f172287a[type.ordinal()];
        if (i12 != 1 && i12 != 2 && i12 != 3 && i12 != 4) {
            return C42784z0.f406748b;
        }
        LinkedList linkedList = new LinkedList();
        List<Filter.InnerOptions> options = filter.getOptions();
        if (options != null) {
            for (Filter.InnerOptions innerOptions : options) {
                if (innerOptions.getTitle() != null) {
                    linkedList.addLast(innerOptions.getTitle());
                }
                List<Filter.InnerOptions.Options> options2 = innerOptions.getOptions();
                if (options2 != null) {
                    Filter.Widget widget2 = filter.getWidget();
                    SortDirection sortDirection = (widget2 == null || (config4 = widget2.getConfig()) == null) ? null : config4.getSortDirection();
                    if (sortDirection != null) {
                        options2 = C42745f0.B0(options2, new W0(4, new u(sortDirection)));
                    }
                    linkedList.addAll(options2);
                }
                Filter.Widget widget3 = filter.getWidget();
                if (widget3 != null && (config3 = widget3.getConfig()) != null && (hint = config3.getHint()) != null) {
                    linkedList.addLast(hint);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        for (Object obj : linkedList) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            if (obj instanceof String) {
                iVar = new com.avito.android.inline_filters.dialog.select.adapter.i(String.valueOf(i13), "", (String) obj, false, InlineItemType.f172065l, null, false, null, null, null, null, null, null, null, null, null, null, null, 262112, null);
            } else if (obj instanceof Filter.Hint) {
                String strValueOf = String.valueOf(i13);
                Filter.Hint hint2 = (Filter.Hint) obj;
                String title = hint2.getTitle();
                iVar = new com.avito.android.inline_filters.dialog.select.adapter.i(strValueOf, "", title == null ? "" : title, false, InlineItemType.f172066m, null, false, null, null, null, null, hint2.getUrl(), null, null, null, null, null, null, 260064, null);
            } else if (obj instanceof Filter.InnerOptions.Options) {
                Filter.Widget widget4 = filter.getWidget();
                boolean z13 = (widget4 != null ? widget4.getType() : null) == WidgetType.Multiselect;
                Filter.Widget widget5 = filter.getWidget();
                boolean z14 = (widget5 != null ? widget5.getType() : null) == WidgetType.RadioSelect;
                Filter.InnerOptions.Options options3 = (Filter.InnerOptions.Options) obj;
                Filter.InnerOptions.Display display3 = options3.getDisplay();
                Filter.Type type2 = display3 != null ? display3.getType() : null;
                Filter.Widget widget6 = filter.getWidget();
                if (widget6 == null || (config = widget6.getConfig()) == null || (withImages = config.getWithImages()) == null) {
                    image = null;
                    zBooleanValue = false;
                } else {
                    zBooleanValue = withImages.booleanValue();
                    Filter.Widget widget7 = filter.getWidget();
                    DisplayingImageParams imageParams = (widget7 == null || (config2 = widget7.getConfig()) == null) ? null : config2.getImageParams();
                    image = imageParams != null ? this.f172284a.a(imageParams, options3.getId()) : options3.getImage();
                }
                Filter.InnerOptions.Display display4 = options3.getDisplay();
                List<UniversalColor> gradientColors = display4 != null ? display4.getGradientColors() : null;
                Filter.InnerOptions.Display display5 = options3.getDisplay();
                Filter.InnerOptions.Display.Link link = display5 != null ? display5.getLink() : null;
                boolean z15 = (!O2.a(gradientColors) || link == null || link.getDeepLink() == null || (link.getDeepLink() instanceof NoMatchLink)) ? false : true;
                if (z13 && z15) {
                    inlineItemType = InlineItemType.f172058e;
                } else if (z13 && type2 == Filter.Type.IMAGE_RIGHT) {
                    inlineItemType = InlineItemType.f172057d;
                } else if (z13 && type2 == Filter.Type.CANDY) {
                    inlineItemType = InlineItemType.f172056c;
                } else if (z13) {
                    inlineItemType = InlineItemType.f172055b;
                } else if (type2 == Filter.Type.BRANDSPACE) {
                    inlineItemType = InlineItemType.f172064k;
                } else if (z14) {
                    inlineItemType = InlineItemType.f172062i;
                } else if (zBooleanValue) {
                    inlineItemType = InlineItemType.f172060g;
                } else if (type2 == Filter.Type.IMAGE_LEFT) {
                    inlineItemType = InlineItemType.f172061h;
                } else {
                    Filter.Widget widget8 = filter.getWidget();
                    inlineItemType = (widget8 != null ? widget8.getType() : null) == WidgetType.Quarters ? InlineItemType.f172063j : InlineItemType.f172059f;
                }
                if (image == null && inlineItemType == InlineItemType.f172057d) {
                    image = options3.getImage();
                }
                Image image2 = image;
                if (inlineItemType == InlineItemType.f172056c || (display2 = options3.getDisplay()) == null) {
                    drawable = null;
                } else {
                    Activity activity = this.f172286c.get();
                    if (activity != null) {
                        String icon = display2.getIcon();
                        Color color = display2.getColor();
                        drawableA = this.f172285b.a(activity, icon, color != null ? Integer.valueOf(color.getValue()) : null);
                    } else {
                        drawableA = null;
                    }
                    drawable = drawableA;
                }
                InlineItemType inlineItemType2 = InlineItemType.f172064k;
                String icon2 = (inlineItemType != inlineItemType2 || (display = options3.getDisplay()) == null) ? null : display.getIcon();
                String strValueOf2 = String.valueOf(i13);
                String title2 = options3.getTitle();
                String str = title2 == null ? "" : title2;
                String subtitle = options3.getSubtitle();
                String id2 = options3.getId();
                Filter.Widget widget9 = filter.getWidget();
                WidgetType type3 = widget9 != null ? widget9.getType() : null;
                InlineFilterValue value = filter.getValue();
                int i15 = type3 == null ? -1 : w.a.f172292a[type3.ordinal()];
                if (i15 == 1 || i15 == 2) {
                    if (value instanceof InlineFilterValue.InlineFilterSelectValue) {
                        zF2 = L.f(((InlineFilterValue.InlineFilterSelectValue) value).getSelectedOption(), options3.getOptionId());
                    } else {
                        if (value instanceof InlineFilterValue.InlineFilterSelectIntValue) {
                            zF2 = L.f(String.valueOf(((InlineFilterValue.InlineFilterSelectIntValue) value).getSelectedOption()), options3.getOptionId());
                        }
                        z12 = false;
                    }
                    z12 = zF2;
                } else {
                    if (i15 == 3) {
                        InlineFilterValue.InlineFilterMultiSelectValue inlineFilterMultiSelectValue = value instanceof InlineFilterValue.InlineFilterMultiSelectValue ? (InlineFilterValue.InlineFilterMultiSelectValue) value : null;
                        if (inlineFilterMultiSelectValue != null && (selectedOptions = inlineFilterMultiSelectValue.getSelectedOptions()) != null) {
                            zF2 = C42745f0.r(selectedOptions, options3.getOptionId());
                            z12 = zF2;
                        }
                    }
                    z12 = false;
                }
                boolean z16 = filter.getValue() instanceof InlineFilterValue.InlineFilterSelectIntValue;
                DeepLink deeplink = inlineItemType == inlineItemType2 ? options3.getDeeplink() : null;
                DeepLink deeplink2 = options3.getDeeplink();
                Filter.InnerOptions.Display display6 = options3.getDisplay();
                UniversalCheckedImage image3 = display6 != null ? display6.getImage() : null;
                Filter.InnerOptions.Display display7 = options3.getDisplay();
                iVar = new com.avito.android.inline_filters.dialog.select.adapter.i(strValueOf2, id2, str, z12, inlineItemType, subtitle, z16, null, image2, drawable, Boolean.valueOf(type2 == Filter.Type.IMAGE_LEFT), deeplink, deeplink2, image3, display7 != null ? display7.getIcon() : null, icon2, gradientColors, link, 128, null);
            } else {
                iVar = null;
            }
            if (iVar != null) {
                arrayList.add(iVar);
            }
            i13 = i14;
        }
        return arrayList;
    }
}
