package com.avito.android.iac_calls_history.impl_module.api.remote;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_calls_history.impl_module.api.remote.elements.CallsHistoryElement;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.L;

/* compiled from: GetCallHistoryRequest.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/api/remote/GetCallHistoryRequest;", "", "a", "Tab", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface GetCallHistoryRequest {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetCallHistoryRequest.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/api/remote/GetCallHistoryRequest$Tab;", "", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Tab {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Tab[] f164698b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f164699c;

        static {
            Tab[] tabArr = {new Tab("ALL", 0), new Tab("MISSED", 1)};
            f164698b = tabArr;
            f164699c = c.a(tabArr);
        }

        public static Tab valueOf(String str) {
            return (Tab) Enum.valueOf(Tab.class, str);
        }

        public static Tab[] values() {
            return (Tab[]) f164698b.clone();
        }
    }

    /* compiled from: GetCallHistoryRequest.kt */
    @P
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/api/remote/GetCallHistoryRequest$a;", "", "", "hasMore", "", "Lcom/avito/android/iac_calls_history/impl_module/api/remote/elements/CallsHistoryElement;", "elements", "<init>", "(ZLjava/util/List;)V", "Z", "b", "()Z", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        @com.google.gson.annotations.c("elements")
        @l
        private final List<CallsHistoryElement> elements;

        @com.google.gson.annotations.c("hasMore")
        private final boolean hasMore;

        /* JADX WARN: Multi-variable type inference failed */
        public a(boolean z12, @l List<? extends CallsHistoryElement> list) {
            this.hasMore = z12;
            this.elements = list;
        }

        @l
        public final List<CallsHistoryElement> a() {
            return this.elements;
        }

        /* renamed from: b, reason: from getter */
        public final boolean getHasMore() {
            return this.hasMore;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.hasMore == aVar.hasMore && L.f(this.elements, aVar.elements);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.hasMore) * 31;
            List<CallsHistoryElement> list = this.elements;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Result(hasMore=");
            sb2.append(this.hasMore);
            sb2.append(", elements=");
            return H.p(sb2, this.elements, ')');
        }
    }
}
