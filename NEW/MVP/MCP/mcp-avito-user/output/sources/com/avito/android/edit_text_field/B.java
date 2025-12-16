package com.avito.android.edit_text_field;

import android.content.DialogInterface;
import com.avito.android.profile_management_core.edit_text_field.FormattedAlertSettings;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EditTextFieldView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class B extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ FormattedAlertSettings f146878l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DialogInterface f146879m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y f146880n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(FormattedAlertSettings formattedAlertSettings, DialogInterface dialogInterface, y yVar) {
        super(0);
        this.f146878l = formattedAlertSettings;
        this.f146879m = dialogInterface;
        this.f146880n = yVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f146878l.f226610c.setOnDeepLinkClickListener(null);
        this.f146879m.dismiss();
        this.f146880n.a(true);
        return G0.f406611a;
    }
}
