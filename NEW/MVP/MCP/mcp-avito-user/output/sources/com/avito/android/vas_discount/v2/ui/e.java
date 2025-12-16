package com.avito.android.vas_discount.v2.ui;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.user_adverts_views_pub.a;
import com.avito.android.vas_discount.v2.ui.VasDiscountV2DialogFragment;
import kotlin.Metadata;
import qL0.InterfaceC47317a;
import rL0.C47561a;

/* compiled from: VasDiscountV2DialogFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/a$a;", "action", "Lkotlin/G0;", "accept", "(Lcom/avito/android/user_adverts_views_pub/a$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class e<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VasDiscountV2DialogFragment f319845b;

    public e(VasDiscountV2DialogFragment vasDiscountV2DialogFragment) {
        this.f319845b = vasDiscountV2DialogFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        DeepLink f419729p;
        a.InterfaceC9834a interfaceC9834a = (a.InterfaceC9834a) obj;
        if (!(interfaceC9834a instanceof a.InterfaceC9834a.C9835a) || (f419729p = ((a.InterfaceC9834a.C9835a) interfaceC9834a).f316728a.getF393816s()) == null) {
            return;
        }
        VasDiscountV2DialogFragment.a aVar = VasDiscountV2DialogFragment.f319825s0;
        ((C47561a) this.f319845b.f319831m0.getValue()).accept(new InterfaceC47317a.b(f419729p));
    }
}
