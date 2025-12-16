package com.avito.android.wallet.pin.impl.verification.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.H0;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.r;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WalletPinVerificationState.kt */
@H0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/a;", "", "a", "b", "c", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/a$a;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/a$b;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/a$c;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface a {

    /* compiled from: WalletPinVerificationState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/a$a;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/a;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.wallet.pin.impl.verification.mvi.entity.a$a, reason: collision with other inner class name */
    public static final /* data */ class C10227a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f329308a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final AttributedText f329309b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final AttributedText f329310c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final AttributedText f329311d;

        /* renamed from: e, reason: collision with root package name */
        public final int f329312e;

        /* renamed from: f, reason: collision with root package name */
        public final int f329313f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f329314g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final String f329315h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final r f329316i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f329317j;

        public C10227a(@k String str, @l AttributedText attributedText, @l AttributedText attributedText2, @l AttributedText attributedText3, int i12, int i13, boolean z12, @l String str2, @l r rVar, boolean z13) {
            this.f329308a = str;
            this.f329309b = attributedText;
            this.f329310c = attributedText2;
            this.f329311d = attributedText3;
            this.f329312e = i12;
            this.f329313f = i13;
            this.f329314g = z12;
            this.f329315h = str2;
            this.f329316i = rVar;
            this.f329317j = z13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10227a)) {
                return false;
            }
            C10227a c10227a = (C10227a) obj;
            return L.f(this.f329308a, c10227a.f329308a) && L.f(this.f329309b, c10227a.f329309b) && L.f(this.f329310c, c10227a.f329310c) && L.f(this.f329311d, c10227a.f329311d) && this.f329312e == c10227a.f329312e && this.f329313f == c10227a.f329313f && this.f329314g == c10227a.f329314g && L.f(this.f329315h, c10227a.f329315h) && L.f(this.f329316i, c10227a.f329316i) && this.f329317j == c10227a.f329317j;
        }

        public final int hashCode() {
            int iHashCode = this.f329308a.hashCode() * 31;
            AttributedText attributedText = this.f329309b;
            int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            AttributedText attributedText2 = this.f329310c;
            int iHashCode3 = (iHashCode2 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
            AttributedText attributedText3 = this.f329311d;
            int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.e(this.f329313f, androidx.appcompat.app.r.e(this.f329312e, (iHashCode3 + (attributedText3 == null ? 0 : attributedText3.hashCode())) * 31, 31), 31), 31, this.f329314g);
            String str = this.f329315h;
            int iHashCode4 = (i12 + (str == null ? 0 : str.hashCode())) * 31;
            r rVar = this.f329316i;
            return Boolean.hashCode(this.f329317j) + ((iHashCode4 + (rVar != null ? rVar.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(header=");
            sb2.append(this.f329308a);
            sb2.append(", title=");
            sb2.append(this.f329309b);
            sb2.append(", subtitle=");
            sb2.append(this.f329310c);
            sb2.append(", errorText=");
            sb2.append(this.f329311d);
            sb2.append(", pinLength=");
            sb2.append(this.f329312e);
            sb2.append(", enteredPinLength=");
            sb2.append(this.f329313f);
            sb2.append(", showDeleteButton=");
            sb2.append(this.f329314g);
            sb2.append(", recoverPinButtonTitle=");
            sb2.append(this.f329315h);
            sb2.append(", perfTrackerParams=");
            sb2.append(this.f329316i);
            sb2.append(", showBiometryButton=");
            return androidx.appcompat.app.r.x(sb2, this.f329317j, ')');
        }
    }

    /* compiled from: WalletPinVerificationState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/a$b;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/a;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f329318a = new b();
    }

    /* compiled from: WalletPinVerificationState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/a$c;", "Lcom/avito/android/wallet/pin/impl/verification/mvi/entity/a;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f329319a = new c();
    }
}
