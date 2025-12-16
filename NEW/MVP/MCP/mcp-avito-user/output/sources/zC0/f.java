package ZC0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TariffEditConvertInfo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZC0/f;", "", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final QC0.a f19982a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final aD0.e f19983b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e f19984c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f19985d;

    public f(@k QC0.a aVar, @l aD0.e eVar, @k e eVar2, @l DeepLink deepLink) {
        this.f19982a = aVar;
        this.f19983b = eVar;
        this.f19984c = eVar2;
        this.f19985d = deepLink;
    }

    public /* synthetic */ f(QC0.a aVar, aD0.e eVar, e eVar2, DeepLink deepLink, int i12, C42822w c42822w) {
        this(aVar, eVar, eVar2, (i12 & 8) != 0 ? null : deepLink);
    }
}
