package com.avito.android.user_viewed.screen.ui.item.loading;

import TV0.e;
import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UserViewedLoadingBlueprint.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_viewed/screen/ui/item/loading/a;", "LTV0/b;", "Lcom/avito/android/user_viewed/screen/ui/item/loading/c;", "Lcom/avito/android/user_viewed/screen/ui/item/loading/UserViewedLoadingItem;", "<init>", "()V", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements TV0.b<c, UserViewedLoadingItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C9885a f318499a = new C9885a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<d> f318500b = new g.a<>(R.layout.user_viewed_loading_item, b.f318501l);

    /* compiled from: UserViewedLoadingBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"com/avito/android/user_viewed/screen/ui/item/loading/a$a", "LTV0/d;", "Lcom/avito/android/user_viewed/screen/ui/item/loading/c;", "Lcom/avito/android/user_viewed/screen/ui/item/loading/UserViewedLoadingItem;", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_viewed.screen.ui.item.loading.a$a, reason: collision with other inner class name */
    public static final class C9885a implements TV0.d<c, UserViewedLoadingItem> {
        @Override // TV0.d
        public final /* bridge */ /* synthetic */ void O5(e eVar, TV0.a aVar, int i12) {
        }
    }

    /* compiled from: UserViewedLoadingBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/user_viewed/screen/ui/item/loading/d;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/user_viewed/screen/ui/item/loading/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<ViewGroup, View, d> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f318501l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final d invoke(ViewGroup viewGroup, View view) {
            return new d(view);
        }
    }

    @Inject
    public a() {
    }

    @Override // TV0.b
    @k
    public final TV0.d<c, UserViewedLoadingItem> a() {
        return this.f318499a;
    }

    @Override // TV0.b
    @k
    public final g.a<d> b() {
        return this.f318500b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof UserViewedLoadingItem;
    }
}
