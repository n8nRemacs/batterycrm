package com.avito.android.home.bottom_navigation;

import com.avito.android.bottom_navigation.C28885g;
import com.avito.android.bottom_navigation.J;
import com.avito.android.bottom_navigation.RunnableC28882d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BottomNavigationFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/bottom_navigation/J;", "kotlin.jvm.PlatformType", "profileButtonState", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/bottom_navigation/J;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.home.bottom_navigation.f, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30764f extends N implements Y41.l<J, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BottomNavigationFragment f162351l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30764f(BottomNavigationFragment bottomNavigationFragment) {
        super(1);
        this.f162351l = bottomNavigationFragment;
    }

    @Override // Y41.l
    public final G0 invoke(J j12) {
        J j13 = j12;
        C28885g c28885g = this.f162351l.f162252H0;
        if (c28885g != null) {
            c28885g.f107012h.post(new RunnableC28882d(1, c28885g, j13));
        }
        return G0.f406611a;
    }
}
