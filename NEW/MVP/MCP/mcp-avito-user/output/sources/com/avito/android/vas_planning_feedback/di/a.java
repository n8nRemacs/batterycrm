package com.avito.android.vas_planning_feedback.di;

import android.content.res.Resources;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.vas_planning_feedback.VasPlanningFeedbackActivity;
import com.avito.android.vas_planning_feedback.di.b;
import com.avito.android.vas_planning_feedback.f;
import dagger.internal.e;
import dagger.internal.t;

/* compiled from: DaggerVasPlanningFeedbackComponent.java */
@e
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: DaggerVasPlanningFeedbackComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.vas_planning_feedback.di.b.a
        public final com.avito.android.vas_planning_feedback.di.b a(Resources resources, com.avito.android.vas_planning_feedback.di.c cVar) {
            return new c(cVar, resources, null);
        }
    }

    /* compiled from: DaggerVasPlanningFeedbackComponent.java */
    public static final class c implements com.avito.android.vas_planning_feedback.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.vas_planning_feedback.di.c f323052a;

        public c(com.avito.android.vas_planning_feedback.di.c cVar, Resources resources, C9982a c9982a) {
            this.f323052a = cVar;
        }

        @Override // com.avito.android.vas_planning_feedback.di.b
        public final void a(VasPlanningFeedbackActivity vasPlanningFeedbackActivity) {
            com.avito.android.vas_planning_feedback.di.c cVar = this.f323052a;
            SK0.b bVarP = cVar.p();
            t.c(bVarP);
            vasPlanningFeedbackActivity.f323043m = bVarP;
            InterfaceC35745a5 interfaceC35745a5D = cVar.d();
            t.c(interfaceC35745a5D);
            vasPlanningFeedbackActivity.f323044n = new f(interfaceC35745a5D);
        }
    }

    public static b.a a() {
        return new b();
    }
}
