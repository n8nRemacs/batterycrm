package QG0;

import Y61.k;
import com.avito.android.remote.model.SearchParam;
import com.avito.android.remote.model.SearchParams;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import lD.C43617a;

/* compiled from: UsedCarsFeedbackHelper.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQG0/d;", "LQG0/c;", "_avito_used-cars-uxfeedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final g f13641a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C43617a f13642b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SK0.b f13643c;

    @Inject
    public d(@k g gVar, @k C43617a c43617a, @k SK0.b bVar) {
        this.f13641a = gVar;
        this.f13642b = c43617a;
        this.f13643c = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    @Override // QG0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@Y61.k com.avito.android.remote.model.SearchParams r11) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: QG0.d.a(com.avito.android.remote.model.SearchParams):void");
    }

    @Override // QG0.c
    public final void b(@k SearchParams searchParams) {
        SearchParam<?> searchParam;
        Map<String, SearchParam<?>> params = searchParams.getParams();
        if (L.f((params == null || (searchParam = params.get("1283")) == null) ? null : searchParam.getValue(), "14756")) {
            this.f13641a.c();
        }
    }

    /* compiled from: UsedCarsFeedbackHelper.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"QG0/d$a", "LSK0/d;", "_avito_used-cars-uxfeedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements SK0.d {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f13645c;

        public a(b bVar) {
            this.f13645c = bVar;
        }

        @Override // SK0.d
        public final void v5(@k String str) {
            d.this.f13641a.a(this.f13645c);
        }

        @Override // SK0.d
        public final void Od(@k String str) {
        }

        @Override // SK0.d
        public final void W2(@k String str) {
        }

        @Override // SK0.d
        public final void ha(@k String str) {
        }
    }
}
