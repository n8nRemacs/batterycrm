package com.avito.android.rating.user_contacts;

import Sg0.InterfaceC15184a;
import com.avito.android.lib.design.toast_bar.i;
import com.avito.android.rating.user_contacts.UserContactsActivity;
import com.avito.android.rating_form.select_item.RatingFormSelectItemFragment;
import fh0.InterfaceC40422a;
import fh0.c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class b implements i.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f247724b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f247725c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f247726d;

    public /* synthetic */ b(int i12, Object obj, Object obj2) {
        this.f247724b = i12;
        this.f247725c = obj;
        this.f247726d = obj2;
    }

    @Override // com.avito.android.lib.design.toast_bar.i.b
    public final void invoke() {
        Object obj = this.f247726d;
        Object obj2 = this.f247725c;
        switch (this.f247724b) {
            case 0:
                UserContactsActivity.a aVar = UserContactsActivity.f247653z;
                com.avito.android.rating.user_contacts.mvi.entity.a aVar2 = ((InterfaceC15184a.b) obj2).f15111d;
                if (aVar2 != null) {
                    ((UserContactsActivity) obj).a2().accept(aVar2);
                    break;
                }
                break;
            default:
                RatingFormSelectItemFragment.a aVar3 = RatingFormSelectItemFragment.f248870z0;
                InterfaceC40422a interfaceC40422a = ((c.a) ((fh0.c) obj2)).f396060e;
                if (interfaceC40422a != null) {
                    ((RatingFormSelectItemFragment) obj).q5().accept(interfaceC40422a);
                    break;
                }
                break;
        }
    }
}
