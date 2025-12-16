package com.avito.android.beduin.ui.screen.fragment.bottom_sheet;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BottomSheetScreenFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "modelId", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class g<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomSheetScreenFragment f104187b;

    public g(BottomSheetScreenFragment bottomSheetScreenFragment) {
        this.f104187b = bottomSheetScreenFragment;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.List] */
    @Override // l41.g
    public final void accept(Object obj) {
        T next;
        String str = (String) obj;
        BottomSheetScreenFragment bottomSheetScreenFragment = this.f104187b;
        Iterator<T> it = ((Iterable) bottomSheetScreenFragment.f104165O0).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = (T) null;
                break;
            } else {
                next = it.next();
                if (L.f(((q) next).f104201b, str)) {
                    break;
                }
            }
        }
        q qVar = next;
        if (bottomSheetScreenFragment.f104166P0 == null && !((ArrayList) bottomSheetScreenFragment.y5().s()).contains(qVar)) {
            bottomSheetScreenFragment.y5().o(qVar, true);
            bottomSheetScreenFragment.y5().q(qVar, false);
        } else {
            if (bottomSheetScreenFragment.f104166P0 == null || Math.abs(bottomSheetScreenFragment.f104165O0.indexOf(qVar) - bottomSheetScreenFragment.f104165O0.indexOf(bottomSheetScreenFragment.f104166P0)) > 1) {
                return;
            }
            bottomSheetScreenFragment.f104166P0 = null;
        }
    }
}
