package com.avito.android.photo_picker.camera;

import android.graphics.RectF;
import androidx.view.C23038g0;
import com.avito.android.photo_picker.FocusMode;
import com.avito.android.photo_picker.InterfaceC33224a;
import com.avito.android.photo_picker.camera.i;
import com.avito.android.photo_picker.camera.t;
import kotlin.Metadata;

/* compiled from: CameraViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/photo_picker/camera/t$a;", "focusArea", "Lkotlin/G0;", "accept", "(Lcom/avito/android/photo_picker/camera/t$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class p<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f219020b;

    public p(i iVar) {
        this.f219020b = iVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        t.a aVar = (t.a) obj;
        i iVar = this.f219020b;
        InterfaceC33224a interfaceC33224a = iVar.f218979S;
        if (interfaceC33224a != null && interfaceC33224a.getF218886f() && interfaceC33224a.getF218887g()) {
            iVar.f218990d0 = FocusMode.f218752c;
            C23038g0<i.a> c23038g0 = iVar.f218988b0;
            RectF rectF = aVar.f219033a;
            c23038g0.setValue(new i.a.k(rectF.centerX(), rectF.centerY()));
            interfaceC33224a.k(rectF, aVar.f219034b);
        }
    }
}
