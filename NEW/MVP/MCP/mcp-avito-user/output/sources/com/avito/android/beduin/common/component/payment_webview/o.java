package com.avito.android.beduin.common.component.payment_webview;

import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.beduin.common.component.payment_webview.BeduinWebPaymentModel;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinWebPaymentView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class o extends N implements Y41.l<ContentPlaceholder, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BeduinWebPaymentModel.ErrorPlaceholder f101888l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m f101889m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(BeduinWebPaymentModel.ErrorPlaceholder errorPlaceholder, m mVar) {
        super(1);
        this.f101888l = errorPlaceholder;
        this.f101889m = mVar;
    }

    @Override // Y41.l
    public final G0 invoke(ContentPlaceholder contentPlaceholder) throws Resources.NotFoundException {
        ContentPlaceholder contentPlaceholder2 = contentPlaceholder;
        contentPlaceholder2.setAppearance(R.style.WebPayment_Overlay);
        BeduinWebPaymentModel.ErrorPlaceholder errorPlaceholder = this.f101888l;
        contentPlaceholder2.setTitle(errorPlaceholder.getTitle());
        contentPlaceholder2.setImageDrawable(null);
        contentPlaceholder2.setSubtitle(errorPlaceholder.getSubtitle());
        contentPlaceholder2.setButtonTitle(errorPlaceholder.getButtonTitle());
        contentPlaceholder2.setButtonOnClickListener(new j(this.f101889m, errorPlaceholder, 1));
        return G0.f406611a;
    }
}
