package com.avito.android.user_advert.advert.delegate.deliverySettings;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin_models.BeduinForm;
import fH0.InterfaceC40292b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DeliverySettingsDelegateAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/deliverySettings/a;", "LfH0/b;", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/user_advert/advert/delegate/deliverySettings/a$a;", "Lcom/avito/android/user_advert/advert/delegate/deliverySettings/a$b;", "Lcom/avito/android/user_advert/advert/delegate/deliverySettings/a$c;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class a implements InterfaceC40292b {

    /* compiled from: DeliverySettingsDelegateAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/deliverySettings/a$a;", "Lcom/avito/android/user_advert/advert/delegate/deliverySettings/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_advert.advert.delegate.deliverySettings.a$a, reason: collision with other inner class name */
    public static final /* data */ class C9464a extends a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f308561a;

        public C9464a(@k String str) {
            super(null);
            this.f308561a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9464a) && L.f(this.f308561a, ((C9464a) obj).f308561a);
        }

        public final int hashCode() {
            return this.f308561a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Error(formId="), this.f308561a, ')');
        }
    }

    /* compiled from: DeliverySettingsDelegateAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/deliverySettings/a$b;", "Lcom/avito/android/user_advert/advert/delegate/deliverySettings/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final BeduinForm f308562a;

        public b(@k BeduinForm beduinForm) {
            super(null);
            this.f308562a = beduinForm;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f308562a, ((b) obj).f308562a);
        }

        public final int hashCode() {
            return this.f308562a.hashCode();
        }

        @k
        public final String toString() {
            return "Loaded(form=" + this.f308562a + ')';
        }
    }

    /* compiled from: DeliverySettingsDelegateAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/deliverySettings/a$c;", "Lcom/avito/android/user_advert/advert/delegate/deliverySettings/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f308563a;

        public c(@k String str) {
            super(null);
            this.f308563a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f308563a, ((c) obj).f308563a);
        }

        public final int hashCode() {
            return this.f308563a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Loading(formId="), this.f308563a, ')');
        }
    }

    public /* synthetic */ a(C42822w c42822w) {
        this();
    }

    public a() {
    }
}
