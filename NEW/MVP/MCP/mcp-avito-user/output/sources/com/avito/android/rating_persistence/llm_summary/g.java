package com.avito.android.rating_persistence.llm_summary;

import androidx.room.InterfaceC23452i0;
import androidx.room.InterfaceC23472t;
import androidx.room.J;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RatingLLMSummaryEntity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_persistence/llm_summary/g;", "", "a", "_avito_rating-persistence_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@J
/* loaded from: classes16.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    @InterfaceC23452i0
    public final String f249811a;

    /* renamed from: b, reason: collision with root package name */
    @InterfaceC23472t
    public final long f249812b;

    /* compiled from: RatingLLMSummaryEntity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/rating_persistence/llm_summary/g$a;", "", "<init>", "()V", "", "COLUMN_FEEDBACK_SENDING_TIMESTAMP", "Ljava/lang/String;", "COLUMN_SUMMARY_KEY", "TABLE_NAME", "_avito_rating-persistence_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public g(@Y61.k String str, long j12) {
        this.f249811a = str;
        this.f249812b = j12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f249811a, gVar.f249811a) && this.f249812b == gVar.f249812b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f249812b) + (this.f249811a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RatingLLMSummaryEntity(summaryKey=");
        sb2.append(this.f249811a);
        sb2.append(", feedbackSendingTimestamp=");
        return androidx.appcompat.app.r.u(sb2, this.f249812b, ')');
    }
}
