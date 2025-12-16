package com.avito.android.cv_actualization.view.phone_select.mvi;

import Y41.l;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.cv_actualization.view.phone_select.mvi.entity.JsxCvActualizationPhoneSelectInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import vt.AbstractC49378a;
import vt.AbstractC49379b;
import vt.C49380c;

/* compiled from: JsxCvActualizationPhoneSelectFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lvt/a;", "Lcom/avito/android/cv_actualization/view/phone_select/mvi/entity/JsxCvActualizationPhoneSelectInternalAction;", "Lvt/c;", "Lvt/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class e extends N implements l<q<AbstractC49378a, JsxCvActualizationPhoneSelectInternalAction, C49380c, AbstractC49379b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f131356l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f131357m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f131358n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j f131359o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f131360p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, j jVar, h hVar) {
        super(1);
        this.f131356l = cVar;
        this.f131357m = aVar;
        this.f131358n = screenPerformanceTracker;
        this.f131359o = jVar;
        this.f131360p = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<AbstractC49378a, JsxCvActualizationPhoneSelectInternalAction, C49380c, AbstractC49379b> qVar) {
        q<AbstractC49378a, JsxCvActualizationPhoneSelectInternalAction, C49380c, AbstractC49379b> qVar2 = qVar;
        qVar2.f92008d = this.f131356l;
        qVar2.f92009e = this.f131357m;
        qVar2.f92011g = new o(this.f131358n, this.f131359o);
        qVar2.f92010f = this.f131360p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91992g);
        return G0.f406611a;
    }
}
