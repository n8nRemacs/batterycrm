package com.avito.android.publish.details;

import Ju.InterfaceC14249c;
import com.avito.android.R;
import com.avito.android.sx_address.SxAddressAddResult;
import kotlin.Metadata;
import kv.C43501a;

/* compiled from: PublishDetailsFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "event", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class H0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PublishDetailsFragment f232939b;

    public H0(PublishDetailsFragment publishDetailsFragment) {
        this.f232939b = publishDetailsFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        SxAddressAddResult.Success.PublishValue publishValue;
        InterfaceC14249c interfaceC14249c = ((C43501a) obj).f413261b;
        boolean z12 = interfaceC14249c instanceof SxAddressAddResult.Failure;
        PublishDetailsFragment publishDetailsFragment = this.f232939b;
        if (z12) {
            C33789t c33789t = publishDetailsFragment.f233108S2;
            (c33789t != null ? c33789t : null).j3(publishDetailsFragment.requireContext().getString(R.string.address_error));
            return;
        }
        SxAddressAddResult.Success success = interfaceC14249c instanceof SxAddressAddResult.Success ? (SxAddressAddResult.Success) interfaceC14249c : null;
        if (success == null || (publishValue = success.f292526c) == null) {
            return;
        }
        C33789t c33789t2 = publishDetailsFragment.f233108S2;
        if (c33789t2 == null) {
            c33789t2 = null;
        }
        String string = publishDetailsFragment.requireContext().getString(R.string.seller_add_address_success);
        c33789t2.getClass();
        com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, c33789t2.f234941a, com.avito.android.printable_text.b.f(string), null, null, null, null, 0, null, null, false, false, null, null, 4094);
        com.avito.android.publish.C0 c02 = publishDetailsFragment.f233129h1;
        if (c02 == null) {
            c02 = null;
        }
        if (c02.Be()) {
            com.avito.android.details.b bVar = publishDetailsFragment.f135892n0;
            (bVar != null ? bVar : null).v(PublishDetailsFragment.t5(publishValue, publishDetailsFragment));
        } else {
            com.avito.android.details.b bVar2 = publishDetailsFragment.f135892n0;
            (bVar2 != null ? bVar2 : null).S(PublishDetailsFragment.t5(publishValue, publishDetailsFragment));
        }
    }
}
