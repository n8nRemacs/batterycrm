package com.avito.android.publish.realty_address_submission;

import com.avito.android.deep_linking.links.MyAdvertLink;
import kotlin.Metadata;
import kv.C43501a;
import nI0.InterfaceC44261b;

/* compiled from: RealtyAddressSubmissionBottomSheetDialog.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class e<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RealtyAddressSubmissionBottomSheetDialog f239051b;

    public e(RealtyAddressSubmissionBottomSheetDialog realtyAddressSubmissionBottomSheetDialog) {
        this.f239051b = realtyAddressSubmissionBottomSheetDialog;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        if (((C43501a) obj).f413261b instanceof MyAdvertLink.ActivateV2.b.c) {
            RealtyAddressSubmissionBottomSheetDialog realtyAddressSubmissionBottomSheetDialog = this.f239051b;
            InterfaceC44261b interfaceC44261b = realtyAddressSubmissionBottomSheetDialog.f239042i0;
            if (interfaceC44261b == null) {
                interfaceC44261b = null;
            }
            realtyAddressSubmissionBottomSheetDialog.startActivity(InterfaceC44261b.a.a(interfaceC44261b, null, null, null, null, 31));
        }
    }
}
