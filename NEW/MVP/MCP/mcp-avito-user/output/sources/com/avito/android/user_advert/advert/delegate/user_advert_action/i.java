package com.avito.android.user_advert.advert.delegate.user_advert_action;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.ReservationMessageResult;
import com.avito.android.remote.model.SuccessResult;
import com.avito.android.remote.model.my_advert.CloseReason;
import fH0.InterfaceC40292b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UserAdvertPresenterDelegateAction.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000f\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i;", "LfH0/b;", "<init>", "()V", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i$a;", "Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i$b;", "Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i$c;", "Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i$d;", "Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i$e;", "Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i$f;", "Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i$g;", "Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i$h;", "Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i$i;", "Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i$j;", "Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i$k;", "Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i$l;", "Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i$m;", "Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i$n;", "Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i$o;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class i implements InterfaceC40292b {

    /* compiled from: UserAdvertPresenterDelegateAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i$a;", "Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends i {
    }

    /* compiled from: UserAdvertPresenterDelegateAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i$b;", "Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ApiError f308864a;

        public b(@Y61.k ApiError apiError) {
            super(null);
            this.f308864a = apiError;
        }
    }

    /* compiled from: UserAdvertPresenterDelegateAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i$c;", "Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SuccessResult f308865a;

        public c(@Y61.k SuccessResult successResult) {
            super(null);
            this.f308865a = successResult;
        }
    }

    /* compiled from: UserAdvertPresenterDelegateAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i$d;", "Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SuccessResult f308866a;

        public d(@Y61.k SuccessResult successResult) {
            super(null);
            this.f308866a = successResult;
        }
    }

    /* compiled from: UserAdvertPresenterDelegateAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i$e;", "Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e extends i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f308867a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<CloseReason> f308868b;

        public e(@Y61.k String str, @Y61.k List<CloseReason> list) {
            super(null);
            this.f308867a = str;
            this.f308868b = list;
        }
    }

    /* compiled from: UserAdvertPresenterDelegateAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i$f;", "Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f extends i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ApiError f308869a;

        public f(@Y61.k ApiError apiError) {
            super(null);
            this.f308869a = apiError;
        }
    }

    /* compiled from: UserAdvertPresenterDelegateAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i$g;", "Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g extends i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f308870a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Boolean f308871b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f308872c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f308873d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f308874e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final DeepLink f308875f;

        public g(@Y61.l DeepLink deepLink, @Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l Boolean bool) {
            super(null);
            this.f308870a = str;
            this.f308871b = bool;
            this.f308872c = str2;
            this.f308873d = str3;
            this.f308874e = str4;
            this.f308875f = deepLink;
        }
    }

    /* compiled from: UserAdvertPresenterDelegateAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i$h;", "Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class h extends i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ApiError f308876a;

        public h(@Y61.k ApiError apiError) {
            super(null);
            this.f308876a = apiError;
        }
    }

    /* compiled from: UserAdvertPresenterDelegateAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i$i;", "Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_advert.advert.delegate.user_advert_action.i$i, reason: collision with other inner class name */
    public static final class C9481i extends i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SuccessResult f308877a;

        public C9481i(@Y61.k SuccessResult successResult) {
            super(null);
            this.f308877a = successResult;
        }
    }

    /* compiled from: UserAdvertPresenterDelegateAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i$j;", "Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class j extends i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ApiError f308878a;

        public j(@Y61.k ApiError apiError) {
            super(null);
            this.f308878a = apiError;
        }
    }

    /* compiled from: UserAdvertPresenterDelegateAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i$k;", "Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class k extends i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f308879a;

        public k(@Y61.k String str) {
            super(null);
            this.f308879a = str;
        }
    }

    /* compiled from: UserAdvertPresenterDelegateAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i$l;", "Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class l extends i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ReservationMessageResult f308880a;

        public l(@Y61.k ReservationMessageResult reservationMessageResult) {
            super(null);
            this.f308880a = reservationMessageResult;
        }
    }

    /* compiled from: UserAdvertPresenterDelegateAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i$m;", "Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class m extends i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ApiError f308881a;

        public m(@Y61.k ApiError apiError) {
            super(null);
            this.f308881a = apiError;
        }
    }

    /* compiled from: UserAdvertPresenterDelegateAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i$n;", "Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class n extends i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f308882a;

        public n(@Y61.k String str) {
            super(null);
            this.f308882a = str;
        }
    }

    /* compiled from: UserAdvertPresenterDelegateAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i$o;", "Lcom/avito/android/user_advert/advert/delegate/user_advert_action/i;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class o extends i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f308883a;

        public o(@Y61.k String str) {
            super(null);
            this.f308883a = str;
        }
    }

    public /* synthetic */ i(C42822w c42822w) {
        this();
    }

    public i() {
    }
}
