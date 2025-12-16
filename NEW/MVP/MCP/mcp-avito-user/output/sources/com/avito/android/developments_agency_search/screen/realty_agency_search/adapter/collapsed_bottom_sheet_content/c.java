package com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.collapsed_bottom_sheet_content;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CollapsedBottomSheetContentItem.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/adapter/collapsed_bottom_sheet_content/c;", "Lcom/avito/conveyor_item/a;", "a", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a f138291b;

    /* compiled from: CollapsedBottomSheetContentItem.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/adapter/collapsed_bottom_sheet_content/c$a;", "", "a", "b", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/adapter/collapsed_bottom_sheet_content/c$a$a;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/adapter/collapsed_bottom_sheet_content/c$a$b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: CollapsedBottomSheetContentItem.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/adapter/collapsed_bottom_sheet_content/c$a$a;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/adapter/collapsed_bottom_sheet_content/c$a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.collapsed_bottom_sheet_content.c$a$a, reason: collision with other inner class name */
        public static final /* data */ class C4172a implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f138292a;

            public C4172a(@k String str) {
                this.f138292a = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C4172a) && L.f(this.f138292a, ((C4172a) obj).f138292a);
            }

            public final int hashCode() {
                return this.f138292a.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("SearchResultText(text="), this.f138292a, ')');
            }
        }

        /* compiled from: CollapsedBottomSheetContentItem.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/adapter/collapsed_bottom_sheet_content/c$a$b;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/adapter/collapsed_bottom_sheet_content/c$a;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final b f138293a = new b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1925779567;
            }

            @k
            public final String toString() {
                return "Spinner";
            }
        }
    }

    public c(@k a aVar) {
        this.f138291b = aVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        cVar.getClass();
        return L.f(this.f138291b, cVar.f138291b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF139156b() {
        return -1513948819;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF131428d() {
        return "collapsed_bottom_sheet-item";
    }

    public final int hashCode() {
        return this.f138291b.hashCode() + 312226867;
    }

    @k
    public final String toString() {
        return "CollapsedBottomSheetContentItem(stringId=collapsed_bottom_sheet-item, content=" + this.f138291b + ')';
    }
}
