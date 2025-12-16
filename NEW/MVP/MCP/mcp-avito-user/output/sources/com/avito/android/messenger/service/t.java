package com.avito.android.messenger.service;

import Ag.CallableC13028a;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.service.short_task.ShortTask;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.single.G;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: OpenErrorTrackerTask.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/service/t;", "Lcom/avito/android/service/short_task/ShortTask;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class t implements ShortTask {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f197300b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final n f197301a;

    /* compiled from: OpenErrorTrackerTask.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/messenger/service/t$a;", "", "<init>", "()V", "", "KEY_CASE", "Ljava/lang/String;", "KEY_CHANNEL_ID", "TAG", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: OpenErrorTrackerTask.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/G0;", "kotlin.jvm.PlatformType", "it", "Lcom/avito/android/service/short_task/ShortTask$Status;", "apply", "(Lkotlin/G0;)Lcom/avito/android/service/short_task/ShortTask$Status;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T, R> f197302b = new b<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return ShortTask.Status.f274030b;
        }
    }

    @Inject
    public t(@Y61.k n nVar) {
        this.f197301a = nVar;
    }

    @Override // com.avito.android.service.short_task.ShortTask
    @Y61.k
    public final I<ShortTask.Status> start(@Y61.k Bundle bundle) {
        return new G(new CallableC13028a(21, bundle, this)).r(b.f197302b);
    }
}
