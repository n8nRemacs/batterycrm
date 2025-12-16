package com.avito.android.util;

import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Error;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NotFoundException.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/util/NotFoundException;", "Lcom/avito/android/util/ApiException;", "Lcom/avito/android/remote/error/n;", "a", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NotFoundException extends ApiException implements com.avito.android.remote.error.n {
    private static final long serialVersionUID = 2;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Error f318699d;

    /* compiled from: NotFoundException.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/util/NotFoundException$a;", "", "<init>", "()V", "", "serialVersionUID", "J", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    public /* synthetic */ NotFoundException(ApiError.NotFound notFound, Throwable th2, int i12, C42822w c42822w) {
        this(notFound, (i12 & 2) != 0 ? null : th2);
    }

    @Override // com.avito.android.remote.error.n
    @Y61.k
    /* renamed from: getError, reason: from getter */
    public final Error getF318699d() {
        return this.f318699d;
    }

    public NotFoundException(@Y61.k ApiError.NotFound notFound, @Y61.l Throwable th2) {
        super(notFound, th2);
        this.f318699d = new Error(404, notFound.getMessage(), null, 4, null);
    }

    public NotFoundException(Throwable th2, int i12, C42822w c42822w) {
        this((String) null, (i12 & 1) != 0 ? null : th2);
    }

    public /* synthetic */ NotFoundException(String str, Throwable th2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : th2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NotFoundException(@Y61.l String str, @Y61.l Throwable th2) {
        if (str == null) {
            str = th2 != null ? th2.getMessage() : null;
            if (str == null) {
                str = "";
            }
        }
        this(new ApiError.NotFound(str), th2 == null ? new IOException() : th2);
    }

    public NotFoundException(Error error, Throwable th2, int i12, C42822w c42822w) {
        this(error.getSimpleMessage(), (i12 & 2) != 0 ? null : th2);
    }
}
