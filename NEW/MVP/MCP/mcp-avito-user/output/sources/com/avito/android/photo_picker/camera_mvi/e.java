package com.avito.android.photo_picker.camera_mvi;

import Y41.l;
import Y61.k;
import android.os.Bundle;
import com.avito.android.util.C35966w1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CameraFragment.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_photo-picker_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e {

    /* compiled from: CameraFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<Bundle, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f219119l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i12) {
            super(1);
            this.f219119l = i12;
        }

        @Override // Y41.l
        public final G0 invoke(Bundle bundle) {
            bundle.putInt("arg_key_max_count", this.f219119l);
            return G0.f406611a;
        }
    }

    @k
    public static final CameraFragment a(int i12) {
        CameraFragment cameraFragment = new CameraFragment();
        C35966w1.a(cameraFragment, -1, new a(i12));
        return cameraFragment;
    }
}
