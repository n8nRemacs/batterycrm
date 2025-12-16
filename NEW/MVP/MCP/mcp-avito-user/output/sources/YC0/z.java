package yc0;

import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile_settings_extended.adapter.item_selections.SelectionsItem;
import com.avito.android.profile_settings_extended.adapter.item_selections.adapter.create.CreateSelectionItem;
import com.avito.android.profile_settings_extended.adapter.item_selections.adapter.selection.SelectionItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSettingsAction.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lyc0/z;", "Lyc0/D;", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "Lyc0/z$a;", "Lyc0/z$b;", "Lyc0/z$c;", "Lyc0/z$d;", "Lyc0/z$e;", "Lyc0/z$f;", "Lyc0/z$g;", "Lyc0/z$h;", "Lyc0/z$i;", "Lyc0/z$j;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface z extends D {

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/z$a;", "Lyc0/z;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements z {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SelectionItem f443355a;

        public a(@Y61.k SelectionItem selectionItem) {
            this.f443355a = selectionItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f443355a, ((a) obj).f443355a);
        }

        public final int hashCode() {
            return this.f443355a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ChangeSelectionPublic(selection=" + this.f443355a + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyc0/z$b;", "Lyc0/z;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements z {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f443356a = new b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1315645859;
        }

        @Y61.k
        public final String toString() {
            return "CloseSelectionMenu";
        }
    }

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/z$c;", "Lyc0/z;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements z {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f443357a;

        public c(@Y61.k String str) {
            this.f443357a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f443357a, ((c) obj).f443357a);
        }

        public final int hashCode() {
            return this.f443357a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("CopyLink(link="), this.f443357a, ')');
        }
    }

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyc0/z$d;", "Lyc0/z;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements z {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f443358a = new d();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -43745243;
        }

        @Y61.k
        public final String toString() {
            return "OnSelectionCreated";
        }
    }

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/z$e;", "Lyc0/z;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements z {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f443359a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f443360b;

        public e(@Y61.k String str, @Y61.k String str2) {
            this.f443359a = str;
            this.f443360b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f443359a, eVar.f443359a) && L.f(this.f443360b, eVar.f443360b);
        }

        public final int hashCode() {
            return this.f443360b.hashCode() + (this.f443359a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RemoveSelection(fieldName=");
            sb2.append(this.f443359a);
            sb2.append(", valueId=");
            return C22026a.c(sb2, this.f443360b, ')');
        }
    }

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/z$f;", "Lyc0/z;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements z {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SelectionItem f443361a;

        public f(@Y61.k SelectionItem selectionItem) {
            this.f443361a = selectionItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f443361a, ((f) obj).f443361a);
        }

        public final int hashCode() {
            return this.f443361a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "SelectionClick(item=" + this.f443361a + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/z$g;", "Lyc0/z;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements z {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CreateSelectionItem f443362a;

        public g(@Y61.k CreateSelectionItem createSelectionItem) {
            this.f443362a = createSelectionItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f443362a, ((g) obj).f443362a);
        }

        public final int hashCode() {
            return this.f443362a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "SelectionCreateClick(item=" + this.f443362a + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/z$h;", "Lyc0/z;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements z {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SelectionItem f443363a;

        public h(@Y61.k SelectionItem selectionItem) {
            this.f443363a = selectionItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f443363a, ((h) obj).f443363a);
        }

        public final int hashCode() {
            return this.f443363a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "SelectionEditClick(item=" + this.f443363a + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/z$i;", "Lyc0/z;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements z {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SelectionsItem f443364a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Parcelable f443365b;

        public i(@Y61.k SelectionsItem selectionsItem, @Y61.l Parcelable parcelable) {
            this.f443364a = selectionsItem;
            this.f443365b = parcelable;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return L.f(this.f443364a, iVar.f443364a) && L.f(this.f443365b, iVar.f443365b);
        }

        public final int hashCode() {
            int iHashCode = this.f443364a.hashCode() * 31;
            Parcelable parcelable = this.f443365b;
            return iHashCode + (parcelable == null ? 0 : parcelable.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SelectionsScrollAction(item=");
            sb2.append(this.f443364a);
            sb2.append(", scrollState=");
            return com.avito.android.advert.item.delivery_suggests.l.o(sb2, this.f443365b, ')');
        }
    }

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/z$j;", "Lyc0/z;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements z {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f443366a;

        public j(@Y61.k DeepLink deepLink) {
            this.f443366a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f443366a, ((j) obj).f443366a);
        }

        public final int hashCode() {
            return this.f443366a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("ShowSelection(deeplink="), this.f443366a, ')');
        }
    }
}
