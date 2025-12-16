package hB;

import Y61.k;
import Y61.l;
import com.avito.android.extended_profile_universal_widget_edit.UniversalWidgetEditArguments;
import hB.InterfaceC40798a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UniversalWidgetCreateOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LhB/b;", "", "a", "b", "c", "d", "LhB/b$a;", "LhB/b$b;", "LhB/b$c;", "LhB/b$d;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hB.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC40799b {

    /* compiled from: UniversalWidgetCreateOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LhB/b$a;", "LhB/b;", "<init>", "()V", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: hB.b$a */
    public static final /* data */ class a implements InterfaceC40799b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f397094a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1428035587;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: UniversalWidgetCreateOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LhB/b$b;", "LhB/b;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: hB.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11246b implements InterfaceC40799b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f397095a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final UniversalWidgetEditArguments f397096b;

        public C11246b(@k String str, @k UniversalWidgetEditArguments universalWidgetEditArguments) {
            this.f397095a = str;
            this.f397096b = universalWidgetEditArguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11246b)) {
                return false;
            }
            C11246b c11246b = (C11246b) obj;
            return L.f(this.f397095a, c11246b.f397095a) && L.f(this.f397096b, c11246b.f397096b);
        }

        public final int hashCode() {
            return this.f397096b.hashCode() + (this.f397095a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "OpenEditScreen(valueId=" + this.f397095a + ", editArguments=" + this.f397096b + ')';
        }
    }

    /* compiled from: UniversalWidgetCreateOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LhB/b$c;", "LhB/b;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: hB.b$c */
    public static final /* data */ class c implements InterfaceC40799b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Throwable f397097a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InterfaceC40798a.b f397098b;

        public c(@k Throwable th2, @k InterfaceC40798a.b bVar) {
            this.f397097a = th2;
            this.f397098b = bVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f397097a, cVar.f397097a) && this.f397098b.equals(cVar.f397098b);
        }

        public final int hashCode() {
            return this.f397098b.f397093a.hashCode() + (this.f397097a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ShowCommonErrorToastBar(throwable=" + this.f397097a + ", buttonAction=" + this.f397098b + ')';
        }
    }

    /* compiled from: UniversalWidgetCreateOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LhB/b$d;", "LhB/b;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: hB.b$d */
    public static final /* data */ class d implements InterfaceC40799b {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            ((d) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "ShowErrorToastBar(message=null)";
        }
    }
}
