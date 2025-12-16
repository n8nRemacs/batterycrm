package com.avito.beduin.v2.component.video.state;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VideoState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/component/video/state/c;", "Lcom/avito/beduin/v2/component/video/state/a;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class c implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f336357a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final VideoScale f336358b;

    public c(@Y61.k String str, @Y61.k VideoScale videoScale) {
        this.f336357a = str;
        this.f336358b = videoScale;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f336357a, cVar.f336357a) && this.f336358b == cVar.f336358b;
    }

    public final int hashCode() {
        return this.f336358b.hashCode() + (this.f336357a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "RemoteUrl(url=" + this.f336357a + ", scale=" + this.f336358b + ')';
    }
}
