package com.avito.android.virtual_deal_room_reference_category.factory;

import androidx.fragment.app.Fragment;
import bO0.InterfaceC25537a;
import bO0.InterfaceC25538b;
import com.avito.android.virtual_deal_room_reference_category.reference_invite.ReferenceInviteFragment;
import com.avito.android.virtual_deal_room_reference_category.reference_invite.model.ReferenceInviteArguments;
import javax.inject.Inject;
import kotlin.Metadata;
import tO0.InterfaceC48588a;

/* compiled from: ReferenceCategoryWithUIFactory.kt */
@C11.a
@InterfaceC25537a
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room_reference_category/factory/b;", "LbO0/b;", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements InterfaceC25538b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48588a f327219a;

    @Inject
    public b(@Y61.k InterfaceC48588a interfaceC48588a) {
        this.f327219a = interfaceC48588a;
    }

    @Override // bO0.InterfaceC25538b
    @Y61.k
    public final Fragment a(@Y61.k String str) {
        ReferenceInviteFragment.a aVar = ReferenceInviteFragment.f327263o0;
        ReferenceInviteArguments referenceInviteArguments = new ReferenceInviteArguments(str);
        aVar.getClass();
        return ReferenceInviteFragment.a.a(referenceInviteArguments);
    }

    @Override // bO0.InterfaceC25538b
    @Y61.k
    public final Fragment b(@Y61.k String str) {
        ReferenceInviteFragment.a aVar = ReferenceInviteFragment.f327263o0;
        ReferenceInviteArguments referenceInviteArguments = new ReferenceInviteArguments(str);
        aVar.getClass();
        return ReferenceInviteFragment.a.a(referenceInviteArguments);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // bO0.InterfaceC25538b
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@Y61.k java.lang.String r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.avito.android.virtual_deal_room_reference_category.factory.a
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.virtual_deal_room_reference_category.factory.a r0 = (com.avito.android.virtual_deal_room_reference_category.factory.a) r0
            int r1 = r0.f327218s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f327218s = r1
            goto L18
        L13:
            com.avito.android.virtual_deal_room_reference_category.factory.a r0 = new com.avito.android.virtual_deal_room_reference_category.factory.a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f327216q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f327218s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r6)
            r0.f327218s = r3
            tO0.a r6 = r4.f327219a
            java.lang.Object r6 = r6.a(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
            boolean r5 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r5 == 0) goto L52
            com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
            java.lang.Object r5 = r6.getResult()
            uO0.a r5 = (uO0.C48925a) r5
            com.avito.android.deep_linking.links.DeepLink r5 = r5.getRedirectTo()
            return r5
        L52:
            com.avito.android.remote.model.TypedResult$Error r6 = (com.avito.android.remote.model.TypedResult.Error) r6
            java.lang.Throwable r5 = r6.getCause()
            if (r5 != 0) goto L62
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Required value was null."
            r5.<init>(r6)
            throw r5
        L62:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.virtual_deal_room_reference_category.factory.b.c(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // bO0.InterfaceC25538b
    @Y61.k
    public final Fragment d(@Y61.k String str) {
        ReferenceInviteFragment.a aVar = ReferenceInviteFragment.f327263o0;
        ReferenceInviteArguments referenceInviteArguments = new ReferenceInviteArguments(str);
        aVar.getClass();
        return ReferenceInviteFragment.a.a(referenceInviteArguments);
    }

    @Override // bO0.InterfaceC25538b
    @Y61.k
    public final Fragment e(@Y61.k String str) {
        ReferenceInviteFragment.a aVar = ReferenceInviteFragment.f327263o0;
        ReferenceInviteArguments referenceInviteArguments = new ReferenceInviteArguments(str);
        aVar.getClass();
        return ReferenceInviteFragment.a.a(referenceInviteArguments);
    }
}
