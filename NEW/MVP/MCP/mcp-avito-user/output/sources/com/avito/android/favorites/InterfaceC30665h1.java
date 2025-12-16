package com.avito.android.favorites;

import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.favorites.adapter.advert.d;
import com.avito.android.favorites.adapter.error.c;
import com.avito.android.favorites.adapter.loading.c;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;

/* compiled from: FavoritesView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/favorites/h1;", "Lcom/avito/android/advert/viewed/j;", "b", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.favorites.h1, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC30665h1 extends com.avito.android.advert.viewed.j {

    /* compiled from: FavoritesView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.favorites.h1$a */
    public static final class a {
        public static /* synthetic */ void a(InterfaceC30665h1 interfaceC30665h1, PrintableText printableText, Throwable th2, ApiError apiError, int i12) {
            if ((i12 & 2) != 0) {
                th2 = null;
            }
            if ((i12 & 4) != 0) {
                apiError = null;
            }
            interfaceC30665h1.FP(printableText, apiError, th2);
        }
    }

    /* compiled from: FavoritesView.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/favorites/h1$b;", "Lcom/avito/android/favorites/adapter/advert/d$a;", "Lcom/avito/android/favorites/adapter/loading/c$a;", "Lcom/avito/android/favorites/adapter/error/c$a;", "Lcom/avito/android/favorites/compose/only_active_switch/j;", "Lcom/avito/android/favorites/compose/search/y;", "Lcom/avito/android/favorites/compose/empty_favorites_global/g;", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.favorites.h1$b */
    public interface b extends d.a, c.a, c.a, com.avito.android.favorites.compose.only_active_switch.j, com.avito.android.favorites.compose.search.y, com.avito.android.favorites.compose.empty_favorites_global.g {
        void W1();

        void X1();

        void Y1();

        void Z1(@Y61.k RecyclerView recyclerView);

        void a2();

        void b2();

        boolean c2();
    }

    void FP(@Y61.k PrintableText printableText, @Y61.l ApiError apiError, @Y61.l Throwable th2);
}
