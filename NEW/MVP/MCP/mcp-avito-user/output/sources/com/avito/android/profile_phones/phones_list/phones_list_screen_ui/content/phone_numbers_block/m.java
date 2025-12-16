package com.avito.android.profile_phones.phones_list.phones_list_screen_ui.content.phone_numbers_block;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import com.avito.android.profile_phones.phones_list.mvi.entity.NumbersListState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PhoneNumbersBlock.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class m extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f228281l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(int i12) {
        super(2);
        this.f228281l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f228281l | 1);
        NumbersListState.Loaded loaded = b.f228244a;
        B bE2 = a12.E(2034303609);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            a.f228237a.getClass();
            com.akita.compose.theme.re23.c.a(false, a.f228240d, bE2, 48, 1);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new m(iA2);
        }
        return G0.f406611a;
    }
}
