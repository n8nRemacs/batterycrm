package com.avito.android.profile_phones.phones_list;

import android.content.Context;
import android.content.Intent;
import com.avito.android.N1;
import com.avito.android.profile_phones.phones_list.PhonesListFragment;
import i.AbstractC41201a;
import kotlin.G0;
import kotlin.Metadata;
import wb0.InterfaceC49590a;

/* compiled from: PhonesListFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/j;", "Li/a;", "Lkotlin/G0;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.profile_phones.phones_list.j, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33425j extends AbstractC41201a<G0, G0> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PhonesListFragment f227888b;

    public C33425j(PhonesListFragment phonesListFragment) {
        this.f227888b = phonesListFragment;
    }

    @Override // i.AbstractC41201a
    public final Intent createIntent(Context context, G0 g02) {
        N1 n12 = this.f227888b.f227397z0;
        if (n12 == null) {
            n12 = null;
        }
        return n12.g(null, null, null, null);
    }

    @Override // i.AbstractC41201a
    public final G0 parseResult(int i12, Intent intent) {
        if (i12 == -1) {
            PhonesListFragment.a aVar = PhonesListFragment.f227380K0;
            this.f227888b.D5().accept(new InterfaceC49590a.l(intent != null ? intent.getStringExtra("result_message") : null));
        }
        return G0.f406611a;
    }
}
