package com.avito.android.sx_address.address_video_verification.view;

import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SxAddressVideoVerificationView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class k extends N implements Y41.l<ContentPlaceholder, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f292759l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(d dVar) {
        super(1);
        this.f292759l = dVar;
    }

    @Override // Y41.l
    public final G0 invoke(ContentPlaceholder contentPlaceholder) {
        ContentPlaceholder contentPlaceholder2 = contentPlaceholder;
        d dVar = this.f292759l;
        contentPlaceholder2.setImageResource(Integer.valueOf(dVar.getF292740i()));
        contentPlaceholder2.setTitle(dVar.getF292741j());
        contentPlaceholder2.setSubtitle(dVar.getF292742k());
        contentPlaceholder2.setButtonTitle(dVar.getF292743l());
        return G0.f406611a;
    }
}
