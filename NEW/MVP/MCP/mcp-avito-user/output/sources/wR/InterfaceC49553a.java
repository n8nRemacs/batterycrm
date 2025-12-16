package wR;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.chips.h;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LfLevelsAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LwR/a;", "", "a", "b", "c", "d", "e", "f", "LwR/a$a;", "LwR/a$b;", "LwR/a$c;", "LwR/a$d;", "LwR/a$e;", "LwR/a$f;", "_avito_lf-levels_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wR.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC49553a {

    /* compiled from: LfLevelsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LwR/a$a;", "LwR/a;", "_avito_lf-levels_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wR.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12819a implements InterfaceC49553a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f441437a;

        public C12819a(@k DeepLink deepLink) {
            this.f441437a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12819a) && L.f(this.f441437a, ((C12819a) obj).f441437a);
        }

        public final int hashCode() {
            return this.f441437a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("BusinessToolClick(deeplink="), this.f441437a, ')');
        }
    }

    /* compiled from: LfLevelsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LwR/a$b;", "LwR/a;", "<init>", "()V", "_avito_lf-levels_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wR.a$b */
    public static final /* data */ class b implements InterfaceC49553a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f441438a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 2138861439;
        }

        @k
        public final String toString() {
            return "ButtonAction";
        }
    }

    /* compiled from: LfLevelsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LwR/a$c;", "LwR/a;", "_avito_lf-levels_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wR.a$c */
    public static final /* data */ class c implements InterfaceC49553a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f441439a;

        public c(@k DeepLink deepLink) {
            this.f441439a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f441439a, ((c) obj).f441439a);
        }

        public final int hashCode() {
            return this.f441439a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("DeeplinkClicked(deeplink="), this.f441439a, ')');
        }
    }

    /* compiled from: LfLevelsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LwR/a$d;", "LwR/a;", "_avito_lf-levels_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wR.a$d */
    public static final /* data */ class d implements InterfaceC49553a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final h f441440a;

        public d(@k h hVar) {
            this.f441440a = hVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f441440a, ((d) obj).f441440a);
        }

        public final int hashCode() {
            return this.f441440a.hashCode();
        }

        @k
        public final String toString() {
            return "LevelClick(level=" + this.f441440a + ')';
        }
    }

    /* compiled from: LfLevelsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LwR/a$e;", "LwR/a;", "_avito_lf-levels_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wR.a$e */
    public static final /* data */ class e implements InterfaceC49553a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f441441a;

        public e(boolean z12) {
            this.f441441a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f441441a == ((e) obj).f441441a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f441441a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ProgressChanged(isLoading="), this.f441441a, ')');
        }
    }

    /* compiled from: LfLevelsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LwR/a$f;", "LwR/a;", "<init>", "()V", "_avito_lf-levels_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wR.a$f */
    public static final /* data */ class f implements InterfaceC49553a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f441442a = new f();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 729905412;
        }

        @k
        public final String toString() {
            return "Refresh";
        }
    }
}
