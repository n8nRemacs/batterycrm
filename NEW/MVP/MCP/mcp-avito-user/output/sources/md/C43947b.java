package mD;

import Y61.k;
import com.avito.android.ab_tests.InterfaceC27642e;
import com.avito.android.ab_tests.c0;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.features.auto.ab_tests.configs.AutoAdvertDetailsI2IDealerBlockTestGroup;
import com.avito.android.features.auto.ab_tests.configs.AutoGlowFiltersTestGroup;
import com.avito.android.features.auto.ab_tests.configs.AutoMediaMotoWaterTestGroup;
import javax.inject.Inject;
import kotlin.Metadata;
import lD.C43617a;
import nD.C44234a;
import nD.C44236c;
import nD.e;
import nD.h;
import u3.g;
import u3.l;

/* compiled from: AutoAbTestsProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LmD/b;", "LmD/a;", "_avito-discouraged_avito-feature_auto"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mD.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C43947b implements InterfaceC43946a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C43617a f414403a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c0 f414404b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC27642e f414405c;

    @Inject
    public C43947b(@k C43617a c43617a, @k c0 c0Var, @k InterfaceC27642e interfaceC27642e) {
        this.f414403a = c43617a;
        this.f414404b = c0Var;
        this.f414405c = interfaceC27642e;
    }

    @Override // mD.InterfaceC43946a
    @k
    public final l<SimpleTestGroupWithNone> S5() {
        return new l<>(this.f414405c.c(new h()), this.f414404b);
    }

    @Override // mD.InterfaceC43946a
    @k
    public final g<AutoGlowFiltersTestGroup> a() {
        return new g<>(this.f414405c.c(new C44236c(this.f414403a)), this.f414404b);
    }

    @Override // mD.InterfaceC43946a
    @k
    public final l<AutoMediaMotoWaterTestGroup> b() {
        return new l<>(this.f414405c.c(new e(this.f414403a)), this.f414404b);
    }

    @Override // mD.InterfaceC43946a
    @k
    public final l<SimpleTestGroupWithNone> c() {
        return new l<>(this.f414405c.c(new nD.g()), this.f414404b);
    }

    @Override // mD.InterfaceC43946a
    @k
    public final g<AutoAdvertDetailsI2IDealerBlockTestGroup> d() {
        return new g<>(this.f414405c.c(new C44234a()), this.f414404b);
    }
}
