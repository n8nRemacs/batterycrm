package com.avito.android.ai_assistant.screens.chat_list.mvi.entity;

import Pb.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AiAssistantChatListInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat_list/mvi/entity/AiAssistantChatListInternalAction;", "", "a", "b", "c", "Loaded", "Loading", "d", "e", "Lcom/avito/android/ai_assistant/screens/chat_list/mvi/entity/AiAssistantChatListInternalAction$a;", "Lcom/avito/android/ai_assistant/screens/chat_list/mvi/entity/AiAssistantChatListInternalAction$b;", "Lcom/avito/android/ai_assistant/screens/chat_list/mvi/entity/AiAssistantChatListInternalAction$c;", "Lcom/avito/android/ai_assistant/screens/chat_list/mvi/entity/AiAssistantChatListInternalAction$Loaded;", "Lcom/avito/android/ai_assistant/screens/chat_list/mvi/entity/AiAssistantChatListInternalAction$Loading;", "Lcom/avito/android/ai_assistant/screens/chat_list/mvi/entity/AiAssistantChatListInternalAction$d;", "Lcom/avito/android/ai_assistant/screens/chat_list/mvi/entity/AiAssistantChatListInternalAction$e;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface AiAssistantChatListInternalAction {

    /* compiled from: AiAssistantChatListInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat_list/mvi/entity/AiAssistantChatListInternalAction$Loaded;", "Lcom/avito/android/ai_assistant/screens/chat_list/mvi/entity/AiAssistantChatListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loaded implements AiAssistantChatListInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Pb.b f89608b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f89609c;

        public Loaded(@k Pb.b bVar, @l String str) {
            this.f89608b = bVar;
            this.f89609c = str;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF221519d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return L.f(this.f89608b, loaded.f89608b) && L.f(this.f89609c, loaded.f89609c);
        }

        public final int hashCode() {
            int iHashCode = this.f89608b.hashCode() * 31;
            String str = this.f89609c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Loaded(response=");
            sb2.append(this.f89608b);
            sb2.append(", newChatContext=");
            return C22026a.c(sb2, this.f89609c, ')');
        }
    }

    /* compiled from: AiAssistantChatListInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat_list/mvi/entity/AiAssistantChatListInternalAction$Loading;", "Lcom/avito/android/ai_assistant/screens/chat_list/mvi/entity/AiAssistantChatListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements AiAssistantChatListInternalAction {
    }

    /* compiled from: AiAssistantChatListInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat_list/mvi/entity/AiAssistantChatListInternalAction$a;", "Lcom/avito/android/ai_assistant/screens/chat_list/mvi/entity/AiAssistantChatListInternalAction;", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements AiAssistantChatListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final a f89610b = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -2143803200;
        }

        @k
        public final String toString() {
            return "BackClicked";
        }
    }

    /* compiled from: AiAssistantChatListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat_list/mvi/entity/AiAssistantChatListInternalAction$b;", "Lcom/avito/android/ai_assistant/screens/chat_list/mvi/entity/AiAssistantChatListInternalAction;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements AiAssistantChatListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f89611b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f89612c;

        public b() {
            this(null, null, 3, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f89611b, bVar.f89611b) && L.f(this.f89612c, bVar.f89612c);
        }

        public final int hashCode() {
            String str = this.f89611b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f89612c;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChatClicked(context=");
            sb2.append(this.f89611b);
            sb2.append(", chatId=");
            return C22026a.c(sb2, this.f89612c, ')');
        }

        public b(String str, String str2, int i12, C42822w c42822w) {
            str = (i12 & 1) != 0 ? null : str;
            str2 = (i12 & 2) != 0 ? null : str2;
            this.f89611b = str;
            this.f89612c = str2;
        }
    }

    /* compiled from: AiAssistantChatListInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat_list/mvi/entity/AiAssistantChatListInternalAction$c;", "Lcom/avito/android/ai_assistant/screens/chat_list/mvi/entity/AiAssistantChatListInternalAction;", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements AiAssistantChatListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final c f89613b = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 318798216;
        }

        @k
        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: AiAssistantChatListInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat_list/mvi/entity/AiAssistantChatListInternalAction$d;", "Lcom/avito/android/ai_assistant/screens/chat_list/mvi/entity/AiAssistantChatListInternalAction;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements AiAssistantChatListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final c.a f89614b;

        /* JADX WARN: Multi-variable type inference failed */
        public d() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f89614b, ((d) obj).f89614b);
        }

        public final int hashCode() {
            c.a aVar = this.f89614b;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        @k
        public final String toString() {
            return "PortionLoadingFailed(content=" + this.f89614b + ')';
        }

        public d(@l c.a aVar) {
            this.f89614b = aVar;
        }

        public /* synthetic */ d(c.a aVar, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : aVar);
        }
    }

    /* compiled from: AiAssistantChatListInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat_list/mvi/entity/AiAssistantChatListInternalAction$e;", "Lcom/avito/android/ai_assistant/screens/chat_list/mvi/entity/AiAssistantChatListInternalAction;", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements AiAssistantChatListInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final e f89615b = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -462339609;
        }

        @k
        public final String toString() {
            return "RetryAppendItemLoading";
        }
    }
}
