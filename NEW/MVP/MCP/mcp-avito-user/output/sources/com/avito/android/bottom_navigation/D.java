package com.avito.android.bottom_navigation;

import com.avito.android.ui.fragments.TabBaseFragment;
import kotlin.Metadata;

/* compiled from: NavigationTabFragmentFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bottom_navigation/D;", "Lcom/avito/android/bottom_navigation/E;", "_avito_base-component_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class D implements E {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final NavigationTabSetItem f106928b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f106929c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f106930d;

    /* JADX WARN: Multi-variable type inference failed */
    public D(Object obj, Y41.l<Object, ? extends TabBaseFragment> lVar) {
        this.f106929c = obj;
        this.f106930d = (kotlin.jvm.internal.N) lVar;
        this.f106928b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // com.avito.android.bottom_navigation.E
    @Y61.k
    public final TabBaseFragment create() {
        return (TabBaseFragment) this.f106930d.invoke(this.f106929c);
    }

    @Override // com.avito.android.bottom_navigation.E
    @Y61.k
    /* renamed from: getType, reason: from getter */
    public final NavigationTabSetItem getF106928b() {
        return this.f106928b;
    }
}
