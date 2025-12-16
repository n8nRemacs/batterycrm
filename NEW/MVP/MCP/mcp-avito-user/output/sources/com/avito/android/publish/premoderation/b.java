package com.avito.android.publish.premoderation;

import android.os.Bundle;
import com.avito.android.remote.model.AdvertDuplicateResult;
import com.avito.android.util.C35966w1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDuplicateFragment.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_publish_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b {

    /* compiled from: AdvertDuplicateFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Bundle, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AdvertDuplicateResult f238278l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AdvertDuplicateResult advertDuplicateResult) {
            super(1);
            this.f238278l = advertDuplicateResult;
        }

        @Override // Y41.l
        public final G0 invoke(Bundle bundle) {
            bundle.putParcelable("key_advert_duplicate_data", this.f238278l);
            return G0.f406611a;
        }
    }

    @Y61.k
    public static final AdvertDuplicateFragment a(@Y61.k AdvertDuplicateResult advertDuplicateResult) {
        AdvertDuplicateFragment advertDuplicateFragment = new AdvertDuplicateFragment();
        C35966w1.a(advertDuplicateFragment, -1, new a(advertDuplicateResult));
        return advertDuplicateFragment;
    }
}
