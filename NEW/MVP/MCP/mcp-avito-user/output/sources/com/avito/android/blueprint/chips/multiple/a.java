package com.avito.android.blueprint.chips.multiple;

import Gj.InterfaceC13889a;
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

/* compiled from: PublishChipsMultipleBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/blueprint/chips/multiple/a;", "LTV0/b;", "LGj/a;", "Lcom/avito/android/category_parameters/ParameterElement$v;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements TV0.b<InterfaceC13889a, ParameterElement.v> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f105406a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f105407b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<SimpleTestGroupWithNone> f105408c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g.a<Gj.c> f105409d = new g.a<>(R.layout.view_publish_chips_container, new C3155a());

    /* compiled from: PublishChipsMultipleBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "LGj/c;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)LGj/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.blueprint.chips.multiple.a$a, reason: collision with other inner class name */
    public static final class C3155a extends N implements p<ViewGroup, View, Gj.c> {
        public C3155a() {
            super(2);
        }

        @Override // Y41.p
        public final Gj.c invoke(ViewGroup viewGroup, View view) {
            return new Gj.c(view, a.this.f105407b);
        }
    }

    @Inject
    public a(@k c cVar, @k com.avito.android.util.text.a aVar, @k @k0 l<SimpleTestGroupWithNone> lVar) {
        this.f105406a = cVar;
        this.f105407b = aVar;
        this.f105408c = lVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f105406a;
    }

    @Override // TV0.b
    @k
    public final g.a<Gj.c> b() {
        return this.f105409d;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        if (aVar instanceof ParameterElement.v) {
            ParameterElement.v vVar = (ParameterElement.v) aVar;
            if ((vVar.f117547h instanceof ParameterElement.DisplayType.Chips) && !vVar.f117548i && this.f105408c.f439745a.f439749b.b()) {
                return true;
            }
        }
        return false;
    }
}
