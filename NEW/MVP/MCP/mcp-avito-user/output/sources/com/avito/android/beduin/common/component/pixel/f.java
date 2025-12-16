package com.avito.android.beduin.common.component.pixel;

import Y61.l;
import android.view.View;
import kotlin.Metadata;

/* compiled from: BeduinPixelLayout.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/component/pixel/f;", "Landroid/view/View;", "Lio/reactivex/rxjava3/disposables/d;", "disposable", "Lkotlin/G0;", "setTrackingDisposable", "(Lio/reactivex/rxjava3/disposables/d;)V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f extends View {

    /* renamed from: b, reason: collision with root package name */
    @l
    public io.reactivex.rxjava3.disposables.d f102114b;

    public final void setTrackingDisposable(@l io.reactivex.rxjava3.disposables.d disposable) {
        io.reactivex.rxjava3.disposables.d dVar = this.f102114b;
        if (dVar != null) {
            dVar.dispose();
        }
        this.f102114b = disposable;
    }
}
