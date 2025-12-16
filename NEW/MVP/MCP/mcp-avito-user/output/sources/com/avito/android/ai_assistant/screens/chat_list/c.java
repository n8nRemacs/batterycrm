package com.avito.android.ai_assistant.screens.chat_list;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import java.util.AbstractList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AiAssistantChatListScreenData.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat_list/c;", "", "a", "b", "Lcom/avito/android/ai_assistant/screens/chat_list/c$a;", "Lcom/avito/android/ai_assistant/screens/chat_list/c$b;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface c {

    /* compiled from: AiAssistantChatListScreenData.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat_list/c$a;", "Lcom/avito/android/ai_assistant/screens/chat_list/c;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f89585a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AbstractList f89586b;

        public a(@k String str, @k AbstractList abstractList) {
            this.f89585a = str;
            this.f89586b = abstractList;
        }

        public static a a(a aVar, AbstractList abstractList) {
            String str = aVar.f89585a;
            aVar.getClass();
            return new a(str, abstractList);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f89585a, aVar.f89585a) && L.f(this.f89586b, aVar.f89586b);
        }

        public final int hashCode() {
            return this.f89586b.hashCode() + (this.f89585a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "LoadedContent(screenTitle=" + this.f89585a + ", items=" + this.f89586b + ')';
        }
    }

    /* compiled from: AiAssistantChatListScreenData.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat_list/c$b;", "Lcom/avito/android/ai_assistant/screens/chat_list/c;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f89587a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final UniversalImage f89588b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f89589c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final AttributedText f89590d;

        public b(@k AttributedText attributedText, @l UniversalImage universalImage, @k String str, @k String str2) {
            this.f89587a = str;
            this.f89588b = universalImage;
            this.f89589c = str2;
            this.f89590d = attributedText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f89587a, bVar.f89587a) && L.f(this.f89588b, bVar.f89588b) && L.f(this.f89589c, bVar.f89589c) && L.f(this.f89590d, bVar.f89590d);
        }

        public final int hashCode() {
            int iHashCode = this.f89587a.hashCode() * 31;
            UniversalImage universalImage = this.f89588b;
            return this.f89590d.hashCode() + H.d((iHashCode + (universalImage == null ? 0 : universalImage.hashCode())) * 31, 31, this.f89589c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Placeholder(screenTitle=");
            sb2.append(this.f89587a);
            sb2.append(", image=");
            sb2.append(this.f89588b);
            sb2.append(", title=");
            sb2.append(this.f89589c);
            sb2.append(", subtitle=");
            return com.avito.android.actions_sheet.a.w(sb2, this.f89590d, ')');
        }
    }
}
