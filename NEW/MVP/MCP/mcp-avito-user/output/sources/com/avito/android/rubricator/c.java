package com.avito.android.rubricator;

import Oi0.C14700d;
import Oi0.InterfaceC14698b;
import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.C;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import sn0.InterfaceC48384b;

/* compiled from: SerpVerticalRubricatorBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rubricator/c;", "LTV0/b;", "Lcom/avito/android/rubricator/h;", "Lcom/avito/android/rubricator/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements TV0.b<h, b> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f255731a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.a f255732b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC14698b f255733c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C f255734d;

    /* compiled from: SerpVerticalRubricatorBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/rubricator/i;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/rubricator/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, i> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final i invoke(ViewGroup viewGroup, View view) {
            c cVar = c.this;
            com.avito.konveyor.a aVar = cVar.f255732b;
            com.avito.konveyor.adapter.h hVar = new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
            return new i(view, hVar, new C14700d(hVar, cVar.f255733c, cVar.f255734d));
        }
    }

    @Inject
    public c(@k e eVar, @InterfaceC48384b @k com.avito.konveyor.a aVar, @sn0.f @k InterfaceC14698b interfaceC14698b, @k C c12) {
        this.f255731a = eVar;
        this.f255732b = aVar;
        this.f255733c = interfaceC14698b;
        this.f255734d = c12;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f255731a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return new g.a<>(R.layout.vertical_rubricator, new a());
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof b;
    }
}
