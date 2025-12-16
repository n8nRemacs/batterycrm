package com.avito.android.publish.merge_pretend_premoderation;

import androidx.compose.runtime.internal.P;
import androidx.view.AbstractC22991Y;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.publish.C0;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.kotlin.A1;
import javax.inject.Inject;
import kotlin.Metadata;
import qe0.AbstractC47390a;
import qe0.AbstractC47391b;
import re0.AbstractC47643a;
import re0.AbstractC47644b;

/* compiled from: MergePretendPremoderationViewModel.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/merge_pretend_premoderation/j;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/publish/merge_pretend_premoderation/e;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j extends M0 implements e {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f237425E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.pretend.e f237426J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.premoderation.k f237427K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final C0 f237428L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final m f237429M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f237430N = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final C23038g0<AbstractC47391b> f237431O = new C23038g0<>();

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final C23038g0<AbstractC47390a> f237432P = new C23038g0<>();

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public AbstractC47644b f237433Q = AbstractC47644b.c.f429943a;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public AbstractC47643a f237434R = AbstractC47643a.c.f429939a;

    @Inject
    public j(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.publish.pretend.e eVar, @Y61.k com.avito.android.publish.premoderation.k kVar, @Y61.k C0 c02, @Y61.k m mVar) {
        this.f237425E = interfaceC35745a5;
        this.f237426J = eVar;
        this.f237427K = kVar;
        this.f237428L = c02;
        this.f237429M = mVar;
        ke();
    }

    @Override // com.avito.android.publish.merge_pretend_premoderation.e
    public final void Q1() {
        this.f237434R = AbstractC47643a.b.C12385b.f429937a;
        le();
    }

    @Override // com.avito.android.publish.merge_pretend_premoderation.e
    public final void Y0() {
        ke();
    }

    @Override // com.avito.android.publish.merge_pretend_premoderation.e
    public final void c8() {
        this.f237428L.xe(null);
    }

    @Override // com.avito.android.publish.merge_pretend_premoderation.e
    public final void i0() {
        this.f237428L.ye();
    }

    public final void ke() {
        C0 c02 = this.f237428L;
        Navigation navigation2 = c02.f231861Y.getNavigation();
        CategoryParameters categoryParameters = c02.f231873k0;
        if (categoryParameters == null) {
            return;
        }
        boolean z12 = this.f237433Q instanceof AbstractC47644b.AbstractC12386b;
        io.reactivex.rxjava3.disposables.c cVar = this.f237430N;
        InterfaceC35745a5 interfaceC35745a5 = this.f237425E;
        if (!z12) {
            cVar.b(A1.h(this.f237426J.m(navigation2, categoryParameters).j0(interfaceC35745a5.e()), i.f237424l, new h(1, this, j.class, "handlePretendLoadingState", "handlePretendLoadingState(Lcom/avito/android/util/MultiStateLoading;)V", 0), 2));
        }
        String str = c02.f231865c0;
        if (this.f237434R instanceof AbstractC47643a.b) {
            return;
        }
        this.f237434R = AbstractC47643a.c.f429939a;
        le();
        cVar.b(A1.e(this.f237427K.a(navigation2, categoryParameters, str).s(interfaceC35745a5.e()), new g(1, this, j.class, "handlePremoderationError", "handlePremoderationError(Ljava/lang/Throwable;)V", 0), new f(1, this, j.class, "handlePremoderationResult", "handlePremoderationResult(Lcom/avito/android/remote/model/adverts/AdvertProactiveModerationResult;)V", 0)));
    }

    public final void le() {
        AbstractC47644b abstractC47644b = this.f237433Q;
        AbstractC47643a abstractC47643a = this.f237434R;
        this.f237429M.getClass();
        this.f237431O.setValue(((abstractC47644b instanceof AbstractC47644b.c) || (abstractC47643a instanceof AbstractC47643a.c)) ? AbstractC47391b.c.f429334a : abstractC47644b instanceof AbstractC47644b.a ? new AbstractC47391b.C12332b(((AbstractC47644b.a) abstractC47644b).f429940a) : abstractC47643a instanceof AbstractC47643a.C12383a ? new AbstractC47391b.C12332b(((AbstractC47643a.C12383a) abstractC47643a).f429935a) : AbstractC47391b.a.f429332a);
        AbstractC47644b abstractC47644b2 = this.f237433Q;
        AbstractC47643a abstractC47643a2 = this.f237434R;
        boolean z12 = abstractC47644b2 instanceof AbstractC47644b.AbstractC12386b.C12387b;
        this.f237432P.setValue((z12 && (abstractC47643a2 instanceof AbstractC47643a.b.C12385b)) ? AbstractC47390a.b.f429330a : (z12 && (abstractC47643a2 instanceof AbstractC47643a.b.C12384a)) ? new AbstractC47390a.C12331a(((AbstractC47643a.b.C12384a) abstractC47643a2).f429936a) : (z12 && (abstractC47643a2 instanceof AbstractC47643a.b.c)) ? new AbstractC47390a.c(((AbstractC47643a.b.c) abstractC47643a2).f429938a) : null);
    }

    @Override // com.avito.android.publish.merge_pretend_premoderation.e
    public final AbstractC22991Y o0() {
        return this.f237431O;
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f237430N.e();
    }

    @Override // com.avito.android.publish.merge_pretend_premoderation.e
    /* renamed from: za, reason: from getter */
    public final C23038g0 getF237432P() {
        return this.f237432P;
    }
}
