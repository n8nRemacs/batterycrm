package com.avito.android.messenger.conversation.mvi.menu;

import androidx.compose.runtime.internal.P;
import arrow.core.X0;
import arrow.core.Y0;
import com.avito.android.analytics.InterfaceC28464o;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.ActionConfirmation;
import com.avito.android.remote.model.text.AttributedText;
import j.InterfaceC42165v;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;

/* compiled from: ChannelMenuView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/menu/t;", "Lcom/avito/android/mvi/e;", "Lcom/avito/android/messenger/conversation/mvi/menu/t$e;", "b", "c", "d", "e", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface t extends com.avito.android.mvi.e<e> {

    /* compiled from: ChannelMenuView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: ChannelMenuView.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/menu/t$b;", "", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Y0<d> f191505a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<c> f191506b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Y41.l<Integer, G0> f191507c;

        /* compiled from: ChannelMenuView.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a extends N implements Y41.l<Integer, G0> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f191508l = new a();

            public a() {
                super(1);
            }

            @Override // Y41.l
            public final /* bridge */ /* synthetic */ G0 invoke(Integer num) {
                num.intValue();
                return G0.f406611a;
            }
        }

        /* compiled from: ChannelMenuView.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/menu/t$b$b;", "Lcom/avito/android/messenger/conversation/mvi/menu/t$b;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.menu.t$b$b, reason: collision with other inner class name */
        public static final class C5658b extends b {

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public static final C5658b f191509d = new C5658b();

            public C5658b() {
                super(null, null, null, 7, null);
            }
        }

        public b() {
            this(null, null, null, 7, null);
        }

        @Y61.k
        public final String toString() {
            return C43066x.F0("Menu(\n                    |   profile=" + this.f191505a + ",\n                    |   actions=" + this.f191506b + "\n                    |)");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(@Y61.k Y0<? extends d> y02, @Y61.k List<c> list, @Y61.k Y41.l<? super Integer, G0> lVar) {
            this.f191505a = y02;
            this.f191506b = list;
            this.f191507c = lVar;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public b(Y0 y02, List list, Y41.l lVar, int i12, C42822w c42822w) {
            if ((i12 & 1) != 0) {
                Y0.f56266a.getClass();
                y02 = X0.f56264b;
            }
            this(y02, (i12 & 2) != 0 ? C42784z0.f406748b : list, (i12 & 4) != 0 ? a.f191508l : lVar);
        }
    }

    /* compiled from: ChannelMenuView.kt */
    @P
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/menu/t$d;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/messenger/conversation/mvi/menu/t$d$a;", "Lcom/avito/android/messenger/conversation/mvi/menu/t$d$b;", "Lcom/avito/android/messenger/conversation/mvi/menu/t$d$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class d {

        /* compiled from: ChannelMenuView.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/menu/t$d$a;", "Lcom/avito/android/messenger/conversation/mvi/menu/t$d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final String f191516a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final AttributedText f191517b;

            public a(@Y61.l String str, @Y61.l AttributedText attributedText) {
                super(null);
                this.f191516a = str;
                this.f191517b = attributedText;
            }

            @Override // com.avito.android.messenger.conversation.mvi.menu.t.d
            @Y61.l
            /* renamed from: a */
            public final Action getF191523b() {
                return null;
            }

            @Override // com.avito.android.messenger.conversation.mvi.menu.t.d
            @Y61.l
            /* renamed from: b */
            public final String getF191524c() {
                return null;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f191516a, aVar.f191516a) && L.f(this.f191517b, aVar.f191517b);
            }

            public final int hashCode() {
                String str = this.f191516a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                AttributedText attributedText = this.f191517b;
                return iHashCode + (attributedText != null ? attributedText.hashCode() : 0);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Details(title=");
                sb2.append(this.f191516a);
                sb2.append(", text=");
                return com.avito.android.actions_sheet.a.w(sb2, this.f191517b, ')');
            }
        }

        /* compiled from: ChannelMenuView.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/menu/t$d$b;", "Lcom/avito/android/messenger/conversation/mvi/menu/t$d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f191518a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f191519b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final String f191520c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.l
            public final AttributedText f191521d;

            public b(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l AttributedText attributedText) {
                super(null);
                this.f191518a = str;
                this.f191519b = str2;
                this.f191520c = str3;
                this.f191521d = attributedText;
            }

            @Override // com.avito.android.messenger.conversation.mvi.menu.t.d
            @Y61.l
            /* renamed from: a */
            public final Action getF191523b() {
                return null;
            }

            @Override // com.avito.android.messenger.conversation.mvi.menu.t.d
            @Y61.l
            /* renamed from: b */
            public final String getF191524c() {
                return null;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f191518a, bVar.f191518a) && L.f(this.f191519b, bVar.f191519b) && L.f(this.f191520c, bVar.f191520c) && L.f(this.f191521d, bVar.f191521d);
            }

            public final int hashCode() {
                int iD2 = androidx.compose.foundation.H.d(this.f191518a.hashCode() * 31, 31, this.f191519b);
                String str = this.f191520c;
                int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
                AttributedText attributedText = this.f191521d;
                return iHashCode + (attributedText != null ? attributedText.hashCode() : 0);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("System(name=");
                sb2.append(this.f191518a);
                sb2.append(", description=");
                sb2.append(this.f191519b);
                sb2.append(", title=");
                sb2.append(this.f191520c);
                sb2.append(", text=");
                return com.avito.android.actions_sheet.a.w(sb2, this.f191521d, ')');
            }
        }

        /* compiled from: ChannelMenuView.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/menu/t$d$c;", "Lcom/avito/android/messenger/conversation/mvi/menu/t$d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c extends d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final Image f191522a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final Action f191523b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final String f191524c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.l
            public final String f191525d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.l
            public final AttributedText f191526e;

            public c(@Y61.l Image image, @Y61.l Action action, @Y61.l String str, @Y61.l String str2, @Y61.l AttributedText attributedText) {
                super(null);
                this.f191522a = image;
                this.f191523b = action;
                this.f191524c = str;
                this.f191525d = str2;
                this.f191526e = attributedText;
            }

            @Override // com.avito.android.messenger.conversation.mvi.menu.t.d
            @Y61.l
            /* renamed from: a, reason: from getter */
            public final Action getF191523b() {
                return this.f191523b;
            }

            @Override // com.avito.android.messenger.conversation.mvi.menu.t.d
            @Y61.l
            /* renamed from: b, reason: from getter */
            public final String getF191524c() {
                return this.f191524c;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return L.f(this.f191522a, cVar.f191522a) && L.f(this.f191523b, cVar.f191523b) && L.f(this.f191524c, cVar.f191524c) && L.f(this.f191525d, cVar.f191525d) && L.f(this.f191526e, cVar.f191526e);
            }

            public final int hashCode() {
                Image image = this.f191522a;
                int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
                Action action = this.f191523b;
                int iHashCode2 = (iHashCode + (action == null ? 0 : action.hashCode())) * 31;
                String str = this.f191524c;
                int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f191525d;
                int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
                AttributedText attributedText = this.f191526e;
                return iHashCode4 + (attributedText != null ? attributedText.hashCode() : 0);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("User(avatar=");
                sb2.append(this.f191522a);
                sb2.append(", action=");
                sb2.append(this.f191523b);
                sb2.append(", userId=");
                sb2.append(this.f191524c);
                sb2.append(", title=");
                sb2.append(this.f191525d);
                sb2.append(", text=");
                return com.avito.android.actions_sheet.a.w(sb2, this.f191526e, ')');
            }
        }

        public /* synthetic */ d(C42822w c42822w) {
            this();
        }

        @Y61.l
        /* renamed from: a */
        public abstract Action getF191523b();

        @Y61.l
        /* renamed from: b */
        public abstract String getF191524c();

        public d() {
        }
    }

    /* compiled from: ChannelMenuView.kt */
    @P
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/menu/t$e;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/messenger/conversation/mvi/menu/t$e$a;", "Lcom/avito/android/messenger/conversation/mvi/menu/t$e$b;", "Lcom/avito/android/messenger/conversation/mvi/menu/t$e$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class e {

        /* compiled from: ChannelMenuView.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/menu/t$e$a;", "Lcom/avito/android/messenger/conversation/mvi/menu/t$e;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends e {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final a f191527a = new a();

            public a() {
                super(null);
            }

            @Override // com.avito.android.messenger.conversation.mvi.menu.t.e
            @Y61.k
            /* renamed from: a */
            public final b getF191530a() {
                return b.C5658b.f191509d;
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1867524109;
            }

            @Y61.k
            public final String toString() {
                return "Empty";
            }
        }

        /* compiled from: ChannelMenuView.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/menu/t$e$b;", "Lcom/avito/android/messenger/conversation/mvi/menu/t$e;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends e {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final b f191528a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f191529b;

            public b(@Y61.k b bVar, boolean z12) {
                super(null);
                this.f191528a = bVar;
                this.f191529b = z12;
            }

            @Y61.k
            public static b b(@Y61.k b bVar, boolean z12) {
                return new b(bVar, z12);
            }

            @Override // com.avito.android.messenger.conversation.mvi.menu.t.e
            @Y61.k
            /* renamed from: a, reason: from getter */
            public final b getF191530a() {
                return this.f191528a;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f191528a, bVar.f191528a) && this.f191529b == bVar.f191529b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f191529b) + (this.f191528a.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Hidden(menu=");
                sb2.append(this.f191528a);
                sb2.append(", canBlockWithReasons=");
                return androidx.appcompat.app.r.x(sb2, this.f191529b, ')');
            }
        }

        /* compiled from: ChannelMenuView.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/menu/t$e$c;", "Lcom/avito/android/messenger/conversation/mvi/menu/t$e;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c extends e {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final b f191530a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f191531b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final Y41.a<G0> f191532c;

            public c(@Y61.k b bVar, boolean z12, @Y61.k Y41.a<G0> aVar) {
                super(null);
                this.f191530a = bVar;
                this.f191531b = z12;
                this.f191532c = aVar;
            }

            public static c b(c cVar, b bVar, boolean z12) {
                return new c(bVar, z12, cVar.f191532c);
            }

            @Override // com.avito.android.messenger.conversation.mvi.menu.t.e
            @Y61.k
            /* renamed from: a, reason: from getter */
            public final b getF191530a() {
                return this.f191530a;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return L.f(this.f191530a, cVar.f191530a) && this.f191531b == cVar.f191531b && L.f(this.f191532c, cVar.f191532c);
            }

            public final int hashCode() {
                return this.f191532c.hashCode() + androidx.appcompat.app.r.i(this.f191530a.hashCode() * 31, 31, this.f191531b);
            }

            @Y61.k
            public final String toString() {
                return "State.Shown(menu = " + this.f191530a + ')';
            }
        }

        public /* synthetic */ e(C42822w c42822w) {
            this();
        }

        @Y61.k
        /* renamed from: a */
        public abstract b getF191530a();

        public e() {
        }
    }

    /* compiled from: ChannelMenuView.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/menu/t$c;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f191510a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Integer f191511b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final ActionConfirmation f191512c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final InterfaceC28464o f191513d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final Integer f191514e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final DeepLink f191515f;

        public c(@Y61.k String str, @InterfaceC42165v @Y61.l Integer num, @Y61.l ActionConfirmation actionConfirmation, @Y61.l InterfaceC28464o interfaceC28464o, @InterfaceC42165v @Y61.l Integer num2, @Y61.k DeepLink deepLink) {
            this.f191510a = str;
            this.f191511b = num;
            this.f191512c = actionConfirmation;
            this.f191513d = interfaceC28464o;
            this.f191514e = num2;
            this.f191515f = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f191510a, cVar.f191510a) && L.f(this.f191511b, cVar.f191511b) && L.f(this.f191512c, cVar.f191512c) && L.f(this.f191513d, cVar.f191513d) && L.f(this.f191514e, cVar.f191514e) && L.f(this.f191515f, cVar.f191515f);
        }

        public final int hashCode() {
            int iHashCode = this.f191510a.hashCode() * 31;
            Integer num = this.f191511b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            ActionConfirmation actionConfirmation = this.f191512c;
            int iHashCode3 = (iHashCode2 + (actionConfirmation == null ? 0 : actionConfirmation.hashCode())) * 31;
            InterfaceC28464o interfaceC28464o = this.f191513d;
            int iHashCode4 = (iHashCode3 + (interfaceC28464o == null ? 0 : interfaceC28464o.hashCode())) * 31;
            Integer num2 = this.f191514e;
            return this.f191515f.hashCode() + ((iHashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MenuAction(title=");
            sb2.append(this.f191510a);
            sb2.append(", drawableId=");
            sb2.append(this.f191511b);
            sb2.append(", confirmation=");
            sb2.append(this.f191512c);
            sb2.append(", analyticEvent=");
            sb2.append(this.f191513d);
            sb2.append(", labelIconId=");
            sb2.append(this.f191514e);
            sb2.append(", deepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f191515f, ')');
        }

        public /* synthetic */ c(String str, Integer num, ActionConfirmation actionConfirmation, InterfaceC28464o interfaceC28464o, Integer num2, DeepLink deepLink, int i12, C42822w c42822w) {
            this(str, num, actionConfirmation, (i12 & 8) != 0 ? null : interfaceC28464o, (i12 & 16) != 0 ? null : num2, deepLink);
        }
    }
}
