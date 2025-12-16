package com.avito.android.bxcontent;

import com.avito.android.bxcontent.mvi.entity.InterfaceC29127b;
import kotlin.Metadata;

/* compiled from: BxContentPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lorg/funktionale/option/a;", "", "it", "Lkotlin/G0;", "accept", "(Lorg/funktionale/option/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class D0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C29253t0 f109318b;

    public D0(C29253t0 c29253t0) {
        this.f109318b = c29253t0;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Object objA;
        org.funktionale.option.a aVar = (org.funktionale.option.a) obj;
        C29235n c29235n = this.f109318b.f112947R;
        if (c29235n != null) {
            C0 c02 = C0.f109315l;
            if (aVar.b()) {
                c02.getClass();
                objA = Boolean.TRUE;
            } else {
                objA = aVar.a();
            }
            c29235n.accept(new InterfaceC29127b.G0(((Boolean) objA).booleanValue()));
        }
    }
}
