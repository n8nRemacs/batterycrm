package com.avito.android.blueprints.job_multigeo_address;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.multigeo_flow.links.JobMultiGeoLink;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: JobMultiGeoBlueprintVacancyFlow.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/blueprints/job_multigeo_address/b;", "LTV0/b;", "Lcom/avito/android/blueprints/job_multigeo_address/n;", "Lcom/avito/android/category_parameters/ParameterElement$q;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements TV0.b<n, ParameterElement.q> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e f105998a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<o> f105999b = new g.a<>(R.layout.job_multigeo_address_layout_vacancy_flow, a.f106000l);

    /* compiled from: JobMultiGeoBlueprintVacancyFlow.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/blueprints/job_multigeo_address/o;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/blueprints/job_multigeo_address/o;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, o> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f106000l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final o invoke(ViewGroup viewGroup, View view) {
            return new o(view);
        }
    }

    @Inject
    public b(@Y61.k e eVar) {
        this.f105998a = eVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f105998a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<o> b() {
        return this.f105999b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (aVar instanceof ParameterElement.q) {
            if (((ParameterElement.q) aVar).f117520v == JobMultiGeoLink.FlowType.f206968c) {
                return true;
            }
        }
        return false;
    }
}
