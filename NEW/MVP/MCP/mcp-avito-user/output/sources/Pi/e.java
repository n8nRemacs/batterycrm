package pi;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin_models.BeduinAction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NavBar.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0013\u000eB+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lpi/e;", "", "", "title", "Lpi/e$a;", "leftButton", "", "rightButtons", "<init>", "(Ljava/lang/String;Lpi/e$a;Ljava/util/List;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Lpi/e$a;", "b", "()Lpi/e$a;", "Ljava/util/List;", "c", "()Ljava/util/List;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class e {

    @com.google.gson.annotations.c("leftButton")
    @l
    private final a leftButton;

    @com.google.gson.annotations.c("rightButtons")
    @l
    private final List<a> rightButtons;

    @com.google.gson.annotations.c("title")
    @l
    private final String title;

    /* compiled from: NavBar.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lpi/e$a;", "", "", "id", "Lpi/e$b;", "icon", "description", "", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "<init>", "(Ljava/lang/String;Lpi/e$b;Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lpi/e$b;", "c", "()Lpi/e$b;", "b", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        @com.google.gson.annotations.c("actions")
        @l
        private final List<BeduinAction> actions;

        @com.google.gson.annotations.c("description")
        @l
        private final String description;

        @com.google.gson.annotations.c("icon")
        @k
        private final b icon;

        @com.google.gson.annotations.c("id")
        @k
        private final String id;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@k String str, @k b bVar, @l String str2, @l List<? extends BeduinAction> list) {
            this.id = str;
            this.icon = bVar;
            this.description = str2;
            this.actions = list;
        }

        @l
        public final List<BeduinAction> a() {
            return this.actions;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final b getIcon() {
            return this.icon;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.id, aVar.id) && L.f(this.icon, aVar.icon) && L.f(this.description, aVar.description) && L.f(this.actions, aVar.actions);
        }

        public final int hashCode() {
            int iHashCode = (this.icon.hashCode() + (this.id.hashCode() * 31)) * 31;
            String str = this.description;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            List<BeduinAction> list = this.actions;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Button(id=");
            sb2.append(this.id);
            sb2.append(", icon=");
            sb2.append(this.icon);
            sb2.append(", description=");
            sb2.append(this.description);
            sb2.append(", actions=");
            return H.p(sb2, this.actions, ')');
        }
    }

    /* compiled from: NavBar.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lpi/e$b;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        @com.google.gson.annotations.c("name")
        @k
        private final String name;

        public b(@k String str) {
            this.name = str;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.name, ((b) obj).name);
        }

        public final int hashCode() {
            return this.name.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Icon(name="), this.name, ')');
        }
    }

    public e(@l String str, @l a aVar, @l List<a> list) {
        this.title = str;
        this.leftButton = aVar;
        this.rightButtons = list;
    }

    public static e a(e eVar, String str) {
        a aVar = eVar.leftButton;
        List<a> list = eVar.rightButtons;
        eVar.getClass();
        return new e(str, aVar, list);
    }

    @l
    /* renamed from: b, reason: from getter */
    public final a getLeftButton() {
        return this.leftButton;
    }

    @l
    public final List<a> c() {
        return this.rightButtons;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.title, eVar.title) && L.f(this.leftButton, eVar.leftButton) && L.f(this.rightButtons, eVar.rightButtons);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        a aVar = this.leftButton;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        List<a> list = this.rightButtons;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NavBar(title=");
        sb2.append(this.title);
        sb2.append(", leftButton=");
        sb2.append(this.leftButton);
        sb2.append(", rightButtons=");
        return H.p(sb2, this.rightButtons, ')');
    }
}
