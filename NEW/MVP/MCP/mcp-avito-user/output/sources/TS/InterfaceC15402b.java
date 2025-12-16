package Ts;

import Y61.k;
import Y61.l;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.crm_candidates.view.list_items.inline_filters.JobCrmInlineFilterItem;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: JobCrmInlineFiltersOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LTs/b;", "", "a", "b", "c", "LTs/b$a;", "LTs/b$b;", "LTs/b$c;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ts.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC15402b {

    /* compiled from: JobCrmInlineFiltersOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LTs/b$a;", "LTs/b;", "<init>", "()V", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ts.b$a */
    public static final /* data */ class a implements InterfaceC15402b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f15959a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -102262031;
        }

        @k
        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: JobCrmInlineFiltersOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTs/b$b;", "LTs/b;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ts.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1086b implements InterfaceC15402b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final JobCrmInlineFilterItem f15960a;

        public C1086b(@k JobCrmInlineFilterItem jobCrmInlineFilterItem) {
            this.f15960a = jobCrmInlineFilterItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1086b) && L.f(this.f15960a, ((C1086b) obj).f15960a);
        }

        public final int hashCode() {
            return this.f15960a.hashCode();
        }

        @k
        public final String toString() {
            return "OpenListItemPicker(item=" + this.f15960a + ')';
        }
    }

    /* compiled from: JobCrmInlineFiltersOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTs/b$c;", "LTs/b;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ts.b$c */
    public static final /* data */ class c implements InterfaceC15402b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f15961a;

        public c(@k ArrayList arrayList) {
            this.f15961a = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f15961a.equals(((c) obj).f15961a);
        }

        public final int hashCode() {
            return this.f15961a.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("ShowAllFilters(filters="), this.f15961a, ')');
        }
    }
}
