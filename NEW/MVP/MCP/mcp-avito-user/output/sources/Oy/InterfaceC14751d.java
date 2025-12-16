package Oy;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BugReporterDeepLinkState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"LOy/d;", "", "a", "b", "c", "d", "LOy/d$b;", "LOy/d$c;", "LOy/d$d;", "_avito_employee-bug-reporter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Oy.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC14751d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f12735a = a.f12736a;

    /* compiled from: BugReporterDeepLinkState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOy/d$a;", "", "<init>", "()V", "_avito_employee-bug-reporter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Oy.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f12736a = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final C0822d f12737b = C0822d.f12740b;
    }

    /* compiled from: BugReporterDeepLinkState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOy/d$b;", "LOy/d;", "<init>", "()V", "_avito_employee-bug-reporter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Oy.d$b */
    public static final /* data */ class b implements InterfaceC14751d {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final b f12738b = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 83890654;
        }

        @k
        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: BugReporterDeepLinkState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOy/d$c;", "LOy/d;", "_avito_employee-bug-reporter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Oy.d$c */
    public static final /* data */ class c implements InterfaceC14751d {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f12739b;

        public c(@k DeepLink deepLink) {
            this.f12739b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f12739b, ((c) obj).f12739b);
        }

        public final int hashCode() {
            return this.f12739b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("Loaded(deepLink="), this.f12739b, ')');
        }
    }

    /* compiled from: BugReporterDeepLinkState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOy/d$d;", "LOy/d;", "<init>", "()V", "_avito_employee-bug-reporter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Oy.d$d, reason: collision with other inner class name */
    public static final /* data */ class C0822d implements InterfaceC14751d {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final C0822d f12740b = new C0822d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0822d);
        }

        public final int hashCode() {
            return 367655113;
        }

        @k
        public final String toString() {
            return "NotLoaded";
        }
    }
}
