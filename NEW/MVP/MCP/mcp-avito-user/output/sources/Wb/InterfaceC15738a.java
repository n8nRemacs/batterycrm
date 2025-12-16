package Wb;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AiAssistantChatListAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LWb/a;", "", "a", "b", "c", "d", "e", "f", "LWb/a$a;", "LWb/a$b;", "LWb/a$c;", "LWb/a$d;", "LWb/a$e;", "LWb/a$f;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Wb.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC15738a {

    /* compiled from: AiAssistantChatListAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWb/a$a;", "LWb/a;", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Wb.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1273a implements InterfaceC15738a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1273a f17961a = new C1273a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C1273a);
        }

        public final int hashCode() {
            return 2090302211;
        }

        @k
        public final String toString() {
            return "AddClicked";
        }
    }

    /* compiled from: AiAssistantChatListAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWb/a$b;", "LWb/a;", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Wb.a$b */
    public static final /* data */ class b implements InterfaceC15738a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f17962a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 31122979;
        }

        @k
        public final String toString() {
            return "BackClicked";
        }
    }

    /* compiled from: AiAssistantChatListAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWb/a$c;", "LWb/a;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Wb.a$c */
    public static final /* data */ class c implements InterfaceC15738a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.android.ai_assistant.adapter.chat_list_item.a f17963a;

        public c(@k com.avito.android.ai_assistant.adapter.chat_list_item.a aVar) {
            this.f17963a = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f17963a, ((c) obj).f17963a);
        }

        public final int hashCode() {
            return this.f17963a.hashCode();
        }

        @k
        public final String toString() {
            return "ChatClicked(chatItem=" + this.f17963a + ')';
        }
    }

    /* compiled from: AiAssistantChatListAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWb/a$d;", "LWb/a;", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Wb.a$d */
    public static final /* data */ class d implements InterfaceC15738a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f17964a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1887595712;
        }

        @k
        public final String toString() {
            return "OnPagingRetry";
        }
    }

    /* compiled from: AiAssistantChatListAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWb/a$e;", "LWb/a;", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Wb.a$e */
    public static final /* data */ class e implements InterfaceC15738a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f17965a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1989552715;
        }

        @k
        public final String toString() {
            return "OnSpinnerReached";
        }
    }

    /* compiled from: AiAssistantChatListAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWb/a$f;", "LWb/a;", "<init>", "()V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Wb.a$f */
    public static final /* data */ class f implements InterfaceC15738a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f17966a = new f();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1588045065;
        }

        @k
        public final String toString() {
            return "RefreshClicked";
        }
    }
}
