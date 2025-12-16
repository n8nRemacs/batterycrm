package io.ktor.utils.io.core.internal;

import Y41.l;
import Y41.p;
import Y61.k;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: UTF8.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.core.internal.UTF8Kt", f = "UTF8.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {37}, m = "decodeUTF8LineLoopSuspend", n = {"out", "nextChunk", "afterRead", "decoded", "size", "cr", "end", "limit"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0"})
/* loaded from: classes8.dex */
final class g extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Appendable f400890q;

    /* renamed from: r, reason: collision with root package name */
    public p f400891r;

    /* renamed from: s, reason: collision with root package name */
    public l f400892s;

    /* renamed from: t, reason: collision with root package name */
    public l0.f f400893t;

    /* renamed from: u, reason: collision with root package name */
    public l0.f f400894u;

    /* renamed from: v, reason: collision with root package name */
    public l0.a f400895v;

    /* renamed from: w, reason: collision with root package name */
    public l0.a f400896w;

    /* renamed from: x, reason: collision with root package name */
    public int f400897x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f400898y;

    /* renamed from: z, reason: collision with root package name */
    public int f400899z;

    public g() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        this.f400898y = obj;
        this.f400899z |= BeduinInputModel.MIN_TEXT_VERSION;
        return h.a(null, 0, null, null, this);
    }
}
