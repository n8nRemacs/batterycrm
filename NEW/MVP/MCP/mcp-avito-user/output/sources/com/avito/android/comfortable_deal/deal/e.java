package com.avito.android.comfortable_deal.deal;

import Ep.InterfaceC13517a;
import Y41.l;
import com.avito.android.comfortable_deal.deal.DealFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DealView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class e extends N implements l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f121071l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f121072m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, String str) {
        super(1);
        this.f121071l = gVar;
        this.f121072m = str;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        String str2 = str;
        g gVar = this.f121071l;
        l<InterfaceC13517a, G0> lVar = gVar.f121075b;
        String str3 = this.f121072m;
        ((DealFragment.d) lVar).invoke(new InterfaceC13517a.r(str2, str3, false));
        gVar.f121077d.k(str2, str3);
        return G0.f406611a;
    }
}
