package com.avito.android.serp.adapter.constructor.rich;

import android.os.Parcelable;
import com.avito.android.serp.adapter.constructor.SerpConstructorAdvertItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ConstructorAdvertItemRichPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class h extends N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z f269674l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SerpConstructorAdvertItem f269675m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C f269676n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(z zVar, SerpConstructorAdvertItem serpConstructorAdvertItem, C c12) {
        super(1);
        this.f269674l = zVar;
        this.f269675m = serpConstructorAdvertItem;
        this.f269676n = c12;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        num.intValue();
        z zVar = this.f269674l;
        String f75565j = this.f269675m.getF221056b();
        Parcelable parcelableK2 = this.f269676n.k2();
        if (parcelableK2 != null) {
            zVar.f269727p.f270773b.put(f75565j, parcelableK2);
        }
        return G0.f406611a;
    }
}
