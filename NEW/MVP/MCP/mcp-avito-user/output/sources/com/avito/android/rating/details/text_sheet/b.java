package com.avito.android.rating.details.text_sheet;

import Eg0.InterfaceC13484a;
import Y41.l;
import com.avito.android.rating.details.text_sheet.TextSheetDialog;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TextSheetDialog.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class b extends N implements l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TextSheetDialog f247548l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(TextSheetDialog textSheetDialog) {
        super(1);
        this.f247548l = textSheetDialog;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        TextSheetDialog.a aVar = TextSheetDialog.f247525s0;
        ((d) this.f247548l.f247527i0.getValue()).accept(new InterfaceC13484a.c(str));
        return G0.f406611a;
    }
}
