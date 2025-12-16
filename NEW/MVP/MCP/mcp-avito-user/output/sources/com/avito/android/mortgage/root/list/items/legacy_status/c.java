package com.avito.android.mortgage.root.list.items.legacy_status;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PersonalStatusContent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/legacy_status/c;", "", "a", "b", "c", "Lcom/avito/android/mortgage/root/list/items/legacy_status/c$a;", "Lcom/avito/android/mortgage/root/list/items/legacy_status/c$b;", "Lcom/avito/android/mortgage/root/list/items/legacy_status/c$c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface c {

    /* compiled from: PersonalStatusContent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/legacy_status/c$b;", "Lcom/avito/android/mortgage/root/list/items/legacy_status/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f202663a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f202664b;

        public b(@k String str, @l String str2) {
            this.f202663a = str;
            this.f202664b = str2;
        }

        @Override // com.avito.android.mortgage.root.list.items.legacy_status.c
        /* renamed from: a */
        public final int getF202662d() {
            return R.drawable.status_success;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f202663a, bVar.f202663a) && L.f(this.f202664b, bVar.f202664b);
        }

        @Override // com.avito.android.mortgage.root.list.items.legacy_status.c
        @l
        /* renamed from: getDescription, reason: from getter */
        public final String getF202666b() {
            return this.f202664b;
        }

        @Override // com.avito.android.mortgage.root.list.items.legacy_status.c
        @k
        /* renamed from: getTitle, reason: from getter */
        public final String getF202665a() {
            return this.f202663a;
        }

        public final int hashCode() {
            int iHashCode = this.f202663a.hashCode() * 31;
            String str = this.f202664b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Success(title=");
            sb2.append(this.f202663a);
            sb2.append(", description=");
            return C22026a.c(sb2, this.f202664b, ')');
        }
    }

    /* compiled from: PersonalStatusContent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/legacy_status/c$c;", "Lcom/avito/android/mortgage/root/list/items/legacy_status/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage.root.list.items.legacy_status.c$c, reason: collision with other inner class name */
    public static final /* data */ class C6030c implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f202665a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f202666b;

        public C6030c(@k String str, @l String str2) {
            this.f202665a = str;
            this.f202666b = str2;
        }

        @Override // com.avito.android.mortgage.root.list.items.legacy_status.c
        /* renamed from: a */
        public final int getF202662d() {
            return R.drawable.status_waiting;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6030c)) {
                return false;
            }
            C6030c c6030c = (C6030c) obj;
            return L.f(this.f202665a, c6030c.f202665a) && L.f(this.f202666b, c6030c.f202666b);
        }

        @Override // com.avito.android.mortgage.root.list.items.legacy_status.c
        @l
        /* renamed from: getDescription, reason: from getter */
        public final String getF202666b() {
            return this.f202666b;
        }

        @Override // com.avito.android.mortgage.root.list.items.legacy_status.c
        @k
        /* renamed from: getTitle, reason: from getter */
        public final String getF202665a() {
            return this.f202665a;
        }

        public final int hashCode() {
            int iHashCode = this.f202665a.hashCode() * 31;
            String str = this.f202666b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Waiting(title=");
            sb2.append(this.f202665a);
            sb2.append(", description=");
            return C22026a.c(sb2, this.f202666b, ')');
        }
    }

    /* renamed from: a */
    int getF202662d();

    @l
    /* renamed from: getDescription */
    String getF202666b();

    @k
    /* renamed from: getTitle */
    String getF202665a();

    /* compiled from: PersonalStatusContent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/legacy_status/c$a;", "Lcom/avito/android/mortgage/root/list/items/legacy_status/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f202659a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f202660b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f202661c;

        /* renamed from: d, reason: collision with root package name */
        public final int f202662d;

        public a(@k String str, @l String str2, boolean z12) {
            this.f202659a = str;
            this.f202660b = str2;
            this.f202661c = z12;
            this.f202662d = R.drawable.status_error;
        }

        @Override // com.avito.android.mortgage.root.list.items.legacy_status.c
        /* renamed from: a, reason: from getter */
        public final int getF202662d() {
            return this.f202662d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f202659a, aVar.f202659a) && L.f(this.f202660b, aVar.f202660b) && this.f202661c == aVar.f202661c;
        }

        @Override // com.avito.android.mortgage.root.list.items.legacy_status.c
        @l
        /* renamed from: getDescription, reason: from getter */
        public final String getF202666b() {
            return this.f202660b;
        }

        @Override // com.avito.android.mortgage.root.list.items.legacy_status.c
        @k
        /* renamed from: getTitle, reason: from getter */
        public final String getF202665a() {
            return this.f202659a;
        }

        public final int hashCode() {
            int iHashCode = this.f202659a.hashCode() * 31;
            String str = this.f202660b;
            return Boolean.hashCode(this.f202661c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(title=");
            sb2.append(this.f202659a);
            sb2.append(", description=");
            sb2.append(this.f202660b);
            sb2.append(", isActionLoading=");
            return r.x(sb2, this.f202661c, ')');
        }

        public /* synthetic */ a(String str, String str2, boolean z12, int i12, C42822w c42822w) {
            this(str, str2, (i12 & 4) != 0 ? false : z12);
        }
    }
}
