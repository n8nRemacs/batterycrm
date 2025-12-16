package com.avito.beduin.v2.client.permission;

import Y61.k;
import kotlin.Metadata;
import kotlin.collections.C42756l;

/* compiled from: PermissionDeniedException.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/client/permission/PermissionDeniedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "permissions_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PermissionDeniedException extends Exception {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String[] f335467b;

    /* JADX WARN: Illegal instructions before constructor call */
    public PermissionDeniedException() {
        String[] strArr = {"android.permission.CAMERA"};
        super("Permission denied: ".concat(C42756l.P(strArr, null, null, null, null, 63)));
        this.f335467b = strArr;
    }
}
