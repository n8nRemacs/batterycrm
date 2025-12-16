package zH0;

import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.advert_core.feature_teasers.common.k;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MyAdvertDetailsFeatureTeaserResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LzH0/a;", "Lcom/avito/android/advert_core/feature_teasers/common/k;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zH0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50466a implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f444004a;

    @Inject
    public C50466a(@Y61.k Resources resources) {
        this.f444004a = resources;
    }

    @Override // com.avito.android.advert_core.feature_teasers.common.k
    public final boolean c() {
        return this.f444004a.getBoolean(R.bool.is_tablet);
    }

    @Override // com.avito.android.advert_core.feature_teasers.common.k
    public final boolean d() {
        return this.f444004a.getConfiguration().orientation == 2;
    }
}
