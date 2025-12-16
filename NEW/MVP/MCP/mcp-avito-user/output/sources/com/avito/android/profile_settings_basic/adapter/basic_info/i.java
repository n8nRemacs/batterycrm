package com.avito.android.profile_settings_basic.adapter.basic_info;

import Hb0.InterfaceC13947a;
import Qb0.InterfaceC14878a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.profile_settings_basic.adapter.basic_info.BasicInfoItem;
import java.util.LinkedHashSet;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import vy.C49397d;

/* compiled from: BasicInfoItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_basic/adapter/basic_info/i;", "Lcom/avito/android/profile_settings_basic/adapter/basic_info/c;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC14878a, G0> f228625b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13947a f228626c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f228627d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f228628e = new LinkedHashSet();

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public i(@Y61.k Y41.l<? super InterfaceC14878a, G0> lVar, @Y61.k InterfaceC13947a interfaceC13947a, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f228625b = lVar;
        this.f228626c = interfaceC13947a;
        this.f228627d = interfaceC28373a;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        BasicInfoItem basicInfoItem = (BasicInfoItem) aVar;
        ((m) eVar).dD(basicInfoItem, new d(this, basicInfoItem), new e(this, basicInfoItem), new f(this), new g(this), new h(this));
        for (BasicInfoItem.TextField textField : basicInfoItem.f228592l) {
            if (L.f(textField.f228602b, "services_profile_type")) {
                LinkedHashSet linkedHashSet = this.f228628e;
                String str = textField.f228602b;
                if (!linkedHashSet.contains(str)) {
                    linkedHashSet.add(str);
                    this.f228627d.c(new C49397d(textField.f228605e, textField.f228603c));
                }
            }
        }
    }
}
