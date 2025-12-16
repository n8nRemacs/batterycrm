package com.avito.android.advert.item.sellersubscription;

import Ca.AbstractC13232a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.InterfaceC32897n0;
import com.avito.android.advert.item.I1;
import com.avito.android.advert.item.Q;
import com.avito.android.advert.item.W0;
import com.avito.android.advert_details_items.sellerprofile.subscription.SellerNotificationsState;
import com.avito.android.advert_details_items.sellerprofile.subscription.SellerSubscriptionItem;
import com.avito.android.advert_details_items.sellerprofile.subscription.SellerSubscriptionState;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.favorite.SubscriptionSource;
import com.avito.android.authorization.AuthSource;
import com.avito.android.component.toast.util.c;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.auth.AuthenticateLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.SubscribeInfo;
import com.avito.android.remote.model.SubscribeInfoKt;
import com.avito.android.remote.model.SubscribeResult;
import com.avito.android.util.ApiException;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.K5;
import com.avito.android.util.Kundle;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.completable.K;
import io.reactivex.rxjava3.internal.operators.single.C42016n;
import io.reactivex.rxjava3.internal.operators.single.C42018p;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import jc.C42353b;
import jc.C42354c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;
import l41.InterfaceC43543a;

/* compiled from: SellerSubscriptionPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/sellersubscription/SellerSubscriptionPresenterImpl;", "Lcom/avito/android/advert/item/sellersubscription/p;", "TargetState", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SellerSubscriptionPresenterImpl implements p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.sellersubscription.j f79682a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f79683b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final I30.d f79684c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final D f79685d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f79686e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<AbstractC13232a> f79687f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.component.toast.util.c f79688g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f79689h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f79690i;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public I1 f79693l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public com.avito.android.subscriptions_settings.d f79694m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public W0 f79695n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public Q f79696o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public TargetState f79697p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public TargetState f79698q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public SellerSubscriptionItem f79699r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public SellerSubscriptionItem f79700s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final C43238h f79701t;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f79691j = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f79692k = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final SubscriptionSource f79702u = SubscriptionSource.f90037e;

    /* compiled from: SellerSubscriptionPresenter.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/advert/item/sellersubscription/SellerSubscriptionPresenterImpl$TargetState;", "Landroid/os/Parcelable;", "<init>", "()V", "NotificationActivated", "NotificationDeactivated", "Subscribed", "Unsubscribed", "Lcom/avito/android/advert/item/sellersubscription/SellerSubscriptionPresenterImpl$TargetState$NotificationActivated;", "Lcom/avito/android/advert/item/sellersubscription/SellerSubscriptionPresenterImpl$TargetState$NotificationDeactivated;", "Lcom/avito/android/advert/item/sellersubscription/SellerSubscriptionPresenterImpl$TargetState$Subscribed;", "Lcom/avito/android/advert/item/sellersubscription/SellerSubscriptionPresenterImpl$TargetState$Unsubscribed;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class TargetState implements Parcelable {

        /* compiled from: SellerSubscriptionPresenter.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/sellersubscription/SellerSubscriptionPresenterImpl$TargetState$NotificationActivated;", "Lcom/avito/android/advert/item/sellersubscription/SellerSubscriptionPresenterImpl$TargetState;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final class NotificationActivated extends TargetState {

            @Y61.k
            public static final Parcelable.Creator<NotificationActivated> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f79703b;

            /* compiled from: SellerSubscriptionPresenter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<NotificationActivated> {
                @Override // android.os.Parcelable.Creator
                public final NotificationActivated createFromParcel(Parcel parcel) {
                    return new NotificationActivated(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final NotificationActivated[] newArray(int i12) {
                    return new NotificationActivated[i12];
                }
            }

            public NotificationActivated(@Y61.k String str) {
                super(null);
                this.f79703b = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.avito.android.advert.item.sellersubscription.SellerSubscriptionPresenterImpl.TargetState
            @Y61.k
            /* renamed from: o4, reason: from getter */
            public final String getF79706b() {
                return this.f79703b;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f79703b);
            }
        }

        /* compiled from: SellerSubscriptionPresenter.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/sellersubscription/SellerSubscriptionPresenterImpl$TargetState$NotificationDeactivated;", "Lcom/avito/android/advert/item/sellersubscription/SellerSubscriptionPresenterImpl$TargetState;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final class NotificationDeactivated extends TargetState {

            @Y61.k
            public static final Parcelable.Creator<NotificationDeactivated> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f79704b;

            /* compiled from: SellerSubscriptionPresenter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<NotificationDeactivated> {
                @Override // android.os.Parcelable.Creator
                public final NotificationDeactivated createFromParcel(Parcel parcel) {
                    return new NotificationDeactivated(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final NotificationDeactivated[] newArray(int i12) {
                    return new NotificationDeactivated[i12];
                }
            }

            public NotificationDeactivated(@Y61.k String str) {
                super(null);
                this.f79704b = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.avito.android.advert.item.sellersubscription.SellerSubscriptionPresenterImpl.TargetState
            @Y61.k
            /* renamed from: o4, reason: from getter */
            public final String getF79706b() {
                return this.f79704b;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f79704b);
            }
        }

        /* compiled from: SellerSubscriptionPresenter.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/sellersubscription/SellerSubscriptionPresenterImpl$TargetState$Subscribed;", "Lcom/avito/android/advert/item/sellersubscription/SellerSubscriptionPresenterImpl$TargetState;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final class Subscribed extends TargetState {

            @Y61.k
            public static final Parcelable.Creator<Subscribed> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f79705b;

            /* compiled from: SellerSubscriptionPresenter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Subscribed> {
                @Override // android.os.Parcelable.Creator
                public final Subscribed createFromParcel(Parcel parcel) {
                    return new Subscribed(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Subscribed[] newArray(int i12) {
                    return new Subscribed[i12];
                }
            }

            public Subscribed(@Y61.k String str) {
                super(null);
                this.f79705b = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.avito.android.advert.item.sellersubscription.SellerSubscriptionPresenterImpl.TargetState
            @Y61.k
            /* renamed from: o4, reason: from getter */
            public final String getF79706b() {
                return this.f79705b;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f79705b);
            }
        }

        /* compiled from: SellerSubscriptionPresenter.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/sellersubscription/SellerSubscriptionPresenterImpl$TargetState$Unsubscribed;", "Lcom/avito/android/advert/item/sellersubscription/SellerSubscriptionPresenterImpl$TargetState;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final class Unsubscribed extends TargetState {

            @Y61.k
            public static final Parcelable.Creator<Unsubscribed> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f79706b;

            /* compiled from: SellerSubscriptionPresenter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Unsubscribed> {
                @Override // android.os.Parcelable.Creator
                public final Unsubscribed createFromParcel(Parcel parcel) {
                    return new Unsubscribed(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Unsubscribed[] newArray(int i12) {
                    return new Unsubscribed[i12];
                }
            }

            public Unsubscribed(@Y61.k String str) {
                super(null);
                this.f79706b = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.avito.android.advert.item.sellersubscription.SellerSubscriptionPresenterImpl.TargetState
            @Y61.k
            /* renamed from: o4, reason: from getter */
            public final String getF79706b() {
                return this.f79706b;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f79706b);
            }
        }

        public /* synthetic */ TargetState(C42822w c42822w) {
            this();
        }

        @Y61.k
        /* renamed from: o4 */
        public abstract String getF79706b();

        public TargetState() {
        }
    }

    /* compiled from: SellerSubscriptionPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f79707a;

        static {
            int[] iArr = new int[SellerSubscriptionState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SellerSubscriptionState sellerSubscriptionState = SellerSubscriptionState.f85639b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f79707a = iArr;
            int[] iArr2 = new int[SellerNotificationsState.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                SellerNotificationsState sellerNotificationsState = SellerNotificationsState.f85635b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: SellerSubscriptionPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.subscriptions_settings.d dVar = SellerSubscriptionPresenterImpl.this.f79694m;
            if (dVar != null) {
                dVar.e(true);
            }
        }
    }

    /* compiled from: SellerSubscriptionPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SellerSubscriptionPresenterImpl f79709b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SellerSubscriptionItem f79710c;

        public c(SellerSubscriptionPresenterImpl sellerSubscriptionPresenterImpl, SellerSubscriptionItem sellerSubscriptionItem) {
            SellerNotificationsState sellerNotificationsState = SellerNotificationsState.f85635b;
            this.f79709b = sellerSubscriptionPresenterImpl;
            this.f79710c = sellerSubscriptionItem;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            SellerSubscriptionItem sellerSubscriptionItem = this.f79710c;
            SellerSubscriptionItem sellerSubscriptionItemS3 = sellerSubscriptionItem.s3(sellerSubscriptionItem.getF85536f(), SellerNotificationsState.f85636c);
            SellerSubscriptionPresenterImpl.f(this.f79709b, (Throwable) obj, sellerSubscriptionItemS3);
        }
    }

    /* compiled from: SellerSubscriptionPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.subscriptions_settings.d dVar = SellerSubscriptionPresenterImpl.this.f79694m;
            if (dVar != null) {
                dVar.e(true);
            }
        }
    }

    /* compiled from: SellerSubscriptionPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SellerSubscriptionPresenterImpl f79712b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SellerSubscriptionItem f79713c;

        public e(SellerSubscriptionPresenterImpl sellerSubscriptionPresenterImpl, SellerSubscriptionItem sellerSubscriptionItem) {
            SellerNotificationsState sellerNotificationsState = SellerNotificationsState.f85635b;
            this.f79712b = sellerSubscriptionPresenterImpl;
            this.f79713c = sellerSubscriptionItem;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            SellerSubscriptionItem sellerSubscriptionItem = this.f79713c;
            SellerSubscriptionItem sellerSubscriptionItemS3 = sellerSubscriptionItem.s3(sellerSubscriptionItem.getF85536f(), SellerNotificationsState.f85635b);
            SellerSubscriptionPresenterImpl.f(this.f79712b, (Throwable) obj, sellerSubscriptionItemS3);
        }
    }

    /* compiled from: SellerSubscriptionPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lcom/avito/android/n0;", "sellerSet", "Lio/reactivex/rxjava3/core/O;", "", "", "apply", "(Ljava/util/Set;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final f<T, R> f79714b = new f<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            Set<InterfaceC32897n0> set = (Set) obj;
            int iF2 = P0.f(C42745f0.q(set, 10));
            if (iF2 < 16) {
                iF2 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
            for (InterfaceC32897n0 interfaceC32897n0 : set) {
                linkedHashMap.put(interfaceC32897n0.getF155494c(), interfaceC32897n0);
            }
            return I.q(linkedHashMap);
        }
    }

    /* compiled from: SellerSubscriptionPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "Lcom/avito/android/n0;", "sellerMap", "Lkotlin/G0;", "accept", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Q f79715b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SellerSubscriptionPresenterImpl f79716c;

        public g(Q q12, SellerSubscriptionPresenterImpl sellerSubscriptionPresenterImpl) {
            this.f79715b = q12;
            this.f79716c = sellerSubscriptionPresenterImpl;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            SellerSubscriptionState sellerSubscriptionState;
            Boolean f155498g;
            Map map = (Map) obj;
            for (SellerSubscriptionItem sellerSubscriptionItem : this.f79715b.a()) {
                InterfaceC32897n0 interfaceC32897n0 = (InterfaceC32897n0) map.get(sellerSubscriptionItem.getF85535e());
                if (interfaceC32897n0 != null) {
                    SellerSubscriptionPresenterImpl sellerSubscriptionPresenterImpl = this.f79716c;
                    sellerSubscriptionPresenterImpl.getClass();
                    boolean f155497f = interfaceC32897n0.getF155497f();
                    if (f155497f) {
                        sellerSubscriptionState = SellerSubscriptionState.f85639b;
                    } else {
                        if (f155497f) {
                            throw new NoWhenBranchMatchedException();
                        }
                        sellerSubscriptionState = SellerSubscriptionState.f85640c;
                    }
                    SellerNotificationsState sellerNotificationsState = null;
                    if (interfaceC32897n0.getF155497f() && (f155498g = interfaceC32897n0.getF155498g()) != null) {
                        if (f155498g.equals(Boolean.TRUE)) {
                            sellerNotificationsState = SellerNotificationsState.f85635b;
                        } else {
                            if (!f155498g.equals(Boolean.FALSE)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            sellerNotificationsState = SellerNotificationsState.f85636c;
                        }
                    }
                    sellerSubscriptionPresenterImpl.p(sellerSubscriptionItem.s3(sellerSubscriptionState, sellerNotificationsState));
                }
            }
        }
    }

    /* compiled from: SellerSubscriptionPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final h<T> f79717b = new h<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.f((Throwable) obj);
        }
    }

    /* compiled from: SellerSubscriptionPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f79719c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ SellerSubscriptionItem f79720d;

        public i(String str, SellerSubscriptionItem sellerSubscriptionItem) {
            this.f79719c = str;
            this.f79720d = sellerSubscriptionItem;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            TargetState.Subscribed subscribed = new TargetState.Subscribed(this.f79719c);
            SellerSubscriptionPresenterImpl sellerSubscriptionPresenterImpl = SellerSubscriptionPresenterImpl.this;
            sellerSubscriptionPresenterImpl.f79697p = subscribed;
            SellerSubscriptionItem sellerSubscriptionItem = this.f79720d;
            if (sellerSubscriptionItem instanceof AdvertDetailsSellerSubscriptionItem) {
                sellerSubscriptionPresenterImpl.p(AdvertDetailsSellerSubscriptionItem.b((AdvertDetailsSellerSubscriptionItem) sellerSubscriptionItem, 0, SellerSubscriptionState.f85641d, null, 11));
            }
        }
    }

    /* compiled from: SellerSubscriptionPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/SubscribeInfo;", "it", "Lcom/avito/android/remote/model/SubscribeResult;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class j<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final j<T, R> f79721b = new j<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return SubscribeInfoKt.toSubscribeInfo((SubscribeResult) obj);
        }
    }

    /* compiled from: SellerSubscriptionPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/SubscribeInfo;", "subscribeInfo", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/SubscribeInfo;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SellerSubscriptionItem f79723c;

        public k(SellerSubscriptionItem sellerSubscriptionItem) {
            this.f79723c = sellerSubscriptionItem;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            SellerNotificationsState sellerNotificationsState;
            SubscribeInfo subscribeInfo = (SubscribeInfo) obj;
            Boolean boolIsNotificationsActivated = subscribeInfo.isNotificationsActivated();
            Boolean bool = Boolean.TRUE;
            boolean zF2 = L.f(boolIsNotificationsActivated, bool);
            SellerSubscriptionPresenterImpl sellerSubscriptionPresenterImpl = SellerSubscriptionPresenterImpl.this;
            if (zF2 && sellerSubscriptionPresenterImpl.f79684c.b()) {
                c.a.a(sellerSubscriptionPresenterImpl.f79688g, com.avito.android.printable_text.b.f(sellerSubscriptionPresenterImpl.f79685d.c()), 0, null, null, null, null, 254);
            }
            SellerSubscriptionState sellerSubscriptionState = SellerSubscriptionState.f85639b;
            sellerSubscriptionPresenterImpl.getClass();
            Boolean boolIsNotificationsActivated2 = subscribeInfo.isNotificationsActivated();
            if (boolIsNotificationsActivated2 == null) {
                sellerNotificationsState = null;
            } else if (boolIsNotificationsActivated2.equals(bool)) {
                sellerNotificationsState = SellerNotificationsState.f85635b;
            } else {
                if (!boolIsNotificationsActivated2.equals(Boolean.FALSE)) {
                    throw new NoWhenBranchMatchedException();
                }
                sellerNotificationsState = SellerNotificationsState.f85636c;
            }
            sellerSubscriptionPresenterImpl.j(this.f79723c.s3(sellerSubscriptionState, sellerNotificationsState));
        }
    }

    /* compiled from: SellerSubscriptionPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SellerSubscriptionItem f79724b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SellerSubscriptionPresenterImpl f79725c;

        public l(SellerSubscriptionPresenterImpl sellerSubscriptionPresenterImpl, SellerSubscriptionItem sellerSubscriptionItem) {
            SellerSubscriptionState sellerSubscriptionState = SellerSubscriptionState.f85639b;
            this.f79724b = sellerSubscriptionItem;
            this.f79725c = sellerSubscriptionPresenterImpl;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            SellerSubscriptionItem sellerSubscriptionItem = this.f79724b;
            SellerSubscriptionItem sellerSubscriptionItemS3 = sellerSubscriptionItem.s3(SellerSubscriptionState.f85640c, sellerSubscriptionItem.getF85537g());
            SellerSubscriptionPresenterImpl sellerSubscriptionPresenterImpl = this.f79725c;
            sellerSubscriptionPresenterImpl.p(sellerSubscriptionItemS3);
            SellerSubscriptionPresenterImpl.f(sellerSubscriptionPresenterImpl, (Throwable) obj, sellerSubscriptionItemS3);
        }
    }

    /* compiled from: SellerSubscriptionPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m<T> implements l41.g {
        public m() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.subscriptions_settings.d dVar = SellerSubscriptionPresenterImpl.this.f79694m;
            if (dVar != null) {
                dVar.f(true);
            }
        }
    }

    /* compiled from: SellerSubscriptionPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SellerSubscriptionPresenterImpl f79727b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SellerSubscriptionItem f79728c;

        public n(SellerSubscriptionPresenterImpl sellerSubscriptionPresenterImpl, SellerSubscriptionItem sellerSubscriptionItem) {
            SellerSubscriptionState sellerSubscriptionState = SellerSubscriptionState.f85639b;
            this.f79727b = sellerSubscriptionPresenterImpl;
            this.f79728c = sellerSubscriptionItem;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            SellerSubscriptionItem sellerSubscriptionItem = this.f79728c;
            SellerSubscriptionItem sellerSubscriptionItemS3 = sellerSubscriptionItem.s3(SellerSubscriptionState.f85639b, sellerSubscriptionItem.getF85537g());
            SellerSubscriptionPresenterImpl.f(this.f79727b, (Throwable) obj, sellerSubscriptionItemS3);
        }
    }

    @Inject
    public SellerSubscriptionPresenterImpl(@Y61.k com.avito.android.advert.item.sellersubscription.j jVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k I30.d dVar, @Y61.k D d12, @Y61.k InterfaceC35741a1 interfaceC35741a1, @Y61.k io.reactivex.rxjava3.core.z<AbstractC13232a> zVar, @Y61.k com.avito.android.component.toast.util.c cVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k R0 r02) {
        this.f79682a = jVar;
        this.f79683b = interfaceC35745a5;
        this.f79684c = dVar;
        this.f79685d = d12;
        this.f79686e = interfaceC35741a1;
        this.f79687f = zVar;
        this.f79688g = cVar;
        this.f79689h = interfaceC28373a;
        this.f79690i = aVar;
        this.f79701t = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.b()));
    }

    public static final void f(SellerSubscriptionPresenterImpl sellerSubscriptionPresenterImpl, Throwable th2, SellerSubscriptionItem sellerSubscriptionItem) {
        sellerSubscriptionPresenterImpl.getClass();
        boolean zA2 = K5.a(th2);
        com.avito.android.deeplink_handler.handler.composite.a aVar = sellerSubscriptionPresenterImpl.f79690i;
        if (zA2) {
            sellerSubscriptionPresenterImpl.f79698q = sellerSubscriptionPresenterImpl.f79697p;
            b.a.a(aVar, new AuthenticateLink(AuthSource.f92708j, false, (DeepLink) null, 6, (C42822w) null), "adverts_seller_subscription_presenter", null, 4);
            return;
        }
        if (!(th2 instanceof ApiException)) {
            c.a.a(sellerSubscriptionPresenterImpl.f79688g, InterfaceC35741a1.a.a(sellerSubscriptionPresenterImpl.f79686e, th2, null, null, 6), 0, null, null, null, null, 254);
            return;
        }
        ApiError apiError = ((ApiException) th2).f318522b;
        if (!(apiError instanceof ApiError.ErrorDialog)) {
            if (apiError instanceof ApiError.ErrorAction) {
                sellerSubscriptionPresenterImpl.f79700s = sellerSubscriptionItem;
                b.a.a(aVar, ((ApiError.ErrorAction) apiError).getAction(), "adverts_seller_subscription_presenter", null, 4);
                return;
            }
            return;
        }
        ApiError.ErrorDialog errorDialog = (ApiError.ErrorDialog) apiError;
        I1 i12 = sellerSubscriptionPresenterImpl.f79693l;
        if (i12 != null) {
            i12.V(errorDialog, new A(errorDialog, sellerSubscriptionPresenterImpl, sellerSubscriptionItem));
        }
    }

    public static final void g(SellerSubscriptionPresenterImpl sellerSubscriptionPresenterImpl, SellerSubscriptionItem sellerSubscriptionItem) {
        sellerSubscriptionPresenterImpl.getClass();
        SellerSubscriptionState f85536f = sellerSubscriptionItem.getF85536f();
        int i12 = f85536f == null ? -1 : a.f79707a[f85536f.ordinal()];
        InterfaceC28373a interfaceC28373a = sellerSubscriptionPresenterImpl.f79689h;
        if (i12 == 1) {
            interfaceC28373a.c(new C42354c(sellerSubscriptionItem.getF85535e(), SubscriptionSource.f90037e));
            sellerSubscriptionPresenterImpl.o(sellerSubscriptionItem);
        } else {
            if (i12 != 2) {
                return;
            }
            interfaceC28373a.c(new C42353b(sellerSubscriptionItem.getF85535e(), SubscriptionSource.f90037e));
            sellerSubscriptionPresenterImpl.n(sellerSubscriptionItem);
        }
    }

    @Override // com.avito.android.advert.item.sellersubscription.p
    public final void a() {
        Q0.d(this.f79701t.f411905b);
        this.f79694m = null;
    }

    @Override // com.avito.android.advert.item.sellersubscription.p
    public final void b(@Y61.k Q q12) {
        Object next;
        this.f79696o = q12;
        TargetState targetState = this.f79697p;
        if (targetState != null) {
            Iterator it = q12.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (L.f(((SellerSubscriptionItem) next).getF85535e(), targetState.getF79706b())) {
                        break;
                    }
                }
            }
            SellerSubscriptionItem sellerSubscriptionItem = (SellerSubscriptionItem) next;
            if (sellerSubscriptionItem != null) {
                if (targetState instanceof TargetState.Subscribed) {
                    n(sellerSubscriptionItem);
                    return;
                }
                if (targetState instanceof TargetState.Unsubscribed) {
                    o(sellerSubscriptionItem);
                } else if (targetState instanceof TargetState.NotificationActivated) {
                    h(sellerSubscriptionItem);
                } else if (targetState instanceof TargetState.NotificationDeactivated) {
                    i(sellerSubscriptionItem);
                }
            }
        }
    }

    @Override // com.avito.android.advert.item.sellersubscription.p
    public final void c() {
        this.f79697p = this.f79698q;
        this.f79698q = null;
    }

    @Override // com.avito.android.advert.item.sellersubscription.p
    public final void c0() {
        this.f79695n = null;
    }

    @Override // com.avito.android.advert.item.sellersubscription.p
    public final void d() {
        W0 w02 = this.f79695n;
        if (w02 != null) {
            w02.A0();
        }
    }

    @Override // com.avito.android.advert.item.sellersubscription.p
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.j(this.f79697p, "target_state");
        kundle.j(this.f79698q, "retry_on_auth_success_target_state");
        kundle.j(this.f79699r, "current_configuring_item");
        return kundle;
    }

    @Override // com.avito.android.advert.item.sellersubscription.p
    public final void e(@Y61.k com.avito.android.subscriptions_settings.d dVar) {
        this.f79694m = dVar;
        C43197r1 c43197r1 = new C43197r1(new s(this, null), dVar.f291516r);
        C43238h c43238h = this.f79701t;
        C43175k.K(c43197r1, c43238h);
        C43175k.K(new C43197r1(new t(this, null), dVar.f291517s), c43238h);
        C43175k.K(new C43197r1(new u(this, null), dVar.f291518t), c43238h);
        if (this.f79699r != null) {
            dVar.c();
        }
    }

    @Override // com.avito.android.advert.item.sellersubscription.p
    public final void e0() {
        this.f79691j.e();
        this.f79692k.e();
        this.f79693l = null;
    }

    @Override // com.avito.android.advert.item.sellersubscription.p
    public final void f0(@Y61.k Kundle kundle) {
        this.f79697p = (TargetState) kundle.d("target_state");
        this.f79698q = (TargetState) kundle.d("retry_on_auth_success_target_state");
        this.f79699r = (SellerSubscriptionItem) kundle.d("current_configuring_item");
    }

    public final void h(SellerSubscriptionItem sellerSubscriptionItem) {
        if (sellerSubscriptionItem.getF85537g() != SellerNotificationsState.f85636c) {
            return;
        }
        K kN2 = this.f79682a.b(sellerSubscriptionItem.getF85535e(), true, this.f79702u).q(this.f79683b.e()).n(new b());
        q qVar = new q(this, 3);
        l41.g<Object> gVar = io.reactivex.rxjava3.internal.functions.a.f401994d;
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        this.f79692k.b(kN2.m(gVar, gVar, interfaceC43543a, interfaceC43543a, qVar, interfaceC43543a).m(gVar, gVar, interfaceC43543a, interfaceC43543a, interfaceC43543a, new r(this, sellerSubscriptionItem, 6)).v(new r(this, sellerSubscriptionItem, 0, false), new c(this, sellerSubscriptionItem)));
    }

    public final void i(SellerSubscriptionItem sellerSubscriptionItem) {
        if (sellerSubscriptionItem.getF85537g() != SellerNotificationsState.f85635b) {
            return;
        }
        K kN2 = this.f79682a.b(sellerSubscriptionItem.getF85535e(), false, this.f79702u).q(this.f79683b.e()).n(new d());
        q qVar = new q(this, 1);
        l41.g<Object> gVar = io.reactivex.rxjava3.internal.functions.a.f401994d;
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        this.f79692k.b(kN2.m(gVar, gVar, interfaceC43543a, interfaceC43543a, qVar, interfaceC43543a).m(gVar, gVar, interfaceC43543a, interfaceC43543a, interfaceC43543a, new r(this, sellerSubscriptionItem, 2)).v(new r(this, sellerSubscriptionItem, 3, false), new e(this, sellerSubscriptionItem)));
    }

    public final void j(SellerSubscriptionItem sellerSubscriptionItem) {
        Boolean boolValueOf;
        String f85535e = sellerSubscriptionItem.getF85535e();
        Boolean boolValueOf2 = Boolean.valueOf(sellerSubscriptionItem.getF85536f() == SellerSubscriptionState.f85639b);
        SellerNotificationsState f85537g = sellerSubscriptionItem.getF85537g();
        if (f85537g != null) {
            boolValueOf = Boolean.valueOf(f85537g == SellerNotificationsState.f85635b);
        } else {
            boolValueOf = null;
        }
        this.f79692k.b(this.f79682a.g(boolValueOf2, boolValueOf, f85535e).u());
    }

    @Override // com.avito.android.advert.item.sellersubscription.p
    public final void k(@Y61.k I1 i12) {
        this.f79693l = i12;
        io.reactivex.rxjava3.disposables.d dVarT0 = this.f79687f.t0(new v(this));
        io.reactivex.rxjava3.disposables.c cVar = this.f79691j;
        cVar.b(dVarT0);
        cVar.b(this.f79690i.d9().N(w.f79776b).t0(new x(this)));
        this.f79692k.b(this.f79682a.k().j0(this.f79683b.e()).v0(new y(this), z.f79779b, io.reactivex.rxjava3.internal.functions.a.f401993c));
        l();
    }

    public final void l() {
        Q q12 = this.f79696o;
        if (q12 == null) {
            return;
        }
        this.f79692k.b(this.f79682a.h().n(f.f79714b).s(this.f79683b.e()).x(new g(q12, this), h.f79717b));
    }

    @Override // com.avito.android.advert.item.sellersubscription.p
    public final void m(@Y61.k W0 w02) {
        this.f79695n = w02;
    }

    public final void n(SellerSubscriptionItem sellerSubscriptionItem) {
        if (sellerSubscriptionItem.getF85536f() != SellerSubscriptionState.f85640c) {
            return;
        }
        String f85535e = sellerSubscriptionItem.getF85535e();
        this.f79692k.b(new C42018p(new C42016n(this.f79682a.e(f85535e, this.f79702u).s(this.f79683b.e()).j(new i(f85535e, sellerSubscriptionItem)), new q(this, 0)), new r(this, sellerSubscriptionItem, 1)).r(j.f79721b).x(new k(sellerSubscriptionItem), new l(this, sellerSubscriptionItem)));
    }

    public final void o(SellerSubscriptionItem sellerSubscriptionItem) {
        if (sellerSubscriptionItem.getF85536f() != SellerSubscriptionState.f85639b) {
            return;
        }
        K kN2 = this.f79682a.l(sellerSubscriptionItem.getF85535e(), this.f79702u).q(this.f79683b.e()).n(new m());
        q qVar = new q(this, 2);
        l41.g<Object> gVar = io.reactivex.rxjava3.internal.functions.a.f401994d;
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        this.f79692k.b(kN2.m(gVar, gVar, interfaceC43543a, interfaceC43543a, qVar, interfaceC43543a).m(gVar, gVar, interfaceC43543a, interfaceC43543a, interfaceC43543a, new r(this, sellerSubscriptionItem, 4)).v(new r(this, sellerSubscriptionItem, 5, false), new n(this, sellerSubscriptionItem)));
    }

    public final void p(SellerSubscriptionItem sellerSubscriptionItem) {
        Q q12 = this.f79696o;
        if (q12 != null) {
            q12.e(sellerSubscriptionItem);
        }
    }
}
