package com.avito.android.favorites;

import android.os.Bundle;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.async_phone.InterfaceC28615a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.favorites.C30684r0;
import com.avito.android.favorites.InterfaceC30665h1;
import com.avito.android.serp.adapter.InterfaceC34863v;
import com.avito.android.util.Kundle;
import iT.InterfaceC41341a;
import kotlin.Metadata;
import ob.InterfaceC44739c;
import rn0.InterfaceC47690b;

/* compiled from: FavoritesListPresenter.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/favorites/q0;", "Lcom/avito/android/favorites/h1$b;", "Lcom/avito/android/async_phone/a;", "Lrn0/b;", "Lcom/avito/android/serp/adapter/rich_snippets/a;", "LiT/a;", "b", "c", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.favorites.q0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC30683q0 extends InterfaceC30665h1.b, InterfaceC28615a, InterfaceC47690b, com.avito.android.serp.adapter.rich_snippets.a, InterfaceC41341a {

    /* compiled from: FavoritesListPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.favorites.q0$a */
    public static final class a {
    }

    /* compiled from: FavoritesListPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorites/q0$b;", "Lcom/avito/android/serp/adapter/v;", "Lob/c;", "Lcom/avito/android/serp/adapter/constructor/q;", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.favorites.q0$b */
    public interface b extends InterfaceC34863v, InterfaceC44739c, com.avito.android.serp.adapter.constructor.q {

        /* compiled from: FavoritesListPresenter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.favorites.q0$b$a */
        public static final class a {
        }
    }

    /* compiled from: FavoritesListPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/q0$c;", "", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.favorites.q0$c */
    public interface c {

        /* compiled from: FavoritesListPresenter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.favorites.q0$c$a */
        public static final class a {
            public static /* synthetic */ void a(c cVar, DeepLink deepLink, Bundle bundle, int i12) {
                if ((i12 & 4) != 0) {
                    bundle = null;
                }
                cVar.g(bundle, deepLink, null);
            }
        }

        void g(@Y61.l Bundle bundle, @Y61.k DeepLink deepLink, @Y61.l String str);
    }

    void Ic(@Y61.l OrderEntity orderEntity);

    @Y61.k
    C30684r0.C30689e Kd();

    void Rc(@Y61.k x1 x1Var);

    void S();

    void T3(@Y61.k FavoritesFragment favoritesFragment);

    void V3();

    void b0(@Y61.k ActivityC22955m activityC22955m);

    void c0();

    @Y61.k
    Kundle d0();

    void e0();

    void e1(@Y61.l String str);

    void j4();

    void mb(@Y61.k String str, @Y61.l String str2, boolean z12);

    void onCleared();

    void onPause();

    void onResume();

    void w(boolean z12);
}
