package com.avito.android.messenger.conversation.mvi.message_menu;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MessageContextData.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/d;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "Lcom/avito/android/messenger/conversation/mvi/message_menu/d$a;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/d$b;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/d$c;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/d$d;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/d$e;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/d$f;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/d$g;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/d$h;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/d$i;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/d$j;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface d {

    /* compiled from: MessageContextData.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/d$d;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.message_menu.d$d, reason: collision with other inner class name */
    public static final /* data */ class C5661d implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Y81.a f191582a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.messenger.conversation.mvi.message_menu.h f191583b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f191584c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f191585d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final Integer f191586e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f191587f;

        public C5661d(Y81.a aVar, com.avito.android.messenger.conversation.mvi.message_menu.h hVar, String str, boolean z12, Integer num, boolean z13, int i12, C42822w c42822w) {
            z12 = (i12 & 8) != 0 ? false : z12;
            num = (i12 & 16) != 0 ? null : num;
            z13 = (i12 & 32) != 0 ? false : z13;
            this.f191582a = aVar;
            this.f191583b = hVar;
            this.f191584c = str;
            this.f191585d = z12;
            this.f191586e = num;
            this.f191587f = z13;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        /* renamed from: a, reason: from getter */
        public final boolean getF191621e() {
            return this.f191587f;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        /* renamed from: b, reason: from getter */
        public final boolean getF191619c() {
            return this.f191585d;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        @Y61.k
        /* renamed from: c, reason: from getter */
        public final com.avito.android.messenger.conversation.mvi.message_menu.h getF191618b() {
            return this.f191583b;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        @Y61.l
        /* renamed from: d, reason: from getter */
        public final Integer getF191620d() {
            return this.f191586e;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5661d)) {
                return false;
            }
            C5661d c5661d = (C5661d) obj;
            return L.f(this.f191582a, c5661d.f191582a) && L.f(this.f191583b, c5661d.f191583b) && L.f(this.f191584c, c5661d.f191584c) && this.f191585d == c5661d.f191585d && L.f(this.f191586e, c5661d.f191586e) && this.f191587f == c5661d.f191587f;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        @Y61.k
        /* renamed from: getConfig, reason: from getter */
        public final Y81.a getF191617a() {
            return this.f191582a;
        }

        public final int hashCode() {
            int i12 = androidx.appcompat.app.r.i(H.d((this.f191583b.hashCode() + (Long.hashCode(this.f191582a.f19367a) * 31)) * 31, 31, this.f191584c), 31, this.f191585d);
            Integer num = this.f191586e;
            return Boolean.hashCode(this.f191587f) + ((i12 + (num == null ? 0 : num.hashCode())) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Link(config=");
            sb2.append(this.f191582a);
            sb2.append(", messageData=");
            sb2.append(this.f191583b);
            sb2.append(", url=");
            sb2.append(this.f191584c);
            sb2.append(", allowQuickReplies=");
            sb2.append(this.f191585d);
            sb2.append(", chunkIndex=");
            sb2.append(this.f191586e);
            sb2.append(", allowQuoteReplies=");
            return androidx.appcompat.app.r.x(sb2, this.f191587f, ')');
        }
    }

    /* compiled from: MessageContextData.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/d$e;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Y81.a f191588a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.messenger.conversation.mvi.message_menu.h f191589b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f191590c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f191591d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final Integer f191592e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f191593f;

        public e(Y81.a aVar, com.avito.android.messenger.conversation.mvi.message_menu.h hVar, String str, boolean z12, Integer num, boolean z13, int i12, C42822w c42822w) {
            z12 = (i12 & 8) != 0 ? false : z12;
            num = (i12 & 16) != 0 ? null : num;
            z13 = (i12 & 32) != 0 ? false : z13;
            this.f191588a = aVar;
            this.f191589b = hVar;
            this.f191590c = str;
            this.f191591d = z12;
            this.f191592e = num;
            this.f191593f = z13;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        /* renamed from: a, reason: from getter */
        public final boolean getF191621e() {
            return this.f191593f;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        /* renamed from: b, reason: from getter */
        public final boolean getF191619c() {
            return this.f191591d;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        @Y61.k
        /* renamed from: c, reason: from getter */
        public final com.avito.android.messenger.conversation.mvi.message_menu.h getF191618b() {
            return this.f191589b;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        @Y61.l
        /* renamed from: d, reason: from getter */
        public final Integer getF191620d() {
            return this.f191592e;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f191588a, eVar.f191588a) && L.f(this.f191589b, eVar.f191589b) && L.f(this.f191590c, eVar.f191590c) && this.f191591d == eVar.f191591d && L.f(this.f191592e, eVar.f191592e) && this.f191593f == eVar.f191593f;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        @Y61.k
        /* renamed from: getConfig, reason: from getter */
        public final Y81.a getF191617a() {
            return this.f191588a;
        }

        public final int hashCode() {
            int i12 = androidx.appcompat.app.r.i(H.d((this.f191589b.hashCode() + (Long.hashCode(this.f191588a.f19367a) * 31)) * 31, 31, this.f191590c), 31, this.f191591d);
            Integer num = this.f191592e;
            return Boolean.hashCode(this.f191593f) + ((i12 + (num == null ? 0 : num.hashCode())) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LinkInText(config=");
            sb2.append(this.f191588a);
            sb2.append(", messageData=");
            sb2.append(this.f191589b);
            sb2.append(", url=");
            sb2.append(this.f191590c);
            sb2.append(", allowQuickReplies=");
            sb2.append(this.f191591d);
            sb2.append(", chunkIndex=");
            sb2.append(this.f191592e);
            sb2.append(", allowQuoteReplies=");
            return androidx.appcompat.app.r.x(sb2, this.f191593f, ')');
        }
    }

    /* compiled from: MessageContextData.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/d$f;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Y81.a f191594a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.messenger.conversation.mvi.message_menu.h f191595b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f191596c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final Integer f191597d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f191598e;

        public f(Y81.a aVar, com.avito.android.messenger.conversation.mvi.message_menu.h hVar, boolean z12, Integer num, boolean z13, int i12, C42822w c42822w) {
            z12 = (i12 & 4) != 0 ? false : z12;
            num = (i12 & 8) != 0 ? null : num;
            z13 = (i12 & 16) != 0 ? false : z13;
            this.f191594a = aVar;
            this.f191595b = hVar;
            this.f191596c = z12;
            this.f191597d = num;
            this.f191598e = z13;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        /* renamed from: a, reason: from getter */
        public final boolean getF191621e() {
            return this.f191598e;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        /* renamed from: b, reason: from getter */
        public final boolean getF191619c() {
            return this.f191596c;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        @Y61.k
        /* renamed from: c, reason: from getter */
        public final com.avito.android.messenger.conversation.mvi.message_menu.h getF191618b() {
            return this.f191595b;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        @Y61.l
        /* renamed from: d, reason: from getter */
        public final Integer getF191620d() {
            return this.f191597d;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f191594a, fVar.f191594a) && L.f(this.f191595b, fVar.f191595b) && this.f191596c == fVar.f191596c && L.f(this.f191597d, fVar.f191597d) && this.f191598e == fVar.f191598e;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        @Y61.k
        /* renamed from: getConfig, reason: from getter */
        public final Y81.a getF191617a() {
            return this.f191594a;
        }

        public final int hashCode() {
            int i12 = androidx.appcompat.app.r.i((this.f191595b.hashCode() + (Long.hashCode(this.f191594a.f19367a) * 31)) * 31, 31, this.f191596c);
            Integer num = this.f191597d;
            return Boolean.hashCode(this.f191598e) + ((i12 + (num == null ? 0 : num.hashCode())) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LocalImage(config=");
            sb2.append(this.f191594a);
            sb2.append(", messageData=");
            sb2.append(this.f191595b);
            sb2.append(", allowQuickReplies=");
            sb2.append(this.f191596c);
            sb2.append(", chunkIndex=");
            sb2.append(this.f191597d);
            sb2.append(", allowQuoteReplies=");
            return androidx.appcompat.app.r.x(sb2, this.f191598e, ')');
        }
    }

    /* compiled from: MessageContextData.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/d$j;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Y81.a f191617a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.messenger.conversation.mvi.message_menu.h f191618b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f191619c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final Integer f191620d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f191621e;

        public j(Y81.a aVar, com.avito.android.messenger.conversation.mvi.message_menu.h hVar, boolean z12, Integer num, boolean z13, int i12, C42822w c42822w) {
            z12 = (i12 & 4) != 0 ? false : z12;
            num = (i12 & 8) != 0 ? null : num;
            z13 = (i12 & 16) != 0 ? false : z13;
            this.f191617a = aVar;
            this.f191618b = hVar;
            this.f191619c = z12;
            this.f191620d = num;
            this.f191621e = z13;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        /* renamed from: a, reason: from getter */
        public final boolean getF191621e() {
            return this.f191621e;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        /* renamed from: b, reason: from getter */
        public final boolean getF191619c() {
            return this.f191619c;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        @Y61.k
        /* renamed from: c, reason: from getter */
        public final com.avito.android.messenger.conversation.mvi.message_menu.h getF191618b() {
            return this.f191618b;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        @Y61.l
        /* renamed from: d, reason: from getter */
        public final Integer getF191620d() {
            return this.f191620d;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return L.f(this.f191617a, jVar.f191617a) && L.f(this.f191618b, jVar.f191618b) && this.f191619c == jVar.f191619c && L.f(this.f191620d, jVar.f191620d) && this.f191621e == jVar.f191621e;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        @Y61.k
        /* renamed from: getConfig, reason: from getter */
        public final Y81.a getF191617a() {
            return this.f191617a;
        }

        public final int hashCode() {
            int i12 = androidx.appcompat.app.r.i((this.f191618b.hashCode() + (Long.hashCode(this.f191617a.f19367a) * 31)) * 31, 31, this.f191619c);
            Integer num = this.f191620d;
            return Boolean.hashCode(this.f191621e) + ((i12 + (num == null ? 0 : num.hashCode())) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Voice(config=");
            sb2.append(this.f191617a);
            sb2.append(", messageData=");
            sb2.append(this.f191618b);
            sb2.append(", allowQuickReplies=");
            sb2.append(this.f191619c);
            sb2.append(", chunkIndex=");
            sb2.append(this.f191620d);
            sb2.append(", allowQuoteReplies=");
            return androidx.appcompat.app.r.x(sb2, this.f191621e, ')');
        }
    }

    /* renamed from: a */
    boolean getF191621e();

    /* renamed from: b */
    boolean getF191619c();

    @Y61.k
    /* renamed from: c */
    com.avito.android.messenger.conversation.mvi.message_menu.h getF191618b();

    @Y61.l
    /* renamed from: d */
    Integer getF191620d();

    @Y61.k
    /* renamed from: getConfig */
    Y81.a getF191617a();

    /* compiled from: MessageContextData.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/d$a;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Y81.a f191564a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.messenger.conversation.mvi.message_menu.h f191565b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f191566c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final Integer f191567d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f191568e;

        public a(@Y61.k Y81.a aVar, @Y61.k com.avito.android.messenger.conversation.mvi.message_menu.h hVar, boolean z12, @Y61.l Integer num, boolean z13) {
            this.f191564a = aVar;
            this.f191565b = hVar;
            this.f191566c = z12;
            this.f191567d = num;
            this.f191568e = z13;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        /* renamed from: a, reason: from getter */
        public final boolean getF191621e() {
            return this.f191568e;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        /* renamed from: b, reason: from getter */
        public final boolean getF191619c() {
            return this.f191566c;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        @Y61.k
        /* renamed from: c, reason: from getter */
        public final com.avito.android.messenger.conversation.mvi.message_menu.h getF191618b() {
            return this.f191565b;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        @Y61.l
        /* renamed from: d, reason: from getter */
        public final Integer getF191620d() {
            return this.f191567d;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f191564a, aVar.f191564a) && L.f(this.f191565b, aVar.f191565b) && this.f191566c == aVar.f191566c && L.f(this.f191567d, aVar.f191567d) && this.f191568e == aVar.f191568e;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        @Y61.k
        /* renamed from: getConfig, reason: from getter */
        public final Y81.a getF191617a() {
            return this.f191564a;
        }

        public final int hashCode() {
            int i12 = androidx.appcompat.app.r.i((this.f191565b.hashCode() + (Long.hashCode(this.f191564a.f19367a) * 31)) * 31, 31, this.f191566c);
            Integer num = this.f191567d;
            return Boolean.hashCode(this.f191568e) + ((i12 + (num == null ? 0 : num.hashCode())) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("File(config=");
            sb2.append(this.f191564a);
            sb2.append(", messageData=");
            sb2.append(this.f191565b);
            sb2.append(", allowQuickReplies=");
            sb2.append(this.f191566c);
            sb2.append(", chunkIndex=");
            sb2.append(this.f191567d);
            sb2.append(", allowQuoteReplies=");
            return androidx.appcompat.app.r.x(sb2, this.f191568e, ')');
        }

        public /* synthetic */ a(Y81.a aVar, com.avito.android.messenger.conversation.mvi.message_menu.h hVar, boolean z12, Integer num, boolean z13, int i12, C42822w c42822w) {
            this(aVar, hVar, (i12 & 4) != 0 ? false : z12, (i12 & 8) != 0 ? null : num, (i12 & 16) != 0 ? false : z13);
        }
    }

    /* compiled from: MessageContextData.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/d$i;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Y81.a f191612a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.messenger.conversation.mvi.message_menu.h f191613b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f191614c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final Integer f191615d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f191616e;

        public i(@Y61.k Y81.a aVar, @Y61.k com.avito.android.messenger.conversation.mvi.message_menu.h hVar, boolean z12, @Y61.l Integer num, boolean z13) {
            this.f191612a = aVar;
            this.f191613b = hVar;
            this.f191614c = z12;
            this.f191615d = num;
            this.f191616e = z13;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        /* renamed from: a, reason: from getter */
        public final boolean getF191621e() {
            return this.f191616e;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        /* renamed from: b, reason: from getter */
        public final boolean getF191619c() {
            return this.f191614c;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        @Y61.k
        /* renamed from: c, reason: from getter */
        public final com.avito.android.messenger.conversation.mvi.message_menu.h getF191618b() {
            return this.f191613b;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        @Y61.l
        /* renamed from: d, reason: from getter */
        public final Integer getF191620d() {
            return this.f191615d;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return L.f(this.f191612a, iVar.f191612a) && L.f(this.f191613b, iVar.f191613b) && this.f191614c == iVar.f191614c && L.f(this.f191615d, iVar.f191615d) && this.f191616e == iVar.f191616e;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        @Y61.k
        /* renamed from: getConfig, reason: from getter */
        public final Y81.a getF191617a() {
            return this.f191612a;
        }

        public final int hashCode() {
            int i12 = androidx.appcompat.app.r.i((this.f191613b.hashCode() + (Long.hashCode(this.f191612a.f19367a) * 31)) * 31, 31, this.f191614c);
            Integer num = this.f191615d;
            return Boolean.hashCode(this.f191616e) + ((i12 + (num == null ? 0 : num.hashCode())) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Video(config=");
            sb2.append(this.f191612a);
            sb2.append(", messageData=");
            sb2.append(this.f191613b);
            sb2.append(", allowQuickReplies=");
            sb2.append(this.f191614c);
            sb2.append(", chunkIndex=");
            sb2.append(this.f191615d);
            sb2.append(", allowQuoteReplies=");
            return androidx.appcompat.app.r.x(sb2, this.f191616e, ')');
        }

        public /* synthetic */ i(Y81.a aVar, com.avito.android.messenger.conversation.mvi.message_menu.h hVar, boolean z12, Integer num, boolean z13, int i12, C42822w c42822w) {
            this(aVar, hVar, (i12 & 4) != 0 ? false : z12, (i12 & 8) != 0 ? null : num, (i12 & 16) != 0 ? false : z13);
        }
    }

    /* compiled from: MessageContextData.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/d$b;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Y81.a f191569a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.messenger.conversation.mvi.message_menu.h f191570b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f191571c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final Integer f191572d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f191573e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f191574f;

        public b(@Y61.k Y81.a aVar, @Y61.k com.avito.android.messenger.conversation.mvi.message_menu.h hVar, @Y61.l Integer num, @Y61.k String str, boolean z12, boolean z13) {
            this.f191569a = aVar;
            this.f191570b = hVar;
            this.f191571c = z12;
            this.f191572d = num;
            this.f191573e = str;
            this.f191574f = z13;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        /* renamed from: a, reason: from getter */
        public final boolean getF191621e() {
            return this.f191574f;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        /* renamed from: b, reason: from getter */
        public final boolean getF191619c() {
            return this.f191571c;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        @Y61.k
        /* renamed from: c, reason: from getter */
        public final com.avito.android.messenger.conversation.mvi.message_menu.h getF191618b() {
            return this.f191570b;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        @Y61.l
        /* renamed from: d, reason: from getter */
        public final Integer getF191620d() {
            return this.f191572d;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f191569a, bVar.f191569a) && L.f(this.f191570b, bVar.f191570b) && this.f191571c == bVar.f191571c && L.f(this.f191572d, bVar.f191572d) && L.f(this.f191573e, bVar.f191573e) && this.f191574f == bVar.f191574f;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        @Y61.k
        /* renamed from: getConfig, reason: from getter */
        public final Y81.a getF191617a() {
            return this.f191569a;
        }

        public final int hashCode() {
            int i12 = androidx.appcompat.app.r.i((this.f191570b.hashCode() + (Long.hashCode(this.f191569a.f19367a) * 31)) * 31, 31, this.f191571c);
            Integer num = this.f191572d;
            return Boolean.hashCode(this.f191574f) + H.d((i12 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f191573e);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Image(config=");
            sb2.append(this.f191569a);
            sb2.append(", messageData=");
            sb2.append(this.f191570b);
            sb2.append(", allowQuickReplies=");
            sb2.append(this.f191571c);
            sb2.append(", chunkIndex=");
            sb2.append(this.f191572d);
            sb2.append(", url=");
            sb2.append(this.f191573e);
            sb2.append(", allowQuoteReplies=");
            return androidx.appcompat.app.r.x(sb2, this.f191574f, ')');
        }

        public /* synthetic */ b(Y81.a aVar, com.avito.android.messenger.conversation.mvi.message_menu.h hVar, boolean z12, Integer num, String str, boolean z13, int i12, C42822w c42822w) {
            this(aVar, hVar, (i12 & 8) != 0 ? null : num, str, (i12 & 4) != 0 ? false : z12, (i12 & 32) != 0 ? false : z13);
        }
    }

    /* compiled from: MessageContextData.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/d$g;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Y81.a f191599a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.messenger.conversation.mvi.message_menu.h f191600b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f191601c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f191602d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final Integer f191603e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f191604f;

        public g(@Y61.k Y81.a aVar, @Y61.k com.avito.android.messenger.conversation.mvi.message_menu.h hVar, @Y61.l Integer num, @Y61.k String str, boolean z12, boolean z13) {
            this.f191599a = aVar;
            this.f191600b = hVar;
            this.f191601c = str;
            this.f191602d = z12;
            this.f191603e = num;
            this.f191604f = z13;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        /* renamed from: a, reason: from getter */
        public final boolean getF191621e() {
            return this.f191604f;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        /* renamed from: b, reason: from getter */
        public final boolean getF191619c() {
            return this.f191602d;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        @Y61.k
        /* renamed from: c, reason: from getter */
        public final com.avito.android.messenger.conversation.mvi.message_menu.h getF191618b() {
            return this.f191600b;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        @Y61.l
        /* renamed from: d, reason: from getter */
        public final Integer getF191620d() {
            return this.f191603e;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f191599a, gVar.f191599a) && L.f(this.f191600b, gVar.f191600b) && L.f(this.f191601c, gVar.f191601c) && this.f191602d == gVar.f191602d && L.f(this.f191603e, gVar.f191603e) && this.f191604f == gVar.f191604f;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        @Y61.k
        /* renamed from: getConfig, reason: from getter */
        public final Y81.a getF191617a() {
            return this.f191599a;
        }

        public final int hashCode() {
            int i12 = androidx.appcompat.app.r.i(H.d((this.f191600b.hashCode() + (Long.hashCode(this.f191599a.f19367a) * 31)) * 31, 31, this.f191601c), 31, this.f191602d);
            Integer num = this.f191603e;
            return Boolean.hashCode(this.f191604f) + ((i12 + (num == null ? 0 : num.hashCode())) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Location(config=");
            sb2.append(this.f191599a);
            sb2.append(", messageData=");
            sb2.append(this.f191600b);
            sb2.append(", address=");
            sb2.append(this.f191601c);
            sb2.append(", allowQuickReplies=");
            sb2.append(this.f191602d);
            sb2.append(", chunkIndex=");
            sb2.append(this.f191603e);
            sb2.append(", allowQuoteReplies=");
            return androidx.appcompat.app.r.x(sb2, this.f191604f, ')');
        }

        public /* synthetic */ g(Y81.a aVar, com.avito.android.messenger.conversation.mvi.message_menu.h hVar, String str, boolean z12, Integer num, boolean z13, int i12, C42822w c42822w) {
            this(aVar, hVar, (i12 & 16) != 0 ? null : num, str, (i12 & 8) != 0 ? false : z12, (i12 & 32) != 0 ? false : z13);
        }
    }

    /* compiled from: MessageContextData.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/d$c;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Y81.a f191575a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.messenger.conversation.mvi.message_menu.h f191576b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f191577c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f191578d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f191579e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final Integer f191580f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f191581g;

        public c(@Y61.k Y81.a aVar, @Y61.k com.avito.android.messenger.conversation.mvi.message_menu.h hVar, @Y61.k String str, @Y61.k String str2, boolean z12, @Y61.l Integer num, boolean z13) {
            this.f191575a = aVar;
            this.f191576b = hVar;
            this.f191577c = str;
            this.f191578d = str2;
            this.f191579e = z12;
            this.f191580f = num;
            this.f191581g = z13;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        /* renamed from: a, reason: from getter */
        public final boolean getF191621e() {
            return this.f191581g;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        /* renamed from: b, reason: from getter */
        public final boolean getF191619c() {
            return this.f191579e;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        @Y61.k
        /* renamed from: c, reason: from getter */
        public final com.avito.android.messenger.conversation.mvi.message_menu.h getF191618b() {
            return this.f191576b;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        @Y61.l
        /* renamed from: d, reason: from getter */
        public final Integer getF191620d() {
            return this.f191580f;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f191575a, cVar.f191575a) && L.f(this.f191576b, cVar.f191576b) && L.f(this.f191577c, cVar.f191577c) && L.f(this.f191578d, cVar.f191578d) && this.f191579e == cVar.f191579e && L.f(this.f191580f, cVar.f191580f) && this.f191581g == cVar.f191581g;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        @Y61.k
        /* renamed from: getConfig, reason: from getter */
        public final Y81.a getF191617a() {
            return this.f191575a;
        }

        public final int hashCode() {
            int i12 = androidx.appcompat.app.r.i(H.d(H.d((this.f191576b.hashCode() + (Long.hashCode(this.f191575a.f19367a) * 31)) * 31, 31, this.f191577c), 31, this.f191578d), 31, this.f191579e);
            Integer num = this.f191580f;
            return Boolean.hashCode(this.f191581g) + ((i12 + (num == null ? 0 : num.hashCode())) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Item(config=");
            sb2.append(this.f191575a);
            sb2.append(", messageData=");
            sb2.append(this.f191576b);
            sb2.append(", itemId=");
            sb2.append(this.f191577c);
            sb2.append(", url=");
            sb2.append(this.f191578d);
            sb2.append(", allowQuickReplies=");
            sb2.append(this.f191579e);
            sb2.append(", chunkIndex=");
            sb2.append(this.f191580f);
            sb2.append(", allowQuoteReplies=");
            return androidx.appcompat.app.r.x(sb2, this.f191581g, ')');
        }

        public /* synthetic */ c(Y81.a aVar, com.avito.android.messenger.conversation.mvi.message_menu.h hVar, String str, String str2, boolean z12, Integer num, boolean z13, int i12, C42822w c42822w) {
            this(aVar, hVar, str, str2, (i12 & 16) != 0 ? false : z12, (i12 & 32) != 0 ? null : num, (i12 & 64) != 0 ? false : z13);
        }
    }

    /* compiled from: MessageContextData.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/d$h;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Y81.a f191605a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.messenger.conversation.mvi.message_menu.h f191606b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f191607c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f191608d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f191609e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final Integer f191610f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f191611g;

        public h(@Y61.k Y81.a aVar, @Y61.k com.avito.android.messenger.conversation.mvi.message_menu.h hVar, @Y61.k String str, boolean z12, boolean z13, @Y61.l Integer num, boolean z14) {
            this.f191605a = aVar;
            this.f191606b = hVar;
            this.f191607c = str;
            this.f191608d = z12;
            this.f191609e = z13;
            this.f191610f = num;
            this.f191611g = z14;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        /* renamed from: a, reason: from getter */
        public final boolean getF191621e() {
            return this.f191611g;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        /* renamed from: b, reason: from getter */
        public final boolean getF191619c() {
            return this.f191609e;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        @Y61.k
        /* renamed from: c, reason: from getter */
        public final com.avito.android.messenger.conversation.mvi.message_menu.h getF191618b() {
            return this.f191606b;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        @Y61.l
        /* renamed from: d, reason: from getter */
        public final Integer getF191620d() {
            return this.f191610f;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return L.f(this.f191605a, hVar.f191605a) && L.f(this.f191606b, hVar.f191606b) && L.f(this.f191607c, hVar.f191607c) && this.f191608d == hVar.f191608d && this.f191609e == hVar.f191609e && L.f(this.f191610f, hVar.f191610f) && this.f191611g == hVar.f191611g;
        }

        @Override // com.avito.android.messenger.conversation.mvi.message_menu.d
        @Y61.k
        /* renamed from: getConfig, reason: from getter */
        public final Y81.a getF191617a() {
            return this.f191605a;
        }

        public final int hashCode() {
            int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(H.d((this.f191606b.hashCode() + (Long.hashCode(this.f191605a.f19367a) * 31)) * 31, 31, this.f191607c), 31, this.f191608d), 31, this.f191609e);
            Integer num = this.f191610f;
            return Boolean.hashCode(this.f191611g) + ((i12 + (num == null ? 0 : num.hashCode())) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Text(config=");
            sb2.append(this.f191605a);
            sb2.append(", messageData=");
            sb2.append(this.f191606b);
            sb2.append(", text=");
            sb2.append(this.f191607c);
            sb2.append(", urlsAreTrusted=");
            sb2.append(this.f191608d);
            sb2.append(", allowQuickReplies=");
            sb2.append(this.f191609e);
            sb2.append(", chunkIndex=");
            sb2.append(this.f191610f);
            sb2.append(", allowQuoteReplies=");
            return androidx.appcompat.app.r.x(sb2, this.f191611g, ')');
        }

        public /* synthetic */ h(Y81.a aVar, com.avito.android.messenger.conversation.mvi.message_menu.h hVar, String str, boolean z12, boolean z13, Integer num, boolean z14, int i12, C42822w c42822w) {
            this(aVar, hVar, str, z12, (i12 & 16) != 0 ? false : z13, (i12 & 32) != 0 ? null : num, (i12 & 64) != 0 ? false : z14);
        }
    }
}
