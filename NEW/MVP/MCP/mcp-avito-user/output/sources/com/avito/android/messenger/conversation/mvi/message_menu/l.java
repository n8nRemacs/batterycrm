package com.avito.android.messenger.conversation.mvi.message_menu;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.remote.model.messenger.ActionConfirmation;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MessageMenuPresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/l;", "LS20/a;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/l$a;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface l extends S20.a<a> {

    /* compiled from: MessageMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/l$a;", "", "a", "b", "c", "Lcom/avito/android/messenger/conversation/mvi/message_menu/l$a$a;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/l$a$b;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/l$a$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: MessageMenuPresenter.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/l$a$a;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/l$a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.message_menu.l$a$a, reason: collision with other inner class name */
        public static final class C5666a implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C5666a f191764a = new C5666a();

            @Override // com.avito.android.messenger.conversation.mvi.message_menu.l.a
            @Y61.l
            public final Boolean a() {
                return null;
            }

            @Override // com.avito.android.messenger.conversation.mvi.message_menu.l.a
            @Y61.l
            public final Boolean b() {
                return null;
            }

            @Override // com.avito.android.messenger.conversation.mvi.message_menu.l.a
            @Y61.l
            /* renamed from: getConfig */
            public final Y81.a getF191774a() {
                return null;
            }
        }

        /* compiled from: MessageMenuPresenter.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/l$a$b;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/l$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final Y81.a f191765a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f191766b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f191767c;

            public b(@Y61.k Y81.a aVar, boolean z12, boolean z13) {
                this.f191765a = aVar;
                this.f191766b = z12;
                this.f191767c = z13;
            }

            @Override // com.avito.android.messenger.conversation.mvi.message_menu.l.a
            @Y61.k
            public final Boolean a() {
                return Boolean.valueOf(this.f191767c);
            }

            @Override // com.avito.android.messenger.conversation.mvi.message_menu.l.a
            @Y61.k
            public final Boolean b() {
                return Boolean.valueOf(this.f191766b);
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f191765a, bVar.f191765a) && this.f191766b == bVar.f191766b && this.f191767c == bVar.f191767c;
            }

            @Override // com.avito.android.messenger.conversation.mvi.message_menu.l.a
            @Y61.k
            /* renamed from: getConfig, reason: from getter */
            public final Y81.a getF191774a() {
                return this.f191765a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f191767c) + androidx.appcompat.app.r.i(Long.hashCode(this.f191765a.f19367a) * 31, 31, this.f191766b);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Hidden(config=");
                sb2.append(this.f191765a);
                sb2.append(", allowQuickReplies=");
                sb2.append(this.f191766b);
                sb2.append(", allowQuoteReplies=");
                return androidx.appcompat.app.r.x(sb2, this.f191767c, ')');
            }
        }

        /* compiled from: MessageMenuPresenter.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/l$a$c;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/l$a;", "a", "b", "Lcom/avito/android/messenger/conversation/mvi/message_menu/l$a$c$a;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/l$a$c$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface c extends a {

            /* compiled from: MessageMenuPresenter.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/l$a$c$a;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/l$a$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.messenger.conversation.mvi.message_menu.l$a$c$a, reason: collision with other inner class name */
            public static final /* data */ class C5667a implements c {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public final Y81.a f191768a;

                /* renamed from: b, reason: collision with root package name */
                public final boolean f191769b;

                /* renamed from: c, reason: collision with root package name */
                @Y61.k
                public final d f191770c;

                /* renamed from: d, reason: collision with root package name */
                public final boolean f191771d;

                /* renamed from: e, reason: collision with root package name */
                @Y61.k
                public final String f191772e;

                /* renamed from: f, reason: collision with root package name */
                @Y61.k
                public final ActionConfirmation f191773f;

                public C5667a(@Y61.k Y81.a aVar, boolean z12, @Y61.k d dVar, boolean z13, @Y61.k String str, @Y61.k ActionConfirmation actionConfirmation) {
                    this.f191768a = aVar;
                    this.f191769b = z12;
                    this.f191770c = dVar;
                    this.f191771d = z13;
                    this.f191772e = str;
                    this.f191773f = actionConfirmation;
                }

                @Override // com.avito.android.messenger.conversation.mvi.message_menu.l.a
                @Y61.k
                public final Boolean a() {
                    return Boolean.valueOf(this.f191771d);
                }

                @Override // com.avito.android.messenger.conversation.mvi.message_menu.l.a
                @Y61.k
                public final Boolean b() {
                    return Boolean.valueOf(this.f191769b);
                }

                @Override // com.avito.android.messenger.conversation.mvi.message_menu.l.a.c
                @Y61.k
                /* renamed from: c, reason: from getter */
                public final d getF191776c() {
                    return this.f191770c;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C5667a)) {
                        return false;
                    }
                    C5667a c5667a = (C5667a) obj;
                    return L.f(this.f191768a, c5667a.f191768a) && this.f191769b == c5667a.f191769b && L.f(this.f191770c, c5667a.f191770c) && this.f191771d == c5667a.f191771d && L.f(this.f191772e, c5667a.f191772e) && L.f(this.f191773f, c5667a.f191773f);
                }

                @Override // com.avito.android.messenger.conversation.mvi.message_menu.l.a
                @Y61.k
                /* renamed from: getConfig, reason: from getter */
                public final Y81.a getF191774a() {
                    return this.f191768a;
                }

                public final int hashCode() {
                    return this.f191773f.hashCode() + H.d(androidx.appcompat.app.r.i((this.f191770c.hashCode() + androidx.appcompat.app.r.i(Long.hashCode(this.f191768a.f19367a) * 31, 31, this.f191769b)) * 31, 31, this.f191771d), 31, this.f191772e);
                }

                @Y61.k
                public final String toString() {
                    return "Confirmation(config=" + this.f191768a + ", allowQuickReplies=" + this.f191769b + ", contextData=" + this.f191770c + ", allowQuoteReplies=" + this.f191771d + ", actionId=" + this.f191772e + ", confirmation=" + this.f191773f + ')';
                }
            }

            /* compiled from: MessageMenuPresenter.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/l$a$c$b;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/l$a$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class b implements c {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public final Y81.a f191774a;

                /* renamed from: b, reason: collision with root package name */
                public final boolean f191775b;

                /* renamed from: c, reason: collision with root package name */
                @Y61.k
                public final d f191776c;

                /* renamed from: d, reason: collision with root package name */
                public final boolean f191777d;

                /* renamed from: e, reason: collision with root package name */
                @Y61.k
                public final ArrayList f191778e;

                public b(@Y61.k Y81.a aVar, boolean z12, @Y61.k d dVar, boolean z13, @Y61.k ArrayList arrayList) {
                    this.f191774a = aVar;
                    this.f191775b = z12;
                    this.f191776c = dVar;
                    this.f191777d = z13;
                    this.f191778e = arrayList;
                }

                @Override // com.avito.android.messenger.conversation.mvi.message_menu.l.a
                @Y61.k
                public final Boolean a() {
                    return Boolean.valueOf(this.f191777d);
                }

                @Override // com.avito.android.messenger.conversation.mvi.message_menu.l.a
                @Y61.k
                public final Boolean b() {
                    return Boolean.valueOf(this.f191775b);
                }

                @Override // com.avito.android.messenger.conversation.mvi.message_menu.l.a.c
                @Y61.k
                /* renamed from: c, reason: from getter */
                public final d getF191776c() {
                    return this.f191776c;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return L.f(this.f191774a, bVar.f191774a) && this.f191775b == bVar.f191775b && this.f191776c.equals(bVar.f191776c) && this.f191777d == bVar.f191777d && this.f191778e.equals(bVar.f191778e);
                }

                @Override // com.avito.android.messenger.conversation.mvi.message_menu.l.a
                @Y61.k
                /* renamed from: getConfig, reason: from getter */
                public final Y81.a getF191774a() {
                    return this.f191774a;
                }

                public final int hashCode() {
                    return this.f191778e.hashCode() + androidx.appcompat.app.r.i((this.f191776c.hashCode() + androidx.appcompat.app.r.i(Long.hashCode(this.f191774a.f19367a) * 31, 31, this.f191775b)) * 31, 31, this.f191777d);
                }

                @Y61.k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("Menu(config=");
                    sb2.append(this.f191774a);
                    sb2.append(", allowQuickReplies=");
                    sb2.append(this.f191775b);
                    sb2.append(", contextData=");
                    sb2.append(this.f191776c);
                    sb2.append(", allowQuoteReplies=");
                    sb2.append(this.f191777d);
                    sb2.append(", menuItems=");
                    return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f191778e, ')');
                }
            }

            @Y61.k
            /* renamed from: c */
            d getF191776c();
        }

        @Y61.l
        Boolean a();

        @Y61.l
        Boolean b();

        @Y61.l
        /* renamed from: getConfig */
        Y81.a getF191774a();
    }

    void Cc(@Y61.k T1.d.b bVar, @Y61.k LocalMessage localMessage, @Y61.k String str);

    void Sd();

    void k4();

    void tb(@Y61.k T1.d.b bVar, @Y61.k LocalMessage localMessage);

    void y9(@Y61.k String str);
}
