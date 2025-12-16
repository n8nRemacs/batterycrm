package com.avito.android.extended_profile_widgets.adapter.about_v2;

import android.os.Parcelable;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import oB.C44615a;

/* compiled from: AboutV2ItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/os/Parcelable;", "bundle", "Lkotlin/G0;", "invoke", "(Landroid/os/Parcelable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class e extends N implements Y41.l<Parcelable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f154181l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AboutV2Item f154182m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, AboutV2Item aboutV2Item) {
        super(1);
        this.f154181l = gVar;
        this.f154182m = aboutV2Item;
    }

    @Override // Y41.l
    public final G0 invoke(Parcelable parcelable) {
        g gVar = this.f154181l;
        gVar.f154186b.invoke(new C44615a(this.f154182m, parcelable));
        return G0.f406611a;
    }
}
