package com.avito.android.auto_select.contact_me;

import com.avito.android.auto_select.contact_me.model.AutoSelectContactMeContact;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutoSelectContactMeScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/text_view/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/text_view/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class j extends N implements Y41.l<com.avito.android.lib.design.text_view.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AutoSelectContactMeContact f95974l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f95975m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Y41.l lVar, AutoSelectContactMeContact autoSelectContactMeContact) {
        super(1);
        this.f95974l = autoSelectContactMeContact;
        this.f95975m = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.text_view.a aVar) {
        this.f95974l.f95992c.setOnDeepLinkClickListener(new SE0.a(12, this.f95975m));
        return G0.f406611a;
    }
}
