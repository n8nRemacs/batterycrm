package com.avito.android.publish.details.buyout;

import Ju.InterfaceC14249c;
import com.avito.android.deep_linking.links.BeduinUniversalPageLink;
import com.avito.android.deep_linking.links.InterfaceC29681g;
import com.avito.android.publish.details.ItemDetailsView;
import kotlin.Metadata;
import kv.C43501a;

/* compiled from: CollectPublishParamsDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "deepLinkResult", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class c<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f233567b;

    public c(b bVar) {
        this.f233567b = bVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C43501a c43501a = (C43501a) obj;
        InterfaceC14249c interfaceC14249c = c43501a.f413261b;
        boolean z12 = interfaceC14249c instanceof InterfaceC29681g.a;
        b bVar = this.f233567b;
        if (!z12) {
            if (c43501a.f413260a.f134520a instanceof BeduinUniversalPageLink) {
                bVar.g(null, false);
            }
        } else {
            ItemDetailsView itemDetailsView = bVar.f233565h;
            if (itemDetailsView != null) {
                itemDetailsView.j3(((InterfaceC29681g.a) interfaceC14249c).f134003b);
            }
        }
    }
}
