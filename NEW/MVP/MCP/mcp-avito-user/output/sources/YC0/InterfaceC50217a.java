package yc0;

import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_extended.adapter.about.AboutItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSettingsAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lyc0/a;", "Lyc0/D;", "a", "b", "Lyc0/a$a;", "Lyc0/a$b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yc0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC50217a extends D {

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/a$a;", "Lyc0/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yc0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12908a implements InterfaceC50217a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AboutItem f443224a;

        public C12908a(@Y61.k AboutItem aboutItem) {
            this.f443224a = aboutItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12908a) && L.f(this.f443224a, ((C12908a) obj).f443224a);
        }

        public final int hashCode() {
            return this.f443224a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "AboutWidgetClick(item=" + this.f443224a + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/a$b;", "Lyc0/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yc0.a$b */
    public static final /* data */ class b implements InterfaceC50217a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AboutItem f443225a;

        public b(@Y61.k AboutItem aboutItem) {
            this.f443225a = aboutItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f443225a, ((b) obj).f443225a);
        }

        public final int hashCode() {
            return this.f443225a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnAboutTextExpanded(item=" + this.f443225a + ')';
        }
    }
}
