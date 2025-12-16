package Pw0;

import SK0.b;
import Y61.k;
import com.avito.android.C36135w2;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.reflect.n;

/* compiled from: SimilarAdvertFeedbackHelper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPw0/c;", "LPw0/b;", "_avito_similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements InterfaceC14847b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SK0.b f13372a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C36135w2 f13373b;

    @Inject
    public c(@k SK0.b bVar, @k C36135w2 c36135w2) {
        this.f13372a = bVar;
        this.f13373b = c36135w2;
    }

    @Override // Pw0.InterfaceC14847b
    public final void a(@k C14846a c14846a) {
        C36135w2 c36135w2 = this.f13373b;
        c36135w2.getClass();
        n<Object> nVar = C36135w2.f327457X[11];
        if (((Boolean) c36135w2.f327489j.a().invoke()).booleanValue()) {
            b.a.a(this.f13372a, c14846a, null, null, null, 14);
        }
    }
}
