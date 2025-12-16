package com.avito.android.suggest_institutes_bottom_sheet.blueprints;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import rA0.C47519a;

/* compiled from: SuggestInstituteItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/suggest_institutes_bottom_sheet/blueprints/c;", "LTV0/b;", "Lcom/avito/android/suggest_institutes_bottom_sheet/blueprints/h;", "LrA0/a;", "_avito_job_suggest-institutes-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements TV0.b<h, C47519a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f291985a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<h> f291986b = new g.a<>(R.layout.suggest_institute_item, a.f291987l);

    /* compiled from: SuggestInstituteItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/suggest_institutes_bottom_sheet/blueprints/h;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/suggest_institutes_bottom_sheet/blueprints/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, h> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f291987l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final h invoke(ViewGroup viewGroup, View view) {
            return new h(view);
        }
    }

    @Inject
    public c(@k f fVar) {
        this.f291985a = fVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f291985a;
    }

    @Override // TV0.b
    @k
    public final g.a<h> b() {
        return this.f291986b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof C47519a;
    }
}
