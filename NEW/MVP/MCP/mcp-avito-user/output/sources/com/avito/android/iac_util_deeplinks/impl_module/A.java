package com.avito.android.iac_util_deeplinks.impl_module;

import com.avito.android.iac_util_deeplinks.public_module.PermissionSystemRequestLink;
import com.avito.android.permissions.PermissionState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import rv.C47920c;

/* compiled from: PermissionSystemRequestLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/c;", "permissionResult", "Lkotlin/G0;", "accept", "(Lrv/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class A<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f169098b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PermissionSystemRequestLink f169099c;

    /* compiled from: PermissionSystemRequestLinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[PermissionState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PermissionState permissionState = PermissionState.f215104b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PermissionState permissionState2 = PermissionState.f215104b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public A(x xVar, PermissionSystemRequestLink permissionSystemRequestLink) {
        this.f169098b = xVar;
        this.f169099c = permissionSystemRequestLink;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        PermissionSystemRequestLink.ResultValue resultValue;
        C47920c c47920c = (C47920c) obj;
        PermissionState permissionState = c47920c.f437161a ? PermissionState.f215104b : c47920c.f437162b ? PermissionState.f215105c : PermissionState.f215106d;
        x xVar = this.f169098b;
        xVar.f169235f.c(permissionState, this.f169099c.f169260b);
        int iOrdinal = permissionState.ordinal();
        if (iOrdinal == 0) {
            resultValue = PermissionSystemRequestLink.ResultValue.f169267d;
        } else if (iOrdinal == 1) {
            resultValue = PermissionSystemRequestLink.ResultValue.f169268e;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            resultValue = PermissionSystemRequestLink.ResultValue.f169269f;
        }
        xVar.k(resultValue);
    }
}
