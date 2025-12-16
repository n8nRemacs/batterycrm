package com.avito.android.advert.item.anchor_trust_factors.topbar;

import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.I1;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import r4.C47486a;

/* compiled from: AdvertDetailsTopBarAnchorsScrollResolver.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/anchor_trust_factors/topbar/e;", "Lcom/avito/android/advert/item/anchor_trust_factors/topbar/d;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f72858a;

    /* renamed from: b, reason: collision with root package name */
    public int f72859b = Integer.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public Object f72860c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public Object f72861d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public Object f72862e;

    /* renamed from: f, reason: collision with root package name */
    public int f72863f;

    /* renamed from: g, reason: collision with root package name */
    public int f72864g;

    @Inject
    public e() {
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.f72860c = c42784z0;
        this.f72861d = P0.c();
        this.f72862e = c42784z0;
        this.f72863f = BeduinInputModel.MIN_TEXT_VERSION;
        this.f72864g = BeduinInputModel.MIN_TEXT_VERSION;
    }

    @Override // com.avito.android.advert.item.anchor_trust_factors.topbar.d
    public final boolean a(int i12, @Y61.k I1 i13) {
        if (!this.f72858a) {
            return false;
        }
        Integer numD = i13.D(AdvertDetailsBlockIdKt.BLOCK_ID_ITEM_ANCHOR_TRUST_FACTORS);
        return i12 > (numD != null ? numD.intValue() : Integer.MAX_VALUE);
    }

    @Override // com.avito.android.advert.item.anchor_trust_factors.topbar.d
    @Y61.l
    public final Integer b(@Y61.k String str, @Y61.k I1 i12) {
        return i12.D(str);
    }

    @Override // com.avito.android.advert.item.anchor_trust_factors.topbar.d
    public final boolean c() {
        return !((Collection) this.f72860c).isEmpty();
    }

    @Override // com.avito.android.advert.item.anchor_trust_factors.topbar.d
    public final void d() {
        this.f72862e = C42784z0.f406748b;
    }

    @Override // com.avito.android.advert.item.anchor_trust_factors.topbar.d
    public final void e(@Y61.k C47486a c47486a) {
        this.f72858a = !c47486a.f429574a.isEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.util.Map] */
    @Override // com.avito.android.advert.item.anchor_trust_factors.topbar.d
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Set f(int r26, int r27, int r28, @Y61.k com.avito.android.advert.item.I1 r29) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.anchor_trust_factors.topbar.e.f(int, int, int, com.avito.android.advert.item.I1):java.util.Set");
    }

    @Override // com.avito.android.advert.item.anchor_trust_factors.topbar.d
    public final void g(@Y61.k C47486a c47486a, @Y61.k I1 i12) {
        Integer numD;
        Integer numD2 = i12.D(AdvertDetailsBlockIdKt.BLOCK_ID_ITEM_ANCHOR_TRUST_FACTORS);
        int iIntValue = numD2 != null ? numD2.intValue() : Integer.MAX_VALUE;
        if (iIntValue == this.f72859b) {
            return;
        }
        this.f72859b = iIntValue;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C47486a.C12352a c12352a : c47486a.f429574a) {
            String str = c12352a.f429575a;
            if (str != null && (numD = i12.D(str)) != null) {
                int iIntValue2 = numD.intValue();
                arrayList.add(Integer.valueOf(iIntValue2));
                linkedHashMap.put(Integer.valueOf(iIntValue2), c12352a.f429575a);
            }
        }
        this.f72860c = arrayList;
        Integer num = (Integer) C42745f0.G(arrayList);
        int iIntValue3 = BeduinInputModel.MIN_TEXT_VERSION;
        this.f72863f = num != null ? num.intValue() : Integer.MIN_VALUE;
        Integer num2 = (Integer) C42745f0.S(arrayList);
        if (num2 != null) {
            iIntValue3 = num2.intValue();
        }
        this.f72864g = iIntValue3;
        this.f72861d = linkedHashMap;
    }

    @Override // com.avito.android.advert.item.anchor_trust_factors.topbar.d
    public final void reset() {
        this.f72858a = false;
        this.f72859b = Integer.MAX_VALUE;
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.f72860c = c42784z0;
        this.f72863f = BeduinInputModel.MIN_TEXT_VERSION;
        this.f72864g = BeduinInputModel.MIN_TEXT_VERSION;
        this.f72861d = P0.c();
        this.f72862e = c42784z0;
    }
}
