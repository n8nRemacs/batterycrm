package com.avito.android.wallet.pin.impl.creation.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.H0;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.r;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WalletPinCreationState.kt */
@H0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/a;", "", "a", "b", "c", "d", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/a$a;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/a$b;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/a$c;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/a$d;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface a {

    /* compiled from: WalletPinCreationState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/a$a;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/a;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.wallet.pin.impl.creation.mvi.entity.a$a, reason: collision with other inner class name */
    public static final /* data */ class C10197a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f328662a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final AttributedText f328663b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final AttributedText f328664c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final AttributedText f328665d;

        /* renamed from: e, reason: collision with root package name */
        public final int f328666e;

        /* renamed from: f, reason: collision with root package name */
        public final int f328667f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final r f328668g;

        public C10197a(@k String str, @l AttributedText attributedText, @l AttributedText attributedText2, @l AttributedText attributedText3, int i12, int i13, @l r rVar) {
            this.f328662a = str;
            this.f328663b = attributedText;
            this.f328664c = attributedText2;
            this.f328665d = attributedText3;
            this.f328666e = i12;
            this.f328667f = i13;
            this.f328668g = rVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10197a)) {
                return false;
            }
            C10197a c10197a = (C10197a) obj;
            return L.f(this.f328662a, c10197a.f328662a) && L.f(this.f328663b, c10197a.f328663b) && L.f(this.f328664c, c10197a.f328664c) && L.f(this.f328665d, c10197a.f328665d) && this.f328666e == c10197a.f328666e && this.f328667f == c10197a.f328667f && L.f(this.f328668g, c10197a.f328668g);
        }

        public final int hashCode() {
            int iHashCode = this.f328662a.hashCode() * 31;
            AttributedText attributedText = this.f328663b;
            int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            AttributedText attributedText2 = this.f328664c;
            int iHashCode3 = (iHashCode2 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
            AttributedText attributedText3 = this.f328665d;
            int iE2 = androidx.appcompat.app.r.e(this.f328667f, androidx.appcompat.app.r.e(this.f328666e, (iHashCode3 + (attributedText3 == null ? 0 : attributedText3.hashCode())) * 31, 31), 31);
            r rVar = this.f328668g;
            return iE2 + (rVar != null ? rVar.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "Content(header=" + this.f328662a + ", title=" + this.f328663b + ", subtitle=" + this.f328664c + ", errorText=" + this.f328665d + ", pinLength=" + this.f328666e + ", enteredPinLength=" + this.f328667f + ", perfTrackerParams=" + this.f328668g + ')';
        }
    }

    /* compiled from: WalletPinCreationState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/a$b;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/a;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f328669a = new b();
    }

    /* compiled from: WalletPinCreationState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/a$c;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/a;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f328670a = new c();
    }

    /* compiled from: WalletPinCreationState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/a$d;", "Lcom/avito/android/wallet/pin/impl/creation/mvi/entity/a;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f328671a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f328672b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f328673c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f328674d;

        public d(@k String str, @k String str2, @l String str3, @k String str4) {
            this.f328671a = str;
            this.f328672b = str2;
            this.f328673c = str3;
            this.f328674d = str4;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f328671a, dVar.f328671a) && L.f(this.f328672b, dVar.f328672b) && L.f(this.f328673c, dVar.f328673c) && L.f(this.f328674d, dVar.f328674d);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f328671a.hashCode() * 31, 31, this.f328672b);
            String str = this.f328673c;
            return this.f328674d.hashCode() + ((iD2 + (str == null ? 0 : str.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("WalletNotWorking(headerTitle=");
            sb2.append(this.f328671a);
            sb2.append(", title=");
            sb2.append(this.f328672b);
            sb2.append(", subtitle=");
            sb2.append(this.f328673c);
            sb2.append(", buttonText=");
            return C22026a.c(sb2, this.f328674d, ')');
        }
    }
}
