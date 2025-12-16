package jL0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutoprolongAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LjL0/a;", "", "a", "b", "c", "d", "e", "LjL0/a$a;", "LjL0/a$b;", "LjL0/a$c;", "LjL0/a$d;", "LjL0/a$e;", "_avito_vas-autoprolong_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jL0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC42280a {

    /* compiled from: AutoprolongAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LjL0/a$a;", "LjL0/a;", "<init>", "()V", "_avito_vas-autoprolong_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jL0.a$a, reason: collision with other inner class name */
    public static final class C11559a implements InterfaceC42280a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11559a f405555a = new C11559a();
    }

    /* compiled from: AutoprolongAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LjL0/a$b;", "LjL0/a;", "<init>", "()V", "_avito_vas-autoprolong_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jL0.a$b */
    public static final class b implements InterfaceC42280a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f405556a = new b();
    }

    /* compiled from: AutoprolongAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LjL0/a$c;", "LjL0/a;", "_avito_vas-autoprolong_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jL0.a$c */
    public static final /* data */ class c implements InterfaceC42280a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f405557a;

        public c(@k DeepLink deepLink) {
            this.f405557a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f405557a, ((c) obj).f405557a);
        }

        public final int hashCode() {
            return this.f405557a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("DeeplinkClicked(deeplink="), this.f405557a, ')');
        }
    }

    /* compiled from: AutoprolongAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LjL0/a$d;", "LjL0/a;", "<init>", "()V", "_avito_vas-autoprolong_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jL0.a$d */
    public static final class d implements InterfaceC42280a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f405558a = new d();
    }

    /* compiled from: AutoprolongAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LjL0/a$e;", "LjL0/a;", "_avito_vas-autoprolong_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jL0.a$e */
    public static final /* data */ class e implements InterfaceC42280a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f405559a;

        public e(boolean z12) {
            this.f405559a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f405559a == ((e) obj).f405559a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f405559a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ToggleChanged(isChecked="), this.f405559a, ')');
        }
    }
}
