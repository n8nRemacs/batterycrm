package com.avito.android.user_favorites;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.InterfaceC29975l;
import com.avito.android.favorites.FavoritesSpace;
import com.avito.android.user_viewed.feature.UserViewedTestGroup;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: UserFavoritesInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_favorites/q;", "Lcom/avito/android/user_favorites/p;", "_avito_user-favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class q implements p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.G f316925a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final E f316926b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.db.n f316927c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.common.a f316928d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TV.f f316929e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final FavoritesSpace f316930f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final AD.a f316931g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Integer f316932h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f316933i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final u3.g<UserViewedTestGroup> f316934j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.timestamp_storage.domain.d f316935k;

    /* compiled from: UserFavoritesInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f316936a;

        static {
            int[] iArr = new int[FavoritesSpace.values().length];
            try {
                iArr[FavoritesSpace.f156264f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FavoritesSpace.f156265g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FavoritesSpace.f156266h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f316936a = iArr;
        }
    }

    @Inject
    public q(@Y61.k com.avito.android.account.G g12, @Y61.k E e12, @Y61.k com.avito.android.db.n nVar, @InterfaceC29975l @Y61.k com.avito.android.common.a aVar, @Y61.k TV.f fVar, @Y61.k FavoritesSpace favoritesSpace, @Y61.k AD.a aVar2, @Y61.l Integer num, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k u3.g<UserViewedTestGroup> gVar, @Y61.k com.avito.android.timestamp_storage.domain.d dVar) {
        this.f316925a = g12;
        this.f316926b = e12;
        this.f316927c = nVar;
        this.f316928d = aVar;
        this.f316929e = fVar;
        this.f316930f = favoritesSpace;
        this.f316931g = aVar2;
        this.f316932h = num;
        this.f316933i = interfaceC28373a;
        this.f316934j = gVar;
        this.f316935k = dVar;
    }

    public static String b(int i12) {
        return i12 <= 0 ? "" : i12 >= 100 ? "99+" : String.valueOf(i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.avito.android.user_favorites.adapter.FavoritesTab> a(java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_favorites.q.a(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public /* synthetic */ q(com.avito.android.account.G g12, E e12, com.avito.android.db.n nVar, com.avito.android.common.a aVar, TV.f fVar, FavoritesSpace favoritesSpace, AD.a aVar2, Integer num, InterfaceC28373a interfaceC28373a, u3.g gVar, com.avito.android.timestamp_storage.domain.d dVar, int i12, C42822w c42822w) {
        this(g12, e12, nVar, aVar, fVar, favoritesSpace, aVar2, (i12 & 128) != 0 ? null : num, interfaceC28373a, gVar, dVar);
    }
}
