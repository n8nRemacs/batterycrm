package com.avito.android.advert.item;

import Ju.InterfaceC14249c;
import com.avito.android.deep_linking.links.CalendarLink;
import kotlin.Metadata;
import kv.C43501a;

/* compiled from: AdvertDetailsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "event", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class H0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28136i0 f71632b;

    public H0(C28136i0 c28136i0) {
        this.f71632b = c28136i0;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        InterfaceC14249c interfaceC14249c = ((C43501a) obj).f413261b;
        if (interfaceC14249c instanceof CalendarLink.b.C3988b) {
            CalendarLink.b.C3988b c3988b = (CalendarLink.b.C3988b) interfaceC14249c;
            this.f71632b.E0(c3988b.f133080b, c3988b.f133081c);
        }
    }
}
