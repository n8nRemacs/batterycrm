package com.avito.android.cv_actualization.view.phone_select.ui.items.header;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: JsxCvActualizationPhoneSelectHeaderBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cv_actualization/view/phone_select/ui/items/header/a;", "LTV0/b;", "Lcom/avito/android/cv_actualization/view/phone_select/ui/items/header/g;", "Lcom/avito/android/cv_actualization/view/phone_select/ui/items/header/JsxCvActualizationPhoneSelectHeaderItem;", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements TV0.b<g, JsxCvActualizationPhoneSelectHeaderItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f131429a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<h> f131430b = new g.a<>(R.layout.jsx_cv_actualization_phone_select_header_item, C3921a.f131431l);

    /* compiled from: JsxCvActualizationPhoneSelectHeaderBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/cv_actualization/view/phone_select/ui/items/header/h;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/cv_actualization/view/phone_select/ui/items/header/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.cv_actualization.view.phone_select.ui.items.header.a$a, reason: collision with other inner class name */
    public static final class C3921a extends N implements p<ViewGroup, View, h> {

        /* renamed from: l, reason: collision with root package name */
        public static final C3921a f131431l = new C3921a();

        public C3921a() {
            super(2);
        }

        @Override // Y41.p
        public final h invoke(ViewGroup viewGroup, View view) {
            return new h(view);
        }
    }

    @Inject
    public a(@k d dVar) {
        this.f131429a = dVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f131429a;
    }

    @Override // TV0.b
    @k
    public final g.a<h> b() {
        return this.f131430b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof JsxCvActualizationPhoneSelectHeaderItem;
    }
}
