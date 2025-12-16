package PY;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: MessengerChunkedFileUploadStatusHandlingException.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPY/a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a extends Throwable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f13126b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Throwable f13127c;

    public a(@k String str, @l Throwable th2) {
        this.f13126b = str;
        this.f13127c = th2;
    }

    @Override // java.lang.Throwable
    @l
    public final Throwable getCause() {
        return this.f13127c;
    }

    @Override // java.lang.Throwable
    @k
    public final String getMessage() {
        return this.f13126b;
    }
}
