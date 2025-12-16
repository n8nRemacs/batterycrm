package com.avito.android.publish.drafts;

import com.avito.android.remote.model.DeepLinksDialogInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PublishInfoMessage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/drafts/I;", "", "_avito_publish-drafts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class I {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f235321a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f235322b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final DeepLinksDialogInfo f235323c;

    public I() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i12 = (I) obj;
        return kotlin.jvm.internal.L.f(this.f235321a, i12.f235321a) && kotlin.jvm.internal.L.f(this.f235322b, i12.f235322b) && kotlin.jvm.internal.L.f(this.f235323c, i12.f235323c);
    }

    public final int hashCode() {
        String str = this.f235321a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f235322b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        DeepLinksDialogInfo deepLinksDialogInfo = this.f235323c;
        return iHashCode2 + (deepLinksDialogInfo != null ? deepLinksDialogInfo.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "PublishInfoMessage(draftId=" + this.f235321a + ", message=" + this.f235322b + ", dialogInfo=" + this.f235323c + ')';
    }

    public I(String str, String str2, DeepLinksDialogInfo deepLinksDialogInfo, int i12, C42822w c42822w) {
        str = (i12 & 1) != 0 ? null : str;
        str2 = (i12 & 2) != 0 ? null : str2;
        deepLinksDialogInfo = (i12 & 4) != 0 ? null : deepLinksDialogInfo;
        this.f235321a = str;
        this.f235322b = str2;
        this.f235323c = deepLinksDialogInfo;
    }
}
