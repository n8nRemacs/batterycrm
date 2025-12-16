package com.avito.android.user_adverts.expired_count;

import Y61.k;
import com.avito.android.service.short_task.ShortTask;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UserAdvertsInfoTask.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/expired_count/h;", "Lcom/avito/android/service/short_task/ShortTask;", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h implements ShortTask {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f312144b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final b f312145a;

    /* compiled from: UserAdvertsInfoTask.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/user_adverts/expired_count/h$a;", "", "<init>", "()V", "", "EXTRA_FORCE_UPDATE", "Ljava/lang/String;", "TAG", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Inject
    public h(@k b bVar) {
        this.f312145a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    @Override // com.avito.android.service.short_task.ShortTask
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.reactivex.rxjava3.core.I<com.avito.android.service.short_task.ShortTask.Status> start(@Y61.k android.os.Bundle r8) {
        /*
            r7 = this;
            java.lang.String r0 = "extra_force_update"
            r1 = 0
            boolean r8 = r8.getBoolean(r0, r1)
            com.avito.android.user_adverts.expired_count.b r0 = r7.f312145a
            com.avito.android.account.G r1 = r0.f312124c
            com.avito.android.account.K r1 = r1.i()
            com.avito.android.account.M r1 = r1.f68044a
            boolean r1 = r1.b()
            if (r1 != 0) goto L18
            goto L52
        L18:
            if (r8 == 0) goto L1b
            goto L28
        L1b:
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = com.avito.android.user_adverts.expired_count.g.f312143a
            long r5 = com.avito.android.user_adverts.expired_count.b.f312120e
            long r1 = r1 - r5
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 >= 0) goto L52
        L28:
            long r1 = java.lang.System.currentTimeMillis()
            com.avito.android.user_adverts.expired_count.b.f312120e = r1
            com.avito.android.user_adverts.expired_count.c r8 = new com.avito.android.user_adverts.expired_count.c
            r1 = 0
            r8.<init>(r0, r1)
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            io.reactivex.rxjava3.internal.operators.single.d r8 = kotlinx.coroutines.rx3.Q.a(r1, r8)
            com.avito.android.user_adverts.expired_count.d r1 = new com.avito.android.user_adverts.expired_count.d
            r1.<init>()
            io.reactivex.rxjava3.internal.operators.single.q r8 = r8.i(r1)
            com.avito.android.user_adverts.expired_count.e r1 = new com.avito.android.user_adverts.expired_count.e
            r1.<init>()
            io.reactivex.rxjava3.internal.operators.single.u r8 = r8.k(r1)
            io.reactivex.rxjava3.internal.operators.completable.v r0 = new io.reactivex.rxjava3.internal.operators.completable.v
            r0.<init>(r8)
            goto L54
        L52:
            io.reactivex.rxjava3.internal.operators.completable.n r0 = io.reactivex.rxjava3.internal.operators.completable.C41823n.f402260b
        L54:
            com.avito.android.service.short_task.ShortTask$Status r8 = com.avito.android.service.short_task.ShortTask.Status.f274030b
            io.reactivex.rxjava3.internal.operators.single.M r8 = io.reactivex.rxjava3.core.I.q(r8)
            io.reactivex.rxjava3.internal.operators.single.g r8 = r0.h(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.expired_count.h.start(android.os.Bundle):io.reactivex.rxjava3.core.I");
    }
}
