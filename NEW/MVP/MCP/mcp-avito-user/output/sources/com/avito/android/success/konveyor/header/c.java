package com.avito.android.success.konveyor.header;

import Y61.k;
import Y61.l;
import com.avito.android.success.models.AnimationUrl;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SuccessHeaderItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/success/konveyor/header/c;", "Lcom/avito/conveyor_item/a;", "_avito_success_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AnimationUrl f291643b;

    public c(@k AnimationUrl animationUrl) {
        this.f291643b = animationUrl;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        cVar.getClass();
        return L.f(this.f291643b, cVar.f291643b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return 618343889;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF291445k() {
        return "success_header_item_id";
    }

    public final int hashCode() {
        return this.f291643b.hashCode() + 1988791375;
    }

    @k
    public final String toString() {
        return "SuccessHeaderItem(stringId=success_header_item_id, animationUrl=" + this.f291643b + ')';
    }
}
