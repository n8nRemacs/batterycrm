package com.vk.api.sdk.exceptions;

import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: VKAuthException.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/vk/api/sdk/exceptions/VKAuthException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class VKAuthException extends Exception {

    /* renamed from: b, reason: collision with root package name */
    public final int f366589b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f366590c;

    /* JADX WARN: Multi-variable type inference failed */
    public VKAuthException() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ VKAuthException(int i12, String str, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? 0 : i12, (i13 & 2) != 0 ? null : str);
    }

    public VKAuthException(int i12, @l String str) {
        super("Auth canceled");
        this.f366589b = i12;
        this.f366590c = str;
    }
}
