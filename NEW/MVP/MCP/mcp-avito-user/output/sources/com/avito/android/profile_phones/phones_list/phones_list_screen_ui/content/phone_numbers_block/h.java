package com.avito.android.profile_phones.phones_list.phones_list_screen_ui.content.phone_numbers_block;

import Y41.p;
import androidx.compose.runtime.A;
import com.akita.compose.foundation.r;
import com.avito.android.profile_phones.phones_list.phone_item.PhoneListItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;

/* compiled from: PhoneNumbersBlock.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class h extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PhoneListItem f228271l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(PhoneListItem phoneListItem) {
        super(2);
        this.f228271l = phoneListItem;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        PhoneListItem phoneListItem;
        com.akita.compose.foundation.p pVar;
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            a13.C(-806984569);
            PhoneListItem phoneListItem2 = this.f228271l;
            if (C43066x.K(phoneListItem2.f228128d)) {
                phoneListItem = phoneListItem2;
            } else {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                phoneListItem = phoneListItem2;
                com.akita.compose.foundation.ui.p.b(phoneListItem2.f228128d, com.akita.compose.theme.re23.b.m(a13).getF66432c().f61952d, null, false, 0L, null, 0, 0, false, null, a13, 0, 1020);
            }
            a13.h();
            String str = phoneListItem.f228131g;
            if (str != null && !C43066x.K(str)) {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                r rVar = com.akita.compose.theme.re23.b.m(a13).getF66432c().f61952d;
                a13.C(-806967245);
                PhoneListItem.Status status = PhoneListItem.Status.f228140b;
                PhoneListItem.Status status2 = phoneListItem.f228129e;
                if (status2 == status || status2 == PhoneListItem.Status.f228141c) {
                    pVar = com.akita.compose.theme.re23.b.m(a13).getF66432c().f61952d.f63644a;
                } else {
                    if (status2 != PhoneListItem.Status.f228142d) {
                        throw new NoWhenBranchMatchedException();
                    }
                    com.akita.compose.theme.re23.b.f63987e.getClass();
                    com.akita.compose.theme.re23.semantic.b.f65954b.getText().getClass();
                    pVar = X2.h.f18558f;
                }
                com.akita.compose.foundation.p pVar2 = pVar;
                a13.h();
                com.akita.compose.foundation.ui.p.b(phoneListItem.f228131g, r.a(rVar, pVar2, 0L, 0L, null, 0L, 0L, 1022), null, false, 0L, null, 0, 0, false, null, a13, 0, 1020);
            }
        }
        return G0.f406611a;
    }
}
