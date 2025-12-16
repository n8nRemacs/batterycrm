package iE;

import Y61.k;
import com.avito.android.ab_tests.InterfaceC27642e;
import com.avito.android.ab_tests.d0;
import jE.C42239a;
import javax.inject.Inject;
import kotlin.Metadata;
import u3.f;

/* compiled from: SoccomAbTestsProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LiE/b;", "LiE/a;", "_avito-discouraged_avito-feature_soccom"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: iE.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C41273b implements InterfaceC41272a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final hE.b f398450a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d0 f398451b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC27642e f398452c;

    @Inject
    public C41273b(@k hE.b bVar, @k d0 d0Var, @k InterfaceC27642e interfaceC27642e) {
        this.f398450a = bVar;
        this.f398451b = d0Var;
        this.f398452c = interfaceC27642e;
    }

    @Override // iE.InterfaceC41272a
    @k
    public final f a() {
        return new f(this.f398452c.c(new C42239a(this.f398450a)), this.f398451b);
    }

    @Override // iE.InterfaceC41272a
    @k
    public final f b() {
        return new f(this.f398452c.c(new jE.c(this.f398450a)), this.f398451b);
    }
}
