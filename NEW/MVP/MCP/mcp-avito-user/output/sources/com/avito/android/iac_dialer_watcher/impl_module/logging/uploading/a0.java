package com.avito.android.iac_dialer_watcher.impl_module.logging.uploading;

import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: IacLogSessionHistoryUpdater.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/a;", "call", "", "invoke", "(Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/a;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class a0 extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.iac_dialer_watcher.impl_module.logging.repository.a, CharSequence> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y f167988l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Y y12) {
        super(1);
        this.f167988l = y12;
    }

    @Override // Y41.l
    public final CharSequence invoke(com.avito.android.iac_dialer_watcher.impl_module.logging.repository.a aVar) {
        com.avito.android.iac_dialer_watcher.impl_module.logging.repository.a aVar2 = aVar;
        StringBuilder sb2 = new StringBuilder("        ");
        C43066x.j(sb2, Long.valueOf(aVar2.f167894b), ": ");
        C43066x.k(sb2, aVar2.f167895c, ", ");
        SimpleDateFormat simpleDateFormat = Y.f167985b;
        this.f167988l.getClass();
        SimpleDateFormat simpleDateFormat2 = Y.f167985b;
        C43066x.k(sb2, "startedAt=", simpleDateFormat2.format(new Date(aVar2.f167897e)), ", ");
        C43066x.k(sb2, "finishedAt=", simpleDateFormat2.format(new Date(aVar2.f167898f)), ", ");
        C43066x.k(sb2, "scenario=", aVar2.f167896d);
        if (aVar2.f167899g) {
            sb2.append("- !!! Lines limit was reached before this call, so logs were not saved");
        }
        return sb2.toString();
    }
}
