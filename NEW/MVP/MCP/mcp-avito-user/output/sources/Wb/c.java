package Wb;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AiAssistantChatListState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LWb/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "<init>", "()V", "a", "b", "c", "LWb/c$a;", "LWb/c$b;", "LWb/c$c;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class c extends q {

    /* compiled from: AiAssistantChatListState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWb/c$a;", "LWb/c;", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final a f17971b = new a();

        public a() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 2119247344;
        }

        @k
        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: AiAssistantChatListState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWb/c$b;", "LWb/c;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final com.avito.android.ai_assistant.screens.chat_list.c f17972b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Long f17973c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f17974d;

        public /* synthetic */ b(com.avito.android.ai_assistant.screens.chat_list.c cVar, Long l12, String str, int i12, C42822w c42822w) {
            this(cVar, (i12 & 2) != 0 ? null : l12, str);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f17972b, bVar.f17972b) && L.f(this.f17973c, bVar.f17973c) && L.f(this.f17974d, bVar.f17974d);
        }

        public final int hashCode() {
            int iHashCode = this.f17972b.hashCode() * 31;
            Long l12 = this.f17973c;
            int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
            String str = this.f17974d;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Loaded(screenData=");
            sb2.append(this.f17972b);
            sb2.append(", nextOffset=");
            sb2.append(this.f17973c);
            sb2.append(", newChatContext=");
            return C22026a.c(sb2, this.f17974d, ')');
        }

        public b(@k com.avito.android.ai_assistant.screens.chat_list.c cVar, @l Long l12, @l String str) {
            super(null);
            this.f17972b = cVar;
            this.f17973c = l12;
            this.f17974d = str;
        }
    }

    /* compiled from: AiAssistantChatListState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWb/c$c;", "LWb/c;", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Wb.c$c, reason: collision with other inner class name */
    public static final /* data */ class C1275c extends c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final C1275c f17975b = new C1275c();

        public C1275c() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C1275c);
        }

        public final int hashCode() {
            return -1697129692;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    public /* synthetic */ c(C42822w c42822w) {
        this();
    }

    public c() {
    }
}
