package com.avito.android.messenger.conversation.mvi.message_menu;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import j.InterfaceC42165v;
import j.e0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MenuElement.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/b;", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/avito/android/messenger/conversation/mvi/message_menu/b$a;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/b$b;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/b$c;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/b$d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.message_menu.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC32118b {

    /* compiled from: MenuElement.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/b$a;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.message_menu.b$a */
    public static final /* data */ class a extends AbstractC32118b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f191560a;

        /* renamed from: b, reason: collision with root package name */
        public final int f191561b;

        /* renamed from: c, reason: collision with root package name */
        public final int f191562c;

        public a(@Y61.k String str, @e0 int i12, @InterfaceC42165v int i13) {
            super(null);
            this.f191560a = str;
            this.f191561b = i12;
            this.f191562c = i13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f191560a, aVar.f191560a) && this.f191561b == aVar.f191561b && this.f191562c == aVar.f191562c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f191562c) + androidx.appcompat.app.r.e(this.f191561b, this.f191560a.hashCode() * 31, 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Action(id=");
            sb2.append(this.f191560a);
            sb2.append(", title=");
            sb2.append(this.f191561b);
            sb2.append(", icon=");
            return androidx.appcompat.app.r.t(sb2, this.f191562c, ')');
        }
    }

    /* compiled from: MenuElement.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/b$b;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.message_menu.b$b, reason: collision with other inner class name */
    public static final /* data */ class C5660b extends AbstractC32118b {
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5660b)) {
                return false;
            }
            ((C5660b) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @Y61.k
        public final String toString() {
            return "Header(text=null)";
        }
    }

    /* compiled from: MenuElement.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/b$c;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.message_menu.b$c */
    public static final /* data */ class c extends AbstractC32118b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f191563a;

        public c(@Y61.k String str) {
            super(null);
            this.f191563a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f191563a, ((c) obj).f191563a);
        }

        public final int hashCode() {
            return this.f191563a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("Hint(text="), this.f191563a, ')');
        }
    }

    /* compiled from: MenuElement.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/b$d;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.message_menu.b$d */
    public static final /* data */ class d extends AbstractC32118b {
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            ((d) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @Y61.k
        public final String toString() {
            return "Text(text=null)";
        }
    }

    public /* synthetic */ AbstractC32118b(C42822w c42822w) {
        this();
    }

    public AbstractC32118b() {
    }
}
