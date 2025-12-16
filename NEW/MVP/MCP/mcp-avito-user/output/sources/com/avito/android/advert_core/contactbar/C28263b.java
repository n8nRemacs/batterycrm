package com.avito.android.advert_core.contactbar;

import android.content.Context;
import com.avito.android.R;
import com.avito.android.remote.model.AdvertAction;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;

/* compiled from: AdvertActionIconFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/contactbar/b;", "Lcom/avito/android/advert_core/contactbar/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert_core.contactbar.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28263b implements InterfaceC28262a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f83156a;

    public /* synthetic */ C28263b(Context context, boolean z12, int i12, C42822w c42822w) {
        this((i12 & 2) != 0 ? false : z12);
    }

    @Override // com.avito.android.advert_core.contactbar.InterfaceC28262a
    @Y61.k
    public final Q<Integer, Integer> a(@Y61.k AdvertAction advertAction) {
        boolean z12 = this.f83156a;
        Integer numValueOf = Integer.valueOf(R.color.legacy_constant_white);
        Integer numValueOf2 = null;
        if (z12) {
            if (advertAction instanceof AdvertAction.Messenger) {
                numValueOf2 = Integer.valueOf(R.drawable.ic_message_24);
            } else if (advertAction instanceof AdvertAction.Phone) {
                numValueOf2 = Integer.valueOf(R.drawable.ic_call_24);
            } else if ((advertAction instanceof AdvertAction.Access) || !(advertAction instanceof AdvertAction.FindShift)) {
                numValueOf2 = Integer.valueOf(R.drawable.ic_rouble_24);
            }
            return new Q<>(numValueOf2, numValueOf);
        }
        if (advertAction instanceof AdvertAction.Messenger) {
            numValueOf2 = Integer.valueOf(R.drawable.ic_rds_message_20);
        } else if (advertAction instanceof AdvertAction.Phone) {
            numValueOf2 = Integer.valueOf(R.drawable.common_ic_call_16);
        } else if ((advertAction instanceof AdvertAction.Access) || !(advertAction instanceof AdvertAction.FindShift)) {
            numValueOf2 = Integer.valueOf(R.drawable.ic_rds_buy_contact_20);
        }
        return new Q<>(numValueOf2, numValueOf);
    }

    public C28263b(boolean z12) {
        this.f83156a = z12;
    }
}
