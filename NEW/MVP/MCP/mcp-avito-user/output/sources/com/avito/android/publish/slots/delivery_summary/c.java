package com.avito.android.publish.slots.delivery_summary;

import androidx.compose.runtime.internal.P;
import com.avito.android.publish.InterfaceC34155z;
import com.avito.android.remote.model.category_parameters.AttributesTreeConverter;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary.DeliverySummarySlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary.DetailsBottomSheetAction;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary.DetailsBottomSheetDescription;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary.DetailsHelpContent;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary.FeeBlock;
import com.avito.android.remote.model.text.AttributedText;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: DeliverySummaryMapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/delivery_summary/c;", "Lcom/avito/android/publish/slots/delivery_summary/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final DeliverySummarySlot f243558a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CategoryParametersConverter f243559b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34155z f243560c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.details.a f243561d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final AttributesTreeConverter f243562e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Locale f243563f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final DecimalFormat f243564g;

    public c(@Y61.k DeliverySummarySlot deliverySummarySlot, @Y61.k CategoryParametersConverter categoryParametersConverter, @Y61.k InterfaceC34155z interfaceC34155z, @Y61.k com.avito.android.details.a aVar, @Y61.k AttributesTreeConverter attributesTreeConverter) {
        this.f243558a = deliverySummarySlot;
        this.f243559b = categoryParametersConverter;
        this.f243560c = interfaceC34155z;
        this.f243561d = aVar;
        this.f243562e = attributesTreeConverter;
        Locale locale = new Locale("ru", "RU");
        this.f243563f = locale;
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setGroupingSize(3);
        decimalFormat.setDecimalFormatSymbols(new DecimalFormatSymbols(locale));
        this.f243564g = decimalFormat;
    }

    public static hf0.e c(FeeBlock feeBlock) {
        DetailsBottomSheetAction action;
        DetailsBottomSheetAction action2;
        DetailsBottomSheetDescription description;
        String label = null;
        if (feeBlock.getHelpContent() == null || !L.f(feeBlock.getWithHelpIcon(), Boolean.TRUE)) {
            return null;
        }
        DetailsHelpContent helpContent = feeBlock.getHelpContent();
        String text = (helpContent == null || (description = helpContent.getDescription()) == null) ? null : description.getText();
        DetailsHelpContent helpContent2 = feeBlock.getHelpContent();
        String url = (helpContent2 == null || (action2 = helpContent2.getAction()) == null) ? null : action2.getUrl();
        DetailsHelpContent helpContent3 = feeBlock.getHelpContent();
        if (helpContent3 != null && (action = helpContent3.getAction()) != null) {
            label = action.getLabel();
        }
        return new hf0.e(text, url, label);
    }

    public static AttributedText d(String str) {
        return new AttributedText(str, C42784z0.f406748b, 0, 4, null);
    }

    public final String a(Long l12, String str) {
        if (l12 == null || str == null) {
            return null;
        }
        return C43066x.a0(str, "%price", this.f243564g.format(l12.longValue()), false);
    }

    public final boolean b() {
        Boolean value;
        CategoryParameters categoryParametersC0 = this.f243561d.C0();
        ParameterSlot parameterSlotFindParameter = categoryParametersC0 != null ? categoryParametersC0.findParameter("deliveryPvz") : null;
        BooleanParameter booleanParameter = parameterSlotFindParameter instanceof BooleanParameter ? (BooleanParameter) parameterSlotFindParameter : null;
        if (booleanParameter == null || (value = booleanParameter.getValue()) == null) {
            return false;
        }
        return value.booleanValue();
    }
}
