package com.avito.android.photo_picker.legacy;

import android.view.ViewGroup;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PhotoPickerPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/device_orientation/c;", "rotation", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/device_orientation/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.photo_picker.legacy.w, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C33260w extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.device_orientation.c, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C33245g f219911l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33260w(C33245g c33245g) {
        super(1);
        this.f219911l = c33245g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.avito.android.photo_picker.legacy.B, java.lang.Runnable] */
    @Override // Y41.l
    public final G0 invoke(com.avito.android.device_orientation.c cVar) {
        com.avito.android.device_orientation.c cVar2 = cVar;
        E e12 = this.f219911l.f219808p;
        if (e12 != null) {
            D6.A(e12.f219581d, cVar2.f139238a);
            B b12 = e12.f219591n;
            ViewGroup viewGroup = e12.f219578a;
            if (b12 != null) {
                viewGroup.removeCallbacks(b12);
            }
            ?? r12 = new Runnable(cVar2) { // from class: com.avito.android.photo_picker.legacy.B
                @Override // java.lang.Runnable
                public final void run() {
                    this.f219574b.f219592o.getClass();
                }
            };
            e12.f219591n = r12;
            viewGroup.postDelayed(r12, 200L);
        }
        return G0.f406611a;
    }
}
