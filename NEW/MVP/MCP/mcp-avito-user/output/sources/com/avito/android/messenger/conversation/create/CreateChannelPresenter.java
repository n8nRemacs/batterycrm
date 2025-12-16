package com.avito.android.messenger.conversation.create;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.conversation.ChannelActivityArguments;
import com.avito.android.util.architecture_components.D;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CreateChannelPresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter;", "LS20/a;", "Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State;", "State", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface CreateChannelPresenter extends S20.a<State> {

    /* compiled from: CreateChannelPresenter.kt */
    @P
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State;", "Landroid/os/Parcelable;", "<init>", "()V", "Created", "Empty", "Error", "Waiting", "Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State$Created;", "Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State$Empty;", "Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State$Error;", "Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State$Waiting;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class State implements Parcelable {

        /* compiled from: CreateChannelPresenter.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State$Created;", "Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class Created extends State {

            @Y61.k
            public static final Parcelable.Creator<Created> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final ChannelActivityArguments.Create f189510b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final String f189511c;

            /* compiled from: CreateChannelPresenter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Created> {
                @Override // android.os.Parcelable.Creator
                public final Created createFromParcel(Parcel parcel) {
                    return new Created((ChannelActivityArguments.Create) parcel.readParcelable(Created.class.getClassLoader()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Created[] newArray(int i12) {
                    return new Created[i12];
                }
            }

            public Created(@Y61.k ChannelActivityArguments.Create create, @Y61.k String str) {
                super(null);
                this.f189510b = create;
                this.f189511c = str;
            }

            @Override // com.avito.android.messenger.conversation.create.CreateChannelPresenter.State
            @Y61.k
            /* renamed from: c, reason: from getter */
            public final ChannelActivityArguments.Create getF189520b() {
                return this.f189510b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Created)) {
                    return false;
                }
                Created created = (Created) obj;
                return L.f(this.f189510b, created.f189510b) && L.f(this.f189511c, created.f189511c);
            }

            public final int hashCode() {
                return this.f189511c.hashCode() + (this.f189510b.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Created(createParams=");
                sb2.append(this.f189510b);
                sb2.append(", channelId=");
                return C22026a.c(sb2, this.f189511c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeParcelable(this.f189510b, i12);
                parcel.writeString(this.f189511c);
            }
        }

        /* compiled from: CreateChannelPresenter.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State$Empty;", "Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final class Empty extends State {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final Empty f189512b = new Empty();

            @Y61.k
            public static final Parcelable.Creator<Empty> CREATOR = new a();

            /* compiled from: CreateChannelPresenter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Empty> {
                @Override // android.os.Parcelable.Creator
                public final Empty createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Empty.f189512b;
                }

                @Override // android.os.Parcelable.Creator
                public final Empty[] newArray(int i12) {
                    return new Empty[i12];
                }
            }

            public Empty() {
                super(null);
            }

            @Override // com.avito.android.messenger.conversation.create.CreateChannelPresenter.State
            @Y61.l
            /* renamed from: c */
            public final ChannelActivityArguments.Create getF189520b() {
                return null;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: CreateChannelPresenter.kt */
        @P
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State$Error;", "Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State;", "<init>", "()V", "AuthRequired", "Forbidden", "Network", "PhoneVerificationRequired", "Unknown", "Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State$Error$AuthRequired;", "Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State$Error$Forbidden;", "Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State$Error$Network;", "Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State$Error$PhoneVerificationRequired;", "Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State$Error$Unknown;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class Error extends State {

            /* compiled from: CreateChannelPresenter.kt */
            @P
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State$Error$AuthRequired;", "Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State$Error;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @K51.d
            public static final class AuthRequired extends Error {

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public static final AuthRequired f189513b = new AuthRequired();

                @Y61.k
                public static final Parcelable.Creator<AuthRequired> CREATOR = new a();

                /* compiled from: CreateChannelPresenter.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<AuthRequired> {
                    @Override // android.os.Parcelable.Creator
                    public final AuthRequired createFromParcel(Parcel parcel) {
                        parcel.readInt();
                        return AuthRequired.f189513b;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final AuthRequired[] newArray(int i12) {
                        return new AuthRequired[i12];
                    }
                }

                public AuthRequired() {
                    super(null);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                    parcel.writeInt(1);
                }
            }

            /* compiled from: CreateChannelPresenter.kt */
            @P
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State$Error$Forbidden;", "Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State$Error;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @K51.d
            public static final class Forbidden extends Error {

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public static final Forbidden f189514b = new Forbidden();

                @Y61.k
                public static final Parcelable.Creator<Forbidden> CREATOR = new a();

                /* compiled from: CreateChannelPresenter.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<Forbidden> {
                    @Override // android.os.Parcelable.Creator
                    public final Forbidden createFromParcel(Parcel parcel) {
                        parcel.readInt();
                        return Forbidden.f189514b;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Forbidden[] newArray(int i12) {
                        return new Forbidden[i12];
                    }
                }

                public Forbidden() {
                    super(null);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                    parcel.writeInt(1);
                }
            }

            /* compiled from: CreateChannelPresenter.kt */
            @P
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State$Error$Network;", "Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State$Error;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @K51.d
            public static final class Network extends Error {

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public static final Network f189515b = new Network();

                @Y61.k
                public static final Parcelable.Creator<Network> CREATOR = new a();

                /* compiled from: CreateChannelPresenter.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<Network> {
                    @Override // android.os.Parcelable.Creator
                    public final Network createFromParcel(Parcel parcel) {
                        parcel.readInt();
                        return Network.f189515b;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Network[] newArray(int i12) {
                        return new Network[i12];
                    }
                }

                public Network() {
                    super(null);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                    parcel.writeInt(1);
                }
            }

            /* compiled from: CreateChannelPresenter.kt */
            @P
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State$Error$PhoneVerificationRequired;", "Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State$Error;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @K51.d
            public static final class PhoneVerificationRequired extends Error {

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public static final PhoneVerificationRequired f189516b = new PhoneVerificationRequired();

                @Y61.k
                public static final Parcelable.Creator<PhoneVerificationRequired> CREATOR = new a();

                /* compiled from: CreateChannelPresenter.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<PhoneVerificationRequired> {
                    @Override // android.os.Parcelable.Creator
                    public final PhoneVerificationRequired createFromParcel(Parcel parcel) {
                        parcel.readInt();
                        return PhoneVerificationRequired.f189516b;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final PhoneVerificationRequired[] newArray(int i12) {
                        return new PhoneVerificationRequired[i12];
                    }
                }

                public PhoneVerificationRequired() {
                    super(null);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                    parcel.writeInt(1);
                }
            }

            /* compiled from: CreateChannelPresenter.kt */
            @P
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State$Error$Unknown;", "Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State$Error;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @K51.d
            public static final class Unknown extends Error {

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public static final Unknown f189517b = new Unknown();

                @Y61.k
                public static final Parcelable.Creator<Unknown> CREATOR = new a();

                /* compiled from: CreateChannelPresenter.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<Unknown> {
                    @Override // android.os.Parcelable.Creator
                    public final Unknown createFromParcel(Parcel parcel) {
                        parcel.readInt();
                        return Unknown.f189517b;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Unknown[] newArray(int i12) {
                        return new Unknown[i12];
                    }
                }

                public Unknown() {
                    super(null);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                    parcel.writeInt(1);
                }
            }

            public /* synthetic */ Error(C42822w c42822w) {
                this();
            }

            @Override // com.avito.android.messenger.conversation.create.CreateChannelPresenter.State
            @Y61.l
            /* renamed from: c */
            public final ChannelActivityArguments.Create getF189520b() {
                return null;
            }

            public Error() {
                super(null);
            }
        }

        /* compiled from: CreateChannelPresenter.kt */
        @P
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State$Waiting;", "Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State;", "()V", "Auth", "CreateChannel", "PhoneVerification", "Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State$Waiting$Auth;", "Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State$Waiting$CreateChannel;", "Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State$Waiting$PhoneVerification;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class Waiting extends State {

            /* compiled from: CreateChannelPresenter.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State$Waiting$Auth;", "Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State$Waiting;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @K51.d
            public static final /* data */ class Auth extends Waiting {

                @Y61.k
                public static final Parcelable.Creator<Auth> CREATOR = new a();

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public final ChannelActivityArguments.Create f189518b;

                /* compiled from: CreateChannelPresenter.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<Auth> {
                    @Override // android.os.Parcelable.Creator
                    public final Auth createFromParcel(Parcel parcel) {
                        return new Auth((ChannelActivityArguments.Create) parcel.readParcelable(Auth.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Auth[] newArray(int i12) {
                        return new Auth[i12];
                    }
                }

                public Auth(@Y61.k ChannelActivityArguments.Create create) {
                    super(null);
                    this.f189518b = create;
                }

                @Override // com.avito.android.messenger.conversation.create.CreateChannelPresenter.State
                @Y61.k
                /* renamed from: c, reason: from getter */
                public final ChannelActivityArguments.Create getF189520b() {
                    return this.f189518b;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Auth) && L.f(this.f189518b, ((Auth) obj).f189518b);
                }

                public final int hashCode() {
                    return this.f189518b.hashCode();
                }

                @Y61.k
                public final String toString() {
                    return "Auth(createParams=" + this.f189518b + ')';
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                    parcel.writeParcelable(this.f189518b, i12);
                }
            }

            /* compiled from: CreateChannelPresenter.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State$Waiting$CreateChannel;", "Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State$Waiting;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @K51.d
            public static final /* data */ class CreateChannel extends Waiting {

                @Y61.k
                public static final Parcelable.Creator<CreateChannel> CREATOR = new a();

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public final ChannelActivityArguments.Create f189519b;

                /* compiled from: CreateChannelPresenter.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<CreateChannel> {
                    @Override // android.os.Parcelable.Creator
                    public final CreateChannel createFromParcel(Parcel parcel) {
                        return new CreateChannel((ChannelActivityArguments.Create) parcel.readParcelable(CreateChannel.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final CreateChannel[] newArray(int i12) {
                        return new CreateChannel[i12];
                    }
                }

                public CreateChannel(@Y61.k ChannelActivityArguments.Create create) {
                    super(null);
                    this.f189519b = create;
                }

                @Override // com.avito.android.messenger.conversation.create.CreateChannelPresenter.State
                @Y61.k
                /* renamed from: c, reason: from getter */
                public final ChannelActivityArguments.Create getF189520b() {
                    return this.f189519b;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof CreateChannel) && L.f(this.f189519b, ((CreateChannel) obj).f189519b);
                }

                public final int hashCode() {
                    return this.f189519b.hashCode();
                }

                @Y61.k
                public final String toString() {
                    return "CreateChannel(createParams=" + this.f189519b + ')';
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                    parcel.writeParcelable(this.f189519b, i12);
                }
            }

            /* compiled from: CreateChannelPresenter.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State$Waiting$PhoneVerification;", "Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State$Waiting;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @K51.d
            public static final /* data */ class PhoneVerification extends Waiting {

                @Y61.k
                public static final Parcelable.Creator<PhoneVerification> CREATOR = new a();

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public final ChannelActivityArguments.Create f189520b;

                /* compiled from: CreateChannelPresenter.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<PhoneVerification> {
                    @Override // android.os.Parcelable.Creator
                    public final PhoneVerification createFromParcel(Parcel parcel) {
                        return new PhoneVerification((ChannelActivityArguments.Create) parcel.readParcelable(PhoneVerification.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final PhoneVerification[] newArray(int i12) {
                        return new PhoneVerification[i12];
                    }
                }

                public PhoneVerification(@Y61.k ChannelActivityArguments.Create create) {
                    super(null);
                    this.f189520b = create;
                }

                @Override // com.avito.android.messenger.conversation.create.CreateChannelPresenter.State
                @Y61.k
                /* renamed from: c, reason: from getter */
                public final ChannelActivityArguments.Create getF189520b() {
                    return this.f189520b;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof PhoneVerification) && L.f(this.f189520b, ((PhoneVerification) obj).f189520b);
                }

                public final int hashCode() {
                    return this.f189520b.hashCode();
                }

                @Y61.k
                public final String toString() {
                    return "PhoneVerification(createParams=" + this.f189520b + ')';
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                    parcel.writeParcelable(this.f189520b, i12);
                }
            }

            public /* synthetic */ Waiting(C42822w c42822w) {
                this();
            }

            public Waiting() {
                super(null);
            }
        }

        public /* synthetic */ State(C42822w c42822w) {
            this();
        }

        @Y61.l
        /* renamed from: c */
        public abstract ChannelActivityArguments.Create getF189520b();

        public State() {
        }
    }

    @Y61.k
    D A4();

    void A5(boolean z12);

    void G8(@Y61.k ChannelActivityArguments.Create create);

    void ie(boolean z12);

    void j(@Y61.k ChannelActivityArguments.Create create);

    @Y61.k
    D m9();
}
