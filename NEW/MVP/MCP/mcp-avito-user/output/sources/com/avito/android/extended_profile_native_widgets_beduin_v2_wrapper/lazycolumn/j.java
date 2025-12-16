package com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn;

import androidx.recyclerview.widget.C23424o;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileLazyColumnDiffUtilCallback.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_native_widgets_beduin_v2_wrapper/lazycolumn/j;", "Landroidx/recyclerview/widget/o$f;", "Lcom/avito/android/extended_profile_native_widgets_beduin_v2_wrapper/lazycolumn/k;", "_avito_extended-profile-native-widgets-beduin-v2-wrapper_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j extends C23424o.f<k> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C23424o.f<TV0.a> f151398a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public com.avito.beduin.v2.theme.k f151399b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public com.avito.beduin.v2.theme.k f151400c;

    public j(@Y61.k C23424o.f<TV0.a> fVar) {
        this.f151398a = fVar;
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean a(k kVar, k kVar2) {
        k kVar3 = kVar;
        k kVar4 = kVar2;
        if (!L.f(this.f151400c, this.f151399b)) {
            return false;
        }
        if (!(kVar3 instanceof u) || !(kVar4 instanceof u)) {
            return kVar3.equals(kVar4);
        }
        return this.f151398a.a(((u) kVar3).f151421a, ((u) kVar4).f151421a);
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean b(k kVar, k kVar2) {
        k kVar3 = kVar;
        k kVar4 = kVar2;
        if (!(kVar3 instanceof u) || !(kVar4 instanceof u)) {
            return L.f(kVar3.getId(), kVar4.getId());
        }
        return this.f151398a.b(((u) kVar3).f151421a, ((u) kVar4).f151421a);
    }
}
