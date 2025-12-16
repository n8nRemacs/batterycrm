package com.avito.android.favorite;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import qu.C47445a;

/* compiled from: FavoritesStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite/x;", "", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface x {

    /* compiled from: FavoritesStorage.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    boolean b(@Y61.k String str, boolean z12);

    void c(@Y61.k List<String> list);

    @Y61.k
    Map<String, Boolean> d(@Y61.k List<String> list);

    void e(@Y61.k String str, @Y61.l String str2, @Y61.l String str3);

    boolean f(@Y61.k String str);

    void g(@Y61.k String str, @Y61.l String str2, @Y61.l String str3);

    int getCount();

    @Y61.k
    List<String> h();

    @Y61.k
    Map<C47445a, List<String>> i();

    @Y61.k
    Map<C47445a, List<String>> j();

    @Y61.k
    List<String> l();

    void m(@Y61.k String str, @Y61.l String str2);

    void wipe();
}
