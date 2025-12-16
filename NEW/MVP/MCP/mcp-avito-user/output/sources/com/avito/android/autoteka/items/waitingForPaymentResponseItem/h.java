package com.avito.android.autoteka.items.waitingForPaymentResponseItem;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.text.Attribute;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.DeepLinkAttribute;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.remote.model.text.LinkAttribute;
import com.avito.android.util.text.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: WaitingForPaymentResponseView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/items/waitingForPaymentResponseItem/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/autoteka/items/waitingForPaymentResponseItem/g;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f97062f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f97063b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f97064c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f97065d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f97066e;

    /* compiled from: WaitingForPaymentResponseView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l<DeepLink, G0> f97067b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super DeepLink, G0> lVar) {
            this.f97067b = lVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            this.f97067b.invoke((DeepLink) obj);
        }
    }

    public h(@k View view) {
        super(view);
        this.f97063b = (TextView) this.itemView.findViewById(R.id.autoteka_waiting_for_payment_response_title);
        this.f97064c = (TextView) this.itemView.findViewById(R.id.autoteka_waiting_for_payment_response_description);
        this.f97065d = (Button) this.itemView.findViewById(R.id.autoteka_waiting_for_payment_response_go_to_help);
        this.f97066e = view.getContext();
    }

    @Override // com.avito.android.autoteka.items.waitingForPaymentResponseItem.g
    public final void b(@Y61.l String str) {
        int i12 = str != null ? 0 : 8;
        TextView textView = this.f97063b;
        textView.setVisibility(i12);
        if (str != null) {
            textView.setText(str);
        }
    }

    @Override // com.avito.android.autoteka.items.waitingForPaymentResponseItem.g
    public final void l7(@k l lVar, @Y61.l AttributedText attributedText) {
        int i12 = attributedText != null ? 0 : 8;
        TextView textView = this.f97064c;
        textView.setVisibility(i12);
        if (attributedText != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            ArrayList arrayList = new ArrayList();
            TypedValue typedValue = new TypedValue();
            this.f97066e.getTheme().resolveAttribute(R.attr.blue100, typedValue, true);
            CharSequence charSequence = typedValue.string;
            FontParameter.ColorParameter colorParameter = new FontParameter.ColorParameter(null, null, charSequence != null ? charSequence.toString() : null);
            for (Attribute attribute : attributedText.getAttributes()) {
                if (attribute instanceof LinkAttribute) {
                    LinkAttribute linkAttribute = (LinkAttribute) attribute;
                    ArrayList arrayListE0 = C42745f0.e0(colorParameter);
                    List<FontParameter> parameters = linkAttribute.getParameters();
                    if (parameters == null) {
                        parameters = C42784z0.f406748b;
                    }
                    arrayListE0.addAll(parameters);
                    G0 g02 = G0.f406611a;
                    arrayList.add(LinkAttribute.copy$default(linkAttribute, null, null, null, arrayListE0, 7, null));
                } else if (attribute instanceof DeepLinkAttribute) {
                    DeepLinkAttribute deepLinkAttribute = (DeepLinkAttribute) attribute;
                    ArrayList arrayListE02 = C42745f0.e0(colorParameter);
                    List<FontParameter> parameters2 = deepLinkAttribute.getParameters();
                    if (parameters2 == null) {
                        parameters2 = C42784z0.f406748b;
                    }
                    arrayListE02.addAll(parameters2);
                    G0 g03 = G0.f406611a;
                    arrayList.add(DeepLinkAttribute.copy$default(deepLinkAttribute, null, null, null, null, null, arrayListE02, 31, null));
                }
            }
            AttributedText attributedTextCopy$default = AttributedText.copy$default(attributedText, null, arrayList, 0, 5, null);
            j.c(textView, attributedTextCopy$default, null);
            attributedTextCopy$default.linkClicksV3().t0(new a(lVar));
        }
    }

    @Override // com.avito.android.autoteka.items.waitingForPaymentResponseItem.g
    public final void sD(@k Y41.a<G0> aVar) {
        this.f97065d.setOnClickListener(new com.avito.android.advertising.ui.buzzoola.premium.a(14, aVar));
    }
}
