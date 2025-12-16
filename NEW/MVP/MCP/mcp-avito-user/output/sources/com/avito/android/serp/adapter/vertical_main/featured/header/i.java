package com.avito.android.serp.adapter.vertical_main.featured.header;

import Y41.l;
import Y61.k;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage.document_upload.B;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.header.HeaderWidget;
import com.avito.android.util.text.j;
import java.util.Collections;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import rn0.InterfaceC47690b;
import rn0.InterfaceC47691c;

/* compiled from: FeaturedHeaderView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/featured/header/i;", "Lcom/avito/android/serp/c;", "Lcom/avito/android/serp/adapter/vertical_main/featured/header/h;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i extends com.avito.android.serp.c implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f272869b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC47690b> f272870c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final HeaderWidget f272871d;

    /* compiled from: FeaturedHeaderView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<DeepLink, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            InterfaceC47691c.a.a(i.this.f272870c.get(), deepLink, null, 14);
            return G0.f406611a;
        }
    }

    public i(@k View view, @k com.avito.android.util.text.a aVar, @k h31.e<InterfaceC47690b> eVar) {
        super(view);
        this.f272869b = aVar;
        this.f272870c = eVar;
        this.f272871d = (HeaderWidget) view.findViewById(R.id.header);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.featured.header.h
    public final void NB(@Y61.l AttributedText attributedText, @k String str, @Y61.l String str2) {
        HeaderWidget headerWidget = this.f272871d;
        if (attributedText == null) {
            headerWidget.a(R.style.Re23_Text_H25, str, str2 != null ? Collections.singletonList(str2) : null);
            return;
        }
        a aVar = new a();
        headerWidget.removeAllViews();
        com.avito.android.lib.design.text_view.a aVar2 = new com.avito.android.lib.design.text_view.a(headerWidget.getContext(), null, 0, 0, 14, null);
        aVar2.setTextAppearance(R.style.Re23_Text_H25);
        aVar2.setText(str);
        headerWidget.addView(aVar2);
        ((LinearLayout.LayoutParams) aVar2.getLayoutParams()).bottomMargin = headerWidget.f270134b;
        com.avito.android.lib.design.text_view.a aVar3 = new com.avito.android.lib.design.text_view.a(headerWidget.getContext(), null, 0, 0, 14, null);
        aVar3.setTextAppearance(headerWidget.f270136d);
        j.a(aVar3, attributedText, this.f272869b);
        attributedText.setOnDeepLinkClickListener(new B(11, aVar));
        headerWidget.addView(aVar3);
    }
}
