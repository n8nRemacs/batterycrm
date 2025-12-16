package Fy0;

import SK0.f;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UxfState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"LFy0/a;", "", "a", "b", "c", "LFy0/a$b;", "LFy0/a$c;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Fy0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC13856a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C0317a f6106a = C0317a.f6107a;

    /* compiled from: UxfState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFy0/a$a;", "", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fy0.a$a, reason: collision with other inner class name */
    public static final class C0317a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ C0317a f6107a = new C0317a();
    }

    /* compiled from: UxfState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFy0/a$b;", "LFy0/a;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fy0.a$b */
    public static final /* data */ class b implements InterfaceC13856a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final b f6108b = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 482417675;
        }

        @k
        public final String toString() {
            return "None";
        }
    }

    /* compiled from: UxfState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFy0/a$c;", "LFy0/a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fy0.a$c */
    public static final /* data */ class c implements InterfaceC13856a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final f f6109b;

        public c(@k f fVar) {
            this.f6109b = fVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f6109b, ((c) obj).f6109b);
        }

        public final int hashCode() {
            return this.f6109b.f14906a.hashCode();
        }

        @k
        public final String toString() {
            return "WithProperties(uxFbProperties=" + this.f6109b + ')';
        }
    }
}
