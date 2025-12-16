package com.avito.android.calltracking;

import com.avito.android.calltracking.remote.model.CalltrackingResponse;
import com.avito.android.util.architecture_components.C35748b;
import kotlin.Metadata;

/* compiled from: CalltrackingViewModel.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/calltracking/U;", "Lcom/avito/android/util/architecture_components/b;", "Lcom/avito/android/calltracking/U$a;", "a", "_avito_calltracking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class U extends C35748b<a> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final CalltrackingResponse f113633c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.calltracking.item.e f113634d;

    /* compiled from: CalltrackingViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/calltracking/U$a;", "", "_avito_calltracking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CalltrackingResponse f113635a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.calltracking.item.e f113636b;

        public a(@Y61.k CalltrackingResponse calltrackingResponse, @Y61.k com.avito.android.calltracking.item.e eVar) {
            this.f113635a = calltrackingResponse;
            this.f113636b = eVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f113635a, aVar.f113635a) && kotlin.jvm.internal.L.f(this.f113636b, aVar.f113636b);
        }

        public final int hashCode() {
            return this.f113636b.hashCode() + (this.f113635a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "Content(data=" + this.f113635a + ", item=" + this.f113636b + ')';
        }
    }

    public U(@Y61.k CalltrackingResponse calltrackingResponse, @Y61.k com.avito.android.calltracking.item.e eVar) {
        super(new a(calltrackingResponse, eVar));
        this.f113633c = calltrackingResponse;
        this.f113634d = eVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        U u12 = (U) obj;
        return kotlin.jvm.internal.L.f(this.f113633c, u12.f113633c) && kotlin.jvm.internal.L.f(this.f113634d, u12.f113634d);
    }

    public final int hashCode() {
        return this.f113634d.hashCode() + (this.f113633c.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "OpenCalltrackingBottomSheetEvent(data=" + this.f113633c + ", item=" + this.f113634d + ')';
    }
}
