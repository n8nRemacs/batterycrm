package com.avito.android.user_advert.advert;

import com.avito.android.remote.model.my_advert.CloseReason;
import com.avito.android.user_advert.advert.delegate.auto_select_close.i;
import iI0.C41304i;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: MyAdvertDetailsPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.user_advert.advert.o0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35441o0 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C35435m0 f310572l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.user_advert.advert.delegate.auto_select_close.i f310573m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l0.a f310574n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35441o0(C35435m0 c35435m0, com.avito.android.user_advert.advert.delegate.auto_select_close.i iVar, l0.a aVar) {
        super(0);
        this.f310572l = c35435m0;
        this.f310573m = iVar;
        this.f310574n = aVar;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        i.a aVar = (i.a) this.f310573m;
        CloseReason closeReason = aVar.f308556b;
        String str = aVar.f308557c;
        C35435m0 c35435m0 = this.f310572l;
        c35435m0.h(closeReason, str);
        if (!this.f310574n.f406838b) {
            c35435m0.f310480m.c(new C41304i());
        }
        return kotlin.G0.f406611a;
    }
}
