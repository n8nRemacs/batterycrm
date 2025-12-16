package com.avito.android.profile_phones.phone_action.view_model;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import androidx.view.AbstractC22991Y;
import androidx.view.C23038g0;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.util.architecture_components.D;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PhoneActionViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/profile_phones/phone_action/view_model/a;", "", "a", "b", "c", "d", "e", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface a {

    /* compiled from: PhoneActionViewModel.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phone_action/view_model/a$a;", "", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile_phones.phone_action.view_model.a$a, reason: collision with other inner class name */
    public static final /* data */ class C6906a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f227300a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f227301b;

        public C6906a(@k String str, @k Throwable th2) {
            this.f227300a = str;
            this.f227301b = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6906a)) {
                return false;
            }
            C6906a c6906a = (C6906a) obj;
            return L.f(this.f227300a, c6906a.f227300a) && L.f(this.f227301b, c6906a.f227301b);
        }

        public final int hashCode() {
            return this.f227301b.hashCode() + (this.f227300a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ErrorEvent(message=");
            sb2.append(this.f227300a);
            sb2.append(", throwable=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f227301b, ')');
        }
    }

    /* compiled from: PhoneActionViewModel.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/profile_phones/phone_action/view_model/a$b;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/profile_phones/phone_action/view_model/a$b$a;", "Lcom/avito/android/profile_phones/phone_action/view_model/a$b$b;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: PhoneActionViewModel.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/phone_action/view_model/a$b$a;", "Lcom/avito/android/profile_phones/phone_action/view_model/a$b;", "<init>", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile_phones.phone_action.view_model.a$b$a, reason: collision with other inner class name */
        public static final class C6907a extends b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C6907a f227302a = new C6907a();

            public C6907a() {
                super(null);
            }
        }

        /* compiled from: PhoneActionViewModel.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phone_action/view_model/a$b$b;", "Lcom/avito/android/profile_phones/phone_action/view_model/a$b;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile_phones.phone_action.view_model.a$b$b, reason: collision with other inner class name */
        public static final class C6908b extends b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f227303a;

            public C6908b(@k String str) {
                super(null);
                this.f227303a = str;
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: PhoneActionViewModel.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/profile_phones/phone_action/view_model/a$c;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/profile_phones/phone_action/view_model/a$c$a;", "Lcom/avito/android/profile_phones/phone_action/view_model/a$c$b;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class c {

        /* compiled from: PhoneActionViewModel.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phone_action/view_model/a$c$a;", "Lcom/avito/android/profile_phones/phone_action/view_model/a$c;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile_phones.phone_action.view_model.a$c$a, reason: collision with other inner class name */
        public static final class C6909a extends c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f227304a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f227305b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final String f227306c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final String f227307d;

            public C6909a(@k String str, @k String str2, @l String str3, @l String str4) {
                super(null);
                this.f227304a = str;
                this.f227305b = str2;
                this.f227306c = str3;
                this.f227307d = str4;
            }
        }

        /* compiled from: PhoneActionViewModel.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/phone_action/view_model/a$c$b;", "Lcom/avito/android/profile_phones/phone_action/view_model/a$c;", "<init>", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final b f227308a = new b();

            public b() {
                super(null);
            }
        }

        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    /* compiled from: PhoneActionViewModel.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phone_action/view_model/a$d;", "", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f227309a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<ParcelableEntity<String>> f227310b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final ParcelableEntity<String> f227311c;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@k String str, @k List<? extends ParcelableEntity<String>> list, @l ParcelableEntity<String> parcelableEntity) {
            this.f227309a = str;
            this.f227310b = list;
            this.f227311c = parcelableEntity;
        }
    }

    /* compiled from: PhoneActionViewModel.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/profile_phones/phone_action/view_model/a$e;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/profile_phones/phone_action/view_model/a$e$a;", "Lcom/avito/android/profile_phones/phone_action/view_model/a$e$b;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class e {

        /* compiled from: PhoneActionViewModel.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phone_action/view_model/a$e$a;", "Lcom/avito/android/profile_phones/phone_action/view_model/a$e;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile_phones.phone_action.view_model.a$e$a, reason: collision with other inner class name */
        public static final class C6910a extends e {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f227312a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f227313b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f227314c;

            public C6910a(@k String str, @k String str2, @k String str3) {
                super(null);
                this.f227312a = str;
                this.f227313b = str2;
                this.f227314c = str3;
            }
        }

        /* compiled from: PhoneActionViewModel.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/phone_action/view_model/a$e$b;", "Lcom/avito/android/profile_phones/phone_action/view_model/a$e;", "<init>", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends e {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final b f227315a = new b();

            public b() {
                super(null);
            }
        }

        public /* synthetic */ e(C42822w c42822w) {
            this();
        }

        public e() {
        }
    }

    void A2();

    @k
    C23038g0 Ac();

    @k
    AbstractC22991Y<b> S0();

    @k
    D V0();

    void q(@k List<? extends ParcelableEntity<String>> list);

    void rd();

    void t3();

    @k
    C23038g0 va();

    @k
    AbstractC22991Y<e> z1();
}
