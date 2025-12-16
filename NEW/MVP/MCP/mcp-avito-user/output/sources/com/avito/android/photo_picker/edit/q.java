package com.avito.android.photo_picker.edit;

import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.analytics.b0;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.photo_storage.SharedPhotosStorage;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EditPhotoViewModelFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/edit/q;", "Landroidx/lifecycle/P0$c;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class q implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SharedPhotosStorage f219430a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f219431b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final b0 f219432c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final t f219433d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final PhotoPickerIntentFactory.PhotoPickerMode f219434e;

    @Inject
    public q(@Y61.k SharedPhotosStorage sharedPhotosStorage, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k b0 b0Var, @Y61.k t tVar, @Y61.k PhotoPickerIntentFactory.PhotoPickerMode photoPickerMode) {
        this.f219430a = sharedPhotosStorage;
        this.f219431b = interfaceC35745a5;
        this.f219432c = b0Var;
        this.f219433d = tVar;
        this.f219434e = photoPickerMode;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (!cls.isAssignableFrom(k.class)) {
            throw new IllegalArgumentException(cls.toString());
        }
        return new k(this.f219430a, this.f219431b, this.f219432c, this.f219433d, this.f219434e);
    }
}
