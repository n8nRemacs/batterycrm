package com.avito.android.messenger.map.search;

import KY.a;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: GeoSearchView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/map/search/z;", "Lcom/avito/android/mvi/e;", "Lcom/avito/android/messenger/map/search/z$c;", "b", "c", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface z extends com.avito.android.mvi.e<c> {

    /* compiled from: GeoSearchView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: GeoSearchView.kt */
    @P
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/messenger/map/search/z$b;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/messenger/map/search/z$b$a;", "Lcom/avito/android/messenger/map/search/z$b$b;", "Lcom/avito/android/messenger/map/search/z$b$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: GeoSearchView.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/map/search/z$b$a;", "Lcom/avito/android/messenger/map/search/z$b;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final a f196624a = new a();

            public a() {
                super(null);
            }

            @Y61.k
            public final String toString() {
                return "ListState.Empty";
            }
        }

        /* compiled from: GeoSearchView.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/map/search/z$b$b;", "Lcom/avito/android/messenger/map/search/z$b;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.map.search.z$b$b, reason: collision with other inner class name */
        public static final class C5783b extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C5783b f196625a = new C5783b();

            public C5783b() {
                super(null);
            }

            @Y61.k
            public final String toString() {
                return "ListState.EmptyWithPlaceHolder";
            }
        }

        /* compiled from: GeoSearchView.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/map/search/z$b$c;", "Lcom/avito/android/messenger/map/search/z$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final List<com.avito.android.messenger.map.search.adapter.a> f196626a;

            public c(@Y61.k List<com.avito.android.messenger.map.search.adapter.a> list) {
                super(null);
                this.f196626a = list;
            }

            @Y61.k
            public final String toString() {
                return H.p(new StringBuilder("ListState.NonEmpty(items = "), this.f196626a, ')');
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: GeoSearchView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/map/search/z$c;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {
        @Y61.k
        a.c a();

        boolean d();

        @Y61.k
        String getQuery();

        @Y61.k
        b yd();
    }
}
