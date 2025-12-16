package com.avito.android.search.filter.converter;

import android.content.res.Resources;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.adjust.sdk.Constants;
import com.avito.android.C34160q2;
import com.avito.android.R;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.District;
import com.avito.android.remote.model.DistrictsWithRegions;
import com.avito.android.remote.model.Entity;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Metro;
import com.avito.android.remote.model.category_parameters.Action;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.AddressesSearchParameter;
import com.avito.android.remote.model.category_parameters.Badge;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.Constraint;
import com.avito.android.remote.model.category_parameters.CustomPaddings;
import com.avito.android.remote.model.category_parameters.DateTimeParameter;
import com.avito.android.remote.model.category_parameters.DisplayingOptions;
import com.avito.android.remote.model.category_parameters.DistrictParameter;
import com.avito.android.remote.model.category_parameters.EditCategoryParameter;
import com.avito.android.remote.model.category_parameters.EmailParameter;
import com.avito.android.remote.model.category_parameters.EntryPointParameter;
import com.avito.android.remote.model.category_parameters.FormatterType;
import com.avito.android.remote.model.category_parameters.GroupMarkerParameter;
import com.avito.android.remote.model.category_parameters.IntParameter;
import com.avito.android.remote.model.category_parameters.LastSearchParameter;
import com.avito.android.remote.model.category_parameters.MetroParameter;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.remote.model.category_parameters.NumericParameter;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import com.avito.android.remote.model.category_parameters.ObjectsParameterKt;
import com.avito.android.remote.model.category_parameters.ParamButton;
import com.avito.android.remote.model.category_parameters.PhoneParameter;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import com.avito.android.remote.model.category_parameters.PriceParameter;
import com.avito.android.remote.model.category_parameters.RadiusParameter;
import com.avito.android.remote.model.category_parameters.Restrictions;
import com.avito.android.remote.model.category_parameters.SectionedMultiselectParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.TipIconParameters;
import com.avito.android.remote.model.category_parameters.VideoUploadParameter;
import com.avito.android.remote.model.category_parameters.VideoUploadParameterValue;
import com.avito.android.remote.model.category_parameters.base.CategoryParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.HasPlaceholder;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.base.TextParameter;
import com.avito.android.remote.model.category_parameters.recommendation_cards.RecommendationCardsParameter;
import com.avito.android.remote.model.filters_parameter.SimpleParametersTree;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.search.filter.converter.ParameterElement;
import com.avito.android.search.filter.converter.common.ActionWithPlaceholdersItem;
import com.avito.android.search.filter.converter.common.ItemWithAdditionalButton;
import com.avito.android.search.filter.converter.common.ItemWithState;
import com.avito.android.search.filter.converter.common.ParameterCard;
import com.avito.android.search.filter.converter.common.RecommendationCardsItem;
import com.avito.android.util.InterfaceC35945t1;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Z;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import shark.AndroidResourceIdNames;

