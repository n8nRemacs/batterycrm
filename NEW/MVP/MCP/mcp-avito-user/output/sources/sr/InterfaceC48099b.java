package sR;

import Y61.k;
import Y61.l;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import dU0.InterfaceC39628a;
import kotlin.InterfaceC40047a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LegalRequestOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"LsR/b;", "", "a", "b", "c", "d", "e", "f", "g", "LsR/b$d;", "LsR/b$e;", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sR.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC48099b {

    /* compiled from: LegalRequestOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LsR/b$a;", "LsR/b$d;", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sR.b$a */
    public static final /* data */ class a implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final InterfaceC40047a f437651a;

        public a(@k InterfaceC40047a interfaceC40047a) {
            this.f437651a = interfaceC40047a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f437651a, ((a) obj).f437651a);
        }

        public final int hashCode() {
            return this.f437651a.hashCode();
        }

        @k
        public final String toString() {
            return "HandleBeduinAction(beduinAction=" + this.f437651a + ')';
        }
    }

    /* compiled from: LegalRequestOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LsR/b$b;", "LsR/b$e;", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sR.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12617b implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final InterfaceC39628a f437652a;

        public C12617b(@k InterfaceC39628a interfaceC39628a) {
            this.f437652a = interfaceC39628a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12617b) && L.f(this.f437652a, ((C12617b) obj).f437652a);
        }

        public final int hashCode() {
            return this.f437652a.hashCode();
        }

        @k
        public final String toString() {
            return "HandleComponentInteraction(componentInteraction=" + this.f437652a + ')';
        }
    }

    /* compiled from: LegalRequestOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LsR/b$c;", "LsR/b$e;", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sR.b$c */
    public static final /* data */ class c implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final dU0.b f437653a;

        public c(@k dU0.b bVar) {
            this.f437653a = bVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f437653a, ((c) obj).f437653a);
        }

        public final int hashCode() {
            return this.f437653a.hashCode();
        }

        @k
        public final String toString() {
            return "HandlePlatformInteraction(platformInteraction=" + this.f437653a + ')';
        }
    }

    /* compiled from: LegalRequestOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002¨\u0006\u0003"}, d2 = {"LsR/b$d;", "LsR/b;", "LsR/b$a;", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sR.b$d */
    public interface d extends InterfaceC48099b {
    }

    /* compiled from: LegalRequestOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"LsR/b$e;", "LsR/b;", "LsR/b$b;", "LsR/b$c;", "LsR/b$f;", "LsR/b$g;", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sR.b$e */
    public interface e extends InterfaceC48099b {
    }

    /* compiled from: LegalRequestOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LsR/b$f;", "LsR/b$e;", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sR.b$f */
    public static final /* data */ class f implements e {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            ((f) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "ShowError(error=null)";
        }
    }

    /* compiled from: LegalRequestOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LsR/b$g;", "LsR/b$e;", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sR.b$g */
    public static final /* data */ class g implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final BeduinOneTimeEvent.ShowToastBar f437654a;

        public g(@k BeduinOneTimeEvent.ShowToastBar showToastBar) {
            this.f437654a = showToastBar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f437654a, ((g) obj).f437654a);
        }

        public final int hashCode() {
            return this.f437654a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowToastBar(rawEvent=" + this.f437654a + ')';
        }
    }
}
