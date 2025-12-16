package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15523b;
import com.avito.android.beduin.common.action.BeduinValidateFormsAction;
import com.avito.android.beduin_models.BeduinAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinValidateFormsActionHandler.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/A1;", "LUi/b;", "Lcom/avito/android/beduin/common/action/BeduinValidateFormsAction;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class A1 implements InterfaceC15523b<BeduinValidateFormsAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin.common.form.store.b f100047a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC15523b<BeduinAction>> f100048b;

    @Inject
    public A1(@Y61.k com.avito.android.beduin.common.form.store.b bVar, @Y61.k h31.e<InterfaceC15523b<BeduinAction>> eVar) {
        this.f100047a = bVar;
        this.f100048b = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    @Override // Ui.InterfaceC15523b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(com.avito.android.beduin_models.BeduinAction r8) {
        /*
            r7 = this;
            com.avito.android.beduin.common.action.BeduinValidateFormsAction r8 = (com.avito.android.beduin.common.action.BeduinValidateFormsAction) r8
            java.util.List r0 = r8.getFormIds()
            com.avito.android.beduin.common.form.store.b r1 = r7.f100047a
            if (r0 == 0) goto L2b
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            lj.a r3 = r1.get(r3)
            if (r3 == 0) goto L15
            r2.add(r3)
            goto L15
        L2b:
            java.util.List r2 = r1.getAll()
        L2f:
            java.util.List r0 = r8.getModelIds()
            if (r0 == 0) goto L3c
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Set r0 = kotlin.collections.C42745f0.P0(r0)
            goto L3d
        L3c:
            r0 = 0
        L3d:
            h31.e<Ui.b<com.avito.android.beduin_models.BeduinAction>> r1 = r7.f100048b
            if (r0 == 0) goto L6a
            r3 = r2
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            boolean r4 = r3 instanceof java.util.Collection
            if (r4 == 0) goto L53
            r4 = r3
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L53
            goto Ld9
        L53:
            java.util.Iterator r3 = r3.iterator()
        L57:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Ld9
            java.lang.Object r4 = r3.next()
            lj.a r4 = (lj.InterfaceC43779a) r4
            boolean r4 = r4.g(r0)
            if (r4 != 0) goto L57
            goto L91
        L6a:
            r3 = r2
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            boolean r4 = r3 instanceof java.util.Collection
            if (r4 == 0) goto L7b
            r4 = r3
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L7b
            goto Ld9
        L7b:
            java.util.Iterator r3 = r3.iterator()
        L7f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Ld9
            java.lang.Object r4 = r3.next()
            lj.a r4 = (lj.InterfaceC43779a) r4
            boolean r4 = r4.isValid()
            if (r4 != 0) goto L7f
        L91:
            java.lang.Boolean r3 = r8.getShowValidationErrors()
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            boolean r3 = kotlin.jvm.internal.L.f(r3, r4)
            if (r3 != 0) goto Lc9
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        La3:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lc9
            java.lang.Object r3 = r2.next()
            lj.a r3 = (lj.InterfaceC43779a) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = r3.e()
            com.avito.android.beduin.common.actionhandler.z1 r6 = new com.avito.android.beduin.common.actionhandler.z1
            r6.<init>(r4, r0)
            com.avito.android.beduin.common.utils.C28809e.d(r6, r5)
            lj.d$i r5 = new lj.d$i
            r5.<init>(r4)
            r3.h(r5)
            goto La3
        Lc9:
            java.util.List r8 = r8.getOnInvalidActions()
            if (r8 == 0) goto Le8
            java.lang.Object r0 = r1.get()
            Ui.b r0 = (Ui.InterfaceC15523b) r0
            com.avito.android.beduin.common.utils.C28806b.a(r0, r8)
            goto Le8
        Ld9:
            java.util.List r8 = r8.getOnValidActions()
            if (r8 == 0) goto Le8
            java.lang.Object r0 = r1.get()
            Ui.b r0 = (Ui.InterfaceC15523b) r0
            com.avito.android.beduin.common.utils.C28806b.a(r0, r8)
        Le8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.common.actionhandler.A1.o(com.avito.android.beduin_models.BeduinAction):void");
    }
}
