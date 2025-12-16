package com.avito.android.work_profile.profile.cvs.mvi;

import Y41.l;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.work_profile.profile.cvs.mvi.entity.CvsInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import mQ0.AbstractC44002a;
import mQ0.C44003b;

/* compiled from: CvsFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/android/work_profile/profile/cvs/mvi/f;", "Lcom/avito/android/arch/mvi/q;", "LmQ0/a;", "Lcom/avito/android/work_profile/profile/cvs/mvi/entity/CvsInternalAction;", "LmQ0/b;", "", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f extends q<AbstractC44002a, CvsInternalAction, C44003b, Object> {

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f331055k;

    /* compiled from: CvsFeatureBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LmQ0/a;", "Lcom/avito/android/work_profile/profile/cvs/mvi/entity/CvsInternalAction;", "LmQ0/b;", "", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<q<AbstractC44002a, CvsInternalAction, C44003b, Object>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d f331056l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ScreenPerformanceTracker f331057m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ j f331058n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ScreenPerformanceTracker screenPerformanceTracker, d dVar, j jVar) {
            super(1);
            this.f331056l = dVar;
            this.f331057m = screenPerformanceTracker;
            this.f331058n = jVar;
        }

        @Override // Y41.l
        public final G0 invoke(q<AbstractC44002a, CvsInternalAction, C44003b, Object> qVar) {
            q<AbstractC44002a, CvsInternalAction, C44003b, Object> qVar2 = qVar;
            qVar2.f92009e = this.f331056l;
            qVar2.f92011g = new o(this.f331057m, this.f331058n);
            return G0.f406611a;
        }
    }

    @Inject
    public f(@Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k d dVar, @Y61.k j jVar) {
        super("CvsFragment", new C44003b(null, null, false, null, 15, null), new a(screenPerformanceTracker, dVar, jVar));
        this.f331055k = screenPerformanceTracker;
    }
}
