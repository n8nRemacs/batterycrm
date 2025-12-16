package com.avito.android.confirm_documents_bottom_sheet.deeplink;

import com.avito.android.confirm_documents_bottom_sheet.ConfirmDocumentsBottomSheetDeeplink;
import com.avito.android.confirm_documents_bottom_sheet.ui.ConfirmDocumentsDialogFragment;
import com.avito.android.deeplink_handler.view.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ConfirmDocumentsBottomSheetDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class a extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f125508l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ConfirmDocumentsBottomSheetDeeplink f125509m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, ConfirmDocumentsBottomSheetDeeplink confirmDocumentsBottomSheetDeeplink) {
        super(0);
        this.f125508l = bVar;
        this.f125509m = confirmDocumentsBottomSheetDeeplink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        b bVar = this.f125508l;
        a.d dVar = bVar.f125510g;
        ConfirmDocumentsDialogFragment.a aVar = ConfirmDocumentsDialogFragment.f125665m0;
        ConfirmDocumentsBottomSheetDeeplink confirmDocumentsBottomSheetDeeplink = this.f125509m;
        String str = confirmDocumentsBottomSheetDeeplink.f125503b;
        aVar.getClass();
        dVar.w1(ConfirmDocumentsDialogFragment.a.a(str, confirmDocumentsBottomSheetDeeplink.f125504c, confirmDocumentsBottomSheetDeeplink.f125505d, confirmDocumentsBottomSheetDeeplink.f125506e), bVar.f395444b);
        return G0.f406611a;
    }
}
