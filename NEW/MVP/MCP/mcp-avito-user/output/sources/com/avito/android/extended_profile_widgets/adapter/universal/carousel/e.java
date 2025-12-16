package com.avito.android.extended_profile_widgets.adapter.universal.carousel;

import Y41.p;
import android.os.Parcelable;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import oB.E;

/* compiled from: UniversalWidgetCarouselContainerItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "scrollPosition", "Landroid/os/Parcelable;", "scrollState", "Lkotlin/G0;", "invoke", "(ILandroid/os/Parcelable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class e extends N implements p<Integer, Parcelable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f154977l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ UniversalWidgetCarouselContainerItem f154978m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, UniversalWidgetCarouselContainerItem universalWidgetCarouselContainerItem) {
        super(2);
        this.f154977l = fVar;
        this.f154978m = universalWidgetCarouselContainerItem;
    }

    @Override // Y41.p
    public final G0 invoke(Integer num, Parcelable parcelable) {
        num.intValue();
        f fVar = this.f154977l;
        fVar.f154979b.invoke(new E.a(this.f154978m, parcelable));
        return G0.f406611a;
    }
}
