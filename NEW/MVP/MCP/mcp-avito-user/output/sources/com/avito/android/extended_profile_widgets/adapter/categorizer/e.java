package com.avito.android.extended_profile_widgets.adapter.categorizer;

import Y41.l;
import android.os.Parcelable;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CategorizerItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/os/Parcelable;", "scrollState", "Lkotlin/G0;", "invoke", "(Landroid/os/Parcelable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class e extends N implements l<Parcelable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f154340l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CategorizerItem f154341m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, CategorizerItem categorizerItem) {
        super(1);
        this.f154340l = fVar;
        this.f154341m = categorizerItem;
    }

    @Override // Y41.l
    public final G0 invoke(Parcelable parcelable) {
        f fVar = this.f154340l;
        fVar.f154342b.invoke(new oB.i(this.f154341m, parcelable));
        return G0.f406611a;
    }
}
