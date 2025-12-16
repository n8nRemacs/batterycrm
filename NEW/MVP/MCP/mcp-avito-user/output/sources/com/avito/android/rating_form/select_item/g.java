package com.avito.android.rating_form.select_item;

import Y61.k;
import com.avito.android.rating_form.y;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RatingFormSelectItemInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/select_item/g;", "Lcom/avito/android/rating_form/select_item/d;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Vg0.d f249020a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final RatingFormSelectItemArguments f249021b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final y f249022c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.rating_form.custom_params.d f249023d;

    @Inject
    public g(@k Vg0.d dVar, @k RatingFormSelectItemArguments ratingFormSelectItemArguments, @k y yVar, @k com.avito.android.rating_form.custom_params.d dVar2) {
        this.f249020a = dVar;
        this.f249021b = ratingFormSelectItemArguments;
        this.f249022c = yVar;
        this.f249023d = dVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.avito.android.rating_form.select_item.d
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.lang.String r18, @Y61.l java.lang.String r19, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating_form.select_item.g.a(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.rating_form.select_item.d
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k java.lang.String r9, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.avito.android.rating_form.select_item.f
            if (r0 == 0) goto L13
            r0 = r10
            com.avito.android.rating_form.select_item.f r0 = (com.avito.android.rating_form.select_item.f) r0
            int r1 = r0.f249019s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f249019s = r1
            goto L18
        L13:
            com.avito.android.rating_form.select_item.f r0 = new com.avito.android.rating_form.select_item.f
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f249017q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f249019s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r10)
            goto L3f
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            kotlin.C42729a0.b(r10)
            r0.f249019s = r3
            Vg0.d r10 = r8.f249020a
            java.lang.Object r10 = r10.e(r9, r0)
            if (r10 != r1) goto L3f
            return r1
        L3f:
            com.avito.android.remote.model.TypedResult r10 = (com.avito.android.remote.model.TypedResult) r10
            boolean r9 = r10 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r9 == 0) goto L6b
            com.avito.android.remote.model.TypedResult$Success r10 = (com.avito.android.remote.model.TypedResult.Success) r10
            java.lang.Object r9 = r10.getResult()
            com.avito.android.rating_form.api.remote.model.RatingFormSearchItemsResult r9 = (com.avito.android.rating_form.api.remote.model.RatingFormSearchItemsResult) r9
            com.avito.android.rating_form.select_item.mvi.entity.RatingFormSelectItemInternalAction$Content r10 = new com.avito.android.rating_form.select_item.mvi.entity.RatingFormSelectItemInternalAction$Content
            java.util.List r1 = r9.getItems()
            android.net.Uri r9 = r9.getNextPage()
            if (r9 == 0) goto L5f
            java.lang.String r9 = r9.toString()
        L5d:
            r2 = r9
            goto L61
        L5f:
            r9 = 0
            goto L5d
        L61:
            r3 = 0
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            goto L94
        L6b:
            boolean r9 = r10 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r9 == 0) goto L95
            com.avito.android.remote.model.TypedResult$Error r10 = (com.avito.android.remote.model.TypedResult.Error) r10
            com.avito.android.remote.error.ApiError r9 = r10.getError()
            java.lang.Throwable r10 = r10.getCause()
            com.avito.android.util.ApiException r2 = com.avito.android.util.C35936s.a(r9, r10)
            com.avito.android.rating_form.select_item.mvi.entity.RatingFormSelectItemInternalAction$ShowErrorToastBar r10 = new com.avito.android.rating_form.select_item.mvi.entity.RatingFormSelectItemInternalAction$ShowErrorToastBar
            r9 = 0
            java.io.Serializable[] r9 = new java.io.Serializable[r9]
            r0 = 2131956346(0x7f13127a, float:1.9549245E38)
            com.avito.android.printable_text.PrintableText r1 = com.avito.android.printable_text.b.c(r0, r9)
            fh0.a$c r5 = fh0.InterfaceC40422a.c.f396043a
            r3 = 0
            r4 = 0
            r6 = 12
            r7 = 0
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
        L94:
            return r10
        L95:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating_form.select_item.g.b(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
