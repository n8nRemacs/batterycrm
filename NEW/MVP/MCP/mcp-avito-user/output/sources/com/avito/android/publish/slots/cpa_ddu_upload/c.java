package com.avito.android.publish.slots.cpa_ddu_upload;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.category_parameters.ParameterElement;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CpaReassignmentSlotBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/cpa_ddu_upload/c;", "Lcom/avito/android/publish/slots/cpa_ddu_upload/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e f243349a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<l> f243350b = new g.a<>(R.layout.ddu_file_upload, a.f243351l);

    /* compiled from: CpaReassignmentSlotBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/publish/slots/cpa_ddu_upload/l;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/publish/slots/cpa_ddu_upload/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, l> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f243351l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final l invoke(ViewGroup viewGroup, View view) {
            return new l(view);
        }
    }

    @Inject
    public c(@Y61.k e eVar) {
        this.f243349a = eVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f243349a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<l> b() {
        return this.f243350b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return (aVar instanceof ParameterElement.l) && ((ParameterElement.l) aVar).f117469s;
    }
}
