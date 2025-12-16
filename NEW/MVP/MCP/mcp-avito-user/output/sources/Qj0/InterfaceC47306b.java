package qJ0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import qJ0.InterfaceC47308d;

/* compiled from: FiltersDelegateInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LqJ0/b;", "", "a", "b", "c", "d", "e", "f", "LqJ0/b$a;", "LqJ0/b$b;", "LqJ0/b$c;", "LqJ0/b$d;", "LqJ0/b$e;", "LqJ0/b$f;", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qJ0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC47306b {

    /* compiled from: FiltersDelegateInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LqJ0/b$a;", "LqJ0/b;", "<init>", "()V", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qJ0.b$a */
    public static final /* data */ class a implements InterfaceC47306b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f429166a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 533244589;
        }

        @k
        public final String toString() {
            return "FlushBackChanges";
        }
    }

    /* compiled from: FiltersDelegateInternalAction.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LqJ0/b$b;", "LqJ0/b;", "a", "b", "c", "LqJ0/b$b$a;", "LqJ0/b$b$b;", "LqJ0/b$b$c;", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qJ0.b$b, reason: collision with other inner class name */
    public interface InterfaceC12317b extends InterfaceC47306b {

        /* compiled from: FiltersDelegateInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LqJ0/b$b$a;", "LqJ0/b$b;", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: qJ0.b$b$a */
        public static final /* data */ class a implements InterfaceC12317b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f429167a;

            /* JADX WARN: Multi-variable type inference failed */
            public a(@k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list) {
                this.f429167a = list;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f429167a, ((a) obj).f429167a);
            }

            public final int hashCode() {
                return this.f429167a.hashCode();
            }

            @k
            public final String toString() {
                return H.p(new StringBuilder("Bottom(components="), this.f429167a, ')');
            }
        }

        /* compiled from: FiltersDelegateInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LqJ0/b$b$b;", "LqJ0/b$b;", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: qJ0.b$b$b, reason: collision with other inner class name */
        public static final /* data */ class C12318b implements InterfaceC12317b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f429168a;

            /* JADX WARN: Multi-variable type inference failed */
            public C12318b(@k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list) {
                this.f429168a = list;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C12318b) && L.f(this.f429168a, ((C12318b) obj).f429168a);
            }

            public final int hashCode() {
                return this.f429168a.hashCode();
            }

            @k
            public final String toString() {
                return H.p(new StringBuilder("Main(components="), this.f429168a, ')');
            }
        }

        /* compiled from: FiltersDelegateInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LqJ0/b$b$c;", "LqJ0/b$b;", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: qJ0.b$b$c */
        public static final /* data */ class c implements InterfaceC12317b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f429169a;

            /* JADX WARN: Multi-variable type inference failed */
            public c(@k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list) {
                this.f429169a = list;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && L.f(this.f429169a, ((c) obj).f429169a);
            }

            public final int hashCode() {
                return this.f429169a.hashCode();
            }

            @k
            public final String toString() {
                return H.p(new StringBuilder("Top(components="), this.f429169a, ')');
            }
        }
    }

    /* compiled from: FiltersDelegateInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LqJ0/b$c;", "LqJ0/b;", "a", "b", "LqJ0/b$c$a;", "LqJ0/b$c$b;", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qJ0.b$c */
    public interface c extends InterfaceC47306b {

        /* compiled from: FiltersDelegateInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LqJ0/b$c$a;", "LqJ0/b$c;", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: qJ0.b$c$a */
        public static final /* data */ class a implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final Map<String, Object> f429170a;

            public a(@k Map<String, ? extends Object> map) {
                this.f429170a = map;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f429170a, ((a) obj).f429170a);
            }

            public final int hashCode() {
                return this.f429170a.hashCode();
            }

            @k
            public final String toString() {
                return r.w(new StringBuilder("Default(params="), this.f429170a, ')');
            }
        }

        /* compiled from: FiltersDelegateInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LqJ0/b$c$b;", "LqJ0/b$c;", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: qJ0.b$c$b, reason: collision with other inner class name */
        public static final /* data */ class C12319b implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final Map<String, Object> f429171a;

            public C12319b(@k Map<String, ? extends Object> map) {
                this.f429171a = map;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C12319b) && L.f(this.f429171a, ((C12319b) obj).f429171a);
            }

            public final int hashCode() {
                return this.f429171a.hashCode();
            }

            @k
            public final String toString() {
                return r.w(new StringBuilder("Main(params="), this.f429171a, ')');
            }
        }
    }

    /* compiled from: FiltersDelegateInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LqJ0/b$d;", "LqJ0/b;", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qJ0.b$d */
    public static final /* data */ class d implements InterfaceC47306b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f429172a;

        public d(boolean z12) {
            this.f429172a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f429172a == ((d) obj).f429172a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f429172a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("NavBarEnabled(enabled="), this.f429172a, ')');
        }
    }

    /* compiled from: FiltersDelegateInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LqJ0/b$e;", "LqJ0/b;", "<init>", "()V", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qJ0.b$e */
    public static final /* data */ class e implements InterfaceC47306b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f429173a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -846867898;
        }

        @k
        public final String toString() {
            return "NoChange";
        }
    }

    /* compiled from: FiltersDelegateInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LqJ0/b$f;", "LqJ0/b;", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qJ0.b$f */
    public static final /* data */ class f implements InterfaceC47306b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<InterfaceC47308d.a.C12320a> f429174a;

        public f(@k List<InterfaceC47308d.a.C12320a> list) {
            this.f429174a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f429174a, ((f) obj).f429174a);
        }

        public final int hashCode() {
            return this.f429174a.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("PrepareBackChanges(backChanges="), this.f429174a, ')');
        }
    }
}
