package com.avito.android.photo_picker.camera;

import android.os.Bundle;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CameraFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.photo_picker.camera.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C33229c extends N implements Y41.l<Bundle, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PhotoPickerIntentFactory.PhotoPickerMode f218945l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f218946m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33229c(PhotoPickerIntentFactory.PhotoPickerMode photoPickerMode, boolean z12) {
        super(1);
        this.f218945l = photoPickerMode;
        this.f218946m = z12;
    }

    @Override // Y41.l
    public final G0 invoke(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putParcelable("mode", this.f218945l);
        bundle2.putBoolean("is_redesign", this.f218946m);
        return G0.f406611a;
    }
}
