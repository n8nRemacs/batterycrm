package qG0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UniversalMapEvents.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LqG0/c;", "", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qG0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C47292c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f429144a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Throwable f429145b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ApiError f429146c;

    public C47292c(String str, Throwable th2, ApiError apiError, int i12, C42822w c42822w) {
        th2 = (i12 & 2) != 0 ? null : th2;
        apiError = (i12 & 4) != 0 ? null : apiError;
        this.f429144a = str;
        this.f429145b = th2;
        this.f429146c = apiError;
    }
}
