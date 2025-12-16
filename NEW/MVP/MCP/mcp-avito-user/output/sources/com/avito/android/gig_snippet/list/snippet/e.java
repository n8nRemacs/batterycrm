package com.avito.android.gig_snippet.list.snippet;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GigShiftSnippetItemView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f161056l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ GigShiftSnippetListItem f161057m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f161058n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, GigShiftSnippetListItem gigShiftSnippetListItem, Y41.a<G0> aVar) {
        super(0);
        this.f161056l = fVar;
        this.f161057m = gigShiftSnippetListItem;
        this.f161058n = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        f fVar = this.f161056l;
        fVar.f161069k.e();
        fVar.f161069k.setTitle(this.f161057m.f161033f.f161047f);
        Y41.a<G0> aVar = this.f161058n;
        if (aVar != null) {
            aVar.invoke();
        }
        return G0.f406611a;
    }
}
