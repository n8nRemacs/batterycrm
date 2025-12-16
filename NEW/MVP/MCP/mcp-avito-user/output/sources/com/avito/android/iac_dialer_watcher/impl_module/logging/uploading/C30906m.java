package com.avito.android.iac_dialer_watcher.impl_module.logging.uploading;

import kotlin.G0;
import kotlin.Metadata;

/* compiled from: IacLogCleaner.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Q;", "", "<name for destructuring parameter 0>", "Lkotlin/G0;", "apply", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.m, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C30906m<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f168015b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f168016c;

    public C30906m(long j12, String str) {
        this.f168015b = j12;
        this.f168016c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.o
    public final Object apply(Object obj) {
        kotlin.Q q12 = (kotlin.Q) obj;
        int iIntValue = ((Number) q12.f406619b).intValue();
        int iIntValue2 = ((Number) q12.f406620c).intValue();
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacLogCleaner", "IacLogSession(" + this.f168015b + ") was deleted from logs db with " + iIntValue2 + " logCalls and " + iIntValue + " logLines cause of " + this.f168016c, null);
        return G0.f406611a;
    }
}
