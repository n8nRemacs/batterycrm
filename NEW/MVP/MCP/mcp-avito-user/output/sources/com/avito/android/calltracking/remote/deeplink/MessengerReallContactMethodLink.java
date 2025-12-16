package com.avito.android.calltracking.remote.deeplink;

import Ju.InterfaceC14247a;
import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import q50.InterfaceC47204b;

/* compiled from: MessengerReallContactMethodLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/calltracking/remote/deeplink/MessengerReallContactMethodLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "c", "_avito-discouraged_avito-api_calltracking"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class MessengerReallContactMethodLink extends DeepLink {

    /* renamed from: b, reason: collision with root package name */
    public final long f113766b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final CallInitiator f113767c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f113765d = new a(null);

    @k
    public static final Parcelable.Creator<MessengerReallContactMethodLink> CREATOR = new b();

    /* compiled from: MessengerReallContactMethodLink.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/calltracking/remote/deeplink/MessengerReallContactMethodLink$a;", "", "<init>", "()V", "", "CALL_CONTEXT_NAME", "Ljava/lang/String;", "GSM_CALL_LINK_NAME", "RECALL_FROM_GSM_CONTEXT_NAME", "_avito-discouraged_avito-api_calltracking"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: MessengerReallContactMethodLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<MessengerReallContactMethodLink> {
        @Override // android.os.Parcelable.Creator
        public final MessengerReallContactMethodLink createFromParcel(Parcel parcel) {
            return new MessengerReallContactMethodLink(parcel.readLong(), CallInitiator.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final MessengerReallContactMethodLink[] newArray(int i12) {
            return new MessengerReallContactMethodLink[i12];
        }
    }

    /* compiled from: MessengerReallContactMethodLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\n"}, d2 = {"Lcom/avito/android/calltracking/remote/deeplink/MessengerReallContactMethodLink$c;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "_avito-discouraged_avito-api_calltracking"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class c {

        /* compiled from: MessengerReallContactMethodLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/calltracking/remote/deeplink/MessengerReallContactMethodLink$c$a;", "LJu/c$b;", "LJu/a$a;", "<init>", "()V", "_avito-discouraged_avito-api_calltracking"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements InterfaceC14249c.b, InterfaceC14247a.InterfaceC0545a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f113768b = new a();
        }

        /* compiled from: MessengerReallContactMethodLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/calltracking/remote/deeplink/MessengerReallContactMethodLink$c$b;", "LJu/c$b;", "LJu/a$a;", "<init>", "()V", "_avito-discouraged_avito-api_calltracking"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements InterfaceC14249c.b, InterfaceC14247a.InterfaceC0545a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final b f113769b = new b();
        }

        /* compiled from: MessengerReallContactMethodLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/calltracking/remote/deeplink/MessengerReallContactMethodLink$c$c;", "LJu/c$b;", "LJu/a$a;", "<init>", "()V", "_avito-discouraged_avito-api_calltracking"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.calltracking.remote.deeplink.MessengerReallContactMethodLink$c$c, reason: collision with other inner class name */
        public static final class C3331c implements InterfaceC14249c.b, InterfaceC14247a.InterfaceC0545a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C3331c f113770b = new C3331c();
        }

        /* compiled from: MessengerReallContactMethodLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/calltracking/remote/deeplink/MessengerReallContactMethodLink$c$d;", "LJu/c$a;", "<init>", "()V", "_avito-discouraged_avito-api_calltracking"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class d implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final d f113771b = new d();
        }

        /* compiled from: MessengerReallContactMethodLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/calltracking/remote/deeplink/MessengerReallContactMethodLink$c$e;", "LJu/c$a;", "<init>", "()V", "_avito-discouraged_avito-api_calltracking"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class e implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final e f113772b = new e();
        }

        /* compiled from: MessengerReallContactMethodLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/calltracking/remote/deeplink/MessengerReallContactMethodLink$c$f;", "LJu/c$b;", "LJu/a$a;", "<init>", "()V", "_avito-discouraged_avito-api_calltracking"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class f implements InterfaceC14249c.b, InterfaceC14247a.InterfaceC0545a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final f f113773b = new f();
        }

        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    public MessengerReallContactMethodLink(long j12, @k CallInitiator callInitiator) {
        this.f113766b = j12;
        this.f113767c = callInitiator;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f113766b);
        parcel.writeString(this.f113767c.name());
    }
}
