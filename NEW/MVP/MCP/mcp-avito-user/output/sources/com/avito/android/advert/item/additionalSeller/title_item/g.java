package com.avito.android.advert.item.additionalSeller.title_item;

import Y61.k;
import Y61.l;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdditionalSellerTitleItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/additionalSeller/title_item/g;", "Lcom/avito/android/advert/item/additionalSeller/title_item/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.advert_core.advert.k f72628b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final TextView f72629c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public y f72630d;

    /* compiled from: AdditionalSellerTitleItemView.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "link", "Lkotlin/G0;", "accept", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            g.this.f72628b.O0((DeepLink) obj, "");
        }
    }

    public g(@k View view, @k com.avito.android.advert_core.advert.k kVar) {
        super(view);
        this.f72628b = kVar;
        this.f72629c = (TextView) view.findViewById(R.id.additional_seller_title);
    }

    @Override // com.avito.android.advert.item.additionalSeller.title_item.f
    public final void e(@k AttributedText attributedText) {
        TextView textView = this.f72629c;
        if (textView != null) {
            j.a(textView, attributedText, null);
        }
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        y yVar = this.f72630d;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f72630d = (y) attributedText.linkClicksV3().t0(new a());
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        y yVar = this.f72630d;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f72630d = null;
    }
}
