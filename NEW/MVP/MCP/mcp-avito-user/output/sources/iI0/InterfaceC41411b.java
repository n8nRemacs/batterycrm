package ii0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.inline_filters.dialog.select.adapter.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DistrictInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lii0/b;", "", "a", "b", "c", "d", "e", "Lii0/b$a;", "Lii0/b$b;", "Lii0/b$c;", "Lii0/b$d;", "Lii0/b$e;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ii0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC41411b {

    /* compiled from: DistrictInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lii0/b$a;", "Lii0/b;", "<init>", "()V", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ii0.b$a */
    public static final /* data */ class a implements InterfaceC41411b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f398692a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 400408353;
        }

        @k
        public final String toString() {
            return "ClearAllCheckedDistricts";
        }
    }

    /* compiled from: DistrictInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lii0/b$b;", "Lii0/b;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ii0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11388b implements InterfaceC41411b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f398693a;

        public C11388b(@k ArrayList arrayList) {
            this.f398693a = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11388b) && this.f398693a.equals(((C11388b) obj).f398693a);
        }

        public final int hashCode() {
            return this.f398693a.hashCode();
        }

        @k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("CloseScreenWithSelectedDistricts(districtIds="), this.f398693a, ')');
        }
    }

    /* compiled from: DistrictInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lii0/b$c;", "Lii0/b;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ii0.b$c */
    public static final /* data */ class c implements InterfaceC41411b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<i> f398694a;

        public c(@k List<i> list) {
            this.f398694a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f398694a, ((c) obj).f398694a);
        }

        public final int hashCode() {
            return this.f398694a.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("Init(districts="), this.f398694a, ')');
        }
    }

    /* compiled from: DistrictInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lii0/b$d;", "Lii0/b;", "<init>", "()V", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ii0.b$d */
    public static final /* data */ class d implements InterfaceC41411b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f398695a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1668611510;
        }

        @k
        public final String toString() {
            return "RefreshResetButtonClickablity";
        }
    }

    /* compiled from: DistrictInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lii0/b$e;", "Lii0/b;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ii0.b$e */
    public static final /* data */ class e implements InterfaceC41411b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f398696a;

        public e(@k String str) {
            this.f398696a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f398696a, ((e) obj).f398696a);
        }

        public final int hashCode() {
            return this.f398696a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdateQueryString(query="), this.f398696a, ')');
        }
    }
}
