package yc0;

import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_extended.adapter.link_edit.LinkEditItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSettingsAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lyc0/s;", "Lyc0/D;", "a", "b", "Lyc0/s$a;", "Lyc0/s$b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface s extends D {

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/s$a;", "Lyc0/s;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements s {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final LinkEditItem.Action f443336a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final LinkEditItem f443337b;

        public a(@Y61.k LinkEditItem.Action action, @Y61.k LinkEditItem linkEditItem) {
            this.f443336a = action;
            this.f443337b = linkEditItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f443336a, aVar.f443336a) && L.f(this.f443337b, aVar.f443337b);
        }

        public final int hashCode() {
            return this.f443337b.hashCode() + (this.f443336a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "ActionClickAction(action=" + this.f443336a + ", item=" + this.f443337b + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/s$b;", "Lyc0/s;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements s {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final LinkEditItem f443338a;

        public b(@Y61.k LinkEditItem linkEditItem) {
            this.f443338a = linkEditItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f443338a, ((b) obj).f443338a);
        }

        public final int hashCode() {
            return this.f443338a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ShowMoreActionsClick(item=" + this.f443338a + ')';
        }
    }
}
