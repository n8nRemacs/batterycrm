package com.avito.android.beduin.common.component.file_uploader;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinFileUploaderComponent.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f101233l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar) {
        super(0);
        this.f101233l = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    @Override // Y41.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke() {
        /*
            r8 = this;
            com.avito.android.beduin.common.component.file_uploader.b r0 = r8.f101233l
            androidx.activity.result.h<java.lang.String[]> r1 = r0.f101232j
            com.avito.android.beduin.common.component.file_uploader.BeduinFileUploaderModel r2 = r0.f101227e
            if (r1 == 0) goto L4f
            java.util.List r3 = r2.getValidationRules()
            r4 = 0
            if (r3 == 0) goto L45
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L17:
            boolean r5 = r3.hasNext()
            r6 = 0
            if (r5 == 0) goto L27
            java.lang.Object r5 = r3.next()
            boolean r7 = r5 instanceof com.avito.android.beduin.common.component.file_uploader.ValidationRule.FileTypesRule
            if (r7 == 0) goto L17
            goto L28
        L27:
            r5 = r6
        L28:
            boolean r3 = r5 instanceof com.avito.android.beduin.common.component.file_uploader.ValidationRule.FileTypesRule
            if (r3 != 0) goto L2d
            goto L2e
        L2d:
            r6 = r5
        L2e:
            com.avito.android.beduin.common.component.file_uploader.ValidationRule$FileTypesRule r6 = (com.avito.android.beduin.common.component.file_uploader.ValidationRule.FileTypesRule) r6
            if (r6 == 0) goto L45
            java.util.List r3 = r6.c()
            if (r3 == 0) goto L45
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.String[] r5 = new java.lang.String[r4]
            java.lang.Object[] r3 = r3.toArray(r5)
            java.lang.String[] r3 = (java.lang.String[]) r3
            if (r3 == 0) goto L45
            goto L4c
        L45:
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
        */
        //  java.lang.String r5 = "*/*"
        /*
            r3[r4] = r5
        L4c:
            r1.b(r3)
        L4f:
            com.avito.android.beduin.common.component.file_uploader.ButtonConfiguration r1 = r2.getButtonConfiguration()
            java.util.List r1 = r1.getActions()
            Ui.b<com.avito.android.beduin_models.BeduinAction> r0 = r0.f101228f
            com.avito.android.beduin_shared.model.utils.a.a(r0, r1)
            kotlin.G0 r0 = kotlin.G0.f406611a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.common.component.file_uploader.c.invoke():java.lang.Object");
    }
}
