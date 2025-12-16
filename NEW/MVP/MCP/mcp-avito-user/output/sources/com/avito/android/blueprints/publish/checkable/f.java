package com.avito.android.blueprints.publish.checkable;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: CheckableItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/blueprints/publish/checkable/f;", "Lcom/avito/android/blueprints/publish/checkable/d;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<String> f106095b;

    /* renamed from: c, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<Q<String, DeepLink>> f106096c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f106097d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f106098e;

    @Inject
    public f() {
        com.jakewharton.rxrelay3.c<String> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f106095b = cVar;
        com.jakewharton.rxrelay3.c<Q<String, DeepLink>> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f106096c = cVar2;
        this.f106097d = cVar;
        this.f106098e = cVar2;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        CheckableItem checkableItem = (CheckableItem) aVar;
        hVar.setTitle(checkableItem.f106085c);
        hVar.f(checkableItem.f106087e);
        hVar.setChecked(checkableItem.f106086d);
        hVar.a(new e(checkableItem, this));
    }

    @Override // com.avito.android.blueprints.publish.checkable.d
    @k
    public final z<String> d() {
        return this.f106097d;
    }

    @Override // com.avito.android.blueprints.publish.checkable.d
    @k
    /* renamed from: g3, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF106098e() {
        return this.f106098e;
    }
}
