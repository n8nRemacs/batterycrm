package com.avito.android.feedback_adverts;

import android.content.Intent;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FeedbackAdvertsIntentFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/feedback_adverts/c;", "", "a", "_avito_feedback-adverts_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface c {

    /* compiled from: FeedbackAdvertsIntentFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/feedback_adverts/c$a;", "", "_avito_feedback-adverts_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f157775a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f157776b;

        public a(@Y61.l String str, @Y61.k String str2) {
            this.f157775a = str;
            this.f157776b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f157775a, aVar.f157775a) && L.f(this.f157776b, aVar.f157776b);
        }

        public final int hashCode() {
            String str = this.f157775a;
            return this.f157776b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Args(itemId=");
            sb2.append(this.f157775a);
            sb2.append(", channelId=");
            return C22026a.c(sb2, this.f157776b, ')');
        }
    }

    @Y61.k
    Intent a(@Y61.k a aVar);
}
