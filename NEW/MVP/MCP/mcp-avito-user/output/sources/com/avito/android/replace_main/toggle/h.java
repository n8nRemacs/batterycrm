package com.avito.android.replace_main.toggle;

import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;

/* compiled from: ReplaceMainToggleContent.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f254637l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ N f254638m;

    /* compiled from: ReplaceMainToggleContent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[BottomNavigationSpace.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BottomNavigationSpace bottomNavigationSpace = BottomNavigationSpace.f107065b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(d dVar, Y41.l<? super BottomNavigationSpace, G0> lVar) {
        super(0);
        this.f254637l = dVar;
        this.f254638m = (N) lVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.a
    public final G0 invoke() {
        BottomNavigationSpace bottomNavigationSpace;
        int iOrdinal = this.f254637l.f254616a.ordinal();
        if (iOrdinal == 0) {
            bottomNavigationSpace = BottomNavigationSpace.f107066c;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            bottomNavigationSpace = BottomNavigationSpace.f107065b;
        }
        this.f254638m.invoke(bottomNavigationSpace);
        return G0.f406611a;
    }
}
