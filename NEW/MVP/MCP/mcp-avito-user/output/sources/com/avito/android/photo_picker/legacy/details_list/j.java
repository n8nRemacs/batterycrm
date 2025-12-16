package com.avito.android.photo_picker.legacy.details_list;

import androidx.collection.C20199a;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PreviewItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class j extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f219653l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n f219654m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, n nVar) {
        super(0);
        this.f219653l = mVar;
        this.f219654m = nVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        m mVar = this.f219653l;
        C20199a<n, com.avito.android.photo_picker.legacy.thumbnail_list.a> c20199a = mVar.f219659d;
        c20199a.remove(this.f219654m);
        if (c20199a.isEmpty()) {
            io.reactivex.rxjava3.internal.subscribers.n nVar = mVar.f219658c;
            if (nVar != null) {
                SubscriptionHelper.a(nVar);
            }
            mVar.f219658c = null;
        }
        return G0.f406611a;
    }
}
