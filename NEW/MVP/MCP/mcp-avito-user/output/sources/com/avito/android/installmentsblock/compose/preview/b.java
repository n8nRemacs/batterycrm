package com.avito.android.installmentsblock.compose.preview;

import B0.h;
import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.installments_block.entity.InstallmentsLoanTerms;
import dO.d;
import dO.e;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.sequences.InterfaceC43030m;
import kotlin.sequences.o0;

/* compiled from: BlockPreviewProvider.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/installmentsblock/compose/preview/b;", "LB0/h;", "LdO/d;", "<init>", "()V", "_avito_installments-block_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final o0 f172947a = new o0(C42756l.f(new Integer[]{2, 3, 5, 6}), a.f172948l);

    /* compiled from: BlockPreviewProvider.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "index", "LdO/d;", "invoke", "(I)LdO/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<Integer, d> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f172948l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final d invoke(Integer num) {
            int iIntValue = num.intValue();
            com.avito.android.installmentsblock.compose.preview.a.f172945a.getClass();
            kotlin.collections.builders.b bVarT = C42745f0.t();
            int i12 = 0;
            while (i12 < iIntValue) {
                String str = ((i12 * 2) + 2) + " мес.";
                boolean z12 = true;
                InstallmentsLoanTerms.Term.Badge text = i12 == 1 ? InstallmentsLoanTerms.Term.Badge.Ellipse.f172863b : i12 % 2 == 0 ? new InstallmentsLoanTerms.Term.Badge.Text("0%") : null;
                if (i12 != 0) {
                    z12 = false;
                }
                bVarT.add(new e("", text, str, z12));
                i12++;
            }
            return new d(com.avito.android.installmentsblock.compose.preview.a.f172946b, C42745f0.p(bVarT), P0.c());
        }
    }

    @Override // B0.h
    @k
    public final InterfaceC43030m<d> a() {
        return this.f172947a;
    }
}
