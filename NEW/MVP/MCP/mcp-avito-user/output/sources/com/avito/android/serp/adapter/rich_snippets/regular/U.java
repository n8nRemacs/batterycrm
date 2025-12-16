package com.avito.android.serp.adapter.rich_snippets.regular;

import com.avito.android.analytics.event.ContactSource;
import com.avito.android.async_phone.InterfaceC28616b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.serp.adapter.advert_xl.AdvertXlItem;
import kotlin.G0;
import kotlin.Metadata;
import ru.avito.component.serp.PhoneLoadingState;

/* compiled from: AdvertXlRichItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "fromGalleryAction", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class U extends kotlin.jvm.internal.N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertXlItem f271096l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z f271097m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AdvertXlItem f271098n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC34800x f271099o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(AdvertXlItem advertXlItem, AdvertXlItem advertXlItem2, InterfaceC34800x interfaceC34800x, Z z12) {
        super(1);
        this.f271096l = advertXlItem;
        this.f271097m = z12;
        this.f271098n = advertXlItem2;
        this.f271099o = interfaceC34800x;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        AdvertXlItem advertXlItem = this.f271096l;
        if (advertXlItem.f268802o0 == PhoneLoadingState.f430441b) {
            Z z12 = this.f271097m;
            DeepLink deepLinkA = z12.f271117k.a(advertXlItem, zBooleanValue, advertXlItem.f268774a0, (32 & 8) != 0 ? null : null, (32 & 16) != 0 ? null : null, (32 & 32) != 0 ? null : null);
            if (deepLinkA != null) {
                h31.e<InterfaceC28616b> eVar = z12.f271113g;
                boolean zN6 = eVar.get().N6();
                AdvertXlItem advertXlItem2 = this.f271098n;
                if (zN6) {
                    z12.f271108b.get().Sa(advertXlItem2.f268777c, deepLinkA, zBooleanValue ? ContactSource.f89922g : ContactSource.f89921f);
                } else {
                    eVar.get().O6(this.f271096l, this.f271099o, deepLinkA, zBooleanValue ? ContactSource.f89922g : ContactSource.f89921f, null, new T(z12, advertXlItem2, zBooleanValue));
                }
            }
        }
        return G0.f406611a;
    }
}
