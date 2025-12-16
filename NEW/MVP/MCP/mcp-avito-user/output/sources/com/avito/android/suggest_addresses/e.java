package com.avito.android.suggest_addresses;

import Y41.l;
import android.content.Intent;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.remote.model.SuggestAddress;
import com.avito.android.suggest_addresses.SuggestAddressesFragment;
import com.avito.android.util.K2;
import com.avito.android.util.architecture_components.D;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import oA0.InterfaceC44611b;

/* compiled from: SuggestAddressesFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class e extends H implements l<InterfaceC44611b.a, G0> {
    @Override // Y41.l
    public final G0 invoke(InterfaceC44611b.a aVar) {
        InterfaceC44611b.a aVar2 = aVar;
        SuggestAddressesFragment suggestAddressesFragment = (SuggestAddressesFragment) this.receiver;
        SuggestAddressesFragment.a aVar3 = SuggestAddressesFragment.f291782B0;
        suggestAddressesFragment.getClass();
        if (L.f(aVar2, InterfaceC44611b.a.c.f419481a)) {
            K2.e(suggestAddressesFragment);
        } else if (L.f(aVar2, InterfaceC44611b.a.C12167a.f419479a)) {
            if (suggestAddressesFragment.l1() instanceof SuggestAddressesActivity) {
                ActivityC22955m activityC22955mL1 = suggestAddressesFragment.l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.setResult(0);
                }
                ActivityC22955m activityC22955mL12 = suggestAddressesFragment.l1();
                if (activityC22955mL12 != null) {
                    activityC22955mL12.finish();
                }
            } else {
                suggestAddressesFragment.B5(0, null);
                suggestAddressesFragment.r5();
            }
        } else if (aVar2 instanceof InterfaceC44611b.a.C12168b) {
            D<List<SuggestAddress>> d12 = suggestAddressesFragment.f291783A0;
            if (d12.hasActiveObservers()) {
                d12.setValue(((InterfaceC44611b.a.C12168b) aVar2).f419480a);
            } else if (suggestAddressesFragment.l1() instanceof SuggestAddressesActivity) {
                ActivityC22955m activityC22955mL13 = suggestAddressesFragment.l1();
                if (activityC22955mL13 != null) {
                    Intent intent = new Intent();
                    intent.putExtra("suggest_addresses", ((InterfaceC44611b.a.C12168b) aVar2).f419480a);
                    G0 g02 = G0.f406611a;
                    activityC22955mL13.setResult(-1, intent);
                }
                ActivityC22955m activityC22955mL14 = suggestAddressesFragment.l1();
                if (activityC22955mL14 != null) {
                    activityC22955mL14.finish();
                }
            } else {
                Intent intent2 = new Intent();
                intent2.putExtra("suggest_addresses", ((InterfaceC44611b.a.C12168b) aVar2).f419480a);
                G0 g03 = G0.f406611a;
                suggestAddressesFragment.B5(-1, intent2);
                suggestAddressesFragment.r5();
            }
        }
        return G0.f406611a;
    }
}
