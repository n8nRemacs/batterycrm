package com.avito.android.beduin.common.component.payment_webview;

import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinWebPaymentView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class n extends N implements Y41.l<ContentPlaceholder, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f101887l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(m mVar) {
        super(1);
        this.f101887l = mVar;
    }

    @Override // Y41.l
    public final G0 invoke(ContentPlaceholder contentPlaceholder) throws Resources.NotFoundException {
        ContentPlaceholder contentPlaceholder2 = contentPlaceholder;
        contentPlaceholder2.setAppearance(R.style.WebPayment_Overlay);
        contentPlaceholder2.setTitle(null);
        contentPlaceholder2.setImageDrawable(null);
        contentPlaceholder2.setSubtitle(contentPlaceholder2.getContext().getResources().getText(R.string.beduin_webpayment_loading_error_message));
        contentPlaceholder2.setButtonTitle(contentPlaceholder2.getContext().getResources().getText(R.string.beduin_webpayment_loading_error_button));
        contentPlaceholder2.setButtonOnClickListener(new i(this.f101887l, 1));
        return G0.f406611a;
    }
}
