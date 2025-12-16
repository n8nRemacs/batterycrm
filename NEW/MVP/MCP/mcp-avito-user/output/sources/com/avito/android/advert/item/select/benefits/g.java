package com.avito.android.advert.item.select.benefits;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.W0;
import com.avito.android.advert.item.Z0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.module.InterfaceC30174s;
import com.avito.android.remote.model.AdvertAutoSelect;
import hc.C40912b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AdvertDetailsAutoSelectItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/select/benefits/g;", "Lcom/avito/android/advert/item/select/benefits/f;", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f79352b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f79353c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public Z0 f79354d;

    /* compiled from: AdvertDetailsAutoSelectItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert/item/select/benefits/g$a;", "", "<init>", "()V", "", "AUTO_SELECT_BLOCK_COMPONENT_SLUG", "Ljava/lang/String;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public g(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k @InterfaceC30174s String str) {
        this.f79352b = str;
        this.f79353c = interfaceC28373a;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        j jVar = (j) eVar;
        AdvertAutoSelect advertAutoSelect = ((AdvertDetailsAutoSelectItem) aVar).f79342g;
        String title = advertAutoSelect.getTitle();
        if (title != null) {
            C40912b.f397290g.getClass();
            this.f79353c.c(C40912b.a.a(this.f79352b, title, "select_entrypoint"));
        }
        jVar.b(advertAutoSelect.getTitle());
        jVar.y4(advertAutoSelect.getBenefits());
        AdvertAutoSelect.AutoSelectButton button = advertAutoSelect.getButton();
        jVar.Y0(button != null ? button.getTitle() : null, new h(advertAutoSelect, this));
    }

    @Override // com.avito.android.advert.item.select.benefits.f
    public final void c0() {
        this.f79354d = null;
    }

    @Override // com.avito.android.advert.item.select.benefits.f
    public final void m(@Y61.k W0 w02) {
        this.f79354d = (Z0) w02;
    }
}
