package com.avito.android.rating_form.item.photo_picker.di;

import com.avito.android.photo_list_view.InterfaceC33214h;
import com.avito.android.photo_list_view.N;
import com.avito.android.photo_list_view.s;
import com.avito.android.photo_list_view.t;
import com.avito.android.rating_form.step.RatingFormStepArguments;
import com.avito.android.rating_form.step.RatingFormStepFragment;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingFormPhotoPickerModule_Companion_ProvideImageListPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC33214h> f248521a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<s.b> f248522b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f248523c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f248524d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<N> f248525e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f248526f;

    public e(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f248521a = provider;
        this.f248522b = provider2;
        this.f248523c = provider3;
        this.f248524d = lVar;
        this.f248525e = provider4;
        this.f248526f = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC33214h interfaceC33214h = this.f248521a.get();
        s.b bVar = this.f248522b.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f248523c.get();
        RatingFormStepFragment ratingFormStepFragment = (RatingFormStepFragment) this.f248524d.f393949a;
        N n12 = this.f248525e.get();
        RatingFormStepArguments ratingFormStepArguments = (RatingFormStepArguments) this.f248526f.f393949a;
        b.f248514a.getClass();
        return new t(interfaceC33214h, bVar, null, interfaceC35745a5, ratingFormStepFragment, new com.avito.android.rating_form.item.photo_picker.a(ratingFormStepArguments.f249114b), n12);
    }
}
