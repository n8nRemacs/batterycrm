package com.avito.android.profile.user_profile.cards.phones;

import Ua0.InterfaceC15503a;
import Y41.l;
import Y61.k;
import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.remote.H;
import com.avito.android.remote.model.user_profile.Device;
import com.avito.android.remote.model.user_profile.Phone;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PhonesCardItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/phones/e;", "Lcom/avito/android/profile/user_profile/cards/phones/c;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC15503a, G0> f225160b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final H f225161c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super InterfaceC15503a, G0> lVar, @k H h12) {
        this.f225160b = lVar;
        this.f225161c = h12;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        int i13;
        boolean z12;
        boolean z13 = true;
        h hVar = (h) eVar;
        CardItem.PhonesCardItem phonesCardItem = (CardItem.PhonesCardItem) aVar;
        hVar.Jc();
        List<Phone> list = phonesCardItem.f224464d;
        List<Phone> list2 = list;
        boolean z14 = list2 instanceof Collection;
        if (z14 && list2.isEmpty()) {
            i13 = 0;
        } else {
            Iterator<T> it = list2.iterator();
            i13 = 0;
            while (it.hasNext()) {
                if (((Phone) it.next()).isProtected() && (i13 = i13 + 1) < 0) {
                    C42745f0.G0();
                    throw null;
                }
            }
        }
        if (i13 != 0) {
            if (i13 != 1) {
                PhoneProtectionDisclaimerStyle[] phoneProtectionDisclaimerStyleArr = PhoneProtectionDisclaimerStyle.f225152b;
            } else {
                PhoneProtectionDisclaimerStyle[] phoneProtectionDisclaimerStyleArr2 = PhoneProtectionDisclaimerStyle.f225152b;
            }
        }
        if (z14 && list2.isEmpty()) {
            z12 = false;
        } else {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (!((Phone) it2.next()).isProtected()) {
                    z12 = true;
                    break;
                }
            }
            z12 = false;
        }
        Integer num = phonesCardItem.f224466f;
        int iIntValue = num != null ? num.intValue() : list.size();
        List<Phone> listE0 = iIntValue > 3 ? C42745f0.E0(list2, 3) : list;
        PhoneProtectionDisclaimerStyle[] phoneProtectionDisclaimerStyleArr3 = PhoneProtectionDisclaimerStyle.f225152b;
        hVar.q10();
        int size = listE0.size();
        List<Device> list3 = phonesCardItem.f224465e;
        List<Device> listE02 = (size == 3 || list3.isEmpty()) ? C42784z0.f406748b : (listE0.isEmpty() || list3.size() <= 3 - listE0.size()) ? list3 : C42745f0.E0(list3, 3 - listE0.size());
        for (Phone phone : listE0) {
            boolean z15 = (phone.isProtected() && z12) ? z13 : false;
            String phone2 = phone.getPhone();
            boolean verified = phone.getVerified();
            phone.isLocked();
            Boolean verificationInProgress = phone.getVerificationInProgress();
            hVar.HY(phone2, verified, z15, Boolean.valueOf(verificationInProgress != null ? verificationInProgress.booleanValue() : false));
            z13 = true;
        }
        for (Device device : listE02) {
            hVar.JC(device.getName(), L.f(device.getId(), this.f225161c.getValue()));
        }
        if (list3.size() + iIntValue > 3) {
            hVar.zh(list.size() - listE0.size(), list3.size() - listE02.size());
        }
        hVar.Q(new d(this, phonesCardItem));
    }
}
