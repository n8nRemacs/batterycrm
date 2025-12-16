package com.avito.android.developments_agency_search.screen.deal_room.mvi.entity;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.developments_agency_search.domain.GetDealRoomInfoResponse;
import com.avito.android.developments_agency_search.domain.UploadDealDocumentResponse;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.util.ApiException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DealRoomInternalAction.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0012\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0082\u0001\u0012\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%¨\u0006&"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction;", "", "a", "b", "c", "d", "MainInfoLoading", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$a;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$b;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$c;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$d;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$MainInfoLoading;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$e;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$f;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$g;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$h;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$i;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$j;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$k;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$l;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$m;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$n;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$o;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$p;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$q;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface DealRoomInternalAction {

    /* compiled from: DealRoomInternalAction.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$MainInfoLoading;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction;", "Loaded", "LoadingError", "StartLoading", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$MainInfoLoading$Loaded;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$MainInfoLoading$LoadingError;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$MainInfoLoading$StartLoading;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface MainInfoLoading extends DealRoomInternalAction {

        /* compiled from: DealRoomInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$MainInfoLoading$Loaded;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$MainInfoLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Loaded implements MainInfoLoading, TrackableContent {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final GetDealRoomInfoResponse f137632b;

            public Loaded(@Y61.k GetDealRoomInfoResponse getDealRoomInfoResponse) {
                this.f137632b = getDealRoomInfoResponse;
            }

            @Override // com.avito.android.analytics.screens.mvi.s
            @Y61.l
            /* renamed from: d */
            public final String getF111994d() {
                return null;
            }

            @Override // com.avito.android.analytics.screens.mvi.t
            @Y61.l
            /* renamed from: e */
            public final String getF112001c() {
                return null;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Loaded) && L.f(this.f137632b, ((Loaded) obj).f137632b);
            }

            public final int hashCode() {
                return this.f137632b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "Loaded(data=" + this.f137632b + ')';
            }
        }

        /* compiled from: DealRoomInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$MainInfoLoading$LoadingError;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$MainInfoLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class LoadingError implements MainInfoLoading, TrackableError {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final ApiException f137633b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final J.a f137634c;

            public LoadingError(@Y61.k ApiException apiException) {
                this.f137633b = apiException;
                this.f137634c = new J.a(apiException);
            }

            @Override // com.avito.android.analytics.screens.mvi.s
            @Y61.l
            /* renamed from: d */
            public final String getF111994d() {
                return null;
            }

            @Override // com.avito.android.analytics.screens.mvi.t
            @Y61.l
            /* renamed from: e */
            public final String getF112001c() {
                return null;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LoadingError) && this.f137633b.equals(((LoadingError) obj).f137633b);
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableError
            @Y61.k
            /* renamed from: g, reason: from getter */
            public final J.a getF330022c() {
                return this.f137634c;
            }

            public final int hashCode() {
                return this.f137633b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return AK.c.q(new StringBuilder("LoadingError(e="), this.f137633b, ')');
            }
        }

        /* compiled from: DealRoomInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$MainInfoLoading$StartLoading;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$MainInfoLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class StartLoading extends TrackableLoadingStarted implements MainInfoLoading {

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final G0 f137635d;

            public StartLoading() {
                this(null, 1, null);
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StartLoading) && L.f(this.f137635d, ((StartLoading) obj).f137635d);
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
            public final int hashCode() {
                return this.f137635d.hashCode();
            }

            @Y61.k
            public final String toString() {
                return AK.c.v(new StringBuilder("StartLoading(stub="), this.f137635d, ')');
            }

            public StartLoading(G0 g02, int i12, C42822w c42822w) {
                this.f137635d = (i12 & 1) != 0 ? G0.f406611a : g02;
            }
        }
    }

    /* compiled from: DealRoomInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$a;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements DealRoomInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f137636b;

        public a(@Y61.k String str) {
            this.f137636b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f137636b, ((a) obj).f137636b);
        }

        public final int hashCode() {
            return this.f137636b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("CallPhone(phoneNumber="), this.f137636b, ')');
        }
    }

    /* compiled from: DealRoomInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$b;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements DealRoomInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final b f137637b = new b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -79068557;
        }

        @Y61.k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: DealRoomInternalAction.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$c;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction;", "a", "b", "c", "d", "e", "f", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$c$a;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$c$b;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$c$c;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$c$d;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$c$e;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$c$f;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c extends DealRoomInternalAction {

        /* compiled from: DealRoomInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$c$a;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$c;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements c {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f137638b = new a();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1919670359;
            }

            @Y61.k
            public final String toString() {
                return "CloseDialog";
            }
        }

        /* compiled from: DealRoomInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$c$b;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$c;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements c {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final b f137639b = new b();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1240283423;
            }

            @Y61.k
            public final String toString() {
                return "HideSaveButtonSpinner";
            }
        }

        /* compiled from: DealRoomInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$c$c;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$c;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.developments_agency_search.screen.deal_room.mvi.entity.DealRoomInternalAction$c$c, reason: collision with other inner class name */
        public static final /* data */ class C4153c implements c {

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final String f137640b;

            public C4153c(@Y61.l String str) {
                this.f137640b = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C4153c) && L.f(this.f137640b, ((C4153c) obj).f137640b);
            }

            public final int hashCode() {
                String str = this.f137640b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("ShowDialog(initialText="), this.f137640b, ')');
            }
        }

        /* compiled from: DealRoomInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$c$d;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$c;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d implements c {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final d f137641b = new d();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -1787688764;
            }

            @Y61.k
            public final String toString() {
                return "ShowSaveButtonSpinner";
            }
        }

        /* compiled from: DealRoomInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$c$e;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$c;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class e implements c {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final e f137642b = new e();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return -2105030994;
            }

            @Y61.k
            public final String toString() {
                return "ShowUpdateErrorToast";
            }
        }

        /* compiled from: DealRoomInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$c$f;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$c;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class f implements c {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f137643b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final String f137644c;

            public f(@Y61.k String str, @Y61.k String str2) {
                this.f137643b = str;
                this.f137644c = str2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return L.f(this.f137643b, fVar.f137643b) && L.f(this.f137644c, fVar.f137644c);
            }

            public final int hashCode() {
                return this.f137644c.hashCode() + (this.f137643b.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("UpdateNote(dealId=");
                sb2.append(this.f137643b);
                sb2.append(", newNote=");
                return C22026a.c(sb2, this.f137644c, ')');
            }
        }
    }

    /* compiled from: DealRoomInternalAction.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$d;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction;", "a", "b", "c", "d", "e", "f", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$d$a;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$d$b;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$d$c;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$d$d;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$d$e;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$d$f;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface d extends DealRoomInternalAction {

        /* compiled from: DealRoomInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$d$a;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$d;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements d {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f137645b = new a();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -752724150;
            }

            @Y61.k
            public final String toString() {
                return "Close";
            }
        }

        /* compiled from: DealRoomInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$d$b;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$d;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements d {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final b f137646b = new b();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1552061382;
            }

            @Y61.k
            public final String toString() {
                return "HideSaveButtonSpinner";
            }
        }

        /* compiled from: DealRoomInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$d$c;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$d;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements d {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final com.avito.android.developments_agency_search.screen.deal_room.edit_client.e f137647b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final String f137648c;

            public c(@Y61.k com.avito.android.developments_agency_search.screen.deal_room.edit_client.e eVar, @Y61.l String str) {
                this.f137647b = eVar;
                this.f137648c = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return L.f(this.f137647b, cVar.f137647b) && L.f(this.f137648c, cVar.f137648c);
            }

            public final int hashCode() {
                int iHashCode = this.f137647b.hashCode() * 31;
                String str = this.f137648c;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Show(clientForm=");
                sb2.append(this.f137647b);
                sb2.append(", noteText=");
                return C22026a.c(sb2, this.f137648c, ')');
            }
        }

        /* compiled from: DealRoomInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$d$d;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$d;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.developments_agency_search.screen.deal_room.mvi.entity.DealRoomInternalAction$d$d, reason: collision with other inner class name */
        public static final /* data */ class C4154d implements d {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C4154d f137649b = new C4154d();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C4154d);
            }

            public final int hashCode() {
                return -285066273;
            }

            @Y61.k
            public final String toString() {
                return "ShowSaveButtonSpinner";
            }
        }

        /* compiled from: DealRoomInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$d$e;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$d;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class e implements d {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final e f137650b = new e();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 1961313331;
            }

            @Y61.k
            public final String toString() {
                return "ShowUpdateErrorToast";
            }
        }

        /* compiled from: DealRoomInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$d$f;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$d;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class f implements d {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final com.avito.android.developments_agency_search.screen.deal_room.edit_client.e f137651b;

            public f(@Y61.k com.avito.android.developments_agency_search.screen.deal_room.edit_client.e eVar) {
                this.f137651b = eVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && L.f(this.f137651b, ((f) obj).f137651b);
            }

            public final int hashCode() {
                return this.f137651b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "UpdateClient(clientInfoForm=" + this.f137651b + ')';
            }
        }
    }

    /* compiled from: DealRoomInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$e;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements DealRoomInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f137652b;

        public e(@Y61.k String str) {
            this.f137652b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f137652b, ((e) obj).f137652b);
        }

        public final int hashCode() {
            return this.f137652b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenDeveloperRequirementsWebView(developerRequirementsLink="), this.f137652b, ')');
        }
    }

    /* compiled from: DealRoomInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$f;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements DealRoomInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f137653b;

        public f(@Y61.k String str) {
            this.f137653b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f137653b, ((f) obj).f137653b);
        }

        public final int hashCode() {
            return this.f137653b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenDocumentViaWebView(documentLink="), this.f137653b, ')');
        }
    }

    /* compiled from: DealRoomInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$g;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements DealRoomInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f137654b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f137655c;

        public g(@Y61.k String str, @Y61.k String str2) {
            this.f137654b = str;
            this.f137655c = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f137654b, gVar.f137654b) && L.f(this.f137655c, gVar.f137655c);
        }

        public final int hashCode() {
            return this.f137655c.hashCode() + (this.f137654b.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RemoveRevenueDocument(dealId=");
            sb2.append(this.f137654b);
            sb2.append(", docType=");
            return C22026a.c(sb2, this.f137655c, ')');
        }
    }

    /* compiled from: DealRoomInternalAction.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$h;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction;", "a", "b", "c", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$h$a;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$h$b;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$h$c;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface h extends DealRoomInternalAction {

        /* compiled from: DealRoomInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$h$a;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$h;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements h {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f137656b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final String f137657c;

            public a(@Y61.k String str, @Y61.k String str2) {
                this.f137656b = str;
                this.f137657c = str2;
            }

            @Override // com.avito.android.developments_agency_search.screen.deal_room.mvi.entity.DealRoomInternalAction.h
            @Y61.k
            /* renamed from: c, reason: from getter */
            public final String getF137663c() {
                return this.f137657c;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f137656b, aVar.f137656b) && L.f(this.f137657c, aVar.f137657c);
            }

            @Override // com.avito.android.developments_agency_search.screen.deal_room.mvi.entity.DealRoomInternalAction.h
            @Y61.k
            /* renamed from: getDealId, reason: from getter */
            public final String getF137662b() {
                return this.f137656b;
            }

            public final int hashCode() {
                return this.f137657c.hashCode() + (this.f137656b.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("StartUploading(dealId=");
                sb2.append(this.f137656b);
                sb2.append(", docType=");
                return C22026a.c(sb2, this.f137657c, ')');
            }
        }

        /* compiled from: DealRoomInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$h$b;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$h;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements h {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f137658b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final String f137659c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.l
            public final String f137660d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.k
            public final UploadDealDocumentResponse f137661e;

            public b(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.k UploadDealDocumentResponse uploadDealDocumentResponse) {
                this.f137658b = str;
                this.f137659c = str2;
                this.f137660d = str3;
                this.f137661e = uploadDealDocumentResponse;
            }

            @Override // com.avito.android.developments_agency_search.screen.deal_room.mvi.entity.DealRoomInternalAction.h
            @Y61.k
            /* renamed from: c, reason: from getter */
            public final String getF137663c() {
                return this.f137659c;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f137658b, bVar.f137658b) && L.f(this.f137659c, bVar.f137659c) && L.f(this.f137660d, bVar.f137660d) && L.f(this.f137661e, bVar.f137661e);
            }

            @Override // com.avito.android.developments_agency_search.screen.deal_room.mvi.entity.DealRoomInternalAction.h
            @Y61.k
            /* renamed from: getDealId, reason: from getter */
            public final String getF137662b() {
                return this.f137658b;
            }

            public final int hashCode() {
                int iD2 = H.d(this.f137658b.hashCode() * 31, 31, this.f137659c);
                String str = this.f137660d;
                return this.f137661e.hashCode() + ((iD2 + (str == null ? 0 : str.hashCode())) * 31);
            }

            @Y61.k
            public final String toString() {
                return "Uploaded(dealId=" + this.f137658b + ", docType=" + this.f137659c + ", mimeType=" + this.f137660d + ", docUploadResponse=" + this.f137661e + ')';
            }
        }

        /* compiled from: DealRoomInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$h$c;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$h;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements h {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f137662b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final String f137663c;

            public c(@Y61.k String str, @Y61.k String str2) {
                this.f137662b = str;
                this.f137663c = str2;
            }

            @Override // com.avito.android.developments_agency_search.screen.deal_room.mvi.entity.DealRoomInternalAction.h
            @Y61.k
            /* renamed from: c, reason: from getter */
            public final String getF137663c() {
                return this.f137663c;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return L.f(this.f137662b, cVar.f137662b) && L.f(this.f137663c, cVar.f137663c);
            }

            @Override // com.avito.android.developments_agency_search.screen.deal_room.mvi.entity.DealRoomInternalAction.h
            @Y61.k
            /* renamed from: getDealId, reason: from getter */
            public final String getF137662b() {
                return this.f137662b;
            }

            public final int hashCode() {
                return this.f137663c.hashCode() + (this.f137662b.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("UploadingError(dealId=");
                sb2.append(this.f137662b);
                sb2.append(", docType=");
                return C22026a.c(sb2, this.f137663c, ')');
            }
        }

        @Y61.k
        /* renamed from: c */
        String getF137663c();

        @Y61.k
        /* renamed from: getDealId */
        String getF137662b();
    }

    /* compiled from: DealRoomInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$i;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements DealRoomInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final i f137664b = new i();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 985997203;
        }

        @Y61.k
        public final String toString() {
            return "SetIsScreenSuccessfullyLoaded";
        }
    }

    /* compiled from: DealRoomInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$j;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements DealRoomInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f137665b;

        public j(@Y61.k String str) {
            this.f137665b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f137665b, ((j) obj).f137665b);
        }

        public final int hashCode() {
            return this.f137665b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowAgencyCommissionTooltip(tooltipText="), this.f137665b, ')');
        }
    }

    /* compiled from: DealRoomInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$k;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements DealRoomInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final SearchParams f137666b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f137667c;

        public k(@Y61.l SearchParams searchParams, @Y61.l String str) {
            this.f137666b = searchParams;
            this.f137667c = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return L.f(this.f137666b, kVar.f137666b) && L.f(this.f137667c, kVar.f137667c);
        }

        public final int hashCode() {
            SearchParams searchParams = this.f137666b;
            int iHashCode = (searchParams == null ? 0 : searchParams.hashCode()) * 31;
            String str = this.f137667c;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowAgencySearchScreen(searchParams=");
            sb2.append(this.f137666b);
            sb2.append(", clientId=");
            return C22026a.c(sb2, this.f137667c, ')');
        }
    }

    /* compiled from: DealRoomInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$l;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l implements DealRoomInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f137668b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final GetDealRoomInfoResponse.Deal.SelectionHistory.Item f137669c;

        public l(@Y61.k String str, @Y61.k GetDealRoomInfoResponse.Deal.SelectionHistory.Item item) {
            this.f137668b = str;
            this.f137669c = item;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return L.f(this.f137668b, lVar.f137668b) && L.f(this.f137669c, lVar.f137669c);
        }

        public final int hashCode() {
            return this.f137669c.hashCode() + (this.f137668b.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "ShowDealRoomDevelopmentScreen(clientId=" + this.f137668b + ", developmentItem=" + this.f137669c + ')';
        }
    }

    /* compiled from: DealRoomInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$m;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class m implements DealRoomInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final m f137670b = new m();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return -649232615;
        }

        @Y61.k
        public final String toString() {
            return "ShowDealStageDocumentPickerScreen";
        }
    }

    /* compiled from: DealRoomInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$n;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class n implements DealRoomInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f137671b;

        public n(@Y61.k String str) {
            this.f137671b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && L.f(this.f137671b, ((n) obj).f137671b);
        }

        public final int hashCode() {
            return this.f137671b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowSelectionScreen(selectionId="), this.f137671b, ')');
        }
    }

    /* compiled from: DealRoomInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$o;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class o implements DealRoomInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f137672b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final PrintableText f137673c;

        public o(@Y61.k PrintableText printableText, boolean z12) {
            this.f137672b = z12;
            this.f137673c = printableText;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return this.f137672b == oVar.f137672b && this.f137673c.equals(oVar.f137673c);
        }

        public final int hashCode() {
            return this.f137673c.hashCode() + (Boolean.hashCode(this.f137672b) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowToast(isError=");
            sb2.append(this.f137672b);
            sb2.append(", text=");
            return AK.c.m(sb2, this.f137673c, ')');
        }
    }

    /* compiled from: DealRoomInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$p;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class p implements DealRoomInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f137674b;

        public p(@Y61.k String str) {
            this.f137674b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && L.f(this.f137674b, ((p) obj).f137674b);
        }

        public final int hashCode() {
            return this.f137674b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ToggleAccordionExpandState(accordionItemId="), this.f137674b, ')');
        }
    }

    /* compiled from: DealRoomInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction$q;", "Lcom/avito/android/developments_agency_search/screen/deal_room/mvi/entity/DealRoomInternalAction;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class q implements DealRoomInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f137675b;

        public q(@Y61.l String str) {
            this.f137675b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && L.f(this.f137675b, ((q) obj).f137675b);
        }

        public final int hashCode() {
            String str = this.f137675b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdateDealStagePickingDocumentType(docType="), this.f137675b, ')');
        }
    }
}
