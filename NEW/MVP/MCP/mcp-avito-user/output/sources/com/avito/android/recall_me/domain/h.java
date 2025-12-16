package com.avito.android.recall_me.domain;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.code_confirmation.code_confirmation.SmsCodeConfirmationParams;
import com.avito.android.recall_me.presentation.C34240j;
import com.avito.android.recall_me.presentation.RecallMeParams;
import com.avito.android.recall_me.presentation.items.single_input.SingleInputItem;
import com.avito.android.recall_me.presentation.items.single_input.SingleInputType;
import com.avito.android.remote.ContactInfo;
import com.avito.android.remote.Phone;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Y5;
import com.avito.android.util.rx3.g1;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.L0;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import io.reactivex.rxjava3.internal.operators.single.C42026y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import wi0.InterfaceC49631b;

/* compiled from: RecallMeInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/recall_me/domain/h;", "Lcom/avito/android/recall_me/domain/g;", "a", "b", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h implements g {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f251836f = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC49631b> f251837a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f251838b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C34240j f251839c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.recall_me.domain.a f251840d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.recall_me_core.b f251841e;

    /* compiled from: RecallMeInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/recall_me/domain/h$a;", "", "<init>", "()V", "", "PHONE_PREFIX", "Ljava/lang/String;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RecallMeInteractor.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/recall_me/domain/h$b;", "", "a", "b", "c", "d", "Lcom/avito/android/recall_me/domain/h$b$a;", "Lcom/avito/android/recall_me/domain/h$b$b;", "Lcom/avito/android/recall_me/domain/h$b$c;", "Lcom/avito/android/recall_me/domain/h$b$d;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: RecallMeInteractor.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/recall_me/domain/h$b$a;", "Lcom/avito/android/recall_me/domain/h$b;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final SmsCodeConfirmationParams f251842a;

            public a(@Y61.k SmsCodeConfirmationParams smsCodeConfirmationParams) {
                this.f251842a = smsCodeConfirmationParams;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f251842a, ((a) obj).f251842a);
            }

            public final int hashCode() {
                return this.f251842a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "ConfirmedRequest(confirmationParams=" + this.f251842a + ')';
            }
        }

        /* compiled from: RecallMeInteractor.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/recall_me/domain/h$b$b;", "Lcom/avito/android/recall_me/domain/h$b;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.recall_me.domain.h$b$b, reason: collision with other inner class name */
        public static final /* data */ class C7557b implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f251843a;

            public C7557b(@Y61.k String str) {
                this.f251843a = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C7557b) && L.f(this.f251843a, ((C7557b) obj).f251843a);
            }

            public final int hashCode() {
                return this.f251843a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("Error(errorMessage="), this.f251843a, ')');
            }
        }

        /* compiled from: RecallMeInteractor.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/recall_me/domain/h$b$c;", "Lcom/avito/android/recall_me/domain/h$b;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final List<com.avito.conveyor_item.a> f251844a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final String f251845b;

            /* JADX WARN: Multi-variable type inference failed */
            public c(@Y61.k List<? extends com.avito.conveyor_item.a> list, @Y61.l String str) {
                this.f251844a = list;
                this.f251845b = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return L.f(this.f251844a, cVar.f251844a) && L.f(this.f251845b, cVar.f251845b);
            }

            public final int hashCode() {
                int iHashCode = this.f251844a.hashCode() * 31;
                String str = this.f251845b;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("PhoneValidationFailed(items=");
                sb2.append(this.f251844a);
                sb2.append(", phoneInvalidValue=");
                return C22026a.c(sb2, this.f251845b, ')');
            }
        }

        /* compiled from: RecallMeInteractor.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/recall_me/domain/h$b$d;", "Lcom/avito/android/recall_me/domain/h$b;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f251846a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final Long f251847b;

            public d(@Y61.k String str, @Y61.l Long l12) {
                this.f251846a = str;
                this.f251847b = l12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return L.f(this.f251846a, dVar.f251846a) && L.f(this.f251847b, dVar.f251847b);
            }

            public final int hashCode() {
                int iHashCode = this.f251846a.hashCode() * 31;
                Long l12 = this.f251847b;
                return iHashCode + (l12 == null ? 0 : l12.hashCode());
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Success(successMessage=");
                sb2.append(this.f251846a);
                sb2.append(", requestId=");
                return androidx.media3.exoplayer.analytics.m.m(sb2, this.f251847b, ')');
            }
        }
    }

    static {
        new a(null);
    }

    @Inject
    public h(@Y61.k h31.e<InterfaceC49631b> eVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k C34240j c34240j, @Y61.k com.avito.android.recall_me.domain.a aVar, @Y61.k com.avito.android.recall_me_core.b bVar) {
        this.f251837a = eVar;
        this.f251838b = interfaceC35745a5;
        this.f251839c = c34240j;
        this.f251840d = aVar;
        this.f251841e = bVar;
    }

    @Override // com.avito.android.recall_me.domain.g
    @Y61.k
    public final z<b> a(@Y61.k RecallMeParams recallMeParams, @Y61.l ContactInfo contactInfo, @Y61.k RecallMeFormState recallMeFormState, @Y61.k List<? extends com.avito.conveyor_item.a> list, @Y61.l String str) {
        String string;
        b.c cVar;
        Object next;
        String string2;
        List<Phone> listD;
        if (contactInfo == null) {
            return z.c0(new b.C7557b(this.f251839c.f252014h));
        }
        if (str != null && (listD = contactInfo.d()) != null) {
            listD.add(new Phone(str, false, true));
        }
        String str2 = "7" + recallMeFormState.f251831c;
        String str3 = recallMeFormState.f251831c;
        Object obj = null;
        if (str3 != null) {
            StringBuilder sb2 = new StringBuilder();
            int length = str3.length();
            for (int i12 = 0; i12 < length; i12++) {
                char cCharAt = str3.charAt(i12);
                if (Character.isDigit(cCharAt)) {
                    sb2.append(cCharAt);
                }
            }
            string = sb2.toString();
        } else {
            string = null;
        }
        if (string == null || string.length() != 10) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof SingleInputItem) {
                    arrayList.add(obj2);
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((SingleInputItem) next).f251944c == SingleInputType.f251952c) {
                    break;
                }
            }
            SingleInputItem singleInputItem = (SingleInputItem) next;
            if (singleInputItem != null) {
                singleInputItem.f251950i = true;
            }
            cVar = new b.c(list, recallMeFormState.f251831c);
        } else {
            cVar = null;
        }
        if (cVar != null) {
            return z.c0(cVar);
        }
        boolean zF2 = L.f(str, str2);
        StringBuilder sb3 = new StringBuilder("7");
        String str4 = recallMeFormState.f251831c;
        if (str4 != null) {
            StringBuilder sb4 = new StringBuilder();
            int length2 = str4.length();
            for (int i13 = 0; i13 < length2; i13++) {
                char cCharAt2 = str4.charAt(i13);
                if (Character.isDigit(cCharAt2)) {
                    sb4.append(cCharAt2);
                }
            }
            string2 = sb4.toString();
        } else {
            string2 = null;
        }
        sb3.append(string2);
        String string3 = sb3.toString();
        List<Phone> listD2 = contactInfo.d();
        if (listD2 != null) {
            Iterator<T> it2 = listD2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Phone phone = (Phone) next2;
                if (phone.getIsConfirmed() && L.f(phone.getPhone(), string3)) {
                    obj = next2;
                    break;
                }
            }
            obj = (Phone) obj;
        }
        return (obj == null && !zF2) ? this.f251841e.b(str2).z(this.f251838b.a()).F().T(new i(this, str2, recallMeFormState, recallMeParams), Integer.MAX_VALUE).m0(j.f251852b) : c(recallMeParams, recallMeFormState);
    }

    @Override // com.avito.android.recall_me.domain.g
    @Y61.k
    public final C42026y b(@Y61.k String str, @Y61.l String str2) {
        return g1.a(new C42007e(new com.avito.android.advert.deeplinks.delivery.p(this, str, str2, 12)).z(this.f251838b.a()));
    }

    public final L0 c(RecallMeParams recallMeParams, RecallMeFormState recallMeFormState) {
        return Y5.a(new C42007e(new com.avito.android.advert.deeplinks.delivery.p(this, recallMeParams, recallMeFormState, 11)).F()).x0(this.f251838b.a()).d0(new k(this)).m0(l.f251854b);
    }
}
