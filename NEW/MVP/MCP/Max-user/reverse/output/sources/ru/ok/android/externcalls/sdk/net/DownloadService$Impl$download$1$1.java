package ru.ok.android.externcalls.sdk.net;

import defpackage.em6;
import defpackage.qqg;
import defpackage.u08;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.net.DownloadService;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lqqg;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class DownloadService$Impl$download$1$1 extends u08 implements em6 {
    final /* synthetic */ DownloadService.Impl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadService$Impl$download$1$1(DownloadService.Impl impl) {
        super(1);
        this.this$0 = impl;
    }

    @Override // defpackage.em6
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return qqg.a;
    }

    public final void invoke(String str) {
        this.this$0.logger.log(DownloadService.Impl.LOG_TAG, str);
    }
}
