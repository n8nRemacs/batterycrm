package com.avito.android.remote.analytics.image;

import android.util.LruCache;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.C42770s0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;
import kotlin.sequences.f0;
import kotlin.text.C43066x;
import kotlin.w0;
import okhttp3.Headers;
import okhttp3.Request;

/* compiled from: ImageCdnHeadersStorageImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/analytics/image/f;", "Lcom/avito/android/remote/analytics/image/e;", "<init>", "()V", "a", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes17.dex */
public final class f implements e {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final Set<String> f253127c;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Object f253128a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Object f253129b;

    /* compiled from: ImageCdnHeadersStorageImpl.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/remote/analytics/image/f$a;", "", "<init>", "()V", "", "CACHE_SIZE", "I", "DIAG_CODES_CACHE_SIZE", "", "DIAG_CODES_HEADER_NAME", "Ljava/lang/String;", "", "cdnCacheHeaderNames", "Ljava/util/Set;", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ImageCdnHeadersStorageImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/util/LruCache;", "", "Lkotlin/w0;", "invoke", "()Landroid/util/LruCache;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<LruCache<String, w0>> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f253130l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final LruCache<String, w0> invoke() {
            return new LruCache<>(100);
        }
    }

    /* compiled from: ImageCdnHeadersStorageImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/util/LruCache;", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<LruCache<String, String>> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f253131l = new c();

        public c() {
            super(0);
        }

        @Override // Y41.a
        public final LruCache<String, String> invoke() {
            return new LruCache<>(25);
        }
    }

    static {
        new a(null);
        f253127c = C42756l.l0(new String[]{"cf-cache-status", "x-cdn-shield-cache", "cache"});
    }

    @Inject
    public f() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406614b;
        this.f253128a = C42727D.b(lazyThreadSafetyMode, c.f253131l);
        this.f253129b = C42727D.b(lazyThreadSafetyMode, b.f253130l);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.remote.analytics.image.e
    public final void a(@Y61.k Request request, @Y61.k Headers headers) {
        String url = request.url().getUrl();
        f0 f0Var = new f0(C43033p.i(new C42770s0(headers), i.f253133l), new g());
        if (f0Var.iterator().hasNext()) {
            ((LruCache) this.f253128a.getValue()).put(url, C43033p.w(f0Var, ",", h.f253132l, 24));
        }
        List<String> listValues = headers.values("Avito-Img-Diag");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listValues.iterator();
        while (it.hasNext()) {
            C42745f0.h(C43066x.f0((String) it.next(), new String[]{","}, 0, 6), arrayList);
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(C43066x.y0(C43066x.A0((String) it2.next()).toString()));
        }
        ArrayList arrayListC = C42745f0.C(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayListC.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            int iIntValue = ((Number) next).intValue();
            if ((iIntValue >= 0) & (iIntValue < 64)) {
                arrayList3.add(next);
            }
        }
        int i12 = w0.f410662c;
        Iterator it4 = arrayList3.iterator();
        long jIntValue = 0;
        while (it4.hasNext()) {
            jIntValue |= 1 << ((Number) it4.next()).intValue();
        }
        if (jIntValue != 0) {
            ((LruCache) this.f253129b.getValue()).put(url, w0.a(jIntValue));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.remote.analytics.image.e
    @Y61.l
    public final String b(@Y61.k String str) {
        return (String) ((LruCache) this.f253128a.getValue()).get(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.remote.analytics.image.e
    @Y61.l
    public final w0 c(@Y61.k String str) {
        return (w0) ((LruCache) this.f253129b.getValue()).get(str);
    }
}
