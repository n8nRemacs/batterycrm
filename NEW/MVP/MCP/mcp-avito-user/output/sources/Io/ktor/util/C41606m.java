package io.ktor.util;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteChannels.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.util.ByteChannelsKt", f = "ByteChannels.kt", i = {}, l = {89}, m = "toByteArray", n = {}, s = {})
/* renamed from: io.ktor.util.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41606m extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f400491q;

    /* renamed from: r, reason: collision with root package name */
    public int f400492r;

    public C41606m() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f400491q = obj;
        this.f400492r |= BeduinInputModel.MIN_TEXT_VERSION;
        return C41607n.c(null, this);
    }
}
