package W60;

import W60.d;
import Y61.k;
import Y61.l;
import androidx.view.C23060r0;
import com.avito.android.personal_banner.feature.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BannerFeatureViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LW60/b;", "LW60/d;", "a", "_avito_personal-banner_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b extends d {

    /* compiled from: BannerFeatureViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LW60/b$a;", "LW60/d$a;", "_avito_personal-banner_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements d.a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final t f17751a;

        @Inject
        public a(@k t tVar) {
            this.f17751a = tVar;
        }

        @Override // W60.d.a
        @k
        public final b a(@l C23060r0 c23060r0) {
            return new b(this.f17751a, c23060r0, null);
        }
    }

    public b(t tVar, C23060r0 c23060r0, C42822w c42822w) {
        super(tVar, c23060r0 == null ? new C23060r0() : c23060r0, null, 4, null);
    }
}
