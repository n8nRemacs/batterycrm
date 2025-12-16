package com.avito.android.serp.adapter.rich_snippets.realty;

import android.os.Parcelable;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DevelopmentXlRichItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class N extends kotlin.jvm.internal.N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ S f270950l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DevelopmentXlItem f270951m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC34777w f270952n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(S s5, DevelopmentXlItem developmentXlItem, InterfaceC34777w interfaceC34777w) {
        super(1);
        this.f270950l = s5;
        this.f270951m = developmentXlItem;
        this.f270952n = interfaceC34777w;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        num.intValue();
        S s5 = this.f270950l;
        DevelopmentXlItem developmentXlItem = this.f270951m;
        s5.f270958c.c(new W(developmentXlItem.f270913c, 0, 0, null, 14, null));
        Parcelable parcelableK2 = this.f270952n.k2();
        if (parcelableK2 != null) {
            s5.f270961f.f270773b.put(developmentXlItem.f270913c, parcelableK2);
        }
        return G0.f406611a;
    }
}
