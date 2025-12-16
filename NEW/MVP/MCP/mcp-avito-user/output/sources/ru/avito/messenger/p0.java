package ru.avito.messenger;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;

/* compiled from: MessengerUserInfo.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/p0;", "Lru/avito/messenger/n0;", "a", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class p0 implements n0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f431828b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final MessengerUserHashInfo f431829c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f431830d;

    /* compiled from: MessengerUserInfo.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/avito/messenger/p0$a;", "", "<init>", "()V", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        MessengerUserHashInfo.f430678e.getClass();
        new p0("", MessengerUserHashInfo.f430679f);
    }

    public p0(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        this.f431828b = str;
        this.f431829c = messengerUserHashInfo;
        this.f431830d = (C43066x.K(str) || C43066x.K(messengerUserHashInfo.f430682d)) ? false : true;
    }

    @Override // ru.avito.messenger.n0
    @Y61.k
    /* renamed from: c */
    public final String getF431824b() {
        return this.f431829c.f430682d;
    }

    @Override // ru.avito.messenger.n0
    @Y61.k
    public final MessengerUserType e() {
        throw null;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return kotlin.jvm.internal.L.f(this.f431828b, p0Var.f431828b) && kotlin.jvm.internal.L.f(this.f431829c, p0Var.f431829c);
    }

    public final int hashCode() {
        return this.f431829c.hashCode() + (this.f431828b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "MessengerUserProfileInfo(userId=" + this.f431828b + ", hashInfo=" + this.f431829c + ')';
    }
}
