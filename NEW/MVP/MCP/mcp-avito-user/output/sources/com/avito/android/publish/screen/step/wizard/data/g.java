package com.avito.android.publish.screen.step.wizard.data;

import Jf0.InterfaceC14192a;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import yc.C50213a;

/* compiled from: WizardRepository.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/wizard/data/g;", "Lcom/avito/android/publish/screen/step/wizard/data/e;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC14192a f242457a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Navigation f242458b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<Navigation> f242459c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final CategoryParametersConverter f242460d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C50213a f242461e;

    public g(@k InterfaceC14192a interfaceC14192a, @l Navigation navigation2, @k List<Navigation> list, @k CategoryParametersConverter categoryParametersConverter, @k C50213a c50213a) {
        this.f242457a = interfaceC14192a;
        this.f242458b = navigation2;
        this.f242459c = list;
        this.f242460d = categoryParametersConverter;
        this.f242461e = c50213a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.publish.screen.step.wizard.data.e
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.avito.android.publish.screen.step.wizard.data.f
            if (r0 == 0) goto L13
            r0 = r8
            com.avito.android.publish.screen.step.wizard.data.f r0 = (com.avito.android.publish.screen.step.wizard.data.f) r0
            int r1 = r0.f242456s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f242456s = r1
            goto L18
        L13:
            com.avito.android.publish.screen.step.wizard.data.f r0 = new com.avito.android.publish.screen.step.wizard.data.f
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f242454q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f242456s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r8)
            goto L6b
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L31:
            kotlin.C42729a0.b(r8)
            com.avito.android.remote.model.category_parameters.CategoryParametersConverter r8 = r7.f242460d
            com.avito.android.remote.model.Navigation r2 = r7.f242458b
            if (r2 == 0) goto L40
            java.util.Map r2 = r8.convertToFieldMap(r2)
            if (r2 != 0) goto L44
        L40:
            java.util.Map r2 = kotlin.collections.P0.c()
        L44:
            kotlin.Q r4 = new kotlin.Q
            java.lang.String r5 = "leaves"
            java.util.List<com.avito.android.remote.model.Navigation> r6 = r7.f242459c
            r4.<init>(r5, r6)
            kotlin.Q[] r4 = new kotlin.Q[]{r4}
            java.util.Map r8 = r8.convertToFieldMap(r4)
            yc.a r4 = r7.f242461e
            java.lang.String r4 = r4.b()
            Jf0.a r5 = r7.f242457a
            r6 = 0
            io.reactivex.rxjava3.core.I r8 = r5.a(r6, r2, r8, r4)
            r0.f242456s = r3
            java.lang.Object r8 = kotlinx.coroutines.rx3.C43292o.b(r8, r0)
            if (r8 != r1) goto L6b
            return r1
        L6b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.screen.step.wizard.data.g.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
