package com.avito.android.comfortable_deal.deal.item.completion;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.image_loader.n;
import com.avito.android.lib.design.gradient.AvitoLinearGradientDrawable;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import np.C44460a;

/* compiled from: CompletionView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/completion/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/comfortable_deal/deal/item/completion/g;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    public final Context f121353b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Y41.l<? super DeepLink, G0> f121354c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ImageView f121355d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final LinearLayout f121356e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f121357f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f121358g;

    /* compiled from: CompletionView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<DeepLink, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            DeepLink deepLink2 = deepLink;
            Y41.l<? super DeepLink, G0> lVar = h.this.f121354c;
            if (lVar != null) {
                lVar.invoke(deepLink2);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CompletionView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<DeepLink, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            DeepLink deepLink2 = deepLink;
            Y41.l<? super DeepLink, G0> lVar = h.this.f121354c;
            if (lVar != null) {
                lVar.invoke(deepLink2);
            }
            return G0.f406611a;
        }
    }

    public h(@k View view) {
        super(view);
        this.f121353b = view.getContext();
        View viewFindViewById = view.findViewById(R.id.completion_image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f121355d = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.completion_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f121356e = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.completion_title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById3;
        this.f121357f = textView;
        View viewFindViewById4 = view.findViewById(R.id.completion_description);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView2 = (TextView) viewFindViewById4;
        this.f121358g = textView2;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.comfortable_deal.deal.item.completion.g
    public final void e(@k AttributedText attributedText) {
        j.a(this.f121357f, C44460a.a(new b(), attributedText), null);
    }

    @Override // com.avito.android.comfortable_deal.deal.item.completion.g
    public final void g(@k AttributedText attributedText) {
        j.a(this.f121358g, C44460a.a(new a(), attributedText), null);
    }

    @Override // com.avito.android.comfortable_deal.deal.item.completion.g
    public final void hd(@k String str) {
        AvitoLinearGradientDrawable avitoLinearGradientDrawable;
        Integer numH = com.avito.android.lib.util.f.h(str);
        if (numH != null) {
            int iIntValue = numH.intValue();
            int iB2 = y6.b(20);
            AvitoLinearGradientDrawable.a.C5275a c5275a = new AvitoLinearGradientDrawable.a.C5275a(this.f121353b, iIntValue, 0, 4, null);
            c5275a.f179264a = iB2;
            avitoLinearGradientDrawable = new AvitoLinearGradientDrawable(c5275a.a());
        } else {
            avitoLinearGradientDrawable = null;
        }
        this.f121356e.setBackground(avitoLinearGradientDrawable);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f121354c = null;
    }

    @Override // com.avito.android.comfortable_deal.deal.item.completion.g
    public final void l(@k Image image) {
        com.avito.android.image_loader.glide.utils.b.d(this.f121355d, n.a(image));
    }

    @Override // com.avito.android.comfortable_deal.deal.item.completion.g
    public final void oq(@k Y41.l<? super DeepLink, G0> lVar) {
        this.f121354c = lVar;
    }
}
