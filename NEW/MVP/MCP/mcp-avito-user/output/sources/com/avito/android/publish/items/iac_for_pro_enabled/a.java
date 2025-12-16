package com.avito.android.publish.items.iac_for_pro_enabled;

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

/* compiled from: IacForProEnabledItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/items/iac_for_pro_enabled/a;", "LTV0/b;", "Lcom/avito/android/publish/items/iac_for_pro_enabled/h;", "Lcom/avito/android/publish/items/iac_for_pro_enabled/IacForProEnabledItem;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements TV0.b<h, IacForProEnabledItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f236941a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f236942b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<i> f236943c = new g.a<>(R.layout.iac_for_pro_enabled_item, new C7140a());

    /* compiled from: IacForProEnabledItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/publish/items/iac_for_pro_enabled/i;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/publish/items/iac_for_pro_enabled/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.items.iac_for_pro_enabled.a$a, reason: collision with other inner class name */
    public static final class C7140a extends N implements p<ViewGroup, View, i> {
        public C7140a() {
            super(2);
        }

        @Override // Y41.p
        public final i invoke(ViewGroup viewGroup, View view) {
            return new i(view, a.this.f236942b);
        }
    }

    @Inject
    public a(@k d dVar, @k com.avito.android.util.text.a aVar) {
        this.f236941a = dVar;
        this.f236942b = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f236941a;
    }

    @Override // TV0.b
    @k
    public final g.a<i> b() {
        return this.f236943c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof IacForProEnabledItem;
    }
}
