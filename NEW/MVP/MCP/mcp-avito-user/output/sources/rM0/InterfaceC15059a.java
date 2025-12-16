package Rm0;

import Y61.k;
import Y61.l;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import kotlin.AbstractC40048c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReputationAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LRm0/a;", "", "a", "b", "c", "d", "LRm0/a$a;", "LRm0/a$b;", "LRm0/a$c;", "LRm0/a$d;", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Rm0.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC15059a {

    /* compiled from: ReputationAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRm0/a$a;", "LRm0/a;", "<init>", "()V", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rm0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0975a implements InterfaceC15059a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0975a f14605a = new C0975a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0975a);
        }

        public final int hashCode() {
            return 1406636713;
        }

        @k
        public final String toString() {
            return "BackPressed";
        }
    }

    /* compiled from: ReputationAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRm0/a$b;", "LRm0/a;", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rm0.a$b */
    public static final /* data */ class b implements InterfaceC15059a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final BeduinOneTimeEvent f14606a;

        public b(@k BeduinOneTimeEvent beduinOneTimeEvent) {
            this.f14606a = beduinOneTimeEvent;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f14606a, ((b) obj).f14606a);
        }

        public final int hashCode() {
            return this.f14606a.hashCode();
        }

        @k
        public final String toString() {
            return "HandleBeduinEvent(beduinOneTimeEvent=" + this.f14606a + ')';
        }
    }

    /* compiled from: ReputationAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRm0/a$c;", "LRm0/a;", "<init>", "()V", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rm0.a$c */
    public static final /* data */ class c implements InterfaceC15059a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f14607a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1436971208;
        }

        @k
        public final String toString() {
            return "Load";
        }
    }

    /* compiled from: ReputationAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRm0/a$d;", "LRm0/a;", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rm0.a$d */
    public static final /* data */ class d implements InterfaceC15059a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AbstractC40048c f14608a;

        public d(@k AbstractC40048c abstractC40048c) {
            this.f14608a = abstractC40048c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f14608a, ((d) obj).f14608a);
        }

        public final int hashCode() {
            return this.f14608a.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateBeduinState(beduinState=" + this.f14608a + ')';
        }
    }
}
