package io.ktor.utils.io;

import io.ktor.utils.io.core.C41628a;
import io.ktor.utils.io.core.C41641n;
import java.nio.ByteBuffer;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ByteWriteChannel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/utils/io/d1;", "", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.utils.io.d1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC41649d1 {

    /* compiled from: ByteWriteChannel.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.d1$a */
    public static final class a {
    }

    @Y61.l
    Object D(@Y61.k byte[] bArr, int i12, int i13, @Y61.k ContinuationImpl continuationImpl);

    /* renamed from: F */
    boolean getF400978b();

    @Y61.l
    Object G(int i12, @Y61.k Y41.l lVar, @Y61.k ContinuationImpl continuationImpl);

    void flush();

    @Y61.l
    Throwable g();

    boolean h(@Y61.l Throwable th2);

    @Y61.l
    Object k(@Y61.k ByteBuffer byteBuffer, @Y61.k ContinuationImpl continuationImpl);

    @Y61.l
    Object l(@Y61.k C41628a c41628a, @Y61.k ContinuationImpl continuationImpl);

    @Y61.l
    Object o(int i12, @Y61.k ContinuationImpl continuationImpl);

    @Y61.l
    Object q(byte b12, @Y61.k ContinuationImpl continuationImpl);

    @Y61.l
    Object t(@Y61.k C41641n c41641n, @Y61.k ContinuationImpl continuationImpl);

    @Y61.l
    @InterfaceC42830m
    Object u(@Y61.k Y41.p<? super k2, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar, @Y61.k Continuation<? super kotlin.G0> continuation);

    @Y61.l
    Object y(short s5, @Y61.k ContinuationImpl continuationImpl);

    @Y61.l
    Object z(long j12, @Y61.k ContinuationImpl continuationImpl);
}
