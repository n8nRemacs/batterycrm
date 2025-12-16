package com.avito.android.profile_settings_extended.adapter.phones;

import androidx.compose.runtime.internal.P;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.text.AttributedText;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedSettingsPhonesPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/phones/i;", "Lcom/avito/android/profile_settings_extended/adapter/phones/c;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<yc0.k, G0> f229711b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final E f229712c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f229713d;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public i(@Y61.k Y41.l<? super yc0.k, G0> lVar, @Y61.k E e12, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f229711b = lVar;
        this.f229712c = e12;
        this.f229713d = interfaceC28373a;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        int i13;
        k kVar = (k) eVar;
        ExtendedSettingsPhonesItem extendedSettingsPhonesItem = (ExtendedSettingsPhonesItem) aVar;
        kVar.Jc();
        List<PhoneValue> list = extendedSettingsPhonesItem.f229682j;
        if ((list instanceof Collection) && list.isEmpty()) {
            i13 = 0;
        } else {
            Iterator<T> it = list.iterator();
            i13 = 0;
            while (it.hasNext()) {
                if (!(((PhoneValue) it.next()).f229694b.f229692e instanceof PhoneVerificationStatusNotConfirmed) && (i13 = i13 + 1) < 0) {
                    C42745f0.G0();
                    throw null;
                }
            }
        }
        if (i13 == 0) {
            kVar.XH(extendedSettingsPhonesItem, new f(this, extendedSettingsPhonesItem));
        } else if (i13 < extendedSettingsPhonesItem.f229680h) {
            kVar.Rt(extendedSettingsPhonesItem, new g(this, extendedSettingsPhonesItem));
        } else {
            kVar.OU(extendedSettingsPhonesItem);
        }
        kVar.A80(i13 > 0);
        for (PhoneValue phoneValue : list) {
            if (!(phoneValue.f229694b.f229692e instanceof PhoneVerificationStatusNotConfirmed)) {
                kVar.rC(phoneValue, new d(this), new e(this));
            }
        }
        AttributedText attributedText = extendedSettingsPhonesItem.f229677e;
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_link.e(this, 8));
        }
        kVar.xT(extendedSettingsPhonesItem.f229683k);
        kVar.d(new h(kVar, extendedSettingsPhonesItem));
    }
}
