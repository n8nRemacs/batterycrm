package com.avito.android.passport.profile_add.create_flow.select_specific.recycler;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Error.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_specific/recycler/a;", "LTV0/b;", "Lcom/avito/android/passport/profile_add/create_flow/select_specific/recycler/g;", "Lcom/avito/android/passport/profile_add/create_flow/select_specific/recycler/c;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.passport.profile_add.create_flow.select_specific.recycler.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32959a implements TV0.b<g, C32961c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32962d f211773a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<h> f211774b = new g.a<>(R.layout.item_error, C6332a.f211775l);

    /* compiled from: Error.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/passport/profile_add/create_flow/select_specific/recycler/h;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/passport/profile_add/create_flow/select_specific/recycler/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.passport.profile_add.create_flow.select_specific.recycler.a$a, reason: collision with other inner class name */
    public static final class C6332a extends N implements Y41.p<ViewGroup, View, h> {

        /* renamed from: l, reason: collision with root package name */
        public static final C6332a f211775l = new C6332a();

        public C6332a() {
            super(2);
        }

        @Override // Y41.p
        public final h invoke(ViewGroup viewGroup, View view) {
            return new h(view);
        }
    }

    @Inject
    public C32959a(@Y61.k InterfaceC32962d interfaceC32962d) {
        this.f211773a = interfaceC32962d;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f211773a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<h> b() {
        return this.f211774b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof C32961c;
    }
}
