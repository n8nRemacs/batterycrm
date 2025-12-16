package io.ktor.utils.io.jvm.javaio;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.utils.io.W0;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Writing.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.jvm.javaio.WritingKt", f = "Writing.kt", i = {0, 0, 0, 0, 0, 0}, l = {22}, m = "copyTo", n = {"$this$copyTo", "out", "buffer", "limit", "copied", "bufferSize"}, s = {"L$0", "L$1", "L$2", "J$0", "J$1", "J$2"})
/* loaded from: classes8.dex */
final class q extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public W0 f401151q;

    /* renamed from: r, reason: collision with root package name */
    public OutputStream f401152r;

    /* renamed from: s, reason: collision with root package name */
    public byte[] f401153s;

    /* renamed from: t, reason: collision with root package name */
    public long f401154t;

    /* renamed from: u, reason: collision with root package name */
    public long f401155u;

    /* renamed from: v, reason: collision with root package name */
    public long f401156v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f401157w;

    /* renamed from: x, reason: collision with root package name */
    public int f401158x;

    public q() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f401157w = obj;
        this.f401158x |= BeduinInputModel.MIN_TEXT_VERSION;
        return r.a(null, null, 0L, this);
    }
}
