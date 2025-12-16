package ru.tinkoff.core.tinkoffId.error;

import Ab1.a;
import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TinkoffRequestException.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lru/tinkoff/core/tinkoffId/error/TinkoffRequestException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "tinkoff-id_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TinkoffRequestException extends Exception {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f437032b;

    public /* synthetic */ TinkoffRequestException(Throwable th2, String str, a aVar, int i12, C42822w c42822w) {
        this(th2, (i12 & 2) != 0 ? null : str);
    }

    @Override // java.lang.Throwable
    @l
    public final String getMessage() {
        return this.f437032b;
    }

    public TinkoffRequestException(@k Throwable th2, @l String str) {
        super(str, th2);
        this.f437032b = str;
    }
}
