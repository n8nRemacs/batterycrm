package com.avito.android.iac_dialer_ui.pub.finished_call_screens.feedback_screen;

import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacUIFinishedFeedbackScreen.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_dialer_ui/pub/finished_call_screens/feedback_screen/o;", "", "<init>", "()V", "a", "_avito_iac-dialer-ui_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final o f167647a = new o();

    /* compiled from: IacUIFinishedFeedbackScreen.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer_ui/pub/finished_call_screens/feedback_screen/o$a;", "", "_avito_iac-dialer-ui_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f167648a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f167649b;

        public a(@Y61.k String str, boolean z12) {
            this.f167648a = str;
            this.f167649b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f167648a, aVar.f167648a) && this.f167649b == aVar.f167649b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f167649b) + (this.f167648a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ListItemCheckmarkTestData(text=");
            sb2.append(this.f167648a);
            sb2.append(", checked=");
            return r.x(sb2, this.f167649b, ')');
        }
    }
}
