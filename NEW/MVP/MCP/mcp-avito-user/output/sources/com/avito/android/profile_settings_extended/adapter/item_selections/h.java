package com.avito.android.profile_settings_extended.adapter.item_selections;

import android.os.Parcelable;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import yc0.z;

/* compiled from: SelectionsItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/os/Parcelable;", "scrollState", "Lkotlin/G0;", "invoke", "(Landroid/os/Parcelable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class h extends N implements Y41.l<Parcelable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f229628l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SelectionsItem f229629m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, SelectionsItem selectionsItem) {
        super(1);
        this.f229628l = iVar;
        this.f229629m = selectionsItem;
    }

    @Override // Y41.l
    public final G0 invoke(Parcelable parcelable) {
        i iVar = this.f229628l;
        iVar.f229630b.invoke(new z.i(this.f229629m, parcelable));
        return G0.f406611a;
    }
}
