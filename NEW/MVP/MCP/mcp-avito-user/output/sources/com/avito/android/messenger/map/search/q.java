package com.avito.android.messenger.map.search;

import com.avito.android.messenger.map.search.z;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GeoSearchPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/map/search/q;", "LS20/a;", "Lcom/avito/android/messenger/map/search/q$a;", "Lcom/avito/android/messenger/map/search/y;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface q extends S20.a<a>, y {

    /* compiled from: GeoSearchPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/map/search/q$a;", "Lcom/avito/android/messenger/map/search/z$c;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a extends z.c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f196588a = 0;

        /* compiled from: GeoSearchPresenter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/map/search/q$a$a;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.map.search.q$a$a, reason: collision with other inner class name */
        public static final class C5782a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int f196589a = 0;

            static {
                new C5782a();
            }
        }

        static {
            int i12 = C5782a.f196589a;
        }

        @Y61.k
        com.avito.android.mvi.b<List<com.avito.android.messenger.map.search.adapter.a>> b();

        @Y61.k
        List<com.avito.android.messenger.map.search.adapter.a> c();
    }

    @Y61.k
    com.avito.android.util.architecture_components.D B4();

    @Y61.k
    com.avito.android.util.architecture_components.D Z9();

    void g4(@Y61.k String str);
}
