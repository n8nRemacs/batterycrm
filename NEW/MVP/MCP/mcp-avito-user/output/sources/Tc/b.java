package TC;

import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CategoryOnboardingManager.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTC/b;", "LTC/a;", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f15498a;

    @Inject
    public b(@k d dVar) {
        this.f15498a = dVar;
    }

    @Override // TC.a
    public final void a(@k String str) {
        this.f15498a.b(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b3  */
    @Override // TC.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.favorites.CategoryChipable b(@Y61.k java.util.List<com.avito.android.favorites.CategoryChipable> r7) {
        /*
            r6 = this;
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        Lb:
            boolean r1 = r7.hasNext()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L33
            java.lang.Object r1 = r7.next()
            r4 = r1
            com.avito.android.favorites.CategoryChipable r4 = (com.avito.android.favorites.CategoryChipable) r4
            com.avito.android.remote.model.CategoriesWidget$CategoryOnboarding r4 = r4.f156205g
            if (r4 != 0) goto L1f
            goto L2d
        L1f:
            java.lang.String r4 = r4.getId()
            if (r4 != 0) goto L26
            goto L2d
        L26:
            TC.d r3 = r6.f15498a
            boolean r3 = r3.a(r4)
            r3 = r3 ^ r2
        L2d:
            if (r3 == 0) goto Lb
            r0.add(r1)
            goto Lb
        L33:
            boolean r7 = r0.isEmpty()
            r1 = 0
            if (r7 == 0) goto L3d
            r0 = r1
            goto Lba
        L3d:
            boolean r7 = r0.isEmpty()
            if (r7 == 0) goto L45
        L43:
            r2 = r3
            goto L61
        L45:
            java.util.Iterator r7 = r0.iterator()
        L49:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L43
            java.lang.Object r4 = r7.next()
            com.avito.android.favorites.CategoryChipable r4 = (com.avito.android.favorites.CategoryChipable) r4
            com.avito.android.remote.model.CategoriesWidget$CategoryOnboarding r4 = r4.f156205g
            if (r4 == 0) goto L5e
            java.lang.Integer r4 = r4.getPriority()
            goto L5f
        L5e:
            r4 = r1
        L5f:
            if (r4 == 0) goto L49
        L61:
            if (r2 == 0) goto Lb3
            java.util.Iterator r7 = r0.iterator()
            boolean r0 = r7.hasNext()
            if (r0 != 0) goto L6f
            r0 = r1
            goto Lb0
        L6f:
            java.lang.Object r0 = r7.next()
            boolean r2 = r7.hasNext()
            if (r2 != 0) goto L7a
            goto Lb0
        L7a:
            r2 = r0
            com.avito.android.favorites.CategoryChipable r2 = (com.avito.android.favorites.CategoryChipable) r2
            com.avito.android.remote.model.CategoriesWidget$CategoryOnboarding r2 = r2.f156205g
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L8e
            java.lang.Integer r2 = r2.getPriority()
            if (r2 == 0) goto L8e
            int r2 = r2.intValue()
            goto L8f
        L8e:
            r2 = r3
        L8f:
            java.lang.Object r4 = r7.next()
            r5 = r4
            com.avito.android.favorites.CategoryChipable r5 = (com.avito.android.favorites.CategoryChipable) r5
            com.avito.android.remote.model.CategoriesWidget$CategoryOnboarding r5 = r5.f156205g
            if (r5 == 0) goto La5
            java.lang.Integer r5 = r5.getPriority()
            if (r5 == 0) goto La5
            int r5 = r5.intValue()
            goto La6
        La5:
            r5 = r3
        La6:
            if (r2 >= r5) goto Laa
            r0 = r4
            r2 = r5
        Laa:
            boolean r4 = r7.hasNext()
            if (r4 != 0) goto L8f
        Lb0:
            com.avito.android.favorites.CategoryChipable r0 = (com.avito.android.favorites.CategoryChipable) r0
            goto Lba
        Lb3:
            java.lang.Object r7 = kotlin.collections.C42745f0.E(r0)
            r0 = r7
            com.avito.android.favorites.CategoryChipable r0 = (com.avito.android.favorites.CategoryChipable) r0
        Lba:
            if (r0 != 0) goto Lbd
            return r1
        Lbd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: TC.b.b(java.util.List):com.avito.android.favorites.CategoryChipable");
    }
}
