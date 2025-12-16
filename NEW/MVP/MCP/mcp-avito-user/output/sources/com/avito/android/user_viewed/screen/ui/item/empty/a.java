package com.avito.android.user_viewed.screen.ui.item.empty;

import TV0.e;
import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.avito.android.R;
import com.avito.android.advert.item.delivery_suggests.l;
import com.avito.android.image_loader.n;
import com.avito.android.remote.model.Image;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import mK0.C43976a;

/* compiled from: UserViewedEmptyBlueprint.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_viewed/screen/ui/item/empty/a;", "LTV0/b;", "Lcom/avito/android/user_viewed/screen/ui/item/empty/c;", "Lcom/avito/android/user_viewed/screen/ui/item/empty/UserViewedEmptyItem;", "<init>", "()V", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements TV0.b<c, UserViewedEmptyItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C9884a f318489a = new C9884a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<d> f318490b = new g.a<>(R.layout.user_viewed_empty_item, b.f318491l);

    /* compiled from: UserViewedEmptyBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"com/avito/android/user_viewed/screen/ui/item/empty/a$a", "LTV0/d;", "Lcom/avito/android/user_viewed/screen/ui/item/empty/c;", "Lcom/avito/android/user_viewed/screen/ui/item/empty/UserViewedEmptyItem;", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_viewed.screen.ui.item.empty.a$a, reason: collision with other inner class name */
    public static final class C9884a implements TV0.d<c, UserViewedEmptyItem> {
        @Override // TV0.d
        public final /* bridge */ /* synthetic */ void O5(e eVar, TV0.a aVar, int i12) {
        }
    }

    /* compiled from: UserViewedEmptyBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/user_viewed/screen/ui/item/empty/d;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/user_viewed/screen/ui/item/empty/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<ViewGroup, View, d> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f318491l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final d invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            d dVar = new d(view2);
            View viewFindViewById = view2.findViewById(R.id.image);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            ImageView imageView = (ImageView) viewFindViewById;
            C43976a.f414475a.getClass();
            Image imageG = l.g(view2, C43976a.f414476b);
            if (imageG != null) {
                com.avito.android.image_loader.glide.utils.b.d(imageView, n.a(imageG));
            }
            return dVar;
        }
    }

    @Inject
    public a() {
    }

    @Override // TV0.b
    @k
    public final TV0.d<c, UserViewedEmptyItem> a() {
        return this.f318489a;
    }

    @Override // TV0.b
    @k
    public final g.a<d> b() {
        return this.f318490b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof UserViewedEmptyItem;
    }
}
