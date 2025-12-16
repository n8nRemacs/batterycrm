package com.avito.android.profile_tab.summary.mvi;

import Dc0.InterfaceC13386c;
import com.avito.android.arch.mvi.utils.n;
import com.avito.android.arch.mvi.utils.o;
import com.avito.android.profile_tab.summary.e;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ProfileSummaryActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/profile_tab/summary/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LDc0/c;", "LDc0/e;", "LDc0/f;", "a", "b", "_avito_profile-tab_summary_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC13386c, Dc0.e, Dc0.f> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final R0 f230879a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_tab.summary.domain.c f230880b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f230881c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_tab.summary.domain.b f230882d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final o f230883e;

    /* compiled from: ProfileSummaryActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile_tab/summary/mvi/a$a;", "", "a", "b", "c", "Lcom/avito/android/profile_tab/summary/mvi/a$a$a;", "_avito_profile-tab_summary_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile_tab.summary.mvi.a$a, reason: collision with other inner class name */
    public interface InterfaceC7024a {

        /* compiled from: ProfileSummaryActor.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_tab/summary/mvi/a$a$a;", "Lcom/avito/android/profile_tab/summary/mvi/a$a;", "Lcom/avito/android/profile_tab/summary/mvi/a$a$b;", "Lcom/avito/android/profile_tab/summary/mvi/a$a$c;", "_avito_profile-tab_summary_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile_tab.summary.mvi.a$a$a, reason: collision with other inner class name */
        public interface InterfaceC7025a extends InterfaceC7024a {
        }

        /* compiled from: ProfileSummaryActor.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_tab/summary/mvi/a$a$b;", "Lcom/avito/android/profile_tab/summary/mvi/a$a$a;", "_avito_profile-tab_summary_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile_tab.summary.mvi.a$a$b */
        public static final /* data */ class b implements InterfaceC7025a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final com.avito.android.profile_tab.summary.e f230884a;

            public b(@Y61.k com.avito.android.profile_tab.summary.e eVar) {
                this.f230884a = eVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f230884a, ((b) obj).f230884a);
            }

            public final int hashCode() {
                return this.f230884a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "ParamsChanged(params=" + this.f230884a + ')';
            }
        }

        /* compiled from: ProfileSummaryActor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_tab/summary/mvi/a$a$c;", "Lcom/avito/android/profile_tab/summary/mvi/a$a$a;", "<init>", "()V", "_avito_profile-tab_summary_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile_tab.summary.mvi.a$a$c */
        public static final /* data */ class c implements InterfaceC7025a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final c f230885a = new c();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 659484276;
            }

            @Y61.k
            public final String toString() {
                return "Reload";
            }
        }
    }

    /* compiled from: ProfileSummaryActor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile_tab/summary/mvi/a$b;", "", "c", "d", "e", "_avito_profile-tab_summary_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final c f230886b = new c(null);

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.profile_tab.summary.e f230887a;

        /* compiled from: ProfileSummaryActor.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/profile_tab/summary/mvi/a$b$a", "Lcom/avito/android/profile_tab/summary/mvi/a$b$d;", "_avito_profile-tab_summary_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile_tab.summary.mvi.a$b$a, reason: collision with other inner class name */
        public static final class C7026a implements d {
        }

        /* compiled from: ProfileSummaryActor.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/profile_tab/summary/mvi/a$b$b", "Lcom/avito/android/profile_tab/summary/mvi/a$b$e;", "_avito_profile-tab_summary_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile_tab.summary.mvi.a$b$b, reason: collision with other inner class name */
        public static final class C7027b implements e {
        }

        /* compiled from: ProfileSummaryActor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_tab/summary/mvi/a$b$c;", "", "<init>", "()V", "_avito_profile-tab_summary_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c {
            public /* synthetic */ c(C42822w c42822w) {
                this();
            }

            public c() {
            }
        }

        /* compiled from: ProfileSummaryActor.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_tab/summary/mvi/a$b$d;", "", "_avito_profile-tab_summary_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface d {
        }

        /* compiled from: ProfileSummaryActor.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_tab/summary/mvi/a$b$e;", "", "_avito_profile-tab_summary_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface e {
        }

        static {
            new C7026a();
            new C7027b();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f230887a, ((b) obj).f230887a);
        }

        public final int hashCode() {
            return this.f230887a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "PrivateState(params=" + this.f230887a + ')';
        }

        public b(@Y61.k com.avito.android.profile_tab.summary.e eVar) {
            this.f230887a = eVar;
        }

        public /* synthetic */ b(com.avito.android.profile_tab.summary.e eVar, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? e.b.f230870a : eVar);
        }
    }

    @Inject
    public a(@Y61.k R0 r02, @Y61.k com.avito.android.profile_tab.summary.domain.c cVar, @Y61.k InterfaceC35863o4 interfaceC35863o4, @Y61.k com.avito.android.profile_tab.summary.domain.b bVar, @Y61.k com.avito.android.profile_tab.summary.a aVar) {
        this.f230879a = r02;
        this.f230880b = cVar;
        this.f230881c = interfaceC35863o4;
        this.f230882d = bVar;
        n.a aVar2 = com.avito.android.arch.mvi.utils.n.f92111a;
        b bVar2 = new b(aVar.f230846a);
        aVar2.getClass();
        this.f230883e = new o(bVar2);
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        C0 c0B = C43175k.B(new h(this, null), C43175k.N(new e(new f(c43197r1, this)), new g(this.f230882d.a())));
        b.f230886b.getClass();
        b.c cVar = b.f230886b;
        return C43175k.N(c0B, C43175k.Y(this.f230883e.f92113b, new i(null, aVar, this)));
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<Dc0.e> b(InterfaceC13386c interfaceC13386c, Dc0.f fVar) {
        return C43175k.w();
    }
}
