package com.avito.android.advert_collection_list.actions;

import Y41.l;
import Y41.p;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CollectionActionsBottomSheet.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/advert_collection_list/actions/a;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/advert_collection_list/actions/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class e extends N implements l<a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p<String, a, G0> f82015l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f82016m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f82017n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(p<? super String, ? super a, G0> pVar, String str, com.avito.android.lib.design.bottom_sheet.d dVar) {
        super(1);
        this.f82015l = pVar;
        this.f82016m = str;
        this.f82017n = dVar;
    }

    @Override // Y41.l
    public final G0 invoke(a aVar) {
        this.f82015l.invoke(this.f82016m, aVar);
        this.f82017n.dismiss();
        return G0.f406611a;
    }
}
