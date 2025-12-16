package com.avito.android.soa_stat.profile_settings.view;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SoaStatSettingsView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/soa_stat/profile_settings/view/a;", "", "a", "b", "c", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface a {

    /* compiled from: SoaStatSettingsView.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/soa_stat/profile_settings/view/a$a;", "", "a", "b", "c", "Lcom/avito/android/soa_stat/profile_settings/view/a$a$a;", "Lcom/avito/android/soa_stat/profile_settings/view/a$a$b;", "Lcom/avito/android/soa_stat/profile_settings/view/a$a$c;", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.soa_stat.profile_settings.view.a$a, reason: collision with other inner class name */
    public interface InterfaceC8489a {

        /* compiled from: SoaStatSettingsView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/soa_stat/profile_settings/view/a$a$a;", "Lcom/avito/android/soa_stat/profile_settings/view/a$a;", "<init>", "()V", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.soa_stat.profile_settings.view.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C8490a implements InterfaceC8489a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C8490a f284224a = new C8490a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C8490a);
            }

            public final int hashCode() {
                return 492913478;
            }

            @k
            public final String toString() {
                return "NavClicked";
            }
        }

        /* compiled from: SoaStatSettingsView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/soa_stat/profile_settings/view/a$a$b;", "Lcom/avito/android/soa_stat/profile_settings/view/a$a;", "<init>", "()V", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.soa_stat.profile_settings.view.a$a$b */
        public static final /* data */ class b implements InterfaceC8489a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final b f284225a = new b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -2084636583;
            }

            @k
            public final String toString() {
                return "Refresh";
            }
        }

        /* compiled from: SoaStatSettingsView.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/soa_stat/profile_settings/view/a$a$c;", "Lcom/avito/android/soa_stat/profile_settings/view/a$a;", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.soa_stat.profile_settings.view.a$a$c */
        public static final /* data */ class c implements InterfaceC8489a {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f284226a;

            public c(boolean z12) {
                this.f284226a = z12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f284226a == ((c) obj).f284226a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f284226a);
            }

            @k
            public final String toString() {
                return r.x(new StringBuilder("SwitchClicked(enabled="), this.f284226a, ')');
            }
        }
    }

    /* compiled from: SoaStatSettingsView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/soa_stat/profile_settings/view/a$b;", "", "a", "Lcom/avito/android/soa_stat/profile_settings/view/a$b$a;", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: SoaStatSettingsView.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/soa_stat/profile_settings/view/a$b$a;", "Lcom/avito/android/soa_stat/profile_settings/view/a$b;", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.soa_stat.profile_settings.view.a$b$a, reason: collision with other inner class name */
        public static final /* data */ class C8491a implements b {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final ApiError f284227a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final Throwable f284228b;

            public C8491a(@l ApiError apiError, @l Throwable th2) {
                this.f284227a = apiError;
                this.f284228b = th2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C8491a)) {
                    return false;
                }
                C8491a c8491a = (C8491a) obj;
                return L.f(this.f284227a, c8491a.f284227a) && L.f(this.f284228b, c8491a.f284228b);
            }

            public final int hashCode() {
                ApiError apiError = this.f284227a;
                int iHashCode = (apiError == null ? 0 : apiError.hashCode()) * 31;
                Throwable th2 = this.f284228b;
                return iHashCode + (th2 != null ? th2.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ShowToggleError(apiError=");
                sb2.append(this.f284227a);
                sb2.append(", throwable=");
                return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f284228b, ')');
            }
        }
    }

    /* compiled from: SoaStatSettingsView.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/soa_stat/profile_settings/view/a$c;", "Lcom/avito/android/analytics/screens/mvi/q;", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/soa_stat/profile_settings/view/a$c$a;", "Lcom/avito/android/soa_stat/profile_settings/view/a$c$b;", "Lcom/avito/android/soa_stat/profile_settings/view/a$c$c;", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class c extends q {

        /* compiled from: SoaStatSettingsView.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/soa_stat/profile_settings/view/a$c$a;", "Lcom/avito/android/soa_stat/profile_settings/view/a$c;", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.soa_stat.profile_settings.view.a$c$a, reason: collision with other inner class name */
        public static final /* data */ class C8492a extends c {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final PrintableText f284229b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final AttributedText f284230c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final Image f284231d;

            /* renamed from: e, reason: collision with root package name */
            public final boolean f284232e;

            /* renamed from: f, reason: collision with root package name */
            public final boolean f284233f;

            public C8492a(@k PrintableText printableText, @k AttributedText attributedText, @l Image image, boolean z12, boolean z13) {
                super(null);
                this.f284229b = printableText;
                this.f284230c = attributedText;
                this.f284231d = image;
                this.f284232e = z12;
                this.f284233f = z13;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C8492a)) {
                    return false;
                }
                C8492a c8492a = (C8492a) obj;
                return L.f(this.f284229b, c8492a.f284229b) && L.f(this.f284230c, c8492a.f284230c) && L.f(this.f284231d, c8492a.f284231d) && this.f284232e == c8492a.f284232e && this.f284233f == c8492a.f284233f;
            }

            public final int hashCode() {
                int iB2 = com.avito.android.actions_sheet.a.b(this.f284229b.hashCode() * 31, 31, this.f284230c);
                Image image = this.f284231d;
                return Boolean.hashCode(this.f284233f) + r.i((iB2 + (image == null ? 0 : image.hashCode())) * 31, 31, this.f284232e);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Content(title=");
                sb2.append(this.f284229b);
                sb2.append(", text=");
                sb2.append(this.f284230c);
                sb2.append(", image=");
                sb2.append(this.f284231d);
                sb2.append(", switcherValue=");
                sb2.append(this.f284232e);
                sb2.append(", switcherEnabled=");
                return r.x(sb2, this.f284233f, ')');
            }
        }

        /* compiled from: SoaStatSettingsView.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/soa_stat/profile_settings/view/a$c$b;", "Lcom/avito/android/soa_stat/profile_settings/view/a$c;", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends c {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final ApiError f284234b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final Throwable f284235c;

            public b(@l ApiError apiError, @l Throwable th2) {
                super(null);
                this.f284234b = apiError;
                this.f284235c = th2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f284234b, bVar.f284234b) && L.f(this.f284235c, bVar.f284235c);
            }

            public final int hashCode() {
                ApiError apiError = this.f284234b;
                int iHashCode = (apiError == null ? 0 : apiError.hashCode()) * 31;
                Throwable th2 = this.f284235c;
                return iHashCode + (th2 != null ? th2.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Error(apiError=");
                sb2.append(this.f284234b);
                sb2.append(", throwable=");
                return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f284235c, ')');
            }
        }

        /* compiled from: SoaStatSettingsView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/soa_stat/profile_settings/view/a$c$c;", "Lcom/avito/android/soa_stat/profile_settings/view/a$c;", "<init>", "()V", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.soa_stat.profile_settings.view.a$c$c, reason: collision with other inner class name */
        public static final /* data */ class C8493c extends c {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C8493c f284236b = new C8493c();

            public C8493c() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C8493c);
            }

            public final int hashCode() {
                return 1190220969;
            }

            @k
            public final String toString() {
                return "Loading";
            }
        }

        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    void a(@k b bVar);

    void b(@k c cVar);

    @k
    InterfaceC43160i<InterfaceC8489a> getActions();
}
