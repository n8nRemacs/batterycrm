package com.avito.android.section.horizontal.button;

import TV0.g;
import Tp0.InterfaceC15393c;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.section.item.s;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: HorizontalSectionButtonBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/section/horizontal/button/a;", "LTV0/b;", "Lcom/avito/android/section/horizontal/button/c;", "Lcom/avito/android/section/horizontal/button/HorizontalSectionButtonItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements TV0.b<c, HorizontalSectionButtonItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f264692a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final s f264693b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<d> f264694c = new g.a<>(R.layout.horizontal_section_button, new C7903a());

    /* compiled from: HorizontalSectionButtonBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/section/horizontal/button/d;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/section/horizontal/button/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.section.horizontal.button.a$a, reason: collision with other inner class name */
    public static final class C7903a extends N implements p<ViewGroup, View, d> {
        public C7903a() {
            super(2);
        }

        @Override // Y41.p
        public final d invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            a aVar = a.this;
            aVar.getClass();
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            layoutParams.width = aVar.f264693b.c();
            view2.setLayoutParams(layoutParams);
            return new d(view2);
        }
    }

    @Inject
    public a(@k e eVar, @InterfaceC15393c @k s sVar) {
        this.f264692a = eVar;
        this.f264693b = sVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f264692a;
    }

    @Override // TV0.b
    @k
    public final g.a<d> b() {
        return this.f264694c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof HorizontalSectionButtonItem;
    }
}
