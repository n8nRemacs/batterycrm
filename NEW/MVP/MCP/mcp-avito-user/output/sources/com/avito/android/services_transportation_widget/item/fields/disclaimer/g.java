package com.avito.android.services_transportation_widget.item.fields.disclaimer;

import Y61.k;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.util.q;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.services_transportation_widget.item.l;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ServicesTransportationWidgetDisclaimerView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/services_transportation_widget/item/fields/disclaimer/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/services_transportation_widget/item/fields/disclaimer/f;", "a", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: c, reason: collision with root package name */
    public static final int f280565c;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f280566b;

    /* compiled from: ServicesTransportationWidgetDisclaimerView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/services_transportation_widget/item/fields/disclaimer/g$a;", "", "<init>", "()V", "", "DEFAULT_ICON_PADDING", "I", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ServicesTransportationWidgetDisclaimerView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ServicesTransportationWidgetDisclaimerItem f280567l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l f280568m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ServicesTransportationWidgetDisclaimerItem servicesTransportationWidgetDisclaimerItem, l lVar) {
            super(0);
            this.f280567l = servicesTransportationWidgetDisclaimerItem;
            this.f280568m = lVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            ServicesTransportationWidgetDisclaimerItem servicesTransportationWidgetDisclaimerItem = this.f280567l;
            ServiceTransportationWidget.DisclaimerField.DisclaimerLink disclaimerLink = servicesTransportationWidgetDisclaimerItem.f280554b.getDisclaimerLink();
            DeepLink uri = disclaimerLink != null ? disclaimerLink.getUri() : null;
            l lVar = this.f280568m;
            if (uri != null) {
                lVar.d1(uri);
            } else {
                lVar.f1(servicesTransportationWidgetDisclaimerItem.f280554b);
            }
            return G0.f406611a;
        }
    }

    static {
        new a(null);
        f280565c = y6.b(4);
    }

    public g(@k TextView textView) {
        super(textView);
        this.f280566b = textView;
    }

    @Override // com.avito.android.services_transportation_widget.item.fields.disclaimer.f
    public final void Kr(@k ServicesTransportationWidgetDisclaimerItem servicesTransportationWidgetDisclaimerItem, @k l lVar) {
        ServiceTransportationWidget.DisclaimerField disclaimerField = servicesTransportationWidgetDisclaimerItem.f280554b;
        CharSequence displayTitle = disclaimerField.getDisplayTitle();
        b bVar = new b(servicesTransportationWidgetDisclaimerItem, lVar);
        String disclaimerIcon = disclaimerField.getDisclaimerIcon();
        Integer numA = disclaimerIcon != null ? q.a(disclaimerIcon) : null;
        String disclaimerIcon2 = disclaimerField.getDisclaimerIcon();
        Integer numM = disclaimerIcon2 != null ? com.avito.android.lib.util.f.m(disclaimerIcon2) : null;
        int i12 = f280565c;
        TextView textView = this.f280566b;
        if (numA != null) {
            int iIntValue = numA.intValue();
            I5.a(textView, displayTitle, false);
            I5.d(textView, null, C35835l0.h(iIntValue, textView.getContext()), 11);
            I5.b(textView, bVar);
            textView.setCompoundDrawablePadding(i12);
            return;
        }
        if (numM == null) {
            I5.d(textView, null, null, 11);
            return;
        }
        int iIntValue2 = numM.intValue();
        I5.d(textView, null, null, 11);
        textView.setOnTouchListener(null);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        FV.a aVar = FV.a.f4720a;
        Context context = textView.getContext();
        aVar.getClass();
        String strN = com.avito.android.lib.util.f.n(iIntValue2, context);
        if (strN != null) {
            displayTitle = FV.a.d(displayTitle, strN, i12, bVar);
        }
        I5.a(textView, displayTitle, false);
    }
}
