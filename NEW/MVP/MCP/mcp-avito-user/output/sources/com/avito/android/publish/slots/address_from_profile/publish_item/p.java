package com.avito.android.publish.slots.address_from_profile.publish_item;

import androidx.compose.runtime.internal.P;
import com.avito.conveyor_item.a;
import kotlin.Metadata;

/* compiled from: PublishAddressViewItem.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/address_from_profile/publish_item/p;", "Lcom/avito/android/publish/slots/address_from_profile/publish_item/s;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class p implements s {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final p f242941b = new p();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f242942c;

    static {
        kotlin.random.f.f406882b.getClass();
        f242942c = String.valueOf(kotlin.random.f.f406883c.i());
    }

    public final boolean equals(@Y61.l Object obj) {
        return this == obj || (obj instanceof p);
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId */
    public final String getF231743e() {
        return f242942c;
    }

    public final int hashCode() {
        return 167393493;
    }

    @Y61.k
    public final String toString() {
        return "LoadingViewItem";
    }
}
