package com.avito.beduin.v2.interaction.flow.file_picker.flow;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FilePickerResult.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/interaction/flow/file_picker/flow/h;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f337406a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f337407b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f337408c;

    /* renamed from: d, reason: collision with root package name */
    public final int f337409d;

    public h(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, int i12) {
        this.f337406a = str;
        this.f337407b = str2;
        this.f337408c = str3;
        this.f337409d = i12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.f337406a, hVar.f337406a) && L.f(this.f337407b, hVar.f337407b) && L.f(this.f337408c, hVar.f337408c) && this.f337409d == hVar.f337409d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f337409d) + H.d(H.d(this.f337406a.hashCode() * 31, 31, this.f337407b), 31, this.f337408c);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilePickerClientResult(path=");
        sb2.append(this.f337406a);
        sb2.append(", name=");
        sb2.append(this.f337407b);
        sb2.append(", extension=");
        sb2.append(this.f337408c);
        sb2.append(", sizeInBytes=");
        return r.t(sb2, this.f337409d, ')');
    }
}
