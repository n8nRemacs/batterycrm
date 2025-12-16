package com.avito.android.async_phone.public_module.loading_helper;

import Y41.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.P2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import ru.avito.component.serp.PhoneLoadingState;

/* compiled from: AsyncPhoneRequestLoadingHelper.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class h<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H f92249b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f92250c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f92251d;

    /* JADX WARN: Multi-variable type inference failed */
    public h(l<? super PhoneLoadingState, G0> lVar, l<? super DeepLink, G0> lVar2, l<? super ApiError, G0> lVar3) {
        this.f92249b = (H) lVar;
        this.f92250c = lVar2;
        this.f92251d = lVar3;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [Y41.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [Y41.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, kotlin.jvm.internal.H] */
    @Override // l41.g
    public final void accept(Object obj) {
        P2 p22 = (P2) obj;
        this.f92249b.invoke(p22 instanceof P2.c ? PhoneLoadingState.f430442c : PhoneLoadingState.f430441b);
        if (p22 instanceof P2.b) {
            this.f92250c.invoke(((P2.b) p22).f318720a);
        } else if (p22 instanceof P2.a) {
            this.f92251d.invoke(((P2.a) p22).f318719a);
        }
    }
}
