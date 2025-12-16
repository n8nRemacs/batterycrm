package io.ktor.websocket;

import java.nio.ByteBuffer;
import java.util.concurrent.ArrayBlockingQueue;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Serializer.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/websocket/B;", "", "<init>", "()V", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ArrayBlockingQueue<AbstractC41723i> f401380a = new ArrayBlockingQueue<>(1024);

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public ByteBuffer f401381b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public ByteBuffer f401382c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public FrameType f401383d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f401384e;
}
