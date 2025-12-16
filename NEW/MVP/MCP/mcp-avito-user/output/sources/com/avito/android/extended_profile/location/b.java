package com.avito.android.extended_profile.location;

import Y61.k;
import Y61.l;
import com.avito.android.location.r;
import com.avito.android.remote.model.Location;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ExtendedProfileLocationProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile/location/b;", "Lcom/avito/android/extended_profile/location/a;", "a", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements com.avito.android.extended_profile.location.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final r f150024a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public volatile Location f150025b;

    /* compiled from: ExtendedProfileLocationProvider.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/extended_profile/location/b$a;", "", "<init>", "()V", "", "GET_LOCATION_ID_TIMEOUT", "J", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public b(@k r rVar) {
        this.f150024a = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.extended_profile.location.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.avito.android.extended_profile.location.c
            if (r0 == 0) goto L13
            r0 = r7
            com.avito.android.extended_profile.location.c r0 = (com.avito.android.extended_profile.location.c) r0
            int r1 = r0.f150028s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f150028s = r1
            goto L18
        L13:
            com.avito.android.extended_profile.location.c r0 = new com.avito.android.extended_profile.location.c
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f150026q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f150028s
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            kotlin.C42729a0.b(r7)     // Catch: java.lang.Throwable -> L4f
            goto L4c
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            kotlin.C42729a0.b(r7)
            com.avito.android.remote.model.Location r7 = r6.f150025b
            if (r7 == 0) goto L3c
            com.avito.android.remote.model.Location r7 = r6.f150025b
            goto L50
        L3c:
            com.avito.android.extended_profile.location.d r7 = new com.avito.android.extended_profile.location.d     // Catch: java.lang.Throwable -> L4f
            r7.<init>(r6, r3)     // Catch: java.lang.Throwable -> L4f
            r0.f150028s = r4     // Catch: java.lang.Throwable -> L4f
            r4 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r7 = kotlinx.coroutines.D1.b(r4, r7, r0)     // Catch: java.lang.Throwable -> L4f
            if (r7 != r1) goto L4c
            return r1
        L4c:
            com.avito.android.remote.model.Location r7 = (com.avito.android.remote.model.Location) r7     // Catch: java.lang.Throwable -> L4f
            r3 = r7
        L4f:
            r7 = r3
        L50:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile.location.b.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
