package com.avito.android.messenger.conversation.mvi.messages.composables.messages.call_message;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.akita.compose.foundation.p;
import j.InterfaceC42165v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CallMessageData.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/call_message/d;", "", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f192229a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f192230b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final p f192231c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f192232d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f192233e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final a f192234f;

    /* compiled from: CallMessageData.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/call_message/d$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f192235a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final p f192236b;

        public a(@InterfaceC42165v int i12, @k p pVar) {
            this.f192235a = i12;
            this.f192236b = pVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f192235a == aVar.f192235a && L.f(this.f192236b, aVar.f192236b);
        }

        public final int hashCode() {
            return this.f192236b.hashCode() + (Integer.hashCode(this.f192235a) * 31);
        }

        @k
        public final String toString() {
            return "SubtitleIcon(iconRes=" + this.f192235a + ", color=" + this.f192236b + ')';
        }
    }

    public d() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f192229a, dVar.f192229a) && L.f(this.f192230b, dVar.f192230b) && L.f(this.f192231c, dVar.f192231c) && L.f(this.f192232d, dVar.f192232d) && L.f(this.f192233e, dVar.f192233e) && L.f(this.f192234f, dVar.f192234f);
    }

    public final int hashCode() {
        String str = this.f192229a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f192230b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        p pVar = this.f192231c;
        int iHashCode3 = (iHashCode2 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        String str2 = this.f192232d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.f192233e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        a aVar = this.f192234f;
        return iHashCode5 + (aVar != null ? aVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "CallMessageData(title=" + this.f192229a + ", titleStringRes=" + this.f192230b + ", titleColor=" + this.f192231c + ", subtitle=" + this.f192232d + ", iconRes=" + this.f192233e + ", subtitleIcon=" + this.f192234f + ')';
    }

    public d(String str, Integer num, p pVar, String str2, Integer num2, a aVar, int i12, C42822w c42822w) {
        str = (i12 & 1) != 0 ? null : str;
        num = (i12 & 2) != 0 ? null : num;
        pVar = (i12 & 4) != 0 ? null : pVar;
        str2 = (i12 & 8) != 0 ? null : str2;
        num2 = (i12 & 16) != 0 ? null : num2;
        aVar = (i12 & 32) != 0 ? null : aVar;
        this.f192229a = str;
        this.f192230b = num;
        this.f192231c = pVar;
        this.f192232d = str2;
        this.f192233e = num2;
        this.f192234f = aVar;
    }
}
