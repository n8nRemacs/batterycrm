package com.avito.android.bxcontent.mvi;

import com.avito.android.bxcontent.mvi.entity.BxContentInternalAction;
import com.avito.android.bxcontent.mvi.entity.C29126a;
import kotlin.Metadata;

/* compiled from: BxContentInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "<anonymous parameter 0>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.bxcontent.mvi.i0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29201i0 extends kotlin.jvm.internal.N implements Y41.l<String, BxContentInternalAction> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C29126a.b f112459l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29201i0(C29126a.b bVar) {
        super(1);
        this.f112459l = bVar;
    }

    @Override // Y41.l
    public final BxContentInternalAction invoke(String str) {
        return new BxContentInternalAction.BeduinNativeInternalAction.UpdateBlock(C29126a.b.a(this.f112459l, null));
    }
}
