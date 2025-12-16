package com.avito.android.early_access;

import androidx.compose.ui.graphics.f1;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.X;
import androidx.compose.ui.text.e0;
import androidx.compose.ui.text.font.C22605a0;
import androidx.compose.ui.text.font.Z;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: EarlyAccessExtensions.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_early-access_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class s {

    /* compiled from: EarlyAccessExtensions.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/text/e$b;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/text/e$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<C22602e.b, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f145576l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super C22602e.b, G0> lVar) {
            super(1);
            this.f145576l = (N) lVar;
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final G0 invoke(C22602e.b bVar) {
            C22602e.b bVar2 = bVar;
            androidx.compose.ui.text.style.j.f42684b.getClass();
            e0 e0Var = new e0(0L, 0L, (androidx.compose.ui.text.font.e0) null, (Z) null, (C22605a0) null, (androidx.compose.ui.text.font.E) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.n) null, (z0.f) null, 0L, androidx.compose.ui.text.style.j.f42686d, (f1) null, (X) null, (androidx.compose.ui.graphics.drawscope.j) null, 61439, (C42822w) null);
            ?? r32 = this.f145576l;
            int iL2 = bVar2.l(e0Var);
            try {
                r32.invoke(bVar2);
                G0 g02 = G0.f406611a;
                bVar2.h(iL2);
                return G0.f406611a;
            } catch (Throwable th2) {
                bVar2.h(iL2);
                throw th2;
            }
        }
    }

    public static final void a(@Y61.k C22602e.b bVar, @Y61.k String str, @Y61.k String str2, @Y61.k Y41.l<? super C22602e.b, G0> lVar) {
        a aVar = new a(lVar);
        bVar.j(str, str2);
        aVar.invoke(bVar);
        bVar.g();
    }
}
