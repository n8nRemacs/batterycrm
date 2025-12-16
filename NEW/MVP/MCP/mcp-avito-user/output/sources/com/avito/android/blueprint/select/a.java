package com.avito.android.blueprint.select;

import TV0.g;
import Y41.p;
import Y61.k;
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

/* compiled from: PublishSelectBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/blueprint/select/a;", "LTV0/b;", "Lcom/avito/android/blueprint/select/g;", "Lcom/avito/android/category_parameters/ParameterElement$C;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements TV0.b<g, ParameterElement.C> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f105654a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f105655b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<SimpleTestGroupWithNone> f105656c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g.a<h> f105657d = new g.a<>(R.layout.view_publish_select_container, new C3162a());

    /* compiled from: PublishSelectBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/blueprint/select/h;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/blueprint/select/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.blueprint.select.a$a, reason: collision with other inner class name */
    public static final class C3162a extends N implements p<ViewGroup, View, h> {
        public C3162a() {
            super(2);
        }

        @Override // Y41.p
        public final h invoke(ViewGroup viewGroup, View view) {
            return new h(view, a.this.f105655b);
        }
    }

    @Inject
    public a(@k c cVar, @k com.avito.android.util.text.a aVar, @k @k0 l<SimpleTestGroupWithNone> lVar) {
        this.f105654a = cVar;
        this.f105655b = aVar;
        this.f105656c = lVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f105654a;
    }

    @Override // TV0.b
    @k
    public final g.a<h> b() {
        return this.f105657d;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        if (!(aVar instanceof ParameterElement.C)) {
            return false;
        }
        ParameterElement.DisplayType displayType = ((ParameterElement.C) aVar).f117213i;
        if ((displayType instanceof ParameterElement.DisplayType.Chips) || (displayType instanceof ParameterElement.DisplayType.o) || (displayType instanceof ParameterElement.DisplayType.e) || (displayType instanceof ParameterElement.DisplayType.s) || (displayType instanceof ParameterElement.DisplayType.n) || (displayType instanceof ParameterElement.DisplayType.h) || (displayType instanceof ParameterElement.DisplayType.w) || (displayType instanceof ParameterElement.DisplayType.m)) {
            return false;
        }
        if ((aVar instanceof ParameterElement.C.b) && ((ParameterElement.C.b) aVar).f117240I) {
            return false;
        }
        return this.f105656c.f439745a.f439749b.b();
    }
}
