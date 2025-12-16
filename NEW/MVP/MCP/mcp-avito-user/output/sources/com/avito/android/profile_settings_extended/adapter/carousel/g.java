package com.avito.android.profile_settings_extended.adapter.carousel;

import android.os.Parcelable;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import yc0.e;

/* compiled from: ExtendedSettingsCarouselItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/os/Parcelable;", "it", "Lkotlin/G0;", "invoke", "(Landroid/os/Parcelable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class g extends N implements Y41.l<Parcelable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f229326l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ExtendedSettingsCarouselItem f229327m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, ExtendedSettingsCarouselItem extendedSettingsCarouselItem) {
        super(1);
        this.f229326l = jVar;
        this.f229327m = extendedSettingsCarouselItem;
    }

    @Override // Y41.l
    public final G0 invoke(Parcelable parcelable) {
        j jVar = this.f229326l;
        jVar.f229332b.invoke(new e.d(this.f229327m, parcelable));
        return G0.f406611a;
    }
}
