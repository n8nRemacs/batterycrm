package com.avito.android.photo_picker;

import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.image.enhancement.InterfaceC30978i;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.photo_picker.legacy.InterfaceC33243e;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35863o4;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;

/* compiled from: PhotoPickerViewModelFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/M;", "Landroidx/lifecycle/P0$c;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
/* loaded from: classes14.dex */
public final class M implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33243e f218761a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f218762b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.b0 f218763c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.computer_vision.a f218764d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f218765e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30978i f218766f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final PhotoPickerIntentFactory.PhotoPickerMode f218767g;

    /* renamed from: h, reason: collision with root package name */
    public final int f218768h;

    @Inject
    public M(@Y61.k InterfaceC33243e interfaceC33243e, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.analytics.b0 b0Var, @Y61.k com.avito.android.computer_vision.a aVar, @Y61.k InterfaceC35863o4 interfaceC35863o4, @Y61.k InterfaceC30978i interfaceC30978i, @Y61.k @Named("mode") PhotoPickerIntentFactory.PhotoPickerMode photoPickerMode, @Named("max_photo_count") int i12) {
        this.f218761a = interfaceC33243e;
        this.f218762b = interfaceC35745a5;
        this.f218763c = b0Var;
        this.f218764d = aVar;
        this.f218765e = interfaceC35863o4;
        this.f218766f = interfaceC30978i;
        this.f218767g = photoPickerMode;
        this.f218768h = i12;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (!cls.isAssignableFrom(PhotoPickerViewModel.class)) {
            throw new IllegalArgumentException(cls.toString());
        }
        return new PhotoPickerViewModel(this.f218761a, this.f218762b, this.f218763c, this.f218764d, this.f218765e, this.f218766f, this.f218767g, this.f218768h);
    }
}
