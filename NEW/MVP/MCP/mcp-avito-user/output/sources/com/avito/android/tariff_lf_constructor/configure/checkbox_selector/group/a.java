package com.avito.android.tariff_lf_constructor.configure.checkbox_selector.group;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.tariff_lf_constructor.configure.checkbox_selector.d;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GroupCheckBoxItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/group/a;", "LTV0/b;", "Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/group/n;", "Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/d$a;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements TV0.b<n, d.a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f299489a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<o> f299490b = new g.a<>(R.layout.group_checkbox_item, C9155a.f299491l);

    /* compiled from: GroupCheckBoxItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/group/o;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/group/o;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.tariff_lf_constructor.configure.checkbox_selector.group.a$a, reason: collision with other inner class name */
    public static final class C9155a extends N implements p<ViewGroup, View, o> {

        /* renamed from: l, reason: collision with root package name */
        public static final C9155a f299491l = new C9155a();

        public C9155a() {
            super(2);
        }

        @Override // Y41.p
        public final o invoke(ViewGroup viewGroup, View view) {
            return new o(view);
        }
    }

    @Inject
    public a(@Y61.k c cVar) {
        this.f299489a = cVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f299489a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<o> b() {
        return this.f299490b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof d.a;
    }
}
