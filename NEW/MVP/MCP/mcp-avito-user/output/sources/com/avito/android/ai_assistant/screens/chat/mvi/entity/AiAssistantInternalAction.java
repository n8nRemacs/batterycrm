package com.avito.android.ai_assistant.screens.chat.mvi.entity;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.ai_assistant.adapter.segment_buttons.a;
import com.avito.android.ai_assistant.model.AppendDirection;
import com.avito.android.ai_assistant.model.MessageActionType;
import com.avito.android.ai_assistant.model.MessageSendFrom;
import com.avito.android.ai_assistant.model.OkRespDataSuccessElementsItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.L;

/* compiled from: AiAssistantInternalAction.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u001c\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u0082\u0001\u001c\u001e\u001f !\"#$%&'()*+,-./0123456789¨\u0006:"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "UpdateChatHistory", "z", "A", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$a;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$b;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$c;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$d;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$e;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$f;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$g;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$h;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$i;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$j;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$k;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$l;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$m;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$n;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$o;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$p;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$q;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$r;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$s;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$t;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$u;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$v;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$w;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$x;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$y;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$UpdateChatHistory;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$z;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$A;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface AiAssistantInternalAction {

    /* compiled from: AiAssistantInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$A;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class A implements AiAssistantInternalAction {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f89238a;

        public A(@Y61.k String str) {
            this.f89238a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof A) && L.f(this.f89238a, ((A) obj).f89238a);
        }

        public final int hashCode() {
            return this.f89238a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("UserQueryUpdated(query="), this.f89238a, ')');
        }
    }

    /* compiled from: AiAssistantInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$UpdateChatHistory;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "AnswerLoading", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateChatHistory implements AiAssistantInternalAction {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Object f89239a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Tb.d f89240b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f89241c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final AppendDirection f89242d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f89243e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final AttributedText f89244f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final AnswerLoading f89245g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f89246h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public final Object f89247i;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AiAssistantInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$UpdateChatHistory$AnswerLoading;", "", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class AnswerLoading {

            /* renamed from: b, reason: collision with root package name */
            public static final AnswerLoading f89248b;

            /* renamed from: c, reason: collision with root package name */
            public static final AnswerLoading f89249c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ AnswerLoading[] f89250d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ a f89251e;

            static {
                AnswerLoading answerLoading = new AnswerLoading("ADD", 0);
                f89248b = answerLoading;
                AnswerLoading answerLoading2 = new AnswerLoading("REMOVE", 1);
                f89249c = answerLoading2;
                AnswerLoading[] answerLoadingArr = {answerLoading, answerLoading2};
                f89250d = answerLoadingArr;
                f89251e = kotlin.enums.c.a(answerLoadingArr);
            }

            public AnswerLoading() {
                throw null;
            }

            public static AnswerLoading valueOf(String str) {
                return (AnswerLoading) Enum.valueOf(AnswerLoading.class, str);
            }

            public static AnswerLoading[] values() {
                return (AnswerLoading[]) f89250d.clone();
            }
        }

        public UpdateChatHistory(@Y61.l List<? extends OkRespDataSuccessElementsItem> list, @Y61.l Tb.d dVar, boolean z12, @Y61.l AppendDirection appendDirection, boolean z13, @Y61.l AttributedText attributedText, @Y61.l AnswerLoading answerLoading, boolean z14, @Y61.k List<Tb.e> list2) {
            this.f89239a = list;
            this.f89240b = dVar;
            this.f89241c = z12;
            this.f89242d = appendDirection;
            this.f89243e = z13;
            this.f89244f = attributedText;
            this.f89245g = answerLoading;
            this.f89246h = z14;
            this.f89247i = list2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateChatHistory)) {
                return false;
            }
            UpdateChatHistory updateChatHistory = (UpdateChatHistory) obj;
            return L.f(this.f89239a, updateChatHistory.f89239a) && L.f(this.f89240b, updateChatHistory.f89240b) && this.f89241c == updateChatHistory.f89241c && this.f89242d == updateChatHistory.f89242d && this.f89243e == updateChatHistory.f89243e && L.f(this.f89244f, updateChatHistory.f89244f) && this.f89245g == updateChatHistory.f89245g && this.f89246h == updateChatHistory.f89246h && L.f(this.f89247i, updateChatHistory.f89247i);
        }

        public final int hashCode() {
            Object obj = this.f89239a;
            int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
            Tb.d dVar = this.f89240b;
            int i12 = androidx.appcompat.app.r.i((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f89241c);
            AppendDirection appendDirection = this.f89242d;
            int i13 = androidx.appcompat.app.r.i((i12 + (appendDirection == null ? 0 : appendDirection.hashCode())) * 31, 31, this.f89243e);
            AttributedText attributedText = this.f89244f;
            int iHashCode2 = (i13 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            AnswerLoading answerLoading = this.f89245g;
            return this.f89247i.hashCode() + androidx.appcompat.app.r.i((iHashCode2 + (answerLoading != null ? answerLoading.hashCode() : 0)) * 31, 31, this.f89246h);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateChatHistory(elements=");
            sb2.append(this.f89239a);
            sb2.append(", maintenance=");
            sb2.append(this.f89240b);
            sb2.append(", isLastChunk=");
            sb2.append(this.f89241c);
            sb2.append(", appendDirection=");
            sb2.append(this.f89242d);
            sb2.append(", clearSendId=");
            sb2.append(this.f89243e);
            sb2.append(", disclaimer=");
            sb2.append(this.f89244f);
            sb2.append(", answerLoading=");
            sb2.append(this.f89245g);
            sb2.append(", repeatButton=");
            sb2.append(this.f89246h);
            sb2.append(", onCloseUxFeedbacks=");
            return H.n(sb2, this.f89247i, ')');
        }
    }

    /* compiled from: AiAssistantInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$a;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.ai_assistant.screens.chat.mvi.entity.AiAssistantInternalAction$a, reason: case insensitive filesystem */
    public static final /* data */ class C28367a implements AiAssistantInternalAction {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f89252a;

        public C28367a(@Y61.k DeepLink deepLink) {
            this.f89252a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C28367a) && L.f(this.f89252a, ((C28367a) obj).f89252a);
        }

        public final int hashCode() {
            return this.f89252a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("ActionLinkClicked(deepLink="), this.f89252a, ')');
        }
    }

    /* compiled from: AiAssistantInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$b;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements AiAssistantInternalAction {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f89253a = new b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 696714152;
        }

        @Y61.k
        public final String toString() {
            return "AnswerLoadingCanceled";
        }
    }

    /* compiled from: AiAssistantInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$c;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements AiAssistantInternalAction {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f89254a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f89255b;

        public c(@Y61.k DeepLink deepLink, @Y61.k String str) {
            this.f89254a = deepLink;
            this.f89255b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f89254a, cVar.f89254a) && L.f(this.f89255b, cVar.f89255b);
        }

        public final int hashCode() {
            return this.f89255b.hashCode() + (this.f89254a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AssistantMessageLinkClicked(deepLink=");
            sb2.append(this.f89254a);
            sb2.append(", currentChatId=");
            return C22026a.c(sb2, this.f89255b, ')');
        }
    }

    /* compiled from: AiAssistantInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$d;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements AiAssistantInternalAction {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f89256a = new d();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 2106202991;
        }

        @Y61.k
        public final String toString() {
            return "ChatAlreadyNew";
        }
    }

    /* compiled from: AiAssistantInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$e;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements AiAssistantInternalAction {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ApiError f89257a;

        public e(@Y61.k ApiError apiError) {
            this.f89257a = apiError;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f89257a, ((e) obj).f89257a);
        }

        public final int hashCode() {
            return this.f89257a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.n(new StringBuilder("ChatHistoryFailed(error="), this.f89257a, ')');
        }
    }

    /* compiled from: AiAssistantInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$f;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements AiAssistantInternalAction {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f89258a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f89259b;

        public f(@Y61.k String str, @Y61.l String str2) {
            this.f89258a = str;
            this.f89259b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f89258a, fVar.f89258a) && L.f(this.f89259b, fVar.f89259b);
        }

        public final int hashCode() {
            int iHashCode = this.f89258a.hashCode() * 31;
            String str = this.f89259b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChatListClicked(currentChatId=");
            sb2.append(this.f89258a);
            sb2.append(", newChatContext=");
            return C22026a.c(sb2, this.f89259b, ')');
        }
    }

    /* compiled from: AiAssistantInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$g;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements AiAssistantInternalAction {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final g f89260a = new g();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -679809302;
        }

        @Y61.k
        public final String toString() {
            return "ChatUpdateEvent";
        }
    }

    /* compiled from: AiAssistantInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$h;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements AiAssistantInternalAction {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<Tb.e> f89261a;

        public h(@Y61.k List<Tb.e> list) {
            this.f89261a = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f89261a, ((h) obj).f89261a);
        }

        public final int hashCode() {
            return this.f89261a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return H.p(new StringBuilder("CloseClicked(onCloseUxFeedback="), this.f89261a, ')');
        }
    }

    /* compiled from: AiAssistantInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$i;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements AiAssistantInternalAction {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final i f89262a = new i();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -1834228447;
        }

        @Y61.k
        public final String toString() {
            return "DisableSend";
        }
    }

    /* compiled from: AiAssistantInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$j;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements AiAssistantInternalAction {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ApiError f89263a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f89264b;

        public j(@Y61.k ApiError apiError, @Y61.k String str) {
            this.f89263a = apiError;
            this.f89264b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return L.f(this.f89263a, jVar.f89263a) && L.f(this.f89264b, jVar.f89264b);
        }

        public final int hashCode() {
            return this.f89264b.hashCode() + (this.f89263a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DiscoverFailed(error=");
            sb2.append(this.f89263a);
            sb2.append(", iId=");
            return C22026a.c(sb2, this.f89264b, ')');
        }
    }

    /* compiled from: AiAssistantInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$k;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements AiAssistantInternalAction {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f89265a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f89266b;

        public k(@Y61.k String str, @Y61.l String str2) {
            this.f89265a = str;
            this.f89266b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return L.f(this.f89265a, kVar.f89265a) && L.f(this.f89266b, kVar.f89266b);
        }

        public final int hashCode() {
            int iHashCode = this.f89265a.hashCode() * 31;
            String str = this.f89266b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DiscoverSuccess(chatId=");
            sb2.append(this.f89265a);
            sb2.append(", newChatContext=");
            return C22026a.c(sb2, this.f89266b, ')');
        }
    }

    /* compiled from: AiAssistantInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$l;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l implements AiAssistantInternalAction {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final l f89267a = new l();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 1097639674;
        }

        @Y61.k
        public final String toString() {
            return "EnableSend";
        }
    }

    /* compiled from: AiAssistantInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$m;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class m implements AiAssistantInternalAction {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Set<String> f89268a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f89269b;

        public m(@Y61.k Set<String> set, boolean z12) {
            this.f89268a = set;
            this.f89269b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return L.f(this.f89268a, mVar.f89268a) && this.f89269b == mVar.f89269b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f89269b) + (this.f89268a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FavoriteStateChanged(ids=");
            sb2.append(this.f89268a);
            sb2.append(", isFavorite=");
            return androidx.appcompat.app.r.x(sb2, this.f89269b, ')');
        }
    }

    /* compiled from: AiAssistantInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$n;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class n implements AiAssistantInternalAction {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final n f89270a = new n();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return -352005260;
        }

        @Y61.k
        public final String toString() {
            return "LoadingStarted";
        }
    }

    /* compiled from: AiAssistantInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$o;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class o implements AiAssistantInternalAction {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f89271a;

        public o(@Y61.l String str) {
            this.f89271a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && L.f(this.f89271a, ((o) obj).f89271a);
        }

        public final int hashCode() {
            String str = this.f89271a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("NavigateToNewChat(newChatContext="), this.f89271a, ')');
        }
    }

    /* compiled from: AiAssistantInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$p;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class p implements AiAssistantInternalAction {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final p f89272a = new p();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return -1535559712;
        }

        @Y61.k
        public final String toString() {
            return "NoChange";
        }
    }

    /* compiled from: AiAssistantInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$q;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class q implements AiAssistantInternalAction {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AppendDirection f89273a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ApiError f89274b;

        public q(@Y61.k AppendDirection appendDirection, @Y61.k ApiError apiError) {
            this.f89273a = appendDirection;
            this.f89274b = apiError;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return this.f89273a == qVar.f89273a && L.f(this.f89274b, qVar.f89274b);
        }

        public final int hashCode() {
            return this.f89274b.hashCode() + (this.f89273a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PortionLoadingFailed(appendDirection=");
            sb2.append(this.f89273a);
            sb2.append(", error=");
            return AK.c.n(sb2, this.f89274b, ')');
        }
    }

    /* compiled from: AiAssistantInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$r;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class r implements AiAssistantInternalAction {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final r f89275a = new r();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof r);
        }

        public final int hashCode() {
            return -1753075146;
        }

        @Y61.k
        public final String toString() {
            return "RetryAppendItemLoading";
        }
    }

    /* compiled from: AiAssistantInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$s;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class s implements AiAssistantInternalAction {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ApiError f89276a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f89277b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final PrintableText f89278c;

        public s(@Y61.k ApiError apiError, @Y61.k String str, @Y61.k PrintableText printableText) {
            this.f89276a = apiError;
            this.f89277b = str;
            this.f89278c = printableText;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            s sVar = (s) obj;
            return L.f(this.f89276a, sVar.f89276a) && L.f(this.f89277b, sVar.f89277b) && L.f(this.f89278c, sVar.f89278c);
        }

        public final int hashCode() {
            return this.f89278c.hashCode() + H.d(this.f89276a.hashCode() * 31, 31, this.f89277b);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SendMessageFailed(error=");
            sb2.append(this.f89276a);
            sb2.append(", iId=");
            sb2.append(this.f89277b);
            sb2.append(", errorMessage=");
            return AK.c.m(sb2, this.f89278c, ')');
        }
    }

    /* compiled from: AiAssistantInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$t;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class t implements AiAssistantInternalAction {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final MessageSendFrom f89279a;

        public t(@Y61.k MessageSendFrom messageSendFrom) {
            this.f89279a = messageSendFrom;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && this.f89279a == ((t) obj).f89279a;
        }

        public final int hashCode() {
            return this.f89279a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "SendMessageStarted(from=" + this.f89279a + ')';
        }
    }

    /* compiled from: AiAssistantInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$u;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class u implements AiAssistantInternalAction {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final DeepLink f89280a;

        public u(@Y61.l DeepLink deepLink) {
            this.f89280a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && L.f(this.f89280a, ((u) obj).f89280a);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f89280a;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("SendMessageUxFeedback(link="), this.f89280a, ')');
        }
    }

    /* compiled from: AiAssistantInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$v;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class v implements AiAssistantInternalAction {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final v f89281a = new v();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof v);
        }

        public final int hashCode() {
            return -2125348494;
        }

        @Y61.k
        public final String toString() {
            return "ShowAnswerLoading";
        }
    }

    /* compiled from: AiAssistantInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$w;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class w implements AiAssistantInternalAction {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final a.b.C2620a f89282a;

        public w(@Y61.k a.b.C2620a c2620a) {
            this.f89282a = c2620a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && L.f(this.f89282a, ((w) obj).f89282a);
        }

        public final int hashCode() {
            return this.f89282a.f88856a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "SuggestionClicked(clickStream=" + this.f89282a + ')';
        }
    }

    /* compiled from: AiAssistantInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$x;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class x implements AiAssistantInternalAction {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f89283a;

        public x(@Y61.k DeepLink deepLink) {
            this.f89283a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x) && L.f(this.f89283a, ((x) obj).f89283a);
        }

        public final int hashCode() {
            return this.f89283a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("SuggestionsShowed(clickStream="), this.f89283a, ')');
        }
    }

    /* compiled from: AiAssistantInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$y;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class y implements AiAssistantInternalAction {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f89284a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final MessageActionType f89285b;

        public y(@Y61.k String str, @Y61.k MessageActionType messageActionType) {
            this.f89284a = str;
            this.f89285b = messageActionType;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof y)) {
                return false;
            }
            y yVar = (y) obj;
            return L.f(this.f89284a, yVar.f89284a) && this.f89285b == yVar.f89285b;
        }

        public final int hashCode() {
            return this.f89285b.hashCode() + (this.f89284a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "UpdateActionsItem(ownerId=" + this.f89284a + ", actionType=" + this.f89285b + ')';
        }
    }

    /* compiled from: AiAssistantInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction$z;", "Lcom/avito/android/ai_assistant/screens/chat/mvi/entity/AiAssistantInternalAction;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class z implements AiAssistantInternalAction {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Vb.d f89286a;

        public z(@Y61.k Vb.d dVar) {
            this.f89286a = dVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof z) && L.f(this.f89286a, ((z) obj).f89286a);
        }

        public final int hashCode() {
            return this.f89286a.f17234a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "UpdatePrivateState(state=" + this.f89286a + ')';
        }
    }
}
