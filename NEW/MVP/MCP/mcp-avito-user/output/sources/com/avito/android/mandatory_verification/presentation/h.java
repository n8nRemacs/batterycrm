package com.avito.android.mandatory_verification.presentation;

import Y41.l;
import com.avito.android.R;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MandatoryVerificationView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class h extends N implements l<ContentPlaceholder, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f184745l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(e eVar) {
        super(1);
        this.f184745l = eVar;
    }

    @Override // Y41.l
    public final G0 invoke(ContentPlaceholder contentPlaceholder) {
        ContentPlaceholder contentPlaceholder2 = contentPlaceholder;
        contentPlaceholder2.setState(new WU.a(Integer.valueOf(R.drawable.img_unknown_error_216_160), com.avito.android.printable_text.b.f(contentPlaceholder2.getContext().getString(R.string.default_network_error_title)), com.avito.android.printable_text.b.f(contentPlaceholder2.getContext().getString(R.string.default_network_error_body)), com.avito.android.printable_text.b.f(contentPlaceholder2.getContext().getString(R.string.default_network_error_action)), new com.avito.android.imv_similiar_adverts.h(this.f184745l, 25)));
        return G0.f406611a;
    }
}
