package com.avito.android.advert_core.auto_select_parameters_v2.advantage;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.module.InterfaceC30174s;
import com.avito.android.util.C35755b0;
import com.avito.android.util.Kundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import l9.InterfaceC43602b;

/* compiled from: AutoSelectExpandableAdvantagePresenter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/auto_select_parameters_v2/advantage/d;", "Lcom/avito/android/advert_core/auto_select_parameters_v2/advantage/c;", "a", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f82961b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC28373a f82962c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f82963d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final LinkedHashMap f82964e;

    /* compiled from: AutoSelectExpandableAdvantagePresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert_core/auto_select_parameters_v2/advantage/d$a;", "", "<init>", "()V", "", "EXPANDED_ADVANTAGES_IDS_KEY", "Ljava/lang/String;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public d(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @l @InterfaceC43602b.a Kundle kundle, @k InterfaceC28373a interfaceC28373a, @k @InterfaceC30174s String str) {
        LinkedHashMap linkedHashMap;
        ArrayList<String> stringArrayList;
        this.f82961b = aVar;
        this.f82962c = interfaceC28373a;
        this.f82963d = str;
        if (kundle == null || (stringArrayList = kundle.f318647b.getStringArrayList("expanded_advantages_ids_key")) == null) {
            linkedHashMap = new LinkedHashMap();
        } else {
            ArrayList arrayList = new ArrayList();
            for (String str2 : stringArrayList) {
                Q q12 = str2 != null ? new Q(str2, Boolean.FALSE) : null;
                if (q12 != null) {
                    arrayList.add(q12);
                }
            }
            linkedHashMap = new LinkedHashMap();
            P0.m(linkedHashMap, arrayList);
        }
        this.f82964e = linkedHashMap;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        AutoSelectExpandableAdvantageItem autoSelectExpandableAdvantageItem = (AutoSelectExpandableAdvantageItem) aVar;
        Boolean bool = Boolean.TRUE;
        hVar.y5(((Boolean) this.f82964e.getOrDefault(autoSelectExpandableAdvantageItem.f82954f, bool)).booleanValue());
        String str = autoSelectExpandableAdvantageItem.f82950b;
        if (str != null) {
            hVar.Z(str);
        }
        hVar.setTitle(autoSelectExpandableAdvantageItem.f82951c);
        hVar.Lq(new e(this), autoSelectExpandableAdvantageItem.f82952d);
        hVar.QH(new f(this, autoSelectExpandableAdvantageItem, hVar));
    }

    @Override // com.avito.android.advert_core.auto_select_parameters_v2.advantage.c
    @k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : this.f82964e.entrySet()) {
            if (!((Boolean) entry.getValue()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        List listM0 = C42745f0.M0(linkedHashMap.keySet());
        Bundle bundle = kundle.f318647b;
        if (listM0 == null) {
            bundle.remove("expanded_advantages_ids_key");
        } else {
            bundle.putStringArrayList("expanded_advantages_ids_key", C35755b0.a(listM0));
        }
        return kundle;
    }
}
