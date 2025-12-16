package Ts;

import Y61.k;
import Y61.l;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.crm_candidates.view.list_items.inline_filters.JobCrmInlineFilterItem;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: JobCrmInlineFiltersAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LTs/a;", "", "a", "b", "c", "d", "LTs/a$a;", "LTs/a$b;", "LTs/a$c;", "LTs/a$d;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ts.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC15401a {

    /* compiled from: JobCrmInlineFiltersAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTs/a$a;", "LTs/a;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ts.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1085a implements InterfaceC15401a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f15955a;

        public C1085a(@k ArrayList arrayList) {
            this.f15955a = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1085a) && this.f15955a.equals(((C1085a) obj).f15955a);
        }

        public final int hashCode() {
            return this.f15955a.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("ApplyAllFilters(list="), this.f15955a, ')');
        }
    }

    /* compiled from: JobCrmInlineFiltersAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LTs/a$b;", "LTs/a;", "<init>", "()V", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ts.a$b */
    public static final /* data */ class b implements InterfaceC15401a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f15956a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 93417444;
        }

        @k
        public final String toString() {
            return "DropFilters";
        }
    }

    /* compiled from: JobCrmInlineFiltersAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTs/a$c;", "LTs/a;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ts.a$c */
    public static final /* data */ class c implements InterfaceC15401a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final JobCrmInlineFilterItem f15957a;

        public c(@k JobCrmInlineFilterItem jobCrmInlineFilterItem) {
            this.f15957a = jobCrmInlineFilterItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f15957a, ((c) obj).f15957a);
        }

        public final int hashCode() {
            return this.f15957a.hashCode();
        }

        @k
        public final String toString() {
            return "FilterClicked(item=" + this.f15957a + ')';
        }
    }

    /* compiled from: JobCrmInlineFiltersAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LTs/a$d;", "LTs/a;", "<init>", "()V", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ts.a$d */
    public static final /* data */ class d implements InterfaceC15401a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f15958a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1973054470;
        }

        @k
        public final String toString() {
            return "ReloadFilters";
        }
    }
}
