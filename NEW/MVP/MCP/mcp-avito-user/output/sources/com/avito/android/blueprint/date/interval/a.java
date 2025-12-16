package com.avito.android.blueprint.date.interval;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.category_parameters.ParameterElement;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import t3.k0;
import u3.l;

/* compiled from: PublishDateIntervalBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/blueprint/date/interval/a;", "LTV0/b;", "Lcom/avito/android/blueprint/date/interval/i;", "Lcom/avito/android/category_parameters/ParameterElement$d;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements TV0.b<i, ParameterElement.C29376d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f105444a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f105445b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final l<SimpleTestGroupWithNone> f105446c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g.a<k> f105447d = new g.a<>(R.layout.view_publish_date_interval_container, new C3156a());

    /* compiled from: PublishDateIntervalBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/blueprint/date/interval/k;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/blueprint/date/interval/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.blueprint.date.interval.a$a, reason: collision with other inner class name */
    public static final class C3156a extends N implements p<ViewGroup, View, k> {
        public C3156a() {
            super(2);
        }

        @Override // Y41.p
        public final k invoke(ViewGroup viewGroup, View view) {
            return new k(view, a.this.f105445b);
        }
    }

    @Inject
    public a(@Y61.k c cVar, @Y61.k com.avito.android.util.text.a aVar, @Y61.k @k0 l<SimpleTestGroupWithNone> lVar) {
        this.f105444a = cVar;
        this.f105445b = aVar;
        this.f105446c = lVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f105444a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<k> b() {
        return this.f105447d;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return (aVar instanceof ParameterElement.C29376d) && this.f105446c.f439745a.f439749b.b() && !((ParameterElement.C29376d) aVar).f117403g;
    }
}
