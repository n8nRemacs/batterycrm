package com.avito.android.user_favorites;

import com.avito.android.user_favorites.adapter.FavoritesTab;
import java.util.List;
import kotlin.Metadata;

/* compiled from: UserFavoritesPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/user_favorites/adapter/FavoritesTab;", "it", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class x<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f316943b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ L f316944c;

    public x(B b12, L l12) {
        this.f316943b = b12;
        this.f316944c = l12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        List<? extends FavoritesTab> list = (List) obj;
        B b12 = this.f316943b;
        boolean z12 = b12.f316769c.getCount() != list.size();
        b12.a(list);
        L l12 = this.f316944c;
        if (!z12) {
            l12.b();
        } else {
            l12.c();
            l12.d(b12.b(b12.f316774h));
        }
    }
}
