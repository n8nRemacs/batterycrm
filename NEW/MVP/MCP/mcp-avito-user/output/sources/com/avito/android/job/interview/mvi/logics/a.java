package com.avito.android.job.interview.mvi.logics;

import com.avito.android.arch.mvi.a;
import com.avito.android.job.interview.mvi.entity.InternalAction;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import vQ.C49251c;
import vQ.InterfaceC49249a;

/* compiled from: JobInterviewInvitationActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/job/interview/mvi/logics/a;", "Lcom/avito/android/arch/mvi/a;", "LvQ/a;", "Lcom/avito/android/job/interview/mvi/entity/InternalAction;", "LvQ/c;", "a", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC49249a, InternalAction, C49251c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.job.interview.domain.e f174593a;

    /* compiled from: JobInterviewInvitationActor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/job/interview/mvi/logics/a$a;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/job/interview/mvi/logics/a$a$a;", "Lcom/avito/android/job/interview/mvi/logics/a$a$b;", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.job.interview.mvi.logics.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC5150a {

        /* compiled from: JobInterviewInvitationActor.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/interview/mvi/logics/a$a$a;", "Lcom/avito/android/job/interview/mvi/logics/a$a;", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.job.interview.mvi.logics.a$a$a, reason: collision with other inner class name */
        public static final class C5151a extends AbstractC5150a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final ArrayList f174594a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f174595b;

            public C5151a(@Y61.k ArrayList arrayList, boolean z12) {
                super(null);
                this.f174594a = arrayList;
                this.f174595b = z12;
            }
        }

        /* compiled from: JobInterviewInvitationActor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/job/interview/mvi/logics/a$a$b;", "Lcom/avito/android/job/interview/mvi/logics/a$a;", "<init>", "()V", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.job.interview.mvi.logics.a$a$b */
        public static final class b extends AbstractC5150a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f174596a = new b();

            public b() {
                super(null);
            }
        }

        public /* synthetic */ AbstractC5150a(C42822w c42822w) {
            this();
        }

        public AbstractC5150a() {
        }
    }

    @Inject
    public a(@Y61.k com.avito.android.job.interview.domain.e eVar) {
        this.f174593a = eVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InternalAction> b(InterfaceC49249a interfaceC49249a, C49251c c49251c) {
        return C43175k.G(new b(interfaceC49249a, c49251c, this, null));
    }
}
