package dX;

import androidx.compose.foundation.H;
import com.adjust.sdk.Constants;
import com.avito.android.remote.model.ProfileTab;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CriteriaData.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0011B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LdX/b;", "", "", "title", "LdX/b$a;", "tabs", "LdX/q;", Constants.REFERRER_API_META, "<init>", "(Ljava/lang/String;LdX/b$a;LdX/q;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "LdX/b$a;", "b", "()LdX/b$a;", "LdX/q;", "a", "()LdX/q;", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dX.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C39635b {

    @com.google.gson.annotations.c(Constants.REFERRER_API_META)
    @Y61.l
    private final q meta;

    @com.google.gson.annotations.c("tabs")
    @Y61.k
    private final a tabs;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    /* compiled from: CriteriaData.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\f\tB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LdX/b$a;", "", "LdX/b$a$b;", ProfileTab.ALL, "LdX/b$a$a;", "advices", "<init>", "(LdX/b$a$b;LdX/b$a$a;)V", "LdX/b$a$b;", "b", "()LdX/b$a$b;", "LdX/b$a$a;", "a", "()LdX/b$a$a;", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dX.b$a */
    public static final /* data */ class a {

        @com.google.gson.annotations.c("advices")
        @Y61.l
        private final C11028a advices;

        @com.google.gson.annotations.c(ProfileTab.ALL)
        @Y61.k
        private final C11029b all;

        /* compiled from: CriteriaData.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LdX/b$a$a;", "", "", "title", "", "LdX/e;", "items", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: dX.b$a$a, reason: collision with other inner class name */
        public static final /* data */ class C11028a {

            @com.google.gson.annotations.c("items")
            @Y61.k
            private final List<e> items;

            @com.google.gson.annotations.c("title")
            @Y61.k
            private final String title;

            public C11028a(@Y61.k String str, @Y61.k List<e> list) {
                this.title = str;
                this.items = list;
            }

            @Y61.k
            public final List<e> a() {
                return this.items;
            }

            @Y61.k
            /* renamed from: b, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C11028a)) {
                    return false;
                }
                C11028a c11028a = (C11028a) obj;
                return L.f(this.title, c11028a.title) && L.f(this.items, c11028a.items);
            }

            public final int hashCode() {
                return this.items.hashCode() + (this.title.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("AdvicesTab(title=");
                sb2.append(this.title);
                sb2.append(", items=");
                return H.p(sb2, this.items, ')');
            }
        }

        /* compiled from: CriteriaData.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LdX/b$a$b;", "", "", "title", "", "LdX/d;", "groups", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: dX.b$a$b, reason: collision with other inner class name */
        public static final /* data */ class C11029b {

            @com.google.gson.annotations.c("groups")
            @Y61.k
            private final List<d> groups;

            @com.google.gson.annotations.c("title")
            @Y61.k
            private final String title;

            public C11029b(@Y61.k String str, @Y61.k List<d> list) {
                this.title = str;
                this.groups = list;
            }

            @Y61.k
            public final List<d> a() {
                return this.groups;
            }

            @Y61.k
            /* renamed from: b, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C11029b)) {
                    return false;
                }
                C11029b c11029b = (C11029b) obj;
                return L.f(this.title, c11029b.title) && L.f(this.groups, c11029b.groups);
            }

            public final int hashCode() {
                return this.groups.hashCode() + (this.title.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("AllTab(title=");
                sb2.append(this.title);
                sb2.append(", groups=");
                return H.p(sb2, this.groups, ')');
            }
        }

        public a(@Y61.k C11029b c11029b, @Y61.l C11028a c11028a) {
            this.all = c11029b;
            this.advices = c11028a;
        }

        @Y61.l
        /* renamed from: a, reason: from getter */
        public final C11028a getAdvices() {
            return this.advices;
        }

        @Y61.k
        /* renamed from: b, reason: from getter */
        public final C11029b getAll() {
            return this.all;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.all, aVar.all) && L.f(this.advices, aVar.advices);
        }

        public final int hashCode() {
            int iHashCode = this.all.hashCode() * 31;
            C11028a c11028a = this.advices;
            return iHashCode + (c11028a == null ? 0 : c11028a.hashCode());
        }

        @Y61.k
        public final String toString() {
            return "Tabs(all=" + this.all + ", advices=" + this.advices + ')';
        }
    }

    public C39635b(@Y61.k String str, @Y61.k a aVar, @Y61.l q qVar) {
        this.title = str;
        this.tabs = aVar;
        this.meta = qVar;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final q getMeta() {
        return this.meta;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final a getTabs() {
        return this.tabs;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39635b)) {
            return false;
        }
        C39635b c39635b = (C39635b) obj;
        return L.f(this.title, c39635b.title) && L.f(this.tabs, c39635b.tabs) && L.f(this.meta, c39635b.meta);
    }

    public final int hashCode() {
        int iHashCode = (this.tabs.hashCode() + (this.title.hashCode() * 31)) * 31;
        q qVar = this.meta;
        return iHashCode + (qVar == null ? 0 : qVar.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "CriteriaData(title=" + this.title + ", tabs=" + this.tabs + ", meta=" + this.meta + ')';
    }
}