/* compiled from: CategoryParametersElementConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/converter/j;", "", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f262978a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.f f262979b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f262980c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final hJ.g f262981d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final hJ.e f262982e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f262983f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f262984g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.search.filter.converter.util.n f262985h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final c f262986i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public String f262987j;

    /* compiled from: CategoryParametersElementConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f262988a;

        static {
            int[] iArr = new int[CharParameter.InputType.values().length];
            try {
                iArr[CharParameter.InputType.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CharParameter.InputType.VIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CharParameter.InputType.URI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f262988a = iArr;
        }
    }

    /* compiled from: Gsons.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"com/avito/android/util/GsonsKt$gsonTypeToken$1", "Lcom/google/gson/reflect/a;", "com/avito/android/util/N1", "_common_gson_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.google.gson.reflect.a<ParameterElement.n.b> {
    }

    @X41.j
    public j() {
        throw null;
    }

    public j(InterfaceC35945t1 interfaceC35945t1, Resources resources, com.avito.android.server_time.f fVar, Locale locale, boolean z12, hJ.g gVar, hJ.e eVar, boolean z13, C34160q2 c34160q2, boolean z14, int i12, C42822w c42822w) {
        boolean z15 = (i12 & 16) != 0 ? false : z12;
        boolean z16 = (i12 & 128) != 0 ? false : z13;
        boolean z17 = (i12 & 512) != 0 ? false : z14;
        this.f262978a = resources;
        this.f262979b = fVar;
        this.f262980c = z15;
        this.f262981d = gVar;
        this.f262982e = eVar;
        this.f262983f = z16;
        this.f262984g = z17;
        NumberFormat numberFormat = NumberFormat.getInstance(locale);
        numberFormat.setGroupingUsed(false);
        this.f262985h = new com.avito.android.search.filter.converter.util.n(resources);
        this.f262986i = new c(numberFormat, interfaceC35945t1, locale, resources, c34160q2);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.set(1960, 0, 1);
        calendar.getTimeInMillis();
    }

    public static RecommendationCardsItem B(RecommendationCardsParameter recommendationCardsParameter) {
        String itemsStyle;
        Parcelable select;
        if (!recommendationCardsParameter.getVisible().booleanValue()) {
            return null;
        }
        RecommendationCardsParameter.Displaying displaying = recommendationCardsParameter.getDisplaying();
        if (displaying == null || (itemsStyle = displaying.getItemsStyle()) == null) {
            itemsStyle = Constants.SMALL;
        }
        List<RecommendationCardsParameter.ParameterCard> values = recommendationCardsParameter.getValues();
        ArrayList arrayList = new ArrayList(C42745f0.q(values, 10));
        for (RecommendationCardsParameter.ParameterCard parameterCard : values) {
            if (parameterCard instanceof RecommendationCardsParameter.ParameterCard.MultiSelect) {
                select = new ParameterCard.MultiSelect(parameterCard.getFormParameterId(), parameterCard.getParameterId(), parameterCard.getIcon(), parameterCard.getIconColor(), parameterCard.getTitle(), parameterCard.getIsSelected(), itemsStyle, ((RecommendationCardsParameter.ParameterCard.MultiSelect) parameterCard).getValues());
            } else {
                if (!(parameterCard instanceof RecommendationCardsParameter.ParameterCard.Select)) {
                    throw new NoWhenBranchMatchedException();
                }
                select = new ParameterCard.Select(parameterCard.getFormParameterId(), parameterCard.getParameterId(), parameterCard.getIcon(), parameterCard.getIconColor(), parameterCard.getTitle(), parameterCard.getIsSelected(), itemsStyle, ((RecommendationCardsParameter.ParameterCard.Select) parameterCard).getValue());
            }
            arrayList.add(select);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new RecommendationCardsItem(recommendationCardsParameter.getId(), recommendationCardsParameter.getTitle(), arrayList);
    }

    public static Cp0.e D(SelectParameter.Value value, boolean z12) {
        SelectParameter.Value.Widget.Config config;
        SelectParameter.Value.Widget.Config.Hint hint;
        Color color;
        String id2 = value.getId();
        String title = value.getTitle();
        SelectParameter.Value.Display display = value.getDisplay();
        Integer numValueOf = (display == null || (color = display.getColor()) == null) ? null : Integer.valueOf(color.getValue());
        SelectParameter.Value.Display display2 = value.getDisplay();
        String icon = display2 != null ? display2.getIcon() : null;
        SelectParameter.Value.Display display3 = value.getDisplay();
        String leftIcon = display3 != null ? display3.getLeftIcon() : null;
        SelectParameter.Value.Widget widget = value.getWidget();
        return new Cp0.e(id2, title, null, z12, numValueOf, (widget == null || (config = widget.getConfig()) == null || (hint = config.getHint()) == null) ? null : hint.getDeepLink(), icon, leftIcon, value.getIsDisabled(), null, null, null, null, null, 15876, null);
    }

    public static ArrayList E(List list, SelectParameter.Value value) {
        List<SelectParameter.Value> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (SelectParameter.Value value2 : list2) {
            arrayList.add(D(value2, L.f(value, value2)));
        }
        return arrayList;
    }

    public static ParameterElement.A F(VideoUploadParameter videoUploadParameter) {
        VideoUploadParameter.Widget.Config config;
        VideoUploadParameter.Widget.Config config2;
        VideoUploadParameter.Widget.Config config3;
        VideoUploadParameterValue videoUploadParameterValue;
        VideoUploadParameterValue videoUploadParameterValue2;
        VideoUploadParameter.Widget.Config config4;
        VideoUploadParameter.Widget.Config config5;
        String id2 = videoUploadParameter.getId();
        VideoUploadParameter.Widget widget = videoUploadParameter.getWidget();
        String title = (widget == null || (config5 = widget.getConfig()) == null) ? null : config5.getTitle();
        VideoUploadParameter.Widget widget2 = videoUploadParameter.getWidget();
        String description = (widget2 == null || (config4 = widget2.getConfig()) == null) ? null : config4.getDescription();
        List<? extends VideoUploadParameterValue> value = videoUploadParameter.getValue();
        String id3 = (value == null || (videoUploadParameterValue2 = (VideoUploadParameterValue) C42745f0.G(value)) == null) ? null : videoUploadParameterValue2.getId();
        List<? extends VideoUploadParameterValue> value2 = videoUploadParameter.getValue();
        Image thumbnail = (value2 == null || (videoUploadParameterValue = (VideoUploadParameterValue) C42745f0.G(value2)) == null) ? null : videoUploadParameterValue.getThumbnail();
        AttributedText errorMessage = videoUploadParameter.getErrorMessage();
        String text = errorMessage != null ? errorMessage.getText() : null;
        VideoUploadParameter.Widget widget3 = videoUploadParameter.getWidget();
        Long maxFileSize = (widget3 == null || (config3 = widget3.getConfig()) == null) ? null : config3.getMaxFileSize();
        VideoUploadParameter.Widget widget4 = videoUploadParameter.getWidget();
        Boolean isNew = (widget4 == null || (config2 = widget4.getConfig()) == null) ? null : config2.getIsNew();
        VideoUploadParameter.Widget widget5 = videoUploadParameter.getWidget();
        return new ParameterElement.A(id2, title, description, id3, thumbnail, text, maxFileSize, isNew, (widget5 == null || (config = widget5.getConfig()) == null) ? null : config.getOnboarding());
    }

    public static ArrayList b(List list, Set set) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Entity entity = (Entity) it.next();
            if (set != null && !C42745f0.r(set, entity.getId())) {
                entity = null;
            }
            if (entity != null) {
                arrayList.add(entity);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DisplayingOptions c(CategoryParameter categoryParameter) {
        if (categoryParameter instanceof TextParameter) {
            return ((TextParameter) categoryParameter).getDisplayingOptions();
        }
        if (categoryParameter instanceof PriceParameter) {
            DisplayingOptions displayingOptions = ((PriceParameter) categoryParameter).getDisplayingOptions();
            if (displayingOptions != null) {
                if (displayingOptions.getFormatter() == null) {
                    displayingOptions = displayingOptions.copy(((-65) & 1) != 0 ? displayingOptions.type : null, ((-65) & 2) != 0 ? displayingOptions.masks : null, ((-65) & 4) != 0 ? displayingOptions.multiline : null, ((-65) & 8) != 0 ? displayingOptions.prefix : null, ((-65) & 16) != 0 ? displayingOptions.postfix : null, ((-65) & 32) != 0 ? displayingOptions.length : null, ((-65) & 64) != 0 ? displayingOptions.formatter : FormatterType.PRICE, ((-65) & 128) != 0 ? displayingOptions.visible : null, ((-65) & 256) != 0 ? displayingOptions.hideTitle : false, ((-65) & 512) != 0 ? displayingOptions.enabled : null, ((-65) & 1024) != 0 ? displayingOptions.defaultValue : null, ((-65) & 2048) != 0 ? displayingOptions.disableMask : null, ((-65) & 4096) != 0 ? displayingOptions.sendUncheckedValue : null, ((-65) & 8192) != 0 ? displayingOptions.subTitle : null, ((-65) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? displayingOptions.attributedSubtitle : null, ((-65) & 32768) != 0 ? displayingOptions.placeholder : null, ((-65) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? displayingOptions.editScreenTitle : null, ((-65) & 131072) != 0 ? displayingOptions.style : null, ((-65) & 262144) != 0 ? displayingOptions.addButtonTitle : null, ((-65) & 524288) != 0 ? displayingOptions.editButtonTitle : null, ((-65) & 1048576) != 0 ? displayingOptions.dialogDisplaying : null, ((-65) & 2097152) != 0 ? displayingOptions.badge : null, ((-65) & 4194304) != 0 ? displayingOptions.titleTipAction : null, ((-65) & 8388608) != 0 ? displayingOptions.titleTipText : null, ((-65) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? displayingOptions.shouldShowAlertBannerOnFocus : null, ((-65) & 33554432) != 0 ? displayingOptions.alertBannerText : null, ((-65) & 67108864) != 0 ? displayingOptions.photoWidgetWithGroups : null, ((-65) & 134217728) != 0 ? displayingOptions.priceListDisplaying : null, ((-65) & 268435456) != 0 ? displayingOptions.customPaddings : null, ((-65) & 536870912) != 0 ? displayingOptions.withClearButton : null, ((-65) & 1073741824) != 0 ? displayingOptions.toFillIn : null, ((-65) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? displayingOptions.titleStyle : null, (127 & 1) != 0 ? displayingOptions.needFormatting : null, (127 & 2) != 0 ? displayingOptions.showsAddressValue : null, (127 & 4) != 0 ? displayingOptions.clearanceValues : null, (127 & 8) != 0 ? displayingOptions.label : null, (127 & 16) != 0 ? displayingOptions.subtitle : null, (127 & 32) != 0 ? displayingOptions.universalImage : null, (127 & 64) != 0 ? displayingOptions.description : null);
                }
                return displayingOptions;
            }
        } else {
            if (categoryParameter instanceof AddressParameter) {
                return ((AddressParameter) categoryParameter).getDisplaying();
            }
            if (categoryParameter instanceof PhotoParameter) {
                return ((PhotoParameter) categoryParameter).getDisplayingOptions();
            }
            if (categoryParameter instanceof ObjectsParameter) {
                return ((ObjectsParameter) categoryParameter).getDisplayingOptions();
            }
            if (categoryParameter instanceof CharParameter) {
                return ((CharParameter) categoryParameter).getDisplayingOptions();
            }
            if (categoryParameter instanceof RadiusParameter) {
                return ((RadiusParameter) categoryParameter).getDisplayingOptions();
            }
            if (categoryParameter instanceof MetroParameter) {
                return ((MetroParameter) categoryParameter).getDisplayingOptions();
            }
            if (categoryParameter instanceof AddressesSearchParameter) {
                return ((AddressesSearchParameter) categoryParameter).getDisplayingOptions();
            }
            if (categoryParameter instanceof IntParameter) {
                return ((IntParameter) categoryParameter).getDisplayingOptions();
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static com.avito.android.lib.design.input.FormatterType e(CategoryParameter categoryParameter, int i12) {
        com.avito.android.lib.design.input.FormatterType formatterType;
        DisplayingOptions displayingOptions;
        if (categoryParameter instanceof NumericParameter) {
            com.avito.android.lib.design.input.FormatterType.f179288e.getClass();
            formatterType = FormatterType.a.d();
        } else {
            if (categoryParameter instanceof IntParameter ? true : categoryParameter instanceof PriceParameter) {
                com.avito.android.lib.design.input.FormatterType.f179288e.getClass();
                formatterType = FormatterType.a.c();
            } else if (categoryParameter instanceof PhoneParameter) {
                com.avito.android.lib.design.input.FormatterType.f179288e.getClass();
                formatterType = com.avito.android.lib.design.input.FormatterType.f179290g;
            } else {
                formatterType = new com.avito.android.lib.design.input.FormatterType(Integer.MAX_VALUE, Integer.valueOf(i12), null, 4, null);
            }
        }
        TextParameter textParameter = categoryParameter instanceof TextParameter ? (TextParameter) categoryParameter : null;
        return (textParameter == null || (displayingOptions = textParameter.getDisplayingOptions()) == null) ? false : L.f(displayingOptions.getDisableMask(), Boolean.TRUE) ? com.avito.android.lib.design.input.FormatterType.a(formatterType, null) : formatterType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int f(com.avito.android.remote.model.category_parameters.base.CategoryParameter r2) {
        /*
            boolean r0 = r2 instanceof com.avito.android.remote.model.category_parameters.base.TextParameter
            r1 = 1
            if (r0 == 0) goto L1d
            com.avito.android.remote.model.category_parameters.base.TextParameter r2 = (com.avito.android.remote.model.category_parameters.base.TextParameter) r2
            com.avito.android.remote.model.category_parameters.DisplayingOptions r2 = r2.getDisplayingOptions()
            if (r2 == 0) goto L18
            java.lang.Boolean r2 = r2.getMultiline()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r2 = kotlin.jvm.internal.L.f(r2, r0)
            goto L19
        L18:
            r2 = 0
        L19:
            if (r2 == 0) goto L1d
            r2 = 3
            goto L1e
        L1d:
            r2 = r1
        L1e:
            int r2 = java.lang.Math.max(r1, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.search.filter.converter.j.f(com.avito.android.remote.model.category_parameters.base.CategoryParameter):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    public static ParameterElement.DisplayType.Chips.Style g(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -758969224:
                    if (str.equals("singleLineFixed")) {
                        return ParameterElement.DisplayType.Chips.Style.f262700b;
                    }
                    break;
                case -668138801:
                    if (str.equals("multipleLines")) {
                        return ParameterElement.DisplayType.Chips.Style.f262703e;
                    }
                    break;
                case -262939895:
                    if (str.equals("singleLineStretch")) {
                        return ParameterElement.DisplayType.Chips.Style.f262701c;
                    }
                    break;
                case 1504160547:
                    if (str.equals("singleLineScrollable")) {
                        return ParameterElement.DisplayType.Chips.Style.f262702d;
                    }
                    break;
            }
        }
        return null;
    }

    public static int i(CategoryParameter categoryParameter) {
        if (categoryParameter instanceof NumericParameter) {
            return 8194;
        }
        if (!(categoryParameter instanceof IntParameter ? true : categoryParameter instanceof PriceParameter)) {
            if (categoryParameter instanceof EmailParameter) {
                return 32;
            }
            if (categoryParameter instanceof CharParameter) {
                int i12 = a.f262988a[((CharParameter) categoryParameter).getInputType().ordinal()];
                if (i12 != 1) {
                    if (i12 == 2) {
                        return 528385;
                    }
                    if (i12 == 3) {
                        return 16;
                    }
                }
            }
            return 16385;
        }
        return 2;
    }

    public static AttributedText j(CategoryParameter categoryParameter) {
        if (categoryParameter instanceof TextParameter) {
            return categoryParameter.getMotivation();
        }
        if (categoryParameter instanceof PhoneParameter) {
            return ((PhoneParameter) categoryParameter).getMotivation();
        }
        return null;
    }

    public static boolean l(CategoryParameter categoryParameter) {
        MultiselectParameter.Displaying displaying;
        SelectParameter.Displaying displaying2;
        DisplayingOptions displayingOptionsC = c(categoryParameter);
        if (displayingOptionsC != null && displayingOptionsC.getHideTitle()) {
            return true;
        }
        SelectParameter selectParameter = categoryParameter instanceof SelectParameter ? (SelectParameter) categoryParameter : null;
        if (selectParameter != null && (displaying2 = selectParameter.getDisplaying()) != null && displaying2.getHideTitle().booleanValue()) {
            return true;
        }
        MultiselectParameter multiselectParameter = categoryParameter instanceof MultiselectParameter ? (MultiselectParameter) categoryParameter : null;
        return (multiselectParameter == null || (displaying = multiselectParameter.getDisplaying()) == null) ? false : L.f(displaying.getHideTitle(), Boolean.TRUE);
    }

    public static ActionWithPlaceholdersItem m(LastSearchParameter lastSearchParameter) {
        Object bVar;
        try {
            int i12 = Z.f406624c;
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        if (!lastSearchParameter.getVisible().booleanValue()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        String id2 = lastSearchParameter.getId();
        String title = lastSearchParameter.getTitle();
        LastSearchParameter.Value value = lastSearchParameter.getValue();
        Action action = value != null ? value.getAction() : null;
        if (action == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        LastSearchParameter.Value value2 = lastSearchParameter.getValue();
        List<String> placeholders = value2 != null ? value2.getPlaceholders() : null;
        if (placeholders == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        DisplayingOptions displayingOptions = lastSearchParameter.getDisplayingOptions();
        bVar = new ActionWithPlaceholdersItem(id2, title, action, placeholders, displayingOptions != null ? displayingOptions.getBadge() : null);
        return (ActionWithPlaceholdersItem) (bVar instanceof Z.b ? null : bVar);
    }

    public static ParameterElement.DisplayType r(SelectParameter.Displaying displaying) {
        String type = displaying.getType();
        switch (type.hashCode()) {
            case -1627804910:
                if (type.equals("segmented")) {
                    return ParameterElement.DisplayType.k.f262716a;
                }
                return null;
            case -1332085432:
                if (type.equals("dialog")) {
                    return ParameterElement.DisplayType.e.f262710a;
                }
                return null;
            case -1183997287:
                if (!type.equals("inline")) {
                    return null;
                }
                break;
            case -964448423:
                if (type.equals("suggestLocation")) {
                    return ParameterElement.DisplayType.m.f262718a;
                }
                return null;
            case -675604244:
                if (type.equals("serpDisplayType")) {
                    return ParameterElement.DisplayType.l.f262717a;
                }
                return null;
            case -620399116:
                if (type.equals("bottomSheet")) {
                    return ParameterElement.DisplayType.a.f262706a;
                }
                return null;
            case 5318500:
                if (type.equals("radiogroup")) {
                    return ParameterElement.DisplayType.i.f262714a;
                }
                return null;
            case 94631335:
                if (type.equals("chips")) {
                    return new ParameterElement.DisplayType.Chips(false, g(displaying.getStyle()), 1, null);
                }
                return null;
            case 224189799:
                if (type.equals("bubbles")) {
                    return ParameterElement.DisplayType.b.f262707a;
                }
                return null;
            case 1536891843:
                if (type.equals("checkbox")) {
                    return ParameterElement.DisplayType.d.f262709a;
                }
                return null;
            case 1691623983:
                if (type.equals("localPriority")) {
                    return ParameterElement.DisplayType.h.f262713a;
                }
                return null;
            case 1950789867:
                if (!type.equals("inlined")) {
                    return null;
                }
                break;
            default:
                return null;
        }
        return ParameterElement.DisplayType.g.f262712a;
    }

    public static ParameterElement.i u(EntryPointParameter entryPointParameter) {
        String title;
        EntryPointParameter.EntryPointValue value;
        DeepLink deepLink;
        EntryPointParameter.EntryPointValue.Display display;
        String id2 = entryPointParameter.getId();
        String title2 = entryPointParameter.getTitle();
        EntryPointParameter.EntryPointValue value2 = entryPointParameter.getValue();
        String subtitle = value2 != null ? value2.getSubtitle() : null;
        EntryPointParameter.EntryPointValue value3 = entryPointParameter.getValue();
        if (value3 == null || (title = value3.getTitle()) == null || (value = entryPointParameter.getValue()) == null || (deepLink = value.getDeepLink()) == null) {
            return null;
        }
        EntryPointParameter.EntryPointValue value4 = entryPointParameter.getValue();
        return new ParameterElement.i(id2, title2, deepLink, subtitle, title, (value4 == null || (display = value4.getDisplay()) == null) ? null : display.getGradientColors());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.avito.android.search.filter.converter.ParameterElement.n v(com.avito.android.remote.model.category_parameters.GuestsSelectParameter r14) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.search.filter.converter.j.v(com.avito.android.remote.model.category_parameters.GuestsSelectParameter):com.avito.android.search.filter.converter.ParameterElement$n");
    }

    public static ItemWithAdditionalButton.AdditionalButton x(ParamButton paramButton, String str) {
        ItemWithAdditionalButton.AdditionalButton additionalButton;
        ItemWithAdditionalButton.AdditionalButtonType additionalButtonType;
        String upperCase = paramButton.getType().toUpperCase(Locale.getDefault());
        ItemWithAdditionalButton.AdditionalButtonType[] additionalButtonTypeArrValues = ItemWithAdditionalButton.AdditionalButtonType.values();
        int length = additionalButtonTypeArrValues.length;
        int i12 = 0;
        while (true) {
            additionalButton = null;
            if (i12 >= length) {
                additionalButtonType = null;
                break;
            }
            additionalButtonType = additionalButtonTypeArrValues[i12];
            if (L.f(additionalButtonType.name(), upperCase)) {
                break;
            }
            i12++;
        }
        if (additionalButtonType != null) {
            String link = paramButton.getLink();
            ParamButton.Position position = paramButton.getPosition();
            if (position == null) {
                position = ParamButton.Position.INLINE;
            }
            additionalButton = new ItemWithAdditionalButton.AdditionalButton(additionalButtonType, link, str, position);
        }
        return additionalButton;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.String] */
    public final ParameterElement.t A(ObjectsParameter objectsParameter) {
        ?? arrayList;
        Restrictions.Limit limit;
        List<? extends List<? extends ParameterSlot>> value = objectsParameter.getValue();
        if (value != null) {
            value.size();
        }
        Restrictions restrictions = objectsParameter.getRestrictions();
        if (restrictions != null && (limit = restrictions.getLimit()) != null) {
            limit.getMax();
        }
        List<? extends List<? extends ParameterSlot>> value2 = objectsParameter.getValue();
        if (value2 != null) {
            List<? extends List<? extends ParameterSlot>> list = value2;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            int i12 = 0;
            for (Object obj : list) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                List list2 = (List) obj;
                SimpleParametersTree simpleParametersTree = new SimpleParametersTree(list2);
                ObjectsParameter.Summary summary = objectsParameter.getSummary();
                List<String> titles = summary != null ? summary.getTitles() : null;
                if (titles == null) {
                    titles = C42784z0.f406748b;
                }
                com.avito.android.search.filter.converter.util.n nVar = this.f262985h;
                ArrayList arrayListA = nVar.a(titles, simpleParametersTree);
                ObjectsParameter.Summary summary2 = objectsParameter.getSummary();
                List<String> subtitles = summary2 != null ? summary2.getSubtitles() : null;
                if (subtitles == null) {
                    subtitles = C42784z0.f406748b;
                }
                ArrayList arrayListA2 = nVar.a(subtitles, simpleParametersTree);
                ObjectsParameterKt.hasChildError(list2);
                Iterator it = arrayListA.iterator();
                if (!it.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                ?? next = it.next();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    next = (String) next;
                    if (str.length() > 0) {
                        next = H.i('\n', next, str);
                    }
                }
                arrayList.add(new ParameterElement.t.a());
                i12 = i13;
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = C42784z0.f406748b;
        }
        DisplayingOptions displayingOptions = objectsParameter.getDisplayingOptions();
        if (displayingOptions == null || displayingOptions.getAttributedSubtitle() == null) {
            DisplayingOptions displayingOptions2 = objectsParameter.getDisplayingOptions();
            String subTitle = displayingOptions2 != null ? displayingOptions2.getSubTitle() : null;
            if (subTitle == null) {
                subTitle = "";
            }
            new AttributedText(subTitle, C42784z0.f406748b, 0, 4, null);
        }
        String id2 = objectsParameter.getId();
        objectsParameter.getTitle();
        DisplayingOptions displayingOptions3 = objectsParameter.getDisplayingOptions();
        if (displayingOptions3 != null) {
            displayingOptions3.getAddButtonTitle();
        }
        l(objectsParameter);
        d(objectsParameter);
        AttributedText errorMessage = objectsParameter.getErrorMessage();
        ItemWithState.State error = errorMessage != null ? new ItemWithState.State.Error(errorMessage.getText()) : new ItemWithState.State.Normal(null, 1, null);
        objectsParameter.getMotivation();
        return new ParameterElement.t(id2, arrayList, error);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Type inference failed for: r10v5, types: [Cp0.e] */
    /* JADX WARN: Type inference failed for: r3v25, types: [Cp0.e] */
    /* JADX WARN: Type inference failed for: r3v28, types: [Cp0.e] */
    /* JADX WARN: Type inference failed for: r4v19, types: [Cp0.e] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [Cp0.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List, kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.search.filter.converter.ParameterElement.v.b C(com.avito.android.remote.model.category_parameters.base.CategoryParameter r73) {
        /*
            Method dump skipped, instructions count: 1356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.search.filter.converter.j.C(com.avito.android.remote.model.category_parameters.base.CategoryParameter):com.avito.android.search.filter.converter.ParameterElement$v$b");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x03ef, code lost:
    
        r8.add(r13);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0895  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x08aa  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0964 A[PHI: r4
  0x0964: PHI (r4v12 int) = (r4v1 int), (r4v1 int), (r4v1 int), (r4v1 int), (r4v1 int), (r4v1 int), (r4v3 int), (r4v6 int), (r4v9 int), (r4v1 int) binds: [B:660:0x0c2a, B:657:0x0c1f, B:642:0x0bdc, B:610:0x0b4b, B:620:0x0b64, B:631:0x0b81, B:586:0x0afa, B:564:0x0a86, B:539:0x09eb, B:499:0x092c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00af  */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r21v11 */
    /* JADX WARN: Type inference failed for: r21v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v33, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v37, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r76v0, types: [com.avito.android.search.filter.converter.j] */
    /* JADX WARN: Type inference failed for: r7v36, types: [com.avito.android.search.filter.converter.ParameterElement$h] */
    /* JADX WARN: Type inference failed for: r8v40, types: [java.lang.Object] */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList a(@Y61.k UV0.b r77) {
        /*
            Method dump skipped, instructions count: 3660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.search.filter.converter.j.a(UV0.b):java.util.ArrayList");
    }

    @Y61.l
    public final String d(@Y61.k CategoryParameter categoryParameter) {
        if ((categoryParameter instanceof EditCategoryParameter) && ((EditCategoryParameter) categoryParameter).hasError()) {
            return categoryParameter.getTitle();
        }
        if (!(categoryParameter instanceof EditableParameter)) {
            return null;
        }
        EditableParameter editableParameter = (EditableParameter) categoryParameter;
        if (editableParameter.hasError()) {
            return editableParameter.hasValue() ? this.f262986i.d(categoryParameter) : categoryParameter.getTitle();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String h(CategoryParameter categoryParameter) {
        String placeholder;
        SectionedMultiselectParameter.Displaying displaying;
        if (!(categoryParameter instanceof HasPlaceholder)) {
            return null;
        }
        DisplayingOptions displayingOptionsC = c(categoryParameter);
        if ((displayingOptionsC != null && (placeholder = displayingOptionsC.getPlaceholder()) != null) || (placeholder = ((HasPlaceholder) categoryParameter).getPlaceholder()) != null) {
            return placeholder;
        }
        boolean z12 = categoryParameter instanceof SelectParameter ? true : categoryParameter instanceof MultiselectParameter ? true : categoryParameter instanceof SectionedMultiselectParameter;
        Resources resources = this.f262978a;
        if (z12) {
            if (categoryParameter instanceof SelectParameter.Flat) {
                SelectParameter.Displaying displaying2 = ((SelectParameter.Flat) categoryParameter).getDisplaying();
                if (displaying2 != null) {
                    placeholder = displaying2.getPlaceholder();
                }
            } else if (categoryParameter instanceof MultiselectParameter) {
                MultiselectParameter.Displaying displaying3 = ((MultiselectParameter) categoryParameter).getDisplaying();
                if (displaying3 != null) {
                    placeholder = displaying3.getPlaceholder();
                }
            } else if (categoryParameter instanceof SelectParameter.Sectioned) {
                SelectParameter.Displaying displaying4 = ((SelectParameter.Sectioned) categoryParameter).getDisplaying();
                if (displaying4 != null) {
                    placeholder = displaying4.getPlaceholder();
                }
            } else if ((categoryParameter instanceof SectionedMultiselectParameter) && (displaying = ((SectionedMultiselectParameter) categoryParameter).getDisplaying()) != null) {
                placeholder = displaying.getPlaceholder();
            }
            return placeholder == null ? resources.getString(R.string.search_filter_select_placeholder) : placeholder;
        }
        if (categoryParameter instanceof AddressParameter) {
            return resources.getString(R.string.search_filter_select_address_placeholder);
        }
        if (categoryParameter instanceof PhoneParameter) {
            return resources.getString(R.string.search_filter_input_phone_number_placeholder);
        }
        if (categoryParameter instanceof PriceParameter) {
            DisplayingOptions displayingOptions = ((PriceParameter) categoryParameter).getDisplayingOptions();
            return resources.getString(R.string.search_filter_price_placeholder, displayingOptions != null ? displayingOptions.getPostfix() : null);
        }
        if (categoryParameter instanceof TextParameter) {
            return resources.getString(R.string.search_filter_text_placeholder);
        }
        if (categoryParameter instanceof DateTimeParameter) {
            return resources.getString(R.string.search_filter_date_time_placeholder);
        }
        if (categoryParameter instanceof MetroParameter) {
            return resources.getString(R.string.search_filter_metro_placeholder);
        }
        if (categoryParameter instanceof AddressesSearchParameter) {
            return resources.getString(R.string.search_filter_address_placeholder);
        }
        if (categoryParameter instanceof DistrictParameter) {
            return resources.getString(R.string.select_district_page_title);
        }
        return null;
    }

    public final ParameterElement.l k(GroupMarkerParameter groupMarkerParameter) {
        if (!groupMarkerParameter.getStart()) {
            this.f262987j = null;
            return new ParameterElement.l.a(groupMarkerParameter.getId() + "_end", null);
        }
        this.f262987j = groupMarkerParameter.getId();
        String str = groupMarkerParameter.getId() + "_start";
        groupMarkerParameter.getTitle();
        return new ParameterElement.l.b(str, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Cp0.C13337a n(com.avito.android.remote.model.category_parameters.BannerCheckBoxWithImageParameter r11) {
        /*
            r10 = this;
            java.lang.String r1 = r11.getId()
            java.lang.String r2 = r10.f262987j
            java.lang.String r3 = r11.getTitle()
            com.avito.android.remote.model.category_parameters.DisplayingOptions r0 = r11.getDisplayingOptions()
            r4 = 0
            if (r0 == 0) goto L17
            java.lang.String r0 = r0.getLabel()
            r5 = r0
            goto L18
        L17:
            r5 = r4
        L18:
            com.avito.android.remote.model.category_parameters.DisplayingOptions r0 = r11.getDisplayingOptions()
            if (r0 == 0) goto L24
            java.lang.String r0 = r0.getSubtitle()
            r6 = r0
            goto L25
        L24:
            r6 = r4
        L25:
            java.lang.Object r0 = r11.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L2e
            goto L36
        L2e:
            int r0 = r0.intValue()
            r7 = 1
            if (r0 != r7) goto L36
            goto L38
        L36:
            r0 = 0
            r7 = r0
        L38:
            com.avito.android.remote.model.category_parameters.DisplayingOptions r0 = r11.getDisplayingOptions()
            if (r0 == 0) goto L44
            com.avito.android.remote.model.category_parameters.Badge r0 = r0.getBadge()
            r8 = r0
            goto L45
        L44:
            r8 = r4
        L45:
            com.avito.android.remote.model.category_parameters.DisplayingOptions r11 = r11.getDisplayingOptions()
            if (r11 == 0) goto L50
            com.avito.android.remote.model.UniversalImage r11 = r11.getUniversalImage()
            goto L51
        L50:
            r11 = r4
        L51:
            Cp0.a r9 = new Cp0.a
            r0 = r9
            r4 = r7
            r7 = r8
            r8 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.search.filter.converter.j.n(com.avito.android.remote.model.category_parameters.BannerCheckBoxWithImageParameter):Cp0.a");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        if (r1.equals("checkmark") == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
    
        if (r1.equals("checkBoxWithBadge") == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
    
        return p(r29, null);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.conveyor_item.a o(com.avito.android.remote.model.category_parameters.BooleanParameter r29) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.search.filter.converter.j.o(com.avito.android.remote.model.category_parameters.BooleanParameter):com.avito.conveyor_item.a");
    }

    public final com.avito.android.search.filter.converter.common.c p(BooleanParameter booleanParameter, String str) {
        j jVar;
        DeepLink titleTipAction;
        Boolean enabled;
        String id2 = booleanParameter.getId();
        Boolean value = booleanParameter.getValue();
        boolean zBooleanValue = value != null ? value.booleanValue() : false;
        DisplayingOptions displayingOptions = booleanParameter.getDisplayingOptions();
        boolean zBooleanValue2 = (displayingOptions == null || (enabled = displayingOptions.getEnabled()) == null) ? true : enabled.booleanValue();
        String title = booleanParameter.getTitle();
        AttributedText subtitle = booleanParameter.getSubtitle();
        AttributedText motivation = booleanParameter.getMotivation();
        String header = booleanParameter.getHeader();
        DisplayingOptions displayingOptions2 = booleanParameter.getDisplayingOptions();
        boolean hideTitle = displayingOptions2 != null ? displayingOptions2.getHideTitle() : false;
        DisplayingOptions displayingOptions3 = booleanParameter.getDisplayingOptions();
        Badge badge = displayingOptions3 != null ? displayingOptions3.getBadge() : null;
        DisplayingOptions displayingOptions4 = booleanParameter.getDisplayingOptions();
        if (displayingOptions4 != null) {
            jVar = this;
            titleTipAction = displayingOptions4.getTitleTipAction();
        } else {
            jVar = this;
            titleTipAction = null;
        }
        return new com.avito.android.search.filter.converter.common.c(id2, title, str, zBooleanValue, zBooleanValue2, subtitle, null, motivation, header, hideTitle, badge, titleTipAction, jVar.f262987j, 64, null);
    }

    public final ParameterElement.f q(DateTimeParameter dateTimeParameter) {
        Constraint constraint;
        Object next;
        List<Constraint> constraints = dateTimeParameter.getConstraints();
        if (constraints != null) {
            Iterator<T> it = constraints.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((Constraint) next) instanceof Constraint.Limit) {
                    break;
                }
            }
            constraint = (Constraint) next;
        } else {
            constraint = null;
        }
        Constraint.Limit limit = constraint instanceof Constraint.Limit ? (Constraint.Limit) constraint : null;
        if (limit != null) {
            limit.getMin();
        }
        if (limit == null || limit.getMax() == null) {
            this.f262979b.now();
        }
        String title = (dateTimeParameter.hasValue() || !dateTimeParameter.hasError()) ? null : dateTimeParameter.getTitle();
        Long timestamp = dateTimeParameter.isPresentTime() ? null : dateTimeParameter.getTimestamp();
        String id2 = dateTimeParameter.getId();
        dateTimeParameter.getTitle();
        dateTimeParameter.getRequired();
        DateTimeParameter.PresentTimeOptions presentTime = dateTimeParameter.getPresentTime();
        if (presentTime != null) {
            presentTime.getTitle();
        }
        boolean zIsPresentTime = dateTimeParameter.isPresentTime();
        ItemWithState.State error = title != null ? new ItemWithState.State.Error(title) : new ItemWithState.State.Normal(null, 1, null);
        if (dateTimeParameter.getPlaceholder() == null) {
            h(dateTimeParameter);
        }
        dateTimeParameter.getSelectionType();
        return new ParameterElement.f(id2, timestamp, zIsPresentTime, error);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.search.filter.converter.ParameterElement.g s(com.avito.android.remote.model.category_parameters.base.CategoryParameter r35, com.avito.android.remote.model.category_parameters.base.CategoryParameter r36, java.lang.String r37) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.search.filter.converter.j.s(com.avito.android.remote.model.category_parameters.base.CategoryParameter, com.avito.android.remote.model.category_parameters.base.CategoryParameter, java.lang.String):com.avito.android.search.filter.converter.ParameterElement$g");
    }

    public final ParameterElement.v.a t(SelectParameter.Flat flat, SelectParameter.Flat flat2, String str, boolean z12) {
        SelectParameter.Displaying displaying = flat.getDisplaying();
        ParameterElement.DisplayType displayTypeR = displaying != null ? r(displaying) : null;
        ArrayList arrayListE = E(b(flat.getValues(), flat.getAvailableOptions()), flat.getSelectedValue());
        ArrayList arrayListE2 = E(b(flat2.getValues(), flat2.getAvailableOptions()), flat2.getSelectedValue());
        SelectParameter.Value selectedValue = flat.getSelectedValue();
        Cp0.e eVarD = selectedValue != null ? D(selectedValue, true) : null;
        SelectParameter.Value selectedValue2 = flat2.getSelectedValue();
        Cp0.e eVarD2 = selectedValue2 != null ? D(selectedValue2, true) : null;
        SelectParameter.Displaying displaying2 = flat.getDisplaying();
        TipIconParameters tipIconParameters = displaying2 != null ? displaying2.getTipIconParameters() : null;
        SelectParameter.Displaying displaying3 = flat.getDisplaying();
        String id2 = flat.getId();
        String title = str == null ? flat.getTitle() : str;
        AttributedText subtitle = flat.getSubtitle();
        AttributedText motivation = flat.getMotivation();
        c cVar = this.f262986i;
        return new ParameterElement.v.a(flat.getId(), new ParameterElement.v.b(id2, title, subtitle, cVar.d(flat), motivation, displaying3, eVarD, arrayListE, displayTypeR, d(flat), flat.getRequired(), true, true, h(flat), null, l(flat), true, tipIconParameters, null, false, 802816, null), new ParameterElement.v.b(flat2.getId(), flat2.getTitle(), flat2.getSubtitle(), cVar.d(flat2), flat2.getMotivation(), displaying3, eVarD2, arrayListE2, displayTypeR, d(flat2), flat2.getRequired(), true, true, h(flat2), null, l(flat2), true, tipIconParameters, null, false, 802816, null), z12, this.f262987j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.search.filter.converter.ParameterElement.o w(com.avito.android.remote.model.category_parameters.base.CategoryParameter r27) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.search.filter.converter.j.w(com.avito.android.remote.model.category_parameters.base.CategoryParameter):com.avito.android.search.filter.converter.ParameterElement$o");
    }

    public final ParameterElement.s y(DistrictParameter districtParameter) {
        List<District> districts;
        CustomPaddings customPaddings;
        String id2 = districtParameter.getId();
        String title = districtParameter.getTitle();
        String strD = this.f262986i.d(districtParameter);
        DisplayingOptions displayingOptions = districtParameter.getDisplayingOptions();
        ArrayList arrayList = null;
        ParameterElement.s.a aVar = (displayingOptions == null || (customPaddings = displayingOptions.getCustomPaddings()) == null) ? null : new ParameterElement.s.a(customPaddings.getTop(), customPaddings.getBottom());
        DistrictsWithRegions values = districtParameter.getValues();
        if (values != null && (districts = values.getDistricts()) != null) {
            List<District> list = districts;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            for (District district : list) {
                List<? extends District> value = districtParameter.getValue();
                arrayList.add(new Cp0.e(district.getId(), district.getF119974b(), null, value != null ? value.contains(district) : false, null, null, null, null, false, null, null, null, null, null, 16356, null));
            }
        }
        return new ParameterElement.s(id2, title, strD, arrayList == null ? C42784z0.f406748b : arrayList, null, null, null, aVar, null, d(districtParameter), false, districtParameter.getRequired(), h(districtParameter), null, false, null, null, null, null, null, this.f262987j, null, null, null, null, null, 66053488, null);
    }

    public final ParameterElement.s z(MetroParameter metroParameter) {
        CustomPaddings customPaddings;
        String id2 = metroParameter.getId();
        String title = metroParameter.getTitle();
        String strD = this.f262986i.d(metroParameter);
        DisplayingOptions displayingOptions = metroParameter.getDisplayingOptions();
        ArrayList arrayList = null;
        ParameterElement.s.a aVar = (displayingOptions == null || (customPaddings = displayingOptions.getCustomPaddings()) == null) ? null : new ParameterElement.s.a(customPaddings.getTop(), customPaddings.getBottom());
        List<Metro> values = metroParameter.getValues();
        if (values != null) {
            List<Metro> list = values;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            for (Metro metro : list) {
                List<? extends Metro> value = metroParameter.getValue();
                arrayList.add(new Cp0.e(metro.getId(), metro.getF119974b(), null, value != null ? value.contains(metro) : false, null, null, null, null, false, null, null, null, null, null, 16356, null));
            }
        }
        return new ParameterElement.s(id2, title, strD, arrayList == null ? C42784z0.f406748b : arrayList, null, null, null, aVar, null, d(metroParameter), false, metroParameter.getRequired(), h(metroParameter), null, false, null, null, null, null, null, this.f262987j, null, null, null, null, null, 66053488, null);
    }
}
