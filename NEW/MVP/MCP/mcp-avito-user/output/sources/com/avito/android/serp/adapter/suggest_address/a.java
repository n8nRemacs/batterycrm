package com.avito.android.serp.adapter.suggest_address;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AddAddressSuggestItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/suggest_address/a;", "LTV0/b;", "Lcom/avito/android/serp/adapter/suggest_address/q;", "Lcom/avito/android/serp/adapter/suggest_address/AddAddressSuggestItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements TV0.b<q, AddAddressSuggestItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h f272385a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<r> f272386b = new g.a<>(R.layout.add_address_widget, C8088a.f272387l);

    /* compiled from: AddAddressSuggestItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/suggest_address/r;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/suggest_address/r;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.suggest_address.a$a, reason: collision with other inner class name */
    public static final class C8088a extends N implements Y41.p<ViewGroup, View, r> {

        /* renamed from: l, reason: collision with root package name */
        public static final C8088a f272387l = new C8088a();

        public C8088a() {
            super(2);
        }

        @Override // Y41.p
        public final r invoke(ViewGroup viewGroup, View view) {
            return new r(view);
        }
    }

    @Inject
    public a(@Y61.k h hVar) {
        this.f272385a = hVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f272385a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<r> b() {
        return this.f272386b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof AddAddressSuggestItem;
    }
}
