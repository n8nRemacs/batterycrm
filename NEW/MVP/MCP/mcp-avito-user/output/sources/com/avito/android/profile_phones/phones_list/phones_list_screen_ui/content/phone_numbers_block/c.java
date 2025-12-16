package com.avito.android.profile_phones.phones_list.phones_list_screen_ui.content.phone_numbers_block;

import Y41.p;
import androidx.compose.foundation.layout.K;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PhoneNumbersBlock.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class c extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ K f228257l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f228258m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f228259n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(K k12, Y41.a aVar, int i12) {
        super(2);
        this.f228257l = k12;
        this.f228258m = aVar;
        this.f228259n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f228259n | 1);
        b.b(this.f228257l, this.f228258m, a12, iA2);
        return G0.f406611a;
    }
}
