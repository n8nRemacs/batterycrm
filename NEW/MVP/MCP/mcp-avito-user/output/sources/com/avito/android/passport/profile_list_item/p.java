package com.avito.android.passport.profile_list_item;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ProfileListLegalItem.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_list_item/p;", "Lcom/avito/android/passport/profile_list_item/n;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class p implements n {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public N f213662b;

    @Inject
    public p() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.passport.profile_list_item.n
    public final void H3(@Y61.k Y41.l<? super DeepLink, G0> lVar) {
        this.f213662b = (N) lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ((r) eVar).H3(new o(this));
    }
}
