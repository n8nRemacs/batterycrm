package com.avito.android.favorites;

import VC.a;
import com.avito.android.favorites.Q;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: FavoriteAdvertsListInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/favorites/Q;", "it", "LVC/a;", "apply", "(Lcom/avito/android/favorites/Q;)LVC/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.favorites.k, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30670k<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final C30670k<T, R> f157376b = new C30670k<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        Object c1165a;
        Q q12 = (Q) obj;
        if (q12 instanceof Q.c) {
            return a.c.f16994a;
        }
        if (q12 instanceof Q.a) {
            Q.a aVar = (Q.a) q12;
            c1165a = new a.b(aVar.f156321a, aVar.f156322b, aVar.f156323c);
        } else {
            if (!(q12 instanceof Q.b)) {
                throw new NoWhenBranchMatchedException();
            }
            c1165a = new a.C1165a(((Q.b) q12).f156324a);
        }
        return c1165a;
    }
}
