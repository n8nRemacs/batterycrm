package com.avito.android.replace_main.toggle;

import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.Z1;

/* compiled from: ReplaceMainToggleContentPreview.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/bottom_navigation/space/BottomNavigationSpace;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/bottom_navigation/space/BottomNavigationSpace;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class b extends N implements Y41.l<BottomNavigationSpace, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z1<d> f254612l;

    /* compiled from: ReplaceMainToggleContentPreview.kt */
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
    public b(Z1<d> z12) {
        super(1);
        this.f254612l = z12;
    }

    @Override // Y41.l
    public final G0 invoke(BottomNavigationSpace bottomNavigationSpace) {
        Z1<d> z12;
        d value;
        d dVar;
        BottomNavigationSpace bottomNavigationSpace2;
        do {
            z12 = this.f254612l;
            value = z12.getValue();
            dVar = value;
            int iOrdinal = dVar.f254616a.ordinal();
            if (iOrdinal == 0) {
                bottomNavigationSpace2 = BottomNavigationSpace.f107066c;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                bottomNavigationSpace2 = BottomNavigationSpace.f107065b;
            }
        } while (!z12.N3(value, d.a(dVar, bottomNavigationSpace2, false, 62)));
        return G0.f406611a;
    }
}
