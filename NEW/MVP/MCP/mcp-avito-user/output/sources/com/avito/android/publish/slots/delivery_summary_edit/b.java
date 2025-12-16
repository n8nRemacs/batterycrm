package com.avito.android.publish.slots.delivery_summary_edit;

import androidx.compose.runtime.internal.P;
import com.avito.android.publish.C0;
import com.avito.android.publish.InterfaceC34155z;
import com.avito.android.remote.model.category_parameters.AttributesTreeConverter;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary_edit.DeliverySummaryEditSlot;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DeliverySummaryEditMapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/delivery_summary_edit/b;", "Lcom/avito/android/publish/slots/delivery_summary_edit/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final DeliverySummaryEditSlot f243747a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CategoryParametersConverter f243748b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34155z f243749c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.details.a f243750d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C0 f243751e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final AttributesTreeConverter f243752f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final DecimalFormat f243753g;

    public b(@Y61.k DeliverySummaryEditSlot deliverySummaryEditSlot, @Y61.k CategoryParametersConverter categoryParametersConverter, @Y61.k InterfaceC34155z interfaceC34155z, @Y61.k com.avito.android.details.a aVar, @Y61.k C0 c02, @Y61.k AttributesTreeConverter attributesTreeConverter) {
        this.f243747a = deliverySummaryEditSlot;
        this.f243748b = categoryParametersConverter;
        this.f243749c = interfaceC34155z;
        this.f243750d = aVar;
        this.f243751e = c02;
        this.f243752f = attributesTreeConverter;
        Locale locale = new Locale("ru", "RU");
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setGroupingSize(3);
        decimalFormat.setDecimalFormatSymbols(new DecimalFormatSymbols(locale));
        this.f243753g = decimalFormat;
    }
}
