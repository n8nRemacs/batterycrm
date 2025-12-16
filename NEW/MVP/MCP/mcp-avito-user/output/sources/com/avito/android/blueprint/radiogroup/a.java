package com.avito.android.blueprint.radiogroup;

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
import t3.l0;
import u3.l;

/* compiled from: PublishRadioGroupSelectItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/blueprint/radiogroup/a;", "LTV0/b;", "Lcom/avito/android/blueprint/radiogroup/i;", "Lcom/avito/android/category_parameters/ParameterElement$C$b;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements TV0.b<i, ParameterElement.C.b> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f105629a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f105630b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<SimpleTestGroupWithNone> f105631c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g.a<j> f105632d = new g.a<>(R.layout.view_publish_radiogroup_container, new C3161a());

    /* compiled from: PublishRadioGroupSelectItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/blueprint/radiogroup/j;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/blueprint/radiogroup/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.blueprint.radiogroup.a$a, reason: collision with other inner class name */
    public static final class C3161a extends N implements p<ViewGroup, View, j> {
        public C3161a() {
            super(2);
        }

        @Override // Y41.p
        public final j invoke(ViewGroup viewGroup, View view) {
            return new j(view, a.this.f105630b);
        }
    }

    @Inject
    public a(@k c cVar, @k com.avito.android.util.text.a aVar, @l0 @k l<SimpleTestGroupWithNone> lVar) {
        this.f105629a = cVar;
        this.f105630b = aVar;
        this.f105631c = lVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f105629a;
    }

    @Override // TV0.b
    @k
    public final g.a<j> b() {
        return this.f105632d;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return (aVar instanceof ParameterElement.C.b) && (((ParameterElement.C.b) aVar).f117213i instanceof ParameterElement.DisplayType.o) && this.f105631c.f439745a.f439749b.b();
    }
}
