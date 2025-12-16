package s40;

import Y61.k;
import com.avito.android.offlinization.C32914b;
import com.avito.android.offlinization.D;
import com.avito.android.offlinization.j;
import com.avito.android.util.C;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okio.C44805o;
import s40.InterfaceC47995b;

/* compiled from: RequestInfoProvider.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ls40/d;", "Ls40/c;", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: s40.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C47997d implements InterfaceC47996c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.offlinization.e f437467a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C f437468b;

    @Inject
    public C47997d(@k com.avito.android.offlinization.e eVar, @k C c12) {
        this.f437467a = eVar;
        this.f437468b = c12;
    }

    @Override // s40.InterfaceC47996c
    @k
    public final InterfaceC47995b a(@k Request request) {
        return this.f437467a.a(request);
    }

    @Override // s40.InterfaceC47996c
    @k
    public final String b(@k Request request) {
        InterfaceC47995b interfaceC47995bA = this.f437467a.a(request);
        if (!(interfaceC47995bA instanceof InterfaceC47995b.C12608b)) {
            throw new IllegalArgumentException("Requests without offline mode don't have a cache key");
        }
        String strC = c(request.url(), (InterfaceC47995b.C12608b) interfaceC47995bA);
        C44805o.f420139e.getClass();
        return C44805o.a.c(strC).c("MD5").e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s40.InterfaceC47996c
    @k
    public final String c(@k HttpUrl httpUrl, @k InterfaceC47995b.C12608b c12608b) {
        String strConcat;
        Object next;
        HttpUrl.Builder builderNewBuilder = httpUrl.newBuilder();
        C47994a c47994a = c12608b.f437466b;
        if (c47994a.f437462a.isEmpty()) {
            Set<j> set = c47994a.f437463b;
            if (!set.isEmpty()) {
                for (j jVar : set) {
                    if (jVar instanceof j.a) {
                        builderNewBuilder.removeAllQueryParameters(((j.a) jVar).f208587a);
                    } else if (jVar instanceof j.b) {
                        j.b bVar = (j.b) jVar;
                        if (L.f(httpUrl.queryParameter(bVar.f208588a), ((j.b) jVar).f208589b)) {
                            builderNewBuilder.removeAllQueryParameters(bVar.f208588a);
                        }
                    }
                }
            }
        } else {
            for (String str : httpUrl.queryParameterNames()) {
                Iterator<T> it = c47994a.f437462a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (L.f(((j) next).getF208588a(), str)) {
                        break;
                    }
                }
                if (next == null) {
                    builderNewBuilder.removeAllQueryParameters(str);
                }
            }
        }
        HttpUrl httpUrlBuild = builderNewBuilder.build();
        Set<String> setQueryParameterNames = httpUrlBuild.queryParameterNames();
        ArrayList arrayList = new ArrayList(C42745f0.q(setQueryParameterNames, 10));
        for (String str2 : setQueryParameterNames) {
            arrayList.add(new Q(str2, httpUrlBuild.queryParameter(str2)));
        }
        List<Q> listB0 = C42745f0.B0(arrayList, new C32914b());
        HttpUrl.Builder builderQuery = httpUrlBuild.newBuilder().query(null);
        for (Q q12 : listB0) {
            builderQuery.addQueryParameter((String) q12.f406619b, (String) q12.f406620c);
        }
        HttpUrl httpUrlBuild2 = builderQuery.build();
        StringBuilder sb2 = new StringBuilder("v");
        sb2.append(this.f437468b.getF125492l());
        sb2.append('@');
        sb2.append(httpUrlBuild2.encodedPath());
        String strEncodedQuery = httpUrlBuild2.encodedQuery();
        if (strEncodedQuery == null || (strConcat = "?".concat(strEncodedQuery)) == null) {
            strConcat = "";
        }
        sb2.append(strConcat);
        return sb2.toString();
    }

    @Override // s40.InterfaceC47996c
    @k
    public final InterfaceC47995b d(@k Request request) {
        return (D.a(request) || !L.f(request.method(), "GET")) ? InterfaceC47995b.a.f437464a : this.f437467a.a(request);
    }
}
