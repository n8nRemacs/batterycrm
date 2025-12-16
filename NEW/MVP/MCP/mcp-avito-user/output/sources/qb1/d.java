package qb1;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.datastore.core.h;
import androidx.datastore.preferences.core.f;
import com.vk.push.core.utils.j;
import jb1.m;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes9.dex */
public final class d implements g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h<androidx.datastore.preferences.core.f> f429311a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final f.a<String> f429312b = new f.a<>("push_token");

    /* renamed from: c, reason: collision with root package name */
    @k
    public final f.a<Boolean> f429313c = new f.a<>("push_token_delivered_to_client_app");

    /* renamed from: d, reason: collision with root package name */
    @k
    public final f.a<String> f429314d = new f.a<>("last_delivered_push_token");

    @DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.push.storage.DataStorePushStorage$saveLastDeliveredToClientToken$2", f = "DataStorePushStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<androidx.datastore.preferences.core.a, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f429315q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f429317s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f429317s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            a aVar = d.this.new a(this.f429317s, continuation);
            aVar.f429315q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(androidx.datastore.preferences.core.a aVar, Continuation<? super G0> continuation) {
            return ((a) create(aVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            ((androidx.datastore.preferences.core.a) this.f429315q).d(d.this.f429314d, this.f429317s);
            return G0.f406611a;
        }
    }

    public d(@k h<androidx.datastore.preferences.core.f> hVar) {
        this.f429311a = hVar;
    }

    @Override // qb1.g
    @l
    public final Object a(@k ContinuationImpl continuationImpl) {
        return j.c(this.f429311a, this.f429312b, continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // qb1.g
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof qb1.C47374b
            if (r0 == 0) goto L13
            r0 = r5
            qb1.b r0 = (qb1.C47374b) r0
            int r1 = r0.f429307s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f429307s = r1
            goto L18
        L13:
            qb1.b r0 = new qb1.b
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f429305q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f429307s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r5)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.C42729a0.b(r5)
            r0.f429307s = r3
            androidx.datastore.core.h<androidx.datastore.preferences.core.f> r5 = r4.f429311a
            androidx.datastore.preferences.core.f$a<java.lang.String> r2 = r4.f429312b
            java.lang.Object r5 = com.vk.push.core.utils.j.c(r5, r2, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L47
            java.lang.String r5 = ""
        L47:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: qb1.d.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // qb1.g
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof qb1.c
            if (r0 == 0) goto L13
            r0 = r5
            qb1.c r0 = (qb1.c) r0
            int r1 = r0.f429310s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f429310s = r1
            goto L18
        L13:
            qb1.c r0 = new qb1.c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f429308q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f429310s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r5)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.C42729a0.b(r5)
            r0.f429310s = r3
            androidx.datastore.core.h<androidx.datastore.preferences.core.f> r5 = r4.f429311a
            androidx.datastore.preferences.core.f$a<java.lang.Boolean> r2 = r4.f429313c
            java.lang.Object r5 = com.vk.push.core.utils.j.c(r5, r2, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            if (r5 == 0) goto L4a
            boolean r5 = r5.booleanValue()
            goto L4b
        L4a:
            r5 = 0
        L4b:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: qb1.d.c(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // qb1.g
    @l
    public final Object d(@k String str, @k Qa1.d dVar) {
        Object objA = androidx.datastore.preferences.core.j.a(this.f429311a, new e(this, str, null), dVar);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : G0.f406611a;
    }

    @Override // qb1.g
    @l
    public final Object e(@k ContinuationImpl continuationImpl) {
        Object objA = androidx.datastore.preferences.core.j.a(this.f429311a, new C47373a(2, null), continuationImpl);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : G0.f406611a;
    }

    @Override // qb1.g
    @l
    public final Object f(@k ContinuationImpl continuationImpl) {
        return j.c(this.f429311a, this.f429314d, continuationImpl);
    }

    @Override // qb1.g
    @l
    public final Object g(@k m mVar) {
        Object objA = androidx.datastore.preferences.core.j.a(this.f429311a, new f(this, null), mVar);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : G0.f406611a;
    }

    @Override // qb1.g
    @l
    public final Object a(@k String str, @k Continuation<? super G0> continuation) {
        Object objA = androidx.datastore.preferences.core.j.a(this.f429311a, new a(str, null), (ContinuationImpl) continuation);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : G0.f406611a;
    }
}
