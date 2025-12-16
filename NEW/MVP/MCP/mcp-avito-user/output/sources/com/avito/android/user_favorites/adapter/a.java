package com.avito.android.user_favorites.adapter;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.deprecated_design.tab.adapter.g;
import com.avito.android.lib.deprecated_design.tab.adapter.i;
import com.avito.android.lib.deprecated_design.tab.adapter.j;
import com.avito.android.user_favorites.adapter.FavoritesTab;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.s0;

/* compiled from: FavoritesTabAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_favorites/adapter/a;", "Lcom/avito/android/user_favorites/adapter/FavoritesTab;", "T", "Lcom/avito/android/lib/deprecated_design/tab/adapter/g;", "Lcom/avito/android/user_favorites/adapter/b;", "_avito_user-favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a<T extends FavoritesTab> extends g<T, b> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final l<View, b> f316833e;

    /* compiled from: FavoritesTabAdapter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_favorites.adapter.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C9837a extends H implements l<View, b> {

        /* renamed from: b, reason: collision with root package name */
        public static final C9837a f316834b = new C9837a();

        public C9837a() {
            super(1, b.class, "<init>", "<init>(Landroid/view/View;)V", 0);
        }

        @Override // Y41.l
        public final b invoke(View view) {
            return new b(view);
        }
    }

    public a(@k j<T> jVar, @k Context context) {
        super(jVar, context, R.layout.tab_favorites);
        this.f316833e = C9837a.f316834b;
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.g
    public final void a(i iVar, Object obj) {
        ((b) iVar).f((FavoritesTab) obj);
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.g
    public final i b(View view) {
        ((C9837a) this.f316833e).getClass();
        return new b(view);
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.g
    @k
    public final i e(@k i iVar, int i12) {
        b bVar = iVar instanceof b ? (b) iVar : null;
        if (bVar == null) {
            return c(i12);
        }
        bVar.f(this.f178152a.getItem(i12));
        return bVar;
    }
}
