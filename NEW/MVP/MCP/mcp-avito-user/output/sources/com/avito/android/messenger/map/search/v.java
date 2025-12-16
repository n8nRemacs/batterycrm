package com.avito.android.messenger.map.search;

import KY.a;
import android.view.View;
import com.avito.android.messenger.map.search.q;
import com.avito.android.messenger.map.search.z;
import com.avito.android.mvi.b;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: GeoSearchPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/map/search/v;", "Lcom/avito/android/messenger/map/search/q$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class v implements q.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f196608b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final z.b f196609c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f196610d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a.c f196611e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mvi.b<List<com.avito.android.messenger.map.search.adapter.a>> f196612f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final List<com.avito.android.messenger.map.search.adapter.a> f196613g;

    /* compiled from: GeoSearchPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a implements View.OnClickListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t f196614b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f196615c;

        public a(t tVar, String str) {
            this.f196614b = tVar;
            this.f196615c = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f196614b.f196592V.ee(this.f196615c);
        }
    }

    public v(String str, com.avito.android.mvi.b<List<com.avito.android.messenger.map.search.adapter.a>> bVar, com.avito.android.mvi.b<List<com.avito.android.messenger.map.search.adapter.a>> bVar2, z.b bVar3, List<com.avito.android.messenger.map.search.adapter.a> list, t tVar) {
        this.f196608b = str;
        if (C43066x.K(str)) {
            bVar3 = !list.isEmpty() ? new z.b.c(list) : z.b.a.f196624a;
        } else if (bVar instanceof b.a) {
            if (bVar2 instanceof b.c) {
                bVar3 = z.b.a.f196624a;
            }
        } else if (!(bVar instanceof b.c)) {
            if (bVar instanceof b.d) {
                if (bVar2 instanceof b.c) {
                    b.d dVar = (b.d) bVar;
                    bVar3 = !((Collection) dVar.f207035a).isEmpty() ? new z.b.c((List) dVar.f207035a) : z.b.C5783b.f196625a;
                }
            } else if (!(bVar instanceof b.C6174b)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        this.f196609c = bVar3;
        this.f196610d = bVar instanceof b.c;
        this.f196611e = bVar instanceof b.C6174b ? new a.c.b.C0578a(tVar.f196593W, tVar.f196594X, new a(tVar, str)) : a.c.C0577a.f9512a;
        this.f196612f = bVar;
        this.f196613g = list;
    }

    @Override // com.avito.android.messenger.map.search.z.c
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final a.c getF196611e() {
        return this.f196611e;
    }

    @Override // com.avito.android.messenger.map.search.q.a
    @Y61.k
    public final com.avito.android.mvi.b<List<com.avito.android.messenger.map.search.adapter.a>> b() {
        return this.f196612f;
    }

    @Override // com.avito.android.messenger.map.search.q.a
    @Y61.k
    public final List<com.avito.android.messenger.map.search.adapter.a> c() {
        return this.f196613g;
    }

    @Override // com.avito.android.messenger.map.search.z.c
    /* renamed from: d, reason: from getter */
    public final boolean getF196610d() {
        return this.f196610d;
    }

    @Override // com.avito.android.messenger.map.search.z.c
    @Y61.k
    /* renamed from: getQuery, reason: from getter */
    public final String getF196608b() {
        return this.f196608b;
    }

    @Y61.k
    public final String toString() {
        return C43066x.F0("GeoSearchPresenter.State(\n        |   query=" + this.f196608b + ",\n        |   listState=" + this.f196609c + ",\n        |   searchIsInProgress=" + this.f196610d + ",\n        |   connectionErrorIndicatorState=" + this.f196611e + ",\n        |   searchSuggests=" + this.f196612f + ",\n        |   favoritePlaces=" + this.f196613g + "\n        |)");
    }

    @Override // com.avito.android.messenger.map.search.z.c
    @Y61.k
    /* renamed from: yd, reason: from getter */
    public final z.b getF196609c() {
        return this.f196609c;
    }
}
