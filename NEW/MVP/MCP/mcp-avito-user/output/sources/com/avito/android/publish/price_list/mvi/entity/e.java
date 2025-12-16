package com.avito.android.publish.price_list.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.publish.objects.ObjectFillFormScreenParams;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectPriceListOneTimeEvent.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/e;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "Lcom/avito/android/publish/price_list/mvi/entity/e$a;", "Lcom/avito/android/publish/price_list/mvi/entity/e$b;", "Lcom/avito/android/publish/price_list/mvi/entity/e$c;", "Lcom/avito/android/publish/price_list/mvi/entity/e$d;", "Lcom/avito/android/publish/price_list/mvi/entity/e$e;", "Lcom/avito/android/publish/price_list/mvi/entity/e$f;", "Lcom/avito/android/publish/price_list/mvi/entity/e$g;", "Lcom/avito/android/publish/price_list/mvi/entity/e$h;", "Lcom/avito/android/publish/price_list/mvi/entity/e$i;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface e {

    /* compiled from: SelectPriceListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/e$a;", "Lcom/avito/android/publish/price_list/mvi/entity/e;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ObjectsParameter f238835a;

        public a(@k ObjectsParameter objectsParameter) {
            this.f238835a = objectsParameter;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f238835a, ((a) obj).f238835a);
        }

        public final int hashCode() {
            return this.f238835a.hashCode();
        }

        @k
        public final String toString() {
            return "Back(changedParameter=" + this.f238835a + ')';
        }
    }

    /* compiled from: SelectPriceListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/e$b;", "Lcom/avito/android/publish/price_list/mvi/entity/e;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ObjectsParameter f238836a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ObjectFillFormScreenParams.SelectedValue f238837b;

        public b(@k ObjectsParameter objectsParameter, @k ObjectFillFormScreenParams.SelectedValue selectedValue) {
            this.f238836a = objectsParameter;
            this.f238837b = selectedValue;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f238836a, bVar.f238836a) && L.f(this.f238837b, bVar.f238837b);
        }

        public final int hashCode() {
            return this.f238837b.hashCode() + (this.f238836a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "NavigateToAddObjectScreen(parameter=" + this.f238836a + ", selectedValue=" + this.f238837b + ')';
        }
    }

    /* compiled from: SelectPriceListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/e$c;", "Lcom/avito/android/publish/price_list/mvi/entity/e;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ObjectsParameter f238838a;

        /* renamed from: b, reason: collision with root package name */
        public final int f238839b;

        public c(@k ObjectsParameter objectsParameter, int i12) {
            this.f238838a = objectsParameter;
            this.f238839b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f238838a, cVar.f238838a) && this.f238839b == cVar.f238839b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f238839b) + (this.f238838a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NavigateToEditObjectScreen(parameter=");
            sb2.append(this.f238838a);
            sb2.append(", position=");
            return r.t(sb2, this.f238839b, ')');
        }
    }

    /* compiled from: SelectPriceListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/e$d;", "Lcom/avito/android/publish/price_list/mvi/entity/e;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f238840a = new d();
    }

    /* compiled from: SelectPriceListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/e$e;", "Lcom/avito/android/publish/price_list/mvi/entity/e;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.price_list.mvi.entity.e$e, reason: collision with other inner class name */
    public static final class C7175e implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C7175e f238841a = new C7175e();
    }

    /* compiled from: SelectPriceListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/e$f;", "Lcom/avito/android/publish/price_list/mvi/entity/e;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements e {

        /* renamed from: a, reason: collision with root package name */
        public final int f238842a;

        public f(int i12) {
            this.f238842a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f238842a == ((f) obj).f238842a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f238842a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ScrollToFirstItemError(position="), this.f238842a, ')');
        }
    }

    /* compiled from: SelectPriceListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/e$g;", "Lcom/avito/android/publish/price_list/mvi/entity/e;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f238843a;

        public g(@k String str) {
            this.f238843a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f238843a, ((g) obj).f238843a);
        }

        public final int hashCode() {
            return this.f238843a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowDefaultMessage(message="), this.f238843a, ')');
        }
    }

    /* compiled from: SelectPriceListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/e$h;", "Lcom/avito/android/publish/price_list/mvi/entity/e;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f238844a;

        public h(@k String str) {
            this.f238844a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f238844a, ((h) obj).f238844a);
        }

        public final int hashCode() {
            return this.f238844a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowErrorMessage(message="), this.f238844a, ')');
        }
    }

    /* compiled from: SelectPriceListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/price_list/mvi/entity/e$i;", "Lcom/avito/android/publish/price_list/mvi/entity/e;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f238845a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f238846b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final PrintableText f238847c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final PrintableText f238848d;

        public i(@k PrintableText printableText, @k PrintableText printableText2, @k PrintableText printableText3, @k PrintableText printableText4) {
            this.f238845a = printableText;
            this.f238846b = printableText2;
            this.f238847c = printableText3;
            this.f238848d = printableText4;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return L.f(this.f238845a, iVar.f238845a) && L.f(this.f238846b, iVar.f238846b) && L.f(this.f238847c, iVar.f238847c) && L.f(this.f238848d, iVar.f238848d);
        }

        public final int hashCode() {
            return this.f238848d.hashCode() + com.avito.android.actions_sheet.a.f(this.f238847c, com.avito.android.actions_sheet.a.f(this.f238846b, this.f238845a.hashCode() * 31, 31), 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowPriceListClearDialog(title=");
            sb2.append(this.f238845a);
            sb2.append(", subtitle=");
            sb2.append(this.f238846b);
            sb2.append(", positiveButtonText=");
            sb2.append(this.f238847c);
            sb2.append(", negativeButtonText=");
            return AK.c.m(sb2, this.f238848d, ')');
        }
    }
}
