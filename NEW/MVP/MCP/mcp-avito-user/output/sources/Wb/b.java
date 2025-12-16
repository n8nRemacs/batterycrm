package Wb;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AiAssistantChatListOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LWb/b;", "", "a", "b", "c", "LWb/b$a;", "LWb/b$b;", "LWb/b$c;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface b {

    /* compiled from: AiAssistantChatListOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWb/b$a;", "LWb/b;", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f17967a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1116635013;
        }

        @k
        public final String toString() {
            return "GoBack";
        }
    }

    /* compiled from: AiAssistantChatListOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWb/b$b;", "LWb/b;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Wb.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1274b implements b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f17968a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f17969b;

        public C1274b(@l String str, @l String str2) {
            this.f17968a = str;
            this.f17969b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1274b)) {
                return false;
            }
            C1274b c1274b = (C1274b) obj;
            return L.f(this.f17968a, c1274b.f17968a) && L.f(this.f17969b, c1274b.f17969b);
        }

        public final int hashCode() {
            String str = this.f17968a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f17969b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NavigateToChat(context=");
            sb2.append(this.f17968a);
            sb2.append(", chatId=");
            return C22026a.c(sb2, this.f17969b, ')');
        }
    }

    /* compiled from: AiAssistantChatListOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWb/b$c;", "LWb/b;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f17970a;

        public c(@k PrintableText printableText) {
            this.f17970a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f17970a, ((c) obj).f17970a);
        }

        public final int hashCode() {
            return this.f17970a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowToast(text="), this.f17970a, ')');
        }
    }
}
