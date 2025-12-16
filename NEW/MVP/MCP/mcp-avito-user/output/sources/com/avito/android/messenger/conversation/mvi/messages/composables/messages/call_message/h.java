package com.avito.android.messenger.conversation.mvi.messages.composables.messages.call_message;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import com.akita.compose.foundation.p;
import j.T;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: OldCallMessageData.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/call_message/h;", "", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class h {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f192241a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f192242b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final p f192243c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final a f192244d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f192245e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Integer f192246f;

    /* compiled from: OldCallMessageData.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/call_message/h$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f192247a;

        /* renamed from: b, reason: collision with root package name */
        public final int f192248b;

        public a(@T int i12, int i13) {
            this.f192247a = i12;
            this.f192248b = i13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f192247a == aVar.f192247a && this.f192248b == aVar.f192248b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f192248b) + (Integer.hashCode(this.f192247a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Duration(pluralRes=");
            sb2.append(this.f192247a);
            sb2.append(", value=");
            return r.t(sb2, this.f192248b, ')');
        }
    }

    public h() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.f192241a, hVar.f192241a) && L.f(this.f192242b, hVar.f192242b) && L.f(this.f192243c, hVar.f192243c) && L.f(this.f192244d, hVar.f192244d) && L.f(this.f192245e, hVar.f192245e) && L.f(this.f192246f, hVar.f192246f);
    }

    public final int hashCode() {
        String str = this.f192241a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f192242b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        p pVar = this.f192243c;
        int iHashCode3 = (iHashCode2 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        a aVar = this.f192244d;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str2 = this.f192245e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.f192246f;
        return iHashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OldCallMessageData(text=");
        sb2.append(this.f192241a);
        sb2.append(", textRes=");
        sb2.append(this.f192242b);
        sb2.append(", textColor=");
        sb2.append(this.f192243c);
        sb2.append(", duration=");
        sb2.append(this.f192244d);
        sb2.append(", title=");
        sb2.append(this.f192245e);
        sb2.append(", iconRes=");
        return s.j(sb2, this.f192246f, ')');
    }

    public h(String str, Integer num, p pVar, a aVar, String str2, Integer num2, int i12, C42822w c42822w) {
        str = (i12 & 1) != 0 ? null : str;
        num = (i12 & 2) != 0 ? null : num;
        pVar = (i12 & 4) != 0 ? null : pVar;
        aVar = (i12 & 8) != 0 ? null : aVar;
        str2 = (i12 & 16) != 0 ? null : str2;
        num2 = (i12 & 32) != 0 ? null : num2;
        this.f192241a = str;
        this.f192242b = num;
        this.f192243c = pVar;
        this.f192244d = aVar;
        this.f192245e = str2;
        this.f192246f = num2;
    }
}
