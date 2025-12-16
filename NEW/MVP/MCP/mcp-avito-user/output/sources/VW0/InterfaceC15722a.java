package Vw0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: SoaStatSettingAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LVw0/a;", "", "a", "b", "c", "LVw0/a$a;", "LVw0/a$b;", "LVw0/a$c;", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Vw0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC15722a {

    /* compiled from: SoaStatSettingAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVw0/a$a;", "LVw0/a;", "<init>", "()V", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vw0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1214a implements InterfaceC15722a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1214a f17501a = new C1214a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C1214a);
        }

        public final int hashCode() {
            return 1665842068;
        }

        @k
        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: SoaStatSettingAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVw0/a$b;", "LVw0/a;", "<init>", "()V", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vw0.a$b */
    public static final /* data */ class b implements InterfaceC15722a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f17502a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -899135715;
        }

        @k
        public final String toString() {
            return "Reload";
        }
    }

    /* compiled from: SoaStatSettingAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVw0/a$c;", "LVw0/a;", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vw0.a$c */
    public static final /* data */ class c implements InterfaceC15722a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f17503a;

        public c(boolean z12) {
            this.f17503a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f17503a == ((c) obj).f17503a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f17503a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ToggleSetting(enabled="), this.f17503a, ')');
        }
    }
}
