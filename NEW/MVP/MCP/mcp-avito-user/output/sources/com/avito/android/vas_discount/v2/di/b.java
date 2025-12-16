package com.avito.android.vas_discount.v2.di;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.user_adverts_views_pub.a;
import kotlin.Metadata;

/* compiled from: UserAdvertItemClickStreamListener.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_discount/v2/di/b;", "Lcom/avito/android/user_adverts_views_pub/a;", "<init>", "()V", "_avito_vas-discount_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements com.avito.android.user_adverts_views_pub.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.e<a.InterfaceC9834a> f319778b = new io.reactivex.rxjava3.subjects.e<>();

    @Override // com.avito.android.user_adverts_views_pub.a
    public final void X(@Y61.k a.InterfaceC9834a interfaceC9834a) {
        this.f319778b.onNext(interfaceC9834a);
    }

    @Override // com.avito.android.user_adverts_views_pub.a
    public final void K(@Y61.k DeepLink deepLink) {
    }

    @Override // com.avito.android.user_adverts_views_pub.a
    public final void U3(@Y61.k DeepLink deepLink) {
    }

    @Override // com.avito.android.user_adverts_views_pub.a
    public final void x3(@Y61.k DeepLink deepLink) {
    }

    @Override // com.avito.android.user_adverts_views_pub.a
    public final void u3(@Y61.k String str, @Y61.l String str2, boolean z12) {
    }
}
