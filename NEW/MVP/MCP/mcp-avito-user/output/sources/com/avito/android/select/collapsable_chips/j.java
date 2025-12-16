package com.avito.android.select.collapsable_chips;

import com.avito.android.remote.model.ParcelableEntity;
import dq0.InterfaceC39781c;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CollapsableChipsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class j extends N implements Y41.l<Object, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g<Object> f265375l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k f265376m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g<Object> gVar, k kVar) {
        super(1);
        this.f265375l = gVar;
        this.f265376m = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(Object obj) {
        Y41.l<InterfaceC39781c, G0> lVar;
        this.f265375l.f265374c.invoke(obj);
        ParcelableEntity parcelableEntity = obj instanceof ParcelableEntity ? (ParcelableEntity) obj : null;
        if (parcelableEntity != null && (lVar = this.f265376m.f265377b) != null) {
            lVar.invoke(new InterfaceC39781c.f(parcelableEntity));
        }
        return G0.f406611a;
    }
}
