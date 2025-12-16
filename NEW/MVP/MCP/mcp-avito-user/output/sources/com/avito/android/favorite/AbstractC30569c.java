package com.avito.android.favorite;

import com.avito.android.remote.model.AdvertisementVerticalAlias;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FavoriteAdvertsEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/favorite/c;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/favorite/c$a;", "Lcom/avito/android/favorite/c$b;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.favorite.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC30569c {

    /* compiled from: FavoriteAdvertsEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite/c$a;", "Lcom/avito/android/favorite/c;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.favorite.c$a */
    public static final class a extends AbstractC30569c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f155167a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final AbstractC30567a f155168b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final AdvertisementVerticalAlias f155169c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final Double f155170d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f155171e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final Boolean f155172f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final String f155173g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final String f155174h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final String f155175i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public final Map<String, String> f155176j;

        public a() {
            throw null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(String str, AbstractC30567a abstractC30567a, AdvertisementVerticalAlias advertisementVerticalAlias, Double d12, String str2, Boolean bool, String str3, String str4, String str5, Map map, int i12, C42822w c42822w) {
            C42822w c42822w2 = null;
            advertisementVerticalAlias = (i12 & 4) != 0 ? null : advertisementVerticalAlias;
            d12 = (i12 & 8) != 0 ? null : d12;
            str2 = (i12 & 16) != 0 ? null : str2;
            bool = (i12 & 32) != 0 ? null : bool;
            str3 = (i12 & 64) != 0 ? null : str3;
            str4 = (i12 & 128) != 0 ? null : str4;
            str5 = (i12 & 256) != 0 ? null : str5;
            map = (i12 & 512) != 0 ? null : map;
            super(c42822w2);
            this.f155167a = str;
            this.f155168b = abstractC30567a;
            this.f155169c = advertisementVerticalAlias;
            this.f155170d = d12;
            this.f155171e = str2;
            this.f155172f = bool;
            this.f155173g = str3;
            this.f155174h = str4;
            this.f155175i = str5;
            this.f155176j = map;
        }
    }

    /* compiled from: FavoriteAdvertsEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite/c$b;", "Lcom/avito/android/favorite/c;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.favorite.c$b */
    public static final class b extends AbstractC30569c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<String> f155177a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final AbstractC30567a f155178b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f155179c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f155180d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final Map<String, String> f155181e;

        public b() {
            throw null;
        }

        public /* synthetic */ b(List list, AbstractC30567a abstractC30567a, String str, String str2, Map map, int i12, C42822w c42822w) {
            this(list, abstractC30567a, (i12 & 4) != 0 ? null : str, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? null : map);
        }

        public b(String str, AbstractC30567a abstractC30567a, String str2, String str3, Map map, int i12, C42822w c42822w) {
            this(Collections.singletonList(str), abstractC30567a, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : map);
        }

        public b(@Y61.k List<String> list, @Y61.k AbstractC30567a abstractC30567a, @Y61.l String str, @Y61.l String str2, @Y61.l Map<String, String> map) {
            super(null);
            this.f155177a = list;
            this.f155178b = abstractC30567a;
            this.f155179c = str;
            this.f155180d = str2;
            this.f155181e = map;
        }
    }

    public /* synthetic */ AbstractC30569c(C42822w c42822w) {
        this();
    }

    public AbstractC30569c() {
    }
}
