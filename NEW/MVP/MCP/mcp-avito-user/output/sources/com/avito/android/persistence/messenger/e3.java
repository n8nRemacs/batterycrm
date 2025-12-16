package com.avito.android.persistence.messenger;

import androidx.compose.runtime.C22026a;
import androidx.room.InterfaceC23472t;
import kotlin.Metadata;

/* compiled from: MessageMetaInfo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/persistence/messenger/e3;", "", "_avito-discouraged_persistence_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class e3 {

    /* renamed from: a, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final String f215457a;

    /* renamed from: b, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final String f215458b;

    /* renamed from: c, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final String f215459c;

    /* renamed from: d, reason: collision with root package name */
    @InterfaceC23472t
    public final long f215460d;

    /* renamed from: e, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final UserEntityType f215461e;

    /* renamed from: f, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final String f215462f;

    /* renamed from: g, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.l
    public final String f215463g;

    public e3(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, long j12, @Y61.k UserEntityType userEntityType, @Y61.k String str4, @Y61.l String str5) {
        this.f215457a = str;
        this.f215458b = str2;
        this.f215459c = str3;
        this.f215460d = j12;
        this.f215461e = userEntityType;
        this.f215462f = str4;
        this.f215463g = str5;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3)) {
            return false;
        }
        e3 e3Var = (e3) obj;
        return kotlin.jvm.internal.L.f(this.f215457a, e3Var.f215457a) && kotlin.jvm.internal.L.f(this.f215458b, e3Var.f215458b) && kotlin.jvm.internal.L.f(this.f215459c, e3Var.f215459c) && this.f215460d == e3Var.f215460d && this.f215461e == e3Var.f215461e && kotlin.jvm.internal.L.f(this.f215462f, e3Var.f215462f) && kotlin.jvm.internal.L.f(this.f215463g, e3Var.f215463g);
    }

    public final int hashCode() {
        int iD2 = androidx.compose.foundation.H.d((this.f215461e.hashCode() + androidx.appcompat.app.r.g(androidx.compose.foundation.H.d(androidx.compose.foundation.H.d(this.f215457a.hashCode() * 31, 31, this.f215458b), 31, this.f215459c), 31, this.f215460d)) * 31, 31, this.f215462f);
        String str = this.f215463g;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VoiceMetaInfo(localUserId=");
        sb2.append(this.f215457a);
        sb2.append(", channelId=");
        sb2.append(this.f215458b);
        sb2.append(", localMessageId=");
        sb2.append(this.f215459c);
        sb2.append(", duration=");
        sb2.append(this.f215460d);
        sb2.append(", localUserType=");
        sb2.append(this.f215461e);
        sb2.append(", localUserAccountId=");
        sb2.append(this.f215462f);
        sb2.append(", voiceError=");
        return C22026a.c(sb2, this.f215463g, ')');
    }
}
