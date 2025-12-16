package com.avito.android.serp.adapter.rich_snippets.regular;

import com.avito.android.analytics.event.ContactSource;
import com.avito.android.async_phone.InterfaceC28616b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.serp.adapter.AdvertItem;
import kotlin.G0;
import kotlin.Metadata;
import ru.avito.component.serp.PhoneLoadingState;

/* compiled from: AdvertRichItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "fromGalleryAction", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.serp.adapter.rich_snippets.regular.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34792o extends kotlin.jvm.internal.N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f271195l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C34797u f271196m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f271197n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC34800x f271198o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34792o(AdvertItem advertItem, C34797u c34797u, AdvertItem advertItem2, InterfaceC34800x interfaceC34800x) {
        super(1);
        this.f271195l = advertItem;
        this.f271196m = c34797u;
        this.f271197n = advertItem2;
        this.f271198o = interfaceC34800x;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        AdvertItem advertItem = this.f271195l;
        if (advertItem.f268419Z0 == PhoneLoadingState.f430441b) {
            C34797u c34797u = this.f271196m;
            DeepLink deepLinkA = c34797u.f271219j.a(advertItem, zBooleanValue, advertItem.f268455p0, (32 & 8) != 0 ? null : null, (32 & 16) != 0 ? null : null, (32 & 32) != 0 ? null : null);
            if (deepLinkA != null) {
                h31.e<InterfaceC28616b> eVar = c34797u.f271215f;
                boolean zN6 = eVar.get().N6();
                AdvertItem advertItem2 = this.f271197n;
                if (zN6) {
                    c34797u.f271212c.get().Sa(advertItem2.f268425c, deepLinkA, zBooleanValue ? ContactSource.f89920e : ContactSource.f89919d);
                } else {
                    eVar.get().O6(this.f271195l, this.f271198o, deepLinkA, zBooleanValue ? ContactSource.f89920e : ContactSource.f89919d, null, new C34791n(c34797u, advertItem2, zBooleanValue));
                }
            }
        }
        return G0.f406611a;
    }
}
