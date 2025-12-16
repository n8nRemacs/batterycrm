package com.avito.android.messenger.folders;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.persistence.messenger.C33126v0;
import j.e0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Folder.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/folders/a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f196343a;

    /* renamed from: b, reason: collision with root package name */
    public final int f196344b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C33126v0 f196345c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final C33126v0 f196346d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C33126v0 f196347e;

    public a(@k String str, @e0 int i12, @k C33126v0 c33126v0, @l C33126v0 c33126v02, @k C33126v0 c33126v03) {
        this.f196343a = str;
        this.f196344b = i12;
        this.f196345c = c33126v0;
        this.f196346d = c33126v02;
        this.f196347e = c33126v03;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getF196343a() {
        return this.f196343a;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final C33126v0 getF196345c() {
        return this.f196345c;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f196343a.equals(aVar.f196343a) && this.f196344b == aVar.f196344b && this.f196345c.equals(aVar.f196345c) && L.f(this.f196346d, aVar.f196346d) && this.f196347e.equals(aVar.f196347e);
    }

    public final int hashCode() {
        int iHashCode = (this.f196345c.hashCode() + r.e(this.f196344b, this.f196343a.hashCode() * 31, 31)) * 31;
        C33126v0 c33126v0 = this.f196346d;
        return this.f196347e.hashCode() + ((iHashCode + (c33126v0 == null ? 0 : c33126v0.hashCode())) * 31);
    }

    @k
    public final String toString() {
        return "Folder(id=" + this.f196343a + ", displayName=" + this.f196344b + ", mainTags=" + this.f196345c + ", pinnedTags=" + this.f196346d + ", mergedTags=" + this.f196347e + ')';
    }
}
