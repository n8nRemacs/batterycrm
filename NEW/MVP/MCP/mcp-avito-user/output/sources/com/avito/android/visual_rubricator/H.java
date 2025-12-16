package com.avito.android.visual_rubricator;

import java.util.List;
import kotlin.Metadata;

/* compiled from: VisibilityOnScrollPayload.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/visual_rubricator/H;", "", "_avito_bx-content_widget_visual-rubricator_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class H {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.Q<List<Integer>, List<Integer>> f327282a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.Q<List<Integer>, List<Integer>> f327283b;

    /* JADX WARN: Multi-variable type inference failed */
    public H(@Y61.k kotlin.Q<? extends List<Integer>, ? extends List<Integer>> q12, @Y61.k kotlin.Q<? extends List<Integer>, ? extends List<Integer>> q13) {
        this.f327282a = q12;
        this.f327283b = q13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h12 = (H) obj;
        return kotlin.jvm.internal.L.f(this.f327282a, h12.f327282a) && kotlin.jvm.internal.L.f(this.f327283b, h12.f327283b);
    }

    public final int hashCode() {
        return this.f327283b.hashCode() + (this.f327282a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VisibilityOnScrollPayload(firstRowVisibleStates=");
        sb2.append(this.f327282a);
        sb2.append(", secondRowVisibleStates=");
        return com.avito.android.authorization.auto_recovery.phone_confirm.b.i(sb2, this.f327283b, ')');
    }
}
