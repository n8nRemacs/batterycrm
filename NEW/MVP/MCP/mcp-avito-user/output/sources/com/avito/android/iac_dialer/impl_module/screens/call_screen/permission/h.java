package com.avito.android.iac_dialer.impl_module.screens.call_screen.permission;

import Y41.l;
import com.avito.android.iac_util_deeplinks.public_module.PermissionSystemRequestLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kv.C43501a;

/* compiled from: IacCallScreenPermissionRequesterImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "invoke", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class h extends N implements l<C43501a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f166282l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f166283m;

    /* compiled from: IacCallScreenPermissionRequesterImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[PermissionSystemRequestLink.ResultValue.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PermissionSystemRequestLink.ResultValue resultValue = PermissionSystemRequestLink.ResultValue.f169265b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PermissionSystemRequestLink.ResultValue resultValue2 = PermissionSystemRequestLink.ResultValue.f169265b;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                PermissionSystemRequestLink.ResultValue resultValue3 = PermissionSystemRequestLink.ResultValue.f169265b;
                iArr[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                PermissionSystemRequestLink.ResultValue resultValue4 = PermissionSystemRequestLink.ResultValue.f169265b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, b bVar) {
        super(1);
        this.f166282l = str;
        this.f166283m = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    @Override // Y41.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke(kv.C43501a r5) {
        /*
            r4 = this;
            kv.a r5 = (kv.C43501a) r5
            Ju.c r5 = r5.f413261b
            com.avito.android.iac_util_deeplinks.public_module.PermissionSystemRequestLink$b r5 = (com.avito.android.iac_util_deeplinks.public_module.PermissionSystemRequestLink.b) r5
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b r0 = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r4.f166282l
            r1.append(r2)
            java.lang.String r2 = " finished, resultValue="
            r1.append(r2)
            com.avito.android.iac_util_deeplinks.public_module.PermissionSystemRequestLink$ResultValue r5 = r5.f169272b
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.String r3 = "IacCallScreenPermissionRequester"
            r0.a(r3, r1, r2)
            int r5 = r5.ordinal()
            if (r5 == 0) goto L45
            r0 = 1
            if (r5 == r0) goto L42
            r0 = 2
            if (r5 == r0) goto L45
            r0 = 3
            if (r5 == r0) goto L3f
            r0 = 4
            if (r5 != r0) goto L39
            goto L42
        L39:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L3f:
            com.avito.android.permissions.PermissionState r5 = com.avito.android.permissions.PermissionState.f215105c
            goto L47
        L42:
            com.avito.android.permissions.PermissionState r5 = com.avito.android.permissions.PermissionState.f215106d
            goto L47
        L45:
            com.avito.android.permissions.PermissionState r5 = com.avito.android.permissions.PermissionState.f215104b
        L47:
            com.avito.android.iac_dialer.impl_module.screens.call_screen.permission.b r0 = r4.f166283m
            xK.a r0 = r0.f166268b
            xK.b$n r1 = new xK.b$n
            com.avito.android.iac_dialer_models.abstract_module.IacCallDirection r2 = com.avito.android.iac_dialer_models.abstract_module.IacCallDirection.INCOMING
            r1.<init>(r5, r2)
            r0.a(r1, r3)
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer.impl_module.screens.call_screen.permission.h.invoke(java.lang.Object):java.lang.Object");
    }
}
