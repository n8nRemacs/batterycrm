package com.avito.android.publish.scanner;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.P;
import androidx.work.impl.CallableC23587q;
import com.avito.android.photo_camera_view.F;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41948f0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ScanPhotoResizer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/scanner/h;", "Lcom/avito/android/photo_camera_view/F;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h implements F {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f239215a;

    public h(@Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f239215a = interfaceC35745a5;
    }

    @Override // com.avito.android.photo_camera_view.F
    @Y61.k
    public final z<Bitmap> a(@Y61.k byte[] bArr, @Y61.k u80.c cVar, float f12) {
        C41948f0 c41948f0W = z.W(new CallableC23587q(this, bArr, cVar, 15));
        InterfaceC35745a5 interfaceC35745a5 = this.f239215a;
        return c41948f0W.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e());
    }
}
