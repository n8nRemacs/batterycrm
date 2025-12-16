package com.avito.android.developments_agency_search.screen.big_filters.converter;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.Quarter;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.DateTimeParameter;
import com.avito.android.remote.model.category_parameters.DisplayingOptions;
import com.avito.android.remote.model.category_parameters.DistrictParameter;
import com.avito.android.remote.model.category_parameters.EditCategoryParameter;
import com.avito.android.remote.model.category_parameters.EmailParameter;
import com.avito.android.remote.model.category_parameters.FormatterType;
import com.avito.android.remote.model.category_parameters.IntParameter;
import com.avito.android.remote.model.category_parameters.MetroParameter;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.remote.model.category_parameters.NumericParameter;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import com.avito.android.remote.model.category_parameters.ParamButton;
import com.avito.android.remote.model.category_parameters.PhoneParameter;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import com.avito.android.remote.model.category_parameters.PriceParameter;
import com.avito.android.remote.model.category_parameters.RadiusParameter;
import com.avito.android.remote.model.category_parameters.SectionedMultiselectParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.CategoryParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.HasPlaceholder;
import com.avito.android.remote.model.category_parameters.base.TextParameter;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.search.filter.converter.ParameterElement;
import com.avito.android.search.filter.converter.common.ItemWithAdditionalButton;
import hJ.g;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import shark.AndroidResourceIdNames;

