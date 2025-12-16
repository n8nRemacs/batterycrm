package com.avito.android.photo_camera_view;

import android.net.Uri;
import com.avito.android.util.rx3.C35896f0;
import java.util.Collections;
import kotlin.Metadata;

/* compiled from: CameraItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/net/Uri;", "it", "Lkotlin/G0;", "accept", "(Landroid/net/Uri;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class u<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33174e f216422b;

    public u(C33174e c33174e) {
        this.f216422b = c33174e;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Uri uri = (Uri) obj;
        C33174e c33174e = this.f216422b;
        x xVar = c33174e.f216384m;
        if (xVar != null) {
            xVar.M30();
        }
        c33174e.f216376e.get().E9(Collections.singletonList(uri));
        c33174e.f216397z = false;
        x xVar2 = c33174e.f216384m;
        if (xVar2 != null) {
            xVar2.L70(true);
        }
        C35896f0.g(c33174e.f216392u, new k(c33174e));
    }
}
