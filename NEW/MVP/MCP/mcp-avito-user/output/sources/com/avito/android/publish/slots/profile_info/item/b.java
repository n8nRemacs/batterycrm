package com.avito.android.publish.slots.profile_info.item;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UserInfoItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/profile_info/item/b;", "LTV0/b;", "Lcom/avito/android/publish/slots/profile_info/item/g;", "Lcom/avito/android/publish/slots/profile_info/item/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements TV0.b<g, com.avito.android.publish.slots.profile_info.item.a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f244700a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ir.d f244701b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<h> f244702c = new g.a<>(R.layout.publish_contacts_user_info, new a());

    /* compiled from: UserInfoItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/publish/slots/profile_info/item/h;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/publish/slots/profile_info/item/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, h> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final h invoke(ViewGroup viewGroup, View view) {
            return new h(view, b.this.f244701b);
        }
    }

    @Inject
    public b(@k d dVar, @k ir.d dVar2) {
        this.f244700a = dVar;
        this.f244701b = dVar2;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f244700a;
    }

    @Override // TV0.b
    @k
    public final g.a<h> b() {
        return this.f244702c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof com.avito.android.publish.slots.profile_info.item.a;
    }
}
