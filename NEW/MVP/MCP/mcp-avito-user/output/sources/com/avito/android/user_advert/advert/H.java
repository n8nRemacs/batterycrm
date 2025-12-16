package com.avito.android.user_advert.advert;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.Metadata;

/* compiled from: MyAdvertDetailsActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class H extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ MyAdvertDetailsActivity f308238l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f308239m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(MyAdvertDetailsActivity myAdvertDetailsActivity, String str) {
        super(0);
        this.f308238l = myAdvertDetailsActivity;
        this.f308239m = str;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        MyAdvertDetailsActivity myAdvertDetailsActivity = this.f308238l;
        InterfaceC28373a interfaceC28373a = myAdvertDetailsActivity.f308318m;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        interfaceC28373a.c(new iI0.n());
        com.avito.android.deeplink_handler.handler.composite.a aVar = myAdvertDetailsActivity.f308324p;
        if (aVar == null) {
            aVar = null;
        }
        b.a.a(aVar, new MyAdvertLink.Edit(this.f308239m, null, null, false, null, null, 62, null), null, null, 6);
        return kotlin.G0.f406611a;
    }
}
