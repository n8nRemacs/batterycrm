package com.avito.android.messenger.blacklist_reasons.list_items;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BlacklistReasonsListItem.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/list_items/a;", "LTV0/a;", "a", "b", "c", "Lcom/avito/android/messenger/blacklist_reasons/list_items/a$a;", "Lcom/avito/android/messenger/blacklist_reasons/list_items/a$b;", "Lcom/avito/android/messenger/blacklist_reasons/list_items/a$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a extends TV0.a {

    /* compiled from: BlacklistReasonsListItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/list_items/a$a;", "Lcom/avito/android/messenger/blacklist_reasons/list_items/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.blacklist_reasons.list_items.a$a, reason: collision with other inner class name */
    public static final /* data */ class C5476a implements a {

        /* renamed from: b, reason: collision with root package name */
        public final long f186614b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f186615c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f186616d;

        public C5476a(@Y61.k String str, boolean z12, long j12) {
            this.f186614b = j12;
            this.f186615c = str;
            this.f186616d = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5476a)) {
                return false;
            }
            C5476a c5476a = (C5476a) obj;
            return this.f186614b == c5476a.f186614b && L.f(this.f186615c, c5476a.f186615c) && this.f186616d == c5476a.f186616d;
        }

        @Override // TV0.a
        /* renamed from: getId, reason: from getter */
        public final long getF189215e() {
            return this.f186614b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f186616d) + H.d(Long.hashCode(this.f186614b) * 31, 31, this.f186615c);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Reason(id=");
            sb2.append(this.f186614b);
            sb2.append(", name=");
            sb2.append(this.f186615c);
            sb2.append(", isSelected=");
            return androidx.appcompat.app.r.x(sb2, this.f186616d, ')');
        }
    }

    /* compiled from: BlacklistReasonsListItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/list_items/a$b;", "Lcom/avito/android/messenger/blacklist_reasons/list_items/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final CharSequence f186617b;

        public b(@Y61.k CharSequence charSequence) {
            this.f186617b = charSequence;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f186617b, ((b) obj).f186617b);
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF189215e() {
            return -2L;
        }

        public final int hashCode() {
            return this.f186617b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.r(new StringBuilder("ReasonTextInput(text="), this.f186617b, ')');
        }
    }

    /* compiled from: BlacklistReasonsListItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/list_items/a$c;", "Lcom/avito/android/messenger/blacklist_reasons/list_items/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f186618b;

        public c(@Y61.k String str) {
            this.f186618b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f186618b, ((c) obj).f186618b);
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF189215e() {
            return -1L;
        }

        public final int hashCode() {
            return this.f186618b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("Title(text="), this.f186618b, ')');
        }
    }
}
