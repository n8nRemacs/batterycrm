package com.avito.android.authorization.login;

import com.avito.android.component.toast.f;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: LoginPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.authorization.login.n, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28685n extends kotlin.jvm.internal.N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u f94054l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28685n(u uVar) {
        super(1);
        this.f94054l = uVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        String str2 = str;
        Q q12 = this.f94054l.f94089z;
        if (q12 != null) {
            com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
            PrintableText printableTextF = com.avito.android.printable_text.b.f(str2);
            f.c.f125255c.getClass();
            com.avito.android.component.toast.c.b(cVar, q12.f93994d, printableTextF, null, null, null, f.c.a.b(), 0, ToastBarPosition.f181046d, null, false, false, null, null, 4014);
        }
        return G0.f406611a;
    }
}
