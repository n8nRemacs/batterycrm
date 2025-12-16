package com.yandex.div.core.view2.divs;

import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: DivSelectBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* renamed from: com.yandex.div.core.view2.divs.x1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C38016x1 extends kotlin.jvm.internal.N implements Y41.l<String, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f369038l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f369039m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.p f369040n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38016x1(ArrayList arrayList, int i12, com.yandex.div.core.view2.divs.widgets.p pVar) {
        super(1);
        this.f369038l = arrayList;
        this.f369039m = i12;
        this.f369040n = pVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(String str) {
        ArrayList arrayList = this.f369038l;
        arrayList.set(this.f369039m, str);
        this.f369040n.setItems(arrayList);
        return kotlin.G0.f406611a;
    }
}
