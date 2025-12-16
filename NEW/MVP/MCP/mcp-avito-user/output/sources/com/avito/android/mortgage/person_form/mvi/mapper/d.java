package com.avito.android.mortgage.person_form.mvi.mapper;

import Y41.l;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PersonFormDomainToUiMapper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LLZ/c;", "it", "", "invoke", "(LLZ/c;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class d extends N implements l<LZ.c, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f201271l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar) {
        super(1);
        this.f201271l = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d1  */
    @Override // Y41.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke(LZ.c r5) {
        /*
            r4 = this;
            LZ.c r5 = (LZ.c) r5
            com.avito.android.mortgage.person_form.mvi.mapper.b r0 = r4.f201271l
            r0.getClass()
            com.avito.android.mortgage.api.model.items.form.d r5 = r5.f9996b
            boolean r0 = r5 instanceof com.avito.android.mortgage.api.model.items.form.InputFormContentItemValue
            if (r0 == 0) goto L1e
            r0 = r5
            com.avito.android.mortgage.api.model.items.form.InputFormContentItemValue r0 = (com.avito.android.mortgage.api.model.items.form.InputFormContentItemValue) r0
            java.lang.String r0 = r0.getValue()
            if (r0 == 0) goto Ld1
            int r0 = r0.length()
            if (r0 != 0) goto Lc3
            goto Ld1
        L1e:
            boolean r0 = r5 instanceof com.avito.android.mortgage.api.model.items.form.SuggestFormContentItemValue
            if (r0 == 0) goto L3b
            r0 = r5
            com.avito.android.mortgage.api.model.items.form.SuggestFormContentItemValue r0 = (com.avito.android.mortgage.api.model.items.form.SuggestFormContentItemValue) r0
            com.avito.android.mortgage.api.model.FormItemValueModel r0 = r0.getValue()
            if (r0 == 0) goto L30
            java.lang.String r0 = r0.getValue()
            goto L31
        L30:
            r0 = 0
        L31:
            if (r0 == 0) goto Ld1
            int r0 = r0.length()
            if (r0 != 0) goto Lc3
            goto Ld1
        L3b:
            boolean r0 = r5 instanceof com.avito.android.mortgage.api.model.items.form.c
            if (r0 == 0) goto L76
            r0 = r5
            com.avito.android.mortgage.api.model.items.form.c r0 = (com.avito.android.mortgage.api.model.items.form.c) r0
            java.util.List r1 = r0.d()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r2 = r1 instanceof java.util.Collection
            if (r2 == 0) goto L57
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L57
            goto Ld1
        L57:
            java.util.Iterator r1 = r1.iterator()
        L5b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Ld1
            java.lang.Object r2 = r1.next()
            LZ.d r2 = (LZ.d) r2
            java.lang.String r2 = r2.getValue()
            java.lang.String r3 = r0.g()
            boolean r2 = kotlin.jvm.internal.L.f(r2, r3)
            if (r2 == 0) goto L5b
            goto Lc3
        L76:
            boolean r0 = r5 instanceof com.avito.android.mortgage.api.model.items.form.e
            if (r0 == 0) goto Lb0
            r0 = r5
            com.avito.android.mortgage.api.model.items.form.e r0 = (com.avito.android.mortgage.api.model.items.form.e) r0
            java.util.List r1 = r0.c()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r2 = r1 instanceof java.util.Collection
            if (r2 == 0) goto L91
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L91
            goto Ld1
        L91:
            java.util.Iterator r1 = r1.iterator()
        L95:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Ld1
            java.lang.Object r2 = r1.next()
            LZ.d r2 = (LZ.d) r2
            java.lang.String r2 = r2.getValue()
            java.lang.String r3 = r0.g()
            boolean r2 = kotlin.jvm.internal.L.f(r2, r3)
            if (r2 == 0) goto L95
            goto Lc3
        Lb0:
            boolean r0 = r5 instanceof com.avito.android.mortgage.api.model.items.form.a
            if (r0 == 0) goto Lb5
            goto Lc3
        Lb5:
            boolean r0 = r5 instanceof com.avito.android.mortgage.api.model.items.form.b
            if (r0 == 0) goto Lba
            goto Lc3
        Lba:
            boolean r0 = r5 instanceof com.avito.android.mortgage.api.model.items.form.f
            if (r0 == 0) goto Lbf
            goto Lc3
        Lbf:
            boolean r0 = r5 instanceof LZ.b
            if (r0 == 0) goto Ld7
        Lc3:
            boolean r0 = r5.getF198255c()
            if (r0 != 0) goto Ld1
            com.avito.android.printable_text.PrintableText r5 = r5.getError()
            if (r5 != 0) goto Ld1
            r5 = 1
            goto Ld2
        Ld1:
            r5 = 0
        Ld2:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        Ld7:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.person_form.mvi.mapper.d.invoke(java.lang.Object):java.lang.Object");
    }
}
