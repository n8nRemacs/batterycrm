package TH0;

import SK0.b;
import SK0.d;
import Y61.k;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DeactivateAdvertUxFeedbackHelper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTH0/b;", "LTH0/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements TH0.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SK0.b f15509a;

    /* compiled from: DeactivateAdvertUxFeedbackHelper.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"TH0/b$a", "LSK0/c;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements SK0.c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f15510a;

        public a(String str) {
            this.f15510a = str;
        }

        @Override // SK0.c
        @k
        /* renamed from: a, reason: from getter */
        public final String getF15510a() {
            return this.f15510a;
        }
    }

    @Inject
    public b(@k SK0.b bVar) {
        this.f15509a = bVar;
    }

    @Override // TH0.a
    public final void a(@k String str, @k Y41.a<G0> aVar) {
        b.a.a(this.f15509a, new a(str), null, null, new C1054b(aVar), 6);
    }

    /* compiled from: DeactivateAdvertUxFeedbackHelper.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"TH0/b$b", "LSK0/d;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: TH0.b$b, reason: collision with other inner class name */
    public static final class C1054b implements d {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f15511b;

        public C1054b(Y41.a<G0> aVar) {
            this.f15511b = aVar;
        }

        @Override // SK0.d
        public final void Od(@k String str) {
            this.f15511b.invoke();
        }

        @Override // SK0.d
        public final void W2(@k String str) {
            this.f15511b.invoke();
        }

        @Override // SK0.d
        public final void ha(@k String str) {
            this.f15511b.invoke();
        }

        @Override // SK0.d
        public final void v5(@k String str) {
        }
    }
}
