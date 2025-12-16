package Rf;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaReportGenerationState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"LRf/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "c", "d", "LRf/c$b;", "LRf/c$c;", "LRf/c$d;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Rf.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC15037c extends q {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f14540c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final com.avito.android.autoteka.items.reportGeneration.c f14541d = new com.avito.android.autoteka.items.reportGeneration.c(null, 1, null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.conveyor_item.a f14542b;

    /* compiled from: AutotekaReportGenerationState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRf/c$a;", "", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rf.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AutotekaReportGenerationState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRf/c$b;", "LRf/c;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rf.c$b */
    public static final /* data */ class b extends AbstractC15037c {

        /* renamed from: e, reason: collision with root package name */
        @k
        public final com.avito.android.autoteka.items.fullScreenError.reportGenerationError.c f14543e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final ApiError f14544f;

        public b(@k com.avito.android.autoteka.items.fullScreenError.reportGenerationError.c cVar, @k ApiError apiError) {
            super(cVar, null);
            this.f14543e = cVar;
            this.f14544f = apiError;
        }

        @Override // Rf.AbstractC15037c
        /* renamed from: c */
        public final com.avito.conveyor_item.a getF14542b() {
            return this.f14543e;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f14543e, bVar.f14543e) && L.f(this.f14544f, bVar.f14544f);
        }

        public final int hashCode() {
            return this.f14544f.hashCode() + (this.f14543e.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(item=");
            sb2.append(this.f14543e);
            sb2.append(", apiError=");
            return AK.c.n(sb2, this.f14544f, ')');
        }
    }

    /* compiled from: AutotekaReportGenerationState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRf/c$c;", "LRf/c;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rf.c$c, reason: collision with other inner class name */
    public static final /* data */ class C0969c extends AbstractC15037c {

        /* renamed from: e, reason: collision with root package name */
        @k
        public final com.avito.android.autoteka.items.reportGenerationResponse.c f14545e;

        public C0969c(@k com.avito.android.autoteka.items.reportGenerationResponse.c cVar) {
            super(cVar, null);
            this.f14545e = cVar;
        }

        @Override // Rf.AbstractC15037c
        /* renamed from: c */
        public final com.avito.conveyor_item.a getF14542b() {
            return this.f14545e;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0969c) && L.f(this.f14545e, ((C0969c) obj).f14545e);
        }

        public final int hashCode() {
            return this.f14545e.hashCode();
        }

        @k
        public final String toString() {
            return "Response(item=" + this.f14545e + ')';
        }
    }

    /* compiled from: AutotekaReportGenerationState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRf/c$d;", "LRf/c;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rf.c$d */
    public static final /* data */ class d extends AbstractC15037c {

        /* renamed from: e, reason: collision with root package name */
        @k
        public final com.avito.android.autoteka.items.reportGeneration.c f14546e;

        public d(@k com.avito.android.autoteka.items.reportGeneration.c cVar) {
            super(cVar, null);
            this.f14546e = cVar;
        }

        @Override // Rf.AbstractC15037c
        /* renamed from: c */
        public final com.avito.conveyor_item.a getF14542b() {
            return this.f14546e;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f14546e, ((d) obj).f14546e);
        }

        public final int hashCode() {
            return this.f14546e.f96965b.hashCode();
        }

        @k
        public final String toString() {
            return "Waiting(item=" + this.f14546e + ')';
        }
    }

    public AbstractC15037c(com.avito.conveyor_item.a aVar, C42822w c42822w) {
        this.f14542b = aVar;
    }

    @k
    /* renamed from: c, reason: from getter */
    public com.avito.conveyor_item.a getF14542b() {
        return this.f14542b;
    }
}
