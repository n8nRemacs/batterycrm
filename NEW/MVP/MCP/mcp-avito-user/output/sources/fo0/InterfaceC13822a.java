package Fo0;

import Y61.k;
import Y61.l;
import com.avito.android.saved_searches.model.SavedSearchData;
import com.avito.android.saved_searches.presentation.settings.SavedSearchSettingsMode;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SavedSearchSettingsAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LFo0/a;", "", "a", "b", "c", "d", "e", "f", "LFo0/a$a;", "LFo0/a$b;", "LFo0/a$c;", "LFo0/a$d;", "LFo0/a$e;", "LFo0/a$f;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Fo0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC13822a {

    /* compiled from: SavedSearchSettingsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFo0/a$a;", "LFo0/a;", "<init>", "()V", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fo0.a$a, reason: collision with other inner class name */
    public static final class C0303a implements InterfaceC13822a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0303a f5981a = new C0303a();
    }

    /* compiled from: SavedSearchSettingsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFo0/a$b;", "LFo0/a;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fo0.a$b */
    public static final /* data */ class b implements InterfaceC13822a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f5982a;

        public b(@k ArrayList arrayList) {
            this.f5982a = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f5982a.equals(((b) obj).f5982a);
        }

        public final int hashCode() {
            return this.f5982a.hashCode();
        }

        @k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("DayOfWeekSelected(selectedDayOfWeekIds="), this.f5982a, ')');
        }
    }

    /* compiled from: SavedSearchSettingsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFo0/a$c;", "LFo0/a;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fo0.a$c */
    public static final /* data */ class c implements InterfaceC13822a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final SavedSearchData.Settings.SettingsDetails f5983a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SavedSearchSettingsMode f5984b;

        public c(@k SavedSearchData.Settings.SettingsDetails settingsDetails, @k SavedSearchSettingsMode savedSearchSettingsMode) {
            this.f5983a = settingsDetails;
            this.f5984b = savedSearchSettingsMode;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f5983a, cVar.f5983a) && this.f5984b == cVar.f5984b;
        }

        public final int hashCode() {
            return this.f5984b.hashCode() + (this.f5983a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "Init(details=" + this.f5983a + ", mode=" + this.f5984b + ')';
        }
    }

    /* compiled from: SavedSearchSettingsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFo0/a$d;", "LFo0/a;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fo0.a$d */
    public static final /* data */ class d implements InterfaceC13822a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f5985a;

        public d(@k ArrayList arrayList) {
            this.f5985a = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f5985a.equals(((d) obj).f5985a);
        }

        public final int hashCode() {
            return this.f5985a.hashCode();
        }

        @k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("PeriodicitySelected(selectedPeriodicityIds="), this.f5985a, ')');
        }
    }

    /* compiled from: SavedSearchSettingsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFo0/a$e;", "LFo0/a;", "<init>", "()V", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fo0.a$e */
    public static final class e implements InterfaceC13822a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f5986a = new e();
    }

    /* compiled from: SavedSearchSettingsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFo0/a$f;", "LFo0/a;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fo0.a$f */
    public static final /* data */ class f implements InterfaceC13822a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f5987a;

        public f(@k ArrayList arrayList) {
            this.f5987a = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f5987a.equals(((f) obj).f5987a);
        }

        public final int hashCode() {
            return this.f5987a.hashCode();
        }

        @k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("TimeOfDaySelected(selectedTimeOfDayIds="), this.f5987a, ')');
        }
    }
}
