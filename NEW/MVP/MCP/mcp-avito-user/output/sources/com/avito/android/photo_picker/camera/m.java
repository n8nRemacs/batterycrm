package com.avito.android.photo_picker.camera;

import com.avito.android.photo_picker.camera.i;
import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: CameraViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class m<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f219016b;

    public m(i iVar) {
        this.f219016b = iVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        V2.f318762a.a("DEFAULT_TAG", "Photo capture error", (Throwable) obj);
        this.f219016b.f218988b0.setValue(i.a.f.f218997a);
    }
}
