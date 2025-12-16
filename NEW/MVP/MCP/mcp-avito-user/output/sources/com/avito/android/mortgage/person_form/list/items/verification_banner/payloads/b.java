package com.avito.android.mortgage.person_form.list.items.verification_banner.payloads;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.person_form.list.items.PersonFormItem;
import com.avito.android.mortgage.person_form.list.items.verification_banner.VerificationBannerItem;
import com.avito.android.mortgage.person_form.list.items.verification_banner.payloads.a;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VerificationBannerPayloadProvider.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/verification_banner/payloads/b;", "LA00/c;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements A00.c {
    @Inject
    public b() {
    }

    @Override // A00.c
    @l
    public final Object a(@k PersonFormItem personFormItem, @k PersonFormItem personFormItem2) {
        if (!(personFormItem instanceof VerificationBannerItem) || !(personFormItem2 instanceof VerificationBannerItem)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        VerificationBannerItem verificationBannerItem = (VerificationBannerItem) personFormItem;
        VerificationBannerItem verificationBannerItem2 = (VerificationBannerItem) personFormItem2;
        String str = verificationBannerItem.f200825e;
        String str2 = verificationBannerItem2.f200825e;
        if (!L.f(str, str2)) {
            arrayList.add(new a.d(str2));
        }
        String str3 = verificationBannerItem.f200823c;
        String str4 = verificationBannerItem2.f200823c;
        if (!L.f(str3, str4)) {
            arrayList.add(new a.e(str4));
        }
        String str5 = verificationBannerItem.f200824d;
        String str6 = verificationBannerItem2.f200824d;
        if (!L.f(str5, str6)) {
            arrayList.add(new a.c(str6));
        }
        String str7 = verificationBannerItem.f200826f;
        String str8 = verificationBannerItem2.f200826f;
        boolean zF2 = L.f(str7, str8);
        boolean z12 = verificationBannerItem2.f200827g;
        if (!zF2 || verificationBannerItem.f200827g != z12) {
            arrayList.add(new a.b(str8, z12));
        }
        boolean z13 = verificationBannerItem.f200828h;
        boolean z14 = verificationBannerItem2.f200828h;
        if (z13 != z14) {
            arrayList.add(new a.C5952a(z14));
        }
        return arrayList;
    }
}
