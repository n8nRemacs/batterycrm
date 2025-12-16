package com.avito.android.serp.adapter.vertical_main.cv.cv_creation;

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

/* compiled from: CvCreationItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/cv/cv_creation/a;", "LTV0/b;", "Lcom/avito/android/serp/adapter/vertical_main/cv/cv_creation/h;", "Lcom/avito/android/serp/adapter/vertical_main/cv/cv_creation/CvCreationItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements TV0.b<h, CvCreationItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f272749a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f272750b = new g.a<>(R.layout.cv_creator_item, C8095a.f272751l);

    /* compiled from: CvCreationItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/vertical_main/cv/cv_creation/h;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/vertical_main/cv/cv_creation/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.vertical_main.cv.cv_creation.a$a, reason: collision with other inner class name */
    public static final class C8095a extends N implements p<ViewGroup, View, h> {

        /* renamed from: l, reason: collision with root package name */
        public static final C8095a f272751l = new C8095a();

        public C8095a() {
            super(2);
        }

        @Override // Y41.p
        public final h invoke(ViewGroup viewGroup, View view) {
            return new h(view);
        }
    }

    @Inject
    public a(@k f fVar) {
        this.f272749a = fVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f272749a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f272750b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof CvCreationItem;
    }
}
