package qD;

import Y61.k;
import com.avito.android.ab_tests.InterfaceC27642e;
import com.avito.android.ab_tests.c0;
import com.avito.android.features.autoteka.ab_tests.configs.ChoosingPurchaseTestGroup;
import javax.inject.Inject;
import kotlin.Metadata;
import pD.C46934a;
import rD.C47526a;
import u3.f;

/* compiled from: AutotekaAbTestsProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LqD/b;", "LqD/a;", "_avito-discouraged_avito-feature_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements InterfaceC47282a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C46934a f429126a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c0 f429127b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC27642e f429128c;

    @Inject
    public b(@k C46934a c46934a, @k c0 c0Var, @k InterfaceC27642e interfaceC27642e) {
        this.f429126a = c46934a;
        this.f429127b = c0Var;
        this.f429128c = interfaceC27642e;
    }

    @Override // qD.InterfaceC47282a
    @k
    public final f<ChoosingPurchaseTestGroup> a() {
        return new f<>(this.f429128c.c(new C47526a(this.f429126a)), this.f429127b);
    }
}
