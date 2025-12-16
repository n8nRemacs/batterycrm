package com.avito.android.services_realty_sheet;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DetailsSheetLink;
import com.avito.android.deep_linking.links.DetailsSheetLinkBody;
import com.avito.android.lib.design.bottom_sheet.d;
import com.avito.android.lib.design.button.Button;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_link.e;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.DeepLinkAttribute;
import com.avito.android.remote.model.text.FontAttribute;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.review_gallery.g;
import com.avito.android.services_realty_sheet.link.ServicesRealtySheetLink;
import com.avito.android.util.C5;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import java.text.DecimalFormat;
import java.util.Collections;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import qv0.C47453b;

/* compiled from: ServicesRealtySheet.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/services_realty_sheet/c;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_services-realty-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c extends d {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final Y41.a<G0> f280407E;

    /* renamed from: F, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f280408F;

    /* renamed from: G, reason: collision with root package name */
    @k
    public final Y41.a<G0> f280409G;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k Context context, @k ServicesRealtySheetLink servicesRealtySheetLink, @k Y41.a<G0> aVar, @k l<? super DeepLink, G0> lVar, @k Y41.a<G0> aVar2) {
        super(context, 0, 2, null);
        this.f280407E = aVar;
        this.f280408F = lVar;
        this.f280409G = aVar2;
        C47453b c47453b = new C47453b(context);
        setContentView(R.layout.services_realty_sheet);
        TextView textView = (TextView) LayoutInflater.from(context).inflate(R.layout.services_realty_sheet_header, (ViewGroup) null);
        TextView textView2 = (TextView) findViewById(R.id.priceWithMaterialsCalculation);
        TextView textView3 = (TextView) findViewById(R.id.priceMoreDescription);
        Button button = (Button) findViewById(R.id.primaryButton);
        d.I(this, true);
        H(textView);
        t();
        double d12 = servicesRealtySheetLink.f280420d;
        if (textView2 != null) {
            double d13 = servicesRealtySheetLink.f280419c;
            double d14 = d13 % 1;
            DecimalFormat decimalFormat = c47453b.f429505a;
            I5.a(textView2, context.getString(R.string.services_realty_sheet_price_with_materials_result, C5.e(String.valueOf(servicesRealtySheetLink.f280418b), (char) 160), d14 > 0.0d ? decimalFormat.format(d13) : C5.e(String.valueOf((int) d13), (char) 160), decimalFormat.format(d12), C5.e(String.valueOf(servicesRealtySheetLink.f280421e), (char) 160)), false);
        }
        String strValueOf = String.valueOf(kotlin.math.b.a((d12 % 1) * 100));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getString(R.string.services_realty_sheet_price_more_description_first_part));
        sb2.append(" {{statistic}}");
        sb2.append(context.getString(R.string.services_realty_sheet_price_more_description_second_part, strValueOf + '%'));
        String string = sb2.toString();
        String string2 = context.getString(R.string.services_realty_sheet_price_more_description_statistic);
        String string3 = context.getString(R.string.services_realty_sheet_about_statistic_title);
        AttributedText attributedText = new AttributedText("{{description}}", Collections.singletonList(new FontAttribute("description", context.getString(R.string.services_realty_sheet_about_statistic_description), com.avito.android.advert.item.delivery_suggests.l.u(null, "m10"))), 1);
        Boolean bool = Boolean.TRUE;
        AttributedText attributedText2 = new AttributedText(string, Collections.singletonList(new DeepLinkAttribute("statistic", string2, new DetailsSheetLink(new DetailsSheetLinkBody(string3, null, null, null, attributedText, null, null, null, bool, null, null, null, bool, null, null, null, null, false, null, 519918, null), null, 2, 0 == true ? 1 : 0), null, null, C42745f0.U(FontParameter.UnderlineParameter.INSTANCE, new FontParameter.ColorParameter(null, null, AvitoMapMarkerKt.AMENITY_TYPE_BLACK)), 24, null)), 1);
        attributedText2.setOnDeepLinkClickListener(new e(this, 22));
        if (textView3 != null) {
            j.a(textView3, attributedText2, null);
        }
        if (button != null) {
            button.setOnClickListener(new g(this, 28));
        }
        I5.b(textView, new b(this));
    }

    @Override // androidx.appcompat.app.A, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        this.f280409G.invoke();
        super.dismiss();
    }
}
