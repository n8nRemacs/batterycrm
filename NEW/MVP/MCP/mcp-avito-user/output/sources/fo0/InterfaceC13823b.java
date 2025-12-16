package Fo0;

import Y61.k;
import Y61.l;
import com.avito.android.saved_searches.model.SavedSearchData;
import com.avito.android.saved_searches.presentation.settings.SavedSearchSettingsMode;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SavedSearchSettingsOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LFo0/b;", "", "a", "b", "LFo0/b$a;", "LFo0/b$b;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Fo0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC13823b {

    /* compiled from: SavedSearchSettingsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFo0/b$a;", "LFo0/b;", "<init>", "()V", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fo0.b$a */
    public static final class a implements InterfaceC13823b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f5988a = new a();
    }

    /* compiled from: SavedSearchSettingsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFo0/b$b;", "LFo0/b;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Fo0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0304b implements InterfaceC13823b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final SavedSearchSettingsMode f5989a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SavedSearchData.Settings.SettingsDetails f5990b;

        public C0304b(@k SavedSearchData.Settings.SettingsDetails settingsDetails, @k SavedSearchSettingsMode savedSearchSettingsMode) {
            this.f5989a = savedSearchSettingsMode;
            this.f5990b = settingsDetails;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0304b)) {
                return false;
            }
            C0304b c0304b = (C0304b) obj;
            return this.f5989a == c0304b.f5989a && L.f(this.f5990b, c0304b.f5990b);
        }

        public final int hashCode() {
            return this.f5990b.hashCode() + (this.f5989a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "HandleSelectedSettings(mode=" + this.f5989a + ", settingsDetails=" + this.f5990b + ')';
        }
    }
}
