package com.avito.android.authorization.select_social;

import android.content.DialogInterface;
import com.avito.android.R;
import com.avito.android.lib.design.modal.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SelectSocialView.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class u extends N implements Y41.p<a.b, DialogInterface, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f94579l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CharSequence f94580m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ s f94581n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(String str, CharSequence charSequence, s sVar) {
        super(2);
        this.f94579l = str;
        this.f94580m = charSequence;
        this.f94581n = sVar;
    }

    @Override // Y41.p
    public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
        a.b bVar2 = bVar;
        bVar2.setTitle(this.f94579l);
        bVar2.setSubtitle(this.f94580m);
        bVar2.N3(this.f94581n.f94573a.getResources().getString(R.string.social_auth_error_dialog_btn), new t(dialogInterface));
        bVar2.setCancelable(true);
        return G0.f406611a;
    }
}
