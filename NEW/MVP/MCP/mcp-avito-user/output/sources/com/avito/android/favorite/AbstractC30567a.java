package com.avito.android.favorite;

import com.avito.android.analytics.provider.clickstream.ScreenIdField;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FavoriteActionSource.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0082\u0001\u000e\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lcom/avito/android/favorite/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "Lcom/avito/android/favorite/a$a;", "Lcom/avito/android/favorite/a$b;", "Lcom/avito/android/favorite/a$d;", "Lcom/avito/android/favorite/a$e;", "Lcom/avito/android/favorite/a$f;", "Lcom/avito/android/favorite/a$g;", "Lcom/avito/android/favorite/a$h;", "Lcom/avito/android/favorite/a$i;", "Lcom/avito/android/favorite/a$j;", "Lcom/avito/android/favorite/a$k;", "Lcom/avito/android/favorite/a$l;", "Lcom/avito/android/favorite/a$m;", "Lcom/avito/android/favorite/a$n;", "Lcom/avito/android/favorite/a$o;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.favorite.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC30567a {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final c f155164c = new c(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f155165a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f155166b;

    /* compiled from: FavoriteActionSource.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite/a$a;", "Lcom/avito/android/favorite/a;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.favorite.a$a, reason: collision with other inner class name */
    public static final class C4547a extends AbstractC30567a {
        public C4547a(@Y61.l String str) {
            super("aiAssistantSnippet", str, null);
        }
    }

    /* compiled from: FavoriteActionSource.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite/a$b;", "Lcom/avito/android/favorite/a;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.favorite.a$b */
    public static final class b extends AbstractC30567a {
        public b(@Y61.l String str) {
            super("cart", str, null);
        }
    }

    /* compiled from: FavoriteActionSource.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/avito/android/favorite/a$c;", "", "<init>", "()V", "", "AI_ASSISTANT_SNIPPET_ID", "Ljava/lang/String;", "CART_ACTION_ID", "EXTENDED_PROFILE_ACTION_ID", "FAVORITES_ACTION_ID", "FROM_PAGE_ITEM_SCROLL", "ITEM_ACTION_ID", "PAID_CVS_ACTION_ID", "SNIPPET_ACTION_ID", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.favorite.a$c */
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    /* compiled from: FavoriteActionSource.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite/a$d;", "Lcom/avito/android/favorite/a;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.favorite.a$d */
    public static final class d extends AbstractC30567a {
        public d(@Y61.l String str) {
            super("extendedProfile", str, null);
        }
    }

    /* compiled from: FavoriteActionSource.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite/a$e;", "Lcom/avito/android/favorite/a;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.favorite.a$e */
    public static final class e extends AbstractC30567a {
        public e(@Y61.l String str) {
            super("favourites", str, null);
        }
    }

    /* compiled from: FavoriteActionSource.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite/a$f;", "Lcom/avito/android/favorite/a;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.favorite.a$f */
    public static final class f extends AbstractC30567a {
        public /* synthetic */ f(String str, boolean z12, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? false : z12);
        }

        public f(@Y61.l String str, boolean z12) {
            super(z12 ? "item_scroll" : "item", str, null);
        }
    }

    /* compiled from: FavoriteActionSource.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite/a$g;", "Lcom/avito/android/favorite/a;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.favorite.a$g */
    public static final class g extends AbstractC30567a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(@Y61.l String str) {
            super("price_history", str, null);
            ScreenIdField screenIdField = ScreenIdField.f90251c;
        }
    }

    /* compiled from: FavoriteActionSource.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite/a$h;", "Lcom/avito/android/favorite/a;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.favorite.a$h */
    public static final class h extends AbstractC30567a {
    }

    /* compiled from: FavoriteActionSource.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite/a$i;", "Lcom/avito/android/favorite/a;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.favorite.a$i */
    public static final class i extends AbstractC30567a {
        public i(@Y61.l String str) {
            super("paidCvs", str, null);
        }
    }

    /* compiled from: FavoriteActionSource.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite/a$j;", "Lcom/avito/android/favorite/a;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.favorite.a$j */
    public static final class j extends AbstractC30567a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(@Y61.l String str) {
            super("item_gallery", str, null);
            ScreenIdField screenIdField = ScreenIdField.f90251c;
        }
    }

    /* compiled from: FavoriteActionSource.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite/a$k;", "Lcom/avito/android/favorite/a;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.favorite.a$k */
    public static final class k extends AbstractC30567a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(@Y61.l String str) {
            super("item_i2i_rec", str, null);
            ScreenIdField screenIdField = ScreenIdField.f90251c;
        }
    }

    /* compiled from: FavoriteActionSource.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite/a$l;", "Lcom/avito/android/favorite/a;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.favorite.a$l */
    public static final class l extends AbstractC30567a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(@Y61.l String str) {
            super("serp", str, null);
            ScreenIdField screenIdField = ScreenIdField.f90251c;
        }
    }

    /* compiled from: FavoriteActionSource.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite/a$m;", "Lcom/avito/android/favorite/a;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.favorite.a$m */
    public static final class m extends AbstractC30567a {
        public m(@Y61.l String str) {
            super("snippet", str, null);
        }
    }

    /* compiled from: FavoriteActionSource.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite/a$n;", "Lcom/avito/android/favorite/a;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.favorite.a$n */
    public static final class n extends AbstractC30567a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(@Y61.l String str) {
            super("vertical_recent_items", str, null);
            ScreenIdField screenIdField = ScreenIdField.f90251c;
        }
    }

    /* compiled from: FavoriteActionSource.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite/a$o;", "Lcom/avito/android/favorite/a;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.favorite.a$o */
    public static final class o extends AbstractC30567a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(@Y61.l String str) {
            super("user_viewed", str, null);
            ScreenIdField screenIdField = ScreenIdField.f90251c;
        }
    }

    public AbstractC30567a(String str, String str2, C42822w c42822w) {
        this.f155165a = str;
        this.f155166b = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC30567a abstractC30567a = (AbstractC30567a) obj;
        return L.f(this.f155165a, abstractC30567a.f155165a) && L.f(this.f155166b, abstractC30567a.f155166b);
    }

    public final int hashCode() {
        int iHashCode = this.f155165a.hashCode() * 31;
        String str = this.f155166b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
