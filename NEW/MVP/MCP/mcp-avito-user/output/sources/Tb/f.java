package Tb;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MessageActionItem.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LTb/f;", "", "a", "b", "c", "LTb/f$a;", "LTb/f$b;", "LTb/f$c;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface f {

    /* compiled from: MessageActionItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTb/f$a;", "LTb/f;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f15743a;

        public a(@k DeepLink deepLink) {
            this.f15743a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f15743a, ((a) obj).f15743a);
        }

        public final int hashCode() {
            return this.f15743a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("FeedbackAction(deeplink="), this.f15743a, ')');
        }
    }

    /* compiled from: MessageActionItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTb/f$b;", "LTb/f;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f15744a;

        public b(@k String str) {
            this.f15744a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f15744a, ((b) obj).f15744a);
        }

        public final int hashCode() {
            return this.f15744a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("MotivationText(motivation="), this.f15744a, ')');
        }
    }

    /* compiled from: MessageActionItem.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LTb/f$c;", "LTb/f;", "a", "b", "LTb/f$c$a;", "LTb/f$c$b;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c extends f {

        /* compiled from: MessageActionItem.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LTb/f$c$a;", "LTb/f$c;", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final a f15745a = new a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1693333534;
            }

            @k
            public final String toString() {
                return "Dislike";
            }
        }

        /* compiled from: MessageActionItem.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LTb/f$c$b;", "LTb/f$c;", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final b f15746a = new b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -647141894;
            }

            @k
            public final String toString() {
                return "Like";
            }
        }
    }
}
