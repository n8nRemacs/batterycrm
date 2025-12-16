package com.avito.android.crm_paid_cvs.features.cv_list.entity;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.crm_paid_cvs.dto.CvItem;
import com.avito.android.crm_paid_cvs.dto.CvStatus;
import com.avito.android.crm_paid_cvs.dto.FilterItem;
import com.avito.android.crm_paid_cvs.dto.OptionItem;
import com.avito.android.crm_paid_cvs.features.cv_list.entity.CvListState;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CvListAction.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0082\u0001\u000e\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a$a;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a$b;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a$c;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a$d;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a$e;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a$f;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a$g;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a$h;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a$i;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a$j;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a$k;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a$l;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a$m;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a$n;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface a {

    /* compiled from: CvListAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a$a;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.crm_paid_cvs.features.cv_list.entity.a$a, reason: collision with other inner class name */
    public static final /* data */ class C3878a implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ArrayList f130515a;

        public C3878a(@Y61.k ArrayList arrayList) {
            this.f130515a = arrayList;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3878a) && this.f130515a.equals(((C3878a) obj).f130515a);
        }

        public final int hashCode() {
            return this.f130515a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("ApplyAllFilters(filters="), this.f130515a, ')');
        }
    }

    /* compiled from: CvListAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a$b;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f130516a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<OptionItem> f130517b;

        public b(@Y61.k String str, @Y61.k List<OptionItem> list) {
            this.f130516a = str;
            this.f130517b = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f130516a, bVar.f130516a) && L.f(this.f130517b, bVar.f130517b);
        }

        public final int hashCode() {
            return this.f130517b.hashCode() + (this.f130516a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ApplyFilter(filterId=");
            sb2.append(this.f130516a);
            sb2.append(", selectedOptions=");
            return H.p(sb2, this.f130517b, ')');
        }
    }

    /* compiled from: CvListAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a$c;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CvListState.Tab f130518a;

        public c(@Y61.k CvListState.Tab tab) {
            this.f130518a = tab;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f130518a == ((c) obj).f130518a;
        }

        public final int hashCode() {
            return this.f130518a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ChangeTab(tab=" + this.f130518a + ')';
        }
    }

    /* compiled from: CvListAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a$d;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CvItem f130519a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final CvStatus f130520b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f130521c;

        public d(@Y61.k CvItem cvItem, @Y61.k CvStatus cvStatus, @Y61.k String str) {
            this.f130519a = cvItem;
            this.f130520b = cvStatus;
            this.f130521c = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f130519a, dVar.f130519a) && L.f(this.f130520b, dVar.f130520b) && L.f(this.f130521c, dVar.f130521c);
        }

        public final int hashCode() {
            return this.f130521c.hashCode() + ((this.f130520b.hashCode() + (this.f130519a.hashCode() * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CloseNote(item=");
            sb2.append(this.f130519a);
            sb2.append(", status=");
            sb2.append(this.f130520b);
            sb2.append(", noteText=");
            return C22026a.c(sb2, this.f130521c, ')');
        }
    }

    /* compiled from: CvListAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a$e;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CvItem f130522a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final CvStatus f130523b;

        public e(@Y61.k CvItem cvItem, @Y61.k CvStatus cvStatus) {
            this.f130522a = cvItem;
            this.f130523b = cvStatus;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f130522a, eVar.f130522a) && L.f(this.f130523b, eVar.f130523b);
        }

        public final int hashCode() {
            return this.f130523b.hashCode() + (this.f130522a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "CloseStatus(item=" + this.f130522a + ", status=" + this.f130523b + ')';
        }
    }

    /* compiled from: CvListAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a$f;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a;", "<init>", "()V", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final f f130524a = new f();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 683633040;
        }

        @Y61.k
        public final String toString() {
            return "DropFilters";
        }
    }

    /* compiled from: CvListAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a$g;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a;", "<init>", "()V", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final g f130525a = new g();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -559601577;
        }

        @Y61.k
        public final String toString() {
            return "LoadMore";
        }
    }

    /* compiled from: CvListAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a$h;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final FilterItem f130526a;

        public h(@Y61.k FilterItem filterItem) {
            this.f130526a = filterItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f130526a, ((h) obj).f130526a);
        }

        public final int hashCode() {
            return this.f130526a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenFilter(filter=" + this.f130526a + ')';
        }
    }

    /* compiled from: CvListAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a$i;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CvItem f130527a;

        public i(@Y61.k CvItem cvItem) {
            this.f130527a = cvItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f130527a, ((i) obj).f130527a);
        }

        public final int hashCode() {
            return this.f130527a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenNote(item=" + this.f130527a + ')';
        }
    }

    /* compiled from: CvListAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a$j;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CvItem f130528a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f130529b;

        public j(@Y61.k CvItem cvItem, @Y61.k String str) {
            this.f130528a = cvItem;
            this.f130529b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return L.f(this.f130528a, jVar.f130528a) && L.f(this.f130529b, jVar.f130529b);
        }

        public final int hashCode() {
            return this.f130529b.hashCode() + (this.f130528a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenStatus(item=");
            sb2.append(this.f130528a);
            sb2.append(", noteText=");
            return C22026a.c(sb2, this.f130529b, ')');
        }
    }

    /* compiled from: CvListAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a$k;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a;", "<init>", "()V", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final k f130530a = new k();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -142079587;
        }

        @Y61.k
        public final String toString() {
            return "RefreshList";
        }
    }

    /* compiled from: CvListAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a$l;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a;", "<init>", "()V", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final l f130531a = new l();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return -1760626221;
        }

        @Y61.k
        public final String toString() {
            return "ReloadList";
        }
    }

    /* compiled from: CvListAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a$m;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class m implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f130532a;

        public m(@Y61.k String str) {
            this.f130532a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && L.f(this.f130532a, ((m) obj).f130532a);
        }

        public final int hashCode() {
            return this.f130532a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ToggleComparison(itemId="), this.f130532a, ')');
        }
    }

    /* compiled from: CvListAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a$n;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/a;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class n implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CvItem f130533a;

        public n(@Y61.k CvItem cvItem) {
            this.f130533a = cvItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && L.f(this.f130533a, ((n) obj).f130533a);
        }

        public final int hashCode() {
            return this.f130533a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ToggleFavorite(item=" + this.f130533a + ')';
        }
    }
}
