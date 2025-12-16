package com.avito.android.profile_phones.phones_list.phones_list_screen_ui.content.phone_numbers_block;

import Y41.p;
import androidx.compose.foundation.layout.K;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import com.avito.android.profile_phones.phones_list.mvi.entity.NumbersListState;
import com.avito.android.profile_phones.phones_list.phone_item.PhoneListItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PhoneNumbersBlock.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class k extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ K f228276l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ NumbersListState.Loaded f228277m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<PhoneListItem, G0> f228278n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f228279o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(K k12, NumbersListState.Loaded loaded, Y41.l lVar, int i12) {
        super(2);
        this.f228276l = k12;
        this.f228277m = loaded;
        this.f228278n = lVar;
        this.f228279o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f228279o | 1);
        Y41.l<PhoneListItem, G0> lVar = this.f228278n;
        b.f(this.f228276l, this.f228277m, lVar, a12, iA2);
        return G0.f406611a;
    }
}
