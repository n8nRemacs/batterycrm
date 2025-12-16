package com.avito.android.authorization.change_password;

import com.avito.android.component.toast.f;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ChangeResettedPasswordPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class k extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f93354l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Throwable f93355m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, Throwable th2) {
        super(1);
        this.f93354l = mVar;
        this.f93355m = th2;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        String str2 = str;
        s sVar = this.f93354l.f93360e;
        if (sVar != null) {
            com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, sVar.f93376a, com.avito.android.printable_text.b.f(str2), null, null, null, new f.c(this.f93355m), 0, ToastBarPosition.f181046d, null, false, false, null, null, 4014);
        }
        return G0.f406611a;
    }
}
