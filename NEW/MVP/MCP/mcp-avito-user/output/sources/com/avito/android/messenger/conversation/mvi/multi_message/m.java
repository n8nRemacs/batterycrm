package com.avito.android.messenger.conversation.mvi.multi_message;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.architecture_components.D;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MultiMessagePresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/multi_message/m;", "LS20/a;", "Lcom/avito/android/messenger/conversation/mvi/multi_message/m$b;", "a", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface m extends S20.a<b> {

    /* compiled from: MultiMessagePresenter.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/multi_message/m$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f193711a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f193712b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f193713c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final DeepLink f193714d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final DeepLink f193715e;

        public a(long j12, @Y61.k String str, @Y61.k String str2, @Y61.k DeepLink deepLink, @Y61.l DeepLink deepLink2) {
            this.f193711a = j12;
            this.f193712b = str;
            this.f193713c = str2;
            this.f193714d = deepLink;
            this.f193715e = deepLink2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f193711a == aVar.f193711a && L.f(this.f193712b, aVar.f193712b) && L.f(this.f193713c, aVar.f193713c) && L.f(this.f193714d, aVar.f193714d) && L.f(this.f193715e, aVar.f193715e);
        }

        public final int hashCode() {
            int iE2 = com.avito.android.actions_sheet.a.e(this.f193714d, H.d(H.d(Long.hashCode(this.f193711a) * 31, 31, this.f193712b), 31, this.f193713c), 31);
            DeepLink deepLink = this.f193715e;
            return iE2 + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ActionPayload(itemId=");
            sb2.append(this.f193711a);
            sb2.append(", channelId=");
            sb2.append(this.f193712b);
            sb2.append(", message=");
            sb2.append(this.f193713c);
            sb2.append(", actionDeeplink=");
            sb2.append(this.f193714d);
            sb2.append(", closeDeeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f193715e, ')');
        }
    }

    /* compiled from: MultiMessagePresenter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/multi_message/m$b;", "", "a", "b", "Lcom/avito/android/messenger/conversation/mvi/multi_message/m$b$a;", "Lcom/avito/android/messenger/conversation/mvi/multi_message/m$b$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: MultiMessagePresenter.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/multi_message/m$b$a;", "Lcom/avito/android/messenger/conversation/mvi/multi_message/m$b;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final a f193716a = new a();
        }

        /* compiled from: MultiMessagePresenter.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/multi_message/m$b$b;", "Lcom/avito/android/messenger/conversation/mvi/multi_message/m$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.multi_message.m$b$b, reason: collision with other inner class name */
        public static final /* data */ class C5728b implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final com.avito.android.messenger.conversation.mvi.multi_message.composable.i f193717a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final a f193718b;

            public C5728b(@Y61.k com.avito.android.messenger.conversation.mvi.multi_message.composable.i iVar, @Y61.k a aVar) {
                this.f193717a = iVar;
                this.f193718b = aVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C5728b)) {
                    return false;
                }
                C5728b c5728b = (C5728b) obj;
                return L.f(this.f193717a, c5728b.f193717a) && L.f(this.f193718b, c5728b.f193718b);
            }

            public final int hashCode() {
                return this.f193718b.hashCode() + (this.f193717a.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                return "Shown(state=" + this.f193717a + ", payload=" + this.f193718b + ')';
            }
        }
    }

    void Fb();

    @Y61.k
    D G0();

    void s1();
}
