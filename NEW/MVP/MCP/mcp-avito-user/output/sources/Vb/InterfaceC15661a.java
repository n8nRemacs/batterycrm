package Vb;

import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.ai_assistant.adapter.segment_buttons.a;
import com.avito.android.ai_assistant.model.ReactionState;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AiAssistantAction.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0082\u0001\u000f\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"LVb/a;", "LVb/b;", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "LVb/a$a;", "LVb/a$b;", "LVb/a$c;", "LVb/a$d;", "LVb/a$e;", "LVb/a$f;", "LVb/a$g;", "LVb/a$h;", "LVb/a$i;", "LVb/a$j;", "LVb/a$k;", "LVb/a$l;", "LVb/a$m;", "LVb/a$n;", "LVb/a$o;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Vb.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC15661a extends Vb.b {

    /* compiled from: AiAssistantAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVb/a$a;", "LVb/a;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vb.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1189a implements InterfaceC15661a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f17213a;

        public C1189a(@Y61.k DeepLink deepLink) {
            this.f17213a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1189a) && L.f(this.f17213a, ((C1189a) obj).f17213a);
        }

        public final int hashCode() {
            return this.f17213a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("ActionLinkClicked(deepLink="), this.f17213a, ')');
        }
    }

    /* compiled from: AiAssistantAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVb/a$b;", "LVb/a;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vb.a$b */
    public static final /* data */ class b implements InterfaceC15661a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f17214a;

        public b(@Y61.k DeepLink deepLink) {
            this.f17214a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f17214a, ((b) obj).f17214a);
        }

        public final int hashCode() {
            return this.f17214a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("AssistantMessageLinkClicked(deepLink="), this.f17214a, ')');
        }
    }

    /* compiled from: AiAssistantAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVb/a$c;", "LVb/a;", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vb.a$c */
    public static final /* data */ class c implements InterfaceC15661a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f17215a = new c();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -332255707;
        }

        @Y61.k
        public final String toString() {
            return "ChatListClicked";
        }
    }

    /* compiled from: AiAssistantAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVb/a$d;", "LVb/a;", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vb.a$d */
    public static final /* data */ class d implements InterfaceC15661a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f17216a = new d();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1289047909;
        }

        @Y61.k
        public final String toString() {
            return "CloseClicked";
        }
    }

    /* compiled from: AiAssistantAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVb/a$e;", "LVb/a;", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vb.a$e */
    public static final /* data */ class e implements InterfaceC15661a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final e f17217a = new e();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 915620553;
        }

        @Y61.k
        public final String toString() {
            return "HardStopPressed";
        }
    }

    /* compiled from: AiAssistantAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LVb/a$f;", "LVb/a;", "LVb/g;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vb.a$f */
    public static final /* data */ class f implements InterfaceC15661a, Vb.g {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f17218a;

        public f(boolean z12) {
            this.f17218a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f17218a == ((f) obj).f17218a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f17218a);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("LoadPortionBefore(isRetry="), this.f17218a, ')');
        }
    }

    /* compiled from: AiAssistantAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVb/a$g;", "LVb/a;", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vb.a$g */
    public static final /* data */ class g implements InterfaceC15661a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final g f17219a = new g();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -975456645;
        }

        @Y61.k
        public final String toString() {
            return "NewChatClicked";
        }
    }

    /* compiled from: AiAssistantAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVb/a$h;", "LVb/a;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vb.a$h */
    public static final /* data */ class h implements InterfaceC15661a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f17220a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ReactionState f17221b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Tb.f f17222c;

        public h(@Y61.k String str, @Y61.k ReactionState reactionState, @Y61.k Tb.f fVar) {
            this.f17220a = str;
            this.f17221b = reactionState;
            this.f17222c = fVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return L.f(this.f17220a, hVar.f17220a) && this.f17221b == hVar.f17221b && L.f(this.f17222c, hVar.f17222c);
        }

        public final int hashCode() {
            return this.f17222c.hashCode() + ((this.f17221b.hashCode() + (this.f17220a.hashCode() * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            return "OnMessageAction(messageId=" + this.f17220a + ", state=" + this.f17221b + ", target=" + this.f17222c + ')';
        }
    }

    /* compiled from: AiAssistantAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LVb/a$i;", "LVb/a;", "LVb/g;", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vb.a$i */
    public static final /* data */ class i implements InterfaceC15661a, Vb.g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final i f17223a = new i();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -1643219026;
        }

        @Y61.k
        public final String toString() {
            return "RepeatButtonClicked";
        }
    }

    /* compiled from: AiAssistantAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LVb/a$j;", "LVb/a;", "LVb/g;", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vb.a$j */
    public static final /* data */ class j implements InterfaceC15661a, Vb.g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final j f17224a = new j();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 1493546841;
        }

        @Y61.k
        public final String toString() {
            return "RetryButtonClicked";
        }
    }

    /* compiled from: AiAssistantAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVb/a$k;", "LVb/a;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vb.a$k */
    public static final /* data */ class k implements InterfaceC15661a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.ai_assistant.adapter.simple_snippet.c f17225a;

        public k(@Y61.k com.avito.android.ai_assistant.adapter.simple_snippet.c cVar) {
            this.f17225a = cVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && L.f(this.f17225a, ((k) obj).f17225a);
        }

        public final int hashCode() {
            return this.f17225a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "SnippetFavoriteClicked(item=" + this.f17225a + ')';
        }
    }

    /* compiled from: AiAssistantAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LVb/a$l;", "LVb/a;", "LVb/g;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vb.a$l */
    public static final /* data */ class l implements InterfaceC15661a, Vb.g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final a.C2619a f17226a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.ai_assistant.adapter.segment_buttons.a f17227b;

        public l(@Y61.k a.C2619a c2619a, @Y61.k com.avito.android.ai_assistant.adapter.segment_buttons.a aVar) {
            this.f17226a = c2619a;
            this.f17227b = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return L.f(this.f17226a, lVar.f17226a) && L.f(this.f17227b, lVar.f17227b);
        }

        public final int hashCode() {
            return this.f17227b.hashCode() + (this.f17226a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "SuggestButtonAction(button=" + this.f17226a + ", item=" + this.f17227b + ')';
        }
    }

    /* compiled from: AiAssistantAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVb/a$m;", "LVb/a;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vb.a$m */
    public static final /* data */ class m implements InterfaceC15661a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.ai_assistant.adapter.segment_buttons.a f17228a;

        public m(@Y61.k com.avito.android.ai_assistant.adapter.segment_buttons.a aVar) {
            this.f17228a = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && L.f(this.f17228a, ((m) obj).f17228a);
        }

        public final int hashCode() {
            return this.f17228a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "SuggestButtonsShowed(item=" + this.f17228a + ')';
        }
    }

    /* compiled from: AiAssistantAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LVb/a$n;", "LVb/a;", "LVb/g;", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vb.a$n */
    public static final /* data */ class n implements InterfaceC15661a, Vb.g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final n f17229a = new n();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return 197690665;
        }

        @Y61.k
        public final String toString() {
            return "UserQuerySubmit";
        }
    }

    /* compiled from: AiAssistantAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVb/a$o;", "LVb/a;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vb.a$o */
    public static final /* data */ class o implements InterfaceC15661a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f17230a;

        public o(@Y61.k String str) {
            this.f17230a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && L.f(this.f17230a, ((o) obj).f17230a);
        }

        public final int hashCode() {
            return this.f17230a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("UserQueryUpdated(query="), this.f17230a, ')');
        }
    }
}
