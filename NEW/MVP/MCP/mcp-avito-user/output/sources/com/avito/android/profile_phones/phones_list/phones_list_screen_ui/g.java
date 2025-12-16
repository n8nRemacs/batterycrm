package com.avito.android.profile_phones.phones_list.phones_list_screen_ui;

import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import com.avito.android.profile_phones.phones_list.mvi.entity.IacEnableSwitchState;
import com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PhonesListScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class g extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f228315l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i12) {
        super(2);
        this.f228315l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f228315l | 1);
        B bE2 = a12.E(1947090978);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            q.a(new PhonesListMviState(false, true, true, com.avito.android.profile_phones.phones_list.phones_list_screen_ui.content.phone_numbers_block.b.f228244a, com.avito.android.profile_phones.phones_list.phones_list_screen_ui.content.iac_devices_block.b.f228192a, null, null, "", null, true, true, true, true, new IacEnableSwitchState(false, false), null, true, 256, null), h.f228316l, i.f228317l, j.f228318l, k.f228319l, l.f228320l, m.f228321l, n.f228322l, o.f228323l, p.f228324l, e.f228313l, f.f228314l, null, bE2, 920350128, 54);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new g(iA2);
        }
        return G0.f406611a;
    }
}
