package com.avito.android.mortgage.document_upload;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DocumentUploadScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/text_view/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/text_view/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class A extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.lib.design.text_view.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f199019l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(Context context) {
        super(1);
        this.f199019l = context;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.text_view.a aVar) {
        com.avito.android.lib.design.text_view.a aVar2 = aVar;
        aVar2.setTextAppearance(C35835l0.j(R.attr.textM20, this.f199019l));
        aVar2.setMovementMethod(LinkMovementMethod.getInstance());
        return G0.f406611a;
    }
}
