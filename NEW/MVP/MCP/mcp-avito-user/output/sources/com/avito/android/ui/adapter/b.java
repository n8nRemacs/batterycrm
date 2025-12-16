package com.avito.android.ui.adapter;

import android.view.View;
import com.avito.android.R;
import j.I;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AppendingAdapterHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ui/adapter/b;", "Lcom/avito/android/ui/adapter/e;", "_avito_appending-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final a f304558a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final f f304559b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f304560c;

    /* renamed from: d, reason: collision with root package name */
    public final int f304561d;

    /* renamed from: e, reason: collision with root package name */
    public final int f304562e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public View f304563f;

    public b(@Y61.k a aVar, @Y61.k f fVar, boolean z12, @I int i12) {
        this.f304558a = aVar;
        this.f304559b = fVar;
        this.f304560c = z12;
        this.f304561d = i12;
        this.f304562e = 1;
    }

    public final void a(int i12) {
        f fVar = this.f304559b;
        if (fVar.gk() && fVar.gk()) {
            int count = this.f304558a.getCount();
            if (i12 < 0 || i12 >= count) {
                return;
            }
            int i13 = this.f304562e;
            boolean z12 = i13 == 1;
            boolean z13 = this.f304560c;
            if (z12 && z13) {
                if (i12 >= 1) {
                    return;
                }
            } else if (i13 == 1) {
                if (i12 < count - 1) {
                    return;
                }
            } else if (i13 == 0 && z13) {
                if (i12 < count - 1) {
                    return;
                }
            } else if (i13 != 0 || i12 >= 1) {
                return;
            }
            fVar.rp();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(int r7) {
        /*
            r6 = this;
            com.avito.android.ui.adapter.f r0 = r6.f304559b
            boolean r0 = r0.gk()
            r1 = 0
            if (r0 == 0) goto L38
            int r0 = r6.f304562e
            r2 = 1
            if (r0 != r2) goto L10
            r3 = r2
            goto L11
        L10:
            r3 = r1
        L11:
            boolean r4 = r6.f304560c
            if (r3 == 0) goto L19
            if (r4 == 0) goto L19
        L17:
            r0 = r1
            goto L35
        L19:
            if (r0 != r2) goto L1d
            r3 = r2
            goto L1e
        L1d:
            r3 = r1
        L1e:
            com.avito.android.ui.adapter.a r5 = r6.f304558a
            if (r3 == 0) goto L28
            int r0 = r5.getCount()
        L26:
            int r0 = r0 - r2
            goto L35
        L28:
            if (r0 != 0) goto L31
            if (r4 == 0) goto L31
            int r0 = r5.getCount()
            goto L26
        L31:
            if (r0 != 0) goto L34
            goto L17
        L34:
            r0 = -1
        L35:
            if (r7 != r0) goto L38
            r1 = r2
        L38:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.ui.adapter.b.b(int):boolean");
    }

    public /* synthetic */ b(a aVar, f fVar, boolean z12, int i12, int i13, C42822w c42822w) {
        this(aVar, fVar, (i13 & 4) != 0 ? false : z12, (i13 & 8) != 0 ? R.layout.pending_view : i12);
    }
}
