package com.avito.android.mortgage.person_form.list.items.chips;

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

/* compiled from: ChipsBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/chips/a;", "LTV0/b;", "Lcom/avito/android/mortgage/person_form/list/items/chips/g;", "Lcom/avito/android/mortgage/person_form/list/items/chips/ChipsItem;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements TV0.b<g, ChipsItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f200666a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<h> f200667b = new g.a<>(R.layout.mortgage_person_form_chips_item, C5939a.f200668l);

    /* compiled from: ChipsBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/mortgage/person_form/list/items/chips/h;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/mortgage/person_form/list/items/chips/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.mortgage.person_form.list.items.chips.a$a, reason: collision with other inner class name */
    public static final class C5939a extends N implements p<ViewGroup, View, h> {

        /* renamed from: l, reason: collision with root package name */
        public static final C5939a f200668l = new C5939a();

        public C5939a() {
            super(2);
        }

        @Override // Y41.p
        public final h invoke(ViewGroup viewGroup, View view) {
            return new h(view);
        }
    }

    @Inject
    public a(@k e eVar) {
        this.f200666a = eVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f200666a;
    }

    @Override // TV0.b
    @k
    public final g.a<h> b() {
        return this.f200667b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof ChipsItem;
    }
}