/* compiled from: CategoryParametersElementConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/big_filters/converter/e;", "", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final g f136580a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final hJ.e f136581b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final d f136582c;

    /* compiled from: CategoryParametersElementConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f136583a;

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
            f136583a = iArr;
        }
    }

    public e(@k g gVar, @k hJ.e eVar, @k Resources resources) {
        this.f136580a = gVar;
        this.f136581b = eVar;
        this.f136582c = new d(resources);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DisplayingOptions b(CategoryParameter categoryParameter) {
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
            if (categoryParameter instanceof DistrictParameter) {
                return ((DistrictParameter) categoryParameter).getDisplayingOptions();
            }
            if (categoryParameter instanceof IntParameter) {
                return ((IntParameter) categoryParameter).getDisplayingOptions();
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static com.avito.android.lib.design.input.FormatterType d(CategoryParameter categoryParameter, int i12) {
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
    public static int e(com.avito.android.remote.model.category_parameters.base.CategoryParameter r2) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.screen.big_filters.converter.e.e(com.avito.android.remote.model.category_parameters.base.CategoryParameter):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    public static ParameterElement.DisplayType.Chips.Style f(String str) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public static String g(CategoryParameter categoryParameter) {
        String placeholder;
        SectionedMultiselectParameter.Displaying displaying;
        if (!(categoryParameter instanceof HasPlaceholder)) {
            return null;
        }
        DisplayingOptions displayingOptionsB = b(categoryParameter);
        if ((displayingOptionsB != null && (placeholder = displayingOptionsB.getPlaceholder()) != null) || (placeholder = ((HasPlaceholder) categoryParameter).getPlaceholder()) != null) {
            return placeholder;
        }
        if (!(categoryParameter instanceof SelectParameter ? true : categoryParameter instanceof MultiselectParameter ? true : categoryParameter instanceof SectionedMultiselectParameter)) {
            if (categoryParameter instanceof AddressParameter) {
                return "Укажите место";
            }
            if (categoryParameter instanceof PhoneParameter) {
                return "Введите номер телефона";
            }
            if (categoryParameter instanceof PriceParameter) {
                StringBuilder sb2 = new StringBuilder("Цена, ");
                DisplayingOptions displayingOptions = ((PriceParameter) categoryParameter).getDisplayingOptions();
                sb2.append(displayingOptions != null ? displayingOptions.getPostfix() : null);
                return sb2.toString();
            }
            if (categoryParameter instanceof TextParameter) {
                return "Введите значение";
            }
            if (categoryParameter instanceof DateTimeParameter) {
                return "Указать";
            }
            return null;
        }
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
        return placeholder == null ? "Выбрать" : placeholder;
    }

    public static int h(CategoryParameter categoryParameter) {
        if (categoryParameter instanceof NumericParameter) {
            return 8194;
        }
        if (!(categoryParameter instanceof IntParameter ? true : categoryParameter instanceof PriceParameter)) {
            if (categoryParameter instanceof EmailParameter) {
                return 32;
            }
            if (categoryParameter instanceof CharParameter) {
                int i12 = a.f136583a[((CharParameter) categoryParameter).getInputType().ordinal()];
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

    public static AttributedText i(CategoryParameter categoryParameter) {
        if (categoryParameter instanceof TextParameter) {
            return categoryParameter.getMotivation();
        }
        if (categoryParameter instanceof PhoneParameter) {
            return ((PhoneParameter) categoryParameter).getMotivation();
        }
        return null;
    }

    public static boolean j(CategoryParameter categoryParameter) {
        MultiselectParameter.Displaying displaying;
        SelectParameter.Displaying displaying2;
        DisplayingOptions displayingOptionsB = b(categoryParameter);
        if (displayingOptionsB != null && displayingOptionsB.getHideTitle()) {
            return true;
        }
        SelectParameter selectParameter = categoryParameter instanceof SelectParameter ? (SelectParameter) categoryParameter : null;
        if (selectParameter != null && (displaying2 = selectParameter.getDisplaying()) != null && displaying2.getHideTitle().booleanValue()) {
            return true;
        }
        MultiselectParameter multiselectParameter = categoryParameter instanceof MultiselectParameter ? (MultiselectParameter) categoryParameter : null;
        return (multiselectParameter == null || (displaying = multiselectParameter.getDisplaying()) == null) ? false : L.f(displaying.getHideTitle(), Boolean.TRUE);
    }

    public static ItemWithAdditionalButton.AdditionalButton l(ParamButton paramButton, String str) {
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

    public static Cp0.e m(Quarter quarter, boolean z12) {
        return new Cp0.e(quarter.getId(), quarter.getTitle(), null, z12, null, null, null, null, false, null, null, null, quarter.getFromInt(), quarter.getToInt(), 4084, null);
    }

    public static Cp0.e n(SelectParameter.Value value, boolean z12) {
        SelectParameter.Value.Widget.Config config;
        SelectParameter.Value.Widget.Config.Hint hint;
        Color color;
        String id2 = value.getId();
        String title = value.getTitle();
        SelectParameter.Value.Display display = value.getDisplay();
        Integer numValueOf = (display == null || (color = display.getColor()) == null) ? null : Integer.valueOf(color.getValue());
        SelectParameter.Value.Display display2 = value.getDisplay();
        String icon = display2 != null ? display2.getIcon() : null;
        SelectParameter.Value.Widget widget = value.getWidget();
        return new Cp0.e(id2, title, null, z12, numValueOf, (widget == null || (config = widget.getConfig()) == null || (hint = config.getHint()) == null) ? null : hint.getDeepLink(), icon, null, value.getIsDisabled(), null, null, null, null, null, 16004, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0479, code lost:
    
        r9.add(r13);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0640 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x07fb A[PHI: r4
  0x07fb: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:404:0x07b2, B:406:0x07c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0166  */
    /* JADX WARN: Type inference failed for: r10v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r32v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r32v11 */
    /* JADX WARN: Type inference failed for: r32v9 */
    /* JADX WARN: Type inference failed for: r3v76, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v81, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.avito.android.remote.model.category_parameters.base.BaseParameter, com.avito.android.remote.model.category_parameters.base.CategoryParameter, com.avito.android.remote.model.category_parameters.base.ParameterSlot] */
    /* JADX WARN: Type inference failed for: r71v0, types: [com.avito.android.developments_agency_search.screen.big_filters.converter.e] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.avito.android.developments_agency_search.screen.big_filters.converter.d] */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.util.ArrayList] */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList a(@Y61.k UV0.b r72) {
        /*
            Method dump skipped, instructions count: 2522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.screen.big_filters.converter.e.a(UV0.b):java.util.ArrayList");
    }

    @l
    public final String c(@k CategoryParameter categoryParameter) {
        if ((categoryParameter instanceof EditCategoryParameter) && ((EditCategoryParameter) categoryParameter).hasError()) {
            return categoryParameter.getTitle();
        }
        if (!(categoryParameter instanceof EditableParameter)) {
            return null;
        }
        EditableParameter editableParameter = (EditableParameter) categoryParameter;
        if (editableParameter.hasError()) {
            return editableParameter.hasValue() ? this.f136582c.a(categoryParameter) : categoryParameter.getTitle();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.search.filter.converter.ParameterElement.o k(com.avito.android.remote.model.category_parameters.base.CategoryParameter r27) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.screen.big_filters.converter.e.k(com.avito.android.remote.model.category_parameters.base.CategoryParameter):com.avito.android.search.filter.converter.ParameterElement$o");
    }
}
