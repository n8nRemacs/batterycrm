package com.avito.android.messenger.search.adapter.pagination;

import TV0.d;
import TV0.e;
import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import fZ.AbstractC40377a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PaginationItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/search/adapter/pagination/a;", "LTV0/b;", "LTV0/e;", "LfZ/a$b;", "<init>", "()V", "a", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements TV0.b<e, AbstractC40377a.b> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C5798a f197054a = new C5798a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<b> f197055b = new g.a<>(R.layout.messenger_channels_pagination_item, c.f197056l);

    /* compiled from: PaginationItemBlueprint.kt */
    @P
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/search/adapter/pagination/a$a;", "LTV0/d;", "LTV0/e;", "LfZ/a$b;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.search.adapter.pagination.a$a, reason: collision with other inner class name */
    public static final class C5798a implements d<e, AbstractC40377a.b> {
        @Override // TV0.d
        public final /* bridge */ /* synthetic */ void O5(e eVar, TV0.a aVar, int i12) {
        }
    }

    /* compiled from: PaginationItemBlueprint.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/search/adapter/pagination/a$b;", "Lcom/avito/konveyor/adapter/b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.avito.konveyor.adapter.b {
    }

    /* compiled from: PaginationItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/messenger/search/adapter/pagination/a$b;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/messenger/search/adapter/pagination/a$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements p<ViewGroup, View, b> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f197056l = new c();

        public c() {
            super(2);
        }

        @Override // Y41.p
        public final b invoke(ViewGroup viewGroup, View view) {
            return new b(view);
        }
    }

    @Override // TV0.b
    @k
    public final d<e, AbstractC40377a.b> a() {
        return this.f197054a;
    }

    @Override // TV0.b
    @k
    public final g.a<b> b() {
        return this.f197055b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof AbstractC40377a.b;
    }
}
