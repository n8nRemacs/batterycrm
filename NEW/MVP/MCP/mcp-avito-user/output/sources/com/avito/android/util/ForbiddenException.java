package com.avito.android.util;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Error;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ForbiddenException.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/util/ForbiddenException;", "Lcom/avito/android/util/ApiException;", "Lcom/avito/android/remote/error/n;", "a", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ForbiddenException extends ApiException implements com.avito.android.remote.error.n {
    private static final long serialVersionUID = 2;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Error f318611d;

    /* compiled from: ForbiddenException.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/util/ForbiddenException$a;", "", "<init>", "()V", "", "serialVersionUID", "J", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    public /* synthetic */ ForbiddenException(ApiError.Forbidden forbidden, Throwable th2, int i12, C42822w c42822w) {
        this(forbidden, (i12 & 2) != 0 ? null : th2);
    }

    @Override // com.avito.android.remote.error.n
    @Y61.k
    /* renamed from: getError, reason: from getter */
    public final Error getF318631d() {
        return this.f318611d;
    }

    public ForbiddenException(@Y61.k ApiError.Forbidden forbidden, @Y61.l Throwable th2) {
        super(forbidden, th2);
        this.f318611d = new Error(403, forbidden.getF244063c(), null, 4, null);
    }

    public ForbiddenException(Throwable th2, int i12, C42822w c42822w) {
        this((String) null, (i12 & 1) != 0 ? null : th2);
    }

    public /* synthetic */ ForbiddenException(String str, Throwable th2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : th2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public ForbiddenException(@Y61.l String str, @Y61.l Throwable th2) {
        DeepLink deepLink = null;
        Object[] objArr = 0;
        if (str == null) {
            str = th2 != null ? th2.getMessage() : null;
            if (str == null) {
                str = "";
            }
        }
        this(new ApiError.Forbidden(str, deepLink, 2, objArr == true ? 1 : 0), th2);
    }

    public ForbiddenException(Error error, Throwable th2, int i12, C42822w c42822w) {
        this(error.getSimpleMessage(), (i12 & 2) != 0 ? null : th2);
    }
}
