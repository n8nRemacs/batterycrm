package P3;

import Y61.k;
import com.avito.android.ab_tests.InterfaceC27642e;
import com.avito.android.ab_tests.c0;
import com.avito.android.adaptive.image.ab_test.AdaptiveImageLoadingAbTestGroup;
import javax.inject.Inject;
import kotlin.Metadata;
import u3.l;

/* compiled from: ImageLoaderAbTestsProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LP3/c;", "LP3/b;", "_common_adaptive-image-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f12795a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c0 f12796b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC27642e f12797c;

    @Inject
    public c(@k e eVar, @k c0 c0Var, @k InterfaceC27642e interfaceC27642e) {
        this.f12795a = eVar;
        this.f12796b = c0Var;
        this.f12797c = interfaceC27642e;
    }

    @Override // P3.b
    @k
    public final l<AdaptiveImageLoadingAbTestGroup> a() {
        return new l<>(this.f12797c.c(new a(this.f12795a)), this.f12796b);
    }
}
