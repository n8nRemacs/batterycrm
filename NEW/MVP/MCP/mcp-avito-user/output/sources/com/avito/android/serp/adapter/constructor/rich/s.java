package com.avito.android.serp.adapter.constructor.rich;

import com.avito.android.analytics.event.ContactSource;
import com.avito.android.analytics.event.c1;
import com.avito.android.async_phone.InterfaceC28616b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.serp.adapter.constructor.SerpConstructorAdvertItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.avito.component.serp.PhoneLoadingState;

/* compiled from: ConstructorAdvertItemRichPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "fromGalleryAction", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class s extends N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SerpConstructorAdvertItem f269697l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z f269698m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(SerpConstructorAdvertItem serpConstructorAdvertItem, z zVar) {
        super(1);
        this.f269697l = serpConstructorAdvertItem;
        this.f269698m = zVar;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        SerpConstructorAdvertItem serpConstructorAdvertItem = this.f269697l;
        if (serpConstructorAdvertItem.getF268419Z0() == PhoneLoadingState.f430441b) {
            z zVar = this.f269698m;
            c1.f90026d.getClass();
            DeepLink deepLinkA = zVar.f269719h.a(serpConstructorAdvertItem, zBooleanValue, null, (32 & 8) != 0 ? null : null, (32 & 16) != 0 ? null : c1.a.a(serpConstructorAdvertItem), (32 & 32) != 0 ? null : null);
            if (deepLinkA != null) {
                h31.e<InterfaceC28616b> eVar = zVar.f269720i;
                if (eVar.get().N6()) {
                    zVar.f269714c.get().Sa(serpConstructorAdvertItem.getF223441b(), deepLinkA, zBooleanValue ? ContactSource.f89920e : ContactSource.f89919d);
                } else {
                    eVar.get().O6(this.f269697l, null, deepLinkA, zBooleanValue ? ContactSource.f89920e : ContactSource.f89919d, null, new r(zVar, serpConstructorAdvertItem, zBooleanValue));
                }
            }
        }
        return G0.f406611a;
    }
}
