package HI0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.j;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_flat_card.g;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_progress_card.h;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PanelConfigLoadingItem.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LHI0/a;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/a;", "b", "c", "d", "LHI0/a$b;", "LHI0/a$c;", "LHI0/a$d;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface a extends com.avito.android.user_adverts.root_screen.adverts_host.panel_view.a {

    /* compiled from: PanelConfigLoadingItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: HI0.a$a, reason: collision with other inner class name */
    public static final class C0403a {
    }

    /* compiled from: PanelConfigLoadingItem.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LHI0/a$b;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_card/j;", "LHI0/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements j, a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f7026b;

        public b(@k String str) {
            this.f7026b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f7026b, ((b) obj).f7026b);
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF268996b() {
            return a.C10492a.a(this);
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId, reason: from getter */
        public final String getF2713d() {
            return this.f7026b;
        }

        public final int hashCode() {
            return this.f7026b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("LoadingCard(stringId="), this.f7026b, ')');
        }
    }

    /* compiled from: PanelConfigLoadingItem.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LHI0/a$c;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_flat_card/g;", "LHI0/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements g, a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f7027b;

        public c(@k String str) {
            this.f7027b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f7027b, ((c) obj).f7027b);
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF268996b() {
            return a.C10492a.a(this);
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId, reason: from getter */
        public final String getF2713d() {
            return this.f7027b;
        }

        public final int hashCode() {
            return this.f7027b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("LoadingFlatCard(stringId="), this.f7027b, ')');
        }
    }

    /* compiled from: PanelConfigLoadingItem.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LHI0/a$d;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_progress_card/h;", "LHI0/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements h, a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f7028b;

        public d(@k String str) {
            this.f7028b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f7028b, ((d) obj).f7028b);
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF268996b() {
            return a.C10492a.a(this);
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId, reason: from getter */
        public final String getF2713d() {
            return this.f7028b;
        }

        public final int hashCode() {
            return this.f7028b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("LoadingProgressCard(stringId="), this.f7028b, ')');
        }
    }
}
