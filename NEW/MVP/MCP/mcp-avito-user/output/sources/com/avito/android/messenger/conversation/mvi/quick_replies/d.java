package com.avito.android.messenger.conversation.mvi.quick_replies;

import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.conversation.mvi.quick_replies.adapter.a;
import com.avito.android.util.architecture_components.D;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: QuickRepliesPresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/quick_replies/d;", "LS20/a;", "Lcom/avito/android/messenger/conversation/mvi/quick_replies/d$a;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface d extends S20.a<a> {

    /* compiled from: QuickRepliesPresenter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/quick_replies/d$a;", "", "a", "b", "Lcom/avito/android/messenger/conversation/mvi/quick_replies/d$a$a;", "Lcom/avito/android/messenger/conversation/mvi/quick_replies/d$a$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: QuickRepliesPresenter.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/quick_replies/d$a$a;", "Lcom/avito/android/messenger/conversation/mvi/quick_replies/d$a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.quick_replies.d$a$a, reason: collision with other inner class name */
        public static final class C5744a implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C5744a f194092a = new C5744a();
        }

        /* compiled from: QuickRepliesPresenter.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/quick_replies/d$a$b;", "Lcom/avito/android/messenger/conversation/mvi/quick_replies/d$a;", "a", "b", "Lcom/avito/android/messenger/conversation/mvi/quick_replies/d$a$b$a;", "Lcom/avito/android/messenger/conversation/mvi/quick_replies/d$a$b$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface b extends a {

            /* compiled from: QuickRepliesPresenter.kt */
            @P
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/quick_replies/d$a$b$b;", "Lcom/avito/android/messenger/conversation/mvi/quick_replies/d$a$b;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.messenger.conversation.mvi.quick_replies.d$a$b$b, reason: collision with other inner class name */
            public static final class C5748b implements b {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final C5748b f194097a = new C5748b();
            }

            /* compiled from: QuickRepliesPresenter.kt */
            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/quick_replies/d$a$b$a;", "Lcom/avito/android/messenger/conversation/mvi/quick_replies/d$a$b;", "a", "b", "c", "Lcom/avito/android/messenger/conversation/mvi/quick_replies/d$a$b$a$a;", "Lcom/avito/android/messenger/conversation/mvi/quick_replies/d$a$b$a$b;", "Lcom/avito/android/messenger/conversation/mvi/quick_replies/d$a$b$a$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.messenger.conversation.mvi.quick_replies.d$a$b$a, reason: collision with other inner class name */
            public interface InterfaceC5745a extends b {

                /* compiled from: QuickRepliesPresenter.kt */
                @P
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/quick_replies/d$a$b$a$a;", "Lcom/avito/android/messenger/conversation/mvi/quick_replies/d$a$b$a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.messenger.conversation.mvi.quick_replies.d$a$b$a$a, reason: collision with other inner class name */
                public static final class C5746a implements InterfaceC5745a {

                    /* renamed from: a, reason: collision with root package name */
                    @Y61.k
                    public static final C5746a f194093a = new C5746a();
                }

                /* compiled from: QuickRepliesPresenter.kt */
                @P
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/quick_replies/d$a$b$a$c;", "Lcom/avito/android/messenger/conversation/mvi/quick_replies/d$a$b$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.messenger.conversation.mvi.quick_replies.d$a$b$a$c */
                public static final /* data */ class c implements InterfaceC5745a {

                    /* renamed from: a, reason: collision with root package name */
                    @Y61.k
                    public final ArrayList f194096a;

                    public c(@Y61.k ArrayList arrayList) {
                        this.f194096a = arrayList;
                    }

                    public final boolean equals(@Y61.l Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof c) && this.f194096a.equals(((c) obj).f194096a);
                    }

                    public final int hashCode() {
                        return this.f194096a.hashCode();
                    }

                    @Y61.k
                    public final String toString() {
                        return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("ListViewMode(items="), this.f194096a, ')');
                    }
                }

                /* compiled from: QuickRepliesPresenter.kt */
                @P
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/quick_replies/d$a$b$a$b;", "Lcom/avito/android/messenger/conversation/mvi/quick_replies/d$a$b$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.messenger.conversation.mvi.quick_replies.d$a$b$a$b, reason: collision with other inner class name */
                public static final /* data */ class C5747b implements InterfaceC5745a {

                    /* renamed from: a, reason: collision with root package name */
                    @Y61.k
                    public final List<a.b> f194094a;

                    /* renamed from: b, reason: collision with root package name */
                    @Y61.l
                    public final a.b f194095b;

                    public C5747b(@Y61.k List<a.b> list, @Y61.l a.b bVar) {
                        this.f194094a = list;
                        this.f194095b = bVar;
                    }

                    public final boolean equals(@Y61.l Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C5747b)) {
                            return false;
                        }
                        C5747b c5747b = (C5747b) obj;
                        return L.f(this.f194094a, c5747b.f194094a) && L.f(this.f194095b, c5747b.f194095b);
                    }

                    public final int hashCode() {
                        int iHashCode = this.f194094a.hashCode() * 31;
                        a.b bVar = this.f194095b;
                        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
                    }

                    @Y61.k
                    public final String toString() {
                        return "ListEditMode(items=" + this.f194094a + ", itemToBeDeleted=" + this.f194095b + ')';
                    }

                    public /* synthetic */ C5747b(List list, a.b bVar, int i12, C42822w c42822w) {
                        this(list, (i12 & 2) != 0 ? null : bVar);
                    }
                }
            }
        }
    }

    @Y61.k
    D N4();

    @Y61.k
    D T();

    @Y61.k
    D Zb();

    void fa();

    void g9(@Y61.k a.b bVar);

    void gd();

    void hide();

    void i4();

    void kb();

    void show();

    void t5(@Y61.k a.c cVar);
}
