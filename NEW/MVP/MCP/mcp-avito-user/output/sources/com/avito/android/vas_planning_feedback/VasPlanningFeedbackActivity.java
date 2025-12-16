package com.avito.android.vas_planning_feedback;

import SK0.b;
import Y41.l;
import Y61.k;
import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.view.InterfaceC23040h0;
import androidx.view.P0;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: VasPlanningFeedbackActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/vas_planning_feedback/VasPlanningFeedbackActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Forbidden]", "DS_TCH_BDGT_ARCHITECTURE [Deprecated]"})
/* loaded from: classes5.dex */
public final class VasPlanningFeedbackActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public SK0.b f323043m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public f f323044n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final InterfaceC42726C f323045o = C42727D.c(new d());

    /* compiled from: VasPlanningFeedbackActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "invoke", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<G0, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(G0 g02) {
            VasPlanningFeedbackActivity.this.finish();
            return G0.f406611a;
        }
    }

    /* compiled from: VasPlanningFeedbackActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LSK0/c;", "campaign", "Lkotlin/G0;", "invoke", "(LSK0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<SK0.c, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(SK0.c cVar) {
            SK0.c cVar2 = cVar;
            VasPlanningFeedbackActivity vasPlanningFeedbackActivity = VasPlanningFeedbackActivity.this;
            SK0.b bVar = vasPlanningFeedbackActivity.f323043m;
            if (bVar == null) {
                bVar = null;
            }
            b.a.a(bVar, cVar2, null, null, (e) vasPlanningFeedbackActivity.f323045o.getValue(), 6);
            return G0.f406611a;
        }
    }

    /* compiled from: VasPlanningFeedbackActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f323048b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(l lVar) {
            this.f323048b = (N) lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return this.f323048b.equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f323048b;
        }

        public final int hashCode() {
            return this.f323048b.hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f323048b.invoke(obj);
        }
    }

    /* compiled from: VasPlanningFeedbackActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/vas_planning_feedback/e;", "invoke", "()Lcom/avito/android/vas_planning_feedback/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<e> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final e invoke() {
            VasPlanningFeedbackActivity vasPlanningFeedbackActivity = VasPlanningFeedbackActivity.this;
            f fVar = vasPlanningFeedbackActivity.f323044n;
            if (fVar == null) {
                fVar = null;
            }
            return (e) new P0(vasPlanningFeedbackActivity, fVar).a(e.class);
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        com.avito.android.vas_planning_feedback.di.a.a().a(getResources(), (com.avito.android.vas_planning_feedback.di.c) C29972i.a(C29972i.b(this), com.avito.android.vas_planning_feedback.di.c.class)).a(this);
        InterfaceC42726C interfaceC42726C = this.f323045o;
        ((e) interfaceC42726C.getValue()).f323056L.observe(this, new c(new a()));
        ((e) interfaceC42726C.getValue()).f323057M.observe(this, new c(new b()));
    }
}
