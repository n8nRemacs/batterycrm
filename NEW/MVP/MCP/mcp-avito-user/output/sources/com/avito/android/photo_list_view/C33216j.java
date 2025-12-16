package com.avito.android.photo_list_view;

import Ag.CallableC13028a;
import android.net.Uri;
import io.reactivex.rxjava3.internal.operators.maybe.s0;
import kotlin.Metadata;

/* compiled from: ImageListInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/photo_list_view/G;", "image", "Lio/reactivex/rxjava3/core/O;", "apply", "(Lcom/avito/android/photo_list_view/G;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.photo_list_view.j, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C33216j<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33217k f218169b;

    public C33216j(C33217k c33217k) {
        this.f218169b = c33217k;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        G g12 = (G) obj;
        Uri uri = g12.f218069b;
        if (uri == null) {
            return io.reactivex.rxjava3.core.I.q(g12);
        }
        C33217k c33217k = this.f218169b;
        c33217k.getClass();
        return new s0(new io.reactivex.rxjava3.internal.operators.maybe.K(new CallableC13028a(23, c33217k, uri)).l().j(new C33215i(g12)), g12);
    }
}
