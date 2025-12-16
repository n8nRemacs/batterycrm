package com.avito.android.photo_picker.legacy.thumbnail_list;

import io.reactivex.rxjava3.internal.subscribers.n;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ThumbnailItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f219890l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f219891m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, j jVar) {
        super(0);
        this.f219890l = iVar;
        this.f219891m = jVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        i iVar = this.f219890l;
        ArrayList<j> arrayList = iVar.f219898f;
        arrayList.remove(this.f219891m);
        if (arrayList.isEmpty()) {
            n nVar = iVar.f219897e;
            if (nVar != null) {
                SubscriptionHelper.a(nVar);
            }
            iVar.f219897e = null;
        }
        return G0.f406611a;
    }
}
