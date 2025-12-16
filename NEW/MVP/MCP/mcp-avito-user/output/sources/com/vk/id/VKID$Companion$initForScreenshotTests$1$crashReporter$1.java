package com.vk.id;

import Y41.l;
import Y41.p;
import com.vk.id.tracking.core.CrashReporter;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: VKID.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001JF\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJg\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000221\u0010\b\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r2\u001c\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0003H\u0096@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"com/vk/id/VKID$Companion$initForScreenshotTests$1$crashReporter$1", "Lcom/vk/id/tracking/core/CrashReporter;", "T", "Lkotlin/Function1;", "", "Lkotlin/S;", "name", "error", "errorValueProvider", "Lkotlin/Function0;", "action", "runReportingCrashes", "(LY41/l;LY41/a;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "runReportingCrashesSuspend", "(LY41/p;LY41/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VKID$Companion$initForScreenshotTests$1$crashReporter$1 implements CrashReporter {
    @Override // com.vk.id.tracking.core.CrashReporter
    public <T> T runReportingCrashes(l<? super Throwable, ? extends T> errorValueProvider, Y41.a<? extends T> action) {
        return action.invoke();
    }

    @Override // com.vk.id.tracking.core.CrashReporter
    public <T> Object runReportingCrashesSuspend(p<? super Throwable, ? super Continuation<? super T>, ? extends Object> pVar, l<? super Continuation<? super T>, ? extends Object> lVar, Continuation<? super T> continuation) {
        return lVar.invoke(continuation);
    }
}
