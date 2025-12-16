package com.avito.android.serp.adapter.rich_snippets.realty;

import android.os.Parcelable;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DevelopmentRichItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.serp.adapter.rich_snippets.realty.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34770o extends kotlin.jvm.internal.N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34773s f270998l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DevelopmentItem f270999m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC34777w f271000n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34770o(C34773s c34773s, DevelopmentItem developmentItem, InterfaceC34777w interfaceC34777w) {
        super(1);
        this.f270998l = c34773s;
        this.f270999m = developmentItem;
        this.f271000n = interfaceC34777w;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        num.intValue();
        C34773s c34773s = this.f270998l;
        DevelopmentItem developmentItem = this.f270999m;
        c34773s.f271006c.c(new W(developmentItem.f270894c, 0, 0, null, 14, null));
        Parcelable parcelableK2 = this.f271000n.k2();
        if (parcelableK2 != null) {
            c34773s.f271009f.f270773b.put(developmentItem.f270894c, parcelableK2);
        }
        return G0.f406611a;
    }
}
