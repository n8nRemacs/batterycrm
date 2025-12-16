package com.avito.android.select_districts.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.component.accordion.s;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.conveyor_item.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectDistrictsInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/select_districts/mvi/entity/SelectDistrictsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Content", "Error", "Loading", "SendResultAndCloseScreen", "ShowEmptySearchStub", "Lcom/avito/android/select_districts/mvi/entity/SelectDistrictsInternalAction$Content;", "Lcom/avito/android/select_districts/mvi/entity/SelectDistrictsInternalAction$Error;", "Lcom/avito/android/select_districts/mvi/entity/SelectDistrictsInternalAction$Loading;", "Lcom/avito/android/select_districts/mvi/entity/SelectDistrictsInternalAction$SendResultAndCloseScreen;", "Lcom/avito/android/select_districts/mvi/entity/SelectDistrictsInternalAction$ShowEmptySearchStub;", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SelectDistrictsInternalAction extends n {

    /* compiled from: SelectDistrictsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select_districts/mvi/entity/SelectDistrictsInternalAction$Error;", "Lcom/avito/android/select_districts/mvi/entity/SelectDistrictsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements SelectDistrictsInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final J.a f267033b;

        public Error(@k J.a aVar) {
            this.f267033b = aVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF206990d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && L.f(this.f267033b, ((Error) obj).f267033b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF206988c() {
            return this.f267033b;
        }

        public final int hashCode() {
            return this.f267033b.f90384a.hashCode();
        }

        @k
        public final String toString() {
            return "Error(failure=" + this.f267033b + ')';
        }
    }

    /* compiled from: SelectDistrictsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select_districts/mvi/entity/SelectDistrictsInternalAction$Loading;", "Lcom/avito/android/select_districts/mvi/entity/SelectDistrictsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements SelectDistrictsInternalAction {
    }

    /* compiled from: SelectDistrictsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select_districts/mvi/entity/SelectDistrictsInternalAction$SendResultAndCloseScreen;", "Lcom/avito/android/select_districts/mvi/entity/SelectDistrictsInternalAction;", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SendResultAndCloseScreen implements SelectDistrictsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<ParcelableEntity<String>> f267034b;

        /* JADX WARN: Multi-variable type inference failed */
        public SendResultAndCloseScreen(@k List<? extends ParcelableEntity<String>> list) {
            this.f267034b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SendResultAndCloseScreen) && L.f(this.f267034b, ((SendResultAndCloseScreen) obj).f267034b);
        }

        public final int hashCode() {
            return this.f267034b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("SendResultAndCloseScreen(selectedDistricts="), this.f267034b, ')');
        }
    }

    /* compiled from: SelectDistrictsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select_districts/mvi/entity/SelectDistrictsInternalAction$ShowEmptySearchStub;", "Lcom/avito/android/select_districts/mvi/entity/SelectDistrictsInternalAction;", "<init>", "()V", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowEmptySearchStub implements SelectDistrictsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowEmptySearchStub f267035b = new ShowEmptySearchStub();

        private ShowEmptySearchStub() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowEmptySearchStub);
        }

        public final int hashCode() {
            return 2061110840;
        }

        @k
        public final String toString() {
            return "ShowEmptySearchStub";
        }
    }

    /* compiled from: SelectDistrictsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select_districts/mvi/entity/SelectDistrictsInternalAction$Content;", "Lcom/avito/android/select_districts/mvi/entity/SelectDistrictsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements SelectDistrictsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<a> f267030b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f267031c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Integer f267032d;

        /* JADX WARN: Multi-variable type inference failed */
        public Content(@k List<? extends a> list, boolean z12, @l Integer num) {
            this.f267030b = list;
            this.f267031c = z12;
            this.f267032d = num;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF206990d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return L.f(this.f267030b, content.f267030b) && this.f267031c == content.f267031c && L.f(this.f267032d, content.f267032d);
        }

        public final int hashCode() {
            int i12 = r.i(this.f267030b.hashCode() * 31, 31, this.f267031c);
            Integer num = this.f267032d;
            return i12 + (num == null ? 0 : num.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(items=");
            sb2.append(this.f267030b);
            sb2.append(", isSearch=");
            sb2.append(this.f267031c);
            sb2.append(", scrollToItemPosition=");
            return s.j(sb2, this.f267032d, ')');
        }

        public /* synthetic */ Content(List list, boolean z12, Integer num, int i12, C42822w c42822w) {
            this(list, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? null : num);
        }
    }
}
