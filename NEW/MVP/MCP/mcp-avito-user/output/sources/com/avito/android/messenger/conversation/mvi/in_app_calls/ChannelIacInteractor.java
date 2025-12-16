package com.avito.android.messenger.conversation.mvi.in_app_calls;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.calltracking.remote.deeplink.MessengerReallContactMethodLink;
import com.avito.android.calltracking.remote.model.RecallFromGsmContext;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.iac_dialer_models.abstract_module.IacCallContext;
import com.avito.android.messenger.deeplink.ChannelIacCallLink;
import com.avito.android.messenger.deeplink.IacSellerChannelCallLinkV2;
import io.reactivex.rxjava3.core.z;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ChannelIacInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/in_app_calls/ChannelIacInteractor;", "LS20/a;", "Lcom/avito/android/messenger/conversation/mvi/in_app_calls/ChannelIacInteractor$State;", "State", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ChannelIacInteractor extends S20.a<State> {

    /* compiled from: ChannelIacInteractor.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/in_app_calls/ChannelIacInteractor$State;", "Landroid/os/Parcelable;", "<init>", "()V", "Content", "Empty", "Lcom/avito/android/messenger/conversation/mvi/in_app_calls/ChannelIacInteractor$State$Content;", "Lcom/avito/android/messenger/conversation/mvi/in_app_calls/ChannelIacInteractor$State$Empty;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class State implements Parcelable {

        /* compiled from: ChannelIacInteractor.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/in_app_calls/ChannelIacInteractor$State$Content;", "Lcom/avito/android/messenger/conversation/mvi/in_app_calls/ChannelIacInteractor$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class Content extends State {

            @k
            public static final Parcelable.Creator<Content> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @l
            public final IacCallContext f191341b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final DeepLink f191342c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final ChannelIacCallLink f191343d;

            /* renamed from: e, reason: collision with root package name */
            @l
            public final RecallFromGsmContext f191344e;

            /* renamed from: f, reason: collision with root package name */
            @k
            public final String f191345f;

            /* renamed from: g, reason: collision with root package name */
            public final boolean f191346g;

            /* compiled from: ChannelIacInteractor.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Content> {
                @Override // android.os.Parcelable.Creator
                public final Content createFromParcel(Parcel parcel) {
                    IacCallContext iacCallContext = (IacCallContext) parcel.readParcelable(Content.class.getClassLoader());
                    return new Content((RecallFromGsmContext) parcel.readParcelable(Content.class.getClassLoader()), (DeepLink) parcel.readParcelable(Content.class.getClassLoader()), iacCallContext, parcel.readInt() == 0 ? null : ChannelIacCallLink.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Content[] newArray(int i12) {
                    return new Content[i12];
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ Content(IacCallContext iacCallContext, DeepLink deepLink, ChannelIacCallLink channelIacCallLink, RecallFromGsmContext recallFromGsmContext, String str, boolean z12, int i12, C42822w c42822w) {
                IacCallContext iacCallContext2 = (i12 & 1) != 0 ? null : iacCallContext;
                this((i12 & 8) != 0 ? null : recallFromGsmContext, (i12 & 2) != 0 ? null : deepLink, iacCallContext2, (i12 & 4) != 0 ? null : channelIacCallLink, str, z12);
            }

            @Override // com.avito.android.messenger.conversation.mvi.in_app_calls.ChannelIacInteractor.State
            @l
            /* renamed from: c, reason: from getter */
            public final IacCallContext getF191347b() {
                return this.f191341b;
            }

            @Override // com.avito.android.messenger.conversation.mvi.in_app_calls.ChannelIacInteractor.State
            @l
            /* renamed from: d, reason: from getter */
            public final DeepLink getF191348c() {
                return this.f191342c;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.avito.android.messenger.conversation.mvi.in_app_calls.ChannelIacInteractor.State
            @l
            /* renamed from: e, reason: from getter */
            public final RecallFromGsmContext getF191350e() {
                return this.f191344e;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Content)) {
                    return false;
                }
                Content content = (Content) obj;
                return L.f(this.f191341b, content.f191341b) && L.f(this.f191342c, content.f191342c) && L.f(this.f191343d, content.f191343d) && L.f(this.f191344e, content.f191344e) && L.f(this.f191345f, content.f191345f) && this.f191346g == content.f191346g;
            }

            public final int hashCode() {
                IacCallContext iacCallContext = this.f191341b;
                int iHashCode = (iacCallContext == null ? 0 : iacCallContext.hashCode()) * 31;
                DeepLink deepLink = this.f191342c;
                int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
                ChannelIacCallLink channelIacCallLink = this.f191343d;
                int iHashCode3 = (iHashCode2 + (channelIacCallLink == null ? 0 : channelIacCallLink.hashCode())) * 31;
                RecallFromGsmContext recallFromGsmContext = this.f191344e;
                return Boolean.hashCode(this.f191346g) + H.d((iHashCode3 + (recallFromGsmContext != null ? recallFromGsmContext.hashCode() : 0)) * 31, 31, this.f191345f);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Content(callContext=");
                sb2.append(this.f191341b);
                sb2.append(", gsmCallLink=");
                sb2.append(this.f191342c);
                sb2.append(", iacCallLink=");
                sb2.append(this.f191343d);
                sb2.append(", recallFromGsmMessageContext=");
                sb2.append(this.f191344e);
                sb2.append(", channelId=");
                sb2.append(this.f191345f);
                sb2.append(", isCurrentUserItem=");
                return r.x(sb2, this.f191346g, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeParcelable(this.f191341b, i12);
                parcel.writeParcelable(this.f191342c, i12);
                ChannelIacCallLink channelIacCallLink = this.f191343d;
                if (channelIacCallLink == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    channelIacCallLink.writeToParcel(parcel, i12);
                }
                parcel.writeParcelable(this.f191344e, i12);
                parcel.writeString(this.f191345f);
                parcel.writeInt(this.f191346g ? 1 : 0);
            }

            public Content(@l RecallFromGsmContext recallFromGsmContext, @l DeepLink deepLink, @l IacCallContext iacCallContext, @l ChannelIacCallLink channelIacCallLink, @k String str, boolean z12) {
                super(null);
                this.f191341b = iacCallContext;
                this.f191342c = deepLink;
                this.f191343d = channelIacCallLink;
                this.f191344e = recallFromGsmContext;
                this.f191345f = str;
                this.f191346g = z12;
            }
        }

        /* compiled from: ChannelIacInteractor.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/in_app_calls/ChannelIacInteractor$State$Empty;", "Lcom/avito/android/messenger/conversation/mvi/in_app_calls/ChannelIacInteractor$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class Empty extends State {

            @k
            public static final Parcelable.Creator<Empty> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @l
            public final IacCallContext f191347b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final DeepLink f191348c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final ChannelIacCallLink f191349d;

            /* renamed from: e, reason: collision with root package name */
            @l
            public final RecallFromGsmContext f191350e;

            /* compiled from: ChannelIacInteractor.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Empty> {
                @Override // android.os.Parcelable.Creator
                public final Empty createFromParcel(Parcel parcel) {
                    return new Empty((IacCallContext) parcel.readParcelable(Empty.class.getClassLoader()), (DeepLink) parcel.readParcelable(Empty.class.getClassLoader()), parcel.readInt() == 0 ? null : ChannelIacCallLink.CREATOR.createFromParcel(parcel), (RecallFromGsmContext) parcel.readParcelable(Empty.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Empty[] newArray(int i12) {
                    return new Empty[i12];
                }
            }

            public Empty() {
                this(null, null, null, null, 15, null);
            }

            @Override // com.avito.android.messenger.conversation.mvi.in_app_calls.ChannelIacInteractor.State
            @l
            /* renamed from: c, reason: from getter */
            public final IacCallContext getF191347b() {
                return this.f191347b;
            }

            @Override // com.avito.android.messenger.conversation.mvi.in_app_calls.ChannelIacInteractor.State
            @l
            /* renamed from: d, reason: from getter */
            public final DeepLink getF191348c() {
                return this.f191348c;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.avito.android.messenger.conversation.mvi.in_app_calls.ChannelIacInteractor.State
            @l
            /* renamed from: e, reason: from getter */
            public final RecallFromGsmContext getF191350e() {
                return this.f191350e;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Empty)) {
                    return false;
                }
                Empty empty = (Empty) obj;
                return L.f(this.f191347b, empty.f191347b) && L.f(this.f191348c, empty.f191348c) && L.f(this.f191349d, empty.f191349d) && L.f(this.f191350e, empty.f191350e);
            }

            public final int hashCode() {
                IacCallContext iacCallContext = this.f191347b;
                int iHashCode = (iacCallContext == null ? 0 : iacCallContext.hashCode()) * 31;
                DeepLink deepLink = this.f191348c;
                int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
                ChannelIacCallLink channelIacCallLink = this.f191349d;
                int iHashCode3 = (iHashCode2 + (channelIacCallLink == null ? 0 : channelIacCallLink.hashCode())) * 31;
                RecallFromGsmContext recallFromGsmContext = this.f191350e;
                return iHashCode3 + (recallFromGsmContext != null ? recallFromGsmContext.hashCode() : 0);
            }

            @k
            public final String toString() {
                return "Empty(callContext=" + this.f191347b + ", gsmCallLink=" + this.f191348c + ", iacCallLink=" + this.f191349d + ", recallFromGsmMessageContext=" + this.f191350e + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeParcelable(this.f191347b, i12);
                parcel.writeParcelable(this.f191348c, i12);
                ChannelIacCallLink channelIacCallLink = this.f191349d;
                if (channelIacCallLink == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    channelIacCallLink.writeToParcel(parcel, i12);
                }
                parcel.writeParcelable(this.f191350e, i12);
            }

            public /* synthetic */ Empty(IacCallContext iacCallContext, DeepLink deepLink, ChannelIacCallLink channelIacCallLink, RecallFromGsmContext recallFromGsmContext, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : iacCallContext, (i12 & 2) != 0 ? null : deepLink, (i12 & 4) != 0 ? null : channelIacCallLink, (i12 & 8) != 0 ? null : recallFromGsmContext);
            }

            public Empty(@l IacCallContext iacCallContext, @l DeepLink deepLink, @l ChannelIacCallLink channelIacCallLink, @l RecallFromGsmContext recallFromGsmContext) {
                super(null);
                this.f191347b = iacCallContext;
                this.f191348c = deepLink;
                this.f191349d = channelIacCallLink;
                this.f191350e = recallFromGsmContext;
            }
        }

        public /* synthetic */ State(C42822w c42822w) {
            this();
        }

        @l
        /* renamed from: c */
        public abstract IacCallContext getF191347b();

        @l
        /* renamed from: d */
        public abstract DeepLink getF191348c();

        @l
        /* renamed from: e */
        public abstract RecallFromGsmContext getF191350e();

        public State() {
        }
    }

    @k
    z<Boolean> Hc();

    void U6(@k MessengerReallContactMethodLink messengerReallContactMethodLink);

    void Ub();

    void Z3(@k DeepLink deepLink);

    @k
    z<G0> o7();

    void t6();

    void z3(@k ChannelIacCallLink channelIacCallLink);

    void zc(@k IacSellerChannelCallLinkV2 iacSellerChannelCallLinkV2);
}
