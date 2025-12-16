package com.avito.android.shortcut_navigation_bar;

import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ShortcutNavigationBar.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "position", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class r extends kotlin.jvm.internal.N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f283544l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C34999p f283545m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ List<z0> f283546n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(int i12, C34999p c34999p, List<z0> list) {
        super(1);
        this.f283544l = i12;
        this.f283545m = c34999p;
        this.f283546n = list;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue != this.f283544l) {
            this.f283545m.f283478d0.accept(this.f283546n.get(iIntValue));
        }
        return G0.f406611a;
    }
}
